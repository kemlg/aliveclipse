package net.sf.ictalive.operetta.OM.diagram.ss.sheet;

import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.SS;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.*;

public class ObjectivesContentProvider extends ArrayContentProvider implements ITreeContentProvider {

	public Object[] getChildren(Object parentElement) {
		return ((Objective) parentElement).getSubObjectives().toArray();
		
	}

	public Object getParent(Object element) {
		EList<Objective> parent = ((Objective) element).getParent();
		return parent.isEmpty() ? null : parent.get(0);
	}

	public boolean hasChildren(Object element) {
		return ((Objective) element).getSubObjectives().size() > 0;
	}
	
}
