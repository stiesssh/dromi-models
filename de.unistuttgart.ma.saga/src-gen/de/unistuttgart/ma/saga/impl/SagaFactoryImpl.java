/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.ma.saga.Activity;
import de.unistuttgart.ma.saga.ChainStart;
import de.unistuttgart.ma.saga.Component;
import de.unistuttgart.ma.saga.ComponentInterface;
import de.unistuttgart.ma.saga.Impact;
import de.unistuttgart.ma.saga.Project;
import de.unistuttgart.ma.saga.Saga;
import de.unistuttgart.ma.saga.SagaFactory;
import de.unistuttgart.ma.saga.SagaPackage;
import de.unistuttgart.ma.saga.SagaStep;
import de.unistuttgart.ma.saga.Slo;
import de.unistuttgart.ma.saga.Violation;
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
public class SagaFactoryImpl extends EFactoryImpl implements SagaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SagaFactory init() {
		try {
			SagaFactory theSagaFactory = (SagaFactory) EPackage.Registry.INSTANCE.getEFactory(SagaPackage.eNS_URI);
			if (theSagaFactory != null) {
				return theSagaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SagaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaFactoryImpl() {
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
		case SagaPackage.PROJECT:
			return createProject();
		case SagaPackage.COMPONENT:
			return createComponent();
		case SagaPackage.COMPONENT_INTERFACE:
			return createComponentInterface();
		case SagaPackage.SAGA:
			return createSaga();
		case SagaPackage.SAGA_STEP:
			return createSagaStep();
		case SagaPackage.PROCESS:
			return createProcess();
		case SagaPackage.ACTIVITY:
			return createActivity();
		case SagaPackage.SLO:
			return createSlo();
		case SagaPackage.VIOLATION:
			return createViolation();
		case SagaPackage.IMPACT:
			return createImpact();
		case SagaPackage.CHAIN_START:
			return createChainStart();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface createComponentInterface() {
		ComponentInterfaceImpl componentInterface = new ComponentInterfaceImpl();
		return componentInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Saga createSaga() {
		SagaImpl saga = new SagaImpl();
		return saga;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaStep createSagaStep() {
		SagaStepImpl sagaStep = new SagaStepImpl();
		return sagaStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.unistuttgart.ma.saga.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slo createSlo() {
		SloImpl slo = new SloImpl();
		return slo;
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
	public Impact createImpact() {
		ImpactImpl impact = new ImpactImpl();
		return impact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainStart createChainStart() {
		ChainStartImpl chainStart = new ChainStartImpl();
		return chainStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaPackage getSagaPackage() {
		return (SagaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SagaPackage getPackage() {
		return SagaPackage.eINSTANCE;
	}

} //SagaFactoryImpl
