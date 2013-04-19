package net.sf.ictalive.coordination.wfannotation.mapping.diagram.navigator;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MappingNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7108;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7107;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof MappingNavigatorItem) {
			MappingNavigatorItem item = (MappingNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return MappingVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
