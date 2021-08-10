/**
 */
package de.unistuttgart.ma.impact.impl;

import de.unistuttgart.gropius.Issue;

import de.unistuttgart.gropius.slo.SloRule;

import de.unistuttgart.ma.impact.ImpactPackage;
import de.unistuttgart.ma.impact.Violation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Violation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.impact.impl.ViolationImpl#getViolatedRule <em>Violated Rule</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.impl.ViolationImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.impl.ViolationImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.impl.ViolationImpl#getIssue <em>Issue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViolationImpl extends MinimalEObjectImpl.Container implements Violation {
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
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIOD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected double period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected double threshold = THRESHOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected Issue issue;

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
	public double getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(double newPeriod) {
		double oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactPackage.VIOLATION__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(double newThreshold) {
		double oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactPackage.VIOLATION__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue getIssue() {
		if (issue != null && issue.eIsProxy()) {
			InternalEObject oldIssue = (InternalEObject)issue;
			issue = (Issue)eResolveProxy(oldIssue);
			if (issue != oldIssue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpactPackage.VIOLATION__ISSUE, oldIssue, issue));
			}
		}
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue basicGetIssue() {
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssue(Issue newIssue) {
		Issue oldIssue = issue;
		issue = newIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactPackage.VIOLATION__ISSUE, oldIssue, issue));
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
			case ImpactPackage.VIOLATION__PERIOD:
				return getPeriod();
			case ImpactPackage.VIOLATION__THRESHOLD:
				return getThreshold();
			case ImpactPackage.VIOLATION__ISSUE:
				if (resolve) return getIssue();
				return basicGetIssue();
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
			case ImpactPackage.VIOLATION__PERIOD:
				setPeriod((Double)newValue);
				return;
			case ImpactPackage.VIOLATION__THRESHOLD:
				setThreshold((Double)newValue);
				return;
			case ImpactPackage.VIOLATION__ISSUE:
				setIssue((Issue)newValue);
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
			case ImpactPackage.VIOLATION__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case ImpactPackage.VIOLATION__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
				return;
			case ImpactPackage.VIOLATION__ISSUE:
				setIssue((Issue)null);
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
			case ImpactPackage.VIOLATION__PERIOD:
				return period != PERIOD_EDEFAULT;
			case ImpactPackage.VIOLATION__THRESHOLD:
				return threshold != THRESHOLD_EDEFAULT;
			case ImpactPackage.VIOLATION__ISSUE:
				return issue != null;
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
		result.append(" (period: ");
		result.append(period);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(')');
		return result.toString();
	}

} //ViolationImpl
