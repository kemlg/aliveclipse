package net.sf.ictalive.log.analysis_v2;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import net.sf.ictalive.log.analysis_v2.pages.NewOperaFileWizardPage;
import net.sf.ictalive.log.analysis_v2.pages.OperAFunctionsPage;
import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.HierarchyDependency;
import net.sf.ictalive.operetta.OM.IS;
import net.sf.ictalive.operetta.OM.NS;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.Ontology;
import net.sf.ictalive.operetta.OM.OperAModel;
import net.sf.ictalive.operetta.OM.PartialOrder;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.operetta.OM.SS;
import net.sf.ictalive.operetta.OM.Scene;
import net.sf.ictalive.operetta.OM.SceneToTransitionArc;
import net.sf.ictalive.operetta.OM.SceneType;
import net.sf.ictalive.operetta.OM.Transition;
import net.sf.ictalive.operetta.OM.TransitionToSceneArc;
import net.sf.ictalive.operetta.OM.TransitionType;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.ISEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.part.OperAISDiagramEditorPlugin;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.SSEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.part.OperASSDiagramEditorPlugin;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResourceFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;

public class NewOperaFileWizard extends Wizard implements INewWizard {

		private Vector<OperAObject> v_objectives = new Vector<OperAObject>();
		private Vector<OperAObject> v_IS = new Vector<OperAObject>();
		private Vector<OperAObject> v_Scene = new Vector<OperAObject>();
		private Vector<OperAObject> v_LMP = new Vector<OperAObject>();
		private Vector<OperAObject> v_LM = new Vector<OperAObject>(); 
		private Vector<Role> all_roles = new Vector<Role>();
		
	    private IStructuredSelection selection;
	    private NewOperaFileWizardPage newFileWizardPage;
	    public OperAFunctionsPage operAFunctionsPage;
	    private IWorkbench workbench;
	    
		protected OMPackage operaPackage = OMPackage.eINSTANCE; 
		protected OMFactory operaFactory = operaPackage.getOMFactory();

		private File actionFile;
		//private IPath projectLocation;
		
		
	    public NewOperaFileWizard() {
	    	//this.projectLocation = projLocation;
	        setWindowTitle("New OperA File");
	       
	    } 

	    @Override
	    public void addPages() {
	    	 
	        newFileWizardPage = new NewOperaFileWizardPage(selection);
	        addPage(newFileWizardPage);
	     
	        operAFunctionsPage = new OperAFunctionsPage();
	        addPage(operAFunctionsPage);
	        
	    }
	    
