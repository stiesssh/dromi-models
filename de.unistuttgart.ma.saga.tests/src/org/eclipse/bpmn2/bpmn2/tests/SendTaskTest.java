/**
 */
package org.eclipse.bpmn2.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.bpmn2.SendTask;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Send Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SendTaskTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SendTaskTest.class);
	}

	/**
	 * Constructs a new Send Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Send Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SendTask getFixture() {
		return (SendTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createSendTask());
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

} //SendTaskTest
