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
import org.gemoc.ql.model.ql.QLModel;
import org.gemoc.ql.model.ql.Question;

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
										((QLFormBrowserView) viewPart)
												.appendQLForm(question.getQuestionDefinition().getLabel()); // TODO
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
						Display.getDefault().syncExec(new Runnable() {
							@Override
							public void run() {
								try {
									IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
											.getActivePage();
									IViewPart viewPart = page.findView(QLFormBrowserView.ID);
									if (viewPart instanceof QLFormBrowserView) {
										QLModel qlModel = (QLModel) stepToExecute.getMseoccurrence().getMse()
												.getCaller();
										// TODO for all questions, read the input from the UI if it exists
										((QLFormBrowserView) viewPart).resetHasChanges();
											
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
}
