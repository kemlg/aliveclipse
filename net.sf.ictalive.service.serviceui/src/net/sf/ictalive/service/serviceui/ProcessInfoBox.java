package net.sf.ictalive.service.serviceui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.internal.tweaklets.GrabFocus;
import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLDataType;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLType;
import org.mindswap.owls.process.variable.Parameter;
import org.mindswap.owls.service.Service;

/***
 * Widget which displays information about a given OWL-S Service object/query
 * 
 * @author occ
 * 
 */
public class ProcessInfoBox {

	Group group;
	Label processName;
	Label processURI;
	Composite inputs;
	Composite outputs;

	Section ioSection;
	List inputsList;
	List outputsList;

	public ProcessInfoBox(Composite parent, boolean showDetails, boolean expand) {
		group = new Group(parent, SWT.BORDER);
		setText("Process details");
		group.setLayout(new GridLayout(2, false));
		createInnerControls(group, showDetails, expand);
		setProcess(null);

	}

	public ProcessInfoBox(Composite parent) {
		this(parent, true, true);
	}

	ProcessInfoBox() {
	}

	public Group getControl() {
		return group;
	}

	void createInnerControls(Composite group, boolean showProcessDetails,
			boolean expandableInputs) {
		if (showProcessDetails) {

			Label l = new Label(group, SWT.NONE);
			l.setText("Process Name:");

			processName = new Label(group, SWT.NONE);
			processName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			l = new Label(group, SWT.NONE);
			l.setText("Process URI:");

			processURI = new Label(group, SWT.NONE);
			processURI.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		}
		FormToolkit toolkit = new FormToolkit(group.getDisplay());
		ioSection = toolkit.createSection(group,
				expandableInputs ? Section.EXPANDED : 0 | Section.TWISTIE
						| Section.TITLE_BAR);
		ioSection.setLayoutData(new GridData(GridData.FILL_BOTH));
		ioSection.setText("Inputs and Outputs");

		ioSection.setLayout(new GridLayout());
		GridData spanLayout = new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL);
		spanLayout.horizontalSpan = 2;

		ioSection.setLayoutData(spanLayout);
		Composite client = toolkit.createComposite(ioSection, SWT.WRAP);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.marginWidth = 2;
		layout.marginHeight = 2;
		client.setLayout(layout);
		toolkit.createLabel(client, "Inputs");
		inputsList = new List(client, SWT.BORDER);

		GridData lgd = new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL);
		lgd.heightHint = 70;
		inputsList.setLayoutData(lgd);

		toolkit.createLabel(client, "Outputs");
		outputsList = new List(client, SWT.BORDER);
		outputsList.setLayoutData(lgd);
		toolkit.paintBordersFor(client);

		// inputs = toolkit.createExpandableComposite(ioInner,
		// ExpandableComposite.EXPANDED | ExpandableComposite.TWISTIE);
		// inputs.
		ioSection.setClient(client);
		group.pack();
	}

	public void setText(String string) {
		group.setText(string);

	}

	void fillParamList(List list, OWLIndividualList<? extends Parameter> params) {

		for (Parameter p : params) {
			OWLType type = p.getParamType();
			String typename;
			String paramName = p.getName();
			if (type == null)
				typename = "???";
			else {
				if (type.canCastTo(OWLClass.class)) {
					OWLClass typeclass = type.castTo(OWLClass.class);
					typename = typeclass.getLocalName();
					if (typename == null) {
						typename = typeclass.getURI().toString();
					}
				} else if (type.canCastTo(OWLDataType.class)) {
					OWLDataType odt = type.castTo(OWLDataType.class);
					typename = odt.getURI().toString();

					typename.replaceAll("http\\://www.w3.org/2001/XMLSchema#",
							"xsd:");
				} else {
					typename = "???";
				}
			}

			list.add("" + paramName + ":" + typename);
		}
	}

	public void setProcess(org.mindswap.owls.process.Process proc) {

		if (proc != null) {
			if (processURI != null) {
				if (proc.getURI() != null)
					processURI.setText(proc.getURI().toString());
				else {
					processURI.setText("none");
				}
				if (proc.getName() != null)
					processName.setText(ServiceDecorationHelper
							.processsToShortString(proc));
				else
					processName.setText("none");
			}
			inputsList.removeAll();
			if (proc.getInputs().isEmpty()) {
			} else {
				fillParamList(inputsList, proc.getInputs());
			}
			outputsList.removeAll();

			if (proc.getOutputs().isEmpty()) {
			} else {
				fillParamList(outputsList, proc.getOutputs());
			}

			// ioSection.getShell().pack();

		} else {
			if (processURI != null)
				processURI.setText("");
			if (processName != null)
				processName.setText("No object selected");

		}
	}
}
