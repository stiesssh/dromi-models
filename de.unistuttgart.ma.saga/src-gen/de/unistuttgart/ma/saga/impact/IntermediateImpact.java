/**
 */
package de.unistuttgart.ma.saga.impact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impact.IntermediateImpact#getLocation <em>Location</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.IntermediateImpact#getImpact <em>Impact</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getIntermediateImpact()
 * @model
 * @generated
 */
public interface IntermediateImpact extends Impact {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(EObject)
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getIntermediateImpact_Location()
	 * @model required="true"
	 * @generated
	 */
	EObject getLocation();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.impact.IntermediateImpact#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(EObject value);

	/**
	 * Returns the value of the '<em><b>Impact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact</em>' containment reference.
	 * @see #setImpact(Impact)
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#getIntermediateImpact_Impact()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Impact getImpact();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.impact.IntermediateImpact#getImpact <em>Impact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' containment reference.
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(Impact value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLocationId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLocationName();

} // IntermediateImpact
