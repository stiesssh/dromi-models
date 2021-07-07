/**
 */
package de.unistuttgart.ma.saga;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.ChainLink#getCausedBy <em>Caused By</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.ChainLink#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getChainLink()
 * @model abstract="true"
 * @generated
 */
public interface ChainLink extends EObject {

	/**
	 * Returns the value of the '<em><b>Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caused By</em>' reference.
	 * @see #setCausedBy(ChainLink)
	 * @see de.unistuttgart.ma.saga.SagaPackage#getChainLink_CausedBy()
	 * @model required="true"
	 * @generated
	 */
	ChainLink getCausedBy();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.ChainLink#getCausedBy <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caused By</em>' reference.
	 * @see #getCausedBy()
	 * @generated
	 */
	void setCausedBy(ChainLink value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(ElementWithSLO)
	 * @see de.unistuttgart.ma.saga.SagaPackage#getChainLink_Location()
	 * @model
	 * @generated
	 */
	ElementWithSLO getLocation();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.ChainLink#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(ElementWithSLO value);
} // ChainLink
