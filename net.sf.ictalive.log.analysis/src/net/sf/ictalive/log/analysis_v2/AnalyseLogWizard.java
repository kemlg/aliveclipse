package net.sf.ictalive.log.analysis_v2;

import net.sf.ictalive.log.analysis_v2.pages.AgentViolatedNormsPage;
import net.sf.ictalive.log.analysis_v2.pages.AnalyseLogMainPage;
import net.sf.ictalive.log.analysis_v2.pages.RoleTaskMatrixPage;
import net.sf.ictalive.log.analysis_v2.pages.ServiceInvocationPage;
import net.sf.ictalive.log.analysis_v2.pages.ThroughputPage;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class AnalyseLogWizard extends Wizard implements INewWizard{
	
	// wizard pages
	public AnalyseLogMainPage mainPage;
	public ThroughputPage throughPage;
	public ServiceInvocationPage service;
	public RoleTaskMatrixPage rolePage;
	public AgentViolatedNormsPage agentViolatedPage;
	private LoadEventData loadEvent;
	
	// the model
//	AnalyseLogModel model;
	
	// workbench selection when the wizard was started
	protected IStructuredSelection selection;
	
	// the workbench instance
	protected IWorkbench workbench;
	
	
	public AnalyseLogWizard(){
		super();
		loadEvent = new LoadEventData();
//		model = new AnalyseLogModel(file);
	}

	public void addPages()
	{
		mainPage = new AnalyseLogMainPage(workbench, selection, loadEvent.getDataLocation());
		addPage(mainPage);
		throughPage = new ThroughputPage("", loadEvent);
		addPage(throughPage);
		service = new ServiceInvocationPage("");
		addPage(service);
		rolePage = new RoleTaskMatrixPage("", loadEvent);
		addPage(rolePage);
		agentViolatedPage = new AgentViolatedNormsPage("", loadEvent);
		addPage(agentViolatedPage);
	}
	/**
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) 
	{
		this.workbench = workbench;
		this.selection = selection;
//		URI physicalURI = URI.create("file:///Users/jlam/Documents/workspace/log.analyse/log.owl");
	//	model.loadOntologyInRDF(null, physicalURI, false);
	}
	
	
	public boolean performFinish() {
		return true;
	}
}
