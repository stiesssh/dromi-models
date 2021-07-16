/**
 */
package de.unistuttgart.ma.saga.tests;

import de.unistuttgart.ma.saga.Saga;
import de.unistuttgart.ma.saga.SagaFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Saga</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SagaTest extends IdentifiableElementTest {

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
	 * Returns the fixture for this Saga test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Saga getFixture() {
		return (Saga)fixture;
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
