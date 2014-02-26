package CPmodeling.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class VirtualMachineVMsItemSemanticEditPolicy extends
		CPmodeling.diagram.edit.policies.CPmodelingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public VirtualMachineVMsItemSemanticEditPolicy() {
		super(
				CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineVMs_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
