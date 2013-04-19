/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.provider;


import java.util.Collection;
import java.util.List;

import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.OMPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.ictalive.operetta.OM.CS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CSItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OMPackage.Literals.CS__FORMULAS);
			childrenFeatures.add(OMPackage.Literals.CS__ONTOLOGY);
			childrenFeatures.add(OMPackage.Literals.CS__TERMS);
			childrenFeatures.add(OMPackage.Literals.CS__COUNTS_AS_RULES);
			childrenFeatures.add(OMPackage.Literals.CS__CONTEXTS);
			childrenFeatures.add(OMPackage.Literals.CS__ACTION_LIBRARY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CS"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated and modified
	 */
	@Override
	public String getText(Object object) {
//		return getString("_UI_CS_type");
		return "Communicative Structure";
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CS.class)) {
			case OMPackage.CS__FORMULAS:
			case OMPackage.CS__ONTOLOGY:
			case OMPackage.CS__TERMS:
			case OMPackage.CS__COUNTS_AS_RULES:
			case OMPackage.CS__CONTEXTS:
			case OMPackage.CS__ACTION_LIBRARY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createAtom()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createForAllPaths()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createExistsPath()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createPathNegation()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createPathConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createPathDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createPathImplication()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createNext()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createSometime()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__FORMULAS,
				 OMFactory.eINSTANCE.createUntil()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__ONTOLOGY,
				 OMFactory.eINSTANCE.createOntology()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__TERMS,
				 OMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__TERMS,
				 OMFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__TERMS,
				 OMFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__COUNTS_AS_RULES,
				 OMFactory.eINSTANCE.createCountsAs()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__CONTEXTS,
				 OMFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(OMPackage.Literals.CS__ACTION_LIBRARY,
				 OMFactory.eINSTANCE.createActions()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OperAEditPlugin.INSTANCE;
	}

}
