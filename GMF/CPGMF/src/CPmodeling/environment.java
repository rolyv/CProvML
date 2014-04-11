package CPmodeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface environment extends EObject {
 
	/**
	 * @model containment="true"
	 */
	EList<virtualMachine> getVMs();
	/**
	 * @model containment="true"
	 */
	EList<processor> getCPUs();
	/**
	 * @model containment="true"
	 */
	EList<mainMemory> getRAMs();
 
}
