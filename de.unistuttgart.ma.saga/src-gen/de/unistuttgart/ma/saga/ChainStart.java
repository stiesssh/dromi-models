/**
 */
package de.unistuttgart.ma.saga;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.ChainStart#getChainlink <em>Chainlink</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getChainStart()
 * @model
 * @generated
 */
public interface ChainStart extends EObject {
	/**
	 * Returns the value of the '<em><b>Chainlink</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.ChainLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chainlink</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getChainStart_Chainlink()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChainLink> getChainlink();

} // ChainStart
