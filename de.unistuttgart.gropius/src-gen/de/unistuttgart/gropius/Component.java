/**
 */
package de.unistuttgart.gropius;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.Component#getOwner <em>Owner</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Component#getIms <em>Ims</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Component#getIssues <em>Issues</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Component#getProjects <em>Projects</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Component#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Component#getConsumedInterfaces <em>Consumed Interfaces</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Component#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.GropiusPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends IssueLocation, Node {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(User)
	 * @see de.unistuttgart.gropius.GropiusPackage#getComponent_Owner()
	 * @model
	 * @generated
	 */
	User getOwner();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Component#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(User value);

	/**
	 * Returns the value of the '<em><b>Ims</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ims</em>' reference.
	 * @see #setIms(IMS)
	 * @see de.unistuttgart.gropius.GropiusPackage#getComponent_Ims()
	 * @model
	 * @generated
	 */
	IMS getIms();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Component#getIms <em>Ims</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ims</em>' reference.
	 * @see #getIms()
	 * @generated
	 */
	void setIms(IMS value);

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getComponent_Issues()
	 * @model
	 * @generated
	 */
	EList<Issue> getIssues();

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getComponent_Projects()
	 * @model
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.ComponentInterface}.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.gropius.ComponentInterface#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getComponent_Interfaces()
	 * @see de.unistuttgart.gropius.ComponentInterface#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<ComponentInterface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Consumed Interfaces</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.ComponentInterface}.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.gropius.ComponentInterface#getConsumedBy <em>Consumed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed Interfaces</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getComponent_ConsumedInterfaces()
	 * @see de.unistuttgart.gropius.ComponentInterface#getConsumedBy
	 * @model opposite="consumedBy"
	 * @generated
	 */
	EList<ComponentInterface> getConsumedInterfaces();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.Label}.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.gropius.Label#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getComponent_Labels()
	 * @see de.unistuttgart.gropius.Label#getComponents
	 * @model opposite="components"
	 * @generated
	 */
	EList<Label> getLabels();

} // Component
