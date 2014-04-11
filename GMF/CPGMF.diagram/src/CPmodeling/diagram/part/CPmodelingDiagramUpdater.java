package CPmodeling.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class CPmodelingDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingNodeDescriptor> getSemanticChildren(
			View view) {
		switch (CPmodeling.diagram.part.CPmodelingVisualIDRegistry
				.getVisualID(view)) {
		case CPmodeling.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingNodeDescriptor> getEnvironment_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CPmodeling.environment modelElement = (CPmodeling.environment) view
				.getElement();
		LinkedList<CPmodeling.diagram.part.CPmodelingNodeDescriptor> result = new LinkedList<CPmodeling.diagram.part.CPmodelingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRAMs().iterator(); it.hasNext();) {
			CPmodeling.mainMemory childElement = (CPmodeling.mainMemory) it
					.next();
			int visualID = CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CPmodeling.diagram.edit.parts.MainMemoryEditPart.VISUAL_ID) {
				result.add(new CPmodeling.diagram.part.CPmodelingNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getVMs().iterator(); it.hasNext();) {
			CPmodeling.virtualMachine childElement = (CPmodeling.virtualMachine) it
					.next();
			int visualID = CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CPmodeling.diagram.edit.parts.VirtualMachineEditPart.VISUAL_ID) {
				result.add(new CPmodeling.diagram.part.CPmodelingNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCPUs().iterator(); it.hasNext();) {
			CPmodeling.processor childElement = (CPmodeling.processor) it
					.next();
			int visualID = CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CPmodeling.diagram.edit.parts.ProcessorEditPart.VISUAL_ID) {
				result.add(new CPmodeling.diagram.part.CPmodelingNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getContainedLinks(
			View view) {
		switch (CPmodeling.diagram.part.CPmodelingVisualIDRegistry
				.getVisualID(view)) {
		case CPmodeling.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000ContainedLinks(view);
		case CPmodeling.diagram.edit.parts.MainMemoryEditPart.VISUAL_ID:
			return getMainMemory_2001ContainedLinks(view);
		case CPmodeling.diagram.edit.parts.VirtualMachineEditPart.VISUAL_ID:
			return getVirtualMachine_2002ContainedLinks(view);
		case CPmodeling.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_2003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getIncomingLinks(
			View view) {
		switch (CPmodeling.diagram.part.CPmodelingVisualIDRegistry
				.getVisualID(view)) {
		case CPmodeling.diagram.edit.parts.MainMemoryEditPart.VISUAL_ID:
			return getMainMemory_2001IncomingLinks(view);
		case CPmodeling.diagram.edit.parts.VirtualMachineEditPart.VISUAL_ID:
			return getVirtualMachine_2002IncomingLinks(view);
		case CPmodeling.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_2003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (CPmodeling.diagram.part.CPmodelingVisualIDRegistry
				.getVisualID(view)) {
		case CPmodeling.diagram.edit.parts.MainMemoryEditPart.VISUAL_ID:
			return getMainMemory_2001OutgoingLinks(view);
		case CPmodeling.diagram.edit.parts.VirtualMachineEditPart.VISUAL_ID:
			return getVirtualMachine_2002OutgoingLinks(view);
		case CPmodeling.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_2003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getEnvironment_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getMainMemory_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getVirtualMachine_2002ContainedLinks(
			View view) {
		CPmodeling.virtualMachine modelElement = (CPmodeling.virtualMachine) view
				.getElement();
		LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor> result = new LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_virtualMachine_RAMs_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_virtualMachine_VMs_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_virtualMachine_CPUs_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getProcessor_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getMainMemory_2001IncomingLinks(
			View view) {
		CPmodeling.mainMemory modelElement = (CPmodeling.mainMemory) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor> result = new LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_virtualMachine_RAMs_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getVirtualMachine_2002IncomingLinks(
			View view) {
		CPmodeling.virtualMachine modelElement = (CPmodeling.virtualMachine) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor> result = new LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_virtualMachine_VMs_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getProcessor_2003IncomingLinks(
			View view) {
		CPmodeling.processor modelElement = (CPmodeling.processor) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor> result = new LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_virtualMachine_CPUs_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getMainMemory_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getVirtualMachine_2002OutgoingLinks(
			View view) {
		CPmodeling.virtualMachine modelElement = (CPmodeling.virtualMachine) view
				.getElement();
		LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor> result = new LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_virtualMachine_RAMs_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_virtualMachine_VMs_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_virtualMachine_CPUs_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getProcessor_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getIncomingFeatureModelFacetLinks_virtualMachine_RAMs_4001(
			CPmodeling.mainMemory target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor> result = new LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CPmodeling.CPmodelingPackage.eINSTANCE
					.getvirtualMachine_RAMs()) {
				result.add(new CPmodeling.diagram.part.CPmodelingLinkDescriptor(
						setting.getEObject(),
						target,
						CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineRAMs_4001,
						CPmodeling.diagram.edit.parts.VirtualMachineRAMsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getIncomingFeatureModelFacetLinks_virtualMachine_VMs_4002(
			CPmodeling.virtualMachine target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor> result = new LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CPmodeling.CPmodelingPackage.eINSTANCE
					.getvirtualMachine_VMs()) {
				result.add(new CPmodeling.diagram.part.CPmodelingLinkDescriptor(
						setting.getEObject(),
						target,
						CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineVMs_4002,
						CPmodeling.diagram.edit.parts.VirtualMachineVMsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getIncomingFeatureModelFacetLinks_virtualMachine_CPUs_4003(
			CPmodeling.processor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor> result = new LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CPmodeling.CPmodelingPackage.eINSTANCE
					.getvirtualMachine_CPUs()) {
				result.add(new CPmodeling.diagram.part.CPmodelingLinkDescriptor(
						setting.getEObject(),
						target,
						CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineCPUs_4003,
						CPmodeling.diagram.edit.parts.VirtualMachineCPUsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getOutgoingFeatureModelFacetLinks_virtualMachine_RAMs_4001(
			CPmodeling.virtualMachine source) {
		LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor> result = new LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor>();
		for (Iterator<?> destinations = source.getRAMs().iterator(); destinations
				.hasNext();) {
			CPmodeling.mainMemory destination = (CPmodeling.mainMemory) destinations
					.next();
			result.add(new CPmodeling.diagram.part.CPmodelingLinkDescriptor(
					source,
					destination,
					CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineRAMs_4001,
					CPmodeling.diagram.edit.parts.VirtualMachineRAMsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getOutgoingFeatureModelFacetLinks_virtualMachine_VMs_4002(
			CPmodeling.virtualMachine source) {
		LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor> result = new LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor>();
		for (Iterator<?> destinations = source.getVMs().iterator(); destinations
				.hasNext();) {
			CPmodeling.virtualMachine destination = (CPmodeling.virtualMachine) destinations
					.next();
			result.add(new CPmodeling.diagram.part.CPmodelingLinkDescriptor(
					source,
					destination,
					CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineVMs_4002,
					CPmodeling.diagram.edit.parts.VirtualMachineVMsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getOutgoingFeatureModelFacetLinks_virtualMachine_CPUs_4003(
			CPmodeling.virtualMachine source) {
		LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor> result = new LinkedList<CPmodeling.diagram.part.CPmodelingLinkDescriptor>();
		for (Iterator<?> destinations = source.getCPUs().iterator(); destinations
				.hasNext();) {
			CPmodeling.processor destination = (CPmodeling.processor) destinations
					.next();
			result.add(new CPmodeling.diagram.part.CPmodelingLinkDescriptor(
					source,
					destination,
					CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineCPUs_4003,
					CPmodeling.diagram.edit.parts.VirtualMachineCPUsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<CPmodeling.diagram.part.CPmodelingNodeDescriptor> getSemanticChildren(
				View view) {
			return CPmodelingDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getContainedLinks(
				View view) {
			return CPmodelingDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getIncomingLinks(
				View view) {
			return CPmodelingDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CPmodeling.diagram.part.CPmodelingLinkDescriptor> getOutgoingLinks(
				View view) {
			return CPmodelingDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
