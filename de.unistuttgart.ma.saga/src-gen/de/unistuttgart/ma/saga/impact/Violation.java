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
 *   <li>{@link de.unistuttgart.ma.saga.impact.Violation#getValue <em>Value</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.Violation#getSloRule <em>Slo Rule</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getViolation()
 * @model
 * @generated
 */
public interface Violation extends Impact {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not in solomon
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getViolation_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.impact.Violation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Slo Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo Rule</em>' reference.
	 * @see #setSloRule(SloRule)
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getViolation_SloRule()
	 * @model required="true"
	 * @generated
	 */
	SloRule getSloRule();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.impact.Violation#getSloRule <em>Slo Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slo Rule</em>' reference.
	 * @see #getSloRule()
	 * @generated
	 */
	void setSloRule(SloRule value);

} // Violation
