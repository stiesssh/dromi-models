/**
 */
package de.unistuttgart.ma.saga.impact;

import de.unistuttgart.gropius.slo.Alert;

import de.unistuttgart.ma.saga.IdentifiableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impact.Notification#getImpacts <em>Impacts</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.Notification#getTopLevelImpacts <em>Top Level Impacts</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.Notification#getAlert <em>Alert</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getNotification()
 * @model
 * @generated
 */
public interface Notification extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Impacts</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.impact.Impact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impacts</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getNotification_Impacts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Impact> getImpacts();

	/**
	 * Returns the value of the '<em><b>Top Level Impacts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Level Impacts</em>' reference.
	 * @see #setTopLevelImpacts(Impact)
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getNotification_TopLevelImpacts()
	 * @model required="true"
	 * @generated
	 */
	Impact getTopLevelImpacts();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.impact.Notification#getTopLevelImpacts <em>Top Level Impacts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Level Impacts</em>' reference.
	 * @see #getTopLevelImpacts()
	 * @generated
	 */
	void setTopLevelImpacts(Impact value);

	/**
	 * Returns the value of the '<em><b>Alert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alert</em>' containment reference.
	 * @see #setAlert(Alert)
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getNotification_Alert()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Alert getAlert();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.impact.Notification#getAlert <em>Alert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alert</em>' containment reference.
	 * @see #getAlert()
	 * @generated
	 */
	void setAlert(Alert value);

} // Notification
