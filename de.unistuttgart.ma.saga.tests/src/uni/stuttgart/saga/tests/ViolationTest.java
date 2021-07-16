/**
 */
package uni.stuttgart.saga.tests;

import junit.textui.TestRunner;

import uni.stuttgart.saga.SagaFactory;
import uni.stuttgart.saga.Violation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Violation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViolationTest extends ChainLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ViolationTest.class);
	}

	/**
	 * Constructs a new Violation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViolationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Violation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Violation getFixture() {
		return (Violation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SagaFactory.eINSTANCE.createViolation());
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

} //ViolationTest
