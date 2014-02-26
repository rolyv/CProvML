package CPmodeling.diagram.providers;

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
		ElementInitializers cached = CPmodeling.diagram.part.CPmodelingDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			CPmodeling.diagram.part.CPmodelingDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
