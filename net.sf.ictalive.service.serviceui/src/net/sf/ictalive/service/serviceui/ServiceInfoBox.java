package net.sf.ictalive.service.serviceui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;

/***
 * Widget which displays information about a given OWL-S Service object/query
 * 
 * @author occ
 * 
 */
public class ServiceInfoBox extends ProcessInfoBox {

	Label serviceName;
	Label serviceOntology;
	Label serviceDescription;
	Label serviceURI;

	public ServiceInfoBox(Composite parent, boolean expanded) {

		super();

		group = new Group(parent, SWT.BORDER);

		setText("Service details");
		group.setLayout(new GridLayout(2, false));

		Label l = new Label(group, SWT.NONE);
		l.setText("Name:");

		serviceName = new Label(group, SWT.NONE);
		serviceName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		l = new Label(group, SWT.NONE);
		l.setText("URI:");
		serviceURI = new Label(group, SWT.NONE);
		serviceURI.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		l = new Label(group, SWT.NONE);
		l.setText("Ontology:");
		serviceOntology = new Label(group, SWT.NONE);
		serviceOntology.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		createInnerControls(group, false, expanded);
		setService(null);
		group.pack();
	}

	public void setText(String string) {
		group.setText(string);

	}

	public void setService(Service svc) {

		if (svc != null) {
			if (svc.getURI() != null)
				serviceURI.setText(svc.getURI().toString());
			else {
				serviceURI.setText("none");
			}
			serviceName.setText(ServiceDecorationHelper
					.serviceToShortString(svc));

			OWLOntology owlo = svc.getOntology();
			if (owlo != null) {
				serviceOntology.setText(owlo.getURI().toString());
			}
			setProcess(svc.getProcess());
		} else {
			serviceURI.setText("");
			serviceName.setText("No object selected");
			setProcess(null);
		}
	}
}
