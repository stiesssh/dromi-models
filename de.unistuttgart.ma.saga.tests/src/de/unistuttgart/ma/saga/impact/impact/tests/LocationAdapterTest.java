/**
 */
package de.unistuttgart.ma.saga.impact.impact.tests;

import de.unistuttgart.ma.saga.impact.impact.ImpactFactory;
import de.unistuttgart.ma.saga.impact.impact.LocationAdapter;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Location Adapter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationAdapterTest extends TestCase {

	/**
	 * The fixture for this Location Adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationAdapter fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocationAdapterTest.class);
	}

	/**
	 * Constructs a new Location Adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationAdapterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Location Adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LocationAdapter fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Location Adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationAdapter getFixture() {
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
		setFixture(ImpactFactory.eINSTANCE.createLocationAdapter());
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

} //LocationAdapterTest
