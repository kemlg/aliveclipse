package net.sf.ictalive.log.analysis_v2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.tasks.ActionGrounding;
import net.sf.ictalive.coordination.tasks.ActionGroundingList;
import net.sf.ictalive.coordination.tasks.Plan;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.log.analysis_v2.plan.PlanInfo;
import net.sf.ictalive.log.analysis_v2.plan.RoleTaskInfo;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.runtime.NormInstances.NormInstancesPackage;
import net.sf.ictalive.runtime.enactment.Enactment;
import net.sf.ictalive.runtime.enactment.EnactmentPackage;
import net.sf.ictalive.runtime.enactment.PlanEnactment;
import net.sf.ictalive.runtime.event.Actor;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.event.EventPackage;
import net.sf.ictalive.runtime.fact.FactPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;


public class LoadEventData {

	boolean flag = true;
	List<PlanInfo> planList = new ArrayList<PlanInfo>();
	ArrayList<RoleTaskInfo> roleTaskList = new ArrayList<RoleTaskInfo>();
	String dataLocation = "";
	//String projectLocation = "";
	
	public LoadEventData(){
//		if(p != null)
//			this.projectLocation = p.toString();
	//	String dir = promptEventDataFile();
		
		dataLocation = promptEventDataDirectory();

		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, 
						new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
				resourceSet.getPackageRegistry().put(OMPackage.eNS_PREFIX, OMPackage.eINSTANCE);
				resourceSet.getPackageRegistry().put(OMPackage.eNS_URI, OMPackage.eINSTANCE);		
				
				resourceSet.getPackageRegistry().put(ActionsPackage.eNS_PREFIX, ActionsPackage.eINSTANCE);
				resourceSet.getPackageRegistry().put(ActionsPackage.eNS_URI, ActionsPackage.eINSTANCE);	

				resourceSet.getPackageRegistry().put(TasksPackage.eNS_PREFIX, TasksPackage.eINSTANCE);
				resourceSet.getPackageRegistry().put(TasksPackage.eNS_URI, TasksPackage.eINSTANCE);		
				
				resourceSet.getPackageRegistry().put(EventPackage.eNS_PREFIX, EventPackage.eINSTANCE);
				resourceSet.getPackageRegistry().put(EventPackage.eNS_URI, EventPackage.eINSTANCE);		
				
				resourceSet.getPackageRegistry().put(EnactmentPackage.eNS_PREFIX, EnactmentPackage.eINSTANCE);
				resourceSet.getPackageRegistry().put(EnactmentPackage.eNS_URI, EnactmentPackage.eINSTANCE);	

				resourceSet.getPackageRegistry().put(FactPackage.eNS_PREFIX, FactPackage.eINSTANCE);
				resourceSet.getPackageRegistry().put(FactPackage.eNS_URI, FactPackage.eINSTANCE);
				
				resourceSet.getPackageRegistry().put(NormInstancesPackage.eNS_PREFIX, NormInstancesPackage.eINSTANCE);
				resourceSet.getPackageRegistry().put(NormInstancesPackage.eNS_URI, NormInstancesPackage.eINSTANCE);
				
/*				if(projectLocation == null){
					IProject[] project = ResourcesPlugin.getWorkspace().getRoot().getProjects();
					projectLocation = project[0].getLocation().toString();
					for(int i=0; i<project.length; i++)
						System.out.println("**PRoject Location: " + project[i].getLocation());
				}*/
				/*
				String[] eventLocations = { "/Users/jlam/Desktop/EventData/cjPartOne/output/events/",
					 	"/Users/jlam/Desktop/EventData/TMT_task0_getPetition/output/events/", 

						"/Users/jlam/Desktop/EventData/TMT_task1_gatherUserContext/output/events/", 
						"/Users/jlam/Desktop/EventData/TMT_task2_gatherData/output/events/", 

						"/Users/jlam/Desktop/EventData/TMT_task3_getPreferences/output/events/", 

						"/Users/jlam/Desktop/EventData/TMT_task3_getPreferences/output/events/"};

						"/Users/jlam/Desktop/EventData/TMT_task4_gatherContnet/output/events/", 
						"/Users/jlam/Desktop/EventData/TMT_task5_composeContent/output/events/",   
						"/Users/jlam/Desktop/EventData/TMT_task6_showContent/output/events/"};*/
				String[] eventLocations = {dataLocation +"/cjPartOne/output/events/",
						dataLocation + "/TMT_task0_getPetition/output/events/", 
						dataLocation + "/TMT_task1_gatherUserContext/output/events/", 
						dataLocation + "/TMT_task2_gatherData/output/events/", 
						dataLocation + "/TMT_task3_getPreferences/output/events/", 
						dataLocation + "/TMT_task4_gatherContnet/output/events/", 
						dataLocation + "/TMT_task5_composeContent/output/events/",   
						dataLocation + "/TMT_task6_showContent/output/events/"};
				
				for(int m=0; m< eventLocations.length; m++)
					{
					String eventLocation = eventLocations[m];
					File eventFolder = new File(eventLocations[m]);

					
					//System.out.println("Folder path: " + eventFolder.getAbsolutePath());
					String[] eventList = eventFolder.list();
					if(eventList != null)
						{
					//	System.out.println("List length: " + eventList.length);
			
						for(int i=0; i< eventList.length; i++)
							{
							//System.out.println(eventList[i]);
							if(eventList[i].startsWith("."))
								continue;
							else if(!eventList[i].endsWith(".events"))
								continue;
							
							Resource r = resourceSet.getResource(URI.createFileURI(eventLocation + eventList[i]), true);
							
							EList<EObject> contents = r.getContents();
							for(int j=0; j< contents.size(); j++){
								EObject obj = contents.get(j);
								//System.out.println("Object: " + obj.getClass());
								
								if(obj instanceof Event){
									Event ev = (Event) obj;
									//System.out.println("Event: " + ev);
									
									Actor ag = ev.getAsserter();
									//System.out.println("Actor: " + ag.getName());
									
									EList<Enactment> enacts = ev.getContent().getEffect().get(0).getEnactment();
									
									for(int k=0; k< enacts.size(); k++){
										Enactment enact = enacts.get(k);
										
										//System.out.println("Enactment: " + enact.getSessionId());
										//System.out.println("Start time: " + enact.getStartTime());
										if(enact instanceof PlanEnactment){
											Plan plan = ((PlanEnactment) enact).getPlan();
											//System.out.println("Plan name: " + plan.getName());
											//planList.add(plan);
											PlanInfo planInfo = new PlanInfo(plan);
											addPlan(planInfo);
											ActionGroundingList actionList = plan.getHasAtomicProcessGroundingList();
											ActionGrounding actionG = actionList.getFirst();
											Action action1 = actionG.getOwlsProcess();
											//System.out.println("** First Action Name: " + action1.getName());
											planInfo.addAction(action1);
											addRoleTaskInfo(ag, action1);
											ActionGroundingList actionRest = actionList.getRest();
										    flag = true;
											while(flag){
												actionRest = getActionGroundingList(actionRest, planInfo, ag);
											}
											
										}
									}
									
								}
								break;
								
							}
						}
					}
					//System.out.println("=========================");
				}
	}
	
