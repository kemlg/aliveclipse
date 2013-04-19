/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OLCLMap.Mapping#getEntry <em>Entry</em>}</li>
 *   <li>{@link OLCLMap.Mapping#getOperaFile <em>Opera File</em>}</li>
 *   <li>{@link OLCLMap.Mapping#getActionFile <em>Action File</em>}</li>
 * </ul>
 * </p>
 *
 * @see OLCLMap.OLCLMapPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link OLCLMap.MapEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see OLCLMap.OLCLMapPackage#getMapping_Entry()
	 * @model containment="true"
	 * @generated
	 */
	EList<MapEntry> getEntry();

	/**
	 * Returns the value of the '<em><b>Opera File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opera File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opera File</em>' attribute.
	 * @see #setOperaFile(String)
	 * @see OLCLMap.OLCLMapPackage#getMapping_OperaFile()
	 * @model
	 * @generated
	 */
	String getOperaFile();

	/**
	 * Sets the value of the '{@link OLCLMap.Mapping#getOperaFile <em>Opera File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opera File</em>' attribute.
	 * @see #getOperaFile()
	 * @generated
	 */
	void setOperaFile(String value);

	/**
	 * Returns the value of the '<em><b>Action File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action File</em>' attribute.
	 * @see #setActionFile(String)
	 * @see OLCLMap.OLCLMapPackage#getMapping_ActionFile()
	 * @model
	 * @generated
	 */
	String getActionFile();

	/**
	 * Sets the value of the '{@link OLCLMap.Mapping#getActionFile <em>Action File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action File</em>' attribute.
	 * @see #getActionFile()
	 * @generated
	 */
	void setActionFile(String value);

} // Mapping
