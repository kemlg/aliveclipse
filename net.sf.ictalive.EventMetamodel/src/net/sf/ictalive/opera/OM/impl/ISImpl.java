/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM.impl;

import java.util.Collection;

import net.sf.ictalive.opera.OM.Arc;
import net.sf.ictalive.opera.OM.IS;
import net.sf.ictalive.opera.OM.OMPackage;
import net.sf.ictalive.opera.OM.Scene;
import net.sf.ictalive.opera.OM.Transition;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.ISImpl#getScenes <em>Scenes</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.ISImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.impl.ISImpl#getArcs <em>Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ISImpl extends EObjectImpl implements IS
{
	/**
	 * The cached value of the '{@link #getScenes() <em>Scenes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenes()
	 * @generated
	 * @ordered
	 */
	protected EList<Scene> scenes;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return OMPackage.Literals.IS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scene> getScenes()
	{
		if (scenes == null)
		{
			scenes = new EObjectContainmentEList<Scene>(Scene.class, this, OMPackage.IS__SCENES);
		}
		return scenes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, OMPackage.IS__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcs()
	{
		if (arcs == null)
		{
			arcs = new EObjectContainmentEList<Arc>(Arc.class, this, OMPackage.IS__ARCS);
		}
		return arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case OMPackage.IS__SCENES:
				return ((InternalEList<?>)getScenes()).basicRemove(otherEnd, msgs);
			case OMPackage.IS__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case OMPackage.IS__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case OMPackage.IS__SCENES:
				return getScenes();
			case OMPackage.IS__TRANSITIONS:
				return getTransitions();
			case OMPackage.IS__ARCS:
				return getArcs();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case OMPackage.IS__SCENES:
				getScenes().clear();
				getScenes().addAll((Collection<? extends Scene>)newValue);
				return;
			case OMPackage.IS__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case OMPackage.IS__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case OMPackage.IS__SCENES:
				getScenes().clear();
				return;
			case OMPackage.IS__TRANSITIONS:
				getTransitions().clear();
				return;
			case OMPackage.IS__ARCS:
				getArcs().clear();
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case OMPackage.IS__SCENES:
				return scenes != null && !scenes.isEmpty();
			case OMPackage.IS__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case OMPackage.IS__ARCS:
				return arcs != null && !arcs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISImpl
