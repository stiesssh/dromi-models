/**
 */
package org.eclipse.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.GlobalManualTask;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Global Manual Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalManualTaskTest extends GlobalTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GlobalManualTaskTest.class);
	}

	/**
	 * Constructs a new Global Manual Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalManualTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Global Manual Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GlobalManualTask getFixture() {
		return (GlobalManualTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createGlobalManualTask());
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

} //GlobalManualTaskTest
