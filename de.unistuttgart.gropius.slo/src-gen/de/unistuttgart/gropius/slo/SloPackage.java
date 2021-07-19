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
	 * The meta object id for the '{@link de.unistuttgart.gropius.slo.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.slo.impl.ModelElementImpl
	 * @see de.unistuttgart.gropius.slo.impl.SloPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

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
	int SLO_RULE__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gropius Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE__GROPIUS_PROJECT_ID = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gropius Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE__GROPIUS_COMPONENT_ID = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE__PERIOD = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE__THRESHOLD = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE__ID = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gropius Component Interface Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE__GROPIUS_COMPONENT_INTERFACE_ID = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_RULE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.slo.impl.AlertImpl <em>Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.slo.impl.AlertImpl
	 * @see de.unistuttgart.gropius.slo.impl.SloPackageImpl#getAlert()
	 * @generated
	 */
	int ALERT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__SLO_ID = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__SLO_NAME = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gropius Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__GROPIUS_COMPONENT_ID = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gropius Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__GROPIUS_PROJECT_ID = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__VALUE = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gropius Component Interface Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__GROPIUS_COMPONENT_INTERFACE_ID = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.slo.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.slo.impl.ModelImpl
	 * @see de.unistuttgart.gropius.slo.impl.SloPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Modelelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODELELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.SloRule#getGropiusProjectId <em>Gropius Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gropius Project Id</em>'.
	 * @see de.unistuttgart.gropius.slo.SloRule#getGropiusProjectId()
	 * @see #getSloRule()
	 * @generated
	 */
	EAttribute getSloRule_GropiusProjectId();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.SloRule#getGropiusComponentId <em>Gropius Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gropius Component Id</em>'.
	 * @see de.unistuttgart.gropius.slo.SloRule#getGropiusComponentId()
	 * @see #getSloRule()
	 * @generated
	 */
	EAttribute getSloRule_GropiusComponentId();

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
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.SloRule#getGropiusComponentInterfaceId <em>Gropius Component Interface Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gropius Component Interface Id</em>'.
	 * @see de.unistuttgart.gropius.slo.SloRule#getGropiusComponentInterfaceId()
	 * @see #getSloRule()
	 * @generated
	 */
	EAttribute getSloRule_GropiusComponentInterfaceId();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.slo.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert</em>'.
	 * @see de.unistuttgart.gropius.slo.Alert
	 * @generated
	 */
	EClass getAlert();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.Alert#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.unistuttgart.gropius.slo.Alert#getName()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.Alert#getSloId <em>Slo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slo Id</em>'.
	 * @see de.unistuttgart.gropius.slo.Alert#getSloId()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_SloId();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.Alert#getSloName <em>Slo Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slo Name</em>'.
	 * @see de.unistuttgart.gropius.slo.Alert#getSloName()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_SloName();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.Alert#getGropiusComponentId <em>Gropius Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gropius Component Id</em>'.
	 * @see de.unistuttgart.gropius.slo.Alert#getGropiusComponentId()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_GropiusComponentId();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.Alert#getGropiusProjectId <em>Gropius Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gropius Project Id</em>'.
	 * @see de.unistuttgart.gropius.slo.Alert#getGropiusProjectId()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_GropiusProjectId();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.Alert#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.unistuttgart.gropius.slo.Alert#getValue()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.slo.Alert#getGropiusComponentInterfaceId <em>Gropius Component Interface Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gropius Component Interface Id</em>'.
	 * @see de.unistuttgart.gropius.slo.Alert#getGropiusComponentInterfaceId()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_GropiusComponentInterfaceId();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.slo.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.unistuttgart.gropius.slo.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.gropius.slo.Model#getModelelement <em>Modelelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelelement</em>'.
	 * @see de.unistuttgart.gropius.slo.Model#getModelelement()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Modelelement();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.slo.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see de.unistuttgart.gropius.slo.ModelElement
	 * @generated
	 */
	EClass getModelElement();

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
		 * The meta object literal for the '<em><b>Gropius Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO_RULE__GROPIUS_PROJECT_ID = eINSTANCE.getSloRule_GropiusProjectId();

		/**
		 * The meta object literal for the '<em><b>Gropius Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO_RULE__GROPIUS_COMPONENT_ID = eINSTANCE.getSloRule_GropiusComponentId();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO_RULE__ID = eINSTANCE.getSloRule_Id();

		/**
		 * The meta object literal for the '<em><b>Gropius Component Interface Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO_RULE__GROPIUS_COMPONENT_INTERFACE_ID = eINSTANCE.getSloRule_GropiusComponentInterfaceId();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.slo.impl.AlertImpl <em>Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.slo.impl.AlertImpl
		 * @see de.unistuttgart.gropius.slo.impl.SloPackageImpl#getAlert()
		 * @generated
		 */
		EClass ALERT = eINSTANCE.getAlert();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__NAME = eINSTANCE.getAlert_Name();

		/**
		 * The meta object literal for the '<em><b>Slo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__SLO_ID = eINSTANCE.getAlert_SloId();

		/**
		 * The meta object literal for the '<em><b>Slo Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__SLO_NAME = eINSTANCE.getAlert_SloName();

		/**
		 * The meta object literal for the '<em><b>Gropius Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__GROPIUS_COMPONENT_ID = eINSTANCE.getAlert_GropiusComponentId();

		/**
		 * The meta object literal for the '<em><b>Gropius Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__GROPIUS_PROJECT_ID = eINSTANCE.getAlert_GropiusProjectId();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__VALUE = eINSTANCE.getAlert_Value();

		/**
		 * The meta object literal for the '<em><b>Gropius Component Interface Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__GROPIUS_COMPONENT_INTERFACE_ID = eINSTANCE.getAlert_GropiusComponentInterfaceId();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.slo.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.slo.impl.ModelImpl
		 * @see de.unistuttgart.gropius.slo.impl.SloPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Modelelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MODELELEMENT = eINSTANCE.getModel_Modelelement();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.slo.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.slo.impl.ModelElementImpl
		 * @see de.unistuttgart.gropius.slo.impl.SloPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

	}

} //SloPackage