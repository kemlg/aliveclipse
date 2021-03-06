package net.sf.ictalive.cl2sl.ui;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class InvokeActivator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "net.sf.ictalive.CL2SL.invoke";

	// The shared instance
	private static InvokeActivator plugin;
	
	/**
	 * The constructor
	 */
	public InvokeActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static InvokeActivator getDefault() {
		return plugin;
	}

}
