/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.sf.ictalive.service.architecture.util.ArchitectureAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureItemProviderAdapterFactory extends ArchitectureAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.architecture.ServiceFramework} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceFrameworkItemProvider serviceFrameworkItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.architecture.ServiceFramework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceFrameworkAdapter() {
		if (serviceFrameworkItemProvider == null) {
			serviceFrameworkItemProvider = new ServiceFrameworkItemProvider(this);
		}

		return serviceFrameworkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.architecture.TemplateRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateRepositoryItemProvider templateRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.architecture.TemplateRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemplateRepositoryAdapter() {
		if (templateRepositoryItemProvider == null) {
			templateRepositoryItemProvider = new TemplateRepositoryItemProvider(this);
		}

		return templateRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.architecture.TemplateMatchmaker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateMatchmakerItemProvider templateMatchmakerItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.architecture.TemplateMatchmaker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemplateMatchmakerAdapter() {
		if (templateMatchmakerItemProvider == null) {
			templateMatchmakerItemProvider = new TemplateMatchmakerItemProvider(this);
		}

		return templateMatchmakerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.architecture.ServiceMatchmaker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceMatchmakerItemProvider serviceMatchmakerItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.architecture.ServiceMatchmaker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceMatchmakerAdapter() {
		if (serviceMatchmakerItemProvider == null) {
			serviceMatchmakerItemProvider = new ServiceMatchmakerItemProvider(this);
		}

		return serviceMatchmakerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.architecture.ServiceTemplateMatchmaker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTemplateMatchmakerItemProvider serviceTemplateMatchmakerItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.architecture.ServiceTemplateMatchmaker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceTemplateMatchmakerAdapter() {
		if (serviceTemplateMatchmakerItemProvider == null) {
			serviceTemplateMatchmakerItemProvider = new ServiceTemplateMatchmakerItemProvider(this);
		}

		return serviceTemplateMatchmakerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.architecture.ServiceDirectory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDirectoryItemProvider serviceDirectoryItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.architecture.ServiceDirectory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceDirectoryAdapter() {
		if (serviceDirectoryItemProvider == null) {
			serviceDirectoryItemProvider = new ServiceDirectoryItemProvider(this);
		}

		return serviceDirectoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.architecture.ExecutionFramework} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionFrameworkItemProvider executionFrameworkItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.architecture.ExecutionFramework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutionFrameworkAdapter() {
		if (executionFrameworkItemProvider == null) {
			executionFrameworkItemProvider = new ExecutionFrameworkItemProvider(this);
		}

		return executionFrameworkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.service.architecture.DeployedService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedServiceItemProvider deployedServiceItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.service.architecture.DeployedService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeployedServiceAdapter() {
		if (deployedServiceItemProvider == null) {
			deployedServiceItemProvider = new DeployedServiceItemProvider(this);
		}

		return deployedServiceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (serviceFrameworkItemProvider != null) serviceFrameworkItemProvider.dispose();
		if (templateRepositoryItemProvider != null) templateRepositoryItemProvider.dispose();
		if (templateMatchmakerItemProvider != null) templateMatchmakerItemProvider.dispose();
		if (serviceMatchmakerItemProvider != null) serviceMatchmakerItemProvider.dispose();
		if (serviceTemplateMatchmakerItemProvider != null) serviceTemplateMatchmakerItemProvider.dispose();
		if (serviceDirectoryItemProvider != null) serviceDirectoryItemProvider.dispose();
		if (executionFrameworkItemProvider != null) executionFrameworkItemProvider.dispose();
		if (deployedServiceItemProvider != null) deployedServiceItemProvider.dispose();
	}

}