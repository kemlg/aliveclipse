/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.AtomicProcess#getRealizes <em>Realizes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.process.ProcessPackage#getAtomicProcess()
 * @model
 * @generated
 */
public interface AtomicProcess extends net.sf.ictalive.owls.process.Process
{
	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.owls.process.SimpleProcess#getRealizedBy <em>Realized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference.
	 * @see #setRealizes(SimpleProcess)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getAtomicProcess_Realizes()
	 * @see net.sf.ictalive.owls.process.SimpleProcess#getRealizedBy
	 * @model opposite="realizedBy"
	 * @generated
	 */
	SimpleProcess getRealizes();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.AtomicProcess#getRealizes <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' reference.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(SimpleProcess value);

} // AtomicProcess
