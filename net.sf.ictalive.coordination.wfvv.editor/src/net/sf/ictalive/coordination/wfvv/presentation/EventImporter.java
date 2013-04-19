/**
 * 
 */
package net.sf.ictalive.coordination.wfvv.presentation;

import net.sf.ictalive.coordination.wfvv.EventModelContainer;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Composite;

/**
 * @author David Corsar
 * 
 */
public abstract interface EventImporter {

	public abstract String getOptionText();

	public abstract Composite getControl(Composite parent);

	public abstract boolean isComplete();

	public abstract boolean importEvents(EventModelContainer to);
	
//	public abstract boolean performFinish();
	
}
