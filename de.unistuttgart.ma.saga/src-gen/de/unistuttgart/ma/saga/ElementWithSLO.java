/**
 */
package de.unistuttgart.ma.saga;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element With SLO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.ElementWithSLO#getSlos <em>Slos</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getElementWithSLO()
 * @model abstract="true"
 * @generated
 */
public interface ElementWithSLO extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Slos</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.Slo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slos</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getElementWithSLO_Slos()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Slo> getSlos();

} // ElementWithSLO
