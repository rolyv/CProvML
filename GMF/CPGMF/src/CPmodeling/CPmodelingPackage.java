/**
 */
package CPmodeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CPmodeling.CPmodelingFactory
 * @model kind="package"
 * @generated
 */
public interface CPmodelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CPmodeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CPmodeling.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CPmodeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CPmodelingPackage eINSTANCE = CPmodeling.impl.CPmodelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link CPmodeling.impl.environmentImpl <em>environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPmodeling.impl.environmentImpl
	 * @see CPmodeling.impl.CPmodelingPackageImpl#getenvironment()
	 * @generated
	 */
	int ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>VMs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__VMS = 0;

	/**
	 * The feature id for the '<em><b>CP Us</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__CP_US = 1;

	/**
	 * The feature id for the '<em><b>RA Ms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__RA_MS = 2;

	/**
	 * The number of structural features of the '<em>environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CPmodeling.impl.mainMemoryImpl <em>main Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPmodeling.impl.mainMemoryImpl
	 * @see CPmodeling.impl.CPmodelingPackageImpl#getmainMemory()
	 * @generated
	 */
	int MAIN_MEMORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MEMORY__NAME = 0;

	/**
	 * The number of structural features of the '<em>main Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MEMORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>main Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MEMORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CPmodeling.impl.processorImpl <em>processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPmodeling.impl.processorImpl
	 * @see CPmodeling.impl.CPmodelingPackageImpl#getprocessor()
	 * @generated
	 */
	int PROCESSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CPmodeling.impl.virtualMachineImpl <em>virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPmodeling.impl.virtualMachineImpl
	 * @see CPmodeling.impl.CPmodelingPackageImpl#getvirtualMachine()
	 * @generated
	 */
	int VIRTUAL_MACHINE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>VMs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__VMS = 1;

	/**
	 * The feature id for the '<em><b>CP Us</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__CP_US = 2;

	/**
	 * The feature id for the '<em><b>RA Ms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__RA_MS = 3;

	/**
	 * The number of structural features of the '<em>virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CPmodeling.environment <em>environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>environment</em>'.
	 * @see CPmodeling.environment
	 * @generated
	 */
	EClass getenvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link CPmodeling.environment#getVMs <em>VMs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VMs</em>'.
	 * @see CPmodeling.environment#getVMs()
	 * @see #getenvironment()
	 * @generated
	 */
	EReference getenvironment_VMs();

	/**
	 * Returns the meta object for the containment reference list '{@link CPmodeling.environment#getCPUs <em>CP Us</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CP Us</em>'.
	 * @see CPmodeling.environment#getCPUs()
	 * @see #getenvironment()
	 * @generated
	 */
	EReference getenvironment_CPUs();

	/**
	 * Returns the meta object for the containment reference list '{@link CPmodeling.environment#getRAMs <em>RA Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RA Ms</em>'.
	 * @see CPmodeling.environment#getRAMs()
	 * @see #getenvironment()
	 * @generated
	 */
	EReference getenvironment_RAMs();

	/**
	 * Returns the meta object for class '{@link CPmodeling.mainMemory <em>main Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>main Memory</em>'.
	 * @see CPmodeling.mainMemory
	 * @generated
	 */
	EClass getmainMemory();

	/**
	 * Returns the meta object for the attribute '{@link CPmodeling.mainMemory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CPmodeling.mainMemory#getName()
	 * @see #getmainMemory()
	 * @generated
	 */
	EAttribute getmainMemory_Name();

	/**
	 * Returns the meta object for class '{@link CPmodeling.processor <em>processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>processor</em>'.
	 * @see CPmodeling.processor
	 * @generated
	 */
	EClass getprocessor();

	/**
	 * Returns the meta object for the attribute '{@link CPmodeling.processor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CPmodeling.processor#getName()
	 * @see #getprocessor()
	 * @generated
	 */
	EAttribute getprocessor_Name();

	/**
	 * Returns the meta object for class '{@link CPmodeling.virtualMachine <em>virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>virtual Machine</em>'.
	 * @see CPmodeling.virtualMachine
	 * @generated
	 */
	EClass getvirtualMachine();

	/**
	 * Returns the meta object for the attribute '{@link CPmodeling.virtualMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CPmodeling.virtualMachine#getName()
	 * @see #getvirtualMachine()
	 * @generated
	 */
	EAttribute getvirtualMachine_Name();

	/**
	 * Returns the meta object for the reference list '{@link CPmodeling.virtualMachine#getVMs <em>VMs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>VMs</em>'.
	 * @see CPmodeling.virtualMachine#getVMs()
	 * @see #getvirtualMachine()
	 * @generated
	 */
	EReference getvirtualMachine_VMs();

	/**
	 * Returns the meta object for the reference list '{@link CPmodeling.virtualMachine#getCPUs <em>CP Us</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CP Us</em>'.
	 * @see CPmodeling.virtualMachine#getCPUs()
	 * @see #getvirtualMachine()
	 * @generated
	 */
	EReference getvirtualMachine_CPUs();

	/**
	 * Returns the meta object for the reference list '{@link CPmodeling.virtualMachine#getRAMs <em>RA Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RA Ms</em>'.
	 * @see CPmodeling.virtualMachine#getRAMs()
	 * @see #getvirtualMachine()
	 * @generated
	 */
	EReference getvirtualMachine_RAMs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CPmodelingFactory getCPmodelingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CPmodeling.impl.environmentImpl <em>environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPmodeling.impl.environmentImpl
		 * @see CPmodeling.impl.CPmodelingPackageImpl#getenvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getenvironment();

		/**
		 * The meta object literal for the '<em><b>VMs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__VMS = eINSTANCE.getenvironment_VMs();

		/**
		 * The meta object literal for the '<em><b>CP Us</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__CP_US = eINSTANCE.getenvironment_CPUs();

		/**
		 * The meta object literal for the '<em><b>RA Ms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__RA_MS = eINSTANCE.getenvironment_RAMs();

		/**
		 * The meta object literal for the '{@link CPmodeling.impl.mainMemoryImpl <em>main Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPmodeling.impl.mainMemoryImpl
		 * @see CPmodeling.impl.CPmodelingPackageImpl#getmainMemory()
		 * @generated
		 */
		EClass MAIN_MEMORY = eINSTANCE.getmainMemory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_MEMORY__NAME = eINSTANCE.getmainMemory_Name();

		/**
		 * The meta object literal for the '{@link CPmodeling.impl.processorImpl <em>processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPmodeling.impl.processorImpl
		 * @see CPmodeling.impl.CPmodelingPackageImpl#getprocessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getprocessor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NAME = eINSTANCE.getprocessor_Name();

		/**
		 * The meta object literal for the '{@link CPmodeling.impl.virtualMachineImpl <em>virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPmodeling.impl.virtualMachineImpl
		 * @see CPmodeling.impl.CPmodelingPackageImpl#getvirtualMachine()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE = eINSTANCE.getvirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__NAME = eINSTANCE.getvirtualMachine_Name();

		/**
		 * The meta object literal for the '<em><b>VMs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__VMS = eINSTANCE.getvirtualMachine_VMs();

		/**
		 * The meta object literal for the '<em><b>CP Us</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__CP_US = eINSTANCE.getvirtualMachine_CPUs();

		/**
		 * The meta object literal for the '<em><b>RA Ms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__RA_MS = eINSTANCE.getvirtualMachine_RAMs();

	}

} //CPmodelingPackage