	private void addPlan(PlanInfo plan){
		if(planList.contains(plan)) return;
		for(int i=0; i<planList.size(); i++){
			String name = planList.get(i).getName();
			if(plan.getName().equals(name)) return;
		}
		
		 planList.add(plan);
	}
	
	public ActionGroundingList getActionGroundingList(ActionGroundingList actionRest, PlanInfo planInfo, Actor ag){
		//ActionGroundingList actionRest = list.getRest();
		if(actionRest != null){
			ActionGrounding actionFirst = actionRest.getFirst();
			if (actionFirst == null) 				flag = false; 
			Action action2 = actionFirst.getOwlsProcess();
			if(action2 == null) flag = false;
			planInfo.addAction(action2);
			addRoleTaskInfo(ag, action2);
		//	System.out.println("**** Action Name: " + action2.getName());
		}else	{
			flag = false;
			return null;
		}
		return actionRest.getRest();
	}
	
	private void addRoleTaskInfo(Actor ag, Action action){
		for(int i=0; i<roleTaskList.size(); i++){
			RoleTaskInfo rti = roleTaskList.get(i);
			if(rti.role.getName().equals(ag.getName()) && 
					rti.task.getName().equals(action.getName()))
				return;
		}
		RoleTaskInfo rti = new RoleTaskInfo(ag, action);
		roleTaskList.add(rti);
	}

	public ArrayList<RoleTaskInfo> getRoleTaskInfoLIst() {return roleTaskList; }
	public List<PlanInfo> getEnactmentList(){ return planList;}
	
	private String promptEventDataFile(){
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		Shell shell = workbenchWindow.getShell();
		
		DirectoryDialog dialog = new DirectoryDialog (shell, SWT.OPEN);
		dialog.setText("Select the Event Data Directory");
		dialog.setMessage("Select the Event Data directory for analysing the log");
		
		String dir = dialog.open();
		if(dir == null) System.err.println("NO Directory IS FOUND");
		else System.out.println(" Directory Name: " + dir);
		return dir;
/*
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(
				shell, ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
		
		dialog.setTitle("Title");
		dialog.setMessage("Message");
		int open = dialog.open();
		if (open == ResourceListSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				IFile selectedFile = (IFile) result[0];
				return selectedFile;
			}
		}
		return null;*/
	}
	
	private String promptEventDataDirectory(){
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		Shell shell = workbenchWindow.getShell();
		DirectoryDialog dlg = new DirectoryDialog(shell, SWT.OPEN);
		// Change the title bar text
        dlg.setText("Select the EventData Directory");
        // Customizable message displayed in the dialog
        dlg.setMessage("Select the EventData directory for analysis");
        // Calling open() will open and run the dialog.
        // It will return the selected directory, or
        // null if user cancels
        String dir = dlg.open();
        if (dir != null) {
        	System.out.println("Event Directory: " + dir);
        	return dir;
        }else return null;
	}
	
	public String getDataLocation(){ return dataLocation;}
	
}
