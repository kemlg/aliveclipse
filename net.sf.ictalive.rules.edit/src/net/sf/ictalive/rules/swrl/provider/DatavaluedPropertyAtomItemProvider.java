/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl.provider;


import java.util.Collection;
import java.util.List;

import net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom;
import net.sf.ictalive.rules.swrl.SwrlFactory;
import net.sf.ictalive.rules.swrl.SwrlPackage;
import net.sf.ictalive.rules.swrl.provider.custom.ConceptDetailsProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatavaluedPropertyAtomItemProvider
	extends AtomItemProvider
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
	public DatavaluedPropertyAtomItemProvider(AdapterFactory adapterFactory) {
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

			addPropertyPredicatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Property Predicate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyPredicatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DatavaluedPropertyAtom_propertyPredicate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DatavaluedPropertyAtom_propertyPredicate_feature", "_UI_DatavaluedPropertyAtom_type"),
				 SwrlPackage.Literals.DATAVALUED_PROPERTY_ATOM__PROPERTY_PREDICATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated - not
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SwrlPackage.Literals.DATAVALUED_PROPERTY_ATOM__ARGUMENT1);
			childrenFeatures.add(SwrlPackage.Literals.DATAVALUED_PROPERTY_ATOM__ARGUMENT2);
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
	 * This returns DatavaluedPropertyAtom.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DatavaluedPropertyAtom"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated - not
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DatavaluedPropertyAtom_type") + " " + ConceptDetailsProvider.getConceptDetails(((DatavaluedPropertyAtom)object).getPropertyPredicate());
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

		switch (notification.getFeatureID(DatavaluedPropertyAtom.class)) {
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT2:
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT1:
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
				(SwrlPackage.Literals.DATAVALUED_PROPERTY_ATOM__ARGUMENT2,
				 SwrlFactory.eINSTANCE.createDataVariable()));

		newChildDescriptors.add
			(createChildParameter
				(SwrlPackage.Literals.DATAVALUED_PROPERTY_ATOM__ARGUMENT2,
				 SwrlFactory.eINSTANCE.createDataLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(SwrlPackage.Literals.DATAVALUED_PROPERTY_ATOM__ARGUMENT1,
				 SwrlFactory.eINSTANCE.createIndividualVariable()));

		newChildDescriptors.add
			(createChildParameter
				(SwrlPackage.Literals.DATAVALUED_PROPERTY_ATOM__ARGUMENT1,
				 SwrlFactory.eINSTANCE.createIndividualID()));
	}

}
