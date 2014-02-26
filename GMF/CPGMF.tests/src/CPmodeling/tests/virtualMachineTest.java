/**
 */
package CPmodeling.tests;

import CPmodeling.CPmodelingFactory;
import CPmodeling.virtualMachine;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class virtualMachineTest extends TestCase {

	/**
	 * The fixture for this virtual Machine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected virtualMachine fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(virtualMachineTest.class);
	}

	/**
	 * Constructs a new virtual Machine test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public virtualMachineTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this virtual Machine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(virtualMachine fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this virtual Machine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected virtualMachine getFixture() {
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
		setFixture(CPmodelingFactory.eINSTANCE.createvirtualMachine());
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

} //virtualMachineTest
