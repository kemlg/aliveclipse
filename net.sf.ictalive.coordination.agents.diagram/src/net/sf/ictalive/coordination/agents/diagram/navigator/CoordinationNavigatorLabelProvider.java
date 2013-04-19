package net.sf.ictalive.coordination.agents.diagram.navigator;

import net.sf.ictalive.coordination.agents.MasModel;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentHasActionEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentHasRoleEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentNameEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AtomicActionNameEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.CompositeActionNameEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.MasModelEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.RoleEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.RoleNameEditPart;
import net.sf.ictalive.coordination.agents.diagram.part.AgentsDiagramEditorPlugin;
import net.sf.ictalive.coordination.agents.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.agents.diagram.providers.CoordinationElementTypes;
import net.sf.ictalive.coordination.agents.diagram.providers.CoordinationParserProvider;

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
public class CoordinationNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		AgentsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		AgentsDiagramEditorPlugin
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
		if (element instanceof CoordinationNavigatorItem
				&& !isOwnView(((CoordinationNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof CoordinationNavigatorGroup) {
			CoordinationNavigatorGroup group = (CoordinationNavigatorGroup) element;
			return AgentsDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof CoordinationNavigatorItem) {
			CoordinationNavigatorItem navigatorItem = (CoordinationNavigatorItem) element;
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
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case MasModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ict-alive.sourceforge.net/coordination/agents?MasModel", CoordinationElementTypes.MasModel_1000); //$NON-NLS-1$
		case AgentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/agents?Agent", CoordinationElementTypes.Agent_2004); //$NON-NLS-1$
		case RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/operetta/OM/1.0?Role", CoordinationElementTypes.Role_2005); //$NON-NLS-1$
		case AtomicActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/actions?AtomicAction", CoordinationElementTypes.AtomicAction_2006); //$NON-NLS-1$
		case CompositeActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/actions?CompositeAction", CoordinationElementTypes.CompositeAction_2007); //$NON-NLS-1$
		case AgentHasActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/agents?Agent?hasAction", CoordinationElementTypes.AgentHasAction_4003); //$NON-NLS-1$
		case AgentHasRoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/agents?Agent?hasRole", CoordinationElementTypes.AgentHasRole_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = AgentsDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& CoordinationElementTypes.isKnownElementType(elementType)) {
			image = CoordinationElementTypes.getImage(elementType);
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
		if (element instanceof CoordinationNavigatorGroup) {
			CoordinationNavigatorGroup group = (CoordinationNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CoordinationNavigatorItem) {
			CoordinationNavigatorItem navigatorItem = (CoordinationNavigatorItem) element;
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
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case MasModelEditPart.VISUAL_ID:
			return getMasModel_1000Text(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_2004Text(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2005Text(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2006Text(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2007Text(view);
		case AgentHasActionEditPart.VISUAL_ID:
			return getAgentHasAction_4003Text(view);
		case AgentHasRoleEditPart.VISUAL_ID:
			return getAgentHasRole_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMasModel_1000Text(View view) {
		MasModel domainModelElement = (MasModel) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			AgentsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAgent_2004Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Agent_2004,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(AgentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AgentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRole_2005Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Role_2005,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(RoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AgentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicAction_2006Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.AtomicAction_2006,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(AtomicActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AgentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeAction_2007Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.CompositeAction_2007, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(CompositeActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AgentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAgentHasAction_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAgentHasRole_4004Text(View view) {
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
		return MasModelEditPart.MODEL_ID.equals(CoordinationVisualIDRegistry
				.getModelID(view));
	}

}
