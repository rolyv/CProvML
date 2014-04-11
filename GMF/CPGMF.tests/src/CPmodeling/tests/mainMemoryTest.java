/**
 */
package CPmodeling.tests;

import CPmodeling.CPmodelingFactory;
import CPmodeling.mainMemory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>main Memory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class mainMemoryTest extends TestCase {

	/**
	 * The fixture for this main Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected mainMemory fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(mainMemoryTest.class);
	}

	/**
	 * Constructs a new main Memory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mainMemoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this main Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(mainMemory fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this main Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected mainMemory getFixture() {
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
		setFixture(CPmodelingFactory.eINSTANCE.createmainMemory());
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

} //mainMemoryTest
