package CPmodeling.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class CPmodelingElementTypes {

	/**
	 * @generated
	 */
	private CPmodelingElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CPmodeling.diagram.part.CPmodelingDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Environment_1000 = getElementType("CPGMF.diagram.Environment_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MainMemory_2001 = getElementType("CPGMF.diagram.MainMemory_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VirtualMachine_2002 = getElementType("CPGMF.diagram.VirtualMachine_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Processor_2003 = getElementType("CPGMF.diagram.Processor_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VirtualMachineRAMs_4001 = getElementType("CPGMF.diagram.VirtualMachineRAMs_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VirtualMachineVMs_4002 = getElementType("CPGMF.diagram.VirtualMachineVMs_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VirtualMachineCPUs_4003 = getElementType("CPGMF.diagram.VirtualMachineCPUs_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Environment_1000,
					CPmodeling.CPmodelingPackage.eINSTANCE.getenvironment());

			elements.put(MainMemory_2001,
					CPmodeling.CPmodelingPackage.eINSTANCE.getmainMemory());

			elements.put(VirtualMachine_2002,
					CPmodeling.CPmodelingPackage.eINSTANCE.getvirtualMachine());

			elements.put(Processor_2003,
					CPmodeling.CPmodelingPackage.eINSTANCE.getprocessor());

			elements.put(VirtualMachineRAMs_4001,
					CPmodeling.CPmodelingPackage.eINSTANCE
							.getvirtualMachine_RAMs());

			elements.put(VirtualMachineVMs_4002,
					CPmodeling.CPmodelingPackage.eINSTANCE
							.getvirtualMachine_VMs());

			elements.put(VirtualMachineCPUs_4003,
					CPmodeling.CPmodelingPackage.eINSTANCE
							.getvirtualMachine_CPUs());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Environment_1000);
			KNOWN_ELEMENT_TYPES.add(MainMemory_2001);
			KNOWN_ELEMENT_TYPES.add(VirtualMachine_2002);
			KNOWN_ELEMENT_TYPES.add(Processor_2003);
			KNOWN_ELEMENT_TYPES.add(VirtualMachineRAMs_4001);
			KNOWN_ELEMENT_TYPES.add(VirtualMachineVMs_4002);
			KNOWN_ELEMENT_TYPES.add(VirtualMachineCPUs_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CPmodeling.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return Environment_1000;
		case CPmodeling.diagram.edit.parts.MainMemoryEditPart.VISUAL_ID:
			return MainMemory_2001;
		case CPmodeling.diagram.edit.parts.VirtualMachineEditPart.VISUAL_ID:
			return VirtualMachine_2002;
		case CPmodeling.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return Processor_2003;
		case CPmodeling.diagram.edit.parts.VirtualMachineRAMsEditPart.VISUAL_ID:
			return VirtualMachineRAMs_4001;
		case CPmodeling.diagram.edit.parts.VirtualMachineVMsEditPart.VISUAL_ID:
			return VirtualMachineVMs_4002;
		case CPmodeling.diagram.edit.parts.VirtualMachineCPUsEditPart.VISUAL_ID:
			return VirtualMachineCPUs_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return CPmodeling.diagram.providers.CPmodelingElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return CPmodeling.diagram.providers.CPmodelingElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return CPmodeling.diagram.providers.CPmodelingElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
