/**
 */
package uni.stuttgart.saga.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uni.stuttgart.saga.Saga;
import uni.stuttgart.saga.SagaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Saga</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SagaTest extends TestCase {

	/**
	 * The fixture for this Saga test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Saga fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SagaTest.class);
	}

	/**
	 * Constructs a new Saga test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Saga test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Saga fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Saga test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Saga getFixture() {
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
		setFixture(SagaFactory.eINSTANCE.createSaga());
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

} //SagaTest
