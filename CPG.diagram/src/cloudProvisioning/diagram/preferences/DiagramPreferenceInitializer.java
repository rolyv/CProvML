package cloudProvisioning.diagram.preferences;

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
		cloudProvisioning.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		cloudProvisioning.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		cloudProvisioning.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		cloudProvisioning.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		cloudProvisioning.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return cloudProvisioning.diagram.part.CpgDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
