package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.navigator;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class BpeldiagNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7118;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7117;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof BpeldiagNavigatorItem) {
			BpeldiagNavigatorItem item = (BpeldiagNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return BpeldiagVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
