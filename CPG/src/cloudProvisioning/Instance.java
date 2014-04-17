/**
 */
package cloudProvisioning;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudProvisioning.Instance#getName <em>Name</em>}</li>
 *   <li>{@link cloudProvisioning.Instance#getNumVCPUs <em>Num VCP Us</em>}</li>
 *   <li>{@link cloudProvisioning.Instance#getCPUSize <em>CPU Size</em>}</li>
 *   <li>{@link cloudProvisioning.Instance#getNetworkPerformance <em>Network Performance</em>}</li>
 *   <li>{@link cloudProvisioning.Instance#getMemory <em>Memory</em>}</li>
 *   <li>{@link cloudProvisioning.Instance#getStorage <em>Storage</em>}</li>
 *   <li>{@link cloudProvisioning.Instance#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link cloudProvisioning.Instance#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link cloudProvisioning.Instance#getApplications <em>Applications</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudProvisioning.CloudProvisioningPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cloudProvisioning.CloudProvisioningPackage#getInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudProvisioning.Instance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Num VCP Us</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num VCP Us</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num VCP Us</em>' attribute.
	 * @see #setNumVCPUs(int)
	 * @see cloudProvisioning.CloudProvisioningPackage#getInstance_NumVCPUs()
	 * @model
	 * @generated
	 */
	int getNumVCPUs();

	/**
	 * Sets the value of the '{@link cloudProvisioning.Instance#getNumVCPUs <em>Num VCP Us</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num VCP Us</em>' attribute.
	 * @see #getNumVCPUs()
	 * @generated
	 */
	void setNumVCPUs(int value);

	/**
	 * Returns the value of the '<em><b>CPU Size</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudProvisioning.CPUSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPU Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPU Size</em>' attribute.
	 * @see cloudProvisioning.CPUSize
	 * @see #setCPUSize(CPUSize)
	 * @see cloudProvisioning.CloudProvisioningPackage#getInstance_CPUSize()
	 * @model
	 * @generated
	 */
	CPUSize getCPUSize();

	/**
	 * Sets the value of the '{@link cloudProvisioning.Instance#getCPUSize <em>CPU Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPU Size</em>' attribute.
	 * @see cloudProvisioning.CPUSize
	 * @see #getCPUSize()
	 * @generated
	 */
	void setCPUSize(CPUSize value);

	/**
	 * Returns the value of the '<em><b>Network Performance</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudProvisioning.NetworkPerformance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Performance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Performance</em>' attribute.
	 * @see cloudProvisioning.NetworkPerformance
	 * @see #setNetworkPerformance(NetworkPerformance)
	 * @see cloudProvisioning.CloudProvisioningPackage#getInstance_NetworkPerformance()
	 * @model
	 * @generated
	 */
	NetworkPerformance getNetworkPerformance();

	/**
	 * Sets the value of the '{@link cloudProvisioning.Instance#getNetworkPerformance <em>Network Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Performance</em>' attribute.
	 * @see cloudProvisioning.NetworkPerformance
	 * @see #getNetworkPerformance()
	 * @generated
	 */
	void setNetworkPerformance(NetworkPerformance value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(float)
	 * @see cloudProvisioning.CloudProvisioningPackage#getInstance_Memory()
	 * @model
	 * @generated
	 */
	float getMemory();

	/**
	 * Sets the value of the '{@link cloudProvisioning.Instance#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(float value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' attribute.
	 * @see #setStorage(float)
	 * @see cloudProvisioning.CloudProvisioningPackage#getInstance_Storage()
	 * @model
	 * @generated
	 */
	float getStorage();

	/**
	 * Sets the value of the '{@link cloudProvisioning.Instance#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(float value);

	/**
	 * Returns the value of the '<em><b>Operating System</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudProvisioning.OperatingSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating System</em>' attribute.
	 * @see cloudProvisioning.OperatingSystem
	 * @see #setOperatingSystem(OperatingSystem)
	 * @see cloudProvisioning.CloudProvisioningPackage#getInstance_OperatingSystem()
	 * @model
	 * @generated
	 */
	OperatingSystem getOperatingSystem();

	/**
	 * Sets the value of the '{@link cloudProvisioning.Instance#getOperatingSystem <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating System</em>' attribute.
	 * @see cloudProvisioning.OperatingSystem
	 * @see #getOperatingSystem()
	 * @generated
	 */
	void setOperatingSystem(OperatingSystem value);

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudProvisioning.Architecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see cloudProvisioning.Architecture
	 * @see #setArchitecture(Architecture)
	 * @see cloudProvisioning.CloudProvisioningPackage#getInstance_Architecture()
	 * @model
	 * @generated
	 */
	Architecture getArchitecture();

	/**
	 * Sets the value of the '{@link cloudProvisioning.Instance#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see cloudProvisioning.Architecture
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(Architecture value);

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' attribute list.
	 * The list contents are of type {@link cloudProvisioning.Application}.
	 * The literals are from the enumeration {@link cloudProvisioning.Application}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' attribute list.
	 * @see cloudProvisioning.Application
	 * @see cloudProvisioning.CloudProvisioningPackage#getInstance_Applications()
	 * @model
	 * @generated
	 */
	EList<Application> getApplications();

} // Instance
