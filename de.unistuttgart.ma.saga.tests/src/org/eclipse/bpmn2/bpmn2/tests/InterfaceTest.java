/**
 */
package org.eclipse.bpmn2.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.bpmn2.Interface;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceTest extends RootElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterfaceTest.class);
	}

	/**
	 * Constructs a new Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Interface getFixture() {
		return (Interface)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createInterface());
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

} //InterfaceTest
