/**
 */
package de.unistuttgart.ma.saga.impact.impl;

import de.unistuttgart.gropius.Node;
import de.unistuttgart.gropius.slo.Alert;
import de.unistuttgart.ma.saga.IdentifiableElement;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactPackage;

import org.eclipse.bpmn2.BaseElement;

import de.unistuttgart.ma.saga.impl.IdentifiableElementImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.ImpactImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.ImpactImpl#getRootCause <em>Root Cause</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.ImpactImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpactImpl extends IdentifiableElementImpl implements Impact {
	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected Impact cause;

	/**
	 * The cached value of the '{@link #getRootCause() <em>Root Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCause()
	 * @generated
	 * @ordered
	 */
	protected Alert rootCause;

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
		if (cause != null && cause.eIsProxy()) {
			InternalEObject oldCause = (InternalEObject)cause;
			cause = (Impact)eResolveProxy(oldCause);
			if (cause != oldCause) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpactPackage.IMPACT__CAUSE, oldCause, cause));
			}
		}
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Impact basicGetCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(Impact newCause) {
		Impact oldCause = cause;
		cause = newCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactPackage.IMPACT__CAUSE, oldCause, cause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alert getRootCause() {
		if (rootCause != null && rootCause.eIsProxy()) {
			InternalEObject oldRootCause = (InternalEObject)rootCause;
			rootCause = (Alert)eResolveProxy(oldRootCause);
			if (rootCause != oldRootCause) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpactPackage.IMPACT__ROOT_CAUSE, oldRootCause, rootCause));
			}
		}
		return rootCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alert basicGetRootCause() {
		return rootCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootCause(Alert newRootCause) {
		Alert oldRootCause = rootCause;
		rootCause = newRootCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactPackage.IMPACT__ROOT_CAUSE, oldRootCause, rootCause));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpactPackage.IMPACT__CAUSE:
				if (resolve) return getCause();
				return basicGetCause();
			case ImpactPackage.IMPACT__ROOT_CAUSE:
				if (resolve) return getRootCause();
				return basicGetRootCause();
			case ImpactPackage.IMPACT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
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
			case ImpactPackage.IMPACT__ROOT_CAUSE:
				setRootCause((Alert)newValue);
				return;
			case ImpactPackage.IMPACT__LOCATION:
				setLocation((EObject)newValue);
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
			case ImpactPackage.IMPACT__ROOT_CAUSE:
				setRootCause((Alert)null);
				return;
			case ImpactPackage.IMPACT__LOCATION:
				setLocation((EObject)null);
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
			case ImpactPackage.IMPACT__ROOT_CAUSE:
				return rootCause != null;
			case ImpactPackage.IMPACT__LOCATION:
				return location != null;
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