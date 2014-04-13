package cloudProvisioning.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class EnvironmentEnvironmentCompartmentItemSemanticEditPolicy extends
		cloudProvisioning.diagram.edit.policies.CpgBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnvironmentEnvironmentCompartmentItemSemanticEditPolicy() {
		super(
				cloudProvisioning.diagram.providers.CpgElementTypes.Environment_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (cloudProvisioning.diagram.providers.CpgElementTypes.Instance_3001 == req
				.getElementType()) {
			return getGEFWrapper(new cloudProvisioning.diagram.edit.commands.Instance2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
