/**
 */
package org.eclipse.dd.di.tests;

import junit.textui.TestRunner;
import org.eclipse.bpmn2.di.tests.PlaneTest;
import org.eclipse.dd.di.BPMNPlane;
import org.eclipse.dd.di.DiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BPMN Plane</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNPlaneTest extends PlaneTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BPMNPlaneTest.class);
	}

	/**
	 * Constructs a new BPMN Plane test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNPlaneTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BPMN Plane test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BPMNPlane getFixture() {
		return (BPMNPlane)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DiFactory.eINSTANCE.createBPMNPlane());
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

} //BPMNPlaneTest
