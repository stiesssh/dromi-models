/**
 */
package de.unistuttgart.ma.saga;

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
 * @see de.unistuttgart.ma.saga.SagaFactory
 * @model kind="package"
 * @generated
 */
public interface SagaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "saga";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/saga";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "saga";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SagaPackage eINSTANCE = de.unistuttgart.ma.saga.impl.SagaPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.NamedElementImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ProjectImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__COMPONENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sagas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SAGAS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROCESSES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CHAINS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ElementWithSLOImpl <em>Element With SLO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ElementWithSLOImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getElementWithSLO()
	 * @generated
	 */
	int ELEMENT_WITH_SLO = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_SLO__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Slos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_SLO__SLOS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element With SLO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_SLO_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element With SLO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_SLO_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ComponentImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ELEMENT_WITH_SLO__NAME;

	/**
	 * The feature id for the '<em><b>Slos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SLOS = ELEMENT_WITH_SLO__SLOS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INTERFACES = ELEMENT_WITH_SLO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ELEMENT_WITH_SLO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ELEMENT_WITH_SLO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ComponentInterfaceImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getComponentInterface()
	 * @generated
	 */
	int COMPONENT_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__NAME = ELEMENT_WITH_SLO__NAME;

	/**
	 * The feature id for the '<em><b>Slos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__SLOS = ELEMENT_WITH_SLO__SLOS;

	/**
	 * The feature id for the '<em><b>Next Level Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__NEXT_LEVEL_ELEMENTS = ELEMENT_WITH_SLO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_FEATURE_COUNT = ELEMENT_WITH_SLO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_OPERATION_COUNT = ELEMENT_WITH_SLO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.SagaImpl <em>Saga</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.SagaImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getSaga()
	 * @generated
	 */
	int SAGA = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA__NAME = ELEMENT_WITH_SLO__NAME;

	/**
	 * The feature id for the '<em><b>Slos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA__SLOS = ELEMENT_WITH_SLO__SLOS;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA__STEPS = ELEMENT_WITH_SLO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Saga</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_FEATURE_COUNT = ELEMENT_WITH_SLO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Saga</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_OPERATION_COUNT = ELEMENT_WITH_SLO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.SagaStepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.SagaStepImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getSagaStep()
	 * @generated
	 */
	int SAGA_STEP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP__NAME = ELEMENT_WITH_SLO__NAME;

	/**
	 * The feature id for the '<em><b>Slos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP__SLOS = ELEMENT_WITH_SLO__SLOS;

	/**
	 * The feature id for the '<em><b>Next Level Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP__NEXT_LEVEL_ELEMENTS = ELEMENT_WITH_SLO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP_FEATURE_COUNT = ELEMENT_WITH_SLO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP_OPERATION_COUNT = ELEMENT_WITH_SLO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ProcessImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = ELEMENT_WITH_SLO__NAME;

	/**
	 * The feature id for the '<em><b>Slos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SLOS = ELEMENT_WITH_SLO__SLOS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ACTIVITIES = ELEMENT_WITH_SLO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = ELEMENT_WITH_SLO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = ELEMENT_WITH_SLO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ActivityImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = ELEMENT_WITH_SLO__NAME;

	/**
	 * The feature id for the '<em><b>Slos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SLOS = ELEMENT_WITH_SLO__SLOS;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = ELEMENT_WITH_SLO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = ELEMENT_WITH_SLO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.SloImpl <em>Slo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.SloImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getSlo()
	 * @generated
	 */
	int SLO = 8;

	/**
	 * The number of structural features of the '<em>Slo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Slo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ChainLinkImpl <em>Chain Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ChainLinkImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getChainLink()
	 * @generated
	 */
	int CHAIN_LINK = 12;

	/**
	 * The feature id for the '<em><b>Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_LINK__CAUSED_BY = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_LINK__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Chain Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Chain Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ViolationImpl <em>Violation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ViolationImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getViolation()
	 * @generated
	 */
	int VIOLATION = 10;

	/**
	 * The feature id for the '<em><b>Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION__CAUSED_BY = CHAIN_LINK__CAUSED_BY;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION__LOCATION = CHAIN_LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Slo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION__SLO = CHAIN_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Passing Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION__PASSING_IMPACTS = CHAIN_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_FEATURE_COUNT = CHAIN_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_OPERATION_COUNT = CHAIN_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ImpactImpl <em>Impact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ImpactImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getImpact()
	 * @generated
	 */
	int IMPACT = 11;

	/**
	 * The feature id for the '<em><b>Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__CAUSED_BY = CHAIN_LINK__CAUSED_BY;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__LOCATION = CHAIN_LINK__LOCATION;

	/**
	 * The number of structural features of the '<em>Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_FEATURE_COUNT = CHAIN_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_OPERATION_COUNT = CHAIN_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ChainStartImpl <em>Chain Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ChainStartImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getChainStart()
	 * @generated
	 */
	int CHAIN_START = 13;

	/**
	 * The feature id for the '<em><b>Chainlink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_START__CHAINLINK = 0;

	/**
	 * The number of structural features of the '<em>Chain Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_START_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Chain Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_START_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see de.unistuttgart.ma.saga.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.Project#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see de.unistuttgart.ma.saga.Project#getComponents()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.Project#getSagas <em>Sagas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sagas</em>'.
	 * @see de.unistuttgart.ma.saga.Project#getSagas()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Sagas();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.Project#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see de.unistuttgart.ma.saga.Project#getProcesses()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Processes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.Project#getChains <em>Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chains</em>'.
	 * @see de.unistuttgart.ma.saga.Project#getChains()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Chains();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see de.unistuttgart.ma.saga.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.Component#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see de.unistuttgart.ma.saga.Component#getInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Interfaces();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.ComponentInterface <em>Component Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Interface</em>'.
	 * @see de.unistuttgart.ma.saga.ComponentInterface
	 * @generated
	 */
	EClass getComponentInterface();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.ComponentInterface#getNextLevelElements <em>Next Level Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Level Elements</em>'.
	 * @see de.unistuttgart.ma.saga.ComponentInterface#getNextLevelElements()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_NextLevelElements();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.unistuttgart.ma.saga.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.ma.saga.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.unistuttgart.ma.saga.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.Saga <em>Saga</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Saga</em>'.
	 * @see de.unistuttgart.ma.saga.Saga
	 * @generated
	 */
	EClass getSaga();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.Saga#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see de.unistuttgart.ma.saga.Saga#getSteps()
	 * @see #getSaga()
	 * @generated
	 */
	EReference getSaga_Steps();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.SagaStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see de.unistuttgart.ma.saga.SagaStep
	 * @generated
	 */
	EClass getSagaStep();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.SagaStep#getNextLevelElements <em>Next Level Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Level Elements</em>'.
	 * @see de.unistuttgart.ma.saga.SagaStep#getNextLevelElements()
	 * @see #getSagaStep()
	 * @generated
	 */
	EReference getSagaStep_NextLevelElements();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see de.unistuttgart.ma.saga.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.Process#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see de.unistuttgart.ma.saga.Process#getActivities()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Activities();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see de.unistuttgart.ma.saga.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.Slo <em>Slo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slo</em>'.
	 * @see de.unistuttgart.ma.saga.Slo
	 * @generated
	 */
	EClass getSlo();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.ElementWithSLO <em>Element With SLO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element With SLO</em>'.
	 * @see de.unistuttgart.ma.saga.ElementWithSLO
	 * @generated
	 */
	EClass getElementWithSLO();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.ElementWithSLO#getSlos <em>Slos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slos</em>'.
	 * @see de.unistuttgart.ma.saga.ElementWithSLO#getSlos()
	 * @see #getElementWithSLO()
	 * @generated
	 */
	EReference getElementWithSLO_Slos();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.Violation <em>Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Violation</em>'.
	 * @see de.unistuttgart.ma.saga.Violation
	 * @generated
	 */
	EClass getViolation();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.ma.saga.Violation#getSlo <em>Slo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Slo</em>'.
	 * @see de.unistuttgart.ma.saga.Violation#getSlo()
	 * @see #getViolation()
	 * @generated
	 */
	EReference getViolation_Slo();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.ma.saga.Violation#getPassingImpacts <em>Passing Impacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passing Impacts</em>'.
	 * @see de.unistuttgart.ma.saga.Violation#getPassingImpacts()
	 * @see #getViolation()
	 * @generated
	 */
	EReference getViolation_PassingImpacts();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.Impact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impact</em>'.
	 * @see de.unistuttgart.ma.saga.Impact
	 * @generated
	 */
	EClass getImpact();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.ChainLink <em>Chain Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Link</em>'.
	 * @see de.unistuttgart.ma.saga.ChainLink
	 * @generated
	 */
	EClass getChainLink();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.ChainLink#getCausedBy <em>Caused By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caused By</em>'.
	 * @see de.unistuttgart.ma.saga.ChainLink#getCausedBy()
	 * @see #getChainLink()
	 * @generated
	 */
	EReference getChainLink_CausedBy();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.ChainLink#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see de.unistuttgart.ma.saga.ChainLink#getLocation()
	 * @see #getChainLink()
	 * @generated
	 */
	EReference getChainLink_Location();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.ChainStart <em>Chain Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Start</em>'.
	 * @see de.unistuttgart.ma.saga.ChainStart
	 * @generated
	 */
	EClass getChainStart();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.ChainStart#getChainlink <em>Chainlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chainlink</em>'.
	 * @see de.unistuttgart.ma.saga.ChainStart#getChainlink()
	 * @see #getChainStart()
	 * @generated
	 */
	EReference getChainStart_Chainlink();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SagaFactory getSagaFactory();

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
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ProjectImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__COMPONENTS = eINSTANCE.getProject_Components();

		/**
		 * The meta object literal for the '<em><b>Sagas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__SAGAS = eINSTANCE.getProject_Sagas();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROCESSES = eINSTANCE.getProject_Processes();

		/**
		 * The meta object literal for the '<em><b>Chains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CHAINS = eINSTANCE.getProject_Chains();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ComponentImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INTERFACES = eINSTANCE.getComponent_Interfaces();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ComponentInterfaceImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getComponentInterface()
		 * @generated
		 */
		EClass COMPONENT_INTERFACE = eINSTANCE.getComponentInterface();

		/**
		 * The meta object literal for the '<em><b>Next Level Elements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__NEXT_LEVEL_ELEMENTS = eINSTANCE.getComponentInterface_NextLevelElements();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.NamedElementImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.SagaImpl <em>Saga</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.SagaImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getSaga()
		 * @generated
		 */
		EClass SAGA = eINSTANCE.getSaga();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAGA__STEPS = eINSTANCE.getSaga_Steps();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.SagaStepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.SagaStepImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getSagaStep()
		 * @generated
		 */
		EClass SAGA_STEP = eINSTANCE.getSagaStep();

		/**
		 * The meta object literal for the '<em><b>Next Level Elements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAGA_STEP__NEXT_LEVEL_ELEMENTS = eINSTANCE.getSagaStep_NextLevelElements();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ProcessImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ACTIVITIES = eINSTANCE.getProcess_Activities();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ActivityImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.SloImpl <em>Slo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.SloImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getSlo()
		 * @generated
		 */
		EClass SLO = eINSTANCE.getSlo();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ElementWithSLOImpl <em>Element With SLO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ElementWithSLOImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getElementWithSLO()
		 * @generated
		 */
		EClass ELEMENT_WITH_SLO = eINSTANCE.getElementWithSLO();

		/**
		 * The meta object literal for the '<em><b>Slos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_WITH_SLO__SLOS = eINSTANCE.getElementWithSLO_Slos();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ViolationImpl <em>Violation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ViolationImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getViolation()
		 * @generated
		 */
		EClass VIOLATION = eINSTANCE.getViolation();

		/**
		 * The meta object literal for the '<em><b>Slo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIOLATION__SLO = eINSTANCE.getViolation_Slo();

		/**
		 * The meta object literal for the '<em><b>Passing Impacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIOLATION__PASSING_IMPACTS = eINSTANCE.getViolation_PassingImpacts();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ImpactImpl <em>Impact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ImpactImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getImpact()
		 * @generated
		 */
		EClass IMPACT = eINSTANCE.getImpact();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ChainLinkImpl <em>Chain Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ChainLinkImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getChainLink()
		 * @generated
		 */
		EClass CHAIN_LINK = eINSTANCE.getChainLink();

		/**
		 * The meta object literal for the '<em><b>Caused By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_LINK__CAUSED_BY = eINSTANCE.getChainLink_CausedBy();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_LINK__LOCATION = eINSTANCE.getChainLink_Location();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ChainStartImpl <em>Chain Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ChainStartImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getChainStart()
		 * @generated
		 */
		EClass CHAIN_START = eINSTANCE.getChainStart();

		/**
		 * The meta object literal for the '<em><b>Chainlink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_START__CHAINLINK = eINSTANCE.getChainStart_Chainlink();

	}

} //SagaPackage
