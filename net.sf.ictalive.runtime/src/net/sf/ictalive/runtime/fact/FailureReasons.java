/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Failure Reasons</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.runtime.fact.FactPackage#getFailureReasons()
 * @model
 * @generated
 */
public enum FailureReasons implements Enumerator {
	/**
	 * The '<em><b>Unableto Plan For Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNABLETO_PLAN_FOR_TASK_VALUE
	 * @generated
	 * @ordered
	 */
	UNABLETO_PLAN_FOR_TASK(0, "UnabletoPlanForTask", "UnabletoPlanForTask"),

	/**
	 * The '<em><b>Action Not Performed By ARole</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_NOT_PERFORMED_BY_AROLE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION_NOT_PERFORMED_BY_AROLE(1, "ActionNotPerformedByARole", "ActionNotPerformedByARole"),

	/**
	 * The '<em><b>Precondition Fail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECONDITION_FAIL_VALUE
	 * @generated
	 * @ordered
	 */
	PRECONDITION_FAIL(2, "PreconditionFail", "PreconditionFail"),

	/**
	 * The '<em><b>Zero Service Matches For Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_SERVICE_MATCHES_FOR_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO_SERVICE_MATCHES_FOR_ACTION(3, "ZeroServiceMatchesForAction", "ZeroServiceMatchesForAction"),

	/**
	 * The '<em><b>No Usable Service Matches For Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_USABLE_SERVICE_MATCHES_FOR_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_USABLE_SERVICE_MATCHES_FOR_ACTION(4, "NoUsableServiceMatchesForAction", "NoUsableServiceMatchesForAction"),

	/**
	 * The '<em><b>Service Unavailable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_UNAVAILABLE(5, "ServiceUnavailable", "ServiceUnavailable"),

	/**
	 * The '<em><b>Service Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_FAILURE(6, "ServiceFailure", "ServiceFailure"),

	/**
	 * The '<em><b>Null Pointer Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_POINTER_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	NULL_POINTER_EXCEPTION(7, "NullPointerException", "NullPointerException");

	/**
	 * The '<em><b>Unableto Plan For Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unableto Plan For Task</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNABLETO_PLAN_FOR_TASK
	 * @model name="UnabletoPlanForTask"
	 * @generated
	 * @ordered
	 */
	public static final int UNABLETO_PLAN_FOR_TASK_VALUE = 0;

	/**
	 * The '<em><b>Action Not Performed By ARole</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Action Not Performed By ARole</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTION_NOT_PERFORMED_BY_AROLE
	 * @model name="ActionNotPerformedByARole"
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_NOT_PERFORMED_BY_AROLE_VALUE = 1;

	/**
	 * The '<em><b>Precondition Fail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Precondition Fail</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRECONDITION_FAIL
	 * @model name="PreconditionFail"
	 * @generated
	 * @ordered
	 */
	public static final int PRECONDITION_FAIL_VALUE = 2;

	/**
	 * The '<em><b>Zero Service Matches For Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Zero Service Matches For Action</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZERO_SERVICE_MATCHES_FOR_ACTION
	 * @model name="ZeroServiceMatchesForAction"
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_SERVICE_MATCHES_FOR_ACTION_VALUE = 3;

	/**
	 * The '<em><b>No Usable Service Matches For Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Usable Service Matches For Action</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_USABLE_SERVICE_MATCHES_FOR_ACTION
	 * @model name="NoUsableServiceMatchesForAction"
	 * @generated
	 * @ordered
	 */
	public static final int NO_USABLE_SERVICE_MATCHES_FOR_ACTION_VALUE = 4;

	/**
	 * The '<em><b>Service Unavailable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Service Unavailable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_UNAVAILABLE
	 * @model name="ServiceUnavailable"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_UNAVAILABLE_VALUE = 5;

	/**
	 * The '<em><b>Service Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Service Failure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_FAILURE
	 * @model name="ServiceFailure"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_FAILURE_VALUE = 6;

	/**
	 * The '<em><b>Null Pointer Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Null Pointer Exception</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NULL_POINTER_EXCEPTION
	 * @model name="NullPointerException"
	 * @generated
	 * @ordered
	 */
	public static final int NULL_POINTER_EXCEPTION_VALUE = 7;

	/**
	 * An array of all the '<em><b>Failure Reasons</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FailureReasons[] VALUES_ARRAY =
		new FailureReasons[] {
			UNABLETO_PLAN_FOR_TASK,
			ACTION_NOT_PERFORMED_BY_AROLE,
			PRECONDITION_FAIL,
			ZERO_SERVICE_MATCHES_FOR_ACTION,
			NO_USABLE_SERVICE_MATCHES_FOR_ACTION,
			SERVICE_UNAVAILABLE,
			SERVICE_FAILURE,
			NULL_POINTER_EXCEPTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Failure Reasons</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FailureReasons> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Failure Reasons</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FailureReasons get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FailureReasons result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Failure Reasons</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FailureReasons getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FailureReasons result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Failure Reasons</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FailureReasons get(int value) {
		switch (value) {
			case UNABLETO_PLAN_FOR_TASK_VALUE: return UNABLETO_PLAN_FOR_TASK;
			case ACTION_NOT_PERFORMED_BY_AROLE_VALUE: return ACTION_NOT_PERFORMED_BY_AROLE;
			case PRECONDITION_FAIL_VALUE: return PRECONDITION_FAIL;
			case ZERO_SERVICE_MATCHES_FOR_ACTION_VALUE: return ZERO_SERVICE_MATCHES_FOR_ACTION;
			case NO_USABLE_SERVICE_MATCHES_FOR_ACTION_VALUE: return NO_USABLE_SERVICE_MATCHES_FOR_ACTION;
			case SERVICE_UNAVAILABLE_VALUE: return SERVICE_UNAVAILABLE;
			case SERVICE_FAILURE_VALUE: return SERVICE_FAILURE;
			case NULL_POINTER_EXCEPTION_VALUE: return NULL_POINTER_EXCEPTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FailureReasons(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FailureReasons
