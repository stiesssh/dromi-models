/**
 */
package de.unistuttgart.ma.saga;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.ComponentInterface#getNextLevelElements <em>Next Level Elements</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getComponentInterface()
 * @model
 * @generated
 */
public interface ComponentInterface extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Next Level Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Level Elements</em>' reference.
	 * @see #setNextLevelElements(SagaStep)
	 * @see de.unistuttgart.ma.saga.SagaPackage#getComponentInterface_NextLevelElements()
	 * @model
	 * @generated
	 */
	SagaStep getNextLevelElements();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.ComponentInterface#getNextLevelElements <em>Next Level Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Level Elements</em>' reference.
	 * @see #getNextLevelElements()
	 * @generated
	 */
	void setNextLevelElements(SagaStep value);
} // ComponentInterface
