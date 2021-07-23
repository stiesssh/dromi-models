/**
 */
package de.unistuttgart.ma.saga.impact.impl;

import de.unistuttgart.gropius.slo.Alert;

import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactPackage;
import de.unistuttgart.ma.saga.impact.Notification;

import de.unistuttgart.ma.saga.impl.IdentifiableElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.NotificationImpl#getImpacts <em>Impacts</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.NotificationImpl#getTopLevelImpacts <em>Top Level Impacts</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.NotificationImpl#getAlert <em>Alert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationImpl extends IdentifiableElementImpl implements Notification {
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
	 * The cached value of the '{@link #getTopLevelImpacts() <em>Top Level Impacts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelImpacts()
	 * @generated
	 * @ordered
	 */
	protected Impact topLevelImpacts;

	/**
	 * The cached value of the '{@link #getAlert() <em>Alert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlert()
	 * @generated
	 * @ordered
	 */
	protected Alert alert;

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
	public Impact getTopLevelImpacts() {
		if (topLevelImpacts != null && topLevelImpacts.eIsProxy()) {
			InternalEObject oldTopLevelImpacts = (InternalEObject)topLevelImpacts;
			topLevelImpacts = (Impact)eResolveProxy(oldTopLevelImpacts);
			if (topLevelImpacts != oldTopLevelImpacts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE, ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS, oldTopLevelImpacts, topLevelImpacts));
			}
		}
		return topLevelImpacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Impact basicGetTopLevelImpacts() {
		return topLevelImpacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopLevelImpacts(Impact newTopLevelImpacts) {
		Impact oldTopLevelImpacts = topLevelImpacts;
		topLevelImpacts = newTopLevelImpacts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS, oldTopLevelImpacts, topLevelImpacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alert getAlert() {
		return alert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlert(Alert newAlert, NotificationChain msgs) {
		Alert oldAlert = alert;
		alert = newAlert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, ImpactPackage.NOTIFICATION__ALERT, oldAlert, newAlert);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlert(Alert newAlert) {
		if (newAlert != alert) {
			NotificationChain msgs = null;
			if (alert != null)
				msgs = ((InternalEObject)alert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpactPackage.NOTIFICATION__ALERT, null, msgs);
			if (newAlert != null)
				msgs = ((InternalEObject)newAlert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpactPackage.NOTIFICATION__ALERT, null, msgs);
			msgs = basicSetAlert(newAlert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, ImpactPackage.NOTIFICATION__ALERT, newAlert, newAlert));
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
			case ImpactPackage.NOTIFICATION__ALERT:
				return basicSetAlert(null, msgs);
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
			case ImpactPackage.NOTIFICATION__IMPACTS:
				return getImpacts();
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS:
				if (resolve) return getTopLevelImpacts();
				return basicGetTopLevelImpacts();
			case ImpactPackage.NOTIFICATION__ALERT:
				return getAlert();
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
			case ImpactPackage.NOTIFICATION__IMPACTS:
				getImpacts().clear();
				getImpacts().addAll((Collection<? extends Impact>)newValue);
				return;
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS:
				setTopLevelImpacts((Impact)newValue);
				return;
			case ImpactPackage.NOTIFICATION__ALERT:
				setAlert((Alert)newValue);
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
			case ImpactPackage.NOTIFICATION__IMPACTS:
				getImpacts().clear();
				return;
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS:
				setTopLevelImpacts((Impact)null);
				return;
			case ImpactPackage.NOTIFICATION__ALERT:
				setAlert((Alert)null);
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
			case ImpactPackage.NOTIFICATION__IMPACTS:
				return impacts != null && !impacts.isEmpty();
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS:
				return topLevelImpacts != null;
			case ImpactPackage.NOTIFICATION__ALERT:
				return alert != null;
		}
		return super.eIsSet(featureID);
	}

} //NotificationImpl
