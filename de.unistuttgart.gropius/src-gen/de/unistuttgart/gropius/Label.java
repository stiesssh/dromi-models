/**
 */
package de.unistuttgart.gropius;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.Label#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Label#getDescription <em>Description</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Label#getColor <em>Color</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Label#getComponents <em>Components</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Label#getProjects <em>Projects</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Label#getReaction <em>Reaction</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.GropiusPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.unistuttgart.gropius.GropiusPackage#getLabel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Label#getName <em>Name</em>}' attribute.
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
	 * @see de.unistuttgart.gropius.GropiusPackage#getLabel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Label#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Object)
	 * @see de.unistuttgart.gropius.GropiusPackage#getLabel_Color()
	 * @model dataType="de.unistuttgart.gropius.Color"
	 * @generated
	 */
	Object getColor();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Label#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Object value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.gropius.Component#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference.
	 * @see #setComponents(Component)
	 * @see de.unistuttgart.gropius.GropiusPackage#getLabel_Components()
	 * @see de.unistuttgart.gropius.Component#getLabels
	 * @model opposite="labels"
	 * @generated
	 */
	Component getComponents();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Label#getComponents <em>Components</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' reference.
	 * @see #getComponents()
	 * @generated
	 */
	void setComponents(Component value);

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference.
	 * @see #setProjects(Project)
	 * @see de.unistuttgart.gropius.GropiusPackage#getLabel_Projects()
	 * @model
	 * @generated
	 */
	Project getProjects();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Label#getProjects <em>Projects</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projects</em>' reference.
	 * @see #getProjects()
	 * @generated
	 */
	void setProjects(Project value);

	/**
	 * Returns the value of the '<em><b>Reaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reaction</em>' attribute.
	 * @see #setReaction(String)
	 * @see de.unistuttgart.gropius.GropiusPackage#getLabel_Reaction()
	 * @model
	 * @generated
	 */
	String getReaction();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Label#getReaction <em>Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reaction</em>' attribute.
	 * @see #getReaction()
	 * @generated
	 */
	void setReaction(String value);

} // Label
