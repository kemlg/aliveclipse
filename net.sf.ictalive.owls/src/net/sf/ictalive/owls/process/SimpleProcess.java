/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.SimpleProcess#getRealizedBy <em>Realized By</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.SimpleProcess#getExpandsTo <em>Expands To</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.process.ProcessPackage#getSimpleProcess()
 * @model
 * @generated
 */
public interface SimpleProcess extends net.sf.ictalive.owls.process.Process {
	/**
	 * Returns the value of the '<em><b>Realized By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.owls.process.AtomicProcess#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized By</em>' reference.
	 * @see #setRealizedBy(AtomicProcess)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getSimpleProcess_RealizedBy()
	 * @see net.sf.ictalive.owls.process.AtomicProcess#getRealizes
	 * @model opposite="realizes"
	 * @generated
	 */
	AtomicProcess getRealizedBy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.SimpleProcess#getRealizedBy <em>Realized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realized By</em>' reference.
	 * @see #getRealizedBy()
	 * @generated
	 */
	void setRealizedBy(AtomicProcess value);

	/**
	 * Returns the value of the '<em><b>Expands To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.owls.process.CompositeProcess#getCollapsesTo <em>Collapses To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expands To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expands To</em>' reference.
	 * @see #setExpandsTo(CompositeProcess)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getSimpleProcess_ExpandsTo()
	 * @see net.sf.ictalive.owls.process.CompositeProcess#getCollapsesTo
	 * @model opposite="collapsesTo"
	 * @generated
	 */
	CompositeProcess getExpandsTo();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.SimpleProcess#getExpandsTo <em>Expands To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expands To</em>' reference.
	 * @see #getExpandsTo()
	 * @generated
	 */
	void setExpandsTo(CompositeProcess value);

} // SimpleProcess
