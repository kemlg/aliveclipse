package net.sf.ictalive.actions2opera.ui.wizards;

import java.util.ArrayList;
import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.actions.ActionsCollection;
import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.actions.CompositeAction;
import net.sf.ictalive.owls.process.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.widgets.Table;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (xmi).
 */

public class Actions2OperaTransformationWizardPage2 extends WizardPage {
	private Table table;
	private Text ontologyText;
	
	private ArrayList<Action> lstCompositeActions ;
	private ArrayList<CCombo> lstComboOptions ;
	private ArrayList<CCombo> lstComboContainer ;

	private ISelection selection;
	private Actions2OperaTransformationWizardPage1 page1;
	 
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public Actions2OperaTransformationWizardPage2(ISelection selection, Actions2OperaTransformationWizardPage1 page) {
		super("wizardPage");
		setTitle("Set Transformation Properties");
		setDescription("This wizard creates a new OperA model from existing Actions");
		this.selection = selection;		
		page1=page;
		
		lstCompositeActions = new ArrayList<Action>();
	 	lstComboOptions = new ArrayList<CCombo>();
	 	lstComboContainer = new ArrayList<CCombo>();	
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 9;		
				
		//////////////////////////////
		Label label = new Label(container, SWT.NULL);
		label.setText("Ontology URI:");

		ontologyText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		ontologyText.setLayoutData(gd);
		ontologyText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {				
				dialogChanged();
			}
		});
	
		///
		gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 2;
		 
		ScrolledComposite c1 = new ScrolledComposite(container, SWT.BORDER
		            | SWT.H_SCROLL | SWT.V_SCROLL);
		    
		c1.setLayoutData(gd);
	    c1.setExpandHorizontal(true);
	    c1.setExpandVertical(true);
	
	    table = new Table(c1, SWT.BORDER | SWT.MULTI);
	    c1.setContent(table);
       
	    TableColumn tc1 = new TableColumn(table, SWT.CENTER);		 
	    tc1.setText("Composite Actions");
	    tc1.setWidth(300);
	    
	    TableColumn tc2 = new TableColumn(table, SWT.CENTER);
	    tc2.setText("Generate Options");
	    tc2.setWidth(200);	
	    
	    TableColumn tc3 = new TableColumn(table, SWT.CENTER);
	    tc3.setText("Container Element");
	    tc3.setWidth(200);	
	  
	    table.setHeaderVisible(true);
	    table.setLinesVisible(true);
	    
	    page1.getActionModel();
	   
	    /////////////////
				
		initialize();
		dialogChanged();
		setControl(container);
	}
	
	public boolean canFlipToNextPage() {
		return true;
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {				
		loadActionModel(page1.getActionModel(), table);	
	}

	/**
	 * Ensures that both text fields are set.
	 */
	private void dialogChanged() {	
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getOntologyURI() {
		return ontologyText.getText();
	}
			
	public void loadActionModel(IPath actionModel, Table table){
		if (actionModel==null ) 
			return;
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		
	//	resourceSet.getPackageRegistry().put(OMPackage.eNS_URI, OMPackage.eINSTANCE); 
	//	resourceSet.getPackageRegistry().put(TasksPackage.eNS_URI, TasksPackage.eINSTANCE); 
		resourceSet.getPackageRegistry().put(ActionsPackage.eNS_URI, ActionsPackage.eINSTANCE); 
	//	resourceSet.getPackageRegistry().put(NotationPackage.eNS_URI, NotationPackage.eINSTANCE); 
				
		Resource resource =	resourceSet.getResource(URI.createPlatformResourceURI(actionModel.toString(), true), true);
		
		ActionsCollection acol = (ActionsCollection)resource.getContents().get(0);
	
		if(acol!=null){
			String name = acol.getActions().get(0).getName();
			
			int num_actions =0;
			int num_atomic_actions=0;
			int num_composite_actions=0;
			int num_participants=0;
			
			num_actions = acol.getActions().size();
			//System.out.println("num of actions found " + num_actions);		
			
			for (Action action : acol.getActions()){
				
				if (action instanceof CompositeAction){					
					lstCompositeActions.add(  action ); 									
					addItem(table, num_composite_actions, (CompositeAction) action);						
					num_composite_actions ++;					
				} 				
				else {				
					num_atomic_actions ++;
				} 				
			
			}	
			
			num_participants = acol.getParticipants().size();						
		}
		
		resource.unload();		
	}
			
	private void addItem(Table table, final int index, CompositeAction compositeAction){
		
		 TableEditor editor1 = new TableEditor(table);
		 editor1.grabHorizontal = true;
		 TableEditor editor2 = new TableEditor(table);
		 editor2.grabHorizontal = true;
		 
		 final CCombo comboOption = new CCombo(table, SWT.READ_ONLY) ;
		 final CCombo comboContainer = new CCombo(table, SWT.READ_ONLY) ;
				 
		 comboOption.setItems ( getCompositeActionOptions(compositeAction)  );
		 comboContainer.setItems (  new String[]{"SS"} );
		 
		 comboOption.select(1); //default Objective
		 comboContainer.select(0); //default SS
		 
		 
		 final TableItem item = new TableItem(table, SWT.READ_ONLY);
		 item.setText(new String[] { compositeAction.getName(), comboOption.getText(), comboContainer.getText() });
		 editor1.setEditor(comboOption, item, 1);
		 editor2.setEditor(comboContainer, item, 2);
		 
		 lstComboOptions.add( comboOption );
		 lstComboContainer.add( comboContainer );
		 
				 
		 //cascading upon selection
		 comboOption.addSelectionListener(new SelectionAdapter() {
		      public void widgetSelected(SelectionEvent e) {
		    	  
		    	  String option =  comboOption.getText();		    	  
		    	  item.setText(1, option);    			    	  
		    //	  System.out.println("selected option is: " + option);
		    	  
		    	  String element = item.getText(0);		    	  		    	  
		    	  CompositeAction action = getCompositeAction( element );
		    		
		    	  //cascading
		    	  if(option.equals(Generate.InteractionScene)){  	  
					  updateISSelected((CompositeAction) action);
				  }else if(option.equals(Generate.Scene)){			    	  
					  updateSceneSelected((CompositeAction) action);
				  }else if(option.equals(Generate.LandmarkPattern) ){	    	  
					  updateLMPSelected( (CompositeAction) action);
				  }else if(option.equals(Generate.Landmark)){					
					  updateLMSelected( (CompositeAction) action);
				  }		    	 
				  else if(option.equals(Generate.Objective)){
					
		    	  }  
				  else if(option.equals(Generate.Not_Generate)){
					
		    	  }
		    	  
		    	  updateContainerOptions (item, comboContainer, comboOption);
		    	  
		      }
		 });
		 
		 comboContainer.addSelectionListener(new SelectionAdapter() {
		      public void widgetSelected(SelectionEvent e) {	
		    	  
		    	  String container =  comboContainer.getText();		    	  
		    	  item.setText(2, container);    	    	      	  
		      }
		 });
		 
		 comboContainer.addMouseListener(new MouseListener() {				
				public void mouseUp(MouseEvent e) {
					// TODO Auto-generated method stub
				}
				
				public void mouseDown(MouseEvent e) {
					// TODO Auto-generated method stub
					updateContainerOptions (item, comboContainer, comboOption);					 
				}
				
				public void mouseDoubleClick(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
	}
	
	private void updateContainerOptions(TableItem item, CCombo comboContainer, CCombo comboOption){
		 
		String option =  comboOption.getText();		    	  
    	  item.setText(1, option);    			    	  
    	  
    	  String element = item.getText(0);		    	  		    	  
    	  CompositeAction action = getCompositeAction( element );
    	  
    	  if(option.equals(Generate.InteractionScene)){
			  comboContainer.setItems(new String[]{"OM"});
			  comboContainer.select(0) ;			    		    	  
	    	  item.setText(2, comboContainer.getText());
	    	
		  }else if(option.equals(Generate.Scene)){
			  comboContainer.setItems(new String[]{"IS"}); 
			  comboContainer.select(0) ;			    		    	  
	    	  item.setText(2, comboContainer.getText());
	    	
		  }else if(option.equals(Generate.LandmarkPattern) ){
			  ArrayList<String> lst = new ArrayList<String>();				 
    		  lst.addAll( getCurrentOptions( Generate.Scene )  );    		 
    		  comboContainer.setItems(  lst.toArray(new String [lst.size()]) );
			  //comboContainer.select(0) ;			    		    	  
	    	  item.setText(2, comboContainer.getText());
	    
		  }else if(option.equals(Generate.Landmark)){
			  ArrayList<String> lst = new ArrayList<String>();				 
    		  lst.addAll( getCurrentOptions( Generate.LandmarkPattern )  );	    			    		
    		  comboContainer.setItems(  lst.toArray(new String [lst.size()]) );
			  //comboContainer.select(0) ;			    		    	  
	    	  item.setText(2, comboContainer.getText());
	  
		  }		    	 
		  else if(option.equals(Generate.Objective)){
			  comboContainer.setItems(new String[]{"SS"});
			  comboContainer.select(0) ;			    	  
	    	  item.setText(2, comboContainer.getText());
    	  }  
		  else if(option.equals(Generate.Not_Generate)){
			  comboContainer.setItems(new String[]{"null"});
			  comboContainer.select(0) ;			    		    	  
	    	  item.setText(2, comboContainer.getText());
    	  }   	  
		
	}
	
	private String[] getCompositeActionOptions(CompositeAction compositeAction){		
		if( compositeAction.getComposedOf() instanceof Sequence ){						
			return Generate.GENERATE_SEQ; //all
		}else{						
			return Generate.GENERATE_ANY; //not IS, LMP						
		}
	}
	
	private  ArrayList<Action> getNestedComposedOf(CompositeAction action){		
		ArrayList<Action>lst = new  ArrayList<Action>();
		 
		Object comp = action.getComposedOf();
		if(comp instanceof AnyOrder){
			processAnyOrder( (AnyOrder)comp, lst);
		}else if (comp instanceof Sequence){
			processSequence( (Sequence)comp, lst);
		}
		
		return lst;
	}
	
	private void processAnyOrder(AnyOrder any, ArrayList<Action>lst){
		Object f = any.getComponents().getFirst();
		processFirst (f, lst);
		
		if(any.getComponents()!=null)
			processControlConstructBag( any.getComponents().getRest(), lst);		
	}
	
	private void processSequence(Sequence seq, ArrayList<Action>lst){
		Object f = seq.getComponents().getFirst();
		processFirst (f, lst);
		
		if(seq.getComponents()!=null)
			processControlConstructList( seq.getComponents().getRest(), lst);		
	}
	
	private void processControlConstructList(ControlConstructList cons, ArrayList<Action>lst){
		if(cons==null) return;
		Object f = cons.getFirst();
		processFirst (f, lst);
		
		processControlConstructList ( cons.getRest(), lst);		
	}
	
	private void processControlConstructBag(ControlConstructBag cons, ArrayList<Action>lst){
		if(cons==null) return;
		Object f = cons.getFirst();
		processFirst (f, lst);
		
		processControlConstructBag ( cons.getRest(), lst);		
	}
	
	private void processFirst(Object f, ArrayList<Action>lst){
		if(f==null) return;	
		
		if(f instanceof Perform){
			lst.add( (Action)((Perform)f).getProcess() );
		}else if(f instanceof AnyOrder){
			processAnyOrder((AnyOrder)f, lst);
		}else if(f instanceof Sequence){
			processSequence((Sequence)f, lst);
		}
	}
		
	private CompositeAction getCompositeAction(String name){
		for (Object act : lstCompositeActions.toArray()) {			
			if ( ((CompositeAction)act).getName().equals(name))
				return (CompositeAction)act;
		}
		return null;		
	} 

	private void updateISSelected(CompositeAction is){
		ArrayList<Action> lstScene = getNestedComposedOf(is);	
		update(lstScene, is, Generate.Scene);
	}
		
	private void updateLMPSelected(CompositeAction lmp){
		ArrayList<Action> lstLM = getNestedComposedOf(lmp);
		update(lstLM, lmp, Generate.Landmark);
	}
		
	private void updateLMSelected(CompositeAction lm){
		ArrayList<Action> lstCA = getNestedComposedOf(lm);
		update(lstCA, lm, Generate.Objective);
	}

	private void updateSceneSelected(CompositeAction scene){
		ArrayList<Action> lstLMS = getNestedComposedOf(scene);
		update(lstLMS, scene, Generate.LandmarkPattern);
	}
	
	private void update(ArrayList<Action> lst, CompositeAction fromAction, String text){
		if(lst.size()<0) return;
		
		for (Action action : lst) {
			  
			  //it will be an atomic action
			  if( getTableItemIndexFor(action)== -1 ) continue;
			  
			  lstComboOptions.get(getTableItemIndexFor(action)).setText(text); //select(3); //scene
			  
			  if(text.equals(Generate.InteractionScene)){
				  updateISSelected((CompositeAction) action);
			  }else if(text.equals(Generate.Scene)){
				  updateSceneSelected((CompositeAction) action);
				  
				  int index = getTableItemIndexFor(action);
				  lstComboContainer.get(index).setItems(new String[]{"IS"});
				  lstComboContainer.get(index).select(0) ;			    		    	  
		    	  table.getItem(index).setText(2, lstComboContainer.get(index).getText());
		    	  
			  }else if(text.equals(Generate.LandmarkPattern) ){
				  updateLMPSelected( (CompositeAction) action);
				  
				  int index = getTableItemIndexFor(action);
				  lstComboContainer.get(index).setItems(new String[]{fromAction.getName()});
				  lstComboContainer.get(index).select(0) ;			    		    	  
		    	  table.getItem(index).setText(2, lstComboContainer.get(index).getText());
				  
			  }else if(text.equals(Generate.Landmark)){
				  updateLMSelected( (CompositeAction) action);
				  
				  int index = getTableItemIndexFor(action);
				  lstComboContainer.get(index).setItems(new String[]{fromAction.getName()});
				  lstComboContainer.get(index).select(0) ;			    		    	  
		    	  table.getItem(index).setText(2, lstComboContainer.get(index).getText());
			  }
		}
	}
	
	private ArrayList<String> getCurrentOptions(String option){
		ArrayList<String> lst = new ArrayList<String>();		
		for (int i=0; i< lstComboOptions.size(); i++) {
			CCombo combo = lstComboOptions.get(i);
			if ( combo.getText().equals(option) ){				
				lst.add (  table.getItem(i).getText(0) );
			}
		}	
		return lst;		
	}
	
	private int getTableItemIndexFor(Action act){		
		for (int i=0; i< table.getItems().length; i++) {
			if ( table.getItem(i).getText(0).equals( act.getName()) )
				return i;
		}
		return -1;
	}
	
	public TableItem[] getTableItems(){
		return table.getItems();
	}

}

class Generate {
	static String Not_Generate = "Not_Generate"; 
	static String Objective = "Objective" ;
	static String Landmark = "Landmark";
	static String LandmarkPattern = "LandmarkPattern" ;
	static String Scene = "Scene";
	static String InteractionScene = "InteractionScene";
	
	static String[] GENERATE_SEQ = new String [] {Not_Generate, Objective, Landmark, LandmarkPattern, Scene, InteractionScene};
	static String[] GENERATE_ANY = new String [] {Not_Generate, Objective, Landmark, Scene };
}
