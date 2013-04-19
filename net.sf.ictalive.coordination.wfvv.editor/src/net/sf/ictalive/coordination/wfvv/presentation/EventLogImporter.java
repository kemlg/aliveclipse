/**
 * 
 */
package net.sf.ictalive.coordination.wfvv.presentation;

import net.sf.ictalive.coordination.wfvv.EventModelContainer;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * @author dcorsar
 *
 */
public class EventLogImporter implements EventImporter {


	@Override
	public Composite getControl(Composite parent) {
		Composite control = new Composite(parent, SWT.NULL);
		control.setLayout(new RowLayout());
		Label label = new Label(control, SWT.NULL);
		label.setText("Event Log import currently not supported");
		return control;
	}

	@Override
	public String getOptionText() {
		return "Event log";
	}

	@Override
	public boolean isComplete() {
		return false;
	}

	@Override
	public boolean importEvents(EventModelContainer to) {
		// TODO Auto-generated method stub
		return true;
	}

}
