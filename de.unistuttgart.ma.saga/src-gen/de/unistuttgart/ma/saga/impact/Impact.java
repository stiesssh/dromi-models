/**
 */
package de.unistuttgart.ma.saga.impact;

import de.unistuttgart.gropius.slo.Alert;

import de.unistuttgart.ma.saga.IdentifiableElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impact.Impact#getCause <em>Cause</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.Impact#getRootCause <em>Root Cause</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.Impact#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getImpact()
 * @model
 * @generated
 */
public interface Impact extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' reference.
	 * @see #setCause(Impact)
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getImpact_Cause()
	 * @model
	 * @generated
	 */
	Impact getCause();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.impact.Impact#getCause <em>Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' reference.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(Impact value);

	/**
	 * Returns the value of the '<em><b>Root Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Cause</em>' reference.
	 * @see #setRootCause(Alert)
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getImpact_RootCause()
	 * @model
	 * @generated
	 */
	Alert getRootCause();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.impact.Impact#getRootCause <em>Root Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Cause</em>' reference.
	 * @see #getRootCause()
	 * @generated
	 */
	void setRootCause(Alert value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(EObject)
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getImpact_Location()
	 * @model
	 * @generated
	 */
	EObject getLocation();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.impact.Impact#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(EObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLocationId();

} // Impact
