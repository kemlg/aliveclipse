package net.sf.ictalive.log.analysis_v2.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;

import net.sf.ictalive.log.analysis_v2.ReadEventLog;
import net.sf.ictalive.log.analysis_v2.plan.RoleTaskInfo;
import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.IS;
import net.sf.ictalive.operetta.OM.Landmark;
import net.sf.ictalive.operetta.OM.NS;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.Ontology;
import net.sf.ictalive.operetta.OM.OperAModel;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.operetta.OM.SS;
import net.sf.ictalive.operetta.OM.Scene;
import net.sf.ictalive.operetta.OM.SceneType;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.ISEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.part.OperAISDiagramEditorPlugin;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.SSEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.part.OperASSDiagramEditorPlugin;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

public class OperAFunctionsPage extends WizardPage {
	
	String selectedCombo = "Roles";
	List splitList = null, mergeList = null, hierarchyList = null;
	StyledText newSplitNametext, newMergeNameText, newLandmarkNametext;
	List objectiveRoleSplitList, objectiveRoleMergeList, landmarkObjectiveList, landmarksSWTList;
	Combo combo ;
	 
	private ReadEventLog loadEvent;
	private ArrayList<RoleTaskInfo> roleTaskList;
	 
	protected OMPackage operaPackage = OMPackage.eINSTANCE; 
	protected OMFactory operaFactory = operaPackage.getOMFactory();
	private Vector<Role> all_roles = new Vector<Role>();
	private Vector<Objective> all_objectives = new Vector<Objective>();
	private Vector<Landmark> landmarkList = new Vector<Landmark>();
	
	
	public OperAFunctionsPage() {
	    super("OperA Functions Page");
	    setDescription("Merge or split the roles, objectives or scenes");
	    setPageComplete(true);
	    loadEvent = new ReadEventLog(this.getShell());

	    roleTaskList = loadEvent.getRoleTaskInfoLIst();

	  }
	
