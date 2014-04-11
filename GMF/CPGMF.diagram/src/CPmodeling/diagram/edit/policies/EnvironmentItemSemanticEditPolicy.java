package CPmodeling.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class EnvironmentItemSemanticEditPolicy extends
		CPmodeling.diagram.edit.policies.CPmodelingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnvironmentItemSemanticEditPolicy() {
		super(
				CPmodeling.diagram.providers.CPmodelingElementTypes.Environment_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CPmodeling.diagram.providers.CPmodelingElementTypes.MainMemory_2001 == req
				.getElementType()) {
			return getGEFWrapper(new CPmodeling.diagram.edit.commands.MainMemoryCreateCommand(
					req));
		}
		if (CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachine_2002 == req
				.getElementType()) {
			return getGEFWrapper(new CPmodeling.diagram.edit.commands.VirtualMachineCreateCommand(
					req));
		}
		if (CPmodeling.diagram.providers.CPmodelingElementTypes.Processor_2003 == req
				.getElementType()) {
			return getGEFWrapper(new CPmodeling.diagram.edit.commands.ProcessorCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
