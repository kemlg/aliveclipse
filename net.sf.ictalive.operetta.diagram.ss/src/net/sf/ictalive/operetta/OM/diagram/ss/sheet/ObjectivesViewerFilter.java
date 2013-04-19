package net.sf.ictalive.operetta.OM.diagram.ss.sheet;

import java.util.Iterator;

import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.SS;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


public class ObjectivesViewerFilter extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		Objective objective = (Objective) element;
		SS ss = (SS) objective.eContainer();
		
		if (parentElement instanceof Objective) {
			return true; //Any child objective requested (in tree view) should be displayed
		} else {
			for (Iterator<Objective> iter = ss.getObjectives().iterator(); iter.hasNext();) {
				Objective obj = iter.next();
				if (obj.getSubObjectives().contains(objective)) {
					return false; //the requested element is actually a child and should not be displayed at the top-level!
				}
			}
		}
		
		//not a child of a top-level objective, so only child of SS; display this
		return true;
	}

}
