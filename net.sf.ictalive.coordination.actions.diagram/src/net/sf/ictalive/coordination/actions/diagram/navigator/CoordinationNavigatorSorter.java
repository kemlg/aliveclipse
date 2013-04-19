package net.sf.ictalive.coordination.actions.diagram.navigator;

import net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class CoordinationNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7056;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7055;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof CoordinationNavigatorItem) {
			CoordinationNavigatorItem item = (CoordinationNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return CoordinationVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
