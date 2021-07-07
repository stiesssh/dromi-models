/**
 */
package de.unistuttgart.ma.saga;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.Process#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends ElementWithSLO {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getProcess_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

} // Process
