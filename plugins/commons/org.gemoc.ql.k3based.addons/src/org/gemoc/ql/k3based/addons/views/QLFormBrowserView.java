package org.gemoc.ql.k3based.addons.views;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.inject.Inject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gemoc.executionframework.ui.views.engine.IEngineSelectionListener;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.gemoc.ql.k3based.addons.utils.UserInputChangeNotifier;
import org.gemoc.ql.model.ql.QLModel;

/**
 * This sample class demonstrates how to plug-in a new
 * workbench view with html and javascript content. The view 
 * shows how data can be exchanged between Java and JavaScript.
 */

public class QLFormBrowserView extends ViewPart implements IEngineSelectionListener {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.gemoc.ql.k3based.addons.views.QLFormBrowserView";

	@Inject
	Shell shell;

	private Action submitAction = makeSubmitAction();
	private Action action2 = makeAction2();

	private Browser fBrowser;
	
	public UserInputChangeNotifier userInputChangeNotifier =  new UserInputChangeNotifier();
	/** 
	 * date when the SubmitButton was called for the current  engine
	 */
	public Date lastSubmitButtonCall = null;

	@Override
	public void createPartControl(Composite parent) {
		fBrowser = new Browser(parent, SWT.WEBKIT);
		fBrowser.setText(getContent());
		
		BrowserFunction onInputChange = new OnInputChange(fBrowser, "onInputChange", () -> {
			userInputChangeNotifier.onUserInputChange();
		});
		fBrowser.addDisposeListener(e -> onInputChange.dispose());

		BrowserFunction onSubmit = new OnInputChange(fBrowser, "onSubmit", () -> {
			// it save the current date so when the QL interpreter will require the value it can reads it
			this.lastSubmitButtonCall = new java.util.Date();
			userInputChangeNotifier.onUserInputChange();
		});
		fBrowser.addDisposeListener(e -> onSubmit.dispose());
		
		makeActions();
		contributeToActionBars(getViewSite());
		org.eclipse.gemoc.executionframework.ui.Activator.getDefault().getEngineSelectionManager().addEngineSelectionListener(this);
	}

	private void contributeToActionBars(IViewSite viewSite) {
		IActionBars bars = viewSite.getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(submitAction);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(submitAction);
		manager.add(action2);
	}

	private void makeActions() {
		makeSubmitAction();
		makeAction2();
	}

	private Action makeSubmitAction() {
		Action action = new Action() {
			public void run() {
				
				// it save the current date so when the QL interpreter will require the value it can reads it
				QLFormBrowserView.this.lastSubmitButtonCall = new java.util.Date();
				userInputChangeNotifier.onUserInputChange();
			}
		};
		action.setText("Force Submit");
		action.setToolTipText("Force submission and finish the questionnaire regardless of mandatory questions status");
		action.setImageDescriptor(
				PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_ELCL_STOP));
		return action;
	}

	private Action makeAction2() {
		Action action = new Action() {
			public void run() {
				fBrowser.execute("changeColor();");
			}
		};
		action.setText("Change Color");
		action.setToolTipText("Change the color");
		action.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_ELCL_SYNCED));
		return action;
	}

	@Override
	public void setFocus() {
		fBrowser.setFocus();
	}

	private class OnInputChange extends BrowserFunction {
		private Runnable function;

		OnInputChange(Browser browser, String name, Runnable function) {
			super(browser, name);
			this.function = function;
		}

		@Override
		public Object function(Object[] arguments) {
			function.run();
			return getName() + " executed!";
		}
	}

	public String getContent() {
		String js = null;
		try (InputStream inputStream = getClass().getResourceAsStream("QLFormBrowserView.js")) {
			js = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
		} catch (IOException e) {
		}
		StringBuilder buffer = new StringBuilder();
		buffer.append("<!doctype html>");
		buffer.append("<html lang=\"en\">");
		buffer.append("<head>");
		buffer.append("<meta charset=\"utf-8\">");
		buffer.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		buffer.append("<title>Sample View</title>");
		buffer.append("<script>" + js + "</script>");
		buffer.append("</script>");
		buffer.append("</head>");
		buffer.append("<body>");
		buffer.append("<h3>QL Form</h3>");
		buffer.append("<div id=\"qlForm\"></div>");
		buffer.append("<button type=\"button\" id=\"submitButton\" onclick=\"onSubmit()\">Finish</button>\n");
		buffer.append("<details>");
		buffer.append("<summary>debug info</summary>");
		buffer.append("<h3>Selection</h3>");
		buffer.append("<div id=\"selection\"></div>");
		buffer.append("<h3>Last Action</h3>");
		buffer.append("<div id=\"lastAction\"></div>");
		buffer.append("</details>");
		buffer.append("</body>");
		buffer.append("</html>");
		return buffer.toString();
	}

	/**
	 * setQLForm html content
	 * call the javascript to set this string in the appropriate div
	 * @param qlFormContent
	 */
	public void setQLForm(String qlFormContent) {
		fBrowser.execute("setQLForm(\"" + qlFormContent + "\");");
	}
	/**
	 * setQLForm html content
	 * call the javascript to set this string in the appropriate div
	 * @param qlFormContent
	 */
	public void appendQLForm(String qlFormContent) {
		fBrowser.execute("appendQLForm(\"" + qlFormContent.replaceAll("\"", "\\\"") + "\");");
	}

	public void enableSubmitButton() {
		fBrowser.execute("enableButton(\"submitButton\");");
	}

	public void disableSubmitButton() {
		fBrowser.execute("disableButton(\"submitButton\");");
	}
	
	public String getFieldValueAsString(String fieldId) {
		Object result = fBrowser.evaluate("return getFieldValueAsString(\""+fieldId+"\");");
		if (result instanceof String) {
            String stringResult = (String) result;
            return stringResult;
        } else {
            return null;
        }
	}	


	@Override
	public void dispose() {
		org.eclipse.gemoc.executionframework.ui.Activator.getDefault().getEngineSelectionManager().removeEngineSelectionListener(this);
		super.dispose();
	}

	@Override
	public void engineSelectionChanged(IExecutionEngine<?> engine) {
		if(engine !=null) {
			fBrowser.execute("setSelection(\"Engine "+ engine.getName() + " was selected\");");
	
			if(engine.getExecutionContext() != null) {
				Resource res = engine.getExecutionContext().getResourceModel();
				if(res.getContents().get(0) instanceof QLModel) {
					fBrowser.execute("setSelection(\"Engine "+ engine.getName() + "("+ engine.getRunningStatus() +") was selected and contains a QLModel\");");
				}
			}
			// reset the date when submit was pressed when changing engine
			// TODO maybe keep a hashmap in case we need to support multiple executions and switch between running engines
			this.lastSubmitButtonCall =  null;
		} else {
			fBrowser.execute("setSelection(\"Engine was stopped and removed\");");
			this.setQLForm("");
		}
	}


}
