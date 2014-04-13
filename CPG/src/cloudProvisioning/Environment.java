/**
 */
package cloudProvisioning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudProvisioning.Environment#getName <em>Name</em>}</li>
 *   <li>{@link cloudProvisioning.Environment#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudProvisioning.CloudProvisioningPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"env0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cloudProvisioning.CloudProvisioningPackage#getEnvironment_Name()
	 * @model default="env0"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudProvisioning.Environment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link cloudProvisioning.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see cloudProvisioning.CloudProvisioningPackage#getEnvironment_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

} // Environment
