/**
 */
package de.unistuttgart.ma.saga.impact;

import de.unistuttgart.ma.saga.SagaPackage;
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
	int IMPACT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__ID = SagaPackage.IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__CAUSE = SagaPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__ROOT_CAUSE = SagaPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__LOCATION = SagaPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_FEATURE_COUNT = SagaPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Location Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT___GET_LOCATION_ID = SagaPackage.IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_OPERATION_COUNT = SagaPackage.IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__ID = SagaPackage.IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Impacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__IMPACTS = SagaPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top Level Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__TOP_LEVEL_IMPACTS = SagaPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = SagaPackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_OPERATION_COUNT = SagaPackage.IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.impact.Impact#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cause</em>'.
	 * @see de.unistuttgart.ma.saga.impact.Impact#getCause()
	 * @see #getImpact()
	 * @generated
	 */
	EReference getImpact_Cause();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.impact.Impact#getRootCause <em>Root Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Cause</em>'.
	 * @see de.unistuttgart.ma.saga.impact.Impact#getRootCause()
	 * @see #getImpact()
	 * @generated
	 */
	EReference getImpact_RootCause();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.impact.Impact#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see de.unistuttgart.ma.saga.impact.Impact#getLocation()
	 * @see #getImpact()
	 * @generated
	 */
	EReference getImpact_Location();

	/**
	 * Returns the meta object for the '{@link de.unistuttgart.ma.saga.impact.Impact#getLocationId() <em>Get Location Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Location Id</em>' operation.
	 * @see de.unistuttgart.ma.saga.impact.Impact#getLocationId()
	 * @generated
	 */
	EOperation getImpact__GetLocationId();

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
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.impact.Notification#getImpacts <em>Impacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Impacts</em>'.
	 * @see de.unistuttgart.ma.saga.impact.Notification#getImpacts()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_Impacts();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.ma.saga.impact.Notification#getTopLevelImpacts <em>Top Level Impacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Top Level Impacts</em>'.
	 * @see de.unistuttgart.ma.saga.impact.Notification#getTopLevelImpacts()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_TopLevelImpacts();

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
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impact.impl.ImpactImpl <em>Impact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impact.impl.ImpactImpl
		 * @see de.unistuttgart.ma.saga.impact.impl.ImpactPackageImpl#getImpact()
		 * @generated
		 */
		EClass IMPACT = eINSTANCE.getImpact();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPACT__CAUSE = eINSTANCE.getImpact_Cause();

		/**
		 * The meta object literal for the '<em><b>Root Cause</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPACT__ROOT_CAUSE = eINSTANCE.getImpact_RootCause();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPACT__LOCATION = eINSTANCE.getImpact_Location();

		/**
		 * The meta object literal for the '<em><b>Get Location Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPACT___GET_LOCATION_ID = eINSTANCE.getImpact__GetLocationId();

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
		 * The meta object literal for the '<em><b>Impacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__IMPACTS = eINSTANCE.getNotification_Impacts();

		/**
		 * The meta object literal for the '<em><b>Top Level Impacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__TOP_LEVEL_IMPACTS = eINSTANCE.getNotification_TopLevelImpacts();

	}

} //ImpactPackage
