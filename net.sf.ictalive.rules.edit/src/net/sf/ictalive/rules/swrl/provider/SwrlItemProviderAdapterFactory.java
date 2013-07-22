/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.sf.ictalive.rules.swrl.util.SwrlAdapterFactory;

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
public class SwrlItemProviderAdapterFactory extends SwrlAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public SwrlItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.rules.swrl.AtomList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomListItemProvider atomListItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.rules.swrl.AtomList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomListAdapter() {
		if (atomListItemProvider == null) {
			atomListItemProvider = new AtomListItemProvider(this);
		}

		return atomListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.rules.swrl.BuiltInAtom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuiltInAtomItemProvider builtInAtomItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.rules.swrl.BuiltInAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBuiltInAtomAdapter() {
		if (builtInAtomItemProvider == null) {
			builtInAtomItemProvider = new BuiltInAtomItemProvider(this);
		}

		return builtInAtomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.rules.swrl.ClassAtom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassAtomItemProvider classAtomItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.rules.swrl.ClassAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassAtomAdapter() {
		if (classAtomItemProvider == null) {
			classAtomItemProvider = new ClassAtomItemProvider(this);
		}

		return classAtomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.rules.swrl.IndividualPropertyAtom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualPropertyAtomItemProvider individualPropertyAtomItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.rules.swrl.IndividualPropertyAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndividualPropertyAtomAdapter() {
		if (individualPropertyAtomItemProvider == null) {
			individualPropertyAtomItemProvider = new IndividualPropertyAtomItemProvider(this);
		}

		return individualPropertyAtomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.rules.swrl.SameIndividualAtom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SameIndividualAtomItemProvider sameIndividualAtomItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.rules.swrl.SameIndividualAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSameIndividualAtomAdapter() {
		if (sameIndividualAtomItemProvider == null) {
			sameIndividualAtomItemProvider = new SameIndividualAtomItemProvider(this);
		}

		return sameIndividualAtomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.rules.swrl.DifferentIndividualsAtom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DifferentIndividualsAtomItemProvider differentIndividualsAtomItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.rules.swrl.DifferentIndividualsAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDifferentIndividualsAtomAdapter() {
		if (differentIndividualsAtomItemProvider == null) {
			differentIndividualsAtomItemProvider = new DifferentIndividualsAtomItemProvider(this);
		}

		return differentIndividualsAtomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatavaluedPropertyAtomItemProvider datavaluedPropertyAtomItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatavaluedPropertyAtomAdapter() {
		if (datavaluedPropertyAtomItemProvider == null) {
			datavaluedPropertyAtomItemProvider = new DatavaluedPropertyAtomItemProvider(this);
		}

		return datavaluedPropertyAtomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.rules.swrl.DataRangeAtom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRangeAtomItemProvider dataRangeAtomItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.rules.swrl.DataRangeAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataRangeAtomAdapter() {
		if (dataRangeAtomItemProvider == null) {
			dataRangeAtomItemProvider = new DataRangeAtomItemProvider(this);
		}

		return dataRangeAtomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.rules.swrl.DataValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataValueItemProvider dataValueItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.rules.swrl.DataValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataValueAdapter() {
		if (dataValueItemProvider == null) {
			dataValueItemProvider = new DataValueItemProvider(this);
		}

		return dataValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.rules.swrl.IndividualVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualVariableItemProvider individualVariableItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.rules.swrl.IndividualVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndividualVariableAdapter() {
		if (individualVariableItemProvider == null) {
			individualVariableItemProvider = new IndividualVariableItemProvider(this);
		}

		return individualVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.rules.swrl.IndividualID} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualIDItemProvider individualIDItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.rules.swrl.IndividualID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndividualIDAdapter() {
		if (individualIDItemProvider == null) {
			individualIDItemProvider = new IndividualIDItemProvider(this);
		}

		return individualIDItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.rules.swrl.DataVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataVariableItemProvider dataVariableItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.rules.swrl.DataVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataVariableAdapter() {
		if (dataVariableItemProvider == null) {
			dataVariableItemProvider = new DataVariableItemProvider(this);
		}

		return dataVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.rules.swrl.DataLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataLiteralItemProvider dataLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.rules.swrl.DataLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataLiteralAdapter() {
		if (dataLiteralItemProvider == null) {
			dataLiteralItemProvider = new DataLiteralItemProvider(this);
		}

		return dataLiteralItemProvider;
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
		if (atomListItemProvider != null) atomListItemProvider.dispose();
		if (builtInAtomItemProvider != null) builtInAtomItemProvider.dispose();
		if (classAtomItemProvider != null) classAtomItemProvider.dispose();
		if (individualPropertyAtomItemProvider != null) individualPropertyAtomItemProvider.dispose();
		if (sameIndividualAtomItemProvider != null) sameIndividualAtomItemProvider.dispose();
		if (differentIndividualsAtomItemProvider != null) differentIndividualsAtomItemProvider.dispose();
		if (datavaluedPropertyAtomItemProvider != null) datavaluedPropertyAtomItemProvider.dispose();
		if (dataRangeAtomItemProvider != null) dataRangeAtomItemProvider.dispose();
		if (dataValueItemProvider != null) dataValueItemProvider.dispose();
		if (individualVariableItemProvider != null) individualVariableItemProvider.dispose();
		if (individualIDItemProvider != null) individualIDItemProvider.dispose();
		if (dataVariableItemProvider != null) dataVariableItemProvider.dispose();
		if (dataLiteralItemProvider != null) dataLiteralItemProvider.dispose();
	}

}