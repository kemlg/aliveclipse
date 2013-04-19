/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

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
 * @see net.sf.ictalive.runtime.fact.FactFactory
 * @model kind="package"
 * @generated
 */
public interface FactPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fact";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/RunTime/facts";

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
	FactPackage eINSTANCE = net.sf.ictalive.runtime.fact.impl.FactPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.FactImpl <em>Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.FactImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getFact()
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
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.InvocativeActImpl <em>Invocative Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.InvocativeActImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getInvocativeAct()
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
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATIVE_ACT__RELATE = FACT__RELATE;

	/**
	 * The number of structural features of the '<em>Invocative Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATIVE_ACT_FEATURE_COUNT = FACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.StartedActImpl <em>Started Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.StartedActImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getStartedAct()
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
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTED_ACT__RELATE = INVOCATIVE_ACT__RELATE;

	/**
	 * The number of structural features of the '<em>Started Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTED_ACT_FEATURE_COUNT = INVOCATIVE_ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.ExecutedActImpl <em>Executed Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.ExecutedActImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getExecutedAct()
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
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ACT__RELATE = INVOCATIVE_ACT__RELATE;

	/**
	 * The number of structural features of the '<em>Executed Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ACT_FEATURE_COUNT = INVOCATIVE_ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.FailureActImpl <em>Failure Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.FailureActImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getFailureAct()
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
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_ACT__RELATE = INVOCATIVE_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_ACT__REASON = INVOCATIVE_ACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_ACT__FAILURE_REASON = INVOCATIVE_ACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failure Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_ACT_FEATURE_COUNT = INVOCATIVE_ACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.DisasterImpl <em>Disaster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.DisasterImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getDisaster()
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
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.NormActImpl <em>Norm Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.NormActImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormAct()
	 * @generated
	 */
	int NORM_ACT = 5;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_ACT__DUE_TO = FACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_ACT__EFFECT = FACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_ACT__RELATE = FACT__RELATE;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_ACT__WHO = FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Norm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_ACT__NORM = FACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Norm Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_ACT_FEATURE_COUNT = FACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.CommunicativeActImpl <em>Communicative Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.CommunicativeActImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getCommunicativeAct()
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
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
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
	 * The number of structural features of the '<em>Communicative Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACT_FEATURE_COUNT = FACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.ReceiveActImpl <em>Receive Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.ReceiveActImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getReceiveAct()
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
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.SendActImpl <em>Send Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.SendActImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getSendAct()
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
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.MessageImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getMessage()
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
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__BODY = 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.ContentImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getContent()
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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.DeadlineViolationImpl <em>Deadline Violation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.DeadlineViolationImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getDeadlineViolation()
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
	int DEADLINE_VIOLATION__DUE_TO = NORM_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_VIOLATION__EFFECT = NORM_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_VIOLATION__RELATE = NORM_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_VIOLATION__WHO = NORM_ACT__WHO;

	/**
	 * The feature id for the '<em><b>Norm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_VIOLATION__NORM = NORM_ACT__NORM;

	/**
	 * The feature id for the '<em><b>Dealine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_VIOLATION__DEALINE = NORM_ACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deadline Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_VIOLATION_FEATURE_COUNT = NORM_ACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.TaskViolationImpl <em>Task Violation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.TaskViolationImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getTaskViolation()
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
	int TASK_VIOLATION__DUE_TO = NORM_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION__EFFECT = NORM_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION__RELATE = NORM_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION__WHO = NORM_ACT__WHO;

	/**
	 * The feature id for the '<em><b>Norm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION__NORM = NORM_ACT__NORM;

	/**
	 * The feature id for the '<em><b>Unmet Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION__UNMET_REQUIREMENT = NORM_ACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION__TASK = NORM_ACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIOLATION_FEATURE_COUNT = NORM_ACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.AvailabilityImpl <em>Availability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.AvailabilityImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getAvailability()
	 * @generated
	 */
	int AVAILABILITY = 14;

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
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
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
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__STATUS = FACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_FEATURE_COUNT = FACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.FulfilmentActImpl <em>Fulfilment Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.FulfilmentActImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getFulfilmentAct()
	 * @generated
	 */
	int FULFILMENT_ACT = 15;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILMENT_ACT__DUE_TO = FACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILMENT_ACT__EFFECT = FACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILMENT_ACT__RELATE = FACT__RELATE;

	/**
	 * The feature id for the '<em><b>Related Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILMENT_ACT__RELATED_EVENT = FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satisfy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILMENT_ACT__SATISFY = FACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fulfilment Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILMENT_ACT_FEATURE_COUNT = FACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.LandmarkFulfilmentImpl <em>Landmark Fulfilment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.LandmarkFulfilmentImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getLandmarkFulfilment()
	 * @generated
	 */
	int LANDMARK_FULFILMENT = 16;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_FULFILMENT__DUE_TO = FULFILMENT_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_FULFILMENT__EFFECT = FULFILMENT_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_FULFILMENT__RELATE = FULFILMENT_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Related Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_FULFILMENT__RELATED_EVENT = FULFILMENT_ACT__RELATED_EVENT;

	/**
	 * The feature id for the '<em><b>Satisfy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_FULFILMENT__SATISFY = FULFILMENT_ACT__SATISFY;

	/**
	 * The feature id for the '<em><b>Landmark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_FULFILMENT__LANDMARK = FULFILMENT_ACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Landmark Fulfilment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDMARK_FULFILMENT_FEATURE_COUNT = FULFILMENT_ACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.NormConditionFulfilmentImpl <em>Norm Condition Fulfilment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.NormConditionFulfilmentImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormConditionFulfilment()
	 * @generated
	 */
	int NORM_CONDITION_FULFILMENT = 17;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_CONDITION_FULFILMENT__DUE_TO = FULFILMENT_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_CONDITION_FULFILMENT__EFFECT = FULFILMENT_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_CONDITION_FULFILMENT__RELATE = FULFILMENT_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Related Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_CONDITION_FULFILMENT__RELATED_EVENT = FULFILMENT_ACT__RELATED_EVENT;

	/**
	 * The feature id for the '<em><b>Satisfy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_CONDITION_FULFILMENT__SATISFY = FULFILMENT_ACT__SATISFY;

	/**
	 * The feature id for the '<em><b>Norm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_CONDITION_FULFILMENT__NORM = FULFILMENT_ACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_CONDITION_FULFILMENT__TYPE = FULFILMENT_ACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Norm Condition Fulfilment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_CONDITION_FULFILMENT_FEATURE_COUNT = FULFILMENT_ACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.ObjectiveFulfilmentImpl <em>Objective Fulfilment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.ObjectiveFulfilmentImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getObjectiveFulfilment()
	 * @generated
	 */
	int OBJECTIVE_FULFILMENT = 18;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FULFILMENT__DUE_TO = FULFILMENT_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FULFILMENT__EFFECT = FULFILMENT_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FULFILMENT__RELATE = FULFILMENT_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Related Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FULFILMENT__RELATED_EVENT = FULFILMENT_ACT__RELATED_EVENT;

	/**
	 * The feature id for the '<em><b>Satisfy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FULFILMENT__SATISFY = FULFILMENT_ACT__SATISFY;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FULFILMENT__OBJECTIVE = FULFILMENT_ACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Objective Fulfilment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FULFILMENT_FEATURE_COUNT = FULFILMENT_ACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.OrganisationActImpl <em>Organisation Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.OrganisationActImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getOrganisationAct()
	 * @generated
	 */
	int ORGANISATION_ACT = 19;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_ACT__DUE_TO = FACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_ACT__EFFECT = FACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_ACT__RELATE = FACT__RELATE;

	/**
	 * The number of structural features of the '<em>Organisation Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_ACT_FEATURE_COUNT = FACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.PlayerFulfilmentImpl <em>Player Fulfilment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.PlayerFulfilmentImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getPlayerFulfilment()
	 * @generated
	 */
	int PLAYER_FULFILMENT = 20;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FULFILMENT__DUE_TO = ORGANISATION_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FULFILMENT__EFFECT = ORGANISATION_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FULFILMENT__RELATE = ORGANISATION_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FULFILMENT__PLAYER = ORGANISATION_ACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satisfy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FULFILMENT__SATISFY = ORGANISATION_ACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Player Fulfilment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FULFILMENT_FEATURE_COUNT = ORGANISATION_ACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.NormInstanceActImpl <em>Norm Instance Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.NormInstanceActImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormInstanceAct()
	 * @generated
	 */
	int NORM_INSTANCE_ACT = 21;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_ACT__DUE_TO = FACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_ACT__EFFECT = FACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_ACT__RELATE = FACT__RELATE;

	/**
	 * The feature id for the '<em><b>Norm Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_ACT__NORM_INSTANCE = FACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Norm Instance Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_ACT_FEATURE_COUNT = FACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.NormInstanceViolatedImpl <em>Norm Instance Violated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.NormInstanceViolatedImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormInstanceViolated()
	 * @generated
	 */
	int NORM_INSTANCE_VIOLATED = 22;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_VIOLATED__DUE_TO = NORM_INSTANCE_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_VIOLATED__EFFECT = NORM_INSTANCE_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_VIOLATED__RELATE = NORM_INSTANCE_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Norm Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_VIOLATED__NORM_INSTANCE = NORM_INSTANCE_ACT__NORM_INSTANCE;

	/**
	 * The number of structural features of the '<em>Norm Instance Violated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_VIOLATED_FEATURE_COUNT = NORM_INSTANCE_ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.NormInstanceActivatedImpl <em>Norm Instance Activated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.NormInstanceActivatedImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormInstanceActivated()
	 * @generated
	 */
	int NORM_INSTANCE_ACTIVATED = 23;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_ACTIVATED__DUE_TO = NORM_INSTANCE_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_ACTIVATED__EFFECT = NORM_INSTANCE_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_ACTIVATED__RELATE = NORM_INSTANCE_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Norm Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_ACTIVATED__NORM_INSTANCE = NORM_INSTANCE_ACT__NORM_INSTANCE;

	/**
	 * The number of structural features of the '<em>Norm Instance Activated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_ACTIVATED_FEATURE_COUNT = NORM_INSTANCE_ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.impl.NormInstanceExpiredImpl <em>Norm Instance Expired</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.impl.NormInstanceExpiredImpl
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormInstanceExpired()
	 * @generated
	 */
	int NORM_INSTANCE_EXPIRED = 24;

	/**
	 * The feature id for the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_EXPIRED__DUE_TO = NORM_INSTANCE_ACT__DUE_TO;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_EXPIRED__EFFECT = NORM_INSTANCE_ACT__EFFECT;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_EXPIRED__RELATE = NORM_INSTANCE_ACT__RELATE;

	/**
	 * The feature id for the '<em><b>Norm Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_EXPIRED__NORM_INSTANCE = NORM_INSTANCE_ACT__NORM_INSTANCE;

	/**
	 * The number of structural features of the '<em>Norm Instance Expired</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_INSTANCE_EXPIRED_FEATURE_COUNT = NORM_INSTANCE_ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.AvailabilityKind <em>Availability Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.AvailabilityKind
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getAvailabilityKind()
	 * @generated
	 */
	int AVAILABILITY_KIND = 25;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.NormType <em>Norm Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.NormType
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormType()
	 * @generated
	 */
	int NORM_TYPE = 26;


	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.fact.FailureReasons <em>Failure Reasons</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.fact.FailureReasons
	 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getFailureReasons()
	 * @generated
	 */
	int FAILURE_REASONS = 27;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact</em>'.
	 * @see net.sf.ictalive.runtime.fact.Fact
	 * @generated
	 */
	EClass getFact();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.Fact#getDueTo <em>Due To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Due To</em>'.
	 * @see net.sf.ictalive.runtime.fact.Fact#getDueTo()
	 * @see #getFact()
	 * @generated
	 */
	EReference getFact_DueTo();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.Fact#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effect</em>'.
	 * @see net.sf.ictalive.runtime.fact.Fact#getEffect()
	 * @see #getFact()
	 * @generated
	 */
	EReference getFact_Effect();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.runtime.fact.Fact#getRelate <em>Relate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relate</em>'.
	 * @see net.sf.ictalive.runtime.fact.Fact#getRelate()
	 * @see #getFact()
	 * @generated
	 */
	EReference getFact_Relate();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.StartedAct <em>Started Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Started Act</em>'.
	 * @see net.sf.ictalive.runtime.fact.StartedAct
	 * @generated
	 */
	EClass getStartedAct();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.ExecutedAct <em>Executed Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executed Act</em>'.
	 * @see net.sf.ictalive.runtime.fact.ExecutedAct
	 * @generated
	 */
	EClass getExecutedAct();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.FailureAct <em>Failure Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Act</em>'.
	 * @see net.sf.ictalive.runtime.fact.FailureAct
	 * @generated
	 */
	EClass getFailureAct();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.FailureAct#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reason</em>'.
	 * @see net.sf.ictalive.runtime.fact.FailureAct#getReason()
	 * @see #getFailureAct()
	 * @generated
	 */
	EReference getFailureAct_Reason();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.fact.FailureAct#getFailureReason <em>Failure Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Reason</em>'.
	 * @see net.sf.ictalive.runtime.fact.FailureAct#getFailureReason()
	 * @see #getFailureAct()
	 * @generated
	 */
	EAttribute getFailureAct_FailureReason();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.Disaster <em>Disaster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disaster</em>'.
	 * @see net.sf.ictalive.runtime.fact.Disaster
	 * @generated
	 */
	EClass getDisaster();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.Disaster#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reason</em>'.
	 * @see net.sf.ictalive.runtime.fact.Disaster#getReason()
	 * @see #getDisaster()
	 * @generated
	 */
	EReference getDisaster_Reason();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.NormAct <em>Norm Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Norm Act</em>'.
	 * @see net.sf.ictalive.runtime.fact.NormAct
	 * @generated
	 */
	EClass getNormAct();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.NormAct#getWho <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Who</em>'.
	 * @see net.sf.ictalive.runtime.fact.NormAct#getWho()
	 * @see #getNormAct()
	 * @generated
	 */
	EReference getNormAct_Who();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.NormAct#getNorm <em>Norm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Norm</em>'.
	 * @see net.sf.ictalive.runtime.fact.NormAct#getNorm()
	 * @see #getNormAct()
	 * @generated
	 */
	EReference getNormAct_Norm();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.CommunicativeAct <em>Communicative Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communicative Act</em>'.
	 * @see net.sf.ictalive.runtime.fact.CommunicativeAct
	 * @generated
	 */
	EClass getCommunicativeAct();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.CommunicativeAct#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see net.sf.ictalive.runtime.fact.CommunicativeAct#getSender()
	 * @see #getCommunicativeAct()
	 * @generated
	 */
	EReference getCommunicativeAct_Sender();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.CommunicativeAct#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see net.sf.ictalive.runtime.fact.CommunicativeAct#getReceiver()
	 * @see #getCommunicativeAct()
	 * @generated
	 */
	EReference getCommunicativeAct_Receiver();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.ReceiveAct <em>Receive Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Act</em>'.
	 * @see net.sf.ictalive.runtime.fact.ReceiveAct
	 * @generated
	 */
	EClass getReceiveAct();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.runtime.fact.ReceiveAct#getReceivedMessage <em>Received Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Received Message</em>'.
	 * @see net.sf.ictalive.runtime.fact.ReceiveAct#getReceivedMessage()
	 * @see #getReceiveAct()
	 * @generated
	 */
	EReference getReceiveAct_ReceivedMessage();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.SendAct <em>Send Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Act</em>'.
	 * @see net.sf.ictalive.runtime.fact.SendAct
	 * @generated
	 */
	EClass getSendAct();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.runtime.fact.SendAct#getSendMessage <em>Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send Message</em>'.
	 * @see net.sf.ictalive.runtime.fact.SendAct#getSendMessage()
	 * @see #getSendAct()
	 * @generated
	 */
	EReference getSendAct_SendMessage();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.InvocativeAct <em>Invocative Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocative Act</em>'.
	 * @see net.sf.ictalive.runtime.fact.InvocativeAct
	 * @generated
	 */
	EClass getInvocativeAct();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see net.sf.ictalive.runtime.fact.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.runtime.fact.Message#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object</em>'.
	 * @see net.sf.ictalive.runtime.fact.Message#getObject()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Object();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.fact.Message#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see net.sf.ictalive.runtime.fact.Message#getBody()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Body();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see net.sf.ictalive.runtime.fact.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.runtime.fact.Content#getFact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fact</em>'.
	 * @see net.sf.ictalive.runtime.fact.Content#getFact()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Fact();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.runtime.fact.Content#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effect</em>'.
	 * @see net.sf.ictalive.runtime.fact.Content#getEffect()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Effect();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.DeadlineViolation <em>Deadline Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline Violation</em>'.
	 * @see net.sf.ictalive.runtime.fact.DeadlineViolation
	 * @generated
	 */
	EClass getDeadlineViolation();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.fact.DeadlineViolation#getDealine <em>Dealine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dealine</em>'.
	 * @see net.sf.ictalive.runtime.fact.DeadlineViolation#getDealine()
	 * @see #getDeadlineViolation()
	 * @generated
	 */
	EAttribute getDeadlineViolation_Dealine();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.TaskViolation <em>Task Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Violation</em>'.
	 * @see net.sf.ictalive.runtime.fact.TaskViolation
	 * @generated
	 */
	EClass getTaskViolation();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.runtime.fact.TaskViolation#getUnmetRequirement <em>Unmet Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unmet Requirement</em>'.
	 * @see net.sf.ictalive.runtime.fact.TaskViolation#getUnmetRequirement()
	 * @see #getTaskViolation()
	 * @generated
	 */
	EReference getTaskViolation_UnmetRequirement();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.TaskViolation#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see net.sf.ictalive.runtime.fact.TaskViolation#getTask()
	 * @see #getTaskViolation()
	 * @generated
	 */
	EReference getTaskViolation_Task();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability</em>'.
	 * @see net.sf.ictalive.runtime.fact.Availability
	 * @generated
	 */
	EClass getAvailability();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.Availability#getOfResource <em>Of Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Of Resource</em>'.
	 * @see net.sf.ictalive.runtime.fact.Availability#getOfResource()
	 * @see #getAvailability()
	 * @generated
	 */
	EReference getAvailability_OfResource();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.fact.Availability#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.ictalive.runtime.fact.Availability#getStatus()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_Status();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.FulfilmentAct <em>Fulfilment Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfilment Act</em>'.
	 * @see net.sf.ictalive.runtime.fact.FulfilmentAct
	 * @generated
	 */
	EClass getFulfilmentAct();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.runtime.fact.FulfilmentAct#getRelatedEvent <em>Related Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Event</em>'.
	 * @see net.sf.ictalive.runtime.fact.FulfilmentAct#getRelatedEvent()
	 * @see #getFulfilmentAct()
	 * @generated
	 */
	EReference getFulfilmentAct_RelatedEvent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.fact.FulfilmentAct#isSatisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfy</em>'.
	 * @see net.sf.ictalive.runtime.fact.FulfilmentAct#isSatisfy()
	 * @see #getFulfilmentAct()
	 * @generated
	 */
	EAttribute getFulfilmentAct_Satisfy();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.LandmarkFulfilment <em>Landmark Fulfilment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Landmark Fulfilment</em>'.
	 * @see net.sf.ictalive.runtime.fact.LandmarkFulfilment
	 * @generated
	 */
	EClass getLandmarkFulfilment();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.LandmarkFulfilment#getLandmark <em>Landmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Landmark</em>'.
	 * @see net.sf.ictalive.runtime.fact.LandmarkFulfilment#getLandmark()
	 * @see #getLandmarkFulfilment()
	 * @generated
	 */
	EReference getLandmarkFulfilment_Landmark();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.NormConditionFulfilment <em>Norm Condition Fulfilment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Norm Condition Fulfilment</em>'.
	 * @see net.sf.ictalive.runtime.fact.NormConditionFulfilment
	 * @generated
	 */
	EClass getNormConditionFulfilment();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.NormConditionFulfilment#getNorm <em>Norm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Norm</em>'.
	 * @see net.sf.ictalive.runtime.fact.NormConditionFulfilment#getNorm()
	 * @see #getNormConditionFulfilment()
	 * @generated
	 */
	EReference getNormConditionFulfilment_Norm();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.fact.NormConditionFulfilment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.ictalive.runtime.fact.NormConditionFulfilment#getType()
	 * @see #getNormConditionFulfilment()
	 * @generated
	 */
	EAttribute getNormConditionFulfilment_Type();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.ObjectiveFulfilment <em>Objective Fulfilment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Fulfilment</em>'.
	 * @see net.sf.ictalive.runtime.fact.ObjectiveFulfilment
	 * @generated
	 */
	EClass getObjectiveFulfilment();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.ObjectiveFulfilment#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objective</em>'.
	 * @see net.sf.ictalive.runtime.fact.ObjectiveFulfilment#getObjective()
	 * @see #getObjectiveFulfilment()
	 * @generated
	 */
	EReference getObjectiveFulfilment_Objective();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.OrganisationAct <em>Organisation Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation Act</em>'.
	 * @see net.sf.ictalive.runtime.fact.OrganisationAct
	 * @generated
	 */
	EClass getOrganisationAct();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.PlayerFulfilment <em>Player Fulfilment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Fulfilment</em>'.
	 * @see net.sf.ictalive.runtime.fact.PlayerFulfilment
	 * @generated
	 */
	EClass getPlayerFulfilment();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.PlayerFulfilment#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see net.sf.ictalive.runtime.fact.PlayerFulfilment#getPlayer()
	 * @see #getPlayerFulfilment()
	 * @generated
	 */
	EReference getPlayerFulfilment_Player();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.fact.PlayerFulfilment#isSatisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfy</em>'.
	 * @see net.sf.ictalive.runtime.fact.PlayerFulfilment#isSatisfy()
	 * @see #getPlayerFulfilment()
	 * @generated
	 */
	EAttribute getPlayerFulfilment_Satisfy();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.NormInstanceAct <em>Norm Instance Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Norm Instance Act</em>'.
	 * @see net.sf.ictalive.runtime.fact.NormInstanceAct
	 * @generated
	 */
	EClass getNormInstanceAct();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.fact.NormInstanceAct#getNormInstance <em>Norm Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Norm Instance</em>'.
	 * @see net.sf.ictalive.runtime.fact.NormInstanceAct#getNormInstance()
	 * @see #getNormInstanceAct()
	 * @generated
	 */
	EReference getNormInstanceAct_NormInstance();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.NormInstanceViolated <em>Norm Instance Violated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Norm Instance Violated</em>'.
	 * @see net.sf.ictalive.runtime.fact.NormInstanceViolated
	 * @generated
	 */
	EClass getNormInstanceViolated();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.NormInstanceActivated <em>Norm Instance Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Norm Instance Activated</em>'.
	 * @see net.sf.ictalive.runtime.fact.NormInstanceActivated
	 * @generated
	 */
	EClass getNormInstanceActivated();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.fact.NormInstanceExpired <em>Norm Instance Expired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Norm Instance Expired</em>'.
	 * @see net.sf.ictalive.runtime.fact.NormInstanceExpired
	 * @generated
	 */
	EClass getNormInstanceExpired();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.runtime.fact.AvailabilityKind <em>Availability Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Availability Kind</em>'.
	 * @see net.sf.ictalive.runtime.fact.AvailabilityKind
	 * @generated
	 */
	EEnum getAvailabilityKind();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.runtime.fact.NormType <em>Norm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Norm Type</em>'.
	 * @see net.sf.ictalive.runtime.fact.NormType
	 * @generated
	 */
	EEnum getNormType();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.runtime.fact.FailureReasons <em>Failure Reasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Failure Reasons</em>'.
	 * @see net.sf.ictalive.runtime.fact.FailureReasons
	 * @generated
	 */
	EEnum getFailureReasons();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.FactImpl <em>Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.FactImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getFact()
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
		 * The meta object literal for the '<em><b>Relate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT__RELATE = eINSTANCE.getFact_Relate();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.StartedActImpl <em>Started Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.StartedActImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getStartedAct()
		 * @generated
		 */
		EClass STARTED_ACT = eINSTANCE.getStartedAct();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.ExecutedActImpl <em>Executed Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.ExecutedActImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getExecutedAct()
		 * @generated
		 */
		EClass EXECUTED_ACT = eINSTANCE.getExecutedAct();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.FailureActImpl <em>Failure Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.FailureActImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getFailureAct()
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
		 * The meta object literal for the '<em><b>Failure Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_ACT__FAILURE_REASON = eINSTANCE.getFailureAct_FailureReason();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.DisasterImpl <em>Disaster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.DisasterImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getDisaster()
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
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.NormActImpl <em>Norm Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.NormActImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormAct()
		 * @generated
		 */
		EClass NORM_ACT = eINSTANCE.getNormAct();

		/**
		 * The meta object literal for the '<em><b>Who</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM_ACT__WHO = eINSTANCE.getNormAct_Who();

		/**
		 * The meta object literal for the '<em><b>Norm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM_ACT__NORM = eINSTANCE.getNormAct_Norm();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.CommunicativeActImpl <em>Communicative Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.CommunicativeActImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getCommunicativeAct()
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
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.ReceiveActImpl <em>Receive Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.ReceiveActImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getReceiveAct()
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
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.SendActImpl <em>Send Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.SendActImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getSendAct()
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
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.InvocativeActImpl <em>Invocative Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.InvocativeActImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getInvocativeAct()
		 * @generated
		 */
		EClass INVOCATIVE_ACT = eINSTANCE.getInvocativeAct();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.MessageImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getMessage()
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
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__BODY = eINSTANCE.getMessage_Body();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.ContentImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getContent()
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
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.DeadlineViolationImpl <em>Deadline Violation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.DeadlineViolationImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getDeadlineViolation()
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
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.TaskViolationImpl <em>Task Violation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.TaskViolationImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getTaskViolation()
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
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_VIOLATION__TASK = eINSTANCE.getTaskViolation_Task();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.AvailabilityImpl <em>Availability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.AvailabilityImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getAvailability()
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
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__STATUS = eINSTANCE.getAvailability_Status();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.FulfilmentActImpl <em>Fulfilment Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.FulfilmentActImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getFulfilmentAct()
		 * @generated
		 */
		EClass FULFILMENT_ACT = eINSTANCE.getFulfilmentAct();

		/**
		 * The meta object literal for the '<em><b>Related Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILMENT_ACT__RELATED_EVENT = eINSTANCE.getFulfilmentAct_RelatedEvent();

		/**
		 * The meta object literal for the '<em><b>Satisfy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILMENT_ACT__SATISFY = eINSTANCE.getFulfilmentAct_Satisfy();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.LandmarkFulfilmentImpl <em>Landmark Fulfilment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.LandmarkFulfilmentImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getLandmarkFulfilment()
		 * @generated
		 */
		EClass LANDMARK_FULFILMENT = eINSTANCE.getLandmarkFulfilment();

		/**
		 * The meta object literal for the '<em><b>Landmark</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDMARK_FULFILMENT__LANDMARK = eINSTANCE.getLandmarkFulfilment_Landmark();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.NormConditionFulfilmentImpl <em>Norm Condition Fulfilment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.NormConditionFulfilmentImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormConditionFulfilment()
		 * @generated
		 */
		EClass NORM_CONDITION_FULFILMENT = eINSTANCE.getNormConditionFulfilment();

		/**
		 * The meta object literal for the '<em><b>Norm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM_CONDITION_FULFILMENT__NORM = eINSTANCE.getNormConditionFulfilment_Norm();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORM_CONDITION_FULFILMENT__TYPE = eINSTANCE.getNormConditionFulfilment_Type();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.ObjectiveFulfilmentImpl <em>Objective Fulfilment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.ObjectiveFulfilmentImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getObjectiveFulfilment()
		 * @generated
		 */
		EClass OBJECTIVE_FULFILMENT = eINSTANCE.getObjectiveFulfilment();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE_FULFILMENT__OBJECTIVE = eINSTANCE.getObjectiveFulfilment_Objective();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.OrganisationActImpl <em>Organisation Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.OrganisationActImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getOrganisationAct()
		 * @generated
		 */
		EClass ORGANISATION_ACT = eINSTANCE.getOrganisationAct();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.PlayerFulfilmentImpl <em>Player Fulfilment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.PlayerFulfilmentImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getPlayerFulfilment()
		 * @generated
		 */
		EClass PLAYER_FULFILMENT = eINSTANCE.getPlayerFulfilment();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_FULFILMENT__PLAYER = eINSTANCE.getPlayerFulfilment_Player();

		/**
		 * The meta object literal for the '<em><b>Satisfy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_FULFILMENT__SATISFY = eINSTANCE.getPlayerFulfilment_Satisfy();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.NormInstanceActImpl <em>Norm Instance Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.NormInstanceActImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormInstanceAct()
		 * @generated
		 */
		EClass NORM_INSTANCE_ACT = eINSTANCE.getNormInstanceAct();

		/**
		 * The meta object literal for the '<em><b>Norm Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM_INSTANCE_ACT__NORM_INSTANCE = eINSTANCE.getNormInstanceAct_NormInstance();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.NormInstanceViolatedImpl <em>Norm Instance Violated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.NormInstanceViolatedImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormInstanceViolated()
		 * @generated
		 */
		EClass NORM_INSTANCE_VIOLATED = eINSTANCE.getNormInstanceViolated();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.NormInstanceActivatedImpl <em>Norm Instance Activated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.NormInstanceActivatedImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormInstanceActivated()
		 * @generated
		 */
		EClass NORM_INSTANCE_ACTIVATED = eINSTANCE.getNormInstanceActivated();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.impl.NormInstanceExpiredImpl <em>Norm Instance Expired</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.impl.NormInstanceExpiredImpl
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormInstanceExpired()
		 * @generated
		 */
		EClass NORM_INSTANCE_EXPIRED = eINSTANCE.getNormInstanceExpired();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.AvailabilityKind <em>Availability Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.AvailabilityKind
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getAvailabilityKind()
		 * @generated
		 */
		EEnum AVAILABILITY_KIND = eINSTANCE.getAvailabilityKind();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.NormType <em>Norm Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.NormType
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getNormType()
		 * @generated
		 */
		EEnum NORM_TYPE = eINSTANCE.getNormType();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.fact.FailureReasons <em>Failure Reasons</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.fact.FailureReasons
		 * @see net.sf.ictalive.runtime.fact.impl.FactPackageImpl#getFailureReasons()
		 * @generated
		 */
		EEnum FAILURE_REASONS = eINSTANCE.getFailureReasons();

	}

} //FactPackage
