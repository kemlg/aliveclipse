package net.sf.ictalive.coordination.plans.diagram.navigator;

import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingListEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingListRestEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingOwlsProcessEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.AtomicActionNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.CompositeActionNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputMessageMapEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputMessageMapMessagePartEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputMessageMapParameterEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.OutputEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.OutputNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlanEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlanForTaskEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlanHasAtomicProcessGroundingListEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlansCollectionEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.TaskEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.TaskNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.WrappingLabel2EditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.WrappingLabel3EditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.WrappingLabel4EditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.WrappingLabel5EditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.WrappingLabelEditPart;
import net.sf.ictalive.coordination.plans.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.plans.diagram.part.PlanDiagramEditorPlugin;
import net.sf.ictalive.coordination.plans.diagram.providers.CoordinationElementTypes;
import net.sf.ictalive.coordination.plans.diagram.providers.CoordinationParserProvider;
import net.sf.ictalive.coordination.tasks.ActionGrounding;
import net.sf.ictalive.coordination.tasks.ActionGroundingList;
import net.sf.ictalive.coordination.tasks.Plan;
import net.sf.ictalive.coordination.tasks.PlansCollection;

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
		PlanDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		PlanDiagramEditorPlugin
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
			return PlanDiagramEditorPlugin.getInstance().getBundledImage(
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
		case PlansCollectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ict-alive.sourceforge.net/coordination/tasks?PlansCollection", CoordinationElementTypes.PlansCollection_1000); //$NON-NLS-1$
		case PlanEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/tasks?Plan", CoordinationElementTypes.Plan_2009); //$NON-NLS-1$
		case TaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/tasks?Task", CoordinationElementTypes.Task_2010); //$NON-NLS-1$
		case ActionGroundingListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/tasks?ActionGroundingList", CoordinationElementTypes.ActionGroundingList_2011); //$NON-NLS-1$
		case AtomicActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/actions?AtomicAction", CoordinationElementTypes.AtomicAction_2012); //$NON-NLS-1$
		case CompositeActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/actions?CompositeAction", CoordinationElementTypes.CompositeAction_2013); //$NON-NLS-1$
		case InputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Input", CoordinationElementTypes.Input_2014); //$NON-NLS-1$
		case OutputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Output", CoordinationElementTypes.Output_2015); //$NON-NLS-1$
		case ActionGroundingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/coordination/tasks?ActionGrounding", CoordinationElementTypes.ActionGrounding_3003); //$NON-NLS-1$
		case InputMessageMapEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/coordination/tasks?InputMessageMap", CoordinationElementTypes.InputMessageMap_3004); //$NON-NLS-1$
		case ActionGroundingListRestEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/tasks?ActionGroundingList?rest", CoordinationElementTypes.ActionGroundingListRest_4006); //$NON-NLS-1$
		case InputMessageMapParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/tasks?InputMessageMap?parameter", CoordinationElementTypes.InputMessageMapParameter_4007); //$NON-NLS-1$
		case ActionGroundingOwlsProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/tasks?ActionGrounding?owlsProcess", CoordinationElementTypes.ActionGroundingOwlsProcess_4008); //$NON-NLS-1$
		case PlanForTaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/tasks?Plan?forTask", CoordinationElementTypes.PlanForTask_4009); //$NON-NLS-1$
		case PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/tasks?Plan?hasAtomicProcessGroundingList", CoordinationElementTypes.PlanHasAtomicProcessGroundingList_4010); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PlanDiagramEditorPlugin.getInstance()
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
		case PlansCollectionEditPart.VISUAL_ID:
			return getPlansCollection_1000Text(view);
		case PlanEditPart.VISUAL_ID:
			return getPlan_2009Text(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2010Text(view);
		case ActionGroundingListEditPart.VISUAL_ID:
			return getActionGroundingList_2011Text(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2012Text(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2013Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2014Text(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2015Text(view);
		case ActionGroundingEditPart.VISUAL_ID:
			return getActionGrounding_3003Text(view);
		case InputMessageMapEditPart.VISUAL_ID:
			return getInputMessageMap_3004Text(view);
		case ActionGroundingListRestEditPart.VISUAL_ID:
			return getActionGroundingListRest_4006Text(view);
		case InputMessageMapParameterEditPart.VISUAL_ID:
			return getInputMessageMapParameter_4007Text(view);
		case ActionGroundingOwlsProcessEditPart.VISUAL_ID:
			return getActionGroundingOwlsProcess_4008Text(view);
		case PlanForTaskEditPart.VISUAL_ID:
			return getPlanForTask_4009Text(view);
		case PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID:
			return getPlanHasAtomicProcessGroundingList_4010Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPlansCollection_1000Text(View view) {
		PlansCollection domainModelElement = (PlansCollection) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlan_2009Text(View view) {
		Plan domainModelElement = (Plan) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTask_2010Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Task_2010,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(TaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionGroundingList_2011Text(View view) {
		ActionGroundingList domainModelElement = (ActionGroundingList) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicAction_2012Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.AtomicAction_2012,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(AtomicActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeAction_2013Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.CompositeAction_2013, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(CompositeActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInput_2014Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Input_2014,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(InputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutput_2015Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.Output_2015,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(OutputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionGrounding_3003Text(View view) {
		ActionGrounding domainModelElement = (ActionGrounding) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputMessageMap_3004Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.InputMessageMap_3004, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(InputMessageMapMessagePartEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionGroundingListRest_4006Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ActionGroundingListRest_4006, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputMessageMapParameter_4007Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.InputMessageMapParameter_4007, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionGroundingOwlsProcess_4008Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.ActionGroundingOwlsProcess_4008, view
						.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlanForTask_4009Text(View view) {
		IParser parser = CoordinationParserProvider.getParser(
				CoordinationElementTypes.PlanForTask_4009,
				view.getElement() != null ? view.getElement() : view,
				CoordinationVisualIDRegistry
						.getType(WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlanHasAtomicProcessGroundingList_4010Text(View view) {
		IParser parser = CoordinationParserProvider
				.getParser(
						CoordinationElementTypes.PlanHasAtomicProcessGroundingList_4010,
						view.getElement() != null ? view.getElement() : view,
						CoordinationVisualIDRegistry
								.getType(WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlanDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6010); //$NON-NLS-1$
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
		return PlansCollectionEditPart.MODEL_ID
				.equals(CoordinationVisualIDRegistry.getModelID(view));
	}

}
