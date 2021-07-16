/**
 */
package org.eclipse.bpmn2.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.bpmn2.MultiInstanceLoopCharacteristics;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multi Instance Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiInstanceLoopCharacteristicsTest extends LoopCharacteristicsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiInstanceLoopCharacteristicsTest.class);
	}

	/**
	 * Constructs a new Multi Instance Loop Characteristics test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInstanceLoopCharacteristicsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multi Instance Loop Characteristics test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MultiInstanceLoopCharacteristics getFixture() {
		return (MultiInstanceLoopCharacteristics)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics());
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

} //MultiInstanceLoopCharacteristicsTest
