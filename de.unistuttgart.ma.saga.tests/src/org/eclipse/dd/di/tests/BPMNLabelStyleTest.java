/**
 */
package org.eclipse.dd.di.tests;

import junit.textui.TestRunner;
import org.eclipse.bpmn2.di.tests.StyleTest;
import org.eclipse.dd.di.BPMNLabelStyle;
import org.eclipse.dd.di.DiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BPMN Label Style</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNLabelStyleTest extends StyleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BPMNLabelStyleTest.class);
	}

	/**
	 * Constructs a new BPMN Label Style test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNLabelStyleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BPMN Label Style test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BPMNLabelStyle getFixture() {
		return (BPMNLabelStyle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DiFactory.eINSTANCE.createBPMNLabelStyle());
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

} //BPMNLabelStyleTest
