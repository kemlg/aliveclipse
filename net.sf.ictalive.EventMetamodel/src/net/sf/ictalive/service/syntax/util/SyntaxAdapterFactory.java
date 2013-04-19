/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.syntax.util;

import net.sf.ictalive.service.syntax.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.service.syntax.SyntaxPackage
 * @generated
 */
public class SyntaxAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SyntaxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntaxAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = SyntaxPackage.eINSTANCE;
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
	protected SyntaxSwitch<Adapter> modelSwitch =
		new SyntaxSwitch<Adapter>()
		{
			@Override
			public Adapter caseInterfaceDescription(InterfaceDescription object)
			{
				return createInterfaceDescriptionAdapter();
			}
			@Override
			public Adapter caseOperationDescription(OperationDescription object)
			{
				return createOperationDescriptionAdapter();
			}
			@Override
			public Adapter caseMessage(Message object)
			{
				return createMessageAdapter();
			}
			@Override
			public Adapter caseEndpoint(Endpoint object)
			{
				return createEndpointAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object)
			{
				return createBindingAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.syntax.InterfaceDescription <em>Interface Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.syntax.InterfaceDescription
	 * @generated
	 */
	public Adapter createInterfaceDescriptionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.syntax.OperationDescription <em>Operation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.syntax.OperationDescription
	 * @generated
	 */
	public Adapter createOperationDescriptionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.syntax.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.syntax.Message
	 * @generated
	 */
	public Adapter createMessageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.syntax.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.syntax.Endpoint
	 * @generated
	 */
	public Adapter createEndpointAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.syntax.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.syntax.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter()
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

} //SyntaxAdapterFactory