	private IFile createOperaFile(IFile file){
		System.out.println("createOperaFile ...");
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("opera",// new OMFactoryImpl());
				new GMFResourceFactory());
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("*", new GMFResourceFactory()); 
		
		URI uri = URI.createFileURI(file.getLocation().toString());
		
		Resource resource = resourceSet.createResource(uri);
		
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
			
			// create roles
			for(int i=0; i<roleTaskList.size(); i++){
				RoleTaskInfo rti = roleTaskList.get(i);
				addRoleAndObjective(rti.role.getName(), rti.task.getName());
				
			}
			
			System.out.println("createOperaFile ... all_roles: " + all_roles.size());
			//create and add IS
			IS is = OMFactory.eINSTANCE.createIS();
			om.setIs(is);
			
			//create start and end scenes
			Scene start = OMFactory.eINSTANCE.createScene();
			start.setType(SceneType.START);
			start.setSceneID("start");
			start.setDescription("Default start scene of an interaction structure");
			
			Scene end = OMFactory.eINSTANCE.createScene();
			end.setType(SceneType.END);
			end.setSceneID("end");
			end.setDescription("Default end scene of an interaction structure");
			
			is.getScenes().add(start);;
			is.getScenes().add(end);	
			
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
            
            try{
				// Save the contents of the resource to the file system.
				//
				Map<Object, Object> options = new HashMap<Object, Object>();
				options.put( XMLResource.OPTION_ENCODING, "UTF-8" ); //$NON-NLS-1$
				resource.save(options);
				
			}catch(Exception e){e.printStackTrace();}
		}
		return file;
	}

	
	
	public void createControl(Composite parent) {
		// create roles
		for(int i=0; i<roleTaskList.size(); i++){
			RoleTaskInfo rti = roleTaskList.get(i);
			addRoleAndObjective(rti.role.getName(), rti.task.getName());
		}
		  
		  Composite composite =  new Composite(parent, SWT.NULL);
		  FillLayout fl = new FillLayout();
		  fl.type = SWT.HORIZONTAL;//.VERTICAL;

		  GridLayout gridLayout = new GridLayout();
		  gridLayout.numColumns = 1;
		  composite.setLayout(gridLayout);
		  
		  final Composite LHScombo = new Composite(composite, SWT.NONE);
		 // GridLayout gridLayout = new GridLayout();
		 // gridLayout.numColumns = 1;
		  LHScombo.setLayout(gridLayout);//new FillLayout(SWT.VERTICAL));

		  Label label = new Label(LHScombo, SWT.CENTER);
		  label.setText("Select one of the items to manupliate:");

		  combo = new Combo(LHScombo, SWT.NULL);
		  String[] choices = new String[]{"Roles", "Objectives", "Landmarks"/*, "Scenes"*/};
		  for(int i=0; i<choices.length; i++)
			  combo.add(choices[i]);
		  combo.select(0);
		  
		    
	    // Create the containing tab folder
	    final TabFolder tabFolder = new TabFolder(composite, SWT.NONE);
	 //   tabFolder.setSize(400, 800);
	    // Create each tab and set its text, tool tip text,
	    // image, and control
	    final TabItem one = new TabItem(tabFolder, SWT.NONE | SWT.V_SCROLL | SWT.H_SCROLL);
	    one.setText("Split");
	    one.setToolTipText("Split into two or more");
	    one.setControl(getTabOneControl(tabFolder, combo.getItem(combo.getSelectionIndex())));

	    final TabItem two = new TabItem(tabFolder, SWT.NONE);
	    two.setText("Merge");
	    two.setToolTipText("Merge two or into one");
	    two.setControl(getTabTwoControl(tabFolder, combo.getItem(combo.getSelectionIndex())));

	    final TabItem three = new TabItem(tabFolder, SWT.NONE);
	    three.setText("Create Landmarks");
	    three.setToolTipText("Create Landmarks with Objectives");
	    three.setControl(getTabThreeControl(tabFolder, combo.getItem(combo.getSelectionIndex())));
	    
	    // Select the third tab (index is zero-based)
	    tabFolder.setSelection(0);

	    // Add an event listener to write the selected tab to stdout
	    tabFolder.addSelectionListener(new SelectionAdapter() {
	      public void widgetSelected(org.eclipse.swt.events.SelectionEvent event) {
	        System.out.println(tabFolder.getSelection()[0].getText() + " selected");
	        if(tabFolder.getSelectionIndex() == 2) 
	        	combo.select(2);
	      }
	    });

	    combo.addSelectionListener(new SelectionListener() {
	        public void widgetSelected(SelectionEvent e) {
	          System.out.println("Selected item: " + combo.getItem(combo.getSelectionIndex()) + ", text content in the text field: " + combo.getText());
	          selectedCombo = combo.getItem(combo.getSelectionIndex());;
	          if(combo.getSelectionIndex() == 2)
	        	  tabFolder.setSelection(2);
	          else tabFolder.setSelection(0);
	          // check which tab is active/focused
	          if( tabFolder.getSelectionIndex() == 0)
	        	  one.setControl(getTabOneControl(tabFolder, combo.getItem(combo.getSelectionIndex())));
	          else if( tabFolder.getSelectionIndex() == 1) 
	        	  two.setControl(getTabTwoControl(tabFolder, combo.getItem(combo.getSelectionIndex())));
	          else if( tabFolder.getSelectionIndex() == 2)
	        	  tabFolder.setSelection(2);
	        }

	        public void widgetDefaultSelected(SelectionEvent e) {
	          System.out.println("Default selected index: " + combo.getSelectionIndex() + ", selected item: " + (combo.getSelectionIndex() == -1 ? "<null>" : combo.getItem(combo.getSelectionIndex())) + ", text content in the text field: " + combo.getText());
	          String text = combo.getText();
	          if(combo.indexOf(text) < 0) { // Not in the list yet. 
	            combo.add(text);
	            // Re-sort
	            String[] items = combo.getItems();
	            Arrays.sort(items);
	            combo.setItems(items);
	          }
	        }
	      });

		    setControl(composite);
	  }
	  
	  private void updateSplitList(String seletedCombo){
		  if(selectedCombo.equals("Roles")){
        	  splitList.removeAll();
        	  for(int i=0; i<all_roles.size(); i++){
        		  splitList.add(all_roles.get(i).getName());
        	  }
        		  
        	  
          }else if(selectedCombo.equals("Objectives")){
        	  splitList.removeAll();
        	  for(int i=0; i<all_objectives.size(); i++)
        		  splitList.add(all_objectives.get(i).getName());
        	  
          }/*else if (selectedCombo.equals("Scenes")){
        	  splitList.removeAll();
        	  for(int i=0; i<sceneList.size(); i++)
        		  splitList.add(sceneList.get(i));
          }*/
	  }
	  private void updateMergeList(String seletedCombo){
		  if(selectedCombo.equals("Roles")){
        	  mergeList.removeAll();
        	  for(int i=0; i<all_roles.size(); i++){
        		  mergeList.add(all_roles.get(i).getName());
        	  }
          }else if(selectedCombo.equals("Objectives")){
        	  mergeList.removeAll();
        	  for(int i=0; i<all_objectives.size(); i++)
        		  mergeList.add(all_objectives.get(i).getName());
        	  
          }/*else if (selectedCombo.equals("Scenes")){
        	  mergeList.removeAll();
        	  for(int i=0; i<sceneList.size(); i++)
        		  mergeList.add(sceneList.get(i));
          }*/
	  }	  
	  /**
	   * Split one into two or more
	   * 
	   * @param tabFolder the parent tab folder
	   * @return Control
	   */
	  private Control getTabOneControl(TabFolder tabFolder, String selectedCombo) {
	   
	    final Composite composite = new Composite(tabFolder, SWT.NONE);
	    /*    GridLayout gridLayout = new GridLayout();
	    gridLayout.numColumns = 1;
	    composite.setLayout(gridLayout);//new FillLayout(SWT.VERTICAL)); */
		  GridLayout gridLayout = new GridLayout(3, false);
		  composite.setLayout(gridLayout);
		    
		  Composite left = new Composite(composite, SWT.NULL);
		   // left.setLayout(new GridLayout());
		  left.setLayout(new FillLayout());
		  left.setLayoutData(new GridData(GridData.FILL_BOTH));

		
	    splitList = new List(left, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL | SWT.H_SCROLL);
	//    splitList.setBounds(40, 20, 220, 100);
	    for (int loopIndex = 0; loopIndex < all_roles.size(); loopIndex++) {
	    	//RoleTaskInfo rti = roleTaskList.get(loopIndex);
	    	Role r = all_roles.get(loopIndex);
	    	splitList.add(r.getName());
	    }
	    splitList.setSelection(0);
	    Composite middle = new Composite(composite, SWT.NULL);
	    middle.setLayout(new FillLayout(SWT.VERTICAL));
		  
		if(selectedCombo.equals("Roles")){
		//	Label label = new Label(middle, SWT.CENTER);
		 //   label.setText("The list of objectvies:");
		    
			objectiveRoleSplitList = new List(middle, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL | SWT.H_SCROLL);
			objectiveRoleSplitList.setBounds(40, 20, 220, 100);
			
			// check which role is selected, and display that role's objectives
			String[] str = splitList.getSelection();
			Role tempR = null;
		    for (int loopIndex = 0; loopIndex < all_roles.size(); loopIndex++) {
		    	Role r = all_roles.get(loopIndex);
		    	if(str[0].equals(r.getName())){
		    		tempR = r;
		    		break;
		    	}
		    }
		    System.out.println("Selected role: " + tempR.getName() + ", objective: " + tempR.getObjectives().size());
		    if(tempR != null){
		    	EList<Objective>  listObj = tempR.getObjectives();
		    	Iterator<Objective> itr = listObj.iterator();
		    	while(itr.hasNext()){
		    		Objective obj = (Objective) itr.next();
		    		objectiveRoleSplitList.add("Objective : " + obj.getName());
		    	}
		    }
	    	

		}
		updateSplitList(selectedCombo);
	    
			
	    Composite right = new Composite(composite, SWT.NULL);
	    right.setLayout(new GridLayout(1, true));
	    right.setLayoutData(new GridData(GridData.FILL_BOTH));
	    
	    Label label = new Label(right, SWT.CENTER);
	    label.setText("Enter the new names of " + selectedCombo + " with space to separate items:");
	    
	    newSplitNametext = new StyledText(right, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
	    GridData gd = new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
		 gd.horizontalSpan = 2;
		 gd.verticalSpan = 15;
		 newSplitNametext.setLayoutData(gd);
	  //  newNametext.setLayoutData(new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL));
	   // newNametext.setText("                                   ");
	//    newNametext.setBounds(60, 130, 160, 25);
	    
		 splitList.addSelectionListener(new SelectionListener() {
	        public void widgetSelected(SelectionEvent event) {
	          int selectedItem = splitList.getSelectionIndex();//.getSelectionIndices();
	          String[] selections = splitList.getSelection();
	          // updated objectiveRoleList when the splitList of Role is selected
	          updateObjectiveRoleList(selectedItem, selections, objectiveRoleSplitList );
//	          
	          
	        }

	        public void widgetDefaultSelected(SelectionEvent event) {
	          int[] selectedItems = splitList.getSelectionIndices();
	          String outString = "";
	          for (int loopIndex = 0; loopIndex < selectedItems.length; loopIndex++)
	            outString += selectedItems[loopIndex] + " ";
	          System.out.println("Selected Items: " + outString);
	        }
	      });
	    
	    
	     final Button clearBtn = new Button(right, SWT.PUSH);
	     clearBtn.setText("Clear names");
	     final Button okSplitBtn = new Button(right, SWT.PUSH);
	     okSplitBtn.setText("Confirm names");
	     
	     Listener btnListener = new Listener() {
	         public void handleEvent(Event event) {
	           if (event.widget == okSplitBtn) {
	             System.out.println("OK BUTTON IS pressed (split list) " + newSplitNametext.getText());
	             StringTokenizer st = new StringTokenizer(newSplitNametext.getText());
	             Vector<String> temp = new Vector<String>();
	             while (st.hasMoreTokens()) {
	            	 String str = st.nextToken();
	            	 // check if Roles, Objectives or scenes combo is selected
	            	 temp.add(str);
	             }
	             addNewSplitItems(temp);
	           } else if (event.widget == clearBtn) {
	        	   newSplitNametext.setText("");
	           }
	          
	         }
	       };
	       okSplitBtn.addListener(SWT.Selection, btnListener);
	       clearBtn.addListener(SWT.Selection, btnListener);   
	     
	    return composite;
	  }
	  
	  private void updateObjectiveRoleList(int selectedItem, String[] selections, List objectiveRoleList){
		  if(!selectedCombo.equals("Roles")) return;
		  if (selectedItem < 0) return;
		  objectiveRoleList.removeAll();
		  String roleStr = selections[0];
		  Role role = null;
		  for(int i=0; i< all_roles.size(); i++){
			  Role r = all_roles.get(i);
			  if(r.getName().equals(roleStr)){
				  role = r;
				  break;
			  }
		  }
//		  System.out.println(" sElected role: " + role.getName() + ", objective: " + role.getAllObjectives().size());
		  if(role != null){
			  EList<Objective> list = role.getObjectives();
			  Iterator<Objective> itr = list.iterator();
			  while(itr.hasNext()){
				  Objective o = itr.next();
				  objectiveRoleList.add("Objective : " + o.getName());
			  }
		  }
/*		  for(int i=0; i< roleTaskList.size(); i++){
			  RoleTaskInfo rti = roleTaskList.get(i);
			  if(rti.role.getName().equals(roleStr)){
				  objectiveRoleList.add( rti.task.getName());
			  }
		  }*/
	  }
	  
	// add the newly merged items from Merge Tab into Role/Objectives/Scene lists
	  private void addNewMergedItems(Vector<String> temp){
		  String[] selections = mergeList.getSelection();
		  if(selections.length == 0) return;
		  
		  if(selectedCombo.equals("Roles")){
			  Vector<Role> selected_roles = new Vector<Role>();
			  for(int i=0; i<selections.length; i++){
				  for(int j=0; j<all_roles.size(); j++){
					  Role r = all_roles.get(j);
					  if(r.getName().equals(selections[i])){
						  selected_roles.add(r);
					  }
				  }
			  }
			  
			  for(int i=0; i<temp.size(); i++){
				  // TODO: create a new role with the same objectives of the original role
				  Role new_role = OMFactory.eINSTANCE.createRole();
				  new_role.setName(temp.get(i));
				  for(int j=0; j<selected_roles.size(); j++){
					  Role sele_role = selected_roles.get(j);
					  EList<Objective> objectives = sele_role.getObjectives();
					  new_role.getObjectives().addAll(objectives);
					  all_roles.remove(sele_role);
				  }
				  System.out.println("** NEW Merged Role: " + new_role.getName() + ", size: " + new_role.getObjectives().size());
				  all_roles.add(new_role);
			  }
			 
			  // refresh the mergeList of roles
			 mergeList.removeAll();
			 splitList.removeAll();
			 // TODO: update the mergeList
			 for(int i=0; i<all_roles.size(); i++){
				 mergeList.add(all_roles.get(i).getName());
				 splitList.add(all_roles.get(i).getName());
			 }

		  }else if (selectedCombo.equals("Objectives")){
			  // get the selected objectives
			  Vector<Objective> selected_objectives = new Vector<Objective>();
			  Vector<Role> affected_roles = new Vector<Role>();
			  
			  for(int i=0; i<selections.length; i++){
				  for(int j=0; j<all_objectives.size(); j++){
					  Objective o = all_objectives.get(j);
					  if(o.getName().equals(selections[i])){
						  selected_objectives.add(o);
		//				  EList<Role> roleList = o.getUsedByRole(); // java.lang.NullPointerException
		//				  affected_roles.addAll(roleList);
					  }
				  }
			  }
			  for(int i=0; i< all_roles.size(); i++){
				  Role r = all_roles.get(i);
				  EList<Objective> objs = r.getObjectives();
				  Iterator<Objective> itr = objs.iterator();
				  while(itr.hasNext()){
					  Objective o = itr.next();
					  if(selected_objectives.contains(o)){
						  affected_roles.add(r);
						  
					  }
				  }
			  }
			  for(int i=0; i<temp.size(); i++){
				  // TODO: create a new role with the same objectives of the original role
				  Objective new_objective = OMFactory.eINSTANCE.createObjective();
				  new_objective.setName(temp.get(i));
				  all_objectives.add(new_objective);
				  for ( int j=0; j<affected_roles.size(); j++){
					  affected_roles.get(j).getObjectives().add(new_objective);
					  System.out.println("Merge Objective, affected role: " + affected_roles.get(j).getName() + 
							  ", objective size: " + affected_roles.get(j).getObjectives().size());
					  for(int k=0; k< selected_objectives.size(); k++){
						  Objective s = selected_objectives.get(k);
						  affected_roles.get(j).getObjectives().remove(s);
						  all_objectives.remove(s);
					  }
					  System.out.println("New objective size: " + affected_roles.get(j).getObjectives().size());
				  }
			  }
			  // refresh the splitList of Objectives
			  mergeList.removeAll();
			  splitList.removeAll();
			 for(int i=0; i<all_objectives.size(); i++){
				 mergeList.add(all_objectives.get(i).getName());
				 splitList.add(all_objectives.get(i).getName());
			 }
			 // TODO:
/*			 for(int i=0; i<selections.length; i++){
				 objectiveList.remove(selections[i]);
				 mergeList.remove(selections[i]);
	 	 	 }*/
		 
		  }/*else if (selectedCombo.equals("Scenes")){
			  for(int i=0; i<temp.size(); i++)
				  sceneList.add(temp.get(i));
			 
			  
			  // refresh the splitList of Objectives
			  mergeList.removeAll();
			 for(int i=0; i<sceneList.size(); i++){
				 mergeList.add(sceneList.get(i));
			 }
			 for(int i=0; i<selections.length; i++){
				 sceneList.remove(selections[i]);
				 mergeList.remove(selections[i]);
			 }
		  }*/
		  // clear the text area
		  newMergeNameText.setText("");
	  }

	  
	  // add the newly added items from split into Role/Objectives/Scene lists
	  private void addNewSplitItems(Vector<String> temp){
		  String[] selections = splitList.getSelection();
		  if(selections.length == 0) return; // return if nothing is selected
		  
		  if(selectedCombo.equals("Roles")){
			  // find which role is selected
			  Role role = null;			 
			  for(int i=0; i<all_roles.size(); i++){
				  String r = all_roles.get(i).getName();
				  for(int j=0; j<selections.length; j++){
					  if(selections[j].equals(r)){
						  role = all_roles.get(i); break;						  
					  }
				  }
			  }
			  System.out.println(" 3 selected role is " + role.getName());
			  for(int i=0; i<temp.size(); i++){
				//  roleList.add(temp.get(i));
				  // TODO: create new roles with the same objectives of the orignal role
				  Role newRole = OMFactory.eINSTANCE.createRole();
				  newRole.setName(temp.get(i));
				  EList<Objective> objs = role.getObjectives();
				  Iterator<Objective> itr = objs.iterator();
				  while ( itr.hasNext()){
					  Objective o = itr.next();
					  newRole.getObjectives().add(o);
				  }
				  all_roles.add(newRole);
				  System.out.println(" NNew role is " + newRole.getName() + ", objective: " + newRole.getObjectives().size());
			  }
			  all_roles.remove(role);
			 
			  // refresh the splitList of roles
			 splitList.removeAll();
			 mergeList.removeAll();
			 // TODO: update the splitList after a role is being split
			 for(int i=0; i<all_roles.size(); i++){
				 splitList.add(all_roles.get(i).getName());
				 mergeList.add(all_roles.get(i).getName());
			 }
//			 for(int i=0; i<selections.length; i++)
//				 splitList.remove(selections[i]);
			 // clear the text area
			 newSplitNametext.setText("");

		  }else if (selectedCombo.equals("Objectives")){
			  // 1. check which objective is selected
			  Objective objective = null;
			  for(int i = 0; i < all_objectives.size(); i++){
				  Objective e = all_objectives.get(i);
				  for(int j=0; j<selections.length; j++){
					  if(e.getName().equals(selections[j])){
						  objective = e; 
						  all_objectives.remove(i); break;
					  }
				  }
			  }
			  System.out.println("selected objective to be split: " + objective.getName());
			  
			  Vector<Objective> newObjectives = new Vector<Objective>();
			  for(int i=0; i<temp.size(); i++){
				  System.out.println("Entered new split objective: " + temp.get(i));
				  Objective newObj = OMFactory.eINSTANCE.createObjective();
					newObj.setName(temp.get(i));
					newObjectives.add(newObj);
					all_objectives.add(newObj);
/*					EList<Role> usedByRoles = objective.getUsedByRole();
					System.out.println(" new objective's usedByRoel: " + usedByRoles.size());
					Iterator<Role> itr = usedByRoles.iterator();
					while(itr.hasNext()){
						Role r = itr.next();
						r.getObjectives().add(newObj);
						System.out.println("New OBJEctive: " + newObj.getName() + ", usedBy Role: " + newObj.getUsedByRole().size());
					}*/
					
			  }
			// update the roles' objectives
				for(int j=0; j<all_roles.size(); j++){
					EList<Objective> objs = all_roles.get(j).getObjectives();
					if(objs.contains(objective)){
						System.out.println("Split Objective: role " + all_roles.get(j).getName() +
								" contain objective " + objective.getName() + ", size: " + all_roles.get(j).getObjectives().size());
						all_roles.get(j).getObjectives().remove(objective);
						for(int k=0; k<newObjectives.size(); k++){
							all_roles.get(j).getObjectives().add(newObjectives.get(k));
							System.out.println("Split Objective: role " + all_roles.get(j).getName() +
									" add new objective " + newObjectives.get(k).getName() +
									", size: " + all_roles.get(j).getObjectives().size());
						}
					}
				}
			  // refresh the splitList of Objectives
			 splitList.removeAll();
			 mergeList.removeAll();
		//	 all_objectives.remove(objective); // 
			 for(int i=0; i<all_objectives.size(); i++){
				 splitList.add(all_objectives.get(i).getName());
				 mergeList.add(all_objectives.get(i).getName());
			 }
//			 for(int i=0; i<selections.length; i++)
//				 splitList.remove(selections[i]);
			 // clear the text area
			 newSplitNametext.setText("");
		  }/*else if (selectedCombo.equals("Scenes")){
			  for(int i=0; i<temp.size(); i++)
				  sceneList.add(temp.get(i));
			 
			  
			  // refresh the splitList of Objectives
			 splitList.removeAll();
			 for(int i=0; i<sceneList.size(); i++){
				 splitList.add(sceneList.get(i));
			 }
			 for(int i=0; i<selections.length; i++){
				 System.out.println("Selected scene: " + selections[i]);
				 splitList.remove(selections[i]);
			 }
			 // clear the text area
			 newSplitNametext.setText("");
		  }*/
	  }
	  /**
	   * Merge two or more into ONE
	   * 
	   * @param tabFolder the parent tab folder
	   * @return Control
	   */
	  private Control getTabTwoControl(TabFolder tabFolder, String selectedCombo) {
		  final Composite composite = new Composite(tabFolder, SWT.NONE);
			  GridLayout gridLayout = new GridLayout(3, false);
			  composite.setLayout(gridLayout);
			    
			  Composite left = new Composite(composite, SWT.NULL);
			  left.setLayout(new FillLayout());
			  left.setLayoutData(new GridData(GridData.FILL_BOTH));

			    
		    mergeList = new List(left, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		 //   mergeList.setBounds(40, 20, 220, 100);

		    for (int loopIndex = 0; loopIndex < all_roles.size(); loopIndex++) {
		    	Role r = all_roles.get(loopIndex);
		    	mergeList.add(r.getName());
		    }

		    int[] indices = {0,1};
		    mergeList.setSelection(indices);
		    Composite middle = new Composite(composite, SWT.NULL);
		    middle.setLayout(new FillLayout(SWT.VERTICAL));
			  
			if(selectedCombo.equals("Roles")){
			//	Label label = new Label(middle, SWT.CENTER);
			 //   label.setText("The list of objectvies:");
			    
				objectiveRoleMergeList = new List(middle, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL | SWT.H_SCROLL);
				objectiveRoleMergeList.setBounds(40, 20, 220, 100);
				
				// check which role is selected, and display that role's objectives
				String[] str = mergeList.getSelection();
				System.out.println("MergeList selection: " + str.length);
				Role tempR = null;
			    for (int loopIndex = 0; loopIndex < all_roles.size(); loopIndex++) {
			    	Role r = all_roles.get(loopIndex);
			    	for(int j=0; j<str.length; j++){
			    		if(str[j].equals(r.getName())){
			    			tempR = r; break;
			    		}
			    	}
			    }
			   // System.out.println("Selected role in merged list: " + tempR.getName());
			    if(tempR != null){
			    	EList<Objective>  listObj = tempR.getObjectives();
			    	Iterator<Objective> itr = listObj.iterator();
			    	while(itr.hasNext()){
			    		Objective obj = (Objective) itr.next();
			    		objectiveRoleMergeList.add("Objective : " + obj.getName());
			    	}
			    }else{
			    	objectiveRoleMergeList.add("No Objective");
			    }
			}
			updateMergeList(selectedCombo);
		    
				
		    Composite right = new Composite(composite, SWT.NULL);
		    right.setLayout(new GridLayout(1, true));
		    right.setLayoutData(new GridData(GridData.FILL_BOTH));
		    
		    Label label = new Label(right, SWT.CENTER);
		    label.setText("Enter the new names of " + selectedCombo + " with space to separate items:");
		    
		    newMergeNameText = new StyledText(right, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		    GridData gd = new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
			 gd.horizontalSpan = 2;
			 gd.verticalSpan = 15;
			 newMergeNameText.setLayoutData(gd);
		    
			 mergeList.addSelectionListener(new SelectionListener() {
		        public void widgetSelected(SelectionEvent event) {
		          int selectedItem = mergeList.getSelectionIndex();//.getSelectionIndices();
		          // updated objectiveRoleList when the mergeList of Role is selected
		          updateObjectiveRoleList(selectedItem, mergeList.getSelection(), objectiveRoleMergeList);
		        }

		        public void widgetDefaultSelected(SelectionEvent event) {
		          int[] selectedItems = mergeList.getSelectionIndices();
		          String outString = "";
		          for (int loopIndex = 0; loopIndex < selectedItems.length; loopIndex++)
		            outString += selectedItems[loopIndex] + " ";
		          System.out.println("Selected Items: " + outString);
		        }
		      });
		    
		    
		     final Button clearBtn = new Button(right, SWT.PUSH);
		     clearBtn.setText("Clear names");
		     final Button okSplitBtn = new Button(right, SWT.PUSH);
		     okSplitBtn.setText("Confirm names");
		     
		     Listener btnListener = new Listener() {
		         public void handleEvent(Event event) {
		           if (event.widget == okSplitBtn) {
		             System.out.println("OK BUTTON IS pressed (merge) " + newMergeNameText.getText());
		             StringTokenizer st = new StringTokenizer(newMergeNameText.getText());
		             Vector<String> temp = new Vector<String>();
		             while (st.hasMoreTokens()) {
		            	 String str = st.nextToken();
		            	 // check if Roles, Objectives or scenes combo is selected
		            	 temp.add(str);
		             }
		             addNewMergedItems(temp);
		           } else if (event.widget == clearBtn) {
		        	   newMergeNameText.setText("");
		           }
		          
		         }
		       };
		       okSplitBtn.addListener(SWT.Selection, btnListener);
		       clearBtn.addListener(SWT.Selection, btnListener);  
	    return composite;
	  }

	  private void addRoleAndObjective(String r, String t){
		  Objective objective = null;
		  Role role = null;
		  // check if a role is already existing, otherwise create a new role
		  for(int i=0; i<all_roles.size(); i++){
				 String name = all_roles.get(i).getName();
				 if(name.equals(r)){ 		 
					 role = all_roles.get(i);
					 break;
				 }
		  }
		  if(role == null){
			  role = OMFactory.eINSTANCE.createRole();
			  role.setName(r);
			  all_roles.add(role);
		  }
		  // check if an objective already exists
		  for(int i=0; i<all_objectives.size(); i++){
				 String name = all_objectives.get(i).getName();
				 if(name.equals(t)){ 		 
					 objective = all_objectives.get(i);
					 break;
				 }
		  }
		  if(objective == null){
			  objective = OMFactory.eINSTANCE.createObjective();
				objective.setName(t);
				all_objectives.add(objective);
				// add a new objective to the SS
		//		ss.getObjectives().add(objective);
				
		  }
		  role.getObjectives().add(objective);
		  
		  // if a role already exits then add a new objective to it.
	  }
		 protected EObject createInitialModel() {	 
				EClass eClass = (EClass)operaPackage.getEClassifier("OperAModel");
				EObject rootObject = operaFactory.create(eClass);
				return rootObject;
		}	
		 
		public Vector<Role> getAll_Roles(){ return all_roles;}
		public Vector<Objective> getAll_Objectives(){ return all_objectives;}
		public Vector<Landmark> getLandmarkList(){ return landmarkList;}
		
		
		
		
		  /**
		   * Merge two or more into ONE
		   * 
		   * @param tabFolder the parent tab folder
		   * @return Control
		   */
		  private Control getTabThreeControl(TabFolder tabFolder, String selectedCombo) {
			  final Composite composite = new Composite(tabFolder, SWT.NONE);
				  GridLayout gridLayout = new GridLayout(3, false);
				  composite.setLayout(gridLayout);
				    
				  Composite left = new Composite(composite, SWT.NULL);
				  left.setLayout(new FillLayout());
				  left.setLayoutData(new GridData(GridData.FILL_BOTH));
				  // LHS is the objective list
				  landmarkObjectiveList = new List(left, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
			//	  landmarkObjectiveList.setBounds(40, 20, 220, 100);
				    for (int loopIndex = 0; loopIndex < all_objectives.size(); loopIndex++) {
				    	landmarkObjectiveList.add(all_objectives.get(loopIndex).getName());
				    }

				    
				  // middle is the landmarks list (show the landmark when an Objective is chosen)
				    Composite middle = new Composite(composite, SWT.NULL);
				    middle.setLayout(new FillLayout(SWT.VERTICAL));
				    middle.setLayoutData(new GridData(GridData.FILL_BOTH));
				    landmarksSWTList = new List(middle, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
			//	    landmarksSWTList.setBounds(40, 20, 220, 100);
				    if(landmarkList.size() == 0)
				    	landmarksSWTList.add("No Landmark");
				    for (int loopIndex = 0; loopIndex < landmarkList.size(); loopIndex++) {
				    	landmarksSWTList.add("Landmark : " + landmarkList.get(loopIndex).getName());
				    }
				    
				    
				    Composite right = new Composite(composite, SWT.NULL);
				    right.setLayout(new GridLayout(1, true));
				    right.setLayoutData(new GridData(GridData.FILL_BOTH));
				    
				    Label label = new Label(right, SWT.CENTER);
				    label.setText("Enter the new name landmark:");
				    
				    newLandmarkNametext = new StyledText(right, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
				    GridData gd = new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
					gd.horizontalSpan = 2;
					gd.verticalSpan = 15;
					newLandmarkNametext.setLayoutData(gd);
				    
					landmarkObjectiveList.addSelectionListener(new SelectionListener() {
				        public void widgetSelected(SelectionEvent event) {
				          String[] selectedItems = landmarkObjectiveList.getSelection();
				          updateLandmarkObjectiveList(selectedItems);
				        }

				        public void widgetDefaultSelected(SelectionEvent event) {
				          int[] selectedItems = landmarkObjectiveList.getSelectionIndices();
				          String outString = "";
				          for (int loopIndex = 0; loopIndex < selectedItems.length; loopIndex++)
				            outString += selectedItems[loopIndex] + " ";
				          System.out.println("Selected Items: " + outString);
				        }
				      });
				    
				    
				     final Button clearBtn = new Button(right, SWT.PUSH);
				     clearBtn.setText("Clear names");
				     final Button okLandmarkBtn = new Button(right, SWT.PUSH);
				     okLandmarkBtn.setText("Confirm Landmark Name");
				     
				     Listener btnListener = new Listener() {
				         public void handleEvent(Event event) {
				           if (event.widget == okLandmarkBtn) {
				             System.out.println("OK BUTTON IS pressed (new landmark) " + newLandmarkNametext.getText());
	/*			             StringTokenizer st = new StringTokenizer(newLandmarkNametext.getText());
				             Vector<String> temp = new Vector<String>();
				             while (st.hasMoreTokens()) {
				            	 String str = st.nextToken();
				            	 // check if Roles, Objectives or scenes combo is selected
				            	 temp.add(str);
				             }*/
				             addNewLandmarkItems(newLandmarkNametext.getText());
				             newLandmarkNametext.setText("");
				           } else if (event.widget == clearBtn) {
				        	   newLandmarkNametext.setText("");
				           }
				          
				         }
				       };
				       okLandmarkBtn.addListener(SWT.Selection, btnListener);
				       clearBtn.addListener(SWT.Selection, btnListener);  			    
				    
				  return composite;
		  }
		  
		  private void updateLandmarkObjectiveList(String[] objectivesSelected){
			  // if only one objective is selected, display its landmark
			  if(objectivesSelected.length == 1){
//				  System.out.println("SElected Objective in landmark " + objectivesSelected[0]);
				  landmarksSWTList.removeAll();
				  for(int i=0; i<landmarkList.size(); i++){
					  Landmark lm = landmarkList.get(i);
					  EList<Objective> objList = lm.getEntails();
					  for(Iterator<Objective> itr = objList.iterator(); itr.hasNext();){
						  Objective o = itr.next();
						  if(o.getName().equals(objectivesSelected[0])){
							  landmarksSWTList.add("Landmark : " + lm.getName());
						  }
					  }
				  }
			  }else{ // more than one objective is selected, display the common landmarks
				  Vector<Landmark> vLM = new Vector<Landmark>();
				  int count = 0;
				  for(int j=0; j<landmarkList.size(); j++){
					  Landmark lm = landmarkList.get(j);
					  EList<Objective> objList = lm.getEntails();
					  
					  for(Iterator<Objective> itr = objList.iterator(); itr.hasNext();){
						  Objective o = itr.next();

						  for(int i=0; i<objectivesSelected.length; i++){
							  if(o.getName().equals(objectivesSelected[i])){
								 count ++;
							  }
						  }
					  }
					  if(count == objectivesSelected.length)
						 vLM.add(lm);
						  
					  count = 0;
					  
				  }
				  landmarksSWTList.removeAll();
				  for(int i=0; i<vLM.size(); i++){
					  landmarksSWTList.add("Landmark : " + vLM.get(i).getName());
				  }
				  
			  }
		  }
		
		  
		  private void addNewLandmarkItems(String item){
			  // create a new landmark
			  Landmark landmark1 = OMFactory.eINSTANCE.createLandmark();
			  landmark1.setName(item);		  

			  // get the selected objectives
			  String[] selectedObjs = landmarkObjectiveList.getSelection();
			  //Vector<Objective> objectives = new Vector<Objective>();
			  for(int i=0; i<all_objectives.size(); i++){
				  Objective o = all_objectives.get(i);
				  for(int j=0; j<selectedObjs.length; j++){
					  if(selectedObjs[j].equals(o.getName())){
						  landmark1.getEntails().add(o);
			//			  System.out.println("New landmark with objective " + item + ", objective " + o.getName());
					  }
				  }
			  }
			  landmarksSWTList.add("Landmark : " + landmark1.getName());
			  landmarkList.add(landmark1);
		  }
		  
		  public boolean performFinish() {
			//  MessageDialog.openInformation(this.getShell(), "OperAFuncationsPage", "performFinish");
				return true;
			}
}
