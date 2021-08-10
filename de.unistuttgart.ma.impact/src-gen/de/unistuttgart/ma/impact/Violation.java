/**
 */
package de.unistuttgart.ma.impact;

import de.unistuttgart.gropius.Issue;

import de.unistuttgart.gropius.slo.SloRule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Violation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.impact.Violation#getViolatedRule <em>Violated Rule</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.Violation#getPeriod <em>Period</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.Violation#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.Violation#getIssue <em>Issue</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.impact.ImpactPackage#getViolation()
 * @model
 * @generated
 */
public interface Violation extends EObject {
	/**
	 * Returns the value of the '<em><b>Violated Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violated Rule</em>' reference.
	 * @see #setViolatedRule(SloRule)
	 * @see de.unistuttgart.ma.impact.ImpactPackage#getViolation_ViolatedRule()
	 * @model required="true"
	 * @generated
	 */
	SloRule getViolatedRule();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.impact.Violation#getViolatedRule <em>Violated Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Violated Rule</em>' reference.
	 * @see #getViolatedRule()
	 * @generated
	 */
	void setViolatedRule(SloRule value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(double)
	 * @see de.unistuttgart.ma.impact.ImpactPackage#getViolation_Period()
	 * @model
	 * @generated
	 */
	double getPeriod();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.impact.Violation#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(double value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see de.unistuttgart.ma.impact.ImpactPackage#getViolation_Threshold()
	 * @model
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.impact.Violation#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' reference.
	 * @see #setIssue(Issue)
	 * @see de.unistuttgart.ma.impact.ImpactPackage#getViolation_Issue()
	 * @model required="true"
	 * @generated
	 */
	Issue getIssue();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.impact.Violation#getIssue <em>Issue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' reference.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(Issue value);

} // Violation
