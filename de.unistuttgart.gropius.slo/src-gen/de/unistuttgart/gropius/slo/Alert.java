/**
 */
package de.unistuttgart.gropius.slo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.slo.Alert#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.Alert#getValue <em>Value</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.Alert#getSloRule <em>Slo Rule</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.slo.SloPackage#getAlert()
 * @model
 * @generated
 */
public interface Alert extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getAlert_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.Alert#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not in solomon
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getAlert_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.Alert#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Slo Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo Rule</em>' reference.
	 * @see #setSloRule(SloRule)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getAlert_SloRule()
	 * @model
	 * @generated
	 */
	SloRule getSloRule();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.Alert#getSloRule <em>Slo Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slo Rule</em>' reference.
	 * @see #getSloRule()
	 * @generated
	 */
	void setSloRule(SloRule value);

} // Alert
