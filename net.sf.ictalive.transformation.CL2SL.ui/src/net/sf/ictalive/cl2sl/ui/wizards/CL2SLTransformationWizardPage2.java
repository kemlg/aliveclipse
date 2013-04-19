package net.sf.ictalive.cl2sl.ui.wizards;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.tasks.PlansCollection;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.core.runtime.IPath;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (xmi).
 */

public class CL2SLTransformationWizardPage2 extends WizardPage {

	private Text serviceText;
	private Text namespaceText;
	private Text addressText;
	private Combo bindingCombo; 
	private Combo encodingCombo; 
	
	private Button owlsButton;
	private Button wsdlButton;
	private Button allButton;
	
	private ISelection selection;
	private CL2SLTransformationWizardPage1 page1;
	 
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public CL2SLTransformationWizardPage2(ISelection selection, CL2SLTransformationWizardPage1 page) {
		super("wizardPage");
		setTitle("Set Transformation Properties");
		setDescription("This wizard creates a new Service (WSDL or OWLS) from a Service model with *.xmi extension.");
		this.selection = selection;
		
		page1=page;
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
		label.setText("Service Name:");

		serviceText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		serviceText.setLayoutData(gd);
		serviceText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {				
				dialogChanged();
			}
		});
		
		//////////////////////////////
		label = new Label(container, SWT.NULL);
		label.setText("Service Namespace:");

		namespaceText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		namespaceText.setLayoutData(gd);
		namespaceText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
				
		//////////////////////////
		label = new Label(container, SWT.NULL);
		label.setText("Service EndPoint:");
				
		addressText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		addressText.setLayoutData(gd);
		addressText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {				
				dialogChanged();
			}
		});

		////////////////////////////////
		label = new Label(container, SWT.NULL);
		label.setText("Service Binding:");
		
		bindingCombo = new Combo(container, SWT.DROP_DOWN | SWT.READ_ONLY |SWT.BORDER);	
		bindingCombo.add("SOAP");
		//bindingCombo.add("HTTP");
		//bindingCombo.add("MIME");
		bindingCombo.select(0);
		gd = new GridData(GridData.FILL_HORIZONTAL);		
		bindingCombo.setLayoutData(gd);
		
		////////////////////////////////		
		label = new Label(container, SWT.NULL);
		label.setText("Service Encoding:");
		
		encodingCombo = new Combo(container, SWT.DROP_DOWN | SWT.READ_ONLY |SWT.BORDER);	
		encodingCombo.add("Document Literal");
		//encodingCombo.add("RPC Encoded");
		encodingCombo.select(0);
		gd = new GridData(GridData.FILL_HORIZONTAL);		
		encodingCombo.setLayoutData(gd);
			
				
		////////////////////////////////
		label = new Label(container, SWT.NULL);
		label.setText("Code to Generate:");
		
	    Composite composite = new Composite(container, SWT.NULL);
	    composite.setLayout(new RowLayout());
	    gd = new GridData(GridData.FILL_HORIZONTAL);
		composite.setLayoutData(gd);
		
		allButton = new Button(composite, SWT.RADIO);	
		allButton.setText("WSDL and OWLS");
	
		
		wsdlButton = new Button(composite, SWT.RADIO);	
		wsdlButton.setText("WSDL only");

				
		owlsButton = new Button(composite, SWT.RADIO);	
		owlsButton.setText("OWLS only");
		
		initialize();
		dialogChanged();
		setControl(container);
	}
	
	public boolean canFlipToNextPage() {
		//overflow
		
//		System.out.println("performiong next ");
//		System.out.println("ipath before -> " + page1.getPlanModel().toString());
//		String s = page1.getPlan();
//		System.out.println("from text -> " + s);
//		
//		IResource planContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(s));
//		IPath aplanModel = planContainer.getFullPath();
//		
//		System.out.println("ipath after -> " + aplanModel.toString());
//				
//		loadPlanModel(aplanModel);
		
		return true;
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
				
		loadPlanModel(page1.getPlanModel());
		
		addressText.setText("http://localhost:8080");
		
		allButton.setSelection(true);
	}


	/**
	 * Ensures that both text fields are set.
	 */
	private void dialogChanged() {
		
		String service = getServiceName();
		String namespace = getServiceNamespace();
		String endpoint = getServiceEndpoint();
		
		if (service.length() == 0) {
			updateStatus("Service name must be specified");
			return;
		}
		if (service.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("Service name must be valid");
			return;
		}
		if (namespace.length() == 0) {
			updateStatus("Service namespace must be specified");
			return;
		}
		if (endpoint.length() == 0) {
			updateStatus("Service endpoint must be specified");
			return;
		}
		
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getServiceName() {
		return serviceText.getText();
	}
	public String getServiceNamespace() {
		return namespaceText.getText();
	}

	public String getServiceEndpoint() {
		return addressText.getText();
	}
	
	public int getGenerateOption() {
		if (allButton.getSelection()) 
			return 1;
		if (wsdlButton.getSelection()) 
			return 2;
		if (owlsButton.getSelection()) 
			return 3;
		
		return 0;
	}
	
	public String gerServiceBinding() {
		return bindingCombo.getText();
	}
	
	public String gerServiceEncoding() {
		return encodingCombo.getText();
	}
	
	
	
	public void loadPlanModel(IPath planModel){
		if (planModel==null || page1.getPlan().endsWith(".plans")==false) 
			return;
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		
	//	resourceSet.getPackageRegistry().put(OMPackage.eNS_URI, OMPackage.eINSTANCE); 
	//	resourceSet.getPackageRegistry().put(TasksPackage.eNS_URI, TasksPackage.eINSTANCE); 
		resourceSet.getPackageRegistry().put(ActionsPackage.eNS_URI, ActionsPackage.eINSTANCE); 
	//	resourceSet.getPackageRegistry().put(NotationPackage.eNS_URI, NotationPackage.eINSTANCE); 
				
		Resource resource =	resourceSet.getResource(URI.createPlatformResourceURI(planModel.toString(), true), true);
				
		PlansCollection pcol = (PlansCollection)resource.getContents().get(0);
		
		if(pcol!=null){
			String name = pcol.getPlans().get(0).getName();
			if( name.toLowerCase().startsWith("get"))
				name = name.replaceFirst("get", "");
			if( name.toLowerCase().endsWith("service")==false)
				name = name +  "Service";
						
			serviceText.setText( name );			
			if(pcol.getNs()!=null)
				namespaceText.setText( pcol.getNs() );			
		}else{			
		}
		
		resource.unload();
		
	}
	

}

