package CPmodeling.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class CPmodelingNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		CPmodeling.diagram.part.CPmodelingDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		CPmodeling.diagram.part.CPmodelingDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CPmodeling.diagram.navigator.CPmodelingNavigatorItem
				&& !isOwnView(((CPmodeling.diagram.navigator.CPmodelingNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof CPmodeling.diagram.navigator.CPmodelingNavigatorGroup) {
			CPmodeling.diagram.navigator.CPmodelingNavigatorGroup group = (CPmodeling.diagram.navigator.CPmodelingNavigatorGroup) element;
			return CPmodeling.diagram.part.CPmodelingDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CPmodeling.diagram.navigator.CPmodelingNavigatorItem) {
			CPmodeling.diagram.navigator.CPmodelingNavigatorItem navigatorItem = (CPmodeling.diagram.navigator.CPmodelingNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (CPmodeling.diagram.part.CPmodelingVisualIDRegistry
				.getVisualID(view)) {
		case CPmodeling.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///CPmodeling.ecore?environment", CPmodeling.diagram.providers.CPmodelingElementTypes.Environment_1000); //$NON-NLS-1$
		case CPmodeling.diagram.edit.parts.MainMemoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///CPmodeling.ecore?mainMemory", CPmodeling.diagram.providers.CPmodelingElementTypes.MainMemory_2001); //$NON-NLS-1$
		case CPmodeling.diagram.edit.parts.VirtualMachineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///CPmodeling.ecore?virtualMachine", CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachine_2002); //$NON-NLS-1$
		case CPmodeling.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///CPmodeling.ecore?processor", CPmodeling.diagram.providers.CPmodelingElementTypes.Processor_2003); //$NON-NLS-1$
		case CPmodeling.diagram.edit.parts.VirtualMachineRAMsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///CPmodeling.ecore?virtualMachine?rAMs", CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineRAMs_4001); //$NON-NLS-1$
		case CPmodeling.diagram.edit.parts.VirtualMachineVMsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///CPmodeling.ecore?virtualMachine?vMs", CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineVMs_4002); //$NON-NLS-1$
		case CPmodeling.diagram.edit.parts.VirtualMachineCPUsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///CPmodeling.ecore?virtualMachine?cPUs", CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachineCPUs_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CPmodeling.diagram.part.CPmodelingDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& CPmodeling.diagram.providers.CPmodelingElementTypes
						.isKnownElementType(elementType)) {
			image = CPmodeling.diagram.providers.CPmodelingElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof CPmodeling.diagram.navigator.CPmodelingNavigatorGroup) {
			CPmodeling.diagram.navigator.CPmodelingNavigatorGroup group = (CPmodeling.diagram.navigator.CPmodelingNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CPmodeling.diagram.navigator.CPmodelingNavigatorItem) {
			CPmodeling.diagram.navigator.CPmodelingNavigatorItem navigatorItem = (CPmodeling.diagram.navigator.CPmodelingNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (CPmodeling.diagram.part.CPmodelingVisualIDRegistry
				.getVisualID(view)) {
		case CPmodeling.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000Text(view);
		case CPmodeling.diagram.edit.parts.MainMemoryEditPart.VISUAL_ID:
			return getMainMemory_2001Text(view);
		case CPmodeling.diagram.edit.parts.VirtualMachineEditPart.VISUAL_ID:
			return getVirtualMachine_2002Text(view);
		case CPmodeling.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_2003Text(view);
		case CPmodeling.diagram.edit.parts.VirtualMachineRAMsEditPart.VISUAL_ID:
			return getVirtualMachineRAMs_4001Text(view);
		case CPmodeling.diagram.edit.parts.VirtualMachineVMsEditPart.VISUAL_ID:
			return getVirtualMachineVMs_4002Text(view);
		case CPmodeling.diagram.edit.parts.VirtualMachineCPUsEditPart.VISUAL_ID:
			return getVirtualMachineCPUs_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getEnvironment_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMainMemory_2001Text(View view) {
		IParser parser = CPmodeling.diagram.providers.CPmodelingParserProvider
				.getParser(
						CPmodeling.diagram.providers.CPmodelingElementTypes.MainMemory_2001,
						view.getElement() != null ? view.getElement() : view,
						CPmodeling.diagram.part.CPmodelingVisualIDRegistry
								.getType(CPmodeling.diagram.edit.parts.MainMemoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CPmodeling.diagram.part.CPmodelingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVirtualMachine_2002Text(View view) {
		IParser parser = CPmodeling.diagram.providers.CPmodelingParserProvider
				.getParser(
						CPmodeling.diagram.providers.CPmodelingElementTypes.VirtualMachine_2002,
						view.getElement() != null ? view.getElement() : view,
						CPmodeling.diagram.part.CPmodelingVisualIDRegistry
								.getType(CPmodeling.diagram.edit.parts.VirtualMachineNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CPmodeling.diagram.part.CPmodelingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessor_2003Text(View view) {
		IParser parser = CPmodeling.diagram.providers.CPmodelingParserProvider
				.getParser(
						CPmodeling.diagram.providers.CPmodelingElementTypes.Processor_2003,
						view.getElement() != null ? view.getElement() : view,
						CPmodeling.diagram.part.CPmodelingVisualIDRegistry
								.getType(CPmodeling.diagram.edit.parts.ProcessorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CPmodeling.diagram.part.CPmodelingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVirtualMachineRAMs_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getVirtualMachineVMs_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getVirtualMachineCPUs_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CPmodeling.diagram.edit.parts.EnvironmentEditPart.MODEL_ID
				.equals(CPmodeling.diagram.part.CPmodelingVisualIDRegistry
						.getModelID(view));
	}

}
