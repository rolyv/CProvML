/**
 */
package cloudProvisioning.impl;

import cloudProvisioning.Application;
import cloudProvisioning.Architecture;
import cloudProvisioning.CPUSize;
import cloudProvisioning.CloudProvisioningPackage;
import cloudProvisioning.Instance;

import cloudProvisioning.NetworkPerformance;
import cloudProvisioning.OperatingSystem;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudProvisioning.impl.InstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudProvisioning.impl.InstanceImpl#getNumVCPUs <em>Num VCP Us</em>}</li>
 *   <li>{@link cloudProvisioning.impl.InstanceImpl#getCPUSize <em>CPU Size</em>}</li>
 *   <li>{@link cloudProvisioning.impl.InstanceImpl#getNetworkPerformance <em>Network Performance</em>}</li>
 *   <li>{@link cloudProvisioning.impl.InstanceImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link cloudProvisioning.impl.InstanceImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link cloudProvisioning.impl.InstanceImpl#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link cloudProvisioning.impl.InstanceImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link cloudProvisioning.impl.InstanceImpl#getApplications <em>Applications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceImpl extends MinimalEObjectImpl.Container implements Instance {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumVCPUs() <em>Num VCP Us</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumVCPUs()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_VCP_US_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumVCPUs() <em>Num VCP Us</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumVCPUs()
	 * @generated
	 * @ordered
	 */
	protected int numVCPUs = NUM_VCP_US_EDEFAULT;

	/**
	 * The default value of the '{@link #getCPUSize() <em>CPU Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUSize()
	 * @generated
	 * @ordered
	 */
	protected static final CPUSize CPU_SIZE_EDEFAULT = CPUSize.SMALL;

	/**
	 * The cached value of the '{@link #getCPUSize() <em>CPU Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUSize()
	 * @generated
	 * @ordered
	 */
	protected CPUSize cpuSize = CPU_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkPerformance() <em>Network Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPerformance()
	 * @generated
	 * @ordered
	 */
	protected static final NetworkPerformance NETWORK_PERFORMANCE_EDEFAULT = NetworkPerformance.VERY_LOW;

	/**
	 * The cached value of the '{@link #getNetworkPerformance() <em>Network Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPerformance()
	 * @generated
	 * @ordered
	 */
	protected NetworkPerformance networkPerformance = NETWORK_PERFORMANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final float MEMORY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected float memory = MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected static final float STORAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected float storage = STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final OperatingSystem OPERATING_SYSTEM_EDEFAULT = OperatingSystem.WINDOWS_SERVER2008;

	/**
	 * The cached value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected OperatingSystem operatingSystem = OPERATING_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final Architecture ARCHITECTURE_EDEFAULT = Architecture.X86;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected Architecture architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudProvisioningPackage.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudProvisioningPackage.INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumVCPUs() {
		return numVCPUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumVCPUs(int newNumVCPUs) {
		int oldNumVCPUs = numVCPUs;
		numVCPUs = newNumVCPUs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudProvisioningPackage.INSTANCE__NUM_VCP_US, oldNumVCPUs, numVCPUs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPUSize getCPUSize() {
		return cpuSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPUSize(CPUSize newCPUSize) {
		CPUSize oldCPUSize = cpuSize;
		cpuSize = newCPUSize == null ? CPU_SIZE_EDEFAULT : newCPUSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudProvisioningPackage.INSTANCE__CPU_SIZE, oldCPUSize, cpuSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkPerformance getNetworkPerformance() {
		return networkPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkPerformance(NetworkPerformance newNetworkPerformance) {
		NetworkPerformance oldNetworkPerformance = networkPerformance;
		networkPerformance = newNetworkPerformance == null ? NETWORK_PERFORMANCE_EDEFAULT : newNetworkPerformance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudProvisioningPackage.INSTANCE__NETWORK_PERFORMANCE, oldNetworkPerformance, networkPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(float newMemory) {
		float oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudProvisioningPackage.INSTANCE__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorage(float newStorage) {
		float oldStorage = storage;
		storage = newStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudProvisioningPackage.INSTANCE__STORAGE, oldStorage, storage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingSystem(OperatingSystem newOperatingSystem) {
		OperatingSystem oldOperatingSystem = operatingSystem;
		operatingSystem = newOperatingSystem == null ? OPERATING_SYSTEM_EDEFAULT : newOperatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudProvisioningPackage.INSTANCE__OPERATING_SYSTEM, oldOperatingSystem, operatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(Architecture newArchitecture) {
		Architecture oldArchitecture = architecture;
		architecture = newArchitecture == null ? ARCHITECTURE_EDEFAULT : newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudProvisioningPackage.INSTANCE__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EDataTypeUniqueEList<Application>(Application.class, this, CloudProvisioningPackage.INSTANCE__APPLICATIONS);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudProvisioningPackage.INSTANCE__NAME:
				return getName();
			case CloudProvisioningPackage.INSTANCE__NUM_VCP_US:
				return getNumVCPUs();
			case CloudProvisioningPackage.INSTANCE__CPU_SIZE:
				return getCPUSize();
			case CloudProvisioningPackage.INSTANCE__NETWORK_PERFORMANCE:
				return getNetworkPerformance();
			case CloudProvisioningPackage.INSTANCE__MEMORY:
				return getMemory();
			case CloudProvisioningPackage.INSTANCE__STORAGE:
				return getStorage();
			case CloudProvisioningPackage.INSTANCE__OPERATING_SYSTEM:
				return getOperatingSystem();
			case CloudProvisioningPackage.INSTANCE__ARCHITECTURE:
				return getArchitecture();
			case CloudProvisioningPackage.INSTANCE__APPLICATIONS:
				return getApplications();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudProvisioningPackage.INSTANCE__NAME:
				setName((String)newValue);
				return;
			case CloudProvisioningPackage.INSTANCE__NUM_VCP_US:
				setNumVCPUs((Integer)newValue);
				return;
			case CloudProvisioningPackage.INSTANCE__CPU_SIZE:
				setCPUSize((CPUSize)newValue);
				return;
			case CloudProvisioningPackage.INSTANCE__NETWORK_PERFORMANCE:
				setNetworkPerformance((NetworkPerformance)newValue);
				return;
			case CloudProvisioningPackage.INSTANCE__MEMORY:
				setMemory((Float)newValue);
				return;
			case CloudProvisioningPackage.INSTANCE__STORAGE:
				setStorage((Float)newValue);
				return;
			case CloudProvisioningPackage.INSTANCE__OPERATING_SYSTEM:
				setOperatingSystem((OperatingSystem)newValue);
				return;
			case CloudProvisioningPackage.INSTANCE__ARCHITECTURE:
				setArchitecture((Architecture)newValue);
				return;
			case CloudProvisioningPackage.INSTANCE__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends Application>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CloudProvisioningPackage.INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudProvisioningPackage.INSTANCE__NUM_VCP_US:
				setNumVCPUs(NUM_VCP_US_EDEFAULT);
				return;
			case CloudProvisioningPackage.INSTANCE__CPU_SIZE:
				setCPUSize(CPU_SIZE_EDEFAULT);
				return;
			case CloudProvisioningPackage.INSTANCE__NETWORK_PERFORMANCE:
				setNetworkPerformance(NETWORK_PERFORMANCE_EDEFAULT);
				return;
			case CloudProvisioningPackage.INSTANCE__MEMORY:
				setMemory(MEMORY_EDEFAULT);
				return;
			case CloudProvisioningPackage.INSTANCE__STORAGE:
				setStorage(STORAGE_EDEFAULT);
				return;
			case CloudProvisioningPackage.INSTANCE__OPERATING_SYSTEM:
				setOperatingSystem(OPERATING_SYSTEM_EDEFAULT);
				return;
			case CloudProvisioningPackage.INSTANCE__ARCHITECTURE:
				setArchitecture(ARCHITECTURE_EDEFAULT);
				return;
			case CloudProvisioningPackage.INSTANCE__APPLICATIONS:
				getApplications().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CloudProvisioningPackage.INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudProvisioningPackage.INSTANCE__NUM_VCP_US:
				return numVCPUs != NUM_VCP_US_EDEFAULT;
			case CloudProvisioningPackage.INSTANCE__CPU_SIZE:
				return cpuSize != CPU_SIZE_EDEFAULT;
			case CloudProvisioningPackage.INSTANCE__NETWORK_PERFORMANCE:
				return networkPerformance != NETWORK_PERFORMANCE_EDEFAULT;
			case CloudProvisioningPackage.INSTANCE__MEMORY:
				return memory != MEMORY_EDEFAULT;
			case CloudProvisioningPackage.INSTANCE__STORAGE:
				return storage != STORAGE_EDEFAULT;
			case CloudProvisioningPackage.INSTANCE__OPERATING_SYSTEM:
				return operatingSystem != OPERATING_SYSTEM_EDEFAULT;
			case CloudProvisioningPackage.INSTANCE__ARCHITECTURE:
				return architecture != ARCHITECTURE_EDEFAULT;
			case CloudProvisioningPackage.INSTANCE__APPLICATIONS:
				return applications != null && !applications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", NumVCPUs: ");
		result.append(numVCPUs);
		result.append(", CPUSize: ");
		result.append(cpuSize);
		result.append(", NetworkPerformance: ");
		result.append(networkPerformance);
		result.append(", Memory: ");
		result.append(memory);
		result.append(", Storage: ");
		result.append(storage);
		result.append(", OperatingSystem: ");
		result.append(operatingSystem);
		result.append(", Architecture: ");
		result.append(architecture);
		result.append(", Applications: ");
		result.append(applications);
		result.append(')');
		return result.toString();
	}

} //InstanceImpl
