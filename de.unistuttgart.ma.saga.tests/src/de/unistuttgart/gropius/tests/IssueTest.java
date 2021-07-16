/**
 */
package de.unistuttgart.gropius.tests;

import de.unistuttgart.gropius.GropiusFactory;
import de.unistuttgart.gropius.Issue;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IssueTest extends TestCase {

	/**
	 * The fixture for this Issue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Issue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IssueTest.class);
	}

	/**
	 * Constructs a new Issue test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Issue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Issue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Issue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Issue getFixture() {
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
		setFixture(GropiusFactory.eINSTANCE.createIssue());
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

} //IssueTest
