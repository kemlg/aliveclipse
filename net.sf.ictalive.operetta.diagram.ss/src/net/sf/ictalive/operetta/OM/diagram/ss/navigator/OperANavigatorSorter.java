package net.sf.ictalive.operetta.OM.diagram.ss.navigator;

import net.sf.ictalive.operetta.OM.diagram.ss.part.OperAVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class OperANavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof OperANavigatorItem) {
			OperANavigatorItem item = (OperANavigatorItem) element;
			return OperAVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
