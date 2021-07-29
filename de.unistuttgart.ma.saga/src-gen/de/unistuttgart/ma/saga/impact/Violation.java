/**
 */
package de.unistuttgart.ma.saga.impact;

import de.unistuttgart.gropius.slo.SloRule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Violation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impact.Violation#getViolatedRule <em>Violated Rule</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getViolation()
 * @model
 * @generated
 */
public interface Violation extends Impact {
	/**
	 * Returns the value of the '<em><b>Violated Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violated Rule</em>' reference.
	 * @see #setViolatedRule(SloRule)
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getViolation_ViolatedRule()
	 * @model
	 * @generated
	 */
	SloRule getViolatedRule();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.impact.Violation#getViolatedRule <em>Violated Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Violated Rule</em>' reference.
	 * @see #getViolatedRule()
	 * @generated
	 */
	void setViolatedRule(SloRule value);

} // Violation
