/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlPackage;
import control.Ontology;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.OntologyImpl#getOntologyURI <em>Ontology URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OntologyImpl extends NamedElementImpl implements Ontology {
	/**
	 * The default value of the '{@link #getOntologyURI() <em>Ontology URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ONTOLOGY_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOntologyURI() <em>Ontology URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyURI()
	 * @generated
	 * @ordered
	 */
	protected String ontologyURI = ONTOLOGY_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlPackage.Literals.ONTOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOntologyURI() {
		return ontologyURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntologyURI(String newOntologyURI) {
		String oldOntologyURI = ontologyURI;
		ontologyURI = newOntologyURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.ONTOLOGY__ONTOLOGY_URI, oldOntologyURI, ontologyURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlPackage.ONTOLOGY__ONTOLOGY_URI:
				return getOntologyURI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ControlPackage.ONTOLOGY__ONTOLOGY_URI:
				setOntologyURI((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ControlPackage.ONTOLOGY__ONTOLOGY_URI:
				setOntologyURI(ONTOLOGY_URI_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ControlPackage.ONTOLOGY__ONTOLOGY_URI:
				return ONTOLOGY_URI_EDEFAULT == null ? ontologyURI != null : !ONTOLOGY_URI_EDEFAULT.equals(ontologyURI);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ontologyURI: ");
		result.append(ontologyURI);
		result.append(')');
		return result.toString();
	}

} //OntologyImpl
