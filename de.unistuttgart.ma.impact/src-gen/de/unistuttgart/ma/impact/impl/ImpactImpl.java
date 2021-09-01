/**
 */
package de.unistuttgart.ma.impact.impl;

import de.unistuttgart.gropius.IssueLocation;
import de.unistuttgart.gropius.Node;
import de.unistuttgart.ma.impact.Impact;
import de.unistuttgart.ma.impact.ImpactPackage;
import de.unistuttgart.ma.saga.IdentifiableElement;

import org.eclipse.bpmn2.FlowElement;
import org.eclipse.emf.common.notify.Notification;
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
 *   <li>{@link de.unistuttgart.ma.impact.impl.ImpactImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.impl.ImpactImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.impl.ImpactImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpactImpl extends MinimalEObjectImpl.Container implements Impact {
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
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected Impact cause;

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
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactPackage.IMPACT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpactPackage.IMPACT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case ImpactPackage.IMPACT__CAUSE:
				if (resolve) return getCause();
				return basicGetCause();
			case ImpactPackage.IMPACT__ID:
				return getId();
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
			case ImpactPackage.IMPACT__LOCATION:
				setLocation((EObject)newValue);
				return;
			case ImpactPackage.IMPACT__CAUSE:
				setCause((Impact)newValue);
				return;
			case ImpactPackage.IMPACT__ID:
				setId((String)newValue);
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
			case ImpactPackage.IMPACT__LOCATION:
				setLocation((EObject)null);
				return;
			case ImpactPackage.IMPACT__CAUSE:
				setCause((Impact)null);
				return;
			case ImpactPackage.IMPACT__ID:
				setId(ID_EDEFAULT);
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
			case ImpactPackage.IMPACT__LOCATION:
				return location != null;
			case ImpactPackage.IMPACT__CAUSE:
				return cause != null;
			case ImpactPackage.IMPACT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
	
	/**
	 * 
	 * @return
	 * 
	 * @generated NOT
	 */
	@Override
	public String getLocationId() {
		if (getLocation() instanceof Node) {
			return ((Node) getLocation()).getId();
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
	 * 
	 * @return
	 * 
	 * @generated NOT
	 */
	@Override
	public String getLocationContainerId() {
		EObject container = this.getLocation().eContainer(); 
		if (container instanceof IssueLocation) {
			return ((IssueLocation) container).getId();
		}
		if (container instanceof IdentifiableElement) {
			return ((IdentifiableElement) container).getId();
		}
		if (container instanceof org.eclipse.bpmn2.Process) {
			return ((org.eclipse.bpmn2.Process) container).getId();
		}
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 
	 * @return
	 * 
	 * @generated NOT
	 */
	@Override
	public String getLocationName() {
		if (this.getLocation() instanceof IssueLocation) {
			return ((IssueLocation) this.getLocation()).getName();
		}
		if (this.getLocation() instanceof IdentifiableElement) {
			return ((IdentifiableElement) this.getLocation()).getName();
		}
		if (this.getLocation() instanceof FlowElement) {
			return ((FlowElement) this.getLocation()).getName();
		}
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 
	 * @return
	 * 
	 * @generated NOT
	 */
	@Override
	public String getLocationContainerName() {
		EObject container = this.getLocation().eContainer(); 
		if (container instanceof IssueLocation) {
			return ((IssueLocation) container).getName();
		}
		if (container instanceof IdentifiableElement) {
			return ((IdentifiableElement) container).getName();
		}
		if (container instanceof org.eclipse.bpmn2.Process) {
			return ((org.eclipse.bpmn2.Process) container).getName();
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return
	 * 
	 * @generated NOT
	 */
	@Override
	public String getLocationContainerType() {
		EObject container = this.getLocation().eContainer(); 
		return container.getClass().getInterfaces()[0].getSimpleName();
	}

	/**
	 * 
	 * @return
	 * 
	 * @generated NOT
	 */
	@Override
	public String getLocationType() {
		return this.getLocation().getClass().getInterfaces()[0].getSimpleName();
	}

} //ImpactImpl
