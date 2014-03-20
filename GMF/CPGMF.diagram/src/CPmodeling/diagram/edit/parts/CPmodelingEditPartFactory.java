package CPmodeling.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class CPmodelingEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getVisualID(view)) {

			case CPmodeling.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
				return new CPmodeling.diagram.edit.parts.EnvironmentEditPart(
						view);

			case CPmodeling.diagram.edit.parts.MainMemoryEditPart.VISUAL_ID:
				return new CPmodeling.diagram.edit.parts.MainMemoryEditPart(
						view);

			case CPmodeling.diagram.edit.parts.MainMemoryNameEditPart.VISUAL_ID:
				return new CPmodeling.diagram.edit.parts.MainMemoryNameEditPart(
						view);

			case CPmodeling.diagram.edit.parts.VirtualMachineEditPart.VISUAL_ID:
				return new CPmodeling.diagram.edit.parts.VirtualMachineEditPart(
						view);

			case CPmodeling.diagram.edit.parts.VirtualMachineNameEditPart.VISUAL_ID:
				return new CPmodeling.diagram.edit.parts.VirtualMachineNameEditPart(
						view);

			case CPmodeling.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
				return new CPmodeling.diagram.edit.parts.ProcessorEditPart(view);

			case CPmodeling.diagram.edit.parts.ProcessorNameEditPart.VISUAL_ID:
				return new CPmodeling.diagram.edit.parts.ProcessorNameEditPart(
						view);

			case CPmodeling.diagram.edit.parts.VirtualMachineRAMsEditPart.VISUAL_ID:
				return new CPmodeling.diagram.edit.parts.VirtualMachineRAMsEditPart(
						view);

			case CPmodeling.diagram.edit.parts.VirtualMachineVMsEditPart.VISUAL_ID:
				return new CPmodeling.diagram.edit.parts.VirtualMachineVMsEditPart(
						view);

			case CPmodeling.diagram.edit.parts.VirtualMachineCPUsEditPart.VISUAL_ID:
				return new CPmodeling.diagram.edit.parts.VirtualMachineCPUsEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
