package CPmodeling.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CPmodelingVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "CPGMF.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CPmodeling.diagram.edit.parts.EnvironmentEditPart.MODEL_ID
					.equals(view.getType())) {
				return CPmodeling.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return CPmodeling.diagram.part.CPmodelingVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				CPmodeling.diagram.part.CPmodelingDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CPmodeling.CPmodelingPackage.eINSTANCE.getenvironment()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((CPmodeling.environment) domainElement)) {
			return CPmodeling.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = CPmodeling.diagram.part.CPmodelingVisualIDRegistry
				.getModelID(containerView);
		if (!CPmodeling.diagram.edit.parts.EnvironmentEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (CPmodeling.diagram.edit.parts.EnvironmentEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CPmodeling.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CPmodeling.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			if (CPmodeling.CPmodelingPackage.eINSTANCE.getmainMemory()
					.isSuperTypeOf(domainElement.eClass())) {
				return CPmodeling.diagram.edit.parts.MainMemoryEditPart.VISUAL_ID;
			}
			if (CPmodeling.CPmodelingPackage.eINSTANCE.getvirtualMachine()
					.isSuperTypeOf(domainElement.eClass())) {
				return CPmodeling.diagram.edit.parts.VirtualMachineEditPart.VISUAL_ID;
			}
			if (CPmodeling.CPmodelingPackage.eINSTANCE.getprocessor()
					.isSuperTypeOf(domainElement.eClass())) {
				return CPmodeling.diagram.edit.parts.ProcessorEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = CPmodeling.diagram.part.CPmodelingVisualIDRegistry
				.getModelID(containerView);
		if (!CPmodeling.diagram.edit.parts.EnvironmentEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (CPmodeling.diagram.edit.parts.EnvironmentEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CPmodeling.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CPmodeling.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			if (CPmodeling.diagram.edit.parts.MainMemoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CPmodeling.diagram.edit.parts.VirtualMachineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CPmodeling.diagram.edit.parts.ProcessorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CPmodeling.diagram.edit.parts.MainMemoryEditPart.VISUAL_ID:
			if (CPmodeling.diagram.edit.parts.MainMemoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CPmodeling.diagram.edit.parts.VirtualMachineEditPart.VISUAL_ID:
			if (CPmodeling.diagram.edit.parts.VirtualMachineNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CPmodeling.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			if (CPmodeling.diagram.edit.parts.ProcessorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(CPmodeling.environment element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case CPmodeling.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return false;
		case CPmodeling.diagram.edit.parts.MainMemoryEditPart.VISUAL_ID:
		case CPmodeling.diagram.edit.parts.VirtualMachineEditPart.VISUAL_ID:
		case CPmodeling.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
