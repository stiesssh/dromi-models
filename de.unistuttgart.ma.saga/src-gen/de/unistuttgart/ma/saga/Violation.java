/**
 */
package de.unistuttgart.ma.saga;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Violation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.Violation#getSlo <em>Slo</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.Violation#getPassingImpacts <em>Passing Impacts</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getViolation()
 * @model
 * @generated
 */
public interface Violation extends ChainLink {
	/**
	 * Returns the value of the '<em><b>Slo</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.Slo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo</em>' reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getViolation_Slo()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	EList<Slo> getSlo();

	/**
	 * Returns the value of the '<em><b>Passing Impacts</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.ChainLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passing Impacts</em>' reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getViolation_PassingImpacts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ChainLink> getPassingImpacts();

} // Violation
