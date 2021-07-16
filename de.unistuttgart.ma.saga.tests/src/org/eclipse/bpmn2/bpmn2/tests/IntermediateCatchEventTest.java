/**
 */
package org.eclipse.bpmn2.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.bpmn2.IntermediateCatchEvent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intermediate Catch Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateCatchEventTest extends CatchEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntermediateCatchEventTest.class);
	}

	/**
	 * Constructs a new Intermediate Catch Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateCatchEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intermediate Catch Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntermediateCatchEvent getFixture() {
		return (IntermediateCatchEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent());
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

} //IntermediateCatchEventTest
