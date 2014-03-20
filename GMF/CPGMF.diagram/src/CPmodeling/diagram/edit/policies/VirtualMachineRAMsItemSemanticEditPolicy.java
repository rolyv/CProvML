package CPmodeling.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class VirtualMachineRAMsItemSemanticEditPolicy extends
		CPmodeling.diagram.edit.policies.CPmodelingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public VirtualMachineRAMsItemSemanticEditPolicy() {
		super(
				CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineRAMs_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
