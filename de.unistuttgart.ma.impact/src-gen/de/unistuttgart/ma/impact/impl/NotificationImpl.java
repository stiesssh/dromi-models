/**
 */
package de.unistuttgart.ma.impact.impl;

import de.unistuttgart.ma.impact.Impact;
import de.unistuttgart.ma.impact.ImpactPackage;
import de.unistuttgart.ma.impact.Notification;

import de.unistuttgart.ma.impact.Violation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.impact.impl.NotificationImpl#getTopLevelImpact <em>Top Level Impact</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.impl.NotificationImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.impl.NotificationImpl#getRootCause <em>Root Cause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationImpl extends MinimalEObjectImpl.Container implements Notification {
	/**
	 * The cached value of the '{@link #getTopLevelImpact() <em>Top Level Impact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelImpact()
	 * @generated
	 * @ordered
	 */
	protected Impact topLevelImpact;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootCause() <em>Root Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCause()
	 * @generated
	 * @ordered
	 */
	protected Violation rootCause;

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
	public Impact getTopLevelImpact() {
		if (topLevelImpact != null && topLevelImpact.eIsProxy()) {
			InternalEObject oldTopLevelImpact = (InternalEObject)topLevelImpact;
			topLevelImpact = (Impact)eResolveProxy(oldTopLevelImpact);
			if (topLevelImpact != oldTopLevelImpact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE, ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACT, oldTopLevelImpact, topLevelImpact));
			}
		}
		return topLevelImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Impact basicGetTopLevelImpact() {
		return topLevelImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopLevelImpact(Impact newTopLevelImpact) {
		Impact oldTopLevelImpact = topLevelImpact;
		topLevelImpact = newTopLevelImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACT, oldTopLevelImpact, topLevelImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, ImpactPackage.NOTIFICATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Violation getRootCause() {
		if (rootCause != null && rootCause.eIsProxy()) {
			InternalEObject oldRootCause = (InternalEObject)rootCause;
			rootCause = (Violation)eResolveProxy(oldRootCause);
			if (rootCause != oldRootCause) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE, ImpactPackage.NOTIFICATION__ROOT_CAUSE, oldRootCause, rootCause));
			}
		}
		return rootCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Violation basicGetRootCause() {
		return rootCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootCause(Violation newRootCause) {
		Violation oldRootCause = rootCause;
		rootCause = newRootCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, ImpactPackage.NOTIFICATION__ROOT_CAUSE, oldRootCause, rootCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACT:
				if (resolve) return getTopLevelImpact();
				return basicGetTopLevelImpact();
			case ImpactPackage.NOTIFICATION__ID:
				return getId();
			case ImpactPackage.NOTIFICATION__ROOT_CAUSE:
				if (resolve) return getRootCause();
				return basicGetRootCause();
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
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACT:
				setTopLevelImpact((Impact)newValue);
				return;
			case ImpactPackage.NOTIFICATION__ID:
				setId((String)newValue);
				return;
			case ImpactPackage.NOTIFICATION__ROOT_CAUSE:
				setRootCause((Violation)newValue);
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
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACT:
				setTopLevelImpact((Impact)null);
				return;
			case ImpactPackage.NOTIFICATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ImpactPackage.NOTIFICATION__ROOT_CAUSE:
				setRootCause((Violation)null);
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
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACT:
				return topLevelImpact != null;
			case ImpactPackage.NOTIFICATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ImpactPackage.NOTIFICATION__ROOT_CAUSE:
				return rootCause != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //NotificationImpl
