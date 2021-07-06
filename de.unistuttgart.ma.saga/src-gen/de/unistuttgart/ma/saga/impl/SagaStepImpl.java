/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.ma.saga.Activity;
import de.unistuttgart.ma.saga.SagaPackage;
import de.unistuttgart.ma.saga.SagaStep;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.SagaStepImpl#getNextLevelElements <em>Next Level Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SagaStepImpl extends NamedElementImpl implements SagaStep {
	/**
	 * The cached value of the '{@link #getNextLevelElements() <em>Next Level Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextLevelElements()
	 * @generated
	 * @ordered
	 */
	protected Activity nextLevelElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SagaStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.SAGA_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getNextLevelElements() {
		if (nextLevelElements != null && nextLevelElements.eIsProxy()) {
			InternalEObject oldNextLevelElements = (InternalEObject) nextLevelElements;
			nextLevelElements = (Activity) eResolveProxy(oldNextLevelElements);
			if (nextLevelElements != oldNextLevelElements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SagaPackage.SAGA_STEP__NEXT_LEVEL_ELEMENTS, oldNextLevelElements, nextLevelElements));
			}
		}
		return nextLevelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetNextLevelElements() {
		return nextLevelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextLevelElements(Activity newNextLevelElements) {
		Activity oldNextLevelElements = nextLevelElements;
		nextLevelElements = newNextLevelElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.SAGA_STEP__NEXT_LEVEL_ELEMENTS,
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
		case SagaPackage.SAGA_STEP__NEXT_LEVEL_ELEMENTS:
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
		case SagaPackage.SAGA_STEP__NEXT_LEVEL_ELEMENTS:
			setNextLevelElements((Activity) newValue);
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
		case SagaPackage.SAGA_STEP__NEXT_LEVEL_ELEMENTS:
			setNextLevelElements((Activity) null);
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
		case SagaPackage.SAGA_STEP__NEXT_LEVEL_ELEMENTS:
			return nextLevelElements != null;
		}
		return super.eIsSet(featureID);
	}

} //SagaStepImpl
