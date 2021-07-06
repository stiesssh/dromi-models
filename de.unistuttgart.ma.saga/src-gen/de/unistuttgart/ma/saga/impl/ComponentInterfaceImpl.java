/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.ma.saga.ComponentInterface;
import de.unistuttgart.ma.saga.SagaPackage;

import de.unistuttgart.ma.saga.SagaStep;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentInterfaceImpl#getNextLevelElements <em>Next Level Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInterfaceImpl extends NamedElementImpl implements ComponentInterface {
	/**
	 * The cached value of the '{@link #getNextLevelElements() <em>Next Level Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextLevelElements()
	 * @generated
	 * @ordered
	 */
	protected SagaStep nextLevelElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.COMPONENT_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaStep getNextLevelElements() {
		if (nextLevelElements != null && nextLevelElements.eIsProxy()) {
			InternalEObject oldNextLevelElements = (InternalEObject) nextLevelElements;
			nextLevelElements = (SagaStep) eResolveProxy(oldNextLevelElements);
			if (nextLevelElements != oldNextLevelElements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SagaPackage.COMPONENT_INTERFACE__NEXT_LEVEL_ELEMENTS, oldNextLevelElements,
							nextLevelElements));
			}
		}
		return nextLevelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaStep basicGetNextLevelElements() {
		return nextLevelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextLevelElements(SagaStep newNextLevelElements) {
		SagaStep oldNextLevelElements = nextLevelElements;
		nextLevelElements = newNextLevelElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.COMPONENT_INTERFACE__NEXT_LEVEL_ELEMENTS,
					oldNextLevelElements, nextLevelElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SagaPackage.COMPONENT_INTERFACE__NEXT_LEVEL_ELEMENTS:
			if (resolve)
				return getNextLevelElements();
			return basicGetNextLevelElements();
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
		case SagaPackage.COMPONENT_INTERFACE__NEXT_LEVEL_ELEMENTS:
			setNextLevelElements((SagaStep) newValue);
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
		case SagaPackage.COMPONENT_INTERFACE__NEXT_LEVEL_ELEMENTS:
			setNextLevelElements((SagaStep) null);
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
		case SagaPackage.COMPONENT_INTERFACE__NEXT_LEVEL_ELEMENTS:
			return nextLevelElements != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentInterfaceImpl
