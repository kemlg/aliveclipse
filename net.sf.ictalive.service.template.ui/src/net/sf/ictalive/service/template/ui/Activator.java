package net.sf.ictalive.service.template.ui;

import java.util.Properties;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.slf4j.LoggerFactory;

import edu.bath.alivetemplates.TemplateConstructor;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	org.slf4j.Logger log = LoggerFactory.getLogger(Activator.class);


	// The plug-in ID
	public static final String PLUGIN_ID = "net.sf.ictalive.service.template.ui";

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		Logger root = Logger.getRootLogger();
		if (!root.getAllAppenders().hasMoreElements()) {
			root.setLevel(Level.DEBUG);
			root.addAppender(new ConsoleAppender(new PatternLayout(
					PatternLayout.TTCC_CONVERSION_PATTERN)));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
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
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * builds a properties bundle for the template matchmaker API based on the
	 * current workspace preferences
	 * 
	 * @return
	 */
	public Properties getTemplateMMProps() {
		log.debug("Getting Template MM properties");

		Properties props = new Properties();

		String clingopath = net.sf.ictalive.service.serviceui.Activator.getDefault().getPreferenceStore()
				.getString(
						net.sf.ictalive.service.serviceui.preferences.PreferenceConstants.P_CLINGOPATH);
		log.debug("Setting {} to {}", TemplateConstructor.PROP_CLINGOPATH,
				clingopath);
		props.setProperty(TemplateConstructor.PROP_CLINGOPATH, clingopath);

		String clingoargs = net.sf.ictalive.service.serviceui.Activator.getDefault().getPreferenceStore()
				.getString(
						net.sf.ictalive.service.serviceui.preferences.PreferenceConstants.P_CLINGOCMDLINE);
		log.debug("Setting {} to {}", TemplateConstructor.PROP_CLINGOARGS,
				clingoargs);
		props.setProperty(TemplateConstructor.PROP_CLINGOARGS, clingoargs);
		return props;
	}
}
