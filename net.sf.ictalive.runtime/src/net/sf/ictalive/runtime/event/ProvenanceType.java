/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.event;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Provenance Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.runtime.event.EventPackage#getProvenanceType()
 * @model
 * @generated
 */
public enum ProvenanceType implements Enumerator {
	/**
	 * The '<em><b>CAUSED BY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAUSED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	CAUSED_BY(0, "CAUSED_BY", "CAUSED-BY"),

	/**
	 * The '<em><b>INTERPRETED FROM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERPRETED_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	INTERPRETED_FROM(1, "INTERPRETED_FROM", "INTERPRETED-FROM");

	/**
	 * The '<em><b>CAUSED BY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAUSED BY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAUSED_BY
	 * @model literal="CAUSED-BY"
	 * @generated
	 * @ordered
	 */
	public static final int CAUSED_BY_VALUE = 0;

	/**
	 * The '<em><b>INTERPRETED FROM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERPRETED FROM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERPRETED_FROM
	 * @model literal="INTERPRETED-FROM"
	 * @generated
	 * @ordered
	 */
	public static final int INTERPRETED_FROM_VALUE = 1;

	/**
	 * An array of all the '<em><b>Provenance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProvenanceType[] VALUES_ARRAY =
		new ProvenanceType[] {
			CAUSED_BY,
			INTERPRETED_FROM,
		};

	/**
	 * A public read-only list of all the '<em><b>Provenance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProvenanceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Provenance Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProvenanceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvenanceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provenance Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProvenanceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvenanceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provenance Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProvenanceType get(int value) {
		switch (value) {
			case CAUSED_BY_VALUE: return CAUSED_BY;
			case INTERPRETED_FROM_VALUE: return INTERPRETED_FROM;
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
	private ProvenanceType(int value, String name, String literal) {
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
	
} //ProvenanceType
