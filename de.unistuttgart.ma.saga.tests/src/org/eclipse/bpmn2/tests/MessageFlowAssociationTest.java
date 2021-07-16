/**
 */
package org.eclipse.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.MessageFlowAssociation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message Flow Association</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageFlowAssociationTest extends BaseElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessageFlowAssociationTest.class);
	}

	/**
	 * Constructs a new Message Flow Association test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlowAssociationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Message Flow Association test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MessageFlowAssociation getFixture() {
		return (MessageFlowAssociation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createMessageFlowAssociation());
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

} //MessageFlowAssociationTest
