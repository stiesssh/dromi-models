/**
 */
package de.unistuttgart.ma.saga.impact.impl;

import de.unistuttgart.gropius.Node;
import de.unistuttgart.gropius.slo.Violation;
import de.unistuttgart.ma.saga.IdentifiableElement;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactPackage;

import org.eclipse.bpmn2.BaseElement;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.ImpactImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.ImpactImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.ImpactImpl#getRootCause <em>Root Cause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpactImpl extends MinimalEObjectImpl.Container implements Impact {
	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected Impact cause;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EObject location;

	/**
	 * The cached value of the '{@link #getRootCause() <em>Root Cause</em>}' containment reference.
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
	protected ImpactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpactPackage.Literals.IMPACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Impact getCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCause(Impact newCause, NotificationChain msgs) {
		Impact oldCause = cause;
		cause = newCause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpactPackage.IMPACT__CAUSE, oldCause, newCause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(Impact newCause) {
		if (newCause != cause) {
			NotificationChain msgs = null;
			if (cause != null)
				msgs = ((InternalEObject)cause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpactPackage.IMPACT__CAUSE, null, msgs);
			if (newCause != null)
				msgs = ((InternalEObject)newCause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpactPackage.IMPACT__CAUSE, null, msgs);
			msgs = basicSetCause(newCause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactPackage.IMPACT__CAUSE, newCause, newCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpactPackage.IMPACT__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(EObject newLocation) {
		EObject oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactPackage.IMPACT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Violation getRootCause() {
		return rootCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootCause(Violation newRootCause, NotificationChain msgs) {
		Violation oldRootCause = rootCause;
		rootCause = newRootCause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpactPackage.IMPACT__ROOT_CAUSE, oldRootCause, newRootCause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootCause(Violation newRootCause) {
		if (newRootCause != rootCause) {
			NotificationChain msgs = null;
			if (rootCause != null)
				msgs = ((InternalEObject)rootCause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpactPackage.IMPACT__ROOT_CAUSE, null, msgs);
			if (newRootCause != null)
				msgs = ((InternalEObject)newRootCause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpactPackage.IMPACT__ROOT_CAUSE, null, msgs);
			msgs = basicSetRootCause(newRootCause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactPackage.IMPACT__ROOT_CAUSE, newRootCause, newRootCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLocationId() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (location instanceof Node) {
			return ((Node) location).getId();
		}
		if (location instanceof IdentifiableElement) {
			return ((IdentifiableElement) location).getId();
		}
		if (location instanceof BaseElement) {
			return ((BaseElement) location).getId();
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpactPackage.IMPACT__CAUSE:
				return basicSetCause(null, msgs);
			case ImpactPackage.IMPACT__ROOT_CAUSE:
				return basicSetRootCause(null, msgs);
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
			case ImpactPackage.IMPACT__CAUSE:
				return getCause();
			case ImpactPackage.IMPACT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case ImpactPackage.IMPACT__ROOT_CAUSE:
				return getRootCause();
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
			case ImpactPackage.IMPACT__CAUSE:
				setCause((Impact)newValue);
				return;
			case ImpactPackage.IMPACT__LOCATION:
				setLocation((EObject)newValue);
				return;
			case ImpactPackage.IMPACT__ROOT_CAUSE:
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
			case ImpactPackage.IMPACT__CAUSE:
				setCause((Impact)null);
				return;
			case ImpactPackage.IMPACT__LOCATION:
				setLocation((EObject)null);
				return;
			case ImpactPackage.IMPACT__ROOT_CAUSE:
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
			case ImpactPackage.IMPACT__CAUSE:
				return cause != null;
			case ImpactPackage.IMPACT__LOCATION:
				return location != null;
			case ImpactPackage.IMPACT__ROOT_CAUSE:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImpactPackage.IMPACT___GET_LOCATION_ID:
				return getLocationId();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImpactImpl
