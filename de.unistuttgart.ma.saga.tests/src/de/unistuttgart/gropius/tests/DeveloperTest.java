/**
 */
package de.unistuttgart.gropius.tests;

import de.unistuttgart.gropius.Developer;
import de.unistuttgart.gropius.gropiusFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeveloperTest extends TestCase {

	/**
	 * The fixture for this Developer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Developer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeveloperTest.class);
	}

	/**
	 * Constructs a new Developer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeveloperTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Developer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Developer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Developer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Developer getFixture() {
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
		setFixture(gropiusFactory.eINSTANCE.createDeveloper());
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

} //DeveloperTest
