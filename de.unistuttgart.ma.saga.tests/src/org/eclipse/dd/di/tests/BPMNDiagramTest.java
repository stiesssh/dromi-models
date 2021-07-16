/**
 */
package org.eclipse.dd.di.tests;

import junit.textui.TestRunner;
import org.eclipse.bpmn2.di.tests.DiagramTest;
import org.eclipse.dd.di.BPMNDiagram;
import org.eclipse.dd.di.DiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BPMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNDiagramTest extends DiagramTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BPMNDiagramTest.class);
	}

	/**
	 * Constructs a new BPMN Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNDiagramTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BPMN Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BPMNDiagram getFixture() {
		return (BPMNDiagram)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DiFactory.eINSTANCE.createBPMNDiagram());
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

} //BPMNDiagramTest
