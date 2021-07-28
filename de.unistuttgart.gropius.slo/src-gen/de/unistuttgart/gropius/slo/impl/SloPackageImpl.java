/**
 */
package de.unistuttgart.gropius.slo.impl;

import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.slo.SloFactory;
import de.unistuttgart.gropius.slo.SloPackage;
import de.unistuttgart.gropius.slo.SloRule;

import de.unistuttgart.gropius.slo.Violation;
import de.unistuttgart.gropius.slo.solomon;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SloPackageImpl extends EPackageImpl implements SloPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sloRuleEClass = null;

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
	private EClass solomonEClass = null;

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
	 * @see de.unistuttgart.gropius.slo.SloPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SloPackageImpl() {
		super(eNS_URI, SloFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SloPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SloPackage init() {
		if (isInited)
			return (SloPackage) EPackage.Registry.INSTANCE.getEPackage(SloPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSloPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SloPackageImpl theSloPackage = registeredSloPackage instanceof SloPackageImpl
				? (SloPackageImpl) registeredSloPackage
				: new SloPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GropiusPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSloPackage.createPackageContents();

		// Initialize created meta-data
		theSloPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSloPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SloPackage.eNS_URI, theSloPackage);
		return theSloPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSloRule() {
		return sloRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSloRule_Name() {
		return (EAttribute) sloRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSloRule_Period() {
		return (EAttribute) sloRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSloRule_Threshold() {
		return (EAttribute) sloRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSloRule_GropiusProject() {
		return (EReference) sloRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSloRule_GropiusComponent() {
		return (EReference) sloRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSloRule_GropiusComponentInterface() {
		return (EReference) sloRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSloRule_Id() {
		return (EAttribute) sloRuleEClass.getEStructuralFeatures().get(6);
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
		return (EAttribute) violationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViolation_SloRule() {
		return (EReference) violationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsolomon() {
		return solomonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsolomon_Rules() {
		return (EReference) solomonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsolomon_Violations() {
		return (EReference) solomonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloFactory getSloFactory() {
		return (SloFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		sloRuleEClass = createEClass(SLO_RULE);
		createEAttribute(sloRuleEClass, SLO_RULE__NAME);
		createEAttribute(sloRuleEClass, SLO_RULE__PERIOD);
		createEAttribute(sloRuleEClass, SLO_RULE__THRESHOLD);
		createEReference(sloRuleEClass, SLO_RULE__GROPIUS_PROJECT);
		createEReference(sloRuleEClass, SLO_RULE__GROPIUS_COMPONENT);
		createEReference(sloRuleEClass, SLO_RULE__GROPIUS_COMPONENT_INTERFACE);
		createEAttribute(sloRuleEClass, SLO_RULE__ID);

		violationEClass = createEClass(VIOLATION);
		createEAttribute(violationEClass, VIOLATION__VALUE);
		createEReference(violationEClass, VIOLATION__SLO_RULE);

		solomonEClass = createEClass(SOLOMON);
		createEReference(solomonEClass, SOLOMON__RULES);
		createEReference(solomonEClass, SOLOMON__VIOLATIONS);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GropiusPackage theGropiusPackage = (GropiusPackage) EPackage.Registry.INSTANCE
				.getEPackage(GropiusPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(sloRuleEClass, SloRule.class, "SloRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSloRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, SloRule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSloRule_Period(), ecorePackage.getEDouble(), "period", null, 0, 1, SloRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSloRule_Threshold(), ecorePackage.getEDouble(), "threshold", null, 0, 1, SloRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSloRule_GropiusProject(), theGropiusPackage.getProject(), null, "gropiusProject", null, 1, 1,
				SloRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSloRule_GropiusComponent(), theGropiusPackage.getComponent(), null, "gropiusComponent", null,
				1, 1, SloRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSloRule_GropiusComponentInterface(), theGropiusPackage.getComponentInterface(), null,
				"gropiusComponentInterface", null, 1, 1, SloRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSloRule_Id(), ecorePackage.getEString(), "id", null, 0, 1, SloRule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(violationEClass, Violation.class, "Violation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViolation_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Violation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViolation_SloRule(), this.getSloRule(), null, "sloRule", null, 1, 1, Violation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solomonEClass, solomon.class, "solomon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getsolomon_Rules(), this.getSloRule(), null, "rules", null, 0, -1, solomon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getsolomon_Violations(), this.getViolation(), null, "violations", null, 0, -1, solomon.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SloPackageImpl
