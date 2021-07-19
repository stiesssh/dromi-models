/**
 */
package de.unistuttgart.ma.saga;

import de.unistuttgart.gropius.slo.SloRule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element With SLO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.ElementWithSLO#getSloRules <em>Slo Rules</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getElementWithSLO()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ElementWithSLO extends EObject {
	/**
	 * Returns the value of the '<em><b>Slo Rules</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.slo.SloRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo Rules</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getElementWithSLO_SloRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<SloRule> getSloRules();

} // ElementWithSLO
