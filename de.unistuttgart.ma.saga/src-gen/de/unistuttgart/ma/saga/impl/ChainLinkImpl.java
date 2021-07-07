/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.ma.saga.ChainLink;
import de.unistuttgart.ma.saga.ElementWithSLO;
import de.unistuttgart.ma.saga.SagaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ChainLinkImpl#getCausedBy <em>Caused By</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ChainLinkImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ChainLinkImpl extends MinimalEObjectImpl.Container implements ChainLink {
	/**
	 * The cached value of the '{@link #getCausedBy() <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausedBy()
	 * @generated
	 * @ordered
	 */
	protected ChainLink causedBy;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected ElementWithSLO location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.CHAIN_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainLink getCausedBy() {
		if (causedBy != null && causedBy.eIsProxy()) {
			InternalEObject oldCausedBy = (InternalEObject) causedBy;
			causedBy = (ChainLink) eResolveProxy(oldCausedBy);
			if (causedBy != oldCausedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SagaPackage.CHAIN_LINK__CAUSED_BY,
							oldCausedBy, causedBy));
			}
		}
		return causedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainLink basicGetCausedBy() {
		return causedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausedBy(ChainLink newCausedBy) {
		ChainLink oldCausedBy = causedBy;
		causedBy = newCausedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.CHAIN_LINK__CAUSED_BY, oldCausedBy,
					causedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementWithSLO getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject) location;
			location = (ElementWithSLO) eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SagaPackage.CHAIN_LINK__LOCATION,
							oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementWithSLO basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(ElementWithSLO newLocation) {
		ElementWithSLO oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.CHAIN_LINK__LOCATION, oldLocation,
					location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SagaPackage.CHAIN_LINK__CAUSED_BY:
			if (resolve)
				return getCausedBy();
			return basicGetCausedBy();
		case SagaPackage.CHAIN_LINK__LOCATION:
			if (resolve)
				return getLocation();
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
		case SagaPackage.CHAIN_LINK__CAUSED_BY:
			setCausedBy((ChainLink) newValue);
			return;
		case SagaPackage.CHAIN_LINK__LOCATION:
			setLocation((ElementWithSLO) newValue);
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
		case SagaPackage.CHAIN_LINK__CAUSED_BY:
			setCausedBy((ChainLink) null);
			return;
		case SagaPackage.CHAIN_LINK__LOCATION:
			setLocation((ElementWithSLO) null);
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
		case SagaPackage.CHAIN_LINK__CAUSED_BY:
			return causedBy != null;
		case SagaPackage.CHAIN_LINK__LOCATION:
			return location != null;
		}
		return super.eIsSet(featureID);
	}

} //ChainLinkImpl