/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.syntax.impl;

import java.util.Collection;

import net.sf.ictalive.schema.SchemaType;

import net.sf.ictalive.service.syntax.Binding;
import net.sf.ictalive.service.syntax.InterfaceDescription;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.syntax.impl.InterfaceDescriptionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.impl.InterfaceDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.impl.InterfaceDescriptionImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.impl.InterfaceDescriptionImpl#getInLineSchema <em>In Line Schema</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.impl.InterfaceDescriptionImpl#getOutLineSchema <em>Out Line Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceDescriptionImpl extends EObjectImpl implements InterfaceDescription {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationDescription> operation;

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
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> binding;

	/**
	 * The cached value of the '{@link #getInLineSchema() <em>In Line Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInLineSchema()
	 * @generated
	 * @ordered
	 */
	protected SchemaType inLineSchema;

	/**
	 * The cached value of the '{@link #getOutLineSchema() <em>Out Line Schema</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutLineSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemaType> outLineSchema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyntaxPackage.Literals.INTERFACE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationDescription> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<OperationDescription>(OperationDescription.class, this, SyntaxPackage.INTERFACE_DESCRIPTION__OPERATION);
		}
		return operation;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.INTERFACE_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBinding() {
		if (binding == null) {
			binding = new EObjectWithInverseResolvingEList<Binding>(Binding.class, this, SyntaxPackage.INTERFACE_DESCRIPTION__BINDING, SyntaxPackage.BINDING__TYPE);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaType getInLineSchema() {
		return inLineSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInLineSchema(SchemaType newInLineSchema, NotificationChain msgs) {
		SchemaType oldInLineSchema = inLineSchema;
		inLineSchema = newInLineSchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyntaxPackage.INTERFACE_DESCRIPTION__IN_LINE_SCHEMA, oldInLineSchema, newInLineSchema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInLineSchema(SchemaType newInLineSchema) {
		if (newInLineSchema != inLineSchema) {
			NotificationChain msgs = null;
			if (inLineSchema != null)
				msgs = ((InternalEObject)inLineSchema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyntaxPackage.INTERFACE_DESCRIPTION__IN_LINE_SCHEMA, null, msgs);
			if (newInLineSchema != null)
				msgs = ((InternalEObject)newInLineSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SyntaxPackage.INTERFACE_DESCRIPTION__IN_LINE_SCHEMA, null, msgs);
			msgs = basicSetInLineSchema(newInLineSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.INTERFACE_DESCRIPTION__IN_LINE_SCHEMA, newInLineSchema, newInLineSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchemaType> getOutLineSchema() {
		if (outLineSchema == null) {
			outLineSchema = new EObjectResolvingEList<SchemaType>(SchemaType.class, this, SyntaxPackage.INTERFACE_DESCRIPTION__OUT_LINE_SCHEMA);
		}
		return outLineSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SyntaxPackage.INTERFACE_DESCRIPTION__BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBinding()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SyntaxPackage.INTERFACE_DESCRIPTION__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case SyntaxPackage.INTERFACE_DESCRIPTION__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
			case SyntaxPackage.INTERFACE_DESCRIPTION__IN_LINE_SCHEMA:
				return basicSetInLineSchema(null, msgs);
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
			case SyntaxPackage.INTERFACE_DESCRIPTION__OPERATION:
				return getOperation();
			case SyntaxPackage.INTERFACE_DESCRIPTION__NAME:
				return getName();
			case SyntaxPackage.INTERFACE_DESCRIPTION__BINDING:
				return getBinding();
			case SyntaxPackage.INTERFACE_DESCRIPTION__IN_LINE_SCHEMA:
				return getInLineSchema();
			case SyntaxPackage.INTERFACE_DESCRIPTION__OUT_LINE_SCHEMA:
				return getOutLineSchema();
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
			case SyntaxPackage.INTERFACE_DESCRIPTION__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends OperationDescription>)newValue);
				return;
			case SyntaxPackage.INTERFACE_DESCRIPTION__NAME:
				setName((String)newValue);
				return;
			case SyntaxPackage.INTERFACE_DESCRIPTION__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends Binding>)newValue);
				return;
			case SyntaxPackage.INTERFACE_DESCRIPTION__IN_LINE_SCHEMA:
				setInLineSchema((SchemaType)newValue);
				return;
			case SyntaxPackage.INTERFACE_DESCRIPTION__OUT_LINE_SCHEMA:
				getOutLineSchema().clear();
				getOutLineSchema().addAll((Collection<? extends SchemaType>)newValue);
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
			case SyntaxPackage.INTERFACE_DESCRIPTION__OPERATION:
				getOperation().clear();
				return;
			case SyntaxPackage.INTERFACE_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SyntaxPackage.INTERFACE_DESCRIPTION__BINDING:
				getBinding().clear();
				return;
			case SyntaxPackage.INTERFACE_DESCRIPTION__IN_LINE_SCHEMA:
				setInLineSchema((SchemaType)null);
				return;
			case SyntaxPackage.INTERFACE_DESCRIPTION__OUT_LINE_SCHEMA:
				getOutLineSchema().clear();
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
			case SyntaxPackage.INTERFACE_DESCRIPTION__OPERATION:
				return operation != null && !operation.isEmpty();
			case SyntaxPackage.INTERFACE_DESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SyntaxPackage.INTERFACE_DESCRIPTION__BINDING:
				return binding != null && !binding.isEmpty();
			case SyntaxPackage.INTERFACE_DESCRIPTION__IN_LINE_SCHEMA:
				return inLineSchema != null;
			case SyntaxPackage.INTERFACE_DESCRIPTION__OUT_LINE_SCHEMA:
				return outLineSchema != null && !outLineSchema.isEmpty();
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

} //InterfaceDescriptionImpl
