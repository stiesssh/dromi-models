/**
 */
package de.unistuttgart.ma.saga.impact.impl;

import de.unistuttgart.gropius.IssueLocation;
import de.unistuttgart.ma.saga.IdentifiableElement;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactPackage;
import de.unistuttgart.ma.saga.impact.IntermediateImpact;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.bpmn2.FlowElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.IntermediateImpactImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.IntermediateImpactImpl#getImpact <em>Impact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermediateImpactImpl extends ImpactImpl implements IntermediateImpact {
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
	 * The cached value of the '{@link #getImpact() <em>Impact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpact()
	 * @generated
	 * @ordered
	 */
	protected Impact impact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateImpactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpactPackage.Literals.INTERMEDIATE_IMPACT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpactPackage.INTERMEDIATE_IMPACT__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactPackage.INTERMEDIATE_IMPACT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Impact getImpact() {
		return impact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImpact(Impact newImpact, NotificationChain msgs) {
		Impact oldImpact = impact;
		impact = newImpact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpactPackage.INTERMEDIATE_IMPACT__IMPACT, oldImpact, newImpact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpact(Impact newImpact) {
		if (newImpact != impact) {
			NotificationChain msgs = null;
			if (impact != null)
				msgs = ((InternalEObject)impact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpactPackage.INTERMEDIATE_IMPACT__IMPACT, null, msgs);
			if (newImpact != null)
				msgs = ((InternalEObject)newImpact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpactPackage.INTERMEDIATE_IMPACT__IMPACT, null, msgs);
			msgs = basicSetImpact(newImpact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactPackage.INTERMEDIATE_IMPACT__IMPACT, newImpact, newImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpactPackage.INTERMEDIATE_IMPACT__IMPACT:
				return basicSetImpact(null, msgs);
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
			case ImpactPackage.INTERMEDIATE_IMPACT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case ImpactPackage.INTERMEDIATE_IMPACT__IMPACT:
				return getImpact();
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
			case ImpactPackage.INTERMEDIATE_IMPACT__LOCATION:
				setLocation((EObject)newValue);
				return;
			case ImpactPackage.INTERMEDIATE_IMPACT__IMPACT:
				setImpact((Impact)newValue);
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
			case ImpactPackage.INTERMEDIATE_IMPACT__LOCATION:
				setLocation((EObject)null);
				return;
			case ImpactPackage.INTERMEDIATE_IMPACT__IMPACT:
				setImpact((Impact)null);
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
			case ImpactPackage.INTERMEDIATE_IMPACT__LOCATION:
				return location != null;
			case ImpactPackage.INTERMEDIATE_IMPACT__IMPACT:
				return impact != null;
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
			case ImpactPackage.INTERMEDIATE_IMPACT___GET_LOCATION_ID:
				return getLocationId();
			case ImpactPackage.INTERMEDIATE_IMPACT___GET_LOCATION_NAME:
				return getLocationName();
		}
		return super.eInvoke(operationID, arguments);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * rely on getLocation() to make sure, that proxies get resolved first.  
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getLocationId() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (getLocation() instanceof IssueLocation) {
			return ((IssueLocation) getLocation()).getId();
		}
		if (getLocation() instanceof IdentifiableElement) {
			return ((IdentifiableElement) getLocation()).getId();
		}
		if (getLocation() instanceof FlowElement) {
			return ((FlowElement) getLocation()).getId();
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * rely on getLocation() to make sure, that proxies get resolved first.  
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getLocationName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (getLocation() instanceof IssueLocation) {
			return ((IssueLocation) getLocation()).getName();
		}
		if (getLocation() instanceof IdentifiableElement) {
			return ((IdentifiableElement) getLocation()).getName();
		}
		if (getLocation() instanceof FlowElement) {
			return ((FlowElement) getLocation()).getName();
		}
		throw new UnsupportedOperationException();
	}


} //IntermediateImpactImpl
