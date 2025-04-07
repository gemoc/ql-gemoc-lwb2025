package org.gemoc.ql.k3based.addons.views;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.gemoc.ql.k3based.addons.Activator;
import org.gemoc.ql.k3based.addons.utils.UserInputChangeNotifier;
import org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspect;
import org.gemoc.ql.model.ql.QLModel;
import org.gemoc.ql.model.ql.Question;
import org.gemoc.ql.model.ql.QuestionDefinition;

public class QLFormBrowserViewAddon implements IEngineAddon {

	
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
		Resource res = engine.getExecutionContext().getResourceModel();
		QLModel qlModel = (QLModel)res.getContents().get(0);
	}
	
	@Override
	public void aboutToExecuteStep(IExecutionEngine<?> engine, Step<?> stepToExecute) {
		IEngineAddon.super.aboutToExecuteStep(engine, stepToExecute);
		try {
			Resource res = engine.getExecutionContext().getResourceModel();
			if (res.getContents().get(0) instanceof QLModel) {
				QLModel qlModel = (QLModel) res.getContents().get(0);
				
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
					if (stepToExecute.getMseoccurrence().getMse().getCaller() instanceof QLModel
							&& stepToExecute.getMseoccurrence().getMse().getAction().getName().equals("readUserInput")) {
						// only when the readUserInput() function is executed on a QLModel
						getUserInputChangeNotifier().waitForInputChange(); // wait for a change in the interpreter thread without blocking UI thread
						// TODO read all input from UI and feed them into the model
						Activator.warn("TODO read all input from UI and feed them into the model");
					}
					if (stepToExecute.getMseoccurrence().getMse().getCaller() instanceof QuestionDefinition
							&& stepToExecute.getMseoccurrence().getMse().getAction().getName().equals("updateCurrentValueFromUI")) {
						// only when the readUserInput() function is executed on a QuestionDefintion
						Display.getDefault().syncExec(new Runnable() {
							@Override
							public void run() {
								try {
									IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
											.getActivePage();
									IViewPart viewPart = page.findView(QLFormBrowserView.ID);
									if (viewPart instanceof QLFormBrowserView) {
										QuestionDefinition qd = (QuestionDefinition) stepToExecute.getMseoccurrence().getMse().getCaller();
										String fieldValue =((QLFormBrowserView) viewPart).getFieldValueAsString(qd.getName());
										if(fieldValue != null) {
											qd.setCurrentValue(fieldValue); // TODO add a factory from string value in K3
										} else {
											Activator.warn("Field "+qd.getName()+ "doesn't returned a String");
										}
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
