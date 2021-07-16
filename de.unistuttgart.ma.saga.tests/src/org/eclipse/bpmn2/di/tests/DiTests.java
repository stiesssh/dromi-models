/**
 */
package org.eclipse.bpmn2.di.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>di</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiTests extends TestSuite {

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
		TestSuite suite = new DiTests("di Tests");
		suite.addTestSuite(DocumentRootTest.class);
		suite.addTestSuite(DiagramElementTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiTests(String name) {
		super(name);
	}

} //DiTests
