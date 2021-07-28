/**
 */
package de.unistuttgart.gropius.slo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>solomon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.slo.solomon#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.slo.SloPackage#getsolomon()
 * @model
 * @generated
 */
public interface solomon extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.slo.SloRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see de.unistuttgart.gropius.slo.SloPackage#getsolomon_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<SloRule> getRules();

} // solomon
