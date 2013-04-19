/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.util;

import net.sf.ictalive.service.semantics.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.service.semantics.SemanticsPackage
 * @generated
 */
public class SemanticsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SemanticsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SemanticsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticsSwitch<Adapter> modelSwitch =
		new SemanticsSwitch<Adapter>() {
			@Override
			public Adapter caseServiceProfile(ServiceProfile object) {
				return createServiceProfileAdapter();
			}
			@Override
			public Adapter caseServiceGrounding(ServiceGrounding object) {
				return createServiceGroundingAdapter();
			}
			@Override
			public Adapter caseProcessModel(ProcessModel object) {
				return createProcessModelAdapter();
			}
			@Override
			public Adapter caseServiceCategory(ServiceCategory object) {
				return createServiceCategoryAdapter();
			}
			@Override
			public Adapter caseServiceParameter(ServiceParameter object) {
				return createServiceParameterAdapter();
			}
			@Override
			public Adapter caseServiceInput(ServiceInput object) {
				return createServiceInputAdapter();
			}
			@Override
			public Adapter caseServiceOutput(ServiceOutput object) {
				return createServiceOutputAdapter();
			}
			@Override
			public Adapter caseServiceCondition(ServiceCondition object) {
				return createServiceConditionAdapter();
			}
			@Override
			public Adapter caseServiceResult(ServiceResult object) {
				return createServiceResultAdapter();
			}
			@Override
			public Adapter caseIOEP(IOEP object) {
				return createIOEPAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.semantics.ServiceProfile <em>Service Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.semantics.ServiceProfile
	 * @generated
	 */
	public Adapter createServiceProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.semantics.ServiceGrounding <em>Service Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.semantics.ServiceGrounding
	 * @generated
	 */
	public Adapter createServiceGroundingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.semantics.ProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.semantics.ProcessModel
	 * @generated
	 */
	public Adapter createProcessModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.semantics.ServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.semantics.ServiceCategory
	 * @generated
	 */
	public Adapter createServiceCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.semantics.ServiceParameter <em>Service Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.semantics.ServiceParameter
	 * @generated
	 */
	public Adapter createServiceParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.semantics.ServiceInput <em>Service Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.semantics.ServiceInput
	 * @generated
	 */
	public Adapter createServiceInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.semantics.ServiceOutput <em>Service Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.semantics.ServiceOutput
	 * @generated
	 */
	public Adapter createServiceOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.semantics.ServiceCondition <em>Service Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.semantics.ServiceCondition
	 * @generated
	 */
	public Adapter createServiceConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.semantics.ServiceResult <em>Service Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.semantics.ServiceResult
	 * @generated
	 */
	public Adapter createServiceResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.semantics.IOEP <em>IOEP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.semantics.IOEP
	 * @generated
	 */
	public Adapter createIOEPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SemanticsAdapterFactory
