/**
 */
package de.unistuttgart.ma.saga;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Saga</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.Saga#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getSaga()
 * @model
 * @generated
 */
public interface Saga extends ElementWithSLO {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.SagaStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getSaga_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<SagaStep> getSteps();

} // Saga
