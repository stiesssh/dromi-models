/**
 */
package de.unistuttgart.gropius.slo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.unistuttgart.gropius.slo.SloPackage
 * @generated
 */
public interface SloFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SloFactory eINSTANCE = de.unistuttgart.gropius.slo.impl.SloFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	SloRule createSloRule();

	/**
	 * Returns a new object of class '<em>Violation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Violation</em>'.
	 * @generated
	 */
	Violation createViolation();

	/**
	 * Returns a new object of class '<em>solomon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>solomon</em>'.
	 * @generated
	 */
	solomon createsolomon();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SloPackage getSloPackage();

} //SloFactory
