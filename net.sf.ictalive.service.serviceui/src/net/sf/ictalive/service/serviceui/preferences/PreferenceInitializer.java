package net.sf.ictalive.service.serviceui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import net.sf.ictalive.service.serviceui.Activator;
import net.sf.ictalive.service.serviceui.Activator.MMPREF;
import net.sf.ictalive.service.serviceui.Activator.MM_MATCH;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_SVCREPOURL,
				"http://localhost:8080/repo/ws/ObjectRepo?wsdl");
		store.setDefault(PreferenceConstants.P_CLINGOPATH,
				"/usr/local/bin/clingo");
		store.setDefault(PreferenceConstants.P_CLINGOCMDLINE, "-n 0");
		store.setDefault(PreferenceConstants.P_USE_LOCAL_MATCHMAKER_FILES,
				false);
		store.setDefault(PreferenceConstants.P_CREATE_DUMMY_SERVICES, false);

		store.setDefault(PreferenceConstants.P_MM_INUPUTMATCH,
				MM_MATCH.SUPERCLASSES.name());

		store.setDefault(PreferenceConstants.P_MM_OUTPUTMATCH,
				MM_MATCH.SUBCLASSES.name());

		store.setDefault(PreferenceConstants.P_MM_PREFERENCES, MMPREF.IOPR_SIM
				.name());

	}
}
