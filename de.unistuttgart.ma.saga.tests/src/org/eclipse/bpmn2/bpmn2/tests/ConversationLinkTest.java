/**
 */
package org.eclipse.bpmn2.bpmn2.tests;

import junit.textui.TestRunner;

import org.eclipse.bpmn2.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.bpmn2.ConversationLink;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conversation Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConversationLinkTest extends BaseElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConversationLinkTest.class);
	}

	/**
	 * Constructs a new Conversation Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Conversation Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConversationLink getFixture() {
		return (ConversationLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createConversationLink());
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

} //ConversationLinkTest
