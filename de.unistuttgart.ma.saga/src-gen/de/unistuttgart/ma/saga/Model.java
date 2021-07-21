/**
 */
package de.unistuttgart.ma.saga;

import de.unistuttgart.gropius.Project;

import de.unistuttgart.gropius.slo.SloRule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.Model#getSagas <em>Sagas</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.Model#getProcesses <em>Processes</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.Model#getGropiusProject <em>Gropius Project</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.Model#getSloRules <em>Slo Rules</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Sagas</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.Saga}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sagas</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getModel_Sagas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Saga> getSagas();

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpmn2.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getModel_Processes()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.eclipse.bpmn2.Process> getProcesses();

	/**
	 * Returns the value of the '<em><b>Gropius Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gropius Project</em>' containment reference.
	 * @see #setGropiusProject(Project)
	 * @see de.unistuttgart.ma.saga.SagaPackage#getModel_GropiusProject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Project getGropiusProject();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.Model#getGropiusProject <em>Gropius Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gropius Project</em>' containment reference.
	 * @see #getGropiusProject()
	 * @generated
	 */
	void setGropiusProject(Project value);

	/**
	 * Returns the value of the '<em><b>Slo Rules</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.slo.SloRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo Rules</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getModel_SloRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<SloRule> getSloRules();

} // Model