	    @Override
	    public boolean performFinish() {
	    	try{
	    		IFile file = newFileWizardPage.createNewFile();
	    		if (file != null){
	    		try {
	    				createOperaFile(file);
	    				IDE.openEditor(workbench.getActiveWorkbenchWindow().getActivePage(), file);
	    		} catch (PartInitException e) {
	    			e.printStackTrace();
	    		}
	    				
	    			return true;
	    		}else{
	    			
	    			System.out.println("RETURN FALSE");
	    			return false;
	    		}
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
	    	return false;
	    }

	    public void init(IWorkbench workbench, IStructuredSelection selection) {
	    	
	        this.workbench = workbench;
	        this.selection = selection;
	    }
	    
	    private void createOperaFile(IFile file){
		    
				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("opera",// new OMFactoryImpl());
						new GMFResourceFactory());
				resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("*", new GMFResourceFactory()); 
				
//				URI uri = URI.createPlatformResourceURI(file.getAbsolutePath(), true);
				URI uri = URI.createFileURI(file.getLocation().toString());
				
				Resource resource = resourceSet.createResource(uri);
				//Resource resource = resourceSet.getResource(uri, true);
				
				
				EObject rootObject = createInitialModel();
				if (rootObject != null) {
				
					resource.getContents().add(rootObject);
					//set name
					((OperAModel)rootObject).setName("New OperA Model");
					//create and add OM
					OM om = OMFactory.eINSTANCE.createOM();
					((OperAModel)rootObject).setOm(om);
					//create and add SS
					SS ss = OMFactory.eINSTANCE.createSS();
					om.setSs(ss);
									
					// create roles and role type
					for(int i=0; i< operAFunctionsPage.getAll_Roles().size(); i++){
						Role role = operAFunctionsPage.getAll_Roles().get(i);
						ss.getRoles().add(role);
					}
					// generate objectives with roles' objectives
					for(int i=0; i<operAFunctionsPage.getAll_Objectives().size(); i++){
						Objective objective = operAFunctionsPage.getAll_Objectives().get(i);
						ss.getObjectives().add(objective);
/*						Vector<Role> v = v_objectives.get(i).getPerformedBy();
						if(v.size() > 0)
							for(int j=0; j<v.size(); j++){
								Role s_role = v.get(j);
								s_role.getObjectives().add(objective);
							}*/
					}			
/*					Objective objective = OMFactory.eINSTANCE.createObjective();
					objective.setName("Help_people");
					role.getObjectives().add(objective);
					role3.getObjectives().add(objective);
					ss.getObjectives().add(objective);*/
					
					HierarchyDependency hd = OMFactory.eINSTANCE.createHierarchyDependency();
					hd.setDependant(operAFunctionsPage.getAll_Roles().get(0));
					hd.setDependee(operAFunctionsPage.getAll_Roles().get(1));
					hd.getObjectOfDependency().add(operAFunctionsPage.getAll_Objectives().get(0));
					ss.getDependencies().add(hd);
					
					HierarchyDependency hd2 = OMFactory.eINSTANCE.createHierarchyDependency();
					hd2.setDependant(operAFunctionsPage.getAll_Roles().get(2));
					hd2.setDependee(operAFunctionsPage.getAll_Roles().get(3));
					hd2.getObjectOfDependency().add(operAFunctionsPage.getAll_Objectives().get(1));
					ss.getDependencies().add(hd2);
					
					//create and add IS
					IS is = OMFactory.eINSTANCE.createIS();
					om.setIs(is);
					
					//create start and end scenes
					Scene start = OMFactory.eINSTANCE.createScene();
					start.setType(SceneType.START);
					start.setSceneID("start");
					start.setDescription("Default start scene of an interaction structure");
					
					Scene defaultScene = OMFactory.eINSTANCE.createScene();
					defaultScene.setType(SceneType.NORMAL);
					defaultScene.setSceneID("Default Scene");
					defaultScene.setDescription("Default scene of an interaction structure");
					
					// generate landmarks pattern
					//Landmark landmark1 = OMFactory.eINSTANCE.createLandmark();
					//landmark1.setName(operAFunctionsPage.getLandmarkList().get(i).getName());

					//LandmarkPattern pattern = OMFactory.eINSTANCE.createLandmarkPattern();
					for(int i=0; i<operAFunctionsPage.getLandmarkList().size(); i++){
						defaultScene.getInteractionPattern().getLandmarks().add(operAFunctionsPage.getLandmarkList().get(i));
					}
				

					for(int i=0; i < defaultScene.getInteractionPattern().getLandmarks().size()-1; i++){
						if(defaultScene.getInteractionPattern().getLandmarks().get(i) == null || defaultScene.getInteractionPattern().getLandmarks().get(i+1) == null) break;
						
 						PartialOrder partialOrder = OMFactory.eINSTANCE.createPartialOrder();
						partialOrder.setFrom(defaultScene.getInteractionPattern().getLandmarks().get(i));
						partialOrder.setTo(defaultScene.getInteractionPattern().getLandmarks().get(i+1));
						defaultScene.getInteractionPattern().getLandmarkOrder().add(partialOrder);
					
						
					}
					
					
					//defaultScene.getInteractionPattern().add(pattern);
					
					
					// generate landmark pattern
/*					for(int i=0; i<v_LMP.size(); i++){
						LandmarkPattern pattern = OMFactory.eINSTANCE.createLandmarkPattern();
						//pattern.getLandmarks().add(landmark1);
						//pattern.getLandmarks().add(landmark2);
						start.getInteractionPattern().add(pattern);
					}*/

					// generate scenes
					/*for(int i=0; i<v_Scene.size(); i++){
						Scene middle = OMFactory.eINSTANCE.createScene();
						middle.setType(SceneType.NORMAL);
						middle.setSceneID(v_Scene.get(i).getName());
	//					middle.setDescription("Some description");
					//	middle.getInteractionPattern().add(pattern);	
						is.getScenes().add(middle);
					}*/
					
					Scene end = OMFactory.eINSTANCE.createScene();
					end.setType(SceneType.END);
					end.setSceneID("end");
					end.setDescription("Default end scene of an interaction structure");
					
					//TODO: create basic landmark pattern and fill result
					Transition trans1 = OMFactory.eINSTANCE.createTransition();
					trans1.setTransitionID("trans ID");
					trans1.setTransitionType(TransitionType.AND);
					SceneToTransitionArc scene2Trans1 = OMFactory.eINSTANCE.createSceneToTransitionArc();
					scene2Trans1.setFrom(start);
					scene2Trans1.setTo(trans1);
					
					TransitionToSceneArc trans2Scene1 = OMFactory.eINSTANCE.createTransitionToSceneArc();
					trans2Scene1.setFrom(trans1);
					trans2Scene1.setTo(defaultScene);
					
					Transition trans2 = OMFactory.eINSTANCE.createTransition();
					trans2.setTransitionID("trans ID");
					trans2.setTransitionType(TransitionType.AND);
					SceneToTransitionArc scene2Trans2 = OMFactory.eINSTANCE.createSceneToTransitionArc();
					scene2Trans2.setFrom(defaultScene);
					scene2Trans2.setTo(trans2);
					
					TransitionToSceneArc trans2Scene2 = OMFactory.eINSTANCE.createTransitionToSceneArc();
					trans2Scene2.setFrom(trans2);
					trans2Scene2.setTo(end);
					
					
					is.getScenes().add(start);
					is.getScenes().add(defaultScene);
					is.getScenes().add(end);					
					is.getTransitions().add(trans1);
					is.getArcs().add(trans2Scene1);
					is.getArcs().add(scene2Trans1);
					is.getTransitions().add(trans2);
					is.getArcs().add(trans2Scene2);
					is.getArcs().add(scene2Trans2);
					
					//create and add NS
					NS ns = OMFactory.eINSTANCE.createNS();
					om.setNs(ns);
					//create and add CS
					CS cs = OMFactory.eINSTANCE.createCS();
					om.setCs(cs);
					Ontology ontology = OMFactory.eINSTANCE.createOntology();
					ontology.setOntologyID("Default");
					cs.getOntology().add(ontology);
					
					// Create the diagrams
		            //
		            Diagram ssDiagram = ViewService.createDiagram(ss,
		                  SSEditPart.MODEL_ID,
		                  OperASSDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		            if (ssDiagram != null) {
		            	resource.getContents().add(ssDiagram);
		                ssDiagram.setName("SS_Diagram");
		                ssDiagram.setElement(ss);
		            }
		            
		            Diagram isDiagram = ViewService.createDiagram(is,
		                  ISEditPart.MODEL_ID,
		                  OperAISDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		            if (isDiagram != null) {
		            	resource.getContents().add(isDiagram);
		                isDiagram.setName("IS_Diagram");
		                isDiagram.setElement(is);
		            }
		            
				}
				
				try{
					// Save the contents of the resource to the file system.
					//
					Map<Object, Object> options = new HashMap<Object, Object>();
					options.put( XMLResource.OPTION_ENCODING, "UTF-8" ); //$NON-NLS-1$
					resource.save(options);
					
	/*				ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
					resource.save(outputStream, options);
					System.out.println(outputStream.toString());*/
					
				}catch(Exception e){
					e.printStackTrace();}
			}

	    	// read the .actions file by JDOM
	    	private void readActionsFile(IFile inputFile){
		    	String curPath = "";
	    		try {
	    			System.out.println("Opere file location " + inputFile.getLocation() + " , full path: " + inputFile.getFullPath());
	    		   // System.out.println(new File(".").getCanonicalPath());
	    		    curPath = inputFile.getLocation().toString(); // /Users/jlam/Documents/runtime-EclipseApplication/XMLExamples/awa.opera
	    		    int index = curPath.lastIndexOf("/");
	    		    curPath = curPath.substring(0, index);
	    		    System.out.println("Path: " + curPath);
//	    		    MessageDialog.openInformation(this.getShell(), curPath, curPath);
	
	    		}
	    		catch (Exception e) {
	    		    e.printStackTrace();
	    		}
	    		actionFile = new File( curPath + "/TMT_Demo.actions");
	
	    		if(! actionFile.exists()){
	    		
		    		MessageBox messageBox = new MessageBox(this.getShell(), SWT.ICON_INFORMATION);
		    		messageBox.setMessage("The .actions file is not found.\n Please open the .actions file manually.");
		            messageBox.setText("Open .actions file");
		            messageBox.open();
		    		FileDialog dialog = new FileDialog (this.getShell(), SWT.OPEN);
		    		String file = dialog.open();
		    		if(file == null) System.err.println("NO FILE IS FOUND");
		    		System.out.println(" FILE Name: " + file);
		    		actionFile = new File (file);
		    	}
	    		 System.out.println("actionFile: " + actionFile.getAbsolutePath());
	    		try{
	
	    			SAXBuilder builder = new SAXBuilder();
	    			Document document = builder.build(actionFile);
	    			Element root = document.getRootElement();
	                List<Element> row = root.getChildren("actions");	
	               
	                for (int i = 0; i < row.size(); i++) {
	                    Element action = (Element) row.get(i);
		                   List<Element> performedByList = action.getChildren("performedByRole");
		                   Vector<Role> v_performedBy = new Vector<Role>();
		                   for (int j = 0; j < performedByList.size(); j++) {
		                	   Element performedBy = (Element) performedByList.get(j);
		                	   Role r = checkExistingRole(performedBy.getValue());
			                    v_performedBy.add(r);
			                  //  MessageDialog.openInformation(this.getShell(), "role " + performedBy.getValue(), i + " " + performedBy.getValue());

		                   }

	                    String name = action.getAttribute("name").getValue();
	                   // MessageDialog.openInformation(this.getShell(), "name " + name, i + "name: " + name);
	                    if(name.startsWith("[LM]_")){
	                    	OperAObject temp = new OperAObject(name.substring(5));
	                    	temp.addPerformedBy(v_performedBy);
	                    	v_LM.add(temp);
	                  //  	System.out.println("LM Name = " + temp); 
	                   // 	MessageDialog.openInformation(this.getShell(), "", "LM Name = " + temp); 
	                    }else if (name.startsWith("[IS]_")){
	                    	OperAObject temp = new OperAObject(name.substring(5));
	                    	temp.addPerformedBy(v_performedBy);
	                    	v_IS.add(temp);
	                    //	System.out.println("IS Name = " + temp);
	                    //	MessageDialog.openInformation(this.getShell(), "", "IS Name = " + temp);
	                    }else if (name.startsWith("[LMP]_")){
	                    	OperAObject temp = new OperAObject(name.substring(6));
	                    	temp.addPerformedBy(v_performedBy);
	                    	v_LMP.add(temp);
	                    //	System.out.println("LMP Name = " + temp);
	                    	//MessageDialog.openInformation(this.getShell(), "", "LMP Name = " + temp);
	                    }else if (name.startsWith("[Scene]_")){
	                    	OperAObject temp = new OperAObject(name.substring(8));
	                    	temp.addPerformedBy(v_performedBy);
	                    	v_Scene.add(temp);
	                    //	System.out.println("Scene Name = " + temp);
	                    //	MessageDialog.openInformation(this.getShell(), "", "Scene Name = " + temp);
	                    }else{
	                    	OperAObject temp = new OperAObject(name);
	                    	temp.addPerformedBy(v_performedBy);
	                    	v_objectives.add(temp);
	                 //   	System.out.println("atomic Name = " + name);
	                    	//MessageDialog.openInformation(this.getShell(), "", "atomic Name = " + name);
	                    }
	                	   
	                }
	
	    		} catch (Exception e) {
	                e.printStackTrace();
	               
	            }
	    	}

	    	private Role checkExistingRole(String r){
	    		
	    		for(int i=0; i<all_roles.size(); i++){
	    			String name = all_roles.get(i).getName();
	    			if(name.equals(r)){ 
	    				return all_roles.get(i);
	    			}
	    		}
    			Role new_role = OMFactory.eINSTANCE.createRole();
    			new_role.setName(r);
    			all_roles.add(new_role);
	    		return new_role;
	    	}
			 protected EObject createInitialModel() {
				 
					EClass eClass = (EClass)operaPackage.getEClassifier("OperAModel");
					EObject rootObject = operaFactory.create(eClass);
					return rootObject;
				}	    
	}