package cloudProvisioning.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = cloudProvisioning.diagram.part.CpgDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			cloudProvisioning.diagram.part.CpgDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
