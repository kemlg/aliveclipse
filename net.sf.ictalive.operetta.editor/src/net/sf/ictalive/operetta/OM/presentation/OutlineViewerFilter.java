package net.sf.ictalive.operetta.OM.presentation;

import java.util.Iterator;

import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.SS;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class OutlineViewerFilter extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {

		if (element instanceof Objective) {
			Objective objective = (Objective) element;
			
			if (parentElement instanceof SS) {
				SS ss = (SS) parentElement;
				
				for (Iterator<Objective> iter = ss.getObjectives().iterator(); iter.hasNext();) {
					Objective obj = iter.next();
					if (obj.getSubObjectives().contains(objective)) {
						return false; //we're dealing with an objective that's actually a child of another objective. Hide this
					}
				}
			}
			/*
			 * we're dealing with an objective that:
			 *  a) is not a child of any other objective while the parentElement is the SS; or
			 *  b) is a child of another objective, but the parentElement is that objective or a dependency or a role.
			 * These should be displayed.
			 */
			else return true;
		}
		
		if (element instanceof PartialStateDescription) {
			PartialStateDescription psd = (PartialStateDescription) element;
			
			if (parentElement instanceof CS) {
				CS cs = (CS) parentElement;
				
				for (Iterator<PartialStateDescription> iter = cs.getFormulas().iterator(); iter.hasNext();) {
					PartialStateDescription formula = iter.next();
					if (formula.getSubFormulas().contains(psd)) {
						return false;//we're dealing with an formula that's actually a subformula of another formula. Hide this
					}
				}
			}
			/*
			 * we're dealing with a formula that:
			 *  a) is not a sub-formula of another formula; or
			 *  b) is a sub-formula, but the viewer is called with a parentElement that is not the top-level (CS).
			 * These should be displayed.
			 */
			else return true;
		}
		//nothing to filter on the other types of objects (yet). Show them.
		return true;
	}

}