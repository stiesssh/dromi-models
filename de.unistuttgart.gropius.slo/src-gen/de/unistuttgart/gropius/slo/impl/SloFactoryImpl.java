/**
 */
package de.unistuttgart.gropius.slo.impl;

import de.unistuttgart.gropius.slo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SloFactoryImpl extends EFactoryImpl implements SloFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SloFactory init() {
		try {
			SloFactory theSloFactory = (SloFactory) EPackage.Registry.INSTANCE.getEFactory(SloPackage.eNS_URI);
			if (theSloFactory != null) {
				return theSloFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SloFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SloPackage.SLO_RULE:
			return createSloRule();
		case SloPackage.VIOLATION:
			return createViolation();
		case SloPackage.SOLOMON:
			return createsolomon();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloRule createSloRule() {
		SloRuleImpl sloRule = new SloRuleImpl();
		return sloRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Violation createViolation() {
		ViolationImpl violation = new ViolationImpl();
		return violation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public solomon createsolomon() {
		solomonImpl solomon = new solomonImpl();
		return solomon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloPackage getSloPackage() {
		return (SloPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SloPackage getPackage() {
		return SloPackage.eINSTANCE;
	}

} //SloFactoryImpl
