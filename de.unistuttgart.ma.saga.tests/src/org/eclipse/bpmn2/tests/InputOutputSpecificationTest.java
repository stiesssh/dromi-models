/**
 */
package org.eclipse.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.InputOutputSpecification;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Output Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputOutputSpecificationTest extends BaseElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputOutputSpecificationTest.class);
	}

	/**
	 * Constructs a new Input Output Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Input Output Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InputOutputSpecification getFixture() {
		return (InputOutputSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createInputOutputSpecification());
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

} //InputOutputSpecificationTest
