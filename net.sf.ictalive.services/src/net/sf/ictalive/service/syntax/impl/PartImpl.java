/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.syntax.impl;

import net.sf.ictalive.schema.TopLevelComplexType;
import net.sf.ictalive.schema.TopLevelElement;

import net.sf.ictalive.service.syntax.Part;
import net.sf.ictalive.service.syntax.SyntaxPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.syntax.impl.PartImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.impl.PartImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.impl.PartImpl#getXsdType <em>Xsd Type</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.impl.PartImpl#getXsdElement <em>Xsd Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartImpl extends EObjectImpl implements Part {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXsdType() <em>Xsd Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdType()
	 * @generated
	 * @ordered
	 */
	protected TopLevelComplexType xsdType;

	/**
	 * The cached value of the '{@link #getXsdElement() <em>Xsd Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdElement()
	 * @generated
	 * @ordered
	 */
	protected TopLevelElement xsdElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyntaxPackage.Literals.PART;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.PART__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.PART__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelComplexType getXsdType() {
		if (xsdType != null && xsdType.eIsProxy()) {
			InternalEObject oldXsdType = (InternalEObject)xsdType;
			xsdType = (TopLevelComplexType)eResolveProxy(oldXsdType);
			if (xsdType != oldXsdType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SyntaxPackage.PART__XSD_TYPE, oldXsdType, xsdType));
			}
		}
		return xsdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelComplexType basicGetXsdType() {
		return xsdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXsdType(TopLevelComplexType newXsdType) {
		TopLevelComplexType oldXsdType = xsdType;
		xsdType = newXsdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.PART__XSD_TYPE, oldXsdType, xsdType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelElement getXsdElement() {
		if (xsdElement != null && xsdElement.eIsProxy()) {
			InternalEObject oldXsdElement = (InternalEObject)xsdElement;
			xsdElement = (TopLevelElement)eResolveProxy(oldXsdElement);
			if (xsdElement != oldXsdElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SyntaxPackage.PART__XSD_ELEMENT, oldXsdElement, xsdElement));
			}
		}
		return xsdElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelElement basicGetXsdElement() {
		return xsdElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXsdElement(TopLevelElement newXsdElement) {
		TopLevelElement oldXsdElement = xsdElement;
		xsdElement = newXsdElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.PART__XSD_ELEMENT, oldXsdElement, xsdElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SyntaxPackage.PART__NAME:
				return getName();
			case SyntaxPackage.PART__TYPE:
				return getType();
			case SyntaxPackage.PART__XSD_TYPE:
				if (resolve) return getXsdType();
				return basicGetXsdType();
			case SyntaxPackage.PART__XSD_ELEMENT:
				if (resolve) return getXsdElement();
				return basicGetXsdElement();
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
			case SyntaxPackage.PART__NAME:
				setName((String)newValue);
				return;
			case SyntaxPackage.PART__TYPE:
				setType((String)newValue);
				return;
			case SyntaxPackage.PART__XSD_TYPE:
				setXsdType((TopLevelComplexType)newValue);
				return;
			case SyntaxPackage.PART__XSD_ELEMENT:
				setXsdElement((TopLevelElement)newValue);
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
			case SyntaxPackage.PART__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SyntaxPackage.PART__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SyntaxPackage.PART__XSD_TYPE:
				setXsdType((TopLevelComplexType)null);
				return;
			case SyntaxPackage.PART__XSD_ELEMENT:
				setXsdElement((TopLevelElement)null);
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
			case SyntaxPackage.PART__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SyntaxPackage.PART__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SyntaxPackage.PART__XSD_TYPE:
				return xsdType != null;
			case SyntaxPackage.PART__XSD_ELEMENT:
				return xsdElement != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PartImpl
