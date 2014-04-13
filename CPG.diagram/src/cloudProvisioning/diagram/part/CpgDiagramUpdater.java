package cloudProvisioning.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class CpgDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgNodeDescriptor> getSemanticChildren(
			View view) {
		switch (cloudProvisioning.diagram.part.CpgVisualIDRegistry
				.getVisualID(view)) {
		case cloudProvisioning.diagram.edit.parts.CanvasEditPart.VISUAL_ID:
			return getCanvas_1000SemanticChildren(view);
		case cloudProvisioning.diagram.edit.parts.EnvironmentEnvironmentCompartmentEditPart.VISUAL_ID:
			return getEnvironmentEnvironmentCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgNodeDescriptor> getCanvas_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		cloudProvisioning.Canvas modelElement = (cloudProvisioning.Canvas) view
				.getElement();
		LinkedList<cloudProvisioning.diagram.part.CpgNodeDescriptor> result = new LinkedList<cloudProvisioning.diagram.part.CpgNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInstances().iterator(); it
				.hasNext();) {
			cloudProvisioning.Instance childElement = (cloudProvisioning.Instance) it
					.next();
			int visualID = cloudProvisioning.diagram.part.CpgVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == cloudProvisioning.diagram.edit.parts.InstanceEditPart.VISUAL_ID) {
				result.add(new cloudProvisioning.diagram.part.CpgNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEnvironments().iterator(); it
				.hasNext();) {
			cloudProvisioning.Environment childElement = (cloudProvisioning.Environment) it
					.next();
			int visualID = cloudProvisioning.diagram.part.CpgVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == cloudProvisioning.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID) {
				result.add(new cloudProvisioning.diagram.part.CpgNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgNodeDescriptor> getEnvironmentEnvironmentCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		cloudProvisioning.Environment modelElement = (cloudProvisioning.Environment) containerView
				.getElement();
		LinkedList<cloudProvisioning.diagram.part.CpgNodeDescriptor> result = new LinkedList<cloudProvisioning.diagram.part.CpgNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInstances().iterator(); it
				.hasNext();) {
			cloudProvisioning.Instance childElement = (cloudProvisioning.Instance) it
					.next();
			int visualID = cloudProvisioning.diagram.part.CpgVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == cloudProvisioning.diagram.edit.parts.Instance2EditPart.VISUAL_ID) {
				result.add(new cloudProvisioning.diagram.part.CpgNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getContainedLinks(
			View view) {
		switch (cloudProvisioning.diagram.part.CpgVisualIDRegistry
				.getVisualID(view)) {
		case cloudProvisioning.diagram.edit.parts.CanvasEditPart.VISUAL_ID:
			return getCanvas_1000ContainedLinks(view);
		case cloudProvisioning.diagram.edit.parts.InstanceEditPart.VISUAL_ID:
			return getInstance_2001ContainedLinks(view);
		case cloudProvisioning.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_2002ContainedLinks(view);
		case cloudProvisioning.diagram.edit.parts.Instance2EditPart.VISUAL_ID:
			return getInstance_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getIncomingLinks(
			View view) {
		switch (cloudProvisioning.diagram.part.CpgVisualIDRegistry
				.getVisualID(view)) {
		case cloudProvisioning.diagram.edit.parts.InstanceEditPart.VISUAL_ID:
			return getInstance_2001IncomingLinks(view);
		case cloudProvisioning.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_2002IncomingLinks(view);
		case cloudProvisioning.diagram.edit.parts.Instance2EditPart.VISUAL_ID:
			return getInstance_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (cloudProvisioning.diagram.part.CpgVisualIDRegistry
				.getVisualID(view)) {
		case cloudProvisioning.diagram.edit.parts.InstanceEditPart.VISUAL_ID:
			return getInstance_2001OutgoingLinks(view);
		case cloudProvisioning.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_2002OutgoingLinks(view);
		case cloudProvisioning.diagram.edit.parts.Instance2EditPart.VISUAL_ID:
			return getInstance_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getCanvas_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getInstance_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getEnvironment_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getInstance_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getInstance_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getEnvironment_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getInstance_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getInstance_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getEnvironment_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getInstance_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<cloudProvisioning.diagram.part.CpgNodeDescriptor> getSemanticChildren(
				View view) {
			return CpgDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getContainedLinks(
				View view) {
			return CpgDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getIncomingLinks(
				View view) {
			return CpgDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<cloudProvisioning.diagram.part.CpgLinkDescriptor> getOutgoingLinks(
				View view) {
			return CpgDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
