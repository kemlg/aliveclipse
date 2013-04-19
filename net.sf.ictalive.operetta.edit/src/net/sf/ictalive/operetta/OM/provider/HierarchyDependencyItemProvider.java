/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.provider;


import java.util.Collection;
import java.util.List;

import net.sf.ictalive.operetta.OM.HierarchyDependency;
import net.sf.ictalive.operetta.OM.OMPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link net.sf.ictalive.operetta.OM.HierarchyDependency} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchyDependencyItemProvider
	extends DependencyItemProvider
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
	public HierarchyDependencyItemProvider(AdapterFactory adapterFactory) {
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

			addDependantPropertyDescriptor(object);
			addDependeePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dependant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HierarchyDependency_Dependant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HierarchyDependency_Dependant_feature", "_UI_HierarchyDependency_type"),
				 OMPackage.Literals.HIERARCHY_DEPENDENCY__DEPENDANT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependee feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependeePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HierarchyDependency_Dependee_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HierarchyDependency_Dependee_feature", "_UI_HierarchyDependency_type"),
				 OMPackage.Literals.HIERARCHY_DEPENDENCY__DEPENDEE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/* (non-Javadoc)
	 * @see opera.OM.provider.DependencyItemProvider#addObjectOfDependencyPropertyDescriptor(java.lang.Object)
	 */
	@Override
	protected void addObjectOfDependencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(new ItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Dependency_ObjectOfDependency_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Dependency_ObjectOfDependency_feature", "_UI_HierarchyDependency_type"),
			 OMPackage.Literals.DEPENDENCY__OBJECT_OF_DEPENDENCY,
			 true,
			 false,
			 true,
			 null,
			 null,
			 null)	
			{
				/* (non-Javadoc)
				 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getChoiceOfValues(java.lang.Object)
				 */
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					//return super.getChoiceOfValues(object);
					HierarchyDependency dep = (HierarchyDependency) object;
					if (dep == null)
						return super.getChoiceOfValues(object);
					//adding subobjectives as well:
					return (dep.getDependee() != null) ? dep.getDependant().getAllObjectives() : null;
					
				}
			
			}
		);
	}
	
	
	/**
	 * This returns HierarchyDependency.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HierarchyDependency"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HierarchyDependency)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HierarchyDependency_type") :
			getString("_UI_HierarchyDependency_type") + " " + label;
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
	}

}
