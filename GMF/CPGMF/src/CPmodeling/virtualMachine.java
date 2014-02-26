package CPmodeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface virtualMachine extends EObject {
 
	/**
	 * @model
	 */
	String getName();
 
	/**
	 * Sets the value of the '{@link CPmodeling.virtualMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * @model
	 */
	EList<virtualMachine> getVMs();
 
	/**
	 * @model
	 */
	EList<processor> getCPUs();
	/**
	 * @model
	 */
	EList<mainMemory> getRAMs();
 
}
