package net.sf.ictalive.operetta.OM.diagram.ss.navigator;

import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.HierarchyDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.HierarchyDependencyNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.MarketDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.MarketDependencyNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.NetworkDependencyEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.NetworkDependencyNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.RoleEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.RoleNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.SSEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.part.OperASSDiagramEditorPlugin;
import net.sf.ictalive.operetta.OM.diagram.ss.part.OperAVisualIDRegistry;
import net.sf.ictalive.operetta.OM.diagram.ss.providers.OperAElementTypes;
import net.sf.ictalive.operetta.OM.diagram.ss.providers.OperAParserProvider;

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
public class OperANavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		OperASSDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		OperASSDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof OperANavigatorItem
				&& !isOwnView(((OperANavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof OperANavigatorGroup) {
			OperANavigatorGroup group = (OperANavigatorGroup) element;
			return OperASSDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof OperANavigatorItem) {
			OperANavigatorItem navigatorItem = (OperANavigatorItem) element;
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
		switch (OperAVisualIDRegistry.getVisualID(view)) {
		case SSEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ict-alive.sourceforge.net/operetta/OM/1.0?SS", OperAElementTypes.SS_1000); //$NON-NLS-1$
		case RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/operetta/OM/1.0?Role", OperAElementTypes.Role_2001); //$NON-NLS-1$
		case NetworkDependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/operetta/OM/1.0?NetworkDependency", OperAElementTypes.NetworkDependency_4001); //$NON-NLS-1$
		case MarketDependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/operetta/OM/1.0?MarketDependency", OperAElementTypes.MarketDependency_4002); //$NON-NLS-1$
		case HierarchyDependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/operetta/OM/1.0?HierarchyDependency", OperAElementTypes.HierarchyDependency_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = OperASSDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& OperAElementTypes.isKnownElementType(elementType)) {
			image = OperAElementTypes.getImage(elementType);
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
		if (element instanceof OperANavigatorGroup) {
			OperANavigatorGroup group = (OperANavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof OperANavigatorItem) {
			OperANavigatorItem navigatorItem = (OperANavigatorItem) element;
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
		switch (OperAVisualIDRegistry.getVisualID(view)) {
		case SSEditPart.VISUAL_ID:
			return getSS_1000Text(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2001Text(view);
		case NetworkDependencyEditPart.VISUAL_ID:
			return getNetworkDependency_4001Text(view);
		case MarketDependencyEditPart.VISUAL_ID:
			return getMarketDependency_4002Text(view);
		case HierarchyDependencyEditPart.VISUAL_ID:
			return getHierarchyDependency_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSS_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRole_2001Text(View view) {
		IParser parser = OperAParserProvider.getParser(
				OperAElementTypes.Role_2001, view.getElement() != null ? view
						.getElement() : view, OperAVisualIDRegistry
						.getType(RoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OperASSDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNetworkDependency_4001Text(View view) {
		IParser parser = OperAParserProvider.getParser(
				OperAElementTypes.NetworkDependency_4001,
				view.getElement() != null ? view.getElement() : view,
				OperAVisualIDRegistry
						.getType(NetworkDependencyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OperASSDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMarketDependency_4002Text(View view) {
		IParser parser = OperAParserProvider.getParser(
				OperAElementTypes.MarketDependency_4002,
				view.getElement() != null ? view.getElement() : view,
				OperAVisualIDRegistry
						.getType(MarketDependencyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OperASSDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHierarchyDependency_4003Text(View view) {
		IParser parser = OperAParserProvider.getParser(
				OperAElementTypes.HierarchyDependency_4003,
				view.getElement() != null ? view.getElement() : view,
				OperAVisualIDRegistry
						.getType(HierarchyDependencyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OperASSDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
		return SSEditPart.MODEL_ID.equals(OperAVisualIDRegistry
				.getModelID(view));
	}

}
