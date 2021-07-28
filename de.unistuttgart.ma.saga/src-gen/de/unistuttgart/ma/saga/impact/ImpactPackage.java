/**
 */
package de.unistuttgart.ma.saga.impact;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see de.unistuttgart.ma.saga.impact.ImpactFactory
 * @model kind="package"
 * @generated
 */
public interface ImpactPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "impact";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/impact";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "impact";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImpactPackage eINSTANCE = de.unistuttgart.ma.saga.impact.impl.ImpactPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impact.impl.ImpactImpl <em>Impact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impact.impl.ImpactImpl
	 * @see de.unistuttgart.ma.saga.impact.impl.ImpactPackageImpl#getImpact()
	 * @generated
	 */
	int IMPACT = 2;

	/**
	 * The number of structural features of the '<em>Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impact.impl.IntermediateImpactImpl <em>Intermediate Impact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impact.impl.IntermediateImpactImpl
	 * @see de.unistuttgart.ma.saga.impact.impl.ImpactPackageImpl#getIntermediateImpact()
	 * @generated
	 */
	int INTERMEDIATE_IMPACT = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_IMPACT__LOCATION = IMPACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_IMPACT__IMPACT = IMPACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intermediate Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_IMPACT_FEATURE_COUNT = IMPACT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Location Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_IMPACT___GET_LOCATION_ID = IMPACT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Location Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_IMPACT___GET_LOCATION_NAME = IMPACT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Intermediate Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_IMPACT_OPERATION_COUNT = IMPACT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impact.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impact.impl.NotificationImpl
	 * @see de.unistuttgart.ma.saga.impact.impl.ImpactPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Top Level Impacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__TOP_LEVEL_IMPACTS = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__SYSTEM = 1;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impact.impl.ViolationImpl <em>Violation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impact.impl.ViolationImpl
	 * @see de.unistuttgart.ma.saga.impact.impl.ImpactPackageImpl#getViolation()
	 * @generated
	 */
	int VIOLATION = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION__VALUE = IMPACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slo Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION__SLO_RULE = IMPACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_FEATURE_COUNT = IMPACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_OPERATION_COUNT = IMPACT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.impact.IntermediateImpact <em>Intermediate Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Impact</em>'.
	 * @see de.unistuttgart.ma.saga.impact.IntermediateImpact
	 * @generated
	 */
	EClass getIntermediateImpact();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.impact.IntermediateImpact#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see de.unistuttgart.ma.saga.impact.IntermediateImpact#getLocation()
	 * @see #getIntermediateImpact()
	 * @generated
	 */
	EReference getIntermediateImpact_Location();

	/**
	 * Returns the meta object for the containment reference '{@link de.unistuttgart.ma.saga.impact.IntermediateImpact#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Impact</em>'.
	 * @see de.unistuttgart.ma.saga.impact.IntermediateImpact#getImpact()
	 * @see #getIntermediateImpact()
	 * @generated
	 */
	EReference getIntermediateImpact_Impact();

	/**
	 * Returns the meta object for the '{@link de.unistuttgart.ma.saga.impact.IntermediateImpact#getLocationId() <em>Get Location Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Location Id</em>' operation.
	 * @see de.unistuttgart.ma.saga.impact.IntermediateImpact#getLocationId()
	 * @generated
	 */
	EOperation getIntermediateImpact__GetLocationId();

	/**
	 * Returns the meta object for the '{@link de.unistuttgart.ma.saga.impact.IntermediateImpact#getLocationName() <em>Get Location Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Location Name</em>' operation.
	 * @see de.unistuttgart.ma.saga.impact.IntermediateImpact#getLocationName()
	 * @generated
	 */
	EOperation getIntermediateImpact__GetLocationName();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.impact.Impact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impact</em>'.
	 * @see de.unistuttgart.ma.saga.impact.Impact
	 * @generated
	 */
	EClass getImpact();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.impact.Violation <em>Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Violation</em>'.
	 * @see de.unistuttgart.ma.saga.impact.Violation
	 * @generated
	 */
	EClass getViolation();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.ma.saga.impact.Violation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.unistuttgart.ma.saga.impact.Violation#getValue()
	 * @see #getViolation()
	 * @generated
	 */
	EAttribute getViolation_Value();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.impact.Violation#getSloRule <em>Slo Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slo Rule</em>'.
	 * @see de.unistuttgart.ma.saga.impact.Violation#getSloRule()
	 * @see #getViolation()
	 * @generated
	 */
	EReference getViolation_SloRule();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.impact.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see de.unistuttgart.ma.saga.impact.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.impact.Notification#getTopLevelImpacts <em>Top Level Impacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Top Level Impacts</em>'.
	 * @see de.unistuttgart.ma.saga.impact.Notification#getTopLevelImpacts()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_TopLevelImpacts();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.impact.Notification#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see de.unistuttgart.ma.saga.impact.Notification#getSystem()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_System();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImpactFactory getImpactFactory();

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
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impact.impl.IntermediateImpactImpl <em>Intermediate Impact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impact.impl.IntermediateImpactImpl
		 * @see de.unistuttgart.ma.saga.impact.impl.ImpactPackageImpl#getIntermediateImpact()
		 * @generated
		 */
		EClass INTERMEDIATE_IMPACT = eINSTANCE.getIntermediateImpact();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_IMPACT__LOCATION = eINSTANCE.getIntermediateImpact_Location();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_IMPACT__IMPACT = eINSTANCE.getIntermediateImpact_Impact();

		/**
		 * The meta object literal for the '<em><b>Get Location Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERMEDIATE_IMPACT___GET_LOCATION_ID = eINSTANCE.getIntermediateImpact__GetLocationId();

		/**
		 * The meta object literal for the '<em><b>Get Location Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERMEDIATE_IMPACT___GET_LOCATION_NAME = eINSTANCE.getIntermediateImpact__GetLocationName();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impact.impl.ImpactImpl <em>Impact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impact.impl.ImpactImpl
		 * @see de.unistuttgart.ma.saga.impact.impl.ImpactPackageImpl#getImpact()
		 * @generated
		 */
		EClass IMPACT = eINSTANCE.getImpact();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impact.impl.ViolationImpl <em>Violation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impact.impl.ViolationImpl
		 * @see de.unistuttgart.ma.saga.impact.impl.ImpactPackageImpl#getViolation()
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
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impact.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impact.impl.NotificationImpl
		 * @see de.unistuttgart.ma.saga.impact.impl.ImpactPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Top Level Impacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__TOP_LEVEL_IMPACTS = eINSTANCE.getNotification_TopLevelImpacts();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__SYSTEM = eINSTANCE.getNotification_System();

	}

} //ImpactPackage
