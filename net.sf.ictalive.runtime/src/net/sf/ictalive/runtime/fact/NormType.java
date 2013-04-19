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
 * A representation of the literals of the enumeration '<em><b>Norm Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.runtime.fact.FactPackage#getNormType()
 * @model
 * @generated
 */
public enum NormType implements Enumerator {
	/**
	 * The '<em><b>Deadline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEADLINE_VALUE
	 * @generated
	 * @ordered
	 */
	DEADLINE(0, "Deadline", "Deadline"),

	/**
	 * The '<em><b>Activation Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVATION_CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVATION_CONDITION(1, "ActivationCondition", "ActivationCondition"),

	/**
	 * The '<em><b>Expiration Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPIRATION_CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	EXPIRATION_CONDITION(2, "ExpirationCondition", "ExpirationCondition"),

	/**
	 * The '<em><b>Maintainance Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTAINANCE_CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTAINANCE_CONDITION(3, "MaintainanceCondition", "MaintainanceCondition"),

	/**
	 * The '<em><b>What</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHAT_VALUE
	 * @generated
	 * @ordered
	 */
	WHAT(4, "What", "What");

	/**
	 * The '<em><b>Deadline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deadline</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEADLINE
	 * @model name="Deadline"
	 * @generated
	 * @ordered
	 */
	public static final int DEADLINE_VALUE = 0;

	/**
	 * The '<em><b>Activation Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Activation Condition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVATION_CONDITION
	 * @model name="ActivationCondition"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVATION_CONDITION_VALUE = 1;

	/**
	 * The '<em><b>Expiration Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Expiration Condition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPIRATION_CONDITION
	 * @model name="ExpirationCondition"
	 * @generated
	 * @ordered
	 */
	public static final int EXPIRATION_CONDITION_VALUE = 2;

	/**
	 * The '<em><b>Maintainance Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maintainance Condition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAINTAINANCE_CONDITION
	 * @model name="MaintainanceCondition"
	 * @generated
	 * @ordered
	 */
	public static final int MAINTAINANCE_CONDITION_VALUE = 3;

	/**
	 * The '<em><b>What</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>What</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHAT
	 * @model name="What"
	 * @generated
	 * @ordered
	 */
	public static final int WHAT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Norm Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NormType[] VALUES_ARRAY =
		new NormType[] {
			DEADLINE,
			ACTIVATION_CONDITION,
			EXPIRATION_CONDITION,
			MAINTAINANCE_CONDITION,
			WHAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Norm Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NormType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Norm Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NormType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NormType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Norm Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NormType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NormType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Norm Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NormType get(int value) {
		switch (value) {
			case DEADLINE_VALUE: return DEADLINE;
			case ACTIVATION_CONDITION_VALUE: return ACTIVATION_CONDITION;
			case EXPIRATION_CONDITION_VALUE: return EXPIRATION_CONDITION;
			case MAINTAINANCE_CONDITION_VALUE: return MAINTAINANCE_CONDITION;
			case WHAT_VALUE: return WHAT;
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
	private NormType(int value, String name, String literal) {
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
	
} //NormType
