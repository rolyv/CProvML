/**
 */
package cloudProvisioning;

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
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = 0;


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

	}

} //CloudProvisioningPackage
