/**
 */
package uni.stuttgart.saga.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uni.stuttgart.saga.SagaFactory;
import uni.stuttgart.saga.SagaStep;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SagaStepTest extends TestCase {

	/**
	 * The fixture for this Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SagaStep fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SagaStepTest.class);
	}

	/**
	 * Constructs a new Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaStepTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SagaStep fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SagaStep getFixture() {
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
		setFixture(SagaFactory.eINSTANCE.createSagaStep());
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

} //SagaStepTest
