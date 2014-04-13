package cloudProvisioning.diagram.providers;

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
public class CpgParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser environmentName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getEnvironmentName_5003Parser() {
		if (environmentName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { cloudProvisioning.CloudProvisioningPackage.eINSTANCE
					.getEnvironment_Name() };
			cloudProvisioning.diagram.parsers.MessageFormatParser parser = new cloudProvisioning.diagram.parsers.MessageFormatParser(
					features);
			environmentName_5003Parser = parser;
		}
		return environmentName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser instanceName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getInstanceName_5004Parser() {
		if (instanceName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { cloudProvisioning.CloudProvisioningPackage.eINSTANCE
					.getInstance_Name() };
			cloudProvisioning.diagram.parsers.MessageFormatParser parser = new cloudProvisioning.diagram.parsers.MessageFormatParser(
					features);
			instanceName_5004Parser = parser;
		}
		return instanceName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case cloudProvisioning.diagram.edit.parts.EnvironmentNameEditPart.VISUAL_ID:
			return getEnvironmentName_5003Parser();
		case cloudProvisioning.diagram.edit.parts.InstanceNameEditPart.VISUAL_ID:
			return getInstanceName_5004Parser();
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
			return getParser(cloudProvisioning.diagram.part.CpgVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(cloudProvisioning.diagram.part.CpgVisualIDRegistry
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
			if (cloudProvisioning.diagram.providers.CpgElementTypes
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
