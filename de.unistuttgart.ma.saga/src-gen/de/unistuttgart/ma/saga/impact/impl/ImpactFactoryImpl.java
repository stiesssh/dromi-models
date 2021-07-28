/**
 */
package de.unistuttgart.ma.saga.impact.impl;

import de.unistuttgart.ma.saga.impact.*;

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
public class ImpactFactoryImpl extends EFactoryImpl implements ImpactFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImpactFactory init() {
		try {
			ImpactFactory theImpactFactory = (ImpactFactory)EPackage.Registry.INSTANCE.getEFactory(ImpactPackage.eNS_URI);
			if (theImpactFactory != null) {
				return theImpactFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImpactFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactFactoryImpl() {
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
			case ImpactPackage.INTERMEDIATE_IMPACT: return createIntermediateImpact();
			case ImpactPackage.NOTIFICATION: return createNotification();
			case ImpactPackage.VIOLATION: return createViolation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateImpact createIntermediateImpact() {
		IntermediateImpactImpl intermediateImpact = new IntermediateImpactImpl();
		return intermediateImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification createNotification() {
		NotificationImpl notification = new NotificationImpl();
		return notification;
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
	public ImpactPackage getImpactPackage() {
		return (ImpactPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImpactPackage getPackage() {
		return ImpactPackage.eINSTANCE;
	}

} //ImpactFactoryImpl
