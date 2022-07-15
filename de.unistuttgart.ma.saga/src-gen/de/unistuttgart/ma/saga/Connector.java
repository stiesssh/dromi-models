/**
 */
package de.unistuttgart.ma.saga;

import de.unistuttgart.gropius.ComponentInterface;

import org.eclipse.bpmn2.Task;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.Connector#getComponentinterface <em>Componentinterface</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.Connector#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Componentinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentinterface</em>' reference.
	 * @see #setComponentinterface(ComponentInterface)
	 * @see de.unistuttgart.ma.saga.SagaPackage#getConnector_Componentinterface()
	 * @model required="true"
	 * @generated
	 */
	ComponentInterface getComponentinterface();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.Connector#getComponentinterface <em>Componentinterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Componentinterface</em>' reference.
	 * @see #getComponentinterface()
	 * @generated
	 */
	void setComponentinterface(ComponentInterface value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see de.unistuttgart.ma.saga.SagaPackage#getConnector_Task()
	 * @model required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.Connector#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // Connector
