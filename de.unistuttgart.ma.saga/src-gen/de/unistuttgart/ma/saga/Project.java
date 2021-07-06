/**
 */
package de.unistuttgart.ma.saga;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.Project#getComponents <em>Components</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.Project#getSagas <em>Sagas</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.Project#getProcesses <em>Processes</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getProject_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Sagas</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.Saga}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sagas</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getProject_Sagas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Saga> getSagas();

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getProject_Processes()
	 * @model containment="true"
	 * @generated
	 */
	EList<de.unistuttgart.ma.saga.Process> getProcesses();

} // Project
