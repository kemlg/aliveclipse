/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.provider;


import java.util.Collection;
import java.util.List;

import net.sf.ictalive.operetta.OM.NetworkDependency;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Objective;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link net.sf.ictalive.operetta.OM.NetworkDependency} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkDependencyItemProvider
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
	public NetworkDependencyItemProvider(AdapterFactory adapterFactory) {
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

			addDependant1PropertyDescriptor(object);
			addDependant2PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dependant1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependant1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkDependency_Dependant1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkDependency_Dependant1_feature", "_UI_NetworkDependency_type"),
				 OMPackage.Literals.NETWORK_DEPENDENCY__DEPENDANT1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependant2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependant2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkDependency_Dependant2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkDependency_Dependant2_feature", "_UI_NetworkDependency_type"),
				 OMPackage.Literals.NETWORK_DEPENDENCY__DEPENDANT2,
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
			 getString("_UI_PropertyDescriptor_description", "_UI_Dependency_ObjectOfDependency_feature", "_UI_NetworkDependency_type"),
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
					NetworkDependency dep = (NetworkDependency) object;
					EList<Objective> list = new BasicEList<Objective>();
					
					if (dep == null)
						return super.getChoiceOfValues(object);
					if(dep.getDependant1() == dep.getDependant2())
						return dep.getDependant1().getAllObjectives();
					if(dep.getDependant1() != null && dep.getDependant2() != null) {
						list.addAll(dep.getDependant1().getAllObjectives());
						list.addAll(dep.getDependant2().getAllObjectives());
					}
					return list;					
				}
			}
		);
	}

	
	/**
	 * This returns NetworkDependency.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NetworkDependency"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NetworkDependency)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NetworkDependency_type") :
			getString("_UI_NetworkDependency_type") + " " + label;
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
