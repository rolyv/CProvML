package CPmodeling.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class VirtualMachineItemSemanticEditPolicy extends
		CPmodeling.diagram.edit.policies.CPmodelingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public VirtualMachineItemSemanticEditPolicy() {
		super(
				CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachine_2002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getVisualID(incomingLink) == CPmodeling.diagram.edit.parts.VirtualMachineVMsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getVisualID(outgoingLink) == CPmodeling.diagram.edit.parts.VirtualMachineRAMsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getVisualID(outgoingLink) == CPmodeling.diagram.edit.parts.VirtualMachineVMsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getVisualID(outgoingLink) == CPmodeling.diagram.edit.parts.VirtualMachineCPUsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineRAMs_4001 == req
				.getElementType()) {
			return getGEFWrapper(new CPmodeling.diagram.edit.commands.VirtualMachineRAMsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineVMs_4002 == req
				.getElementType()) {
			return getGEFWrapper(new CPmodeling.diagram.edit.commands.VirtualMachineVMsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineCPUs_4003 == req
				.getElementType()) {
			return getGEFWrapper(new CPmodeling.diagram.edit.commands.VirtualMachineCPUsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineRAMs_4001 == req
				.getElementType()) {
			return null;
		}
		if (CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineVMs_4002 == req
				.getElementType()) {
			return getGEFWrapper(new CPmodeling.diagram.edit.commands.VirtualMachineVMsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineCPUs_4003 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case CPmodeling.diagram.edit.parts.VirtualMachineRAMsEditPart.VISUAL_ID:
			return getGEFWrapper(new CPmodeling.diagram.edit.commands.VirtualMachineRAMsReorientCommand(
					req));
		case CPmodeling.diagram.edit.parts.VirtualMachineVMsEditPart.VISUAL_ID:
			return getGEFWrapper(new CPmodeling.diagram.edit.commands.VirtualMachineVMsReorientCommand(
					req));
		case CPmodeling.diagram.edit.parts.VirtualMachineCPUsEditPart.VISUAL_ID:
			return getGEFWrapper(new CPmodeling.diagram.edit.commands.VirtualMachineCPUsReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
