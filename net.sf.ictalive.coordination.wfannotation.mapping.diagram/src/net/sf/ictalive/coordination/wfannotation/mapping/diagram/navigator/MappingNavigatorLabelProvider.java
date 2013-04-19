package net.sf.ictalive.coordination.wfannotation.mapping.diagram.navigator;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.*;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingDiagramEditorPlugin;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingParserProvider;
import net.sf.ictalive.owls.process.AnyOrder;
import net.sf.ictalive.owls.process.Choice;
import net.sf.ictalive.owls.process.ControlConstructBag;
import net.sf.ictalive.owls.process.ControlConstructList;
import net.sf.ictalive.owls.process.IfThenElse;
import net.sf.ictalive.owls.process.Perform;
import net.sf.ictalive.owls.process.RepeatUntil;
import net.sf.ictalive.owls.process.RepeatWhile;
import net.sf.ictalive.owls.process.Sequence;
import net.sf.ictalive.owls.process.Split;
import net.sf.ictalive.owls.process.SplitJoin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
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
public class MappingNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MappingDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MappingDiagramEditorPlugin
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
		if (element instanceof MappingNavigatorItem
				&& !isOwnView(((MappingNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MappingNavigatorGroup) {
			MappingNavigatorGroup group = (MappingNavigatorGroup) element;
			return MappingDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof MappingNavigatorItem) {
			MappingNavigatorItem navigatorItem = (MappingNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MappingVisualIDRegistry.getVisualID(view)) {
		case MappingContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ict-alive.sourceforge.net/coordination/wfannotation/mapping?MappingContainer", MappingElementTypes.MappingContainer_1000); //$NON-NLS-1$
		case ProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Process", MappingElementTypes.Process_2002); //$NON-NLS-1$
		case AtomicActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/actions?AtomicAction", MappingElementTypes.AtomicAction_2001); //$NON-NLS-1$
		case CompositeActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/actions?CompositeAction", MappingElementTypes.CompositeAction_2014); //$NON-NLS-1$
		case SequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Sequence", MappingElementTypes.Sequence_2004); //$NON-NLS-1$
		case AnyOrderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?AnyOrder", MappingElementTypes.AnyOrder_2005); //$NON-NLS-1$
		case ControlConstructBagEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?ControlConstructBag", MappingElementTypes.ControlConstructBag_2006); //$NON-NLS-1$
		case PerformEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Perform", MappingElementTypes.Perform_2007); //$NON-NLS-1$
		case ChoiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Choice", MappingElementTypes.Choice_2008); //$NON-NLS-1$
		case ControlConstructListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?ControlConstructList", MappingElementTypes.ControlConstructList_2009); //$NON-NLS-1$
		case RepeatUntilEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?RepeatUntil", MappingElementTypes.RepeatUntil_2010); //$NON-NLS-1$
		case RepeatWhileEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?RepeatWhile", MappingElementTypes.RepeatWhile_2011); //$NON-NLS-1$
		case IfThenElseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?IfThenElse", MappingElementTypes.IfThenElse_2012); //$NON-NLS-1$
		case SplitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?Split", MappingElementTypes.Split_2015); //$NON-NLS-1$
		case SplitJoinEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/process?SplitJoin", MappingElementTypes.SplitJoin_2016); //$NON-NLS-1$
		case AssignEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", MappingElementTypes.Assign_3001); //$NON-NLS-1$
		case CompensateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", MappingElementTypes.Compensate_3002); //$NON-NLS-1$
		case CompensateScopeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", MappingElementTypes.CompensateScope_3003); //$NON-NLS-1$
		case EmptyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", MappingElementTypes.Empty_3004); //$NON-NLS-1$
		case ExitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", MappingElementTypes.Exit_3005); //$NON-NLS-1$
		case ExtensionActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", MappingElementTypes.ExtensionActivity_3006); //$NON-NLS-1$
		case FlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", MappingElementTypes.Flow_3007); //$NON-NLS-1$
		case Assign2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", MappingElementTypes.Assign_3008); //$NON-NLS-1$
		case Compensate2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", MappingElementTypes.Compensate_3009); //$NON-NLS-1$
		case CompensateScope2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", MappingElementTypes.CompensateScope_3010); //$NON-NLS-1$
		case Empty2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", MappingElementTypes.Empty_3011); //$NON-NLS-1$
		case Exit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", MappingElementTypes.Exit_3012); //$NON-NLS-1$
		case ExtensionActivity2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", MappingElementTypes.ExtensionActivity_3013); //$NON-NLS-1$
		case Flow2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", MappingElementTypes.Flow_3014); //$NON-NLS-1$
		case ForEachEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", MappingElementTypes.ForEach_3015); //$NON-NLS-1$
		case Assign3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", MappingElementTypes.Assign_3016); //$NON-NLS-1$
		case Compensate3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", MappingElementTypes.Compensate_3017); //$NON-NLS-1$
		case CompensateScope3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", MappingElementTypes.CompensateScope_3018); //$NON-NLS-1$
		case Empty3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", MappingElementTypes.Empty_3019); //$NON-NLS-1$
		case Exit3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", MappingElementTypes.Exit_3020); //$NON-NLS-1$
		case ExtensionActivity3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", MappingElementTypes.ExtensionActivity_3021); //$NON-NLS-1$
		case ForEach2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", MappingElementTypes.ForEach_3022); //$NON-NLS-1$
		case IfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", MappingElementTypes.If_3023); //$NON-NLS-1$
		case Assign4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", MappingElementTypes.Assign_3024); //$NON-NLS-1$
		case Compensate4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", MappingElementTypes.Compensate_3025); //$NON-NLS-1$
		case CompensateScope4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", MappingElementTypes.CompensateScope_3026); //$NON-NLS-1$
		case Empty4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", MappingElementTypes.Empty_3027); //$NON-NLS-1$
		case Exit4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", MappingElementTypes.Exit_3028); //$NON-NLS-1$
		case ExtensionActivity4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", MappingElementTypes.ExtensionActivity_3029); //$NON-NLS-1$
		case If2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", MappingElementTypes.If_3030); //$NON-NLS-1$
		case ForEach3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", MappingElementTypes.ForEach_3031); //$NON-NLS-1$
		case InvokeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", MappingElementTypes.Invoke_3032); //$NON-NLS-1$
		case OpaqueActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", MappingElementTypes.OpaqueActivity_3033); //$NON-NLS-1$
		case PartnerActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", MappingElementTypes.PartnerActivity_3034); //$NON-NLS-1$
		case PickEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", MappingElementTypes.Pick_3035); //$NON-NLS-1$
		case OnAlarmEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OnAlarm", MappingElementTypes.OnAlarm_3036); //$NON-NLS-1$
		case Assign5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", MappingElementTypes.Assign_3037); //$NON-NLS-1$
		case Compensate5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", MappingElementTypes.Compensate_3038); //$NON-NLS-1$
		case CompensateScope5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", MappingElementTypes.CompensateScope_3039); //$NON-NLS-1$
		case Empty5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", MappingElementTypes.Empty_3040); //$NON-NLS-1$
		case Exit5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", MappingElementTypes.Exit_3041); //$NON-NLS-1$
		case ExtensionActivity5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", MappingElementTypes.ExtensionActivity_3042); //$NON-NLS-1$
		case Flow3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", MappingElementTypes.Flow_3043); //$NON-NLS-1$
		case If3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", MappingElementTypes.If_3044); //$NON-NLS-1$
		case Invoke2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", MappingElementTypes.Invoke_3045); //$NON-NLS-1$
		case OpaqueActivity2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", MappingElementTypes.OpaqueActivity_3046); //$NON-NLS-1$
		case PartnerActivity2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", MappingElementTypes.PartnerActivity_3047); //$NON-NLS-1$
		case Pick2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", MappingElementTypes.Pick_3048); //$NON-NLS-1$
		case OnMessageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OnMessage", MappingElementTypes.OnMessage_3049); //$NON-NLS-1$
		case Assign6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", MappingElementTypes.Assign_3050); //$NON-NLS-1$
		case Compensate6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", MappingElementTypes.Compensate_3051); //$NON-NLS-1$
		case CompensateScope6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", MappingElementTypes.CompensateScope_3052); //$NON-NLS-1$
		case Empty6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", MappingElementTypes.Empty_3053); //$NON-NLS-1$
		case Exit6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", MappingElementTypes.Exit_3054); //$NON-NLS-1$
		case ExtensionActivity6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", MappingElementTypes.ExtensionActivity_3055); //$NON-NLS-1$
		case Flow4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", MappingElementTypes.Flow_3056); //$NON-NLS-1$
		case Invoke3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", MappingElementTypes.Invoke_3057); //$NON-NLS-1$
		case OpaqueActivity3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", MappingElementTypes.OpaqueActivity_3058); //$NON-NLS-1$
		case PartnerActivity3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", MappingElementTypes.PartnerActivity_3059); //$NON-NLS-1$
		case Pick3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", MappingElementTypes.Pick_3060); //$NON-NLS-1$
		case ReceiveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", MappingElementTypes.Receive_3061); //$NON-NLS-1$
		case RepeatUntil2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", MappingElementTypes.RepeatUntil_3062); //$NON-NLS-1$
		case Assign7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", MappingElementTypes.Assign_3063); //$NON-NLS-1$
		case Compensate7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", MappingElementTypes.Compensate_3064); //$NON-NLS-1$
		case CompensateScope7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", MappingElementTypes.CompensateScope_3065); //$NON-NLS-1$
		case Empty7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", MappingElementTypes.Empty_3066); //$NON-NLS-1$
		case Exit7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", MappingElementTypes.Exit_3067); //$NON-NLS-1$
		case ExtensionActivity7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", MappingElementTypes.ExtensionActivity_3068); //$NON-NLS-1$
		case RepeatUntil3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", MappingElementTypes.RepeatUntil_3069); //$NON-NLS-1$
		case ForEach4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", MappingElementTypes.ForEach_3070); //$NON-NLS-1$
		case Receive2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", MappingElementTypes.Receive_3071); //$NON-NLS-1$
		case RepeatUntil4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", MappingElementTypes.RepeatUntil_3072); //$NON-NLS-1$
		case Invoke4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", MappingElementTypes.Invoke_3073); //$NON-NLS-1$
		case OpaqueActivity4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", MappingElementTypes.OpaqueActivity_3074); //$NON-NLS-1$
		case PartnerActivity4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", MappingElementTypes.PartnerActivity_3075); //$NON-NLS-1$
		case Pick4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", MappingElementTypes.Pick_3076); //$NON-NLS-1$
		case Receive3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", MappingElementTypes.Receive_3077); //$NON-NLS-1$
		case ReplyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", MappingElementTypes.Reply_3078); //$NON-NLS-1$
		case RethrowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", MappingElementTypes.Rethrow_3079); //$NON-NLS-1$
		case ScopeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", MappingElementTypes.Scope_3080); //$NON-NLS-1$
		case Assign8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", MappingElementTypes.Assign_3081); //$NON-NLS-1$
		case Compensate8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", MappingElementTypes.Compensate_3082); //$NON-NLS-1$
		case CompensateScope8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", MappingElementTypes.CompensateScope_3083); //$NON-NLS-1$
		case Empty8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", MappingElementTypes.Empty_3084); //$NON-NLS-1$
		case Exit8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", MappingElementTypes.Exit_3085); //$NON-NLS-1$
		case ExtensionActivity8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", MappingElementTypes.ExtensionActivity_3086); //$NON-NLS-1$
		case Scope2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", MappingElementTypes.Scope_3087); //$NON-NLS-1$
		case ForEach5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", MappingElementTypes.ForEach_3088); //$NON-NLS-1$
		case Reply2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", MappingElementTypes.Reply_3089); //$NON-NLS-1$
		case Rethrow2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", MappingElementTypes.Rethrow_3090); //$NON-NLS-1$
		case Scope3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", MappingElementTypes.Scope_3091); //$NON-NLS-1$
		case Invoke5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", MappingElementTypes.Invoke_3092); //$NON-NLS-1$
		case OpaqueActivity5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", MappingElementTypes.OpaqueActivity_3093); //$NON-NLS-1$
		case PartnerActivity5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", MappingElementTypes.PartnerActivity_3094); //$NON-NLS-1$
		case Pick5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", MappingElementTypes.Pick_3095); //$NON-NLS-1$
		case Receive4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", MappingElementTypes.Receive_3096); //$NON-NLS-1$
		case Reply3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", MappingElementTypes.Reply_3097); //$NON-NLS-1$
		case Rethrow3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", MappingElementTypes.Rethrow_3098); //$NON-NLS-1$
		case ThrowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", MappingElementTypes.Throw_3099); //$NON-NLS-1$
		case ValidateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", MappingElementTypes.Validate_3100); //$NON-NLS-1$
		case WaitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", MappingElementTypes.Wait_3101); //$NON-NLS-1$
		case WhileEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", MappingElementTypes.While_3102); //$NON-NLS-1$
		case Assign9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", MappingElementTypes.Assign_3103); //$NON-NLS-1$
		case Compensate9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", MappingElementTypes.Compensate_3104); //$NON-NLS-1$
		case CompensateScope9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", MappingElementTypes.CompensateScope_3105); //$NON-NLS-1$
		case Empty9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", MappingElementTypes.Empty_3106); //$NON-NLS-1$
		case Exit9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", MappingElementTypes.Exit_3107); //$NON-NLS-1$
		case ExtensionActivity9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", MappingElementTypes.ExtensionActivity_3108); //$NON-NLS-1$
		case Flow5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", MappingElementTypes.Flow_3109); //$NON-NLS-1$
		case Reply4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", MappingElementTypes.Reply_3110); //$NON-NLS-1$
		case Rethrow4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", MappingElementTypes.Rethrow_3111); //$NON-NLS-1$
		case Scope4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", MappingElementTypes.Scope_3112); //$NON-NLS-1$
		case EventHandlerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?EventHandler", MappingElementTypes.EventHandler_3113); //$NON-NLS-1$
		case OnAlarm2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OnAlarm", MappingElementTypes.OnAlarm_3114); //$NON-NLS-1$
		case ForEach6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", MappingElementTypes.ForEach_3115); //$NON-NLS-1$
		case Throw2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", MappingElementTypes.Throw_3116); //$NON-NLS-1$
		case Validate2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", MappingElementTypes.Validate_3117); //$NON-NLS-1$
		case Wait2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", MappingElementTypes.Wait_3118); //$NON-NLS-1$
		case While2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", MappingElementTypes.While_3119); //$NON-NLS-1$
		case ForEach7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", MappingElementTypes.ForEach_3120); //$NON-NLS-1$
		case If4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", MappingElementTypes.If_3121); //$NON-NLS-1$
		case Receive5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", MappingElementTypes.Receive_3122); //$NON-NLS-1$
		case RepeatUntil5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", MappingElementTypes.RepeatUntil_3123); //$NON-NLS-1$
		case Throw3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", MappingElementTypes.Throw_3124); //$NON-NLS-1$
		case Validate3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", MappingElementTypes.Validate_3125); //$NON-NLS-1$
		case Wait3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", MappingElementTypes.Wait_3126); //$NON-NLS-1$
		case While3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", MappingElementTypes.While_3127); //$NON-NLS-1$
		case Invoke6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", MappingElementTypes.Invoke_3128); //$NON-NLS-1$
		case OpaqueActivity6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", MappingElementTypes.OpaqueActivity_3129); //$NON-NLS-1$
		case PartnerActivity6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", MappingElementTypes.PartnerActivity_3130); //$NON-NLS-1$
		case Pick6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", MappingElementTypes.Pick_3131); //$NON-NLS-1$
		case Receive6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", MappingElementTypes.Receive_3132); //$NON-NLS-1$
		case RepeatUntil6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", MappingElementTypes.RepeatUntil_3133); //$NON-NLS-1$
		case Reply5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", MappingElementTypes.Reply_3134); //$NON-NLS-1$
		case Rethrow5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", MappingElementTypes.Rethrow_3135); //$NON-NLS-1$
		case Scope5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", MappingElementTypes.Scope_3136); //$NON-NLS-1$
		case Sequence2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", MappingElementTypes.Sequence_3137); //$NON-NLS-1$
		case Assign10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", MappingElementTypes.Assign_3138); //$NON-NLS-1$
		case Compensate10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", MappingElementTypes.Compensate_3139); //$NON-NLS-1$
		case CompensateScope10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", MappingElementTypes.CompensateScope_3140); //$NON-NLS-1$
		case Empty10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", MappingElementTypes.Empty_3141); //$NON-NLS-1$
		case Exit10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", MappingElementTypes.Exit_3142); //$NON-NLS-1$
		case ExtensionActivity10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", MappingElementTypes.ExtensionActivity_3143); //$NON-NLS-1$
		case Flow6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", MappingElementTypes.Flow_3144); //$NON-NLS-1$
		case Throw4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", MappingElementTypes.Throw_3145); //$NON-NLS-1$
		case Validate4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", MappingElementTypes.Validate_3146); //$NON-NLS-1$
		case Wait4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", MappingElementTypes.Wait_3147); //$NON-NLS-1$
		case While4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", MappingElementTypes.While_3148); //$NON-NLS-1$
		case Throw5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", MappingElementTypes.Throw_3149); //$NON-NLS-1$
		case Validate5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", MappingElementTypes.Validate_3150); //$NON-NLS-1$
		case Wait5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", MappingElementTypes.Wait_3151); //$NON-NLS-1$
		case While5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", MappingElementTypes.While_3152); //$NON-NLS-1$
		case ForEach8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", MappingElementTypes.ForEach_3153); //$NON-NLS-1$
		case If5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", MappingElementTypes.If_3154); //$NON-NLS-1$
		case Reply6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", MappingElementTypes.Reply_3155); //$NON-NLS-1$
		case Rethrow6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", MappingElementTypes.Rethrow_3156); //$NON-NLS-1$
		case Scope6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", MappingElementTypes.Scope_3157); //$NON-NLS-1$
		case Throw6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", MappingElementTypes.Throw_3158); //$NON-NLS-1$
		case Validate6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", MappingElementTypes.Validate_3159); //$NON-NLS-1$
		case Wait6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", MappingElementTypes.Wait_3160); //$NON-NLS-1$
		case While6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", MappingElementTypes.While_3161); //$NON-NLS-1$
		case ElseIfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ElseIf", MappingElementTypes.ElseIf_3162); //$NON-NLS-1$
		case Assign11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", MappingElementTypes.Assign_3163); //$NON-NLS-1$
		case Compensate11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", MappingElementTypes.Compensate_3164); //$NON-NLS-1$
		case CompensateScope11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", MappingElementTypes.CompensateScope_3165); //$NON-NLS-1$
		case Empty11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", MappingElementTypes.Empty_3166); //$NON-NLS-1$
		case Exit11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", MappingElementTypes.Exit_3167); //$NON-NLS-1$
		case ExtensionActivity11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", MappingElementTypes.ExtensionActivity_3168); //$NON-NLS-1$
		case Flow7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", MappingElementTypes.Flow_3169); //$NON-NLS-1$
		case ForEach9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", MappingElementTypes.ForEach_3170); //$NON-NLS-1$
		case If6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", MappingElementTypes.If_3171); //$NON-NLS-1$
		case ElseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Else", MappingElementTypes.Else_3172); //$NON-NLS-1$
		case Assign12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", MappingElementTypes.Assign_3173); //$NON-NLS-1$
		case Compensate12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", MappingElementTypes.Compensate_3174); //$NON-NLS-1$
		case CompensateScope12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", MappingElementTypes.CompensateScope_3175); //$NON-NLS-1$
		case Empty12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", MappingElementTypes.Empty_3176); //$NON-NLS-1$
		case Exit12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", MappingElementTypes.Exit_3177); //$NON-NLS-1$
		case ExtensionActivity12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", MappingElementTypes.ExtensionActivity_3178); //$NON-NLS-1$
		case Flow8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", MappingElementTypes.Flow_3179); //$NON-NLS-1$
		case ForEach10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", MappingElementTypes.ForEach_3180); //$NON-NLS-1$
		case If7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", MappingElementTypes.If_3181); //$NON-NLS-1$
		case Invoke7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", MappingElementTypes.Invoke_3182); //$NON-NLS-1$
		case OpaqueActivity7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", MappingElementTypes.OpaqueActivity_3183); //$NON-NLS-1$
		case PartnerActivity7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", MappingElementTypes.PartnerActivity_3184); //$NON-NLS-1$
		case Pick7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", MappingElementTypes.Pick_3185); //$NON-NLS-1$
		case Receive7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", MappingElementTypes.Receive_3186); //$NON-NLS-1$
		case RepeatUntil7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", MappingElementTypes.RepeatUntil_3187); //$NON-NLS-1$
		case Reply7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", MappingElementTypes.Reply_3188); //$NON-NLS-1$
		case Rethrow7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", MappingElementTypes.Rethrow_3189); //$NON-NLS-1$
		case Scope7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", MappingElementTypes.Scope_3190); //$NON-NLS-1$
		case Sequence3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", MappingElementTypes.Sequence_3191); //$NON-NLS-1$
		case Invoke8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", MappingElementTypes.Invoke_3192); //$NON-NLS-1$
		case OpaqueActivity8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", MappingElementTypes.OpaqueActivity_3193); //$NON-NLS-1$
		case PartnerActivity8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", MappingElementTypes.PartnerActivity_3194); //$NON-NLS-1$
		case Pick8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", MappingElementTypes.Pick_3195); //$NON-NLS-1$
		case Receive8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", MappingElementTypes.Receive_3196); //$NON-NLS-1$
		case RepeatUntil8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", MappingElementTypes.RepeatUntil_3197); //$NON-NLS-1$
		case Reply8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", MappingElementTypes.Reply_3198); //$NON-NLS-1$
		case Rethrow8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", MappingElementTypes.Rethrow_3199); //$NON-NLS-1$
		case Scope8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", MappingElementTypes.Scope_3200); //$NON-NLS-1$
		case Sequence4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", MappingElementTypes.Sequence_3201); //$NON-NLS-1$
		case Throw7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", MappingElementTypes.Throw_3202); //$NON-NLS-1$
		case Validate7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", MappingElementTypes.Validate_3203); //$NON-NLS-1$
		case Wait7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", MappingElementTypes.Wait_3204); //$NON-NLS-1$
		case While7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", MappingElementTypes.While_3205); //$NON-NLS-1$
		case Throw8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", MappingElementTypes.Throw_3206); //$NON-NLS-1$
		case Validate8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", MappingElementTypes.Validate_3207); //$NON-NLS-1$
		case Wait8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", MappingElementTypes.Wait_3208); //$NON-NLS-1$
		case While8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", MappingElementTypes.While_3209); //$NON-NLS-1$
		case Invoke9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", MappingElementTypes.Invoke_3210); //$NON-NLS-1$
		case OpaqueActivity9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", MappingElementTypes.OpaqueActivity_3211); //$NON-NLS-1$
		case PartnerActivity9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", MappingElementTypes.PartnerActivity_3212); //$NON-NLS-1$
		case Pick9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", MappingElementTypes.Pick_3213); //$NON-NLS-1$
		case Receive9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", MappingElementTypes.Receive_3214); //$NON-NLS-1$
		case RepeatUntil9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", MappingElementTypes.RepeatUntil_3215); //$NON-NLS-1$
		case Reply9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", MappingElementTypes.Reply_3216); //$NON-NLS-1$
		case Rethrow9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", MappingElementTypes.Rethrow_3217); //$NON-NLS-1$
		case Scope9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", MappingElementTypes.Scope_3218); //$NON-NLS-1$
		case Sequence5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", MappingElementTypes.Sequence_3219); //$NON-NLS-1$
		case Throw9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", MappingElementTypes.Throw_3220); //$NON-NLS-1$
		case Validate9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", MappingElementTypes.Validate_3221); //$NON-NLS-1$
		case Wait9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", MappingElementTypes.Wait_3222); //$NON-NLS-1$
		case While9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", MappingElementTypes.While_3223); //$NON-NLS-1$
		case If8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", MappingElementTypes.If_3224); //$NON-NLS-1$
		case Invoke10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", MappingElementTypes.Invoke_3225); //$NON-NLS-1$
		case OpaqueActivity10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", MappingElementTypes.OpaqueActivity_3226); //$NON-NLS-1$
		case PartnerActivity10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", MappingElementTypes.PartnerActivity_3227); //$NON-NLS-1$
		case Pick10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", MappingElementTypes.Pick_3228); //$NON-NLS-1$
		case Receive10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", MappingElementTypes.Receive_3229); //$NON-NLS-1$
		case RepeatUntil10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", MappingElementTypes.RepeatUntil_3230); //$NON-NLS-1$
		case Reply10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", MappingElementTypes.Reply_3231); //$NON-NLS-1$
		case Rethrow10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", MappingElementTypes.Rethrow_3232); //$NON-NLS-1$
		case Scope10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", MappingElementTypes.Scope_3233); //$NON-NLS-1$
		case Sequence6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", MappingElementTypes.Sequence_3234); //$NON-NLS-1$
		case Throw10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", MappingElementTypes.Throw_3235); //$NON-NLS-1$
		case Validate10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", MappingElementTypes.Validate_3236); //$NON-NLS-1$
		case Wait10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", MappingElementTypes.Wait_3237); //$NON-NLS-1$
		case While10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", MappingElementTypes.While_3238); //$NON-NLS-1$
		case OnEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OnEvent", MappingElementTypes.OnEvent_3239); //$NON-NLS-1$
		case Assign13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", MappingElementTypes.Assign_3240); //$NON-NLS-1$
		case Compensate13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", MappingElementTypes.Compensate_3241); //$NON-NLS-1$
		case CompensateScope13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", MappingElementTypes.CompensateScope_3242); //$NON-NLS-1$
		case Empty13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", MappingElementTypes.Empty_3243); //$NON-NLS-1$
		case Exit13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", MappingElementTypes.Exit_3244); //$NON-NLS-1$
		case ExtensionActivity13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", MappingElementTypes.ExtensionActivity_3245); //$NON-NLS-1$
		case Flow9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", MappingElementTypes.Flow_3246); //$NON-NLS-1$
		case ForEach11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", MappingElementTypes.ForEach_3247); //$NON-NLS-1$
		case If9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", MappingElementTypes.If_3248); //$NON-NLS-1$
		case Invoke11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", MappingElementTypes.Invoke_3249); //$NON-NLS-1$
		case OpaqueActivity11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", MappingElementTypes.OpaqueActivity_3250); //$NON-NLS-1$
		case PartnerActivity11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", MappingElementTypes.PartnerActivity_3251); //$NON-NLS-1$
		case Pick11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", MappingElementTypes.Pick_3252); //$NON-NLS-1$
		case Receive11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", MappingElementTypes.Receive_3253); //$NON-NLS-1$
		case RepeatUntil11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", MappingElementTypes.RepeatUntil_3254); //$NON-NLS-1$
		case Reply11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", MappingElementTypes.Reply_3255); //$NON-NLS-1$
		case Rethrow11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", MappingElementTypes.Rethrow_3256); //$NON-NLS-1$
		case Scope11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", MappingElementTypes.Scope_3257); //$NON-NLS-1$
		case Sequence7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", MappingElementTypes.Sequence_3258); //$NON-NLS-1$
		case Throw11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", MappingElementTypes.Throw_3259); //$NON-NLS-1$
		case Validate11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", MappingElementTypes.Validate_3260); //$NON-NLS-1$
		case Wait11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", MappingElementTypes.Wait_3261); //$NON-NLS-1$
		case While11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", MappingElementTypes.While_3262); //$NON-NLS-1$
		case ForEach12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", MappingElementTypes.ForEach_3263); //$NON-NLS-1$
		case If10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", MappingElementTypes.If_3264); //$NON-NLS-1$
		case Invoke12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", MappingElementTypes.Invoke_3265); //$NON-NLS-1$
		case OpaqueActivity12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", MappingElementTypes.OpaqueActivity_3266); //$NON-NLS-1$
		case PartnerActivity12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", MappingElementTypes.PartnerActivity_3267); //$NON-NLS-1$
		case Pick12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", MappingElementTypes.Pick_3268); //$NON-NLS-1$
		case Receive12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", MappingElementTypes.Receive_3269); //$NON-NLS-1$
		case RepeatUntil12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", MappingElementTypes.RepeatUntil_3270); //$NON-NLS-1$
		case Reply12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", MappingElementTypes.Reply_3271); //$NON-NLS-1$
		case Rethrow12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", MappingElementTypes.Rethrow_3272); //$NON-NLS-1$
		case Scope12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", MappingElementTypes.Scope_3273); //$NON-NLS-1$
		case Sequence8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", MappingElementTypes.Sequence_3274); //$NON-NLS-1$
		case Throw12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", MappingElementTypes.Throw_3275); //$NON-NLS-1$
		case Validate12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", MappingElementTypes.Validate_3276); //$NON-NLS-1$
		case Wait12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", MappingElementTypes.Wait_3277); //$NON-NLS-1$
		case While12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", MappingElementTypes.While_3278); //$NON-NLS-1$
		case ForEach13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", MappingElementTypes.ForEach_3279); //$NON-NLS-1$
		case If11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", MappingElementTypes.If_3280); //$NON-NLS-1$
		case Invoke13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", MappingElementTypes.Invoke_3281); //$NON-NLS-1$
		case OpaqueActivity13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", MappingElementTypes.OpaqueActivity_3282); //$NON-NLS-1$
		case PartnerActivity13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", MappingElementTypes.PartnerActivity_3283); //$NON-NLS-1$
		case Pick13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", MappingElementTypes.Pick_3284); //$NON-NLS-1$
		case Receive13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", MappingElementTypes.Receive_3285); //$NON-NLS-1$
		case RepeatUntil13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", MappingElementTypes.RepeatUntil_3286); //$NON-NLS-1$
		case Reply13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", MappingElementTypes.Reply_3287); //$NON-NLS-1$
		case Rethrow13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", MappingElementTypes.Rethrow_3288); //$NON-NLS-1$
		case Scope13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", MappingElementTypes.Scope_3289); //$NON-NLS-1$
		case Sequence9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", MappingElementTypes.Sequence_3290); //$NON-NLS-1$
		case Throw13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", MappingElementTypes.Throw_3291); //$NON-NLS-1$
		case Validate13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", MappingElementTypes.Validate_3292); //$NON-NLS-1$
		case Wait13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", MappingElementTypes.Wait_3293); //$NON-NLS-1$
		case While13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", MappingElementTypes.While_3294); //$NON-NLS-1$
		case EventHandler2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?EventHandler", MappingElementTypes.EventHandler_3295); //$NON-NLS-1$
		case PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/wfannotation/mapping?PartnerActivityToAtomicActionMapping", MappingElementTypes.PartnerActivityToAtomicActionMapping_4001); //$NON-NLS-1$
		case ProcessToCompositeActionMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/wfannotation/mapping?ProcessToCompositeActionMapping", MappingElementTypes.ProcessToCompositeActionMapping_4002); //$NON-NLS-1$
		case SequenceToSequenceMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/wfannotation/mapping?SequenceToSequenceMapping", MappingElementTypes.SequenceToSequenceMapping_4016); //$NON-NLS-1$
		case IfToIfThenElseMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/wfannotation/mapping?IfToIfThenElseMapping", MappingElementTypes.IfToIfThenElseMapping_4017); //$NON-NLS-1$
		case WhileToRepeatWhileMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/wfannotation/mapping?WhileToRepeatWhileMapping", MappingElementTypes.WhileToRepeatWhileMapping_4018); //$NON-NLS-1$
		case RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/wfannotation/mapping?RepeatUntilToRepeatUntilMapping", MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019); //$NON-NLS-1$
		case FlowToSplitJoinMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/wfannotation/mapping?FlowToSplitJoinMapping", MappingElementTypes.FlowToSplitJoinMapping_4020); //$NON-NLS-1$
		case ForToRepeatWhileMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/wfannotation/mapping?ForToRepeatWhileMapping", MappingElementTypes.ForToRepeatWhileMapping_4021); //$NON-NLS-1$
		case ScopeToCompositeActionMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/wfannotation/mapping?ScopeToCompositeActionMapping", MappingElementTypes.ScopeToCompositeActionMapping_4022); //$NON-NLS-1$
		case ElseIfToIfThenElseMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/wfannotation/mapping?ElseIfToIfThenElseMapping", MappingElementTypes.ElseIfToIfThenElseMapping_4023); //$NON-NLS-1$
		case ElseToElseMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/wfannotation/mapping?ElseToElseMapping", MappingElementTypes.ElseToElseMapping_4024); //$NON-NLS-1$
		case CompositeProcessComposedOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?CompositeProcess?composedOf", MappingElementTypes.CompositeProcessComposedOf_4003); //$NON-NLS-1$
		case PerformProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Perform?process", MappingElementTypes.PerformProcess_4004); //$NON-NLS-1$
		case ChoiceComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Choice?components", MappingElementTypes.ChoiceComponents_4005); //$NON-NLS-1$
		case AnyOrderComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?AnyOrder?components", MappingElementTypes.AnyOrderComponents_4006); //$NON-NLS-1$
		case SequenceComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Sequence?components", MappingElementTypes.SequenceComponents_4007); //$NON-NLS-1$
		case ControlConstructBagRestEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?ControlConstructBag?rest", MappingElementTypes.ControlConstructBagRest_4008); //$NON-NLS-1$
		case ControlConstructListRestEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?ControlConstructList?rest", MappingElementTypes.ControlConstructListRest_4009); //$NON-NLS-1$
		case IfThenElseThenEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?IfThenElse?then", MappingElementTypes.IfThenElseThen_4010); //$NON-NLS-1$
		case IfThenElseElseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?IfThenElse?else", MappingElementTypes.IfThenElseElse_4011); //$NON-NLS-1$
		case RepeatUntilUntilProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?RepeatUntil?untilProcess", MappingElementTypes.RepeatUntilUntilProcess_4012); //$NON-NLS-1$
		case RepeatWhileWhileProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?RepeatWhile?whileProcess", MappingElementTypes.RepeatWhileWhileProcess_4013); //$NON-NLS-1$
		case ControlConstructBagFirstEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?ControlConstructBag?first", MappingElementTypes.ControlConstructBagFirst_4014); //$NON-NLS-1$
		case ControlConstructListFirstEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?ControlConstructList?first", MappingElementTypes.ControlConstructListFirst_4015); //$NON-NLS-1$
		case SplitComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?Split?components", MappingElementTypes.SplitComponents_4025); //$NON-NLS-1$
		case SplitJoinComponentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/owls/process?SplitJoin?components", MappingElementTypes.SplitJoinComponents_4026); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MappingDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MappingElementTypes.isKnownElementType(elementType)) {
			image = MappingElementTypes.getImage(elementType);
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
		if (element instanceof MappingNavigatorGroup) {
			MappingNavigatorGroup group = (MappingNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MappingNavigatorItem) {
			MappingNavigatorItem navigatorItem = (MappingNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
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
		switch (MappingVisualIDRegistry.getVisualID(view)) {
		case MappingContainerEditPart.VISUAL_ID:
			return getMappingContainer_1000Text(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_2002Text(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2001Text(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2014Text(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2004Text(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2005Text(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_2006Text(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2007Text(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2008Text(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_2009Text(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2010Text(view);
		case RepeatWhileEditPart.VISUAL_ID:
			return getRepeatWhile_2011Text(view);
		case IfThenElseEditPart.VISUAL_ID:
			return getIfThenElse_2012Text(view);
		case SplitEditPart.VISUAL_ID:
			return getSplit_2015Text(view);
		case SplitJoinEditPart.VISUAL_ID:
			return getSplitJoin_2016Text(view);
		case AssignEditPart.VISUAL_ID:
			return getAssign_3001Text(view);
		case CompensateEditPart.VISUAL_ID:
			return getCompensate_3002Text(view);
		case CompensateScopeEditPart.VISUAL_ID:
			return getCompensateScope_3003Text(view);
		case EmptyEditPart.VISUAL_ID:
			return getEmpty_3004Text(view);
		case ExitEditPart.VISUAL_ID:
			return getExit_3005Text(view);
		case ExtensionActivityEditPart.VISUAL_ID:
			return getExtensionActivity_3006Text(view);
		case FlowEditPart.VISUAL_ID:
			return getFlow_3007Text(view);
		case Assign2EditPart.VISUAL_ID:
			return getAssign_3008Text(view);
		case Compensate2EditPart.VISUAL_ID:
			return getCompensate_3009Text(view);
		case CompensateScope2EditPart.VISUAL_ID:
			return getCompensateScope_3010Text(view);
		case Empty2EditPart.VISUAL_ID:
			return getEmpty_3011Text(view);
		case Exit2EditPart.VISUAL_ID:
			return getExit_3012Text(view);
		case ExtensionActivity2EditPart.VISUAL_ID:
			return getExtensionActivity_3013Text(view);
		case Flow2EditPart.VISUAL_ID:
			return getFlow_3014Text(view);
		case ForEachEditPart.VISUAL_ID:
			return getForEach_3015Text(view);
		case Assign3EditPart.VISUAL_ID:
			return getAssign_3016Text(view);
		case Compensate3EditPart.VISUAL_ID:
			return getCompensate_3017Text(view);
		case CompensateScope3EditPart.VISUAL_ID:
			return getCompensateScope_3018Text(view);
		case Empty3EditPart.VISUAL_ID:
			return getEmpty_3019Text(view);
		case Exit3EditPart.VISUAL_ID:
			return getExit_3020Text(view);
		case ExtensionActivity3EditPart.VISUAL_ID:
			return getExtensionActivity_3021Text(view);
		case ForEach2EditPart.VISUAL_ID:
			return getForEach_3022Text(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3023Text(view);
		case Assign4EditPart.VISUAL_ID:
			return getAssign_3024Text(view);
		case Compensate4EditPart.VISUAL_ID:
			return getCompensate_3025Text(view);
		case CompensateScope4EditPart.VISUAL_ID:
			return getCompensateScope_3026Text(view);
		case Empty4EditPart.VISUAL_ID:
			return getEmpty_3027Text(view);
		case Exit4EditPart.VISUAL_ID:
			return getExit_3028Text(view);
		case ExtensionActivity4EditPart.VISUAL_ID:
			return getExtensionActivity_3029Text(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3030Text(view);
		case ForEach3EditPart.VISUAL_ID:
			return getForEach_3031Text(view);
		case InvokeEditPart.VISUAL_ID:
			return getInvoke_3032Text(view);
		case OpaqueActivityEditPart.VISUAL_ID:
			return getOpaqueActivity_3033Text(view);
		case PartnerActivityEditPart.VISUAL_ID:
			return getPartnerActivity_3034Text(view);
		case PickEditPart.VISUAL_ID:
			return getPick_3035Text(view);
		case OnAlarmEditPart.VISUAL_ID:
			return getOnAlarm_3036Text(view);
		case Assign5EditPart.VISUAL_ID:
			return getAssign_3037Text(view);
		case Compensate5EditPart.VISUAL_ID:
			return getCompensate_3038Text(view);
		case CompensateScope5EditPart.VISUAL_ID:
			return getCompensateScope_3039Text(view);
		case Empty5EditPart.VISUAL_ID:
			return getEmpty_3040Text(view);
		case Exit5EditPart.VISUAL_ID:
			return getExit_3041Text(view);
		case ExtensionActivity5EditPart.VISUAL_ID:
			return getExtensionActivity_3042Text(view);
		case Flow3EditPart.VISUAL_ID:
			return getFlow_3043Text(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3044Text(view);
		case Invoke2EditPart.VISUAL_ID:
			return getInvoke_3045Text(view);
		case OpaqueActivity2EditPart.VISUAL_ID:
			return getOpaqueActivity_3046Text(view);
		case PartnerActivity2EditPart.VISUAL_ID:
			return getPartnerActivity_3047Text(view);
		case Pick2EditPart.VISUAL_ID:
			return getPick_3048Text(view);
		case OnMessageEditPart.VISUAL_ID:
			return getOnMessage_3049Text(view);
		case Assign6EditPart.VISUAL_ID:
			return getAssign_3050Text(view);
		case Compensate6EditPart.VISUAL_ID:
			return getCompensate_3051Text(view);
		case CompensateScope6EditPart.VISUAL_ID:
			return getCompensateScope_3052Text(view);
		case Empty6EditPart.VISUAL_ID:
			return getEmpty_3053Text(view);
		case Exit6EditPart.VISUAL_ID:
			return getExit_3054Text(view);
		case ExtensionActivity6EditPart.VISUAL_ID:
			return getExtensionActivity_3055Text(view);
		case Flow4EditPart.VISUAL_ID:
			return getFlow_3056Text(view);
		case Invoke3EditPart.VISUAL_ID:
			return getInvoke_3057Text(view);
		case OpaqueActivity3EditPart.VISUAL_ID:
			return getOpaqueActivity_3058Text(view);
		case PartnerActivity3EditPart.VISUAL_ID:
			return getPartnerActivity_3059Text(view);
		case Pick3EditPart.VISUAL_ID:
			return getPick_3060Text(view);
		case ReceiveEditPart.VISUAL_ID:
			return getReceive_3061Text(view);
		case RepeatUntil2EditPart.VISUAL_ID:
			return getRepeatUntil_3062Text(view);
		case Assign7EditPart.VISUAL_ID:
			return getAssign_3063Text(view);
		case Compensate7EditPart.VISUAL_ID:
			return getCompensate_3064Text(view);
		case CompensateScope7EditPart.VISUAL_ID:
			return getCompensateScope_3065Text(view);
		case Empty7EditPart.VISUAL_ID:
			return getEmpty_3066Text(view);
		case Exit7EditPart.VISUAL_ID:
			return getExit_3067Text(view);
		case ExtensionActivity7EditPart.VISUAL_ID:
			return getExtensionActivity_3068Text(view);
		case RepeatUntil3EditPart.VISUAL_ID:
			return getRepeatUntil_3069Text(view);
		case ForEach4EditPart.VISUAL_ID:
			return getForEach_3070Text(view);
		case Receive2EditPart.VISUAL_ID:
			return getReceive_3071Text(view);
		case RepeatUntil4EditPart.VISUAL_ID:
			return getRepeatUntil_3072Text(view);
		case Invoke4EditPart.VISUAL_ID:
			return getInvoke_3073Text(view);
		case OpaqueActivity4EditPart.VISUAL_ID:
			return getOpaqueActivity_3074Text(view);
		case PartnerActivity4EditPart.VISUAL_ID:
			return getPartnerActivity_3075Text(view);
		case Pick4EditPart.VISUAL_ID:
			return getPick_3076Text(view);
		case Receive3EditPart.VISUAL_ID:
			return getReceive_3077Text(view);
		case ReplyEditPart.VISUAL_ID:
			return getReply_3078Text(view);
		case RethrowEditPart.VISUAL_ID:
			return getRethrow_3079Text(view);
		case ScopeEditPart.VISUAL_ID:
			return getScope_3080Text(view);
		case Assign8EditPart.VISUAL_ID:
			return getAssign_3081Text(view);
		case Compensate8EditPart.VISUAL_ID:
			return getCompensate_3082Text(view);
		case CompensateScope8EditPart.VISUAL_ID:
			return getCompensateScope_3083Text(view);
		case Empty8EditPart.VISUAL_ID:
			return getEmpty_3084Text(view);
		case Exit8EditPart.VISUAL_ID:
			return getExit_3085Text(view);
		case ExtensionActivity8EditPart.VISUAL_ID:
			return getExtensionActivity_3086Text(view);
		case Scope2EditPart.VISUAL_ID:
			return getScope_3087Text(view);
		case ForEach5EditPart.VISUAL_ID:
			return getForEach_3088Text(view);
		case Reply2EditPart.VISUAL_ID:
			return getReply_3089Text(view);
		case Rethrow2EditPart.VISUAL_ID:
			return getRethrow_3090Text(view);
		case Scope3EditPart.VISUAL_ID:
			return getScope_3091Text(view);
		case Invoke5EditPart.VISUAL_ID:
			return getInvoke_3092Text(view);
		case OpaqueActivity5EditPart.VISUAL_ID:
			return getOpaqueActivity_3093Text(view);
		case PartnerActivity5EditPart.VISUAL_ID:
			return getPartnerActivity_3094Text(view);
		case Pick5EditPart.VISUAL_ID:
			return getPick_3095Text(view);
		case Receive4EditPart.VISUAL_ID:
			return getReceive_3096Text(view);
		case Reply3EditPart.VISUAL_ID:
			return getReply_3097Text(view);
		case Rethrow3EditPart.VISUAL_ID:
			return getRethrow_3098Text(view);
		case ThrowEditPart.VISUAL_ID:
			return getThrow_3099Text(view);
		case ValidateEditPart.VISUAL_ID:
			return getValidate_3100Text(view);
		case WaitEditPart.VISUAL_ID:
			return getWait_3101Text(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3102Text(view);
		case Assign9EditPart.VISUAL_ID:
			return getAssign_3103Text(view);
		case Compensate9EditPart.VISUAL_ID:
			return getCompensate_3104Text(view);
		case CompensateScope9EditPart.VISUAL_ID:
			return getCompensateScope_3105Text(view);
		case Empty9EditPart.VISUAL_ID:
			return getEmpty_3106Text(view);
		case Exit9EditPart.VISUAL_ID:
			return getExit_3107Text(view);
		case ExtensionActivity9EditPart.VISUAL_ID:
			return getExtensionActivity_3108Text(view);
		case Flow5EditPart.VISUAL_ID:
			return getFlow_3109Text(view);
		case Reply4EditPart.VISUAL_ID:
			return getReply_3110Text(view);
		case Rethrow4EditPart.VISUAL_ID:
			return getRethrow_3111Text(view);
		case Scope4EditPart.VISUAL_ID:
			return getScope_3112Text(view);
		case EventHandlerEditPart.VISUAL_ID:
			return getEventHandler_3113Text(view);
		case OnAlarm2EditPart.VISUAL_ID:
			return getOnAlarm_3114Text(view);
		case ForEach6EditPart.VISUAL_ID:
			return getForEach_3115Text(view);
		case Throw2EditPart.VISUAL_ID:
			return getThrow_3116Text(view);
		case Validate2EditPart.VISUAL_ID:
			return getValidate_3117Text(view);
		case Wait2EditPart.VISUAL_ID:
			return getWait_3118Text(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3119Text(view);
		case ForEach7EditPart.VISUAL_ID:
			return getForEach_3120Text(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3121Text(view);
		case Receive5EditPart.VISUAL_ID:
			return getReceive_3122Text(view);
		case RepeatUntil5EditPart.VISUAL_ID:
			return getRepeatUntil_3123Text(view);
		case Throw3EditPart.VISUAL_ID:
			return getThrow_3124Text(view);
		case Validate3EditPart.VISUAL_ID:
			return getValidate_3125Text(view);
		case Wait3EditPart.VISUAL_ID:
			return getWait_3126Text(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3127Text(view);
		case Invoke6EditPart.VISUAL_ID:
			return getInvoke_3128Text(view);
		case OpaqueActivity6EditPart.VISUAL_ID:
			return getOpaqueActivity_3129Text(view);
		case PartnerActivity6EditPart.VISUAL_ID:
			return getPartnerActivity_3130Text(view);
		case Pick6EditPart.VISUAL_ID:
			return getPick_3131Text(view);
		case Receive6EditPart.VISUAL_ID:
			return getReceive_3132Text(view);
		case RepeatUntil6EditPart.VISUAL_ID:
			return getRepeatUntil_3133Text(view);
		case Reply5EditPart.VISUAL_ID:
			return getReply_3134Text(view);
		case Rethrow5EditPart.VISUAL_ID:
			return getRethrow_3135Text(view);
		case Scope5EditPart.VISUAL_ID:
			return getScope_3136Text(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3137Text(view);
		case Assign10EditPart.VISUAL_ID:
			return getAssign_3138Text(view);
		case Compensate10EditPart.VISUAL_ID:
			return getCompensate_3139Text(view);
		case CompensateScope10EditPart.VISUAL_ID:
			return getCompensateScope_3140Text(view);
		case Empty10EditPart.VISUAL_ID:
			return getEmpty_3141Text(view);
		case Exit10EditPart.VISUAL_ID:
			return getExit_3142Text(view);
		case ExtensionActivity10EditPart.VISUAL_ID:
			return getExtensionActivity_3143Text(view);
		case Flow6EditPart.VISUAL_ID:
			return getFlow_3144Text(view);
		case Throw4EditPart.VISUAL_ID:
			return getThrow_3145Text(view);
		case Validate4EditPart.VISUAL_ID:
			return getValidate_3146Text(view);
		case Wait4EditPart.VISUAL_ID:
			return getWait_3147Text(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3148Text(view);
		case Throw5EditPart.VISUAL_ID:
			return getThrow_3149Text(view);
		case Validate5EditPart.VISUAL_ID:
			return getValidate_3150Text(view);
		case Wait5EditPart.VISUAL_ID:
			return getWait_3151Text(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3152Text(view);
		case ForEach8EditPart.VISUAL_ID:
			return getForEach_3153Text(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3154Text(view);
		case Reply6EditPart.VISUAL_ID:
			return getReply_3155Text(view);
		case Rethrow6EditPart.VISUAL_ID:
			return getRethrow_3156Text(view);
		case Scope6EditPart.VISUAL_ID:
			return getScope_3157Text(view);
		case Throw6EditPart.VISUAL_ID:
			return getThrow_3158Text(view);
		case Validate6EditPart.VISUAL_ID:
			return getValidate_3159Text(view);
		case Wait6EditPart.VISUAL_ID:
			return getWait_3160Text(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3161Text(view);
		case ElseIfEditPart.VISUAL_ID:
			return getElseIf_3162Text(view);
		case Assign11EditPart.VISUAL_ID:
			return getAssign_3163Text(view);
		case Compensate11EditPart.VISUAL_ID:
			return getCompensate_3164Text(view);
		case CompensateScope11EditPart.VISUAL_ID:
			return getCompensateScope_3165Text(view);
		case Empty11EditPart.VISUAL_ID:
			return getEmpty_3166Text(view);
		case Exit11EditPart.VISUAL_ID:
			return getExit_3167Text(view);
		case ExtensionActivity11EditPart.VISUAL_ID:
			return getExtensionActivity_3168Text(view);
		case Flow7EditPart.VISUAL_ID:
			return getFlow_3169Text(view);
		case ForEach9EditPart.VISUAL_ID:
			return getForEach_3170Text(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3171Text(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_3172Text(view);
		case Assign12EditPart.VISUAL_ID:
			return getAssign_3173Text(view);
		case Compensate12EditPart.VISUAL_ID:
			return getCompensate_3174Text(view);
		case CompensateScope12EditPart.VISUAL_ID:
			return getCompensateScope_3175Text(view);
		case Empty12EditPart.VISUAL_ID:
			return getEmpty_3176Text(view);
		case Exit12EditPart.VISUAL_ID:
			return getExit_3177Text(view);
		case ExtensionActivity12EditPart.VISUAL_ID:
			return getExtensionActivity_3178Text(view);
		case Flow8EditPart.VISUAL_ID:
			return getFlow_3179Text(view);
		case ForEach10EditPart.VISUAL_ID:
			return getForEach_3180Text(view);
		case If7EditPart.VISUAL_ID:
			return getIf_3181Text(view);
		case Invoke7EditPart.VISUAL_ID:
			return getInvoke_3182Text(view);
		case OpaqueActivity7EditPart.VISUAL_ID:
			return getOpaqueActivity_3183Text(view);
		case PartnerActivity7EditPart.VISUAL_ID:
			return getPartnerActivity_3184Text(view);
		case Pick7EditPart.VISUAL_ID:
			return getPick_3185Text(view);
		case Receive7EditPart.VISUAL_ID:
			return getReceive_3186Text(view);
		case RepeatUntil7EditPart.VISUAL_ID:
			return getRepeatUntil_3187Text(view);
		case Reply7EditPart.VISUAL_ID:
			return getReply_3188Text(view);
		case Rethrow7EditPart.VISUAL_ID:
			return getRethrow_3189Text(view);
		case Scope7EditPart.VISUAL_ID:
			return getScope_3190Text(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3191Text(view);
		case Invoke8EditPart.VISUAL_ID:
			return getInvoke_3192Text(view);
		case OpaqueActivity8EditPart.VISUAL_ID:
			return getOpaqueActivity_3193Text(view);
		case PartnerActivity8EditPart.VISUAL_ID:
			return getPartnerActivity_3194Text(view);
		case Pick8EditPart.VISUAL_ID:
			return getPick_3195Text(view);
		case Receive8EditPart.VISUAL_ID:
			return getReceive_3196Text(view);
		case RepeatUntil8EditPart.VISUAL_ID:
			return getRepeatUntil_3197Text(view);
		case Reply8EditPart.VISUAL_ID:
			return getReply_3198Text(view);
		case Rethrow8EditPart.VISUAL_ID:
			return getRethrow_3199Text(view);
		case Scope8EditPart.VISUAL_ID:
			return getScope_3200Text(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3201Text(view);
		case Throw7EditPart.VISUAL_ID:
			return getThrow_3202Text(view);
		case Validate7EditPart.VISUAL_ID:
			return getValidate_3203Text(view);
		case Wait7EditPart.VISUAL_ID:
			return getWait_3204Text(view);
		case While7EditPart.VISUAL_ID:
			return getWhile_3205Text(view);
		case Throw8EditPart.VISUAL_ID:
			return getThrow_3206Text(view);
		case Validate8EditPart.VISUAL_ID:
			return getValidate_3207Text(view);
		case Wait8EditPart.VISUAL_ID:
			return getWait_3208Text(view);
		case While8EditPart.VISUAL_ID:
			return getWhile_3209Text(view);
		case Invoke9EditPart.VISUAL_ID:
			return getInvoke_3210Text(view);
		case OpaqueActivity9EditPart.VISUAL_ID:
			return getOpaqueActivity_3211Text(view);
		case PartnerActivity9EditPart.VISUAL_ID:
			return getPartnerActivity_3212Text(view);
		case Pick9EditPart.VISUAL_ID:
			return getPick_3213Text(view);
		case Receive9EditPart.VISUAL_ID:
			return getReceive_3214Text(view);
		case RepeatUntil9EditPart.VISUAL_ID:
			return getRepeatUntil_3215Text(view);
		case Reply9EditPart.VISUAL_ID:
			return getReply_3216Text(view);
		case Rethrow9EditPart.VISUAL_ID:
			return getRethrow_3217Text(view);
		case Scope9EditPart.VISUAL_ID:
			return getScope_3218Text(view);
		case Sequence5EditPart.VISUAL_ID:
			return getSequence_3219Text(view);
		case Throw9EditPart.VISUAL_ID:
			return getThrow_3220Text(view);
		case Validate9EditPart.VISUAL_ID:
			return getValidate_3221Text(view);
		case Wait9EditPart.VISUAL_ID:
			return getWait_3222Text(view);
		case While9EditPart.VISUAL_ID:
			return getWhile_3223Text(view);
		case If8EditPart.VISUAL_ID:
			return getIf_3224Text(view);
		case Invoke10EditPart.VISUAL_ID:
			return getInvoke_3225Text(view);
		case OpaqueActivity10EditPart.VISUAL_ID:
			return getOpaqueActivity_3226Text(view);
		case PartnerActivity10EditPart.VISUAL_ID:
			return getPartnerActivity_3227Text(view);
		case Pick10EditPart.VISUAL_ID:
			return getPick_3228Text(view);
		case Receive10EditPart.VISUAL_ID:
			return getReceive_3229Text(view);
		case RepeatUntil10EditPart.VISUAL_ID:
			return getRepeatUntil_3230Text(view);
		case Reply10EditPart.VISUAL_ID:
			return getReply_3231Text(view);
		case Rethrow10EditPart.VISUAL_ID:
			return getRethrow_3232Text(view);
		case Scope10EditPart.VISUAL_ID:
			return getScope_3233Text(view);
		case Sequence6EditPart.VISUAL_ID:
			return getSequence_3234Text(view);
		case Throw10EditPart.VISUAL_ID:
			return getThrow_3235Text(view);
		case Validate10EditPart.VISUAL_ID:
			return getValidate_3236Text(view);
		case Wait10EditPart.VISUAL_ID:
			return getWait_3237Text(view);
		case While10EditPart.VISUAL_ID:
			return getWhile_3238Text(view);
		case OnEventEditPart.VISUAL_ID:
			return getOnEvent_3239Text(view);
		case Assign13EditPart.VISUAL_ID:
			return getAssign_3240Text(view);
		case Compensate13EditPart.VISUAL_ID:
			return getCompensate_3241Text(view);
		case CompensateScope13EditPart.VISUAL_ID:
			return getCompensateScope_3242Text(view);
		case Empty13EditPart.VISUAL_ID:
			return getEmpty_3243Text(view);
		case Exit13EditPart.VISUAL_ID:
			return getExit_3244Text(view);
		case ExtensionActivity13EditPart.VISUAL_ID:
			return getExtensionActivity_3245Text(view);
		case Flow9EditPart.VISUAL_ID:
			return getFlow_3246Text(view);
		case ForEach11EditPart.VISUAL_ID:
			return getForEach_3247Text(view);
		case If9EditPart.VISUAL_ID:
			return getIf_3248Text(view);
		case Invoke11EditPart.VISUAL_ID:
			return getInvoke_3249Text(view);
		case OpaqueActivity11EditPart.VISUAL_ID:
			return getOpaqueActivity_3250Text(view);
		case PartnerActivity11EditPart.VISUAL_ID:
			return getPartnerActivity_3251Text(view);
		case Pick11EditPart.VISUAL_ID:
			return getPick_3252Text(view);
		case Receive11EditPart.VISUAL_ID:
			return getReceive_3253Text(view);
		case RepeatUntil11EditPart.VISUAL_ID:
			return getRepeatUntil_3254Text(view);
		case Reply11EditPart.VISUAL_ID:
			return getReply_3255Text(view);
		case Rethrow11EditPart.VISUAL_ID:
			return getRethrow_3256Text(view);
		case Scope11EditPart.VISUAL_ID:
			return getScope_3257Text(view);
		case Sequence7EditPart.VISUAL_ID:
			return getSequence_3258Text(view);
		case Throw11EditPart.VISUAL_ID:
			return getThrow_3259Text(view);
		case Validate11EditPart.VISUAL_ID:
			return getValidate_3260Text(view);
		case Wait11EditPart.VISUAL_ID:
			return getWait_3261Text(view);
		case While11EditPart.VISUAL_ID:
			return getWhile_3262Text(view);
		case ForEach12EditPart.VISUAL_ID:
			return getForEach_3263Text(view);
		case If10EditPart.VISUAL_ID:
			return getIf_3264Text(view);
		case Invoke12EditPart.VISUAL_ID:
			return getInvoke_3265Text(view);
		case OpaqueActivity12EditPart.VISUAL_ID:
			return getOpaqueActivity_3266Text(view);
		case PartnerActivity12EditPart.VISUAL_ID:
			return getPartnerActivity_3267Text(view);
		case Pick12EditPart.VISUAL_ID:
			return getPick_3268Text(view);
		case Receive12EditPart.VISUAL_ID:
			return getReceive_3269Text(view);
		case RepeatUntil12EditPart.VISUAL_ID:
			return getRepeatUntil_3270Text(view);
		case Reply12EditPart.VISUAL_ID:
			return getReply_3271Text(view);
		case Rethrow12EditPart.VISUAL_ID:
			return getRethrow_3272Text(view);
		case Scope12EditPart.VISUAL_ID:
			return getScope_3273Text(view);
		case Sequence8EditPart.VISUAL_ID:
			return getSequence_3274Text(view);
		case Throw12EditPart.VISUAL_ID:
			return getThrow_3275Text(view);
		case Validate12EditPart.VISUAL_ID:
			return getValidate_3276Text(view);
		case Wait12EditPart.VISUAL_ID:
			return getWait_3277Text(view);
		case While12EditPart.VISUAL_ID:
			return getWhile_3278Text(view);
		case ForEach13EditPart.VISUAL_ID:
			return getForEach_3279Text(view);
		case If11EditPart.VISUAL_ID:
			return getIf_3280Text(view);
		case Invoke13EditPart.VISUAL_ID:
			return getInvoke_3281Text(view);
		case OpaqueActivity13EditPart.VISUAL_ID:
			return getOpaqueActivity_3282Text(view);
		case PartnerActivity13EditPart.VISUAL_ID:
			return getPartnerActivity_3283Text(view);
		case Pick13EditPart.VISUAL_ID:
			return getPick_3284Text(view);
		case Receive13EditPart.VISUAL_ID:
			return getReceive_3285Text(view);
		case RepeatUntil13EditPart.VISUAL_ID:
			return getRepeatUntil_3286Text(view);
		case Reply13EditPart.VISUAL_ID:
			return getReply_3287Text(view);
		case Rethrow13EditPart.VISUAL_ID:
			return getRethrow_3288Text(view);
		case Scope13EditPart.VISUAL_ID:
			return getScope_3289Text(view);
		case Sequence9EditPart.VISUAL_ID:
			return getSequence_3290Text(view);
		case Throw13EditPart.VISUAL_ID:
			return getThrow_3291Text(view);
		case Validate13EditPart.VISUAL_ID:
			return getValidate_3292Text(view);
		case Wait13EditPart.VISUAL_ID:
			return getWait_3293Text(view);
		case While13EditPart.VISUAL_ID:
			return getWhile_3294Text(view);
		case EventHandler2EditPart.VISUAL_ID:
			return getEventHandler_3295Text(view);
		case PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID:
			return getPartnerActivityToAtomicActionMapping_4001Text(view);
		case ProcessToCompositeActionMappingEditPart.VISUAL_ID:
			return getProcessToCompositeActionMapping_4002Text(view);
		case SequenceToSequenceMappingEditPart.VISUAL_ID:
			return getSequenceToSequenceMapping_4016Text(view);
		case IfToIfThenElseMappingEditPart.VISUAL_ID:
			return getIfToIfThenElseMapping_4017Text(view);
		case WhileToRepeatWhileMappingEditPart.VISUAL_ID:
			return getWhileToRepeatWhileMapping_4018Text(view);
		case RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID:
			return getRepeatUntilToRepeatUntilMapping_4019Text(view);
		case FlowToSplitJoinMappingEditPart.VISUAL_ID:
			return getFlowToSplitJoinMapping_4020Text(view);
		case ForToRepeatWhileMappingEditPart.VISUAL_ID:
			return getForToRepeatWhileMapping_4021Text(view);
		case ScopeToCompositeActionMappingEditPart.VISUAL_ID:
			return getScopeToCompositeActionMapping_4022Text(view);
		case ElseIfToIfThenElseMappingEditPart.VISUAL_ID:
			return getElseIfToIfThenElseMapping_4023Text(view);
		case ElseToElseMappingEditPart.VISUAL_ID:
			return getElseToElseMapping_4024Text(view);
		case CompositeProcessComposedOfEditPart.VISUAL_ID:
			return getCompositeProcessComposedOf_4003Text(view);
		case PerformProcessEditPart.VISUAL_ID:
			return getPerformProcess_4004Text(view);
		case ChoiceComponentsEditPart.VISUAL_ID:
			return getChoiceComponents_4005Text(view);
		case AnyOrderComponentsEditPart.VISUAL_ID:
			return getAnyOrderComponents_4006Text(view);
		case SequenceComponentsEditPart.VISUAL_ID:
			return getSequenceComponents_4007Text(view);
		case ControlConstructBagRestEditPart.VISUAL_ID:
			return getControlConstructBagRest_4008Text(view);
		case ControlConstructListRestEditPart.VISUAL_ID:
			return getControlConstructListRest_4009Text(view);
		case IfThenElseThenEditPart.VISUAL_ID:
			return getIfThenElseThen_4010Text(view);
		case IfThenElseElseEditPart.VISUAL_ID:
			return getIfThenElseElse_4011Text(view);
		case RepeatUntilUntilProcessEditPart.VISUAL_ID:
			return getRepeatUntilUntilProcess_4012Text(view);
		case RepeatWhileWhileProcessEditPart.VISUAL_ID:
			return getRepeatWhileWhileProcess_4013Text(view);
		case ControlConstructBagFirstEditPart.VISUAL_ID:
			return getControlConstructBagFirst_4014Text(view);
		case ControlConstructListFirstEditPart.VISUAL_ID:
			return getControlConstructListFirst_4015Text(view);
		case SplitComponentsEditPart.VISUAL_ID:
			return getSplitComponents_4025Text(view);
		case SplitJoinComponentsEditPart.VISUAL_ID:
			return getSplitJoinComponents_4026Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMappingContainer_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProcess_2002Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Process_2002,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ProcessNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5296); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicAction_2001Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.AtomicAction_2001,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(AtomicActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5297); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeAction_2014Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompositeAction_2014,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompositeActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5302); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_2004Text(View view) {
		Sequence domainModelElement = (Sequence) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOrder_2005Text(View view) {
		AnyOrder domainModelElement = (AnyOrder) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBag_2006Text(View view) {
		ControlConstructBag domainModelElement = (ControlConstructBag) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerform_2007Text(View view) {
		Perform domainModelElement = (Perform) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoice_2008Text(View view) {
		Choice domainModelElement = (Choice) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructList_2009Text(View view) {
		ControlConstructList domainModelElement = (ControlConstructList) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_2010Text(View view) {
		RepeatUntil domainModelElement = (RepeatUntil) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatWhile_2011Text(View view) {
		RepeatWhile domainModelElement = (RepeatWhile) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElse_2012Text(View view) {
		IfThenElse domainModelElement = (IfThenElse) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplit_2015Text(View view) {
		Split domainModelElement = (Split) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplitJoin_2016Text(View view) {
		SplitJoin domainModelElement = (SplitJoin) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3001Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Assign_3001,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(AssignNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3002Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Compensate_3002,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3003Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompensateScope_3003,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateScopeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3004Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Empty_3004,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(EmptyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3005Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Exit_3005, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(ExitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3006Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ExtensionActivity_3006,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ExtensionActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3007Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Flow_3007, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(FlowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5278); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3008Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Assign_3008,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(AssignName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3009Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Compensate_3009,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3010Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompensateScope_3010,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateScopeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3011Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Empty_3011,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(EmptyName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3012Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Exit_3012, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(ExitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3013Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ExtensionActivity_3013,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ExtensionActivityName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3014Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Flow_3014, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(FlowName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5277); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3015Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ForEach_3015,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ForEachNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5276); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3016Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Assign_3016,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(AssignName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3017Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Compensate_3017,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3018Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompensateScope_3018,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateScopeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3019Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Empty_3019,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(EmptyName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3020Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Exit_3020, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(ExitName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3021Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ExtensionActivity_3021,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ExtensionActivityName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3022Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.ForEach_3022,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ForEachName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5275); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3023Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.If_3023, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(IfNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5274); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3024Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Assign_3024,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(AssignName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3025Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Compensate_3025,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3026Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompensateScope_3026,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateScopeName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3027Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Empty_3027,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(EmptyName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3028Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Exit_3028, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(ExitName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3029Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ExtensionActivity_3029,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ExtensionActivityName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3030Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.If_3030, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(IfName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5273); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3031Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.ForEach_3031,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ForEachName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5272); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3032Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Invoke_3032,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(InvokeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3033Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OpaqueActivity_3033,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(OpaqueActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3034Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PartnerActivity_3034,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(PartnerActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3035Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Pick_3035, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(PickNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5271); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOnAlarm_3036Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OnAlarm_3036,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5270); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3037Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Assign_3037,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(AssignName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3038Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Compensate_3038,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3039Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompensateScope_3039,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateScopeName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3040Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Empty_3040,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(EmptyName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3041Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Exit_3041, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(ExitName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3042Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ExtensionActivity_3042,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ExtensionActivityName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3043Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Flow_3043, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(FlowName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5269); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3044Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.If_3044, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(IfName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5268); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3045Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Invoke_3045,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(InvokeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3046Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OpaqueActivity_3046,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(OpaqueActivityName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3047Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PartnerActivity_3047,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(PartnerActivityName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3048Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Pick_3048, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(PickName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5267); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOnMessage_3049Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OnMessage_3049,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5266); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3050Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Assign_3050,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(AssignName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3051Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Compensate_3051,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3052Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompensateScope_3052,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateScopeName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3053Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Empty_3053,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(EmptyName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3054Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Exit_3054, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(ExitName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3055Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ExtensionActivity_3055,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ExtensionActivityName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3056Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Flow_3056, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(FlowName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5249); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3057Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Invoke_3057,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(InvokeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3058Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OpaqueActivity_3058,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(OpaqueActivityName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3059Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PartnerActivity_3059,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(PartnerActivityName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3060Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Pick_3060, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(PickName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3061Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Receive_3061,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReceiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3062Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatUntil_3062,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RepeatUntilNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5248); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3063Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Assign_3063,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(AssignName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3064Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Compensate_3064,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3065Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompensateScope_3065,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateScopeName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3066Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Empty_3066,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(EmptyName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3067Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Exit_3067, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(ExitName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3068Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ExtensionActivity_3068,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ExtensionActivityName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3069Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatUntil_3069,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RepeatUntilName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5247); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3070Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.ForEach_3070,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ForEachName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5246); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3071Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Receive_3071,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ReceiveName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3072Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatUntil_3072,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RepeatUntilName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5245); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3073Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Invoke_3073,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(InvokeName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3074Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OpaqueActivity_3074,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(OpaqueActivityName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3075Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PartnerActivity_3075,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(PartnerActivityName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3076Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Pick_3076, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(PickName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3077Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Receive_3077,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ReceiveName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3078Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Reply_3078,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReplyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3079Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Rethrow_3079,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(RethrowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3080Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Scope_3080,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ScopeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5244); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3081Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Assign_3081,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(AssignName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3082Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Compensate_3082,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3083Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompensateScope_3083,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateScopeName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3084Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Empty_3084,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(EmptyName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3085Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Exit_3085, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(ExitName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3086Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ExtensionActivity_3086,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ExtensionActivityName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3087Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Scope_3087,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ScopeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5243); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3088Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.ForEach_3088,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ForEachName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5242); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3089Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Reply_3089,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReplyName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3090Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Rethrow_3090,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(RethrowName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3091Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Scope_3091,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ScopeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5241); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3092Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Invoke_3092,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(InvokeName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3093Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OpaqueActivity_3093,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(OpaqueActivityName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3094Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PartnerActivity_3094,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(PartnerActivityName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3095Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Pick_3095, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(PickName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3096Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Receive_3096,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ReceiveName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3097Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Reply_3097,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReplyName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3098Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Rethrow_3098,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(RethrowName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3099Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Throw_3099,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ThrowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5077); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3100Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Validate_3100,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ValidateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3101Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Wait_3101, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WaitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5079); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3102Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.While_3102,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(WhileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5240); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3103Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Assign_3103,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(AssignName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5080); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3104Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Compensate_3104,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5081); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3105Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompensateScope_3105,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateScopeName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5082); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3106Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Empty_3106,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(EmptyName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5083); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3107Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Exit_3107, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(ExitName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5084); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3108Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ExtensionActivity_3108,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ExtensionActivityName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5085); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3109Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Flow_3109, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(FlowName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5239); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3110Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Reply_3110,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReplyName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5086); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3111Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Rethrow_3111,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(RethrowName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5087); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3112Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Scope_3112,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ScopeName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5238); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventHandler_3113Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.EventHandler_3113,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5237); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOnAlarm_3114Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OnAlarm_3114,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5212); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3115Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.ForEach_3115,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ForEachName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5196); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3116Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Throw_3116,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ThrowName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5088); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3117Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Validate_3117,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ValidateName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5089); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3118Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Wait_3118, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WaitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5090); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3119Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.While_3119,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(WhileName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5195); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3120Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.ForEach_3120,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ForEachName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5091); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3121Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.If_3121, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(IfName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5194); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3122Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Receive_3122,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ReceiveName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5092); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3123Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatUntil_3123,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RepeatUntilName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5193); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3124Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Throw_3124,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ThrowName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5093); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3125Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Validate_3125,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ValidateName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5094); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3126Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Wait_3126, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WaitName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5095); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3127Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.While_3127,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(WhileName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5192); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3128Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Invoke_3128,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(InvokeName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5096); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3129Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OpaqueActivity_3129,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(OpaqueActivityName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5097); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3130Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PartnerActivity_3130,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(PartnerActivityName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5098); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3131Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Pick_3131, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(PickName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5099); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3132Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Receive_3132,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ReceiveName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5100); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3133Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatUntil_3133,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RepeatUntilName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5101); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3134Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Reply_3134,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReplyName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5102); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3135Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Rethrow_3135,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(RethrowName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5103); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3136Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Scope_3136,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ScopeName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5104); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3137Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Sequence_3137,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(SequenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5191); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3138Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Assign_3138,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(AssignName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5105); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3139Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Compensate_3139,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5106); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3140Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompensateScope_3140,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateScopeName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5107); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3141Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Empty_3141,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(EmptyName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5108); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3142Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Exit_3142, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(ExitName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5109); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3143Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ExtensionActivity_3143,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ExtensionActivityName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5110); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3144Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Flow_3144, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(FlowName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5119); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3145Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Throw_3145,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ThrowName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5111); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3146Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Validate_3146,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ValidateName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5112); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3147Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Wait_3147, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WaitName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5113); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3148Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.While_3148,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(WhileName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5118); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3149Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Throw_3149,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ThrowName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5114); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3150Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Validate_3150,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ValidateName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5115); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3151Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Wait_3151, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WaitName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5116); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3152Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.While_3152,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(WhileName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5117); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3153Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.ForEach_3153,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ForEachName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5120); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3154Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.If_3154, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(IfName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5190); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3155Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Reply_3155,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReplyName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5121); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3156Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Rethrow_3156,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(RethrowName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5122); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3157Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Scope_3157,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ScopeName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5123); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3158Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Throw_3158,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ThrowName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5124); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3159Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Validate_3159,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ValidateName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5125); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3160Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Wait_3160, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WaitName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5126); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3161Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.While_3161,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(WhileName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5127); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getElseIf_3162Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ElseIf_3162,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5189); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3163Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Assign_3163,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(AssignName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5128); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3164Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Compensate_3164,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5129); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3165Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompensateScope_3165,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateScopeName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5130); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3166Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Empty_3166,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(EmptyName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5131); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3167Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Exit_3167, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(ExitName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5132); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3168Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ExtensionActivity_3168,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ExtensionActivityName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5133); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3169Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Flow_3169, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(FlowName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5134); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3170Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.ForEach_3170,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ForEachName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5135); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3171Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.If_3171, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(IfName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5174); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getElse_3172Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Else_3172, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WrappingLabel6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5173); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3173Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Assign_3173,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(AssignName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5136); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3174Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Compensate_3174,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5137); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3175Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompensateScope_3175,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateScopeName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5138); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3176Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Empty_3176,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(EmptyName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5139); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3177Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Exit_3177, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(ExitName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5140); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3178Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ExtensionActivity_3178,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ExtensionActivityName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5141); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3179Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Flow_3179, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(FlowName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5142); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3180Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ForEach_3180,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ForEachName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5143); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3181Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.If_3181, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(IfName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5144); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3182Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Invoke_3182,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(InvokeName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5145); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3183Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OpaqueActivity_3183,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(OpaqueActivityName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5146); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3184Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PartnerActivity_3184,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(PartnerActivityName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5147); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3185Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Pick_3185, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(PickName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5148); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3186Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Receive_3186,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ReceiveName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5149); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3187Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatUntil_3187,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RepeatUntilName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5150); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3188Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Reply_3188,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReplyName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5151); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3189Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Rethrow_3189,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(RethrowName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5152); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3190Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Scope_3190,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ScopeName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5153); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3191Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Sequence_3191,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(SequenceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5168); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3192Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Invoke_3192,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(InvokeName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5154); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3193Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OpaqueActivity_3193,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(OpaqueActivityName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5155); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3194Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PartnerActivity_3194,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(PartnerActivityName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5156); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3195Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Pick_3195, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(PickName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5157); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3196Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Receive_3196,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ReceiveName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5158); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3197Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatUntil_3197,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RepeatUntilName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5159); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3198Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Reply_3198,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReplyName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5160); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3199Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Rethrow_3199,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(RethrowName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5161); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3200Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Scope_3200,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ScopeName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5162); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3201Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Sequence_3201,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(SequenceName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5167); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3202Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Throw_3202,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ThrowName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5163); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3203Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Validate_3203,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ValidateName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5164); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3204Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Wait_3204, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WaitName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5165); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3205Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.While_3205,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(WhileName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5166); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3206Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Throw_3206,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ThrowName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5169); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3207Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Validate_3207,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ValidateName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5170); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3208Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Wait_3208, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WaitName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5171); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3209Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.While_3209,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(WhileName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5172); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3210Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Invoke_3210,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(InvokeName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5175); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3211Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OpaqueActivity_3211,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(OpaqueActivityName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5176); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3212Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PartnerActivity_3212,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(PartnerActivityName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5177); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3213Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Pick_3213, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(PickName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5178); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3214Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Receive_3214,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(ReceiveName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5179); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3215Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatUntil_3215,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RepeatUntilName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5180); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3216Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Reply_3216,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReplyName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5181); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3217Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Rethrow_3217,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(RethrowName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5182); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3218Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Scope_3218,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ScopeName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5183); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3219Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Sequence_3219,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(SequenceName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5184); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3220Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Throw_3220,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ThrowName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5185); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3221Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Validate_3221,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ValidateName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5186); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3222Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Wait_3222, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WaitName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5187); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3223Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.While_3223,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(WhileName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5188); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3224Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.If_3224, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(IfName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5197); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3225Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Invoke_3225,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(InvokeName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5198); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3226Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OpaqueActivity_3226,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(OpaqueActivityName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5199); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3227Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PartnerActivity_3227,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(PartnerActivityName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5200); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3228Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Pick_3228, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(PickName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5201); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3229Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Receive_3229,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ReceiveName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5202); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3230Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatUntil_3230,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RepeatUntilName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5203); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3231Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Reply_3231,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReplyName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5204); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3232Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Rethrow_3232,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RethrowName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5205); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3233Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Scope_3233,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ScopeName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5206); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3234Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Sequence_3234,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(SequenceName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5207); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3235Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Throw_3235,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ThrowName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5208); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3236Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Validate_3236,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ValidateName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5209); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3237Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Wait_3237, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WaitName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5210); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3238Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.While_3238,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(WhileName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5211); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOnEvent_3239Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OnEvent_3239,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(WrappingLabel7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5236); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3240Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Assign_3240,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(AssignName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5213); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3241Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Compensate_3241,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5214); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3242Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompensateScope_3242,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(CompensateScopeName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5215); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3243Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Empty_3243,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(EmptyName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5216); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3244Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Exit_3244, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(ExitName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5217); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3245Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ExtensionActivity_3245,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ExtensionActivityName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5218); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3246Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Flow_3246, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(FlowName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5219); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3247Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ForEach_3247,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ForEachName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5220); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3248Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.If_3248, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(IfName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5221); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3249Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Invoke_3249,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(InvokeName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5222); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3250Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OpaqueActivity_3250,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(OpaqueActivityName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5223); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3251Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PartnerActivity_3251,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(PartnerActivityName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5224); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3252Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Pick_3252, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(PickName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5225); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3253Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Receive_3253,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ReceiveName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5226); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3254Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatUntil_3254,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RepeatUntilName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5227); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3255Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Reply_3255,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReplyName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5228); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3256Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Rethrow_3256,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RethrowName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5229); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3257Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Scope_3257,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ScopeName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5230); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3258Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Sequence_3258,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(SequenceName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5231); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3259Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Throw_3259,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ThrowName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5232); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3260Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Validate_3260,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ValidateName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5233); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3261Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Wait_3261, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WaitName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5234); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3262Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.While_3262,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(WhileName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5235); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3263Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ForEach_3263,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ForEachName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5250); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3264Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.If_3264, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(IfName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5251); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3265Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Invoke_3265,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(InvokeName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5252); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3266Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OpaqueActivity_3266,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(OpaqueActivityName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5253); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3267Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PartnerActivity_3267,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(PartnerActivityName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5254); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3268Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Pick_3268, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(PickName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5255); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3269Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Receive_3269,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ReceiveName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5256); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3270Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatUntil_3270,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RepeatUntilName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5257); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3271Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Reply_3271,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReplyName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5258); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3272Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Rethrow_3272,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RethrowName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5259); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3273Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Scope_3273,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ScopeName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5260); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3274Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Sequence_3274,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(SequenceName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5261); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3275Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Throw_3275,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ThrowName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5262); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3276Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Validate_3276,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ValidateName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5263); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3277Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Wait_3277, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WaitName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5264); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3278Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.While_3278,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(WhileName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5265); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3279Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ForEach_3279,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ForEachName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5279); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3280Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.If_3280, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(IfName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5280); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3281Text(View view) {
		IParser parser = MappingParserProvider
				.getParser(MappingElementTypes.Invoke_3281,
						view.getElement() != null ? view.getElement() : view,
						MappingVisualIDRegistry
								.getType(InvokeName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5281); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3282Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.OpaqueActivity_3282,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(OpaqueActivityName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5282); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3283Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PartnerActivity_3283,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(PartnerActivityName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5283); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3284Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Pick_3284, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(PickName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5284); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3285Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Receive_3285,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ReceiveName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5285); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3286Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatUntil_3286,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RepeatUntilName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5286); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3287Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Reply_3287,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ReplyName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5287); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3288Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Rethrow_3288,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(RethrowName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5288); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3289Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Scope_3289,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ScopeName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5289); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3290Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Sequence_3290,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(SequenceName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5290); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3291Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Throw_3291,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(ThrowName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5291); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3292Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Validate_3292,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(ValidateName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5292); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3293Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.Wait_3293, view.getElement() != null ? view
						.getElement() : view, MappingVisualIDRegistry
						.getType(WaitName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5293); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3294Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.While_3294,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry.getType(WhileName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5294); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventHandler_3295Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.EventHandler_3295,
				view.getElement() != null ? view.getElement() : view,
				MappingVisualIDRegistry
						.getType(WrappingLabel8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5295); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivityToAtomicActionMapping_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProcessToCompositeActionMapping_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSequenceToSequenceMapping_4016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIfToIfThenElseMapping_4017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWhileToRepeatWhileMapping_4018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRepeatUntilToRepeatUntilMapping_4019Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFlowToSplitJoinMapping_4020Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getForToRepeatWhileMapping_4021Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getScopeToCompositeActionMapping_4022Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getElseIfToIfThenElseMapping_4023Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getElseToElseMapping_4024Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositeProcessComposedOf_4003Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.CompositeProcessComposedOf_4003, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPerformProcess_4004Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.PerformProcess_4004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoiceComponents_4005Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ChoiceComponents_4005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOrderComponents_4006Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.AnyOrderComponents_4006,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequenceComponents_4007Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.SequenceComponents_4007,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBagRest_4008Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ControlConstructBagRest_4008, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructListRest_4009Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ControlConstructListRest_4009, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElseThen_4010Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.IfThenElseThen_4010,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfThenElseElse_4011Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.IfThenElseElse_4011,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntilUntilProcess_4012Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatUntilUntilProcess_4012, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatWhileWhileProcess_4013Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.RepeatWhileWhileProcess_4013, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructBagFirst_4014Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ControlConstructBagFirst_4014, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlConstructListFirst_4015Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.ControlConstructListFirst_4015, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplitComponents_4025Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.SplitComponents_4025,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSplitJoinComponents_4026Text(View view) {
		IParser parser = MappingParserProvider.getParser(
				MappingElementTypes.SplitJoinComponents_4026,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MappingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6015); //$NON-NLS-1$
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
		return MappingContainerEditPart.MODEL_ID.equals(MappingVisualIDRegistry
				.getModelID(view));
	}

}
