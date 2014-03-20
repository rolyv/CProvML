package CPmodeling.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class CPmodelingNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof CPmodeling.diagram.navigator.CPmodelingNavigatorItem) {
			CPmodeling.diagram.navigator.CPmodelingNavigatorItem item = (CPmodeling.diagram.navigator.CPmodelingNavigatorItem) element;
			return CPmodeling.diagram.part.CPmodelingVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
