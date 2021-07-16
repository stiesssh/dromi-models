/**
 */
package org.eclipse.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.ErrorEventDefinition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Error Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorEventDefinitionTest extends EventDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ErrorEventDefinitionTest.class);
	}

	/**
	 * Constructs a new Error Event Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorEventDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Error Event Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ErrorEventDefinition getFixture() {
		return (ErrorEventDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createErrorEventDefinition());
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

} //ErrorEventDefinitionTest
