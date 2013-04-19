package net.sf.ictalive.service.serviceui;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.runtime.URIUtil;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class ControlCreationWizardFirstPage extends WizardPage {
	/**
	 * @generated NOT
	 */
	Text serviceNameText, serviceURIText, processNameText, serviceDescText, slotNameText;
	ControlDecoration uriControlDecoration;
	String nameString, uriString, processNameString, descString;
	Boolean isSlot = false;

	
	public ControlCreationWizardFirstPage(String pageName) {
		super(pageName);
		this.setTitle("Enter information for the service template");
		this.setDescription("This data populates the service description");
		this.setPageComplete(false);
		// TODO Auto-generated constructor stub
	}
	
	public void importExistingModel(String _name, String _processName, String _URI, String _desc) {
		uriString = _URI;
		descString = _desc;
		processNameString = _processName;
		nameString = _name;
	}

	@Override
	public void createControl(Composite parent) {
		// create the composite to hold the widgets   
		Composite composite = new Composite(parent, SWT.NONE);
		// create the desired layout for this wizard page
		GridLayout gl = new GridLayout();
		int ncol = 2;
		gl.numColumns = ncol;
		composite.setLayout(gl);		
		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.BEGINNING;
		gd.widthHint = 25;


		new Label (composite, SWT.NONE).setText("Service Name:");				
		serviceNameText = new Text(composite, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 1;
		serviceNameText.setLayoutData(gd);
		
		new Label (composite, SWT.NONE).setText("Service URI:");				
		serviceURIText = new Text(composite, SWT.BORDER);
	
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 1;
		serviceURIText.setLayoutData(gd);
		uriControlDecoration = new ControlDecoration(serviceURIText, SWT.LEFT);
		uriControlDecoration.setDescriptionText("URI is invalid");
		uriControlDecoration.setImage(FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_ERROR).getImage());	
		uriControlDecoration.hide();

		
		// At least on GTK, borders don't seem to get drawn on SWT.MULTI text edits
		new Label (composite, SWT.NONE).setText("Service Description:");				
		serviceDescText = new Text(composite, SWT.BORDER|SWT.MULTI);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.heightHint = serviceDescText.getLineHeight() * 2;
		gd.horizontalSpan = ncol - 1;
		serviceDescText.setLayoutData(gd);
		
		Label spacerLabel = new Label(composite,SWT.NONE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol;
		spacerLabel.setLayoutData(gd);
		
		new Label (composite, SWT.NONE).setText("OuterProcess Name:");				
		processNameText = new Text(composite, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 1;
		processNameText.setLayoutData(gd);
		
		ModifyListener textListener = new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				uriString = serviceURIText.getText();
				processNameString = processNameText.getText();
				descString = serviceDescText.getText();
				nameString = serviceNameText.getText();

				setPageComplete(validatePage());

			}
		};
		
		// if data from an existing model has been passed in
		// use to populate text fields
		serviceURIText.setText(uriString!=null ? uriString : "");
		serviceURIText.setEditable(uriString==null);
		serviceNameText.setText(nameString!=null ? nameString : "");
		processNameText.setText(processNameString!=null ? processNameString : "");
		serviceDescText.setText(descString!=null ? descString : "");
		setPageComplete(validatePage());

		serviceNameText.addModifyListener(textListener);
		serviceURIText.addModifyListener(textListener);
		processNameText.addModifyListener(textListener);
		serviceDescText.addModifyListener(textListener);	    


		setControl(composite);
	}

	public String getNameString() {
		return nameString;
	}
	
	public String getURIString() {
		return uriString;

	}

	public String getProcessName() {
		return processNameString;
	}

	public String getServiceDesc() {
		return descString;
	}

	
	private Boolean isValidURI(String _checkString) {

		if(_checkString==null) {
			return false;
		}

		try {
			URI testURI = URIUtil.fromString(_checkString);
		} catch (URISyntaxException e) {
			// decorate URI field with error image
			uriControlDecoration.show();
			return false;
		}
		uriControlDecoration.hide();
		return true;
	}

	private Boolean validatePage() {
		Boolean isValid = true;
		isValid &= (nameString!=null && nameString.length() > 0);
		isValid &= isValidURI(uriString);
		isValid &= (processNameString !=null && processNameString.length() > 0);
	
		return isValid;
	}

}
