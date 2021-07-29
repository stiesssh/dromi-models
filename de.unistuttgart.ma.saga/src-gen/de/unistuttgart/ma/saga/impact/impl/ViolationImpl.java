/**
 */
package de.unistuttgart.ma.saga.impact.impl;

import de.unistuttgart.gropius.slo.SloRule;

import de.unistuttgart.ma.saga.impact.ImpactPackage;
import de.unistuttgart.ma.saga.impact.Violation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Violation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.ViolationImpl#getViolatedRule <em>Violated Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViolationImpl extends ImpactImpl implements Violation {
	/**
	 * The cached value of the '{@link #getViolatedRule() <em>Violated Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolatedRule()
	 * @generated
	 * @ordered
	 */
	protected SloRule violatedRule;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViolationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpactPackage.Literals.VIOLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloRule getViolatedRule() {
		if (violatedRule != null && violatedRule.eIsProxy()) {
			InternalEObject oldViolatedRule = (InternalEObject)violatedRule;
			violatedRule = (SloRule)eResolveProxy(oldViolatedRule);
			if (violatedRule != oldViolatedRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpactPackage.VIOLATION__VIOLATED_RULE, oldViolatedRule, violatedRule));
			}
		}
		return violatedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloRule basicGetViolatedRule() {
		return violatedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViolatedRule(SloRule newViolatedRule) {
		SloRule oldViolatedRule = violatedRule;
		violatedRule = newViolatedRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactPackage.VIOLATION__VIOLATED_RULE, oldViolatedRule, violatedRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpactPackage.VIOLATION__VIOLATED_RULE:
				if (resolve) return getViolatedRule();
				return basicGetViolatedRule();
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
			case ImpactPackage.VIOLATION__VIOLATED_RULE:
				setViolatedRule((SloRule)newValue);
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
			case ImpactPackage.VIOLATION__VIOLATED_RULE:
				setViolatedRule((SloRule)null);
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
			case ImpactPackage.VIOLATION__VIOLATED_RULE:
				return violatedRule != null;
		}
		return super.eIsSet(featureID);
	}

} //ViolationImpl
