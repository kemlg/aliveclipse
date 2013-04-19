package net.sf.ictalive.coordination.wfvv.diagram.navigator;

import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class WfvvNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7023;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7022;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof WfvvNavigatorItem) {
			WfvvNavigatorItem item = (WfvvNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return WfvvVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
