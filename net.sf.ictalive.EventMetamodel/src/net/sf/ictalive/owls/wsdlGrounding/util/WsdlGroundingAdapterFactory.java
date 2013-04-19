/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.wsdlGrounding.util;

import net.sf.ictalive.owls.service.ServiceGrounding;

import net.sf.ictalive.owls.wsdlGrounding.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage
 * @generated
 */
public class WsdlGroundingAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WsdlGroundingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlGroundingAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = WsdlGroundingPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
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
	protected WsdlGroundingSwitch<Adapter> modelSwitch =
		new WsdlGroundingSwitch<Adapter>()
		{
			@Override
			public Adapter caseWsdlGrounding(WsdlGrounding object)
			{
				return createWsdlGroundingAdapter();
			}
			@Override
			public Adapter caseWsdlAtomicProcessGrounding(WsdlAtomicProcessGrounding object)
			{
				return createWsdlAtomicProcessGroundingAdapter();
			}
			@Override
			public Adapter caseWsdlOperationRef(WsdlOperationRef object)
			{
				return createWsdlOperationRefAdapter();
			}
			@Override
			public Adapter caseWsdlMessageMap(WsdlMessageMap object)
			{
				return createWsdlMessageMapAdapter();
			}
			@Override
			public Adapter caseWsdlInputMessageMap(WsdlInputMessageMap object)
			{
				return createWsdlInputMessageMapAdapter();
			}
			@Override
			public Adapter caseWsdlOutputMessageMap(WsdlOutputMessageMap object)
			{
				return createWsdlOutputMessageMapAdapter();
			}
			@Override
			public Adapter caseGD(GD object)
			{
				return createGDAdapter();
			}
			@Override
			public Adapter caseServiceGrounding(ServiceGrounding object)
			{
				return createServiceGroundingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
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
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlGrounding <em>Wsdl Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGrounding
	 * @generated
	 */
	public Adapter createWsdlGroundingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding <em>Wsdl Atomic Process Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding
	 * @generated
	 */
	public Adapter createWsdlAtomicProcessGroundingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlOperationRef <em>Wsdl Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlOperationRef
	 * @generated
	 */
	public Adapter createWsdlOperationRefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlMessageMap <em>Wsdl Message Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlMessageMap
	 * @generated
	 */
	public Adapter createWsdlMessageMapAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlInputMessageMap <em>Wsdl Input Message Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlInputMessageMap
	 * @generated
	 */
	public Adapter createWsdlInputMessageMapAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlOutputMessageMap <em>Wsdl Output Message Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlOutputMessageMap
	 * @generated
	 */
	public Adapter createWsdlOutputMessageMapAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.wsdlGrounding.GD <em>GD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.wsdlGrounding.GD
	 * @generated
	 */
	public Adapter createGDAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.service.ServiceGrounding <em>Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.service.ServiceGrounding
	 * @generated
	 */
	public Adapter createServiceGroundingAdapter()
	{
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
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //WsdlGroundingAdapterFactory
