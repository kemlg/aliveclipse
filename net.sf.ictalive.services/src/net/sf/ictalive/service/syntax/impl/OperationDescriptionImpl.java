/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.syntax.impl;

import java.util.Collection;

import net.sf.ictalive.service.syntax.Message;
import net.sf.ictalive.service.syntax.OperationDescription;
import net.sf.ictalive.service.syntax.SyntaxPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.syntax.impl.OperationDescriptionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.impl.OperationDescriptionImpl#getFault <em>Fault</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.impl.OperationDescriptionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.impl.OperationDescriptionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationDescriptionImpl extends EObjectImpl implements OperationDescription {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> input;

	/**
	 * The cached value of the '{@link #getFault() <em>Fault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> fault;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> output;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyntaxPackage.Literals.OPERATION_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Message>(Message.class, this, SyntaxPackage.OPERATION_DESCRIPTION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getFault() {
		if (fault == null) {
			fault = new EObjectContainmentEList<Message>(Message.class, this, SyntaxPackage.OPERATION_DESCRIPTION__FAULT);
		}
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Message>(Message.class, this, SyntaxPackage.OPERATION_DESCRIPTION__OUTPUT);
		}
		return output;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.OPERATION_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SyntaxPackage.OPERATION_DESCRIPTION__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case SyntaxPackage.OPERATION_DESCRIPTION__FAULT:
				return ((InternalEList<?>)getFault()).basicRemove(otherEnd, msgs);
			case SyntaxPackage.OPERATION_DESCRIPTION__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SyntaxPackage.OPERATION_DESCRIPTION__INPUT:
				return getInput();
			case SyntaxPackage.OPERATION_DESCRIPTION__FAULT:
				return getFault();
			case SyntaxPackage.OPERATION_DESCRIPTION__OUTPUT:
				return getOutput();
			case SyntaxPackage.OPERATION_DESCRIPTION__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SyntaxPackage.OPERATION_DESCRIPTION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Message>)newValue);
				return;
			case SyntaxPackage.OPERATION_DESCRIPTION__FAULT:
				getFault().clear();
				getFault().addAll((Collection<? extends Message>)newValue);
				return;
			case SyntaxPackage.OPERATION_DESCRIPTION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Message>)newValue);
				return;
			case SyntaxPackage.OPERATION_DESCRIPTION__NAME:
				setName((String)newValue);
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
			case SyntaxPackage.OPERATION_DESCRIPTION__INPUT:
				getInput().clear();
				return;
			case SyntaxPackage.OPERATION_DESCRIPTION__FAULT:
				getFault().clear();
				return;
			case SyntaxPackage.OPERATION_DESCRIPTION__OUTPUT:
				getOutput().clear();
				return;
			case SyntaxPackage.OPERATION_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
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
			case SyntaxPackage.OPERATION_DESCRIPTION__INPUT:
				return input != null && !input.isEmpty();
			case SyntaxPackage.OPERATION_DESCRIPTION__FAULT:
				return fault != null && !fault.isEmpty();
			case SyntaxPackage.OPERATION_DESCRIPTION__OUTPUT:
				return output != null && !output.isEmpty();
			case SyntaxPackage.OPERATION_DESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //OperationDescriptionImpl
