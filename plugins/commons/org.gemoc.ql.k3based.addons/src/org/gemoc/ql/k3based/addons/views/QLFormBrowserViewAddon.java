package org.gemoc.ql.k3based.addons.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gemoc.executionframework.debugger.IGemocDebugger;
import org.eclipse.gemoc.executionframework.engine.core.CommandExecution;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.EngineAddonSortingRule;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.gemoc.ql.k3based.addons.Activator;
import org.gemoc.ql.k3based.addons.utils.UserInputChangeNotifier;
import org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspect;
import org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect;
import org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect;
import org.gemoc.ql.model.ql.QLModel;
import org.gemoc.ql.model.ql.Question;
import org.gemoc.ql.model.ql.QuestionDefinition;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.qls.model.qls.QLSModel;

public class QLFormBrowserViewAddon implements IEngineAddon {

	
	@Override
	public List<EngineAddonSortingRule> getAddonSortingRules() {
		// cf. https://download.eclipse.org/gemoc/docs/nightly/_contributing.html#_controling_call_to_addon
		ArrayList<EngineAddonSortingRule> sortingRules = new ArrayList<EngineAddonSortingRule>();
		sortingRules.add(new EngineAddonSortingRule( this,
				EngineAddonSortingRule.EngineEvent.aboutToExecuteStep,
				EngineAddonSortingRule.Priority.BEFORE,
				Arrays.asList(IGemocDebugger.GROUP_TAG)));
		return sortingRules;
	}
	
