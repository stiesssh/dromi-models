/**
 */
package de.unistuttgart.ma.saga.tests;

import de.unistuttgart.ma.saga.ComponentInterfaceAdapter;
import de.unistuttgart.ma.saga.SagaFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Interface Adapter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInterfaceAdapterTest extends TestCase {

	/**
	 * The fixture for this Component Interface Adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceAdapter fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentInterfaceAdapterTest.class);
	}

	/**
	 * Constructs a new Component Interface Adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterfaceAdapterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Interface Adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComponentInterfaceAdapter fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component Interface Adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceAdapter getFixture() {
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
		setFixture(SagaFactory.eINSTANCE.createComponentInterfaceAdapter());
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

} //ComponentInterfaceAdapterTest
