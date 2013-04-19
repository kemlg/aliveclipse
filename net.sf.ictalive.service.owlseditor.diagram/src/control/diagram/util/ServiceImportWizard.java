package control.diagram.util;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.serviceui.ServiceRepositoryImportPage;

import org.eclipse.jface.wizard.Wizard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceImportWizard extends Wizard {

	protected ServiceRepositoryImportPage importPage;
	public ObjectDescriptor selectedObjectDescriptor;
	
	Logger log = LoggerFactory.getLogger(ServiceImportWizard.class);
	
	public void addPages() {
		importPage = new ServiceRepositoryImportPage("Import services", ServiceRepositoryImportPage.SERVICES);
		this.addPage(importPage);
	}
	
	public ObjectDescriptor getObjectDescriptor() {
		return selectedObjectDescriptor;
	}
	
	@Override
	public boolean performFinish() {
		selectedObjectDescriptor = importPage.getSelectedObjectDescriptor();		
		return (selectedObjectDescriptor!=null);
		
	}
	
	

}
