/**
 */
package org.eclipse.bpmn2.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.bpmn2.CallActivity;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Call Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.bpmn2.InteractionNode#getIncomingConversationLinks() <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.bpmn2.InteractionNode#getOutgoingConversationLinks() <em>Outgoing Conversation Links</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CallActivityTest extends ActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CallActivityTest.class);
	}

	/**
	 * Constructs a new Call Activity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallActivityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Call Activity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CallActivity getFixture() {
		return (CallActivity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createCallActivity());
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

	/**
	 * Tests the '{@link org.eclipse.bpmn2.bpmn2.InteractionNode#getIncomingConversationLinks() <em>Incoming Conversation Links</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.bpmn2.InteractionNode#getIncomingConversationLinks()
	 * @generated
	 */
	public void testGetIncomingConversationLinks() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.bpmn2.bpmn2.InteractionNode#getOutgoingConversationLinks() <em>Outgoing Conversation Links</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.bpmn2.InteractionNode#getOutgoingConversationLinks()
	 * @generated
	 */
	public void testGetOutgoingConversationLinks() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //CallActivityTest
