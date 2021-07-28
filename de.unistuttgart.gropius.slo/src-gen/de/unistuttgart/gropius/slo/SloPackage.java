/**
 */
package de.unistuttgart.gropius.slo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.unistuttgart.gropius.slo.SloFactory
 * @model kind="package"
 * @generated
 */
public interface SloPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "slo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/slo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "slo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SloPackage eINSTANCE = de.unistuttgart.gropius.slo.impl.SloPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.slo.impl.SloRuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.slo.impl.SloRuleImpl
	 * @see de.unistuttgart.gropius.slo.impl.SloPackageImpl#getSloRule()
	 * @generated
	 */
	int SLO_RULE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE__PERIOD = 1;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE__THRESHOLD = 2;

	/**
	 * The feature id for the '<em><b>Gropius Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE__GROPIUS_PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Gropius Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE__GROPIUS_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Gropius Component Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE__GROPIUS_COMPONENT_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE__ID = 6;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.slo.impl.ViolationImpl <em>Violation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.slo.impl.ViolationImpl
	 * @see de.unistuttgart.gropius.slo.impl.SloPackageImpl#getViolation()
	 * @generated
	 */
	int VIOLATION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Slo Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION__SLO_RULE = 1;

	/**
	 * The number of structural features of the '<em>Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.slo.impl.solomonImpl <em>solomon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.slo.impl.solomonImpl
	 * @see de.unistuttgart.gropius.slo.impl.SloPackageImpl#getsolomon()
	 * @generated
	 */
	int SOLOMON = 2;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLOMON__RULES = 0;

	/**
	 * The feature id for the '<em><b>Violations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLOMON__VIOLATIONS = 1;

	/**
	 * The number of structural features of the '<em>solomon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLOMON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>solomon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLOMON_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.slo.SloRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see de.unistuttgart.gropius.slo.SloRule
	 * @generated
	 */
	EClass getSloRule();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.SloRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.unistuttgart.gropius.slo.SloRule#getName()
	 * @see #getSloRule()
	 * @generated
	 */
	EAttribute getSloRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.SloRule#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see de.unistuttgart.gropius.slo.SloRule#getPeriod()
	 * @see #getSloRule()
	 * @generated
	 */
	EAttribute getSloRule_Period();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.SloRule#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see de.unistuttgart.gropius.slo.SloRule#getThreshold()
	 * @see #getSloRule()
	 * @generated
	 */
	EAttribute getSloRule_Threshold();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.slo.SloRule#getGropiusProject <em>Gropius Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gropius Project</em>'.
	 * @see de.unistuttgart.gropius.slo.SloRule#getGropiusProject()
	 * @see #getSloRule()
	 * @generated
	 */
	EReference getSloRule_GropiusProject();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.slo.SloRule#getGropiusComponent <em>Gropius Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gropius Component</em>'.
	 * @see de.unistuttgart.gropius.slo.SloRule#getGropiusComponent()
	 * @see #getSloRule()
	 * @generated
	 */
	EReference getSloRule_GropiusComponent();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.slo.SloRule#getGropiusComponentInterface <em>Gropius Component Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gropius Component Interface</em>'.
	 * @see de.unistuttgart.gropius.slo.SloRule#getGropiusComponentInterface()
	 * @see #getSloRule()
	 * @generated
	 */
	EReference getSloRule_GropiusComponentInterface();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.SloRule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.unistuttgart.gropius.slo.SloRule#getId()
	 * @see #getSloRule()
	 * @generated
	 */
	EAttribute getSloRule_Id();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.slo.Violation <em>Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Violation</em>'.
	 * @see de.unistuttgart.gropius.slo.Violation
	 * @generated
	 */
	EClass getViolation();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.Violation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.unistuttgart.gropius.slo.Violation#getValue()
	 * @see #getViolation()
	 * @generated
	 */
	EAttribute getViolation_Value();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.slo.Violation#getSloRule <em>Slo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slo Rule</em>'.
	 * @see de.unistuttgart.gropius.slo.Violation#getSloRule()
	 * @see #getViolation()
	 * @generated
	 */
	EReference getViolation_SloRule();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.slo.solomon <em>solomon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>solomon</em>'.
	 * @see de.unistuttgart.gropius.slo.solomon
	 * @generated
	 */
	EClass getsolomon();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.gropius.slo.solomon#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see de.unistuttgart.gropius.slo.solomon#getRules()
	 * @see #getsolomon()
	 * @generated
	 */
	EReference getsolomon_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.gropius.slo.solomon#getViolations <em>Violations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Violations</em>'.
	 * @see de.unistuttgart.gropius.slo.solomon#getViolations()
	 * @see #getsolomon()
	 * @generated
	 */
	EReference getsolomon_Violations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SloFactory getSloFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.slo.impl.SloRuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.slo.impl.SloRuleImpl
		 * @see de.unistuttgart.gropius.slo.impl.SloPackageImpl#getSloRule()
		 * @generated
		 */
		EClass SLO_RULE = eINSTANCE.getSloRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO_RULE__NAME = eINSTANCE.getSloRule_Name();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO_RULE__PERIOD = eINSTANCE.getSloRule_Period();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO_RULE__THRESHOLD = eINSTANCE.getSloRule_Threshold();

		/**
		 * The meta object literal for the '<em><b>Gropius Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLO_RULE__GROPIUS_PROJECT = eINSTANCE.getSloRule_GropiusProject();

		/**
		 * The meta object literal for the '<em><b>Gropius Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLO_RULE__GROPIUS_COMPONENT = eINSTANCE.getSloRule_GropiusComponent();

		/**
		 * The meta object literal for the '<em><b>Gropius Component Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLO_RULE__GROPIUS_COMPONENT_INTERFACE = eINSTANCE.getSloRule_GropiusComponentInterface();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO_RULE__ID = eINSTANCE.getSloRule_Id();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.slo.impl.ViolationImpl <em>Violation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.slo.impl.ViolationImpl
		 * @see de.unistuttgart.gropius.slo.impl.SloPackageImpl#getViolation()
		 * @generated
		 */
		EClass VIOLATION = eINSTANCE.getViolation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIOLATION__VALUE = eINSTANCE.getViolation_Value();

		/**
		 * The meta object literal for the '<em><b>Slo Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIOLATION__SLO_RULE = eINSTANCE.getViolation_SloRule();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.slo.impl.solomonImpl <em>solomon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.slo.impl.solomonImpl
		 * @see de.unistuttgart.gropius.slo.impl.SloPackageImpl#getsolomon()
		 * @generated
		 */
		EClass SOLOMON = eINSTANCE.getsolomon();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLOMON__RULES = eINSTANCE.getsolomon_Rules();

		/**
		 * The meta object literal for the '<em><b>Violations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLOMON__VIOLATIONS = eINSTANCE.getsolomon_Violations();

	}

} //SloPackage
