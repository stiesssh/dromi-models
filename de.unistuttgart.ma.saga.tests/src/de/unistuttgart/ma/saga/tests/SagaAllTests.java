/**
 */
package de.unistuttgart.ma.saga.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;
import org.eclipse.bpmn2.di.tests.BpmnDiTests;
import org.eclipse.bpmn2.tests.Bpmn2Tests;
import org.eclipse.dd.dc.tests.DcTests;

import org.eclipse.dd.di.tests.DiTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Saga</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class SagaAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SagaAllTests("Saga Tests");
		suite.addTest(Bpmn2Tests.suite());
		suite.addTest(DiTests.suite());
		suite.addTest(BpmnDiTests.suite());
		suite.addTest(DcTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaAllTests(String name) {
		super(name);
	}

} //SagaAllTests
