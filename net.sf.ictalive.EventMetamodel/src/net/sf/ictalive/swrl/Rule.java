/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.swrl.Rule#getURIReference <em>URI Reference</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.Rule#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.Rule#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.Rule#getBody <em>Body</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.Rule#getHead <em>Head</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.swrl.SwrlPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
	/**
	 * Returns the value of the '<em><b>URI Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI Reference</em>' attribute.
	 * @see #setURIReference(String)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getRule_URIReference()
	 * @model
	 * @generated
	 */
	String getURIReference();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.Rule#getURIReference <em>URI Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI Reference</em>' attribute.
	 * @see #getURIReference()
	 * @generated
	 */
	void setURIReference(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link net.sf.ictalive.swrl.RuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.sf.ictalive.swrl.RuleType
	 * @see #setType(RuleType)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getRule_Type()
	 * @model default="0" required="true"
	 * @generated
	 */
	RuleType getType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.Rule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.sf.ictalive.swrl.RuleType
	 * @see #getType()
	 * @generated
	 */
	void setType(RuleType value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.swrl.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see net.sf.ictalive.swrl.SwrlPackage#getRule_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Antecedent)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getRule_Body()
	 * @model containment="true"
	 * @generated
	 */
	Antecedent getBody();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.Rule#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Antecedent value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(Consequent)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getRule_Head()
	 * @model containment="true"
	 * @generated
	 */
	Consequent getHead();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.Rule#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(Consequent value);

} // Rule
