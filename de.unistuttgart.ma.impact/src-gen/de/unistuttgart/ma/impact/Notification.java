/**
 */
package de.unistuttgart.ma.impact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.impact.Notification#getTopLevelImpact <em>Top Level Impact</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.Notification#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.Notification#getRootCause <em>Root Cause</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.impact.ImpactPackage#getNotification()
 * @model
 * @generated
 */
public interface Notification extends EObject {
	/**
	 * Returns the value of the '<em><b>Top Level Impact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Level Impact</em>' reference.
	 * @see #setTopLevelImpact(Impact)
	 * @see de.unistuttgart.ma.impact.ImpactPackage#getNotification_TopLevelImpact()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Impact getTopLevelImpact();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.impact.Notification#getTopLevelImpact <em>Top Level Impact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Level Impact</em>' reference.
	 * @see #getTopLevelImpact()
	 * @generated
	 */
	void setTopLevelImpact(Impact value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.unistuttgart.ma.impact.ImpactPackage#getNotification_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.impact.Notification#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Root Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Cause</em>' reference.
	 * @see #setRootCause(Violation)
	 * @see de.unistuttgart.ma.impact.ImpactPackage#getNotification_RootCause()
	 * @model required="true"
	 * @generated
	 */
	Violation getRootCause();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.impact.Notification#getRootCause <em>Root Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Cause</em>' reference.
	 * @see #getRootCause()
	 * @generated
	 */
	void setRootCause(Violation value);

} // Notification
