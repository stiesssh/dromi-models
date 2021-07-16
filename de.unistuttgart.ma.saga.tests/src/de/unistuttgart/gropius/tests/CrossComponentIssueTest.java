/**
 */
package de.unistuttgart.gropius.tests;

import de.unistuttgart.gropius.CrossComponentIssue;
import de.unistuttgart.gropius.gropiusFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cross Component Issue</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrossComponentIssueTest extends TestCase {

	/**
	 * The fixture for this Cross Component Issue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossComponentIssue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CrossComponentIssueTest.class);
	}

	/**
	 * Constructs a new Cross Component Issue test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossComponentIssueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cross Component Issue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CrossComponentIssue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cross Component Issue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossComponentIssue getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(gropiusFactory.eINSTANCE.createCrossComponentIssue());
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

} //CrossComponentIssueTest
