/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.enactment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.runtime.enactment.EnactmentFactory
 * @model kind="package"
 * @generated
 */
public interface EnactmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enactment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/RunTime/enactment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "enactment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnactmentPackage eINSTANCE = net.sf.ictalive.runtime.enactment.impl.EnactmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.enactment.impl.EnactmentImpl <em>Enactment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.enactment.impl.EnactmentImpl
	 * @see net.sf.ictalive.runtime.enactment.impl.EnactmentPackageImpl#getEnactment()
	 * @generated
	 */
	int ENACTMENT = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__SESSION_ID = 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__START_TIME = 2;

	/**
	 * The feature id for the '<em><b>Expire Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__EXPIRE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__FINISH_TIME = 4;

	/**
	 * The number of structural features of the '<em>Enactment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.enactment.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.enactment.impl.ResourceImpl
	 * @see net.sf.ictalive.runtime.enactment.impl.EnactmentPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__URI = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.enactment.impl.ActionEnactmentImpl <em>Action Enactment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.enactment.impl.ActionEnactmentImpl
	 * @see net.sf.ictalive.runtime.enactment.impl.EnactmentPackageImpl#getActionEnactment()
	 * @generated
	 */
	int ACTION_ENACTMENT = 2;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT__RESOURCE = ENACTMENT__RESOURCE;

	/**
	 * The feature id for the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT__SESSION_ID = ENACTMENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT__START_TIME = ENACTMENT__START_TIME;

	/**
	 * The feature id for the '<em><b>Expire Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT__EXPIRE_TIME = ENACTMENT__EXPIRE_TIME;

	/**
	 * The feature id for the '<em><b>Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT__FINISH_TIME = ENACTMENT__FINISH_TIME;

	/**
	 * The feature id for the '<em><b>Grounded Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT__GROUNDED_ACTION = ENACTMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Enactment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT_FEATURE_COUNT = ENACTMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.enactment.impl.PlanEnactmentImpl <em>Plan Enactment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.enactment.impl.PlanEnactmentImpl
	 * @see net.sf.ictalive.runtime.enactment.impl.EnactmentPackageImpl#getPlanEnactment()
	 * @generated
	 */
	int PLAN_ENACTMENT = 3;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ENACTMENT__RESOURCE = ENACTMENT__RESOURCE;

	/**
	 * The feature id for the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ENACTMENT__SESSION_ID = ENACTMENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ENACTMENT__START_TIME = ENACTMENT__START_TIME;

	/**
	 * The feature id for the '<em><b>Expire Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ENACTMENT__EXPIRE_TIME = ENACTMENT__EXPIRE_TIME;

	/**
	 * The feature id for the '<em><b>Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ENACTMENT__FINISH_TIME = ENACTMENT__FINISH_TIME;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ENACTMENT__PLAN = ENACTMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plan Enactment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ENACTMENT_FEATURE_COUNT = ENACTMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.enactment.impl.ServiceInvocationEnactmentImpl <em>Service Invocation Enactment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.enactment.impl.ServiceInvocationEnactmentImpl
	 * @see net.sf.ictalive.runtime.enactment.impl.EnactmentPackageImpl#getServiceInvocationEnactment()
	 * @generated
	 */
	int SERVICE_INVOCATION_ENACTMENT = 4;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION_ENACTMENT__RESOURCE = ENACTMENT__RESOURCE;

	/**
	 * The feature id for the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION_ENACTMENT__SESSION_ID = ENACTMENT__SESSION_ID;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION_ENACTMENT__START_TIME = ENACTMENT__START_TIME;

	/**
	 * The feature id for the '<em><b>Expire Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION_ENACTMENT__EXPIRE_TIME = ENACTMENT__EXPIRE_TIME;

	/**
	 * The feature id for the '<em><b>Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION_ENACTMENT__FINISH_TIME = ENACTMENT__FINISH_TIME;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION_ENACTMENT__SERVICE = ENACTMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Invocation Enactment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION_ENACTMENT_FEATURE_COUNT = ENACTMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.enactment.Enactment <em>Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enactment</em>'.
	 * @see net.sf.ictalive.runtime.enactment.Enactment
	 * @generated
	 */
	EClass getEnactment();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.runtime.enactment.Enactment#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource</em>'.
	 * @see net.sf.ictalive.runtime.enactment.Enactment#getResource()
	 * @see #getEnactment()
	 * @generated
	 */
	EReference getEnactment_Resource();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.enactment.Enactment#getSessionId <em>Session Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Id</em>'.
	 * @see net.sf.ictalive.runtime.enactment.Enactment#getSessionId()
	 * @see #getEnactment()
	 * @generated
	 */
	EAttribute getEnactment_SessionId();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.enactment.Enactment#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see net.sf.ictalive.runtime.enactment.Enactment#getStartTime()
	 * @see #getEnactment()
	 * @generated
	 */
	EAttribute getEnactment_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.enactment.Enactment#getExpireTime <em>Expire Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expire Time</em>'.
	 * @see net.sf.ictalive.runtime.enactment.Enactment#getExpireTime()
	 * @see #getEnactment()
	 * @generated
	 */
	EAttribute getEnactment_ExpireTime();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.enactment.Enactment#getFinishTime <em>Finish Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish Time</em>'.
	 * @see net.sf.ictalive.runtime.enactment.Enactment#getFinishTime()
	 * @see #getEnactment()
	 * @generated
	 */
	EAttribute getEnactment_FinishTime();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.enactment.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see net.sf.ictalive.runtime.enactment.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.enactment.Resource#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see net.sf.ictalive.runtime.enactment.Resource#getUri()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Uri();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.enactment.ActionEnactment <em>Action Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Enactment</em>'.
	 * @see net.sf.ictalive.runtime.enactment.ActionEnactment
	 * @generated
	 */
	EClass getActionEnactment();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.enactment.ActionEnactment#getGroundedAction <em>Grounded Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grounded Action</em>'.
	 * @see net.sf.ictalive.runtime.enactment.ActionEnactment#getGroundedAction()
	 * @see #getActionEnactment()
	 * @generated
	 */
	EReference getActionEnactment_GroundedAction();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.enactment.PlanEnactment <em>Plan Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Enactment</em>'.
	 * @see net.sf.ictalive.runtime.enactment.PlanEnactment
	 * @generated
	 */
	EClass getPlanEnactment();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.enactment.PlanEnactment#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plan</em>'.
	 * @see net.sf.ictalive.runtime.enactment.PlanEnactment#getPlan()
	 * @see #getPlanEnactment()
	 * @generated
	 */
	EReference getPlanEnactment_Plan();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.enactment.ServiceInvocationEnactment <em>Service Invocation Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Invocation Enactment</em>'.
	 * @see net.sf.ictalive.runtime.enactment.ServiceInvocationEnactment
	 * @generated
	 */
	EClass getServiceInvocationEnactment();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.enactment.ServiceInvocationEnactment#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see net.sf.ictalive.runtime.enactment.ServiceInvocationEnactment#getService()
	 * @see #getServiceInvocationEnactment()
	 * @generated
	 */
	EReference getServiceInvocationEnactment_Service();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnactmentFactory getEnactmentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.enactment.impl.EnactmentImpl <em>Enactment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.enactment.impl.EnactmentImpl
		 * @see net.sf.ictalive.runtime.enactment.impl.EnactmentPackageImpl#getEnactment()
		 * @generated
		 */
		EClass ENACTMENT = eINSTANCE.getEnactment();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENACTMENT__RESOURCE = eINSTANCE.getEnactment_Resource();

		/**
		 * The meta object literal for the '<em><b>Session Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENACTMENT__SESSION_ID = eINSTANCE.getEnactment_SessionId();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENACTMENT__START_TIME = eINSTANCE.getEnactment_StartTime();

		/**
		 * The meta object literal for the '<em><b>Expire Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENACTMENT__EXPIRE_TIME = eINSTANCE.getEnactment_ExpireTime();

		/**
		 * The meta object literal for the '<em><b>Finish Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENACTMENT__FINISH_TIME = eINSTANCE.getEnactment_FinishTime();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.enactment.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.enactment.impl.ResourceImpl
		 * @see net.sf.ictalive.runtime.enactment.impl.EnactmentPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__URI = eINSTANCE.getResource_Uri();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.enactment.impl.ActionEnactmentImpl <em>Action Enactment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.enactment.impl.ActionEnactmentImpl
		 * @see net.sf.ictalive.runtime.enactment.impl.EnactmentPackageImpl#getActionEnactment()
		 * @generated
		 */
		EClass ACTION_ENACTMENT = eINSTANCE.getActionEnactment();

		/**
		 * The meta object literal for the '<em><b>Grounded Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ENACTMENT__GROUNDED_ACTION = eINSTANCE.getActionEnactment_GroundedAction();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.enactment.impl.PlanEnactmentImpl <em>Plan Enactment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.enactment.impl.PlanEnactmentImpl
		 * @see net.sf.ictalive.runtime.enactment.impl.EnactmentPackageImpl#getPlanEnactment()
		 * @generated
		 */
		EClass PLAN_ENACTMENT = eINSTANCE.getPlanEnactment();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_ENACTMENT__PLAN = eINSTANCE.getPlanEnactment_Plan();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.enactment.impl.ServiceInvocationEnactmentImpl <em>Service Invocation Enactment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.enactment.impl.ServiceInvocationEnactmentImpl
		 * @see net.sf.ictalive.runtime.enactment.impl.EnactmentPackageImpl#getServiceInvocationEnactment()
		 * @generated
		 */
		EClass SERVICE_INVOCATION_ENACTMENT = eINSTANCE.getServiceInvocationEnactment();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INVOCATION_ENACTMENT__SERVICE = eINSTANCE.getServiceInvocationEnactment_Service();

	}

} //EnactmentPackage
