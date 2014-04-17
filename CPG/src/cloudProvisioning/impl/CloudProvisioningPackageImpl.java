/**
 */
package cloudProvisioning.impl;

import cloudProvisioning.Application;
import cloudProvisioning.Architecture;
import cloudProvisioning.CPUSize;
import cloudProvisioning.Canvas;
import cloudProvisioning.CloudProvisioningFactory;
import cloudProvisioning.CloudProvisioningPackage;
import cloudProvisioning.Environment;
import cloudProvisioning.Instance;

import cloudProvisioning.NetworkPerformance;
import cloudProvisioning.OperatingSystem;
import cloudProvisioning.Template;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudProvisioningPackageImpl extends EPackageImpl implements CloudProvisioningPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canvasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatingSystemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum architectureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkPerformanceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applicationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cpuSizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum templateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cloudProvisioning.CloudProvisioningPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CloudProvisioningPackageImpl() {
		super(eNS_URI, CloudProvisioningFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CloudProvisioningPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CloudProvisioningPackage init() {
		if (isInited) return (CloudProvisioningPackage)EPackage.Registry.INSTANCE.getEPackage(CloudProvisioningPackage.eNS_URI);

		// Obtain or create and register package
		CloudProvisioningPackageImpl theCloudProvisioningPackage = (CloudProvisioningPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CloudProvisioningPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CloudProvisioningPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCloudProvisioningPackage.createPackageContents();

		// Initialize created meta-data
		theCloudProvisioningPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCloudProvisioningPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CloudProvisioningPackage.eNS_URI, theCloudProvisioningPackage);
		return theCloudProvisioningPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanvas() {
		return canvasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvas_Environments() {
		return (EReference)canvasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvas_Instances() {
		return (EReference)canvasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironment_Name() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_Instances() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Name() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_NumVCPUs() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_CPUSize() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_NetworkPerformance() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Memory() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Storage() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_OperatingSystem() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Architecture() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Applications() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperatingSystem() {
		return operatingSystemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArchitecture() {
		return architectureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNetworkPerformance() {
		return networkPerformanceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApplication() {
		return applicationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCPUSize() {
		return cpuSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTemplate() {
		return templateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProvisioningFactory getCloudProvisioningFactory() {
		return (CloudProvisioningFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		canvasEClass = createEClass(CANVAS);
		createEReference(canvasEClass, CANVAS__ENVIRONMENTS);
		createEReference(canvasEClass, CANVAS__INSTANCES);

		environmentEClass = createEClass(ENVIRONMENT);
		createEAttribute(environmentEClass, ENVIRONMENT__NAME);
		createEReference(environmentEClass, ENVIRONMENT__INSTANCES);

		instanceEClass = createEClass(INSTANCE);
		createEAttribute(instanceEClass, INSTANCE__NAME);
		createEAttribute(instanceEClass, INSTANCE__NUM_VCP_US);
		createEAttribute(instanceEClass, INSTANCE__CPU_SIZE);
		createEAttribute(instanceEClass, INSTANCE__NETWORK_PERFORMANCE);
		createEAttribute(instanceEClass, INSTANCE__MEMORY);
		createEAttribute(instanceEClass, INSTANCE__STORAGE);
		createEAttribute(instanceEClass, INSTANCE__OPERATING_SYSTEM);
		createEAttribute(instanceEClass, INSTANCE__ARCHITECTURE);
		createEAttribute(instanceEClass, INSTANCE__APPLICATIONS);

		// Create enums
		operatingSystemEEnum = createEEnum(OPERATING_SYSTEM);
		architectureEEnum = createEEnum(ARCHITECTURE);
		networkPerformanceEEnum = createEEnum(NETWORK_PERFORMANCE);
		applicationEEnum = createEEnum(APPLICATION);
		cpuSizeEEnum = createEEnum(CPU_SIZE);
		templateEEnum = createEEnum(TEMPLATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(canvasEClass, Canvas.class, "Canvas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCanvas_Environments(), this.getEnvironment(), null, "environments", null, 0, -1, Canvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvas_Instances(), this.getInstance(), null, "instances", null, 0, -1, Canvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironment_Name(), ecorePackage.getEString(), "Name", "env0", 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironment_Instances(), this.getInstance(), null, "instances", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstance_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_NumVCPUs(), ecorePackage.getEInt(), "NumVCPUs", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_CPUSize(), this.getCPUSize(), "CPUSize", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_NetworkPerformance(), this.getNetworkPerformance(), "NetworkPerformance", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Memory(), ecorePackage.getEFloat(), "Memory", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Storage(), ecorePackage.getEFloat(), "Storage", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_OperatingSystem(), this.getOperatingSystem(), "OperatingSystem", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Architecture(), this.getArchitecture(), "Architecture", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Applications(), this.getApplication(), "Applications", null, 0, -1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(operatingSystemEEnum, OperatingSystem.class, "OperatingSystem");
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.WINDOWS_SERVER2008);
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.WINDOW_SERVER2012);
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.UBUNTU12_04_3);
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.UBUNTU13_10);
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.RHEL6_5);
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.SUSE11);
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.WINDOWS7);

		initEEnum(architectureEEnum, Architecture.class, "Architecture");
		addEEnumLiteral(architectureEEnum, Architecture.X86);
		addEEnumLiteral(architectureEEnum, Architecture.X86_64);

		initEEnum(networkPerformanceEEnum, NetworkPerformance.class, "NetworkPerformance");
		addEEnumLiteral(networkPerformanceEEnum, NetworkPerformance.VERY_LOW);
		addEEnumLiteral(networkPerformanceEEnum, NetworkPerformance.LOW);
		addEEnumLiteral(networkPerformanceEEnum, NetworkPerformance.MODERATE);
		addEEnumLiteral(networkPerformanceEEnum, NetworkPerformance.HIGH);
		addEEnumLiteral(networkPerformanceEEnum, NetworkPerformance.TEN_GIGABIT);

		initEEnum(applicationEEnum, Application.class, "Application");
		addEEnumLiteral(applicationEEnum, Application.SQL_SERVER2008);
		addEEnumLiteral(applicationEEnum, Application.MY_SQL);
		addEEnumLiteral(applicationEEnum, Application.VISUAL_STUDIO2012);

		initEEnum(cpuSizeEEnum, CPUSize.class, "CPUSize");
		addEEnumLiteral(cpuSizeEEnum, CPUSize.SMALL);
		addEEnumLiteral(cpuSizeEEnum, CPUSize.MEDIUM);
		addEEnumLiteral(cpuSizeEEnum, CPUSize.LARGE);

		initEEnum(templateEEnum, Template.class, "Template");
		addEEnumLiteral(templateEEnum, Template.LINUX_64_232_75H);
		addEEnumLiteral(templateEEnum, Template.WINDOWS_64_868_8H);

		// Create resource
		createResource(eNS_URI);
	}

} //CloudProvisioningPackageImpl
