/**
 */
package de.unistuttgart.gropius;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.Project#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Project#getComponents <em>Components</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Project#getUsers <em>Users</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Project#getOwner <em>Owner</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Project#getIssues <em>Issues</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Project#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.GropiusPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.unistuttgart.gropius.GropiusPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.unistuttgart.gropius.GropiusPackage#getProject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Project#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference.
	 * @see #setComponents(Component)
	 * @see de.unistuttgart.gropius.GropiusPackage#getProject_Components()
	 * @model
	 * @generated
	 */
	Component getComponents();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Project#getComponents <em>Components</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' reference.
	 * @see #getComponents()
	 * @generated
	 */
	void setComponents(Component value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.gropius.User#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference.
	 * @see #setUsers(User)
	 * @see de.unistuttgart.gropius.GropiusPackage#getProject_Users()
	 * @see de.unistuttgart.gropius.User#getProjects
	 * @model opposite="projects"
	 * @generated
	 */
	User getUsers();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Project#getUsers <em>Users</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Users</em>' reference.
	 * @see #getUsers()
	 * @generated
	 */
	void setUsers(User value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(User)
	 * @see de.unistuttgart.gropius.GropiusPackage#getProject_Owner()
	 * @model
	 * @generated
	 */
	User getOwner();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Project#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(User value);

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' reference.
	 * @see #setIssues(Issue)
	 * @see de.unistuttgart.gropius.GropiusPackage#getProject_Issues()
	 * @model
	 * @generated
	 */
	Issue getIssues();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Project#getIssues <em>Issues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issues</em>' reference.
	 * @see #getIssues()
	 * @generated
	 */
	void setIssues(Issue value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' reference.
	 * @see #setLabels(Label)
	 * @see de.unistuttgart.gropius.GropiusPackage#getProject_Labels()
	 * @model
	 * @generated
	 */
	Label getLabels();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Project#getLabels <em>Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labels</em>' reference.
	 * @see #getLabels()
	 * @generated
	 */
	void setLabels(Label value);

} // Project
