package CPmodeling.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CPmodelingParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser mainMemoryName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getMainMemoryName_5001Parser() {
		if (mainMemoryName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CPmodeling.CPmodelingPackage.eINSTANCE
					.getmainMemory_Name() };
			CPmodeling.diagram.parsers.MessageFormatParser parser = new CPmodeling.diagram.parsers.MessageFormatParser(
					features);
			mainMemoryName_5001Parser = parser;
		}
		return mainMemoryName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser virtualMachineName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getVirtualMachineName_5002Parser() {
		if (virtualMachineName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CPmodeling.CPmodelingPackage.eINSTANCE
					.getvirtualMachine_Name() };
			CPmodeling.diagram.parsers.MessageFormatParser parser = new CPmodeling.diagram.parsers.MessageFormatParser(
					features);
			virtualMachineName_5002Parser = parser;
		}
		return virtualMachineName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser processorName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorName_5003Parser() {
		if (processorName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CPmodeling.CPmodelingPackage.eINSTANCE
					.getprocessor_Name() };
			CPmodeling.diagram.parsers.MessageFormatParser parser = new CPmodeling.diagram.parsers.MessageFormatParser(
					features);
			processorName_5003Parser = parser;
		}
		return processorName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CPmodeling.diagram.edit.parts.MainMemoryNameEditPart.VISUAL_ID:
			return getMainMemoryName_5001Parser();
		case CPmodeling.diagram.edit.parts.VirtualMachineNameEditPart.VISUAL_ID:
			return getVirtualMachineName_5002Parser();
		case CPmodeling.diagram.edit.parts.ProcessorNameEditPart.VISUAL_ID:
			return getProcessorName_5003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CPmodeling.diagram.providers.CPmodelingElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
