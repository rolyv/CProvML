package cloudProvisioning.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class CpgPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createCloudProvisioning1Group());
	}

	/**
	 * Creates "cloudProvisioning" palette tool group
	 * @generated
	 */
	private PaletteContainer createCloudProvisioning1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				cloudProvisioning.diagram.part.Messages.CloudProvisioning1Group_title);
		paletteContainer.setId("createCloudProvisioning1Group"); //$NON-NLS-1$
		paletteContainer.add(createEnvironment1CreationTool());
		paletteContainer.add(createInstance2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnvironment1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				cloudProvisioning.diagram.part.Messages.Environment1CreationTool_title,
				cloudProvisioning.diagram.part.Messages.Environment1CreationTool_desc,
				Collections
						.singletonList(cloudProvisioning.diagram.providers.CpgElementTypes.Environment_2002));
		entry.setId("createEnvironment1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(cloudProvisioning.diagram.providers.CpgElementTypes
				.getImageDescriptor(cloudProvisioning.diagram.providers.CpgElementTypes.Environment_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInstance2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				cloudProvisioning.diagram.part.Messages.Instance2CreationTool_title,
				cloudProvisioning.diagram.part.Messages.Instance2CreationTool_desc,
				Collections
						.singletonList(cloudProvisioning.diagram.providers.CpgElementTypes.Instance_3001));
		entry.setId("createInstance2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(cloudProvisioning.diagram.providers.CpgElementTypes
				.getImageDescriptor(cloudProvisioning.diagram.providers.CpgElementTypes.Instance_3001));
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
}
