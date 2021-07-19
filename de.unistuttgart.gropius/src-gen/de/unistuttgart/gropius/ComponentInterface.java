/**
 */
package de.unistuttgart.gropius;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.ComponentInterface#getComponent <em>Component</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.ComponentInterface#getConsumedBy <em>Consumed By</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.GropiusPackage#getComponentInterface()
 * @model
 * @generated
 */
public interface ComponentInterface extends IssueLocation, Node {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.gropius.Component#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see de.unistuttgart.gropius.GropiusPackage#getComponentInterface_Component()
	 * @see de.unistuttgart.gropius.Component#getInterfaces
	 * @model opposite="interfaces" required="true" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.ComponentInterface#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Consumed By</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.Component}.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.gropius.Component#getConsumedInterfaces <em>Consumed Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed By</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getComponentInterface_ConsumedBy()
	 * @see de.unistuttgart.gropius.Component#getConsumedInterfaces
	 * @model opposite="consumedInterfaces"
	 * @generated
	 */
	EList<Component> getConsumedBy();

} // ComponentInterface
