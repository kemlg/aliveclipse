/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.schema.provider;


import java.util.Collection;
import java.util.List;

import net.sf.ictalive.schema.RedefineType;
import net.sf.ictalive.schema.SchemaFactory;
import net.sf.ictalive.schema.SchemaPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.ictalive.schema.RedefineType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RedefineTypeItemProvider
	extends OpenAttrsItemProvider
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
	public RedefineTypeItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addSchemaLocationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefineType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefineType_id_feature", "_UI_RedefineType_type"),
				 SchemaPackage.Literals.REDEFINE_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schema Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemaLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RedefineType_schemaLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RedefineType_schemaLocation_feature", "_UI_RedefineType_type"),
				 SchemaPackage.Literals.REDEFINE_TYPE__SCHEMA_LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(SchemaPackage.Literals.REDEFINE_TYPE__GROUP);
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
	 * This returns RedefineType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RedefineType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RedefineType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_RedefineType_type") :
			getString("_UI_RedefineType_type") + " " + label;
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

		switch (notification.getFeatureID(RedefineType.class)) {
			case SchemaPackage.REDEFINE_TYPE__ID:
			case SchemaPackage.REDEFINE_TYPE__SCHEMA_LOCATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SchemaPackage.REDEFINE_TYPE__GROUP:
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
				(SchemaPackage.Literals.REDEFINE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.REDEFINE_TYPE__ANNOTATION,
					 SchemaFactory.eINSTANCE.createAnnotationType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.REDEFINE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.REDEFINE_TYPE__SIMPLE_TYPE,
					 SchemaFactory.eINSTANCE.createTopLevelSimpleType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.REDEFINE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.REDEFINE_TYPE__COMPLEX_TYPE,
					 SchemaFactory.eINSTANCE.createTopLevelComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.REDEFINE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.REDEFINE_TYPE__GROUP1,
					 SchemaFactory.eINSTANCE.createNamedGroup())));

		newChildDescriptors.add
			(createChildParameter
				(SchemaPackage.Literals.REDEFINE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SchemaPackage.Literals.REDEFINE_TYPE__ATTRIBUTE_GROUP,
					 SchemaFactory.eINSTANCE.createNamedAttributeGroup())));
	}

}
