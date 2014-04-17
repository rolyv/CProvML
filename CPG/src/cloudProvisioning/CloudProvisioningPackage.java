/**
 */
package cloudProvisioning;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see cloudProvisioning.CloudProvisioningFactory
 * @model kind="package"
 * @generated
 */
public interface CloudProvisioningPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cloudProvisioning";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cen5064/group1/cloudProvisioning";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.fiu.cen5064.group1.cloudProvisioning";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudProvisioningPackage eINSTANCE = cloudProvisioning.impl.CloudProvisioningPackageImpl.init();

	/**
	 * The meta object id for the '{@link cloudProvisioning.impl.CanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudProvisioning.impl.CanvasImpl
	 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getCanvas()
	 * @generated
	 */
	int CANVAS = 0;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__ENVIRONMENTS = 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__INSTANCES = 1;

	/**
	 * The number of structural features of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudProvisioning.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudProvisioning.impl.EnvironmentImpl
	 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__INSTANCES = 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudProvisioning.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudProvisioning.impl.InstanceImpl
	 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Num VCP Us</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NUM_VCP_US = 1;

	/**
	 * The feature id for the '<em><b>CPU Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CPU_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Network Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NETWORK_PERFORMANCE = 3;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__MEMORY = 4;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__STORAGE = 5;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OPERATING_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ARCHITECTURE = 7;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__APPLICATIONS = 8;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link cloudProvisioning.OperatingSystem <em>Operating System</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudProvisioning.OperatingSystem
	 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 3;

	/**
	 * The meta object id for the '{@link cloudProvisioning.Architecture <em>Architecture</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudProvisioning.Architecture
	 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 4;

	/**
	 * The meta object id for the '{@link cloudProvisioning.NetworkPerformance <em>Network Performance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudProvisioning.NetworkPerformance
	 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getNetworkPerformance()
	 * @generated
	 */
	int NETWORK_PERFORMANCE = 5;

	/**
	 * The meta object id for the '{@link cloudProvisioning.Application <em>Application</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudProvisioning.Application
	 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 6;

	/**
	 * The meta object id for the '{@link cloudProvisioning.CPUSize <em>CPU Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudProvisioning.CPUSize
	 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getCPUSize()
	 * @generated
	 */
	int CPU_SIZE = 7;

	/**
	 * The meta object id for the '{@link cloudProvisioning.Template <em>Template</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudProvisioning.Template
	 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 8;


	/**
	 * Returns the meta object for class '{@link cloudProvisioning.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see cloudProvisioning.Canvas
	 * @generated
	 */
	EClass getCanvas();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudProvisioning.Canvas#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see cloudProvisioning.Canvas#getEnvironments()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Environments();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudProvisioning.Canvas#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see cloudProvisioning.Canvas#getInstances()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Instances();

	/**
	 * Returns the meta object for class '{@link cloudProvisioning.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see cloudProvisioning.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link cloudProvisioning.Environment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudProvisioning.Environment#getName()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudProvisioning.Environment#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see cloudProvisioning.Environment#getInstances()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Instances();

	/**
	 * Returns the meta object for class '{@link cloudProvisioning.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see cloudProvisioning.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the attribute '{@link cloudProvisioning.Instance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudProvisioning.Instance#getName()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloudProvisioning.Instance#getNumVCPUs <em>Num VCP Us</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num VCP Us</em>'.
	 * @see cloudProvisioning.Instance#getNumVCPUs()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_NumVCPUs();

	/**
	 * Returns the meta object for the attribute '{@link cloudProvisioning.Instance#getCPUSize <em>CPU Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPU Size</em>'.
	 * @see cloudProvisioning.Instance#getCPUSize()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_CPUSize();

	/**
	 * Returns the meta object for the attribute '{@link cloudProvisioning.Instance#getNetworkPerformance <em>Network Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Performance</em>'.
	 * @see cloudProvisioning.Instance#getNetworkPerformance()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_NetworkPerformance();

	/**
	 * Returns the meta object for the attribute '{@link cloudProvisioning.Instance#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see cloudProvisioning.Instance#getMemory()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Memory();

	/**
	 * Returns the meta object for the attribute '{@link cloudProvisioning.Instance#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see cloudProvisioning.Instance#getStorage()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Storage();

	/**
	 * Returns the meta object for the attribute '{@link cloudProvisioning.Instance#getOperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating System</em>'.
	 * @see cloudProvisioning.Instance#getOperatingSystem()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_OperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link cloudProvisioning.Instance#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see cloudProvisioning.Instance#getArchitecture()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Architecture();

	/**
	 * Returns the meta object for the attribute list '{@link cloudProvisioning.Instance#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Applications</em>'.
	 * @see cloudProvisioning.Instance#getApplications()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Applications();

	/**
	 * Returns the meta object for enum '{@link cloudProvisioning.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operating System</em>'.
	 * @see cloudProvisioning.OperatingSystem
	 * @generated
	 */
	EEnum getOperatingSystem();

	/**
	 * Returns the meta object for enum '{@link cloudProvisioning.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Architecture</em>'.
	 * @see cloudProvisioning.Architecture
	 * @generated
	 */
	EEnum getArchitecture();

	/**
	 * Returns the meta object for enum '{@link cloudProvisioning.NetworkPerformance <em>Network Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Performance</em>'.
	 * @see cloudProvisioning.NetworkPerformance
	 * @generated
	 */
	EEnum getNetworkPerformance();

	/**
	 * Returns the meta object for enum '{@link cloudProvisioning.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Application</em>'.
	 * @see cloudProvisioning.Application
	 * @generated
	 */
	EEnum getApplication();

	/**
	 * Returns the meta object for enum '{@link cloudProvisioning.CPUSize <em>CPU Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CPU Size</em>'.
	 * @see cloudProvisioning.CPUSize
	 * @generated
	 */
	EEnum getCPUSize();

	/**
	 * Returns the meta object for enum '{@link cloudProvisioning.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Template</em>'.
	 * @see cloudProvisioning.Template
	 * @generated
	 */
	EEnum getTemplate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CloudProvisioningFactory getCloudProvisioningFactory();

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
		 * The meta object literal for the '{@link cloudProvisioning.impl.CanvasImpl <em>Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudProvisioning.impl.CanvasImpl
		 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getCanvas()
		 * @generated
		 */
		EClass CANVAS = eINSTANCE.getCanvas();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS__ENVIRONMENTS = eINSTANCE.getCanvas_Environments();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS__INSTANCES = eINSTANCE.getCanvas_Instances();

		/**
		 * The meta object literal for the '{@link cloudProvisioning.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudProvisioning.impl.EnvironmentImpl
		 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__NAME = eINSTANCE.getEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__INSTANCES = eINSTANCE.getEnvironment_Instances();

		/**
		 * The meta object literal for the '{@link cloudProvisioning.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudProvisioning.impl.InstanceImpl
		 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Num VCP Us</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__NUM_VCP_US = eINSTANCE.getInstance_NumVCPUs();

		/**
		 * The meta object literal for the '<em><b>CPU Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__CPU_SIZE = eINSTANCE.getInstance_CPUSize();

		/**
		 * The meta object literal for the '<em><b>Network Performance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__NETWORK_PERFORMANCE = eINSTANCE.getInstance_NetworkPerformance();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__MEMORY = eINSTANCE.getInstance_Memory();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__STORAGE = eINSTANCE.getInstance_Storage();

		/**
		 * The meta object literal for the '<em><b>Operating System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__OPERATING_SYSTEM = eINSTANCE.getInstance_OperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__ARCHITECTURE = eINSTANCE.getInstance_Architecture();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__APPLICATIONS = eINSTANCE.getInstance_Applications();

		/**
		 * The meta object literal for the '{@link cloudProvisioning.OperatingSystem <em>Operating System</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudProvisioning.OperatingSystem
		 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getOperatingSystem()
		 * @generated
		 */
		EEnum OPERATING_SYSTEM = eINSTANCE.getOperatingSystem();

		/**
		 * The meta object literal for the '{@link cloudProvisioning.Architecture <em>Architecture</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudProvisioning.Architecture
		 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getArchitecture()
		 * @generated
		 */
		EEnum ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '{@link cloudProvisioning.NetworkPerformance <em>Network Performance</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudProvisioning.NetworkPerformance
		 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getNetworkPerformance()
		 * @generated
		 */
		EEnum NETWORK_PERFORMANCE = eINSTANCE.getNetworkPerformance();

		/**
		 * The meta object literal for the '{@link cloudProvisioning.Application <em>Application</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudProvisioning.Application
		 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getApplication()
		 * @generated
		 */
		EEnum APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '{@link cloudProvisioning.CPUSize <em>CPU Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudProvisioning.CPUSize
		 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getCPUSize()
		 * @generated
		 */
		EEnum CPU_SIZE = eINSTANCE.getCPUSize();

		/**
		 * The meta object literal for the '{@link cloudProvisioning.Template <em>Template</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudProvisioning.Template
		 * @see cloudProvisioning.impl.CloudProvisioningPackageImpl#getTemplate()
		 * @generated
		 */
		EEnum TEMPLATE = eINSTANCE.getTemplate();

	}

} //CloudProvisioningPackage
