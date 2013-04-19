/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.sf.ictalive.EventModel.Fact.FactFactory
 * @model kind="package"
 * @generated
 */
public interface FactPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Fact";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://alive/architecture/fact";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fact";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FactPackage eINSTANCE = net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.FactImpl <em>Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getFact()
	 * @generated
	 */
	int FACT = 0;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__DUE_TO = 0;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__EFFECT = 1;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__RELATE = 2;

	/**
	 * The number of structural features of the '<em>Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.InvocativeActImpl <em>Invocative Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.InvocativeActImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getInvocativeAct()
	 * @generated
	 */
	int INVOCATIVE_ACT = 9;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATIVE_ACT__DUE_TO = FACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATIVE_ACT__EFFECT = FACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATIVE_ACT__RELATE = FACT__RELATE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATIVE_ACT__ACTION = FACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Invocative Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATIVE_ACT_FEATURE_COUNT = FACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.StartedActImpl <em>Started Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.StartedActImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getStartedAct()
	 * @generated
	 */
	int STARTED_ACT = 1;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTED_ACT__DUE_TO = INVOCATIVE_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTED_ACT__EFFECT = INVOCATIVE_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTED_ACT__RELATE = INVOCATIVE_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTED_ACT__ACTION = INVOCATIVE_ACT__ACTION;

	/**
	 * The number of structural features of the '<em>Started Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTED_ACT_FEATURE_COUNT = INVOCATIVE_ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.ExecutedActImpl <em>Executed Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.ExecutedActImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getExecutedAct()
	 * @generated
	 */
	int EXECUTED_ACT = 2;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ACT__DUE_TO = INVOCATIVE_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ACT__EFFECT = INVOCATIVE_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ACT__RELATE = INVOCATIVE_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ACT__ACTION = INVOCATIVE_ACT__ACTION;

	/**
	 * The number of structural features of the '<em>Executed Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ACT_FEATURE_COUNT = INVOCATIVE_ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.FailureActImpl <em>Failure Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.FailureActImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getFailureAct()
	 * @generated
	 */
	int FAILURE_ACT = 3;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_ACT__DUE_TO = INVOCATIVE_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_ACT__EFFECT = INVOCATIVE_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_ACT__RELATE = INVOCATIVE_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_ACT__ACTION = INVOCATIVE_ACT__ACTION;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_ACT__REASON = INVOCATIVE_ACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_ACT_FEATURE_COUNT = INVOCATIVE_ACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.DisasterImpl <em>Disaster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.DisasterImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getDisaster()
	 * @generated
	 */
	int DISASTER = 4;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISASTER__DUE_TO = FACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISASTER__EFFECT = FACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISASTER__RELATE = FACT__RELATE;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISASTER__REASON = FACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disaster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISASTER_FEATURE_COUNT = FACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.NormViolatedImpl <em>Norm Violated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.NormViolatedImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getNormViolated()
	 * @generated
	 */
	int NORM_VIOLATED = 5;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_VIOLATED__DUE_TO = FACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_VIOLATED__EFFECT = FACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_VIOLATED__RELATE = FACT__RELATE;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_VIOLATED__WHO = FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Norm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_VIOLATED__NORM = FACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Norm Violated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_VIOLATED_FEATURE_COUNT = FACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.CommunicativeActImpl <em>Communicative Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.CommunicativeActImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getCommunicativeAct()
	 * @generated
	 */
	int COMMUNICATIVE_ACT = 6;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACT__DUE_TO = FACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACT__EFFECT = FACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACT__RELATE = FACT__RELATE;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACT__SENDER = FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACT__RECEIVER = FACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACT__ACTION = FACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Communicative Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACT_FEATURE_COUNT = FACT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.ReceiveActImpl <em>Receive Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.ReceiveActImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getReceiveAct()
	 * @generated
	 */
	int RECEIVE_ACT = 7;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_ACT__DUE_TO = COMMUNICATIVE_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_ACT__EFFECT = COMMUNICATIVE_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_ACT__RELATE = COMMUNICATIVE_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_ACT__SENDER = COMMUNICATIVE_ACT__SENDER;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_ACT__RECEIVER = COMMUNICATIVE_ACT__RECEIVER;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_ACT__ACTION = COMMUNICATIVE_ACT__ACTION;

	/**
	 * The feature id for the '<em><b>Received Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_ACT__RECEIVED_MESSAGE = COMMUNICATIVE_ACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Receive Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_ACT_FEATURE_COUNT = COMMUNICATIVE_ACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.SendActImpl <em>Send Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.SendActImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getSendAct()
	 * @generated
	 */
	int SEND_ACT = 8;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACT__DUE_TO = COMMUNICATIVE_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACT__EFFECT = COMMUNICATIVE_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACT__RELATE = COMMUNICATIVE_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACT__SENDER = COMMUNICATIVE_ACT__SENDER;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACT__RECEIVER = COMMUNICATIVE_ACT__RECEIVER;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACT__ACTION = COMMUNICATIVE_ACT__ACTION;

	/**
	 * The feature id for the '<em><b>Send Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACT__SEND_MESSAGE = COMMUNICATIVE_ACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACT_FEATURE_COUNT = COMMUNICATIVE_ACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.MessageImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.ContentImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 11;

	/**
	 * The feature id for the '<em><b>Fact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__FACT = 0;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__EFFECT = 1;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.DeadlineViolationImpl <em>Deadline Violation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.DeadlineViolationImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getDeadlineViolation()
	 * @generated
	 */
	int DEADLINE_VIOLATION = 12;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_VIOLATION__DUE_TO = NORM_VIOLATED__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_VIOLATION__EFFECT = NORM_VIOLATED__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_VIOLATION__RELATE = NORM_VIOLATED__RELATE;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_VIOLATION__WHO = NORM_VIOLATED__WHO;

	/**
	 * The feature id for the '<em><b>Norm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_VIOLATION__NORM = NORM_VIOLATED__NORM;

	/**
	 * The feature id for the '<em><b>Dealine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_VIOLATION__DEALINE = NORM_VIOLATED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deadline Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_VIOLATION_FEATURE_COUNT = NORM_VIOLATED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.TaskViolationImpl <em>Task Violation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.TaskViolationImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getTaskViolation()
	 * @generated
	 */
	int TASK_VIOLATION = 13;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION__DUE_TO = NORM_VIOLATED__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION__EFFECT = NORM_VIOLATED__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION__RELATE = NORM_VIOLATED__RELATE;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION__WHO = NORM_VIOLATED__WHO;

	/**
	 * The feature id for the '<em><b>Norm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION__NORM = NORM_VIOLATED__NORM;

	/**
	 * The feature id for the '<em><b>Unmet Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION__UNMET_REQUIREMENT = NORM_VIOLATED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION_FEATURE_COUNT = NORM_VIOLATED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.SessionTimeoutImpl <em>Session Timeout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.SessionTimeoutImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getSessionTimeout()
	 * @generated
	 */
	int SESSION_TIMEOUT = 14;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TIMEOUT__DUE_TO = NORM_VIOLATED__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TIMEOUT__EFFECT = NORM_VIOLATED__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TIMEOUT__RELATE = NORM_VIOLATED__RELATE;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TIMEOUT__WHO = NORM_VIOLATED__WHO;

	/**
	 * The feature id for the '<em><b>Norm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TIMEOUT__NORM = NORM_VIOLATED__NORM;

	/**
	 * The number of structural features of the '<em>Session Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_TIMEOUT_FEATURE_COUNT = NORM_VIOLATED_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.impl.AvailabilityImpl <em>Availability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.impl.AvailabilityImpl
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getAvailability()
	 * @generated
	 */
	int AVAILABILITY = 15;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__DUE_TO = FACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__EFFECT = FACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__RELATE = FACT__RELATE;

	/**
	 * The feature id for the '<em><b>Of Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__OF_RESOURCE = FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stutus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__STUTUS = FACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_FEATURE_COUNT = FACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Fact.AvailabilityKind <em>Availability Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Fact.AvailabilityKind
	 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getAvailabilityKind()
	 * @generated
	 */
	int AVAILABILITY_KIND = 16;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Fact
	 * @generated
	 */
	EClass getFact();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Fact.Fact#getDueTo <em>Due To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Due To</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Fact#getDueTo()
	 * @see #getFact()
	 * @generated
	 */
	EReference getFact_DueTo();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Fact.Fact#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effect</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Fact#getEffect()
	 * @see #getFact()
	 * @generated
	 */
	EReference getFact_Effect();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.EventModel.Fact.Fact#getRelate <em>Relate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relate</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Fact#getRelate()
	 * @see #getFact()
	 * @generated
	 */
	EReference getFact_Relate();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.StartedAct <em>Started Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Started Act</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.StartedAct
	 * @generated
	 */
	EClass getStartedAct();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.ExecutedAct <em>Executed Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executed Act</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.ExecutedAct
	 * @generated
	 */
	EClass getExecutedAct();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.FailureAct <em>Failure Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Act</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.FailureAct
	 * @generated
	 */
	EClass getFailureAct();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Fact.FailureAct#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reason</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.FailureAct#getReason()
	 * @see #getFailureAct()
	 * @generated
	 */
	EReference getFailureAct_Reason();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.Disaster <em>Disaster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disaster</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Disaster
	 * @generated
	 */
	EClass getDisaster();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Fact.Disaster#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reason</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Disaster#getReason()
	 * @see #getDisaster()
	 * @generated
	 */
	EReference getDisaster_Reason();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.NormViolated <em>Norm Violated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Norm Violated</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.NormViolated
	 * @generated
	 */
	EClass getNormViolated();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Fact.NormViolated#getWho <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Who</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.NormViolated#getWho()
	 * @see #getNormViolated()
	 * @generated
	 */
	EReference getNormViolated_Who();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Fact.NormViolated#getNorm <em>Norm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Norm</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.NormViolated#getNorm()
	 * @see #getNormViolated()
	 * @generated
	 */
	EReference getNormViolated_Norm();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.CommunicativeAct <em>Communicative Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communicative Act</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.CommunicativeAct
	 * @generated
	 */
	EClass getCommunicativeAct();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Fact.CommunicativeAct#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.CommunicativeAct#getSender()
	 * @see #getCommunicativeAct()
	 * @generated
	 */
	EReference getCommunicativeAct_Sender();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Fact.CommunicativeAct#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.CommunicativeAct#getReceiver()
	 * @see #getCommunicativeAct()
	 * @generated
	 */
	EReference getCommunicativeAct_Receiver();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.EventModel.Fact.CommunicativeAct#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.CommunicativeAct#getAction()
	 * @see #getCommunicativeAct()
	 * @generated
	 */
	EReference getCommunicativeAct_Action();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.ReceiveAct <em>Receive Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Act</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.ReceiveAct
	 * @generated
	 */
	EClass getReceiveAct();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.EventModel.Fact.ReceiveAct#getReceivedMessage <em>Received Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Received Message</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.ReceiveAct#getReceivedMessage()
	 * @see #getReceiveAct()
	 * @generated
	 */
	EReference getReceiveAct_ReceivedMessage();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.SendAct <em>Send Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Act</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.SendAct
	 * @generated
	 */
	EClass getSendAct();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.EventModel.Fact.SendAct#getSendMessage <em>Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send Message</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.SendAct#getSendMessage()
	 * @see #getSendAct()
	 * @generated
	 */
	EReference getSendAct_SendMessage();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.InvocativeAct <em>Invocative Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocative Act</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.InvocativeAct
	 * @generated
	 */
	EClass getInvocativeAct();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.EventModel.Fact.InvocativeAct#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.InvocativeAct#getAction()
	 * @see #getInvocativeAct()
	 * @generated
	 */
	EReference getInvocativeAct_Action();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.EventModel.Fact.Message#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Message#getObject()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Object();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.EventModel.Fact.Content#getFact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fact</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Content#getFact()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Fact();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.EventModel.Fact.Content#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effect</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Content#getEffect()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Effect();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.DeadlineViolation <em>Deadline Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline Violation</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.DeadlineViolation
	 * @generated
	 */
	EClass getDeadlineViolation();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.EventModel.Fact.DeadlineViolation#getDealine <em>Dealine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dealine</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.DeadlineViolation#getDealine()
	 * @see #getDeadlineViolation()
	 * @generated
	 */
	EAttribute getDeadlineViolation_Dealine();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.TaskViolation <em>Task Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Violation</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.TaskViolation
	 * @generated
	 */
	EClass getTaskViolation();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.EventModel.Fact.TaskViolation#getUnmetRequirement <em>Unmet Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unmet Requirement</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.TaskViolation#getUnmetRequirement()
	 * @see #getTaskViolation()
	 * @generated
	 */
	EReference getTaskViolation_UnmetRequirement();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.SessionTimeout <em>Session Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Timeout</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.SessionTimeout
	 * @generated
	 */
	EClass getSessionTimeout();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Fact.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Availability
	 * @generated
	 */
	EClass getAvailability();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Fact.Availability#getOfResource <em>Of Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Of Resource</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Availability#getOfResource()
	 * @see #getAvailability()
	 * @generated
	 */
	EReference getAvailability_OfResource();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.EventModel.Fact.Availability#getStutus <em>Stutus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stutus</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.Availability#getStutus()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_Stutus();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.EventModel.Fact.AvailabilityKind <em>Availability Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Availability Kind</em>'.
	 * @see net.sf.ictalive.EventModel.Fact.AvailabilityKind
	 * @generated
	 */
	EEnum getAvailabilityKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FactFactory getFactFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.FactImpl <em>Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getFact()
		 * @generated
		 */
		EClass FACT = eINSTANCE.getFact();

		/**
		 * The meta object literal for the '<em><b>Due To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT__DUE_TO = eINSTANCE.getFact_DueTo();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT__EFFECT = eINSTANCE.getFact_Effect();

		/**
		 * The meta object literal for the '<em><b>Relate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT__RELATE = eINSTANCE.getFact_Relate();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.StartedActImpl <em>Started Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.StartedActImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getStartedAct()
		 * @generated
		 */
		EClass STARTED_ACT = eINSTANCE.getStartedAct();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.ExecutedActImpl <em>Executed Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.ExecutedActImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getExecutedAct()
		 * @generated
		 */
		EClass EXECUTED_ACT = eINSTANCE.getExecutedAct();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.FailureActImpl <em>Failure Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.FailureActImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getFailureAct()
		 * @generated
		 */
		EClass FAILURE_ACT = eINSTANCE.getFailureAct();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_ACT__REASON = eINSTANCE.getFailureAct_Reason();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.DisasterImpl <em>Disaster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.DisasterImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getDisaster()
		 * @generated
		 */
		EClass DISASTER = eINSTANCE.getDisaster();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISASTER__REASON = eINSTANCE.getDisaster_Reason();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.NormViolatedImpl <em>Norm Violated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.NormViolatedImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getNormViolated()
		 * @generated
		 */
		EClass NORM_VIOLATED = eINSTANCE.getNormViolated();

		/**
		 * The meta object literal for the '<em><b>Who</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM_VIOLATED__WHO = eINSTANCE.getNormViolated_Who();

		/**
		 * The meta object literal for the '<em><b>Norm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM_VIOLATED__NORM = eINSTANCE.getNormViolated_Norm();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.CommunicativeActImpl <em>Communicative Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.CommunicativeActImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getCommunicativeAct()
		 * @generated
		 */
		EClass COMMUNICATIVE_ACT = eINSTANCE.getCommunicativeAct();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATIVE_ACT__SENDER = eINSTANCE.getCommunicativeAct_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATIVE_ACT__RECEIVER = eINSTANCE.getCommunicativeAct_Receiver();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATIVE_ACT__ACTION = eINSTANCE.getCommunicativeAct_Action();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.ReceiveActImpl <em>Receive Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.ReceiveActImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getReceiveAct()
		 * @generated
		 */
		EClass RECEIVE_ACT = eINSTANCE.getReceiveAct();

		/**
		 * The meta object literal for the '<em><b>Received Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_ACT__RECEIVED_MESSAGE = eINSTANCE.getReceiveAct_ReceivedMessage();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.SendActImpl <em>Send Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.SendActImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getSendAct()
		 * @generated
		 */
		EClass SEND_ACT = eINSTANCE.getSendAct();

		/**
		 * The meta object literal for the '<em><b>Send Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_ACT__SEND_MESSAGE = eINSTANCE.getSendAct_SendMessage();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.InvocativeActImpl <em>Invocative Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.InvocativeActImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getInvocativeAct()
		 * @generated
		 */
		EClass INVOCATIVE_ACT = eINSTANCE.getInvocativeAct();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATIVE_ACT__ACTION = eINSTANCE.getInvocativeAct_Action();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.MessageImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__OBJECT = eINSTANCE.getMessage_Object();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.ContentImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Fact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__FACT = eINSTANCE.getContent_Fact();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__EFFECT = eINSTANCE.getContent_Effect();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.DeadlineViolationImpl <em>Deadline Violation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.DeadlineViolationImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getDeadlineViolation()
		 * @generated
		 */
		EClass DEADLINE_VIOLATION = eINSTANCE.getDeadlineViolation();

		/**
		 * The meta object literal for the '<em><b>Dealine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEADLINE_VIOLATION__DEALINE = eINSTANCE.getDeadlineViolation_Dealine();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.TaskViolationImpl <em>Task Violation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.TaskViolationImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getTaskViolation()
		 * @generated
		 */
		EClass TASK_VIOLATION = eINSTANCE.getTaskViolation();

		/**
		 * The meta object literal for the '<em><b>Unmet Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_VIOLATION__UNMET_REQUIREMENT = eINSTANCE.getTaskViolation_UnmetRequirement();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.SessionTimeoutImpl <em>Session Timeout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.SessionTimeoutImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getSessionTimeout()
		 * @generated
		 */
		EClass SESSION_TIMEOUT = eINSTANCE.getSessionTimeout();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.impl.AvailabilityImpl <em>Availability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.impl.AvailabilityImpl
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getAvailability()
		 * @generated
		 */
		EClass AVAILABILITY = eINSTANCE.getAvailability();

		/**
		 * The meta object literal for the '<em><b>Of Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY__OF_RESOURCE = eINSTANCE.getAvailability_OfResource();

		/**
		 * The meta object literal for the '<em><b>Stutus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__STUTUS = eINSTANCE.getAvailability_Stutus();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Fact.AvailabilityKind <em>Availability Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Fact.AvailabilityKind
		 * @see net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl#getAvailabilityKind()
		 * @generated
		 */
		EEnum AVAILABILITY_KIND = eINSTANCE.getAvailabilityKind();

	}

} //FactPackage
