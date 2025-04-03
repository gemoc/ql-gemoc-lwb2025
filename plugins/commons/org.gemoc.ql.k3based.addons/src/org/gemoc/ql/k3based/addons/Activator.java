package org.gemoc.ql.k3based.addons;

import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.gemoc.ql.k3based.addons"; //$NON-NLS-1$
	private static Activator plugin;
	protected MessagingSystem messaggingSystem = null;
	static Activator getDefault() {
		return plugin;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
	}
	
	public MessagingSystem getMessaggingSystem() {
		if (messaggingSystem == null) {
			MessagingSystemManager msm = new MessagingSystemManager();
			// reuse messaging system from the Modeling Workbench Engine
			// messaggingSystem = msm.createBestPlatformMessagingSystem(
			//		org.eclipse.gemoc.executionframework.engine.Activator.PLUGIN_ID,
			//		org.eclipse.gemoc.executionframework.engine.Activator.CONSOLE_NAME);
			messaggingSystem = msm.getBestPlatformSharedMessaggingSystem();
		}
		return messaggingSystem;
	}

	public static void debug(String msg) {
		getDefault().getMessaggingSystem().debug(msg, "");
	}
	public static void error(String msg) {
		getDefault().getMessaggingSystem().error(msg, "");
	}
	public static void error(String msg, Exception e) {
		getDefault().getMessaggingSystem().error(msg, "", e);
	}
	public static void warn(String msg) {
		getDefault().getMessaggingSystem().warn(msg, "");
	}
	public static void warn(String msg, Exception e) {
		getDefault().getMessaggingSystem().warn(msg, "", e);
	}

}
