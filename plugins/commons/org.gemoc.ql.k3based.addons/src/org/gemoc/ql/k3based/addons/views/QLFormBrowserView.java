package org.gemoc.ql.k3based.addons.views;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.inject.Inject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gemoc.executionframework.ui.views.engine.IEngineSelectionListener;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.*;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.part.ViewPart;
import org.gemoc.ql.model.ql.QLModel;

/**
 * This sample class demonstrates how to plug-in a new
 * workbench view with html and javascript content. The view 
 * shows how data can be exchanged between Java and JavaScript.
 */

public class QLFormBrowserView extends ViewPart implements ISelectionListener, IEngineSelectionListener {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.gemoc.ql.k3based.addons.views.QLFormBrowserView";

	@Inject
	Shell shell;

	private Action action1 = makeAction1();
	private Action action2 = makeAction2();

	private Browser fBrowser;
	
	private Boolean hasChanges = false;

	@Override
	public void createPartControl(Composite parent) {
		fBrowser = new Browser(parent, SWT.WEBKIT);
		fBrowser.setText(getContent());
		BrowserFunction prefs = new OpenPreferenceFunction(fBrowser, "openEclipsePreferences", () -> {
			PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(shell, null, null, null);
			dialog.open();
		});

		BrowserFunction onInputChanges = new OnInputChanges(fBrowser, "onInputChanges", () -> {
			this.hasChanges = true;
		});
		fBrowser.addDisposeListener(e -> prefs.dispose());
		makeActions();
		contributeToActionBars(getViewSite());
		getSite().getPage().addSelectionListener(this);
		org.eclipse.gemoc.executionframework.ui.Activator.getDefault().getEngineSelectionManager().addEngineSelectionListener(this);
	}

	private void contributeToActionBars(IViewSite viewSite) {
		IActionBars bars = viewSite.getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
	}

	private void makeActions() {
		makeAction1();
		makeAction2();
	}

	private Action makeAction1() {
		Action action = new Action() {
			public void run() {
				InputDialog inputDialog = new InputDialog(shell, null, "What must the browser say: ", null, null);
				inputDialog.open();
				String something = inputDialog.getValue();
				fBrowser.execute("say(\"" + something + "\");");
			}
		};
		action.setText("Say something");
		action.setToolTipText("Say something");
		action.setImageDescriptor(
				PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
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

	private class OpenPreferenceFunction extends BrowserFunction {
		private Runnable function;

		OpenPreferenceFunction(Browser browser, String name, Runnable function) {
			super(browser, name);
			this.function = function;
		}

		@Override
		public Object function(Object[] arguments) {
			function.run();
			return getName() + " executed!";
		}
	}
	private class OnInputChanges extends BrowserFunction {
		private Runnable function;

		OnInputChanges(Browser browser, String name, Runnable function) {
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
		buffer.append("<h3>Selection</h3>");
		buffer.append("<div id=\"selection\"></div>");
		buffer.append("<h3>Last Action</h3>");
		buffer.append("<div id=\"lastAction\"></div>");
		buffer.append("<h3>Call to Java</h3>");
		buffer.append("<input id=button type=\"button\" value=\"Open Preferences\" onclick=\"openPreferences();\">");
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
		fBrowser.execute("appendQLForm(\"" + qlFormContent + "\");");
	}
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty()) {
			return;
		}
		if (selection instanceof IStructuredSelection) {
			fBrowser.execute("setSelection(\"" + part.getTitle() + "::"
					+ ((IStructuredSelection) selection).getFirstElement().getClass().getSimpleName() + "\");");
		} else {
			fBrowser.execute("setSelection(\"Something was selected in part " + part.getTitle() + "\");");
		}
	}

	@Override
	public void dispose() {
		getSite().getPage().removeSelectionListener(this);
		org.eclipse.gemoc.executionframework.ui.Activator.getDefault().getEngineSelectionManager().removeEngineSelectionListener(this);
		super.dispose();
	}

	@Override
	public void engineSelectionChanged(IExecutionEngine<?> engine) {
		fBrowser.execute("setSelection(\"Engine "+ engine.getName() + " was selected\");");

		if(engine.getExecutionContext() != null) {
			Resource res = engine.getExecutionContext().getResourceModel();
			if(res.getContents().get(0) instanceof QLModel) {

				fBrowser.execute("setSelection(\"Engine "+ engine.getName() + " was selected and contains a QLModel\");");
			}
		}
		
	}

	public void resetHasChanges() {
		this.hasChanges =  false;
	}
}
