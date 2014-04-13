/**
 */
package cloudProvisioning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudProvisioning.Canvas#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link cloudProvisioning.Canvas#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudProvisioning.CloudProvisioningPackage#getCanvas()
 * @model
 * @generated
 */
public interface Canvas extends EObject {
	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link cloudProvisioning.Environment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see cloudProvisioning.CloudProvisioningPackage#getCanvas_Environments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironments();

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
	 * @see cloudProvisioning.CloudProvisioningPackage#getCanvas_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

} // Canvas
