package net.sf.ictalive.log.analysis_v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

import net.sf.ictalive.operetta.OM.Landmark;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.Objective;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

public class OperATest {

	Vector<String> roleList = new Vector<String>();
	Vector<Objective> objectiveList = new Vector<Objective>();
	Vector<String> sceneList = new Vector<String>();
	Vector<Landmark> landmarkList = new Vector<Landmark>();
	
	String selectedCombo = "Roles";
	 List splitList = null, mergeList = null, hierarchyList = null;
	 StyledText newNametext, newLandmarkNametext;
	 List objectiveRoleList, landmarkObjectiveList, landmarksSWTList;
	 Combo combo ;
	 
	public static void main(String[] args) {
		
	    new OperATest().run();
	  }
	
	/**
	   * Runs the application
	   */
	  public void run() {
		  
		  roleList.add("Manager");
		  roleList.add("Director");
		  roleList.add("clerk");
		  roleList.add("Accountant");
		  roleList.add("Programmer");
		  Objective new_objective = OMFactory.eINSTANCE.createObjective();
		  new_objective.setName("Manage_people");		  
		  objectiveList.add(new_objective);
		  Objective new_objective2 = OMFactory.eINSTANCE.createObjective();
		  new_objective2.setName("Make_decision");		  
		  objectiveList.add(new_objective2);
		  Objective new_objective3 = OMFactory.eINSTANCE.createObjective();
		  new_objective3.setName("programming");		  
		  objectiveList.add(new_objective3);
		  Objective new_objective4 = OMFactory.eINSTANCE.createObjective();
		  new_objective4.setName("Check_documents");		  
		  objectiveList.add(new_objective4);
		  
		  sceneList.add("Start Scene");
		  sceneList.add("End Scene");
	//	  landmarkList.add("landmark ONe" );
	//	  landmarkList.add("landmark TWo" );
		  Landmark landmark1 = OMFactory.eINSTANCE.createLandmark();
		  landmark1.setName("Test One");
		  landmark1.getEntails().add(new_objective3);
		  landmark1.getEntails().add(new_objective2);
		  landmarkList.add(landmark1);
		  Landmark landmark2 = OMFactory.eINSTANCE.createLandmark();
		  landmark2.setName("TestTwo");
		  landmark2.getEntails().add(new_objective3);
		  landmark2.getEntails().add(new_objective2);
		  landmarkList.add(landmark2);
		  
	    Display display = new Display();
	    Shell shell = new Shell(display);
	    RowLayout rowLayout = new RowLayout();
	    rowLayout.pack = true;
	    shell.setLayout(rowLayout);//new FillLayout(SWT.VERTICAL));
	    shell.setText("Organise Organisation Model");
	    //shell.setSize(300, 200);
	    createContents(shell);
	    shell.open();
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch()) {
	        display.sleep();
	      }
	    }
	    display.dispose();
	  }
	  
	  /**
	   * Creates the contents
	   * 
	   * @param shell the parent shell
	   */
	  private void createContents(Shell shell) {
		  
		  final Composite LHScombo = new Composite(shell, SWT.NONE);
		  GridLayout gridLayout = new GridLayout();
		  gridLayout.numColumns = 1;
		  LHScombo.setLayout(gridLayout);//new FillLayout(SWT.VERTICAL));

		  Label label = new Label(LHScombo, SWT.CENTER);
		  label.setText("Select one of items to manupliate:");

		  combo = new Combo(LHScombo, SWT.NULL);
		  String[] choices = new String[]{"Roles", "Objectives", "Landmarks"};
		  for(int i=0; i<choices.length; i++)
			  combo.add(choices[i]);
		  combo.select(0);
		    
	    // Create the containing tab folder
	    final TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
	 //   tabFolder.setSize(400, 800);
	    // Create each tab and set its text, tool tip text,
	    // image, and control
	    final TabItem one = new TabItem(tabFolder, SWT.NONE | SWT.V_SCROLL | SWT.H_SCROLL);
	    one.setText("Split");
	    one.setToolTipText("Split into two or more");
	    one.setControl(getTabOneControl(tabFolder, combo.getItem(combo.getSelectionIndex()), roleList));

	    final TabItem two = new TabItem(tabFolder, SWT.NONE);
	    two.setText("Merge");
	    two.setToolTipText("Merge two or into one");
	    two.setControl(getTabTwoControl(tabFolder, combo.getItem(combo.getSelectionIndex()), objectiveList));

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
	        	  one.setControl(getTabOneControl(tabFolder, combo.getItem(combo.getSelectionIndex()), roleList));
	          else if( tabFolder.getSelectionIndex() == 1)
	        	  two.setControl(getTabTwoControl(tabFolder, combo.getItem(combo.getSelectionIndex()), objectiveList));
	          else if( tabFolder.getSelectionIndex() == 2){
	        	  tabFolder.setSelection(2);
	        	 
	          }
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
	//    shell.redraw();
	//    shell.pack();
	  }
	  
	  private void updateSplitList(String seletedCombo){
		  if(selectedCombo.equals("Roles")){
        	  splitList.removeAll();
        	  for(int i=0; i<roleList.size(); i++)
        		  splitList.add(roleList.get(i));
        	  
          }else if(selectedCombo.equals("Objectives")){
        	  splitList.removeAll();
        	  for(int i=0; i<objectiveList.size(); i++)
        		  splitList.add(objectiveList.get(i).getName());
        	  
          }else if (selectedCombo.equals("Scenes")){
        	  splitList.removeAll();
        	  for(int i=0; i<sceneList.size(); i++)
        		  splitList.add(sceneList.get(i));
          }
	  }
	  private void updateMergeList(String seletedCombo){
		  if(selectedCombo.equals("Roles")){
        	  mergeList.removeAll();
        	  for(int i=0; i<roleList.size(); i++)
        		  mergeList.add(roleList.get(i));
        	  
          }else if(selectedCombo.equals("Objectives")){
        	  mergeList.removeAll();
        	  for(int i=0; i<objectiveList.size(); i++)
        		  mergeList.add(objectiveList.get(i).getName());
        	  
          }else if (selectedCombo.equals("Scenes")){
        	  mergeList.removeAll();
        	  for(int i=0; i<sceneList.size(); i++)
        		  mergeList.add(sceneList.get(i));
          }
	  }	  
	  /**
	   * Split one into two or more
	   * 
	   * @param tabFolder the parent tab folder
	   * @return Control
	   */
	  private Control getTabOneControl(TabFolder tabFolder, String selectedCombo, Vector<String> roleList) {
	   
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

		    
	    splitList = new List(left, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
	    splitList.setBounds(40, 20, 220, 100);
	    for (int loopIndex = 0; loopIndex < roleList.size(); loopIndex++) {
	    	splitList.add(roleList.get(loopIndex));
	    }

	    Composite middle = new Composite(composite, SWT.NULL);
	    middle.setLayout(new FillLayout(SWT.VERTICAL));
		  
		if(selectedCombo.equals("Roles")){
		//	Label label = new Label(middle, SWT.CENTER);
		 //   label.setText("The list of objectvies:");
		    
			objectiveRoleList = new List(middle, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
			objectiveRoleList.setBounds(40, 20, 220, 100);
		    for (int loopIndex = 0; loopIndex < roleList.size(); loopIndex++) {
		    	objectiveRoleList.add("Objective : " + roleList.get(loopIndex));
		    }
		}
		updateSplitList(selectedCombo);
	    
			
	    Composite right = new Composite(composite, SWT.NULL);
	    right.setLayout(new GridLayout(1, true));
	    right.setLayoutData(new GridData(GridData.FILL_BOTH));
	    
	    Label label = new Label(right, SWT.CENTER);
	    label.setText("Enter the new names of " + selectedCombo + " with space to separate items:");
	    
	    newNametext = new StyledText(right, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
	    GridData gd = new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
		 gd.horizontalSpan = 2;
		 gd.verticalSpan = 15;
		 newNametext.setLayoutData(gd);
	  //  newNametext.setLayoutData(new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL));
	   // newNametext.setText("                                   ");
	//    newNametext.setBounds(60, 130, 160, 25);
	    
		 splitList.addSelectionListener(new SelectionListener() {
	        public void widgetSelected(SelectionEvent event) {
	          int selectedItem = splitList.getSelectionIndex();//.getSelectionIndices();
	          // updated objectiveRoleList when the splitList of Role is selected
	          updateObjectiveRoleList(selectedItem);
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
	             System.out.println("OK BUTTON IS pressed " + newNametext.getText());
	             StringTokenizer st = new StringTokenizer(newNametext.getText());
	             Vector<String> temp = new Vector<String>();
	             while (st.hasMoreTokens()) {
	            	 String str = st.nextToken();
	            	 // check if Roles, Objectives or scenes combo is selected
	            	 temp.add(str);
	             }
	             addNewSplitItems(temp);
	           } else if (event.widget == clearBtn) {
	        	   newNametext.setText("");
	           }
	          
	         }
	       };
	       okSplitBtn.addListener(SWT.Selection, btnListener);
	       clearBtn.addListener(SWT.Selection, btnListener);   
	     
	    return composite;
	  }
	  
	  private void updateObjectiveRoleList(int selectedItem){
		  if(!selectedCombo.equals("Roles")) return;
		  if (selectedItem < 0) return;
		  String roleStr = roleList.get(selectedItem);
		  objectiveRoleList.removeAll();
		  for(int i=0; i<roleList.size(); i++){
			  objectiveRoleList.add(roleStr +  " : " + roleList.get(i));
		  }
	  }
	  
	// add the newly merged items from Merge Tab into Role/Objectives/Scene lists
	  private void addNewMergedItems(Vector<String> temp){
		  
		  if(selectedCombo.equals("Roles")){
			  for(int i=0; i<temp.size(); i++)
				  roleList.add(temp.get(i));
			 String[] selections = mergeList.getSelection();
			  // refresh the splitList of roles
			 mergeList.removeAll();
			 for(int i=0; i<roleList.size(); i++)
				 mergeList.add(roleList.get(i));
			 
			 for(int i=0; i<selections.length; i++){
				 mergeList.remove(selections[i]);
				 roleList.remove(selections[i]);
			 }
		  }else if (selectedCombo.equals("Objectives")){
			  for(int i=0; i<temp.size(); i++){
				// TODO:  objectiveList.add(temp.get(i));
			  }
			  String[] selections = mergeList.getSelection();
			  // refresh the splitList of Objectives
			  mergeList.removeAll();
			 for(int i=0; i<objectiveList.size(); i++){
				 mergeList.add(objectiveList.get(i).getName());
			 }
			 for(int i=0; i<selections.length; i++){
				 objectiveList.remove(selections[i]);
				 mergeList.remove(selections[i]);
			 }
		  }else if (selectedCombo.equals("Scenes")){
			  for(int i=0; i<temp.size(); i++)
				  sceneList.add(temp.get(i));
			  String[] selections = mergeList.getSelection();
			  
			  // refresh the splitList of Objectives
			  mergeList.removeAll();
			 for(int i=0; i<sceneList.size(); i++){
				 mergeList.add(sceneList.get(i));
			 }
			 for(int i=0; i<selections.length; i++){
				 sceneList.remove(selections[i]);
				 mergeList.remove(selections[i]);
			 }
		  }
		  // clear the text area
		  newNametext.setText("");
	  }

	  
	  // add the newly added items from split into Role/Objectives/Scene lists
	  private void addNewSplitItems(Vector<String> temp){
		  if(selectedCombo.equals("Roles")){
			  for(int i=0; i<temp.size(); i++)
				  roleList.add(temp.get(i));
			 String[] selections = splitList.getSelection();
			  // refresh the splitList of roles
			 splitList.removeAll();
			 for(int i=0; i<roleList.size(); i++){
				 splitList.add(roleList.get(i));
			 }
			 for(int i=0; i<selections.length; i++)
				 splitList.remove(selections[i]);
			 // clear the text area
			 newNametext.setText("");
		  }else if (selectedCombo.equals("Objectives")){
			  for(int i=0; i<temp.size(); i++){
//TODO:				  objectiveList.add(temp.get(i));
			  }
			  String[] selections = splitList.getSelection();
			  // refresh the splitList of Objectives
			 splitList.removeAll();
			 for(int i=0; i<objectiveList.size(); i++){
				 splitList.add(objectiveList.get(i).getName());
			 }
			 for(int i=0; i<selections.length; i++)
				 splitList.remove(selections[i]);
			 // clear the text area
			 newNametext.setText("");
		  }else if (selectedCombo.equals("Scenes")){
			  for(int i=0; i<temp.size(); i++)
				  sceneList.add(temp.get(i));
			  String[] selections = splitList.getSelection();
			  
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
			 newNametext.setText("");
		  }
	  }
	  
	  /**
	   * Merge two or more into ONE
	   * 
	   * @param tabFolder the parent tab folder
	   * @return Control
	   */
	  private Control getTabTwoControl(TabFolder tabFolder, String selectedCombo, Vector<Objective> objectiveList) {
		  final Composite composite = new Composite(tabFolder, SWT.NONE);
			  GridLayout gridLayout = new GridLayout(3, false);
			  composite.setLayout(gridLayout);
			    
			  Composite left = new Composite(composite, SWT.NULL);
			  left.setLayout(new FillLayout());
			  left.setLayoutData(new GridData(GridData.FILL_BOTH));

			    
		    mergeList = new List(left, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		    mergeList.setBounds(40, 20, 220, 100);
		    for (int loopIndex = 0; loopIndex < roleList.size(); loopIndex++) {
		    	mergeList.add(roleList.get(loopIndex));
		    }

		    Composite middle = new Composite(composite, SWT.NULL);
		    middle.setLayout(new FillLayout(SWT.VERTICAL));
			  
			if(selectedCombo.equals("Roles")){
				objectiveRoleList = new List(middle, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
				objectiveRoleList.setBounds(40, 20, 220, 100);
			    for (int loopIndex = 0; loopIndex < roleList.size(); loopIndex++) {
			    	objectiveRoleList.add("Objective : " + roleList.get(loopIndex));
			    }
			}
			updateMergeList(selectedCombo);
		    
				
		    Composite right = new Composite(composite, SWT.NULL);
		    right.setLayout(new GridLayout(1, true));
		    right.setLayoutData(new GridData(GridData.FILL_BOTH));
		    
		    Label label = new Label(right, SWT.CENTER);
		    label.setText("Enter the new names of " + selectedCombo + " with space to separate items:");
		    
		    newNametext = new StyledText(right, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		    GridData gd = new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
			 gd.horizontalSpan = 2;
			 gd.verticalSpan = 15;
			 newNametext.setLayoutData(gd);
		    
			 mergeList.addSelectionListener(new SelectionListener() {
		        public void widgetSelected(SelectionEvent event) {
		          int selectedItem = mergeList.getSelectionIndex();//.getSelectionIndices();
		          // updated objectiveRoleList when the splitList of Role is selected
		          updateObjectiveRoleList(selectedItem);
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
		             System.out.println("OK BUTTON IS pressed " + newNametext.getText());
		             StringTokenizer st = new StringTokenizer(newNametext.getText());
		             Vector<String> temp = new Vector<String>();
		             while (st.hasMoreTokens()) {
		            	 String str = st.nextToken();
		            	 // check if Roles, Objectives or scenes combo is selected
		            	 temp.add(str);
		             }
		             addNewMergedItems(temp);
		           } else if (event.widget == clearBtn) {
		        	   newNametext.setText("");
		           }
		          
		         }
		       };
		       okSplitBtn.addListener(SWT.Selection, btnListener);
		       clearBtn.addListener(SWT.Selection, btnListener);  
	    return composite;
	  }
	  
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
			    for (int loopIndex = 0; loopIndex < objectiveList.size(); loopIndex++) {
			    	landmarkObjectiveList.add(objectiveList.get(loopIndex).getName());
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
			  System.out.println("SElected Objective in landmark " + objectivesSelected[0]);
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
		  for(int i=0; i<objectiveList.size(); i++){
			  Objective o = objectiveList.get(i);
			  for(int j=0; j<selectedObjs.length; j++){
				  if(selectedObjs[j].equals(o.getName())){
					  landmark1.getEntails().add(o);
					  System.out.println("New landmark with objective " + item + ", objective " + o.getName());
				  }
			  }
		  }
		  landmarksSWTList.add("Landmark : " + landmark1.getName());
		  landmarkList.add(landmark1);
	  }
}
