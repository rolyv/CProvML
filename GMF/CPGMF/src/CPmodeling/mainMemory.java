package CPmodeling;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface mainMemory extends EObject {
 
	/**
	 * @model
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CPmodeling.mainMemory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
 
}
