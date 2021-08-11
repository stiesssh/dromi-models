/**
 */
package de.unistuttgart.ma.saga;

import de.unistuttgart.gropius.Project;

import de.unistuttgart.gropius.slo.SloRule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.System#getSagas <em>Sagas</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.System#getProcesses <em>Processes</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.System#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.System#getSloRules <em>Slo Rules</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Sagas</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.Saga}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sagas</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getSystem_Sagas()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Saga> getSagas();

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpmn2.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getSystem_Processes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<org.eclipse.bpmn2.Process> getProcesses();

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' containment reference.
	 * @see #setArchitecture(Project)
	 * @see de.unistuttgart.ma.saga.SagaPackage#getSystem_Architecture()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Project getArchitecture();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.System#getArchitecture <em>Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' containment reference.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(Project value);

	/**
	 * Returns the value of the '<em><b>Slo Rules</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.slo.SloRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo Rules</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getSystem_SloRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<SloRule> getSloRules();

} // System
