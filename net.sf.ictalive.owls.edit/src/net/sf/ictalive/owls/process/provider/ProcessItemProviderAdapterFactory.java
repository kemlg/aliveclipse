/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.sf.ictalive.owls.process.util.ProcessAdapterFactory;

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
public class ProcessItemProviderAdapterFactory extends ProcessAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ProcessItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.AnyOrder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyOrderItemProvider anyOrderItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.AnyOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnyOrderAdapter() {
		if (anyOrderItemProvider == null) {
			anyOrderItemProvider = new AnyOrderItemProvider(this);
		}

		return anyOrderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.AtomicProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicProcessItemProvider atomicProcessItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.AtomicProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomicProcessAdapter() {
		if (atomicProcessItemProvider == null) {
			atomicProcessItemProvider = new AtomicProcessItemProvider(this);
		}

		return atomicProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Binding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingItemProvider bindingItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Binding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindingAdapter() {
		if (bindingItemProvider == null) {
			bindingItemProvider = new BindingItemProvider(this);
		}

		return bindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Choice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceItemProvider choiceItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Choice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoiceAdapter() {
		if (choiceItemProvider == null) {
			choiceItemProvider = new ChoiceItemProvider(this);
		}

		return choiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.CompositeProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeProcessItemProvider compositeProcessItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.CompositeProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeProcessAdapter() {
		if (compositeProcessItemProvider == null) {
			compositeProcessItemProvider = new CompositeProcessItemProvider(this);
		}

		return compositeProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.ControlConstructBag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlConstructBagItemProvider controlConstructBagItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.ControlConstructBag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlConstructBagAdapter() {
		if (controlConstructBagItemProvider == null) {
			controlConstructBagItemProvider = new ControlConstructBagItemProvider(this);
		}

		return controlConstructBagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.ControlConstructList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlConstructListItemProvider controlConstructListItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.ControlConstructList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlConstructListAdapter() {
		if (controlConstructListItemProvider == null) {
			controlConstructListItemProvider = new ControlConstructListItemProvider(this);
		}

		return controlConstructListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.IfThenElse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfThenElseItemProvider ifThenElseItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.IfThenElse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfThenElseAdapter() {
		if (ifThenElseItemProvider == null) {
			ifThenElseItemProvider = new IfThenElseItemProvider(this);
		}

		return ifThenElseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Input} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputItemProvider inputItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputAdapter() {
		if (inputItemProvider == null) {
			inputItemProvider = new InputItemProvider(this);
		}

		return inputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.InputBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputBindingItemProvider inputBindingItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.InputBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputBindingAdapter() {
		if (inputBindingItemProvider == null) {
			inputBindingItemProvider = new InputBindingItemProvider(this);
		}

		return inputBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Iterate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterateItemProvider iterateItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Iterate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIterateAdapter() {
		if (iterateItemProvider == null) {
			iterateItemProvider = new IterateItemProvider(this);
		}

		return iterateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Local} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalItemProvider localItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Local}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocalAdapter() {
		if (localItemProvider == null) {
			localItemProvider = new LocalItemProvider(this);
		}

		return localItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Output} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputItemProvider outputItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputAdapter() {
		if (outputItemProvider == null) {
			outputItemProvider = new OutputItemProvider(this);
		}

		return outputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.OutputBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputBindingItemProvider outputBindingItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.OutputBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputBindingAdapter() {
		if (outputBindingItemProvider == null) {
			outputBindingItemProvider = new OutputBindingItemProvider(this);
		}

		return outputBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Participant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantItemProvider participantItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParticipantAdapter() {
		if (participantItemProvider == null) {
			participantItemProvider = new ParticipantItemProvider(this);
		}

		return participantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Perform} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformItemProvider performItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Perform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPerformAdapter() {
		if (performItemProvider == null) {
			performItemProvider = new PerformItemProvider(this);
		}

		return performItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Process} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessItemProvider processItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessAdapter() {
		if (processItemProvider == null) {
			processItemProvider = new ProcessItemProvider(this);
		}

		return processItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Produce} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProduceItemProvider produceItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Produce}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProduceAdapter() {
		if (produceItemProvider == null) {
			produceItemProvider = new ProduceItemProvider(this);
		}

		return produceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.RepeatUntil} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatUntilItemProvider repeatUntilItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.RepeatUntil}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepeatUntilAdapter() {
		if (repeatUntilItemProvider == null) {
			repeatUntilItemProvider = new RepeatUntilItemProvider(this);
		}

		return repeatUntilItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.RepeatWhile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatWhileItemProvider repeatWhileItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.RepeatWhile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepeatWhileAdapter() {
		if (repeatWhileItemProvider == null) {
			repeatWhileItemProvider = new RepeatWhileItemProvider(this);
		}

		return repeatWhileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Result} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultItemProvider resultItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Result}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResultAdapter() {
		if (resultItemProvider == null) {
			resultItemProvider = new ResultItemProvider(this);
		}

		return resultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.ResultVar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultVarItemProvider resultVarItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.ResultVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResultVarAdapter() {
		if (resultVarItemProvider == null) {
			resultVarItemProvider = new ResultVarItemProvider(this);
		}

		return resultVarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Sequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceItemProvider sequenceItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceAdapter() {
		if (sequenceItemProvider == null) {
			sequenceItemProvider = new SequenceItemProvider(this);
		}

		return sequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.SimpleProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleProcessItemProvider simpleProcessItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.SimpleProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleProcessAdapter() {
		if (simpleProcessItemProvider == null) {
			simpleProcessItemProvider = new SimpleProcessItemProvider(this);
		}

		return simpleProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.Split} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitItemProvider splitItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.Split}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSplitAdapter() {
		if (splitItemProvider == null) {
			splitItemProvider = new SplitItemProvider(this);
		}

		return splitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.SplitJoin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitJoinItemProvider splitJoinItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.SplitJoin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSplitJoinAdapter() {
		if (splitJoinItemProvider == null) {
			splitJoinItemProvider = new SplitJoinItemProvider(this);
		}

		return splitJoinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.ictalive.owls.process.ValueOf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueOfItemProvider valueOfItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.ictalive.owls.process.ValueOf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueOfAdapter() {
		if (valueOfItemProvider == null) {
			valueOfItemProvider = new ValueOfItemProvider(this);
		}

		return valueOfItemProvider;
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
		if (anyOrderItemProvider != null) anyOrderItemProvider.dispose();
		if (atomicProcessItemProvider != null) atomicProcessItemProvider.dispose();
		if (bindingItemProvider != null) bindingItemProvider.dispose();
		if (choiceItemProvider != null) choiceItemProvider.dispose();
		if (compositeProcessItemProvider != null) compositeProcessItemProvider.dispose();
		if (controlConstructBagItemProvider != null) controlConstructBagItemProvider.dispose();
		if (controlConstructListItemProvider != null) controlConstructListItemProvider.dispose();
		if (ifThenElseItemProvider != null) ifThenElseItemProvider.dispose();
		if (inputItemProvider != null) inputItemProvider.dispose();
		if (inputBindingItemProvider != null) inputBindingItemProvider.dispose();
		if (iterateItemProvider != null) iterateItemProvider.dispose();
		if (localItemProvider != null) localItemProvider.dispose();
		if (outputItemProvider != null) outputItemProvider.dispose();
		if (outputBindingItemProvider != null) outputBindingItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (participantItemProvider != null) participantItemProvider.dispose();
		if (performItemProvider != null) performItemProvider.dispose();
		if (processItemProvider != null) processItemProvider.dispose();
		if (produceItemProvider != null) produceItemProvider.dispose();
		if (repeatUntilItemProvider != null) repeatUntilItemProvider.dispose();
		if (repeatWhileItemProvider != null) repeatWhileItemProvider.dispose();
		if (resultItemProvider != null) resultItemProvider.dispose();
		if (resultVarItemProvider != null) resultVarItemProvider.dispose();
		if (sequenceItemProvider != null) sequenceItemProvider.dispose();
		if (simpleProcessItemProvider != null) simpleProcessItemProvider.dispose();
		if (splitItemProvider != null) splitItemProvider.dispose();
		if (splitJoinItemProvider != null) splitJoinItemProvider.dispose();
		if (valueOfItemProvider != null) valueOfItemProvider.dispose();
	}

}