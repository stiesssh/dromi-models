/**
 */
package de.unistuttgart.ma.saga.impact.impl;

import de.unistuttgart.gropius.GropiusPackage;

import de.unistuttgart.gropius.slo.SloPackage;

import de.unistuttgart.ma.saga.SagaPackage;

import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactFactory;
import de.unistuttgart.ma.saga.impact.ImpactPackage;
import de.unistuttgart.ma.saga.impact.IntermediateImpact;
import de.unistuttgart.ma.saga.impact.Notification;
import de.unistuttgart.ma.saga.impact.Violation;
import de.unistuttgart.ma.saga.impl.SagaPackageImpl;

import org.eclipse.bpmn2.Bpmn2Package;

import org.eclipse.bpmn2.di.BpmnDiPackage;

import org.eclipse.dd.dc.DcPackage;

import org.eclipse.dd.di.DiPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImpactPackageImpl extends EPackageImpl implements ImpactPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateImpactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass violationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.unistuttgart.ma.saga.impact.ImpactPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImpactPackageImpl() {
		super(eNS_URI, ImpactFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ImpactPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImpactPackage init() {
		if (isInited) return (ImpactPackage)EPackage.Registry.INSTANCE.getEPackage(ImpactPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredImpactPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ImpactPackageImpl theImpactPackage = registeredImpactPackage instanceof ImpactPackageImpl ? (ImpactPackageImpl)registeredImpactPackage : new ImpactPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GropiusPackage.eINSTANCE.eClass();
		SloPackage.eINSTANCE.eClass();
		Bpmn2Package.eINSTANCE.eClass();
		BpmnDiPackage.eINSTANCE.eClass();
		DiPackage.eINSTANCE.eClass();
		DcPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SagaPackage.eNS_URI);
		SagaPackageImpl theSagaPackage = (SagaPackageImpl)(registeredPackage instanceof SagaPackageImpl ? registeredPackage : SagaPackage.eINSTANCE);

		// Create package meta-data objects
		theImpactPackage.createPackageContents();
		theSagaPackage.createPackageContents();

		// Initialize created meta-data
		theImpactPackage.initializePackageContents();
		theSagaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImpactPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImpactPackage.eNS_URI, theImpactPackage);
		return theImpactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateImpact() {
		return intermediateImpactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateImpact_Location() {
		return (EReference)intermediateImpactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateImpact_Impact() {
		return (EReference)intermediateImpactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateImpact__GetLocationId() {
		return intermediateImpactEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntermediateImpact__GetLocationName() {
		return intermediateImpactEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpact() {
		return impactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViolation() {
		return violationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViolation_Value() {
		return (EAttribute)violationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViolation_SloRule() {
		return (EReference)violationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotification() {
		return notificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotification_TopLevelImpacts() {
		return (EReference)notificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotification_System() {
		return (EReference)notificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactFactory getImpactFactory() {
		return (ImpactFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		intermediateImpactEClass = createEClass(INTERMEDIATE_IMPACT);
		createEReference(intermediateImpactEClass, INTERMEDIATE_IMPACT__LOCATION);
		createEReference(intermediateImpactEClass, INTERMEDIATE_IMPACT__IMPACT);
		createEOperation(intermediateImpactEClass, INTERMEDIATE_IMPACT___GET_LOCATION_ID);
		createEOperation(intermediateImpactEClass, INTERMEDIATE_IMPACT___GET_LOCATION_NAME);

		notificationEClass = createEClass(NOTIFICATION);
		createEReference(notificationEClass, NOTIFICATION__TOP_LEVEL_IMPACTS);
		createEReference(notificationEClass, NOTIFICATION__SYSTEM);

		impactEClass = createEClass(IMPACT);

		violationEClass = createEClass(VIOLATION);
		createEAttribute(violationEClass, VIOLATION__VALUE);
		createEReference(violationEClass, VIOLATION__SLO_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		SagaPackage theSagaPackage = (SagaPackage)EPackage.Registry.INSTANCE.getEPackage(SagaPackage.eNS_URI);
		SloPackage theSloPackage = (SloPackage)EPackage.Registry.INSTANCE.getEPackage(SloPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		intermediateImpactEClass.getESuperTypes().add(this.getImpact());
		violationEClass.getESuperTypes().add(this.getImpact());

		// Initialize classes, features, and operations; add parameters
		initEClass(intermediateImpactEClass, IntermediateImpact.class, "IntermediateImpact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntermediateImpact_Location(), ecorePackage.getEObject(), null, "location", null, 1, 1, IntermediateImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediateImpact_Impact(), this.getImpact(), null, "impact", null, 1, 1, IntermediateImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIntermediateImpact__GetLocationId(), theXMLTypePackage.getString(), "getLocationId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIntermediateImpact__GetLocationName(), theXMLTypePackage.getString(), "getLocationName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(notificationEClass, Notification.class, "Notification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotification_TopLevelImpacts(), this.getImpact(), null, "topLevelImpacts", null, 0, -1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotification_System(), theSagaPackage.getSystem(), null, "system", null, 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(impactEClass, Impact.class, "Impact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(violationEClass, Violation.class, "Violation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViolation_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Violation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViolation_SloRule(), theSloPackage.getSloRule(), null, "sloRule", null, 1, 1, Violation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ImpactPackageImpl
