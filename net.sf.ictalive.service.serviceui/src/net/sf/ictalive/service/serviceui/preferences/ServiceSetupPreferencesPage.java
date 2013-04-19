package net.sf.ictalive.service.serviceui.preferences;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.preference.*;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;

import net.sf.ictalive.service.serviceui.Activator;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class ServiceSetupPreferencesPage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {
	FileFieldEditor clingoLocation;
	DirectoryFieldEditor localServicesPath;
	BooleanFieldEditor useLocalServicesPath;
	private StringFieldEditor repoURLEditor;

	public ServiceSetupPreferencesPage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Configure the service layer components");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {
		repoURLEditor = new StringFieldEditor(PreferenceConstants.P_SVCREPOURL,
				"&Service Repository WSDL URL", getFieldEditorParent());
		repoURLEditor.setEmptyStringAllowed(false);

		addField(repoURLEditor);

		addField(useLocalServicesPath = new BooleanFieldEditor(
				PreferenceConstants.P_USE_LOCAL_MATCHMAKER_FILES,
				"Use &Local Matchmaker Files", getFieldEditorParent()));

		addField(localServicesPath = new DirectoryFieldEditor(
				PreferenceConstants.P_LOCAL_SERVICES_PATH,
				"Local &Services Directory", getFieldEditorParent()));

		// addField(new BooleanFieldEditor(
		// PreferenceConstants.P_CREATE_DUMMY_SERVICES,
		// "&Create Dummy Services", getFieldEditorParent()));
		addField(new FileFieldEditor(PreferenceConstants.P_QOS_DATA_FILE,
				"&Quality of Service Data", getFieldEditorParent()));

		addField(new ComboFieldEditor(PreferenceConstants.P_MM_INUPUTMATCH,
				"Matchmaker Input Match", Activator.getDefault()
						.getMatchMakerInConfigurationNames(),
				getFieldEditorParent()));

		addField(new ComboFieldEditor(PreferenceConstants.P_MM_OUTPUTMATCH,
				"Matchmaker Output Match", Activator.getDefault()
						.getMatchMakerOutConfigurationNames(),
				getFieldEditorParent()));

		addField(new ComboFieldEditor(PreferenceConstants.P_MM_PREFERENCES,
				"Matchmaker Preference", Activator.getDefault()
						.getMatchMakerPrefConfigurationNames(),
				getFieldEditorParent()));
		addField(clingoLocation = new FileFieldEditor(
				PreferenceConstants.P_CLINGOPATH, "&Clingo Binary Location:",
				getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.P_CLINGOCMDLINE,
				"Clingo C&ommand Line Options:", getFieldEditorParent()));

		clingoLocation.setEmptyStringAllowed(false);

	}

	@Override
	protected void checkState() {
		super.checkState();

		if (!isValid())
			return;
		boolean hasErrors = false;
		String repoURL = repoURLEditor.getStringValue();
		try {
			URL url = new URL(repoURL);
		} catch (MalformedURLException e) {
			setErrorMessage("Repo URL is not a valid URL");
			hasErrors = true;
		}

		File clingoFile = new File(clingoLocation.getStringValue());

		if (!clingoFile.exists() || !clingoFile.canExecute()) {
			setErrorMessage("Clingo Location must be set to an executable");
			hasErrors = true;

		}

		if (hasErrors)
			setValid(false);
		else {
			setValid(true);
			setErrorMessage(null);
		}
	}

	@Override
	protected void performApply() {
		// TODO Auto-generated method stub
		super.performApply();

	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		super.propertyChange(event);

		if (event.getProperty().equals(FieldEditor.VALUE)) {
			if (event.getSource() == repoURLEditor) {
				checkState();
			}

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

}