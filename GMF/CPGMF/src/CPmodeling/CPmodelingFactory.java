/**
 */
package CPmodeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CPmodeling.CPmodelingPackage
 * @generated
 */
public interface CPmodelingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CPmodelingFactory eINSTANCE = CPmodeling.impl.CPmodelingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>environment</em>'.
	 * @generated
	 */
	environment createenvironment();

	/**
	 * Returns a new object of class '<em>main Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>main Memory</em>'.
	 * @generated
	 */
	mainMemory createmainMemory();

	/**
	 * Returns a new object of class '<em>processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>processor</em>'.
	 * @generated
	 */
	processor createprocessor();

	/**
	 * Returns a new object of class '<em>virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>virtual Machine</em>'.
	 * @generated
	 */
	virtualMachine createvirtualMachine();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CPmodelingPackage getCPmodelingPackage();

} //CPmodelingFactory
