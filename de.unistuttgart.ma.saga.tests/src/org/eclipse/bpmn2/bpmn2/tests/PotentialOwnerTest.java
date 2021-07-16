/**
 */
package org.eclipse.bpmn2.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.bpmn2.PotentialOwner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Potential Owner</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PotentialOwnerTest extends HumanPerformerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PotentialOwnerTest.class);
	}

	/**
	 * Constructs a new Potential Owner test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialOwnerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Potential Owner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PotentialOwner getFixture() {
		return (PotentialOwner)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createPotentialOwner());
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

} //PotentialOwnerTest
