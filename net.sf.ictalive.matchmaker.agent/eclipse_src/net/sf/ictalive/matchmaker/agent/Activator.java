package net.sf.ictalive.matchmaker.agent;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import edu.bath.matchmaker.MatchMaker;

import agents.ReloadableMatchMaker;
import agents.ServicePrefs;

public class Activator extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "net.sf.ictalive.matchmaker";

	static Activator plugin;

	ServicePrefs currentPrefs = ServicePrefs.BEST_INPUTS_AND_OUTPUTS;

	public ServicePrefs getDefaultServicePrefs() {
		return currentPrefs;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		ReloadableMatchMaker rmm = new ReloadableMatchMaker() {

			@Override
			public void reload() {
				// TODO Auto-generated method stub

			}

			@Override
			public MatchMaker getMatchMaker() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static Activator getDefault() {
		return plugin;
	}
}
