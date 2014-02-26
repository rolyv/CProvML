package CPmodeling.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		CPmodeling.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		CPmodeling.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		CPmodeling.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		CPmodeling.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		CPmodeling.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return CPmodeling.diagram.part.CPmodelingDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