	@Override
	public void engineAboutToStart(IExecutionEngine<?> engine) {
		Display.getDefault().asyncExec(new Runnable() 
		{
			@Override
			public void run() 
			{
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					page.showView(QLFormBrowserView.ID);
				} catch(Exception e) {
					Activator.error(e.getMessage(),e);
				}
			}				
		});
	}
	
	@Override
	public void aboutToExecuteStep(IExecutionEngine<?> engine, Step<?> stepToExecute) {
		IEngineAddon.super.aboutToExecuteStep(engine, stepToExecute);
		try {
			Resource res = engine.getExecutionContext().getResourceModel();
			EObject rootEObject = res.getContents().get(0);
			if (rootEObject instanceof QLModel || rootEObject instanceof QLSModel) {
				
				QLModel rooQLModel = (rootEObject instanceof QLModel) ? (QLModel) rootEObject : ((QLSModel)rootEObject).getStyledQLModel();
				
				if (stepToExecute.getMseoccurrence() != null && stepToExecute.getMseoccurrence().getMse() != null) {
					if (stepToExecute.getMseoccurrence().getMse().getCaller() instanceof Question
							&& stepToExecute.getMseoccurrence().getMse().getAction().getName().equals("show")) {
						// only when the show() function is executed on a Question
						Display.getDefault().syncExec(new Runnable() {
							@Override
							public void run() {
								try {
									IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
											.getActivePage();
									IViewPart viewPart = page.findView(QLFormBrowserView.ID);
									if (viewPart instanceof QLFormBrowserView) {
										Question question = (Question) stepToExecute.getMseoccurrence().getMse()
												.getCaller();
										String html = QuestionDefinitionHtmlAspect.htmlField(question.getQuestionDefinition()).replace("\"", "\\\"").replace("\n", "\\\n");
										//Activator.error("injecting "+html);
										((QLFormBrowserView) viewPart).appendQLForm(html);
									}
								} catch (Exception e) {
									Activator.error(e.getMessage(), e);
								}
							}

						});
					}
					if (stepToExecute.getMseoccurrence().getMse().getCaller() instanceof QLModel) {
						QLModel qlModel = (QLModel)stepToExecute.getMseoccurrence().getMse().getCaller();
						if(stepToExecute.getMseoccurrence().getMse().getAction().getName().equals("resetIsDisplayed")) {
							// only when the resetIsDisplayed() function is executed on a QLModel
							Display.getDefault().syncExec(new Runnable() {
								@Override
								public void run() {
									try {
										IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
												.getActivePage();
										IViewPart viewPart = page.findView(QLFormBrowserView.ID);
										if (viewPart instanceof QLFormBrowserView) {
											// reset the QLForm so we can add the field according to their new isDisplayed status
											((QLFormBrowserView) viewPart).setQLForm("");
										}
									} catch (Exception e) {
										Activator.error(e.getMessage(), e);
									}
								}

							});
						}
						if(stepToExecute.getMseoccurrence().getMse().getAction().getName().equals("updateSubmitButtonStatus")) {
							// only when the resetIsDisplayed() function is executed on a QLModel
							Display.getDefault().syncExec(new Runnable() {
								@Override
								public void run() {
									try {
										IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
												.getActivePage();
										IViewPart viewPart = page.findView(QLFormBrowserView.ID);
										if (viewPart instanceof QLFormBrowserView) {
											// enable/disable submitbutton as required by current
											if(qlModel.isCanSubmit())
												((QLFormBrowserView) viewPart).enableSubmitButton();
											else
												((QLFormBrowserView) viewPart).disableSubmitButton();
										}
									} catch (Exception e) {
										Activator.error(e.getMessage(), e);
									}
								}
							});
						}
						if (stepToExecute.getMseoccurrence().getMse().getAction().getName().equals("waitUserInput")) {
							// only when the waitUserInput() function is executed on a QLModel
							getUserInputChangeNotifier().waitForInputChange(); // wait for a change in the interpreter thread without blocking UI thread
							Activator.debug("UI input changed or submit Button pressed");
						}

						if (stepToExecute.getMseoccurrence().getMse().getAction().getName().equals("readSubmitButtonStatus")) {
							// only when the readSubmitButtonStatus() function is executed on a QLModel
							Display.getDefault().syncExec(new Runnable() {
								@Override
								public void run() {
									try {
										IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
												.getActivePage();
										IViewPart viewPart = page.findView(QLFormBrowserView.ID);
										if (viewPart instanceof QLFormBrowserView) {
											QLFormBrowserViewAddon.this.applyInModel(rooQLModel, () -> {
												qlModel.setSubmitDate(((QLFormBrowserView) viewPart).lastSubmitButtonCall);
											});
										}
									} catch (Exception e) {
										Activator.error(e.getMessage(), e);
									}
								}
							});
						} 
					}
					
					if (stepToExecute.getMseoccurrence().getMse().getCaller() instanceof QuestionDefinition
							&& stepToExecute.getMseoccurrence().getMse().getAction().getName().equals("updateCurrentValueFromUI")) {
						// only when the readUserInput() function is executed on a QuestionDefinition
						QuestionDefinition qd = (QuestionDefinition) stepToExecute.getMseoccurrence().getMse().getCaller();
						
						Display.getDefault().syncExec(new Runnable() {
							@Override
							public void run() {
								try {
									IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
											.getActivePage();
									IViewPart viewPart = page.findView(QLFormBrowserView.ID);
									if (viewPart instanceof QLFormBrowserView) {
										String newValue=((QLFormBrowserView) viewPart).getFieldValueAsString(qd.getName());
										QLFormBrowserViewAddon.this.applyInModel(rooQLModel, () -> {
											if(newValue != null ) {
												if(qd.getCurrentValue() != null && (ValueAspect.valueToString(qd.getCurrentValue()).equals(newValue))) {
													// same value, do not change it
												} else {
													Value value = ValueTypeAspect.createValue(qd.getDataType(), newValue);
													qd.setCurrentValue(value);
												}
											} else {
												Activator.warn("Field "+qd.getName()+ "doesn't returned a String");
											}
										});
									}
								} catch (Exception e) {
									Activator.error(e.getMessage(), e);
								}
							}

						});
					}
				}
			}
		} catch (Exception e) {
			Activator.error(e.getMessage(), e);
		}
	}
	
	/**
	 * Apply the runnable in a TransactionalEditingDomain if required by the QLModel resource
	 * @param qlModel
	 * @param runnable
	 */
	protected void applyInModel(QLModel qlModel, Runnable runnable) {
        TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(qlModel.eResource());
		if (ed != null) {
			RecordingCommand command = new RecordingCommand(ed, "") {
				protected void doExecute() {
					try {
						runnable.run();
					} catch (Exception t) {
						Activator.error(t.getMessage(), t);
					}
				}
			};
			CommandExecution.execute(ed, command);
		} else {
			runnable.run();
		}
    }
    
	/**
	 * Get the UserInputChangeNotifier
	 * it uses the UI thread for a short time
	 * @return
	 */
	private UserInputChangeNotifier getUserInputChangeNotifier() {
		final UserInputChangeNotifier[] notifier = {null}; // Use an array to hold the result

		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					IViewPart viewPart = page.findView(QLFormBrowserView.ID);
					if (viewPart instanceof QLFormBrowserView) {
						notifier[0] = ((QLFormBrowserView) viewPart).userInputChangeNotifier;
					}

				} catch (Exception e) {
					Activator.error(e.getMessage(), e);
				}
			}
		});
		return notifier[0]; // Return the result from the array
	}
}
