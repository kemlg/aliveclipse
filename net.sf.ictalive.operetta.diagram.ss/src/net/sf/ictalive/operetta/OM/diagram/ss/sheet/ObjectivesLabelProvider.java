package net.sf.ictalive.operetta.OM.diagram.ss.sheet;

import net.sf.ictalive.operetta.OM.Objective;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.*;

/**
 * Implementation of the standard Label provider for the objectives tree listing in the properties view of OperettA.
 * Based on examples from "Eclipse Plug-ins" by Clayberg and Rubel, chapter 5.
 * @author Huib Aldewereld
 *
 */

public class ObjectivesLabelProvider extends LabelProvider {
	/**
	 * We don't want the list to display icons, so we return null for every element
	 */
	public Image getImage(Object element) {
		return null;
	}
	
	/**
	 * Basic String representations of all elements based on the <code>Name</code> field of the objective.
	 */
	public String getText(Object element) {
		return ((Objective) element).getName() != null ? ((Objective) element).getName() : "undefined";
	}
}
