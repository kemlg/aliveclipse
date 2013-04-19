package net.sf.ictalive.operetta.OM.diagram.is.navigator;

import net.sf.ictalive.operetta.OM.PartialOrder;
import net.sf.ictalive.operetta.OM.SceneToTransitionArc;
import net.sf.ictalive.operetta.OM.Transition;
import net.sf.ictalive.operetta.OM.TransitionToSceneArc;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.ISEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkPatternEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.PartialOrderEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Scene2EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Scene3EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneSceneIDEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneToTransitionArcEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Transition2EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Transition3EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.TransitionEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.TransitionToSceneArcEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.TransitionToSceneArcTypeEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.WrappingLabel2EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.WrappingLabelEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.part.OperAISDiagramEditorPlugin;
import net.sf.ictalive.operetta.OM.diagram.is.part.OperAVisualIDRegistry;
import net.sf.ictalive.operetta.OM.diagram.is.providers.OperAElementTypes;
import net.sf.ictalive.operetta.OM.diagram.is.providers.OperAParserProvider;

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
		OperAISDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		OperAISDiagramEditorPlugin
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
			return OperAISDiagramEditorPlugin.getInstance().getBundledImage(
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
		case ISEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ict-alive.sourceforge.net/operetta/OM/1.0?IS", OperAElementTypes.IS_1100); //$NON-NLS-1$
		case SceneEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/operetta/OM/1.0?Scene", OperAElementTypes.Scene_2101); //$NON-NLS-1$
		case Scene2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/operetta/OM/1.0?Scene", OperAElementTypes.Scene_2102); //$NON-NLS-1$
		case Scene3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/operetta/OM/1.0?Scene", OperAElementTypes.Scene_2103); //$NON-NLS-1$
		case TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/operetta/OM/1.0?Transition", OperAElementTypes.Transition_2104); //$NON-NLS-1$
		case Transition2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/operetta/OM/1.0?Transition", OperAElementTypes.Transition_2105); //$NON-NLS-1$
		case Transition3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/operetta/OM/1.0?Transition", OperAElementTypes.Transition_2106); //$NON-NLS-1$
		case LandmarkPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/operetta/OM/1.0?LandmarkPattern", OperAElementTypes.LandmarkPattern_3101); //$NON-NLS-1$
		case LandmarkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/operetta/OM/1.0?Landmark", OperAElementTypes.Landmark_3102); //$NON-NLS-1$
		case TransitionToSceneArcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/operetta/OM/1.0?TransitionToSceneArc", OperAElementTypes.TransitionToSceneArc_4101); //$NON-NLS-1$
		case SceneToTransitionArcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/operetta/OM/1.0?SceneToTransitionArc", OperAElementTypes.SceneToTransitionArc_4102); //$NON-NLS-1$
		case PartialOrderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/operetta/OM/1.0?PartialOrder", OperAElementTypes.PartialOrder_4103); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = OperAISDiagramEditorPlugin.getInstance()
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
		case ISEditPart.VISUAL_ID:
			return getIS_1100Text(view);
		case SceneEditPart.VISUAL_ID:
			return getScene_2101Text(view);
		case Scene2EditPart.VISUAL_ID:
			return getScene_2102Text(view);
		case Scene3EditPart.VISUAL_ID:
			return getScene_2103Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2104Text(view);
		case Transition2EditPart.VISUAL_ID:
			return getTransition_2105Text(view);
		case Transition3EditPart.VISUAL_ID:
			return getTransition_2106Text(view);
		case LandmarkPatternEditPart.VISUAL_ID:
			return getLandmarkPattern_3101Text(view);
		case LandmarkEditPart.VISUAL_ID:
			return getLandmark_3102Text(view);
		case TransitionToSceneArcEditPart.VISUAL_ID:
			return getTransitionToSceneArc_4101Text(view);
		case SceneToTransitionArcEditPart.VISUAL_ID:
			return getSceneToTransitionArc_4102Text(view);
		case PartialOrderEditPart.VISUAL_ID:
			return getPartialOrder_4103Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getIS_1100Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getScene_2101Text(View view) {
		IParser parser = OperAParserProvider.getParser(
				OperAElementTypes.Scene_2101, view.getElement() != null ? view
						.getElement() : view, OperAVisualIDRegistry
						.getType(SceneSceneIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5101); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScene_2102Text(View view) {
		IParser parser = OperAParserProvider.getParser(
				OperAElementTypes.Scene_2102, view.getElement() != null ? view
						.getElement() : view, OperAVisualIDRegistry
						.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5102); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScene_2103Text(View view) {
		IParser parser = OperAParserProvider.getParser(
				OperAElementTypes.Scene_2103, view.getElement() != null ? view
						.getElement() : view, OperAVisualIDRegistry
						.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5103); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_2104Text(View view) {
		Transition domainModelElement = (Transition) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTransitionID();
		} else {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2104); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_2105Text(View view) {
		Transition domainModelElement = (Transition) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTransitionID();
		} else {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2105); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_2106Text(View view) {
		Transition domainModelElement = (Transition) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTransitionID();
		} else {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2106); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLandmarkPattern_3101Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLandmark_3102Text(View view) {
		IParser parser = OperAParserProvider.getParser(
				OperAElementTypes.Landmark_3102,
				view.getElement() != null ? view.getElement() : view,
				OperAVisualIDRegistry.getType(LandmarkNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5104); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransitionToSceneArc_4101Text(View view) {
		TransitionToSceneArc domainModelElement = (TransitionToSceneArc) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getArcID();
		} else {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4101); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSceneToTransitionArc_4102Text(View view) {
		SceneToTransitionArc domainModelElement = (SceneToTransitionArc) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getArcID();
		} else {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4102); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartialOrder_4103Text(View view) {
		PartialOrder domainModelElement = (PartialOrder) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4103); //$NON-NLS-1$
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
		return ISEditPart.MODEL_ID.equals(OperAVisualIDRegistry
				.getModelID(view));
	}

}
