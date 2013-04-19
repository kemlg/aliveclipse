/**
 * 
 */
package net.sf.ictalive.coordination.wfvv.presentation;

import net.sf.ictalive.coordination.wfvv.EventModelContainer;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

/**
 * The page in the wizard that deals with actually importing
 * the events to a new EventsCollection model.
 * 
 * @author David Corsar
 *
 */
public abstract class ImportEventsPage extends WizardPage {

	protected ImportEventsPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}
	
	public abstract EventModelContainer importEvents();
	
	protected void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
}
