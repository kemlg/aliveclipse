package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class BpeldiagNavigatorItem extends BpeldiagAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					public Object getAdapter(Object adaptableObject,
							Class adapterType) {
						if (adaptableObject instanceof net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.navigator.BpeldiagNavigatorItem
								&& (adapterType == View.class || adapterType == EObject.class)) {
							return ((net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.navigator.BpeldiagNavigatorItem) adaptableObject)
									.getView();
						}
						return null;
					}

					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.navigator.BpeldiagNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public BpeldiagNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.navigator.BpeldiagNavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(
							EcoreUtil
									.getURI(((net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.navigator.BpeldiagNavigatorItem) obj)
											.getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
