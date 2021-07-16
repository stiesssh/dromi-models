/**
 */
package org.eclipse.bpmn2.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.bpmn2.ServiceTask;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceTaskTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceTaskTest.class);
	}

	/**
	 * Constructs a new Service Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Service Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServiceTask getFixture() {
		return (ServiceTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createServiceTask());
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

} //ServiceTaskTest
