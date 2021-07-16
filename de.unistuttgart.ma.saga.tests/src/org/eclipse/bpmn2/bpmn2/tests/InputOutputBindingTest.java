/**
 */
package org.eclipse.bpmn2.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.bpmn2.InputOutputBinding;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Output Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputOutputBindingTest extends BaseElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputOutputBindingTest.class);
	}

	/**
	 * Constructs a new Input Output Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Input Output Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InputOutputBinding getFixture() {
		return (InputOutputBinding)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createInputOutputBinding());
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

} //InputOutputBindingTest
