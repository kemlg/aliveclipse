package net.sf.ictalive.aliveclipse;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

public class NewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	/*
	 * Martijn: 
	 * Code is taken from tutorial: http://cvalcarcel.wordpress.com/2009/07/11/writing-an-eclipse-plug-in-part-2-creating-a-custom-project-in-eclipse-adding-to-the-new-project-wizard/
	 * 
	 */
	
	private WizardNewProjectCreationPage _pageOne;

	private IConfigurationElement _configurationElement;

	public NewProjectWizard() {
		setWindowTitle("New Alive Project");
	}

	
	@Override
	public boolean performFinish() {
	    String name = _pageOne.getProjectName();
	    URI location = null;
	    if (!_pageOne.useDefaults()) {
	        location = _pageOne.getLocationURI();
	        System.err.println("location: " + location.toString()); //$NON-NLS-1$
	    } // else location == null

	    AliveProjectSupport.createProject(name, location);
	    // Add this
	    BasicNewProjectResourceWizard.updatePerspective(_configurationElement);

	    return true;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public void addPages() {
	    super.addPages();

	    _pageOne = new WizardNewProjectCreationPage("Alive Project Wizard");
	    _pageOne.setTitle("Alive Project");
	    _pageOne.setDescription("Create a new Alive project.");

	    addPage(_pageOne);
	}

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
	    _configurationElement = config;
	}

}
