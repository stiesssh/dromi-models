/**
 */
package org.eclipse.dd.di.tests;

import junit.textui.TestRunner;
import org.eclipse.bpmn2.di.tests.LabeledEdgeTest;
import org.eclipse.dd.di.BPMNEdge;
import org.eclipse.dd.di.DiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BPMN Edge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNEdgeTest extends LabeledEdgeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BPMNEdgeTest.class);
	}

	/**
	 * Constructs a new BPMN Edge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEdgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BPMN Edge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BPMNEdge getFixture() {
		return (BPMNEdge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DiFactory.eINSTANCE.createBPMNEdge());
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

} //BPMNEdgeTest
