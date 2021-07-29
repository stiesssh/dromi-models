/**
 */
package de.unistuttgart.ma.saga.impact.impl;

import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactPackage;
import de.unistuttgart.ma.saga.impact.Notification;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.NotificationImpl#getTopLevelImpacts <em>Top Level Impacts</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.NotificationImpl#getSystem <em>System</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.NotificationImpl#getImpacts <em>Impacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationImpl extends MinimalEObjectImpl.Container implements Notification {
	/**
	 * The cached value of the '{@link #getTopLevelImpacts() <em>Top Level Impacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelImpacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Impact> topLevelImpacts;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected de.unistuttgart.ma.saga.System system;

	/**
	 * The cached value of the '{@link #getImpacts() <em>Impacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Impact> impacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpactPackage.Literals.NOTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Impact> getTopLevelImpacts() {
		if (topLevelImpacts == null) {
			topLevelImpacts = new EObjectResolvingEList<Impact>(Impact.class, this, ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS);
		}
		return topLevelImpacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.unistuttgart.ma.saga.System getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (de.unistuttgart.ma.saga.System)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE, ImpactPackage.NOTIFICATION__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.unistuttgart.ma.saga.System basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(de.unistuttgart.ma.saga.System newSystem) {
		de.unistuttgart.ma.saga.System oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, ImpactPackage.NOTIFICATION__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Impact> getImpacts() {
		if (impacts == null) {
			impacts = new EObjectContainmentEList<Impact>(Impact.class, this, ImpactPackage.NOTIFICATION__IMPACTS);
		}
		return impacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpactPackage.NOTIFICATION__IMPACTS:
				return ((InternalEList<?>)getImpacts()).basicRemove(otherEnd, msgs);
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
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS:
				return getTopLevelImpacts();
			case ImpactPackage.NOTIFICATION__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case ImpactPackage.NOTIFICATION__IMPACTS:
				return getImpacts();
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
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS:
				getTopLevelImpacts().clear();
				getTopLevelImpacts().addAll((Collection<? extends Impact>)newValue);
				return;
			case ImpactPackage.NOTIFICATION__SYSTEM:
				setSystem((de.unistuttgart.ma.saga.System)newValue);
				return;
			case ImpactPackage.NOTIFICATION__IMPACTS:
				getImpacts().clear();
				getImpacts().addAll((Collection<? extends Impact>)newValue);
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
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS:
				getTopLevelImpacts().clear();
				return;
			case ImpactPackage.NOTIFICATION__SYSTEM:
				setSystem((de.unistuttgart.ma.saga.System)null);
				return;
			case ImpactPackage.NOTIFICATION__IMPACTS:
				getImpacts().clear();
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
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS:
				return topLevelImpacts != null && !topLevelImpacts.isEmpty();
			case ImpactPackage.NOTIFICATION__SYSTEM:
				return system != null;
			case ImpactPackage.NOTIFICATION__IMPACTS:
				return impacts != null && !impacts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NotificationImpl
