/**
 */
package org.eclipse.dd.di.tests;

import junit.textui.TestRunner;
import org.eclipse.bpmn2.di.tests.LabeledShapeTest;
import org.eclipse.dd.di.BPMNShape;
import org.eclipse.dd.di.DiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BPMN Shape</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNShapeTest extends LabeledShapeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BPMNShapeTest.class);
	}

	/**
	 * Constructs a new BPMN Shape test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNShapeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BPMN Shape test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BPMNShape getFixture() {
		return (BPMNShape)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DiFactory.eINSTANCE.createBPMNShape());
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

} //BPMNShapeTest
