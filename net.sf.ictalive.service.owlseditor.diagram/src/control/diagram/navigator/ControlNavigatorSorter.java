/*
 * 
 */
package control.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class ControlNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7157;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7156;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ControlNavigatorItem) {
			ControlNavigatorItem item = (ControlNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ControlVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
