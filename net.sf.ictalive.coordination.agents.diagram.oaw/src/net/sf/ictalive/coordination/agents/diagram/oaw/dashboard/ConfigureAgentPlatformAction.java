package net.sf.ictalive.coordination.agents.diagram.oaw.dashboard;

import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.AGENTSCAPE_LOCATION;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.AGENTSCAPE_PORT;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.AGENTSCAPE_SERVER;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.MAX_HEAP_SIZE;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.NON_PROXY_HOSTS;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.PROXY_HOST;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.PROXY_PASSWORD;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.PROXY_PORT;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.PROXY_USER;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils;
import net.sf.ictalive.dashboard.PluggedInDashboardAction;
import net.sf.ictalive.runtime.dashboard.RuntimeDashboardState;

public class ConfigureAgentPlatformAction extends PluggedInDashboardAction<RuntimeDashboardState>{

	@Override
	public String dashboardActionId() {
		return RuntimeDashboardState.ConfigureAgentPlatformId;
	}

	@Override
	public String getProblems(RuntimeDashboardState state) {
		return null;
	}

	@Override
	public void run(RuntimeDashboardState state) {
		ConfigureAgentPlatformDialog dialog = new ConfigureAgentPlatformDialog(null);
		if (ConfigureAgentPlatformDialog.OK == dialog.open()){
			PreferencesUtils.put(AGENTSCAPE_LOCATION,dialog.getAgentscapeLocation() );
			PreferencesUtils.put(AGENTSCAPE_PORT, getPrefValue(dialog.getAgentscapePort()));
			PreferencesUtils.put(AGENTSCAPE_SERVER, dialog.getAgentscapeServer());
			PreferencesUtils.put(PROXY_HOST, dialog.getProxyHost());
			PreferencesUtils.put(PROXY_PASSWORD, dialog.getProxyPassword());
			PreferencesUtils.put(PROXY_PORT, getPrefValue(dialog.getProxyPort()));
			PreferencesUtils.put(PROXY_USER, dialog.getProxyUser());
			PreferencesUtils.put(NON_PROXY_HOSTS, dialog.getNonProxyHosts());
			PreferencesUtils.put(MAX_HEAP_SIZE, getPrefValue(dialog.getMaxHeapSize()));
		}
	}

	private String getPrefValue(int value) {
		return (value==-1)?"":Integer.toString(value);
	}
	
	
}
