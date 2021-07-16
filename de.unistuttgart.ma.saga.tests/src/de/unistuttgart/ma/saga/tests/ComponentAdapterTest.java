/**
 */
package de.unistuttgart.ma.saga.tests;

import de.unistuttgart.ma.saga.ComponentAdapter;
import de.unistuttgart.ma.saga.SagaFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Adapter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentAdapterTest extends TestCase {

	/**
	 * The fixture for this Component Adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentAdapter fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentAdapterTest.class);
	}

	/**
	 * Constructs a new Component Adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentAdapterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComponentAdapter fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component Adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentAdapter getFixture() {
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
		setFixture(SagaFactory.eINSTANCE.createComponentAdapter());
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

} //ComponentAdapterTest
