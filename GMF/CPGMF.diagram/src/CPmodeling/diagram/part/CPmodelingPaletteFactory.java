package CPmodeling.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class CPmodelingPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createCPmodeling1Group());
	}

	/**
	 * Creates "CPmodeling" palette tool group
	 * @generated
	 */
	private PaletteContainer createCPmodeling1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				CPmodeling.diagram.part.Messages.CPmodeling1Group_title);
		paletteContainer.setId("createCPmodeling1Group"); //$NON-NLS-1$
		paletteContainer.add(createMainMemory1CreationTool());
		paletteContainer.add(createProcessor2CreationTool());
		paletteContainer.add(createVirtualMachine3CreationTool());
		paletteContainer.add(createVirtualMachineVMs4CreationTool());
		paletteContainer.add(createVirtualMachineCPUs5CreationTool());
		paletteContainer.add(createVirtualMachineRAMs6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMainMemory1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				CPmodeling.diagram.part.Messages.MainMemory1CreationTool_title,
				CPmodeling.diagram.part.Messages.MainMemory1CreationTool_desc,
				Collections
						.singletonList(CPmodeling.diagram.providers.CPmodelingElementTypes.MainMemory_2001));
		entry.setId("createMainMemory1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CPmodeling.diagram.providers.CPmodelingElementTypes
				.getImageDescriptor(CPmodeling.diagram.providers.CPmodelingElementTypes.MainMemory_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessor2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				CPmodeling.diagram.part.Messages.Processor2CreationTool_title,
				CPmodeling.diagram.part.Messages.Processor2CreationTool_desc,
				Collections
						.singletonList(CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachine_2002));
		entry.setId("createProcessor2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CPmodeling.diagram.providers.CPmodelingElementTypes
				.getImageDescriptor(CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachine_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVirtualMachine3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				CPmodeling.diagram.part.Messages.VirtualMachine3CreationTool_title,
				CPmodeling.diagram.part.Messages.VirtualMachine3CreationTool_desc,
				Collections
						.singletonList(CPmodeling.diagram.providers.CPmodelingElementTypes.Processor_2003));
		entry.setId("createVirtualMachine3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CPmodeling.diagram.providers.CPmodelingElementTypes
				.getImageDescriptor(CPmodeling.diagram.providers.CPmodelingElementTypes.Processor_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVirtualMachineVMs4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				CPmodeling.diagram.part.Messages.VirtualMachineVMs4CreationTool_title,
				CPmodeling.diagram.part.Messages.VirtualMachineVMs4CreationTool_desc,
				Collections
						.singletonList(CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineRAMs_4001));
		entry.setId("createVirtualMachineVMs4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CPmodeling.diagram.providers.CPmodelingElementTypes
				.getImageDescriptor(CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineRAMs_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVirtualMachineCPUs5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				CPmodeling.diagram.part.Messages.VirtualMachineCPUs5CreationTool_title,
				CPmodeling.diagram.part.Messages.VirtualMachineCPUs5CreationTool_desc,
				Collections
						.singletonList(CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineVMs_4002));
		entry.setId("createVirtualMachineCPUs5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CPmodeling.diagram.providers.CPmodelingElementTypes
				.getImageDescriptor(CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineVMs_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVirtualMachineRAMs6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				CPmodeling.diagram.part.Messages.VirtualMachineRAMs6CreationTool_title,
				CPmodeling.diagram.part.Messages.VirtualMachineRAMs6CreationTool_desc,
				Collections
						.singletonList(CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineCPUs_4003));
		entry.setId("createVirtualMachineRAMs6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CPmodeling.diagram.providers.CPmodelingElementTypes
				.getImageDescriptor(CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineCPUs_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
