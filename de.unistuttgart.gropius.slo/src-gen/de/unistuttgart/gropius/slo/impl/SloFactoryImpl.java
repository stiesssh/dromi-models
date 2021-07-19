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
		case SloPackage.ALERT:
			return createAlert();
		case SloPackage.MODEL:
			return createModel();
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
	public Alert createAlert() {
		AlertImpl alert = new AlertImpl();
		return alert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
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
