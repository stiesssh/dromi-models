/**
 */
package de.unistuttgart.ma.saga.impact;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link de.unistuttgart.ma.saga.impact.Notification#getTopLevelImpacts <em>Top Level Impacts</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.Notification#getSystem <em>System</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.Notification#getImpacts <em>Impacts</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getNotification()
 * @model
 * @generated
 */
public interface Notification extends EObject {
	/**
	 * Returns the value of the '<em><b>Top Level Impacts</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.impact.Impact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Level Impacts</em>' reference list.
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getNotification_TopLevelImpacts()
	 * @model
	 * @generated
	 */
	EList<Impact> getTopLevelImpacts();

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(de.unistuttgart.ma.saga.System)
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getNotification_System()
	 * @model
	 * @generated
	 */
	de.unistuttgart.ma.saga.System getSystem();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.impact.Notification#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(de.unistuttgart.ma.saga.System value);

	/**
	 * Returns the value of the '<em><b>Impacts</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.impact.Impact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impacts</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getNotification_Impacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Impact> getImpacts();

} // Notification
