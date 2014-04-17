package cloudProvisioning.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class CpgEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (cloudProvisioning.diagram.part.CpgVisualIDRegistry
					.getVisualID(view)) {

			case cloudProvisioning.diagram.edit.parts.CanvasEditPart.VISUAL_ID:
				return new cloudProvisioning.diagram.edit.parts.CanvasEditPart(
						view);

			case cloudProvisioning.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
				return new cloudProvisioning.diagram.edit.parts.EnvironmentEditPart(
						view);

			case cloudProvisioning.diagram.edit.parts.EnvironmentNameEditPart.VISUAL_ID:
				return new cloudProvisioning.diagram.edit.parts.EnvironmentNameEditPart(
						view);

			case cloudProvisioning.diagram.edit.parts.InstanceEditPart.VISUAL_ID:
				return new cloudProvisioning.diagram.edit.parts.InstanceEditPart(
						view);

			case cloudProvisioning.diagram.edit.parts.InstanceNameEditPart.VISUAL_ID:
				return new cloudProvisioning.diagram.edit.parts.InstanceNameEditPart(
						view);

			case cloudProvisioning.diagram.edit.parts.EnvironmentEnvironmentCompartmentEditPart.VISUAL_ID:
				return new cloudProvisioning.diagram.edit.parts.EnvironmentEnvironmentCompartmentEditPart(
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
