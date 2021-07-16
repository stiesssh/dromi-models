/**
 */
package org.eclipse.bpmn2.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.bpmn2.CorrelationSubscription;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Correlation Subscription</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorrelationSubscriptionTest extends BaseElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CorrelationSubscriptionTest.class);
	}

	/**
	 * Constructs a new Correlation Subscription test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSubscriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Correlation Subscription test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CorrelationSubscription getFixture() {
		return (CorrelationSubscription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createCorrelationSubscription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CorrelationSubscriptionTest
