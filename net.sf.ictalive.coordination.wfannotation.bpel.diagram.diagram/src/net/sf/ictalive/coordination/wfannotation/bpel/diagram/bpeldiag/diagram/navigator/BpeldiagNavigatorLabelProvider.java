package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.navigator;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.*;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagDiagramEditorPlugin;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagVisualIDRegistry;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagParserProvider;

import org.eclipse.core.runtime.IAdaptable;
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
public class BpeldiagNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		BpeldiagDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		BpeldiagDiagramEditorPlugin
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
		if (element instanceof BpeldiagNavigatorItem
				&& !isOwnView(((BpeldiagNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof BpeldiagNavigatorGroup) {
			BpeldiagNavigatorGroup group = (BpeldiagNavigatorGroup) element;
			return BpeldiagDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof BpeldiagNavigatorItem) {
			BpeldiagNavigatorItem navigatorItem = (BpeldiagNavigatorItem) element;
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
		switch (BpeldiagVisualIDRegistry.getVisualID(view)) {
		case ProcessContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ict-alive.sourceforge.net/coordination/wfannotation/bpeldiag?ProcessContainer", BpeldiagElementTypes.ProcessContainer_1000); //$NON-NLS-1$
		case ProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Process", BpeldiagElementTypes.Process_2001); //$NON-NLS-1$
		case AssignEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_2002); //$NON-NLS-1$
		case CompensateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_2003); //$NON-NLS-1$
		case CompensateScopeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_2004); //$NON-NLS-1$
		case EmptyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_2005); //$NON-NLS-1$
		case ExitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_2006); //$NON-NLS-1$
		case ExtensionActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_2007); //$NON-NLS-1$
		case FlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", BpeldiagElementTypes.Flow_2008); //$NON-NLS-1$
		case ForEachEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_2009); //$NON-NLS-1$
		case IfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", BpeldiagElementTypes.If_2010); //$NON-NLS-1$
		case InvokeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_2011); //$NON-NLS-1$
		case OpaqueActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_2012); //$NON-NLS-1$
		case PickEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_2014); //$NON-NLS-1$
		case ReceiveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_2015); //$NON-NLS-1$
		case RepeatUntilEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", BpeldiagElementTypes.RepeatUntil_2016); //$NON-NLS-1$
		case ReplyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_2017); //$NON-NLS-1$
		case RethrowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_2018); //$NON-NLS-1$
		case ScopeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_2019); //$NON-NLS-1$
		case SequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", BpeldiagElementTypes.Sequence_2020); //$NON-NLS-1$
		case ThrowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_2021); //$NON-NLS-1$
		case ValidateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_2022); //$NON-NLS-1$
		case WaitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_2023); //$NON-NLS-1$
		case WhileEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_2024); //$NON-NLS-1$
		case PartnerActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_2013); //$NON-NLS-1$
		case ElseIfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ElseIf", BpeldiagElementTypes.ElseIf_2025); //$NON-NLS-1$
		case ElseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Else", BpeldiagElementTypes.Else_2026); //$NON-NLS-1$
		case OnAlarmEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OnAlarm", BpeldiagElementTypes.OnAlarm_2027); //$NON-NLS-1$
		case OnEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OnEvent", BpeldiagElementTypes.OnEvent_2028); //$NON-NLS-1$
		case OnMessageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OnMessage", BpeldiagElementTypes.OnMessage_2029); //$NON-NLS-1$
		case EventHandlerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://docs.oasis-open.org/wsbpel/2.0/process/executable?EventHandler", BpeldiagElementTypes.EventHandler_2030); //$NON-NLS-1$
		case OperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.eclipse.org/wsdl/2003/WSDL?Operation", BpeldiagElementTypes.Operation_2031); //$NON-NLS-1$
		case Assign2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_3001); //$NON-NLS-1$
		case Compensate2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_3004); //$NON-NLS-1$
		case CompensateScope2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_3005); //$NON-NLS-1$
		case Empty2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_3006); //$NON-NLS-1$
		case Exit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_3007); //$NON-NLS-1$
		case ExtensionActivity2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_3008); //$NON-NLS-1$
		case Flow2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", BpeldiagElementTypes.Flow_3009); //$NON-NLS-1$
		case Assign3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_3055); //$NON-NLS-1$
		case Compensate3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_3056); //$NON-NLS-1$
		case CompensateScope3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_3057); //$NON-NLS-1$
		case Empty3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_3058); //$NON-NLS-1$
		case Exit3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_3059); //$NON-NLS-1$
		case ExtensionActivity3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_3060); //$NON-NLS-1$
		case Flow3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", BpeldiagElementTypes.Flow_3061); //$NON-NLS-1$
		case ForEach2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_3062); //$NON-NLS-1$
		case Assign4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_3077); //$NON-NLS-1$
		case Compensate4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_3078); //$NON-NLS-1$
		case CompensateScope4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_3079); //$NON-NLS-1$
		case Empty4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_3080); //$NON-NLS-1$
		case Exit4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_3081); //$NON-NLS-1$
		case ExtensionActivity4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_3082); //$NON-NLS-1$
		case ForEach3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_3083); //$NON-NLS-1$
		case If2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", BpeldiagElementTypes.If_3084); //$NON-NLS-1$
		case Assign5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_3098); //$NON-NLS-1$
		case Compensate5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_3099); //$NON-NLS-1$
		case CompensateScope5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_3100); //$NON-NLS-1$
		case Empty5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_3101); //$NON-NLS-1$
		case Exit5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_3102); //$NON-NLS-1$
		case ExtensionActivity5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_3103); //$NON-NLS-1$
		case If3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", BpeldiagElementTypes.If_3104); //$NON-NLS-1$
		case ForEach4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_3105); //$NON-NLS-1$
		case Invoke2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_3085); //$NON-NLS-1$
		case OpaqueActivity2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_3086); //$NON-NLS-1$
		case PartnerActivity2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_3087); //$NON-NLS-1$
		case Pick2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_3088); //$NON-NLS-1$
		case OnAlarm2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OnAlarm", BpeldiagElementTypes.OnAlarm_3227); //$NON-NLS-1$
		case Assign6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_3228); //$NON-NLS-1$
		case Compensate6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_3229); //$NON-NLS-1$
		case CompensateScope6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_3230); //$NON-NLS-1$
		case Empty6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_3231); //$NON-NLS-1$
		case Exit6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_3232); //$NON-NLS-1$
		case ExtensionActivity6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_3233); //$NON-NLS-1$
		case Flow4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", BpeldiagElementTypes.Flow_3234); //$NON-NLS-1$
		case If4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", BpeldiagElementTypes.If_3063); //$NON-NLS-1$
		case Invoke3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_3163); //$NON-NLS-1$
		case OpaqueActivity3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_3164); //$NON-NLS-1$
		case PartnerActivity3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_3165); //$NON-NLS-1$
		case Pick3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_3166); //$NON-NLS-1$
		case OnMessage2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OnMessage", BpeldiagElementTypes.OnMessage_3235); //$NON-NLS-1$
		case Assign7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_3236); //$NON-NLS-1$
		case Compensate7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_3237); //$NON-NLS-1$
		case CompensateScope7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_3238); //$NON-NLS-1$
		case Empty7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_3239); //$NON-NLS-1$
		case Exit7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_3240); //$NON-NLS-1$
		case ExtensionActivity7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_3241); //$NON-NLS-1$
		case Flow5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", BpeldiagElementTypes.Flow_3242); //$NON-NLS-1$
		case Invoke4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_3064); //$NON-NLS-1$
		case OpaqueActivity4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_3065); //$NON-NLS-1$
		case PartnerActivity4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_3066); //$NON-NLS-1$
		case Pick4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_3067); //$NON-NLS-1$
		case Receive2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_3068); //$NON-NLS-1$
		case RepeatUntil2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", BpeldiagElementTypes.RepeatUntil_3069); //$NON-NLS-1$
		case Assign8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_3106); //$NON-NLS-1$
		case Compensate8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_3107); //$NON-NLS-1$
		case CompensateScope8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_3108); //$NON-NLS-1$
		case Empty8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_3109); //$NON-NLS-1$
		case Exit8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_3110); //$NON-NLS-1$
		case ExtensionActivity8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_3111); //$NON-NLS-1$
		case RepeatUntil3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", BpeldiagElementTypes.RepeatUntil_3112); //$NON-NLS-1$
		case ForEach5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_3113); //$NON-NLS-1$
		case Receive3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_3089); //$NON-NLS-1$
		case RepeatUntil4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", BpeldiagElementTypes.RepeatUntil_3090); //$NON-NLS-1$
		case Invoke5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_3151); //$NON-NLS-1$
		case OpaqueActivity5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_3152); //$NON-NLS-1$
		case PartnerActivity5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_3153); //$NON-NLS-1$
		case Pick5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_3154); //$NON-NLS-1$
		case Receive4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_3155); //$NON-NLS-1$
		case Reply2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_3156); //$NON-NLS-1$
		case Rethrow2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_3157); //$NON-NLS-1$
		case Scope2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_3158); //$NON-NLS-1$
		case Assign9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_3114); //$NON-NLS-1$
		case Compensate9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_3115); //$NON-NLS-1$
		case CompensateScope9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_3116); //$NON-NLS-1$
		case Empty9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_3117); //$NON-NLS-1$
		case Exit9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_3118); //$NON-NLS-1$
		case ExtensionActivity9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_3119); //$NON-NLS-1$
		case Scope3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_3120); //$NON-NLS-1$
		case ForEach6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_3121); //$NON-NLS-1$
		case Reply3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_3091); //$NON-NLS-1$
		case Rethrow3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_3092); //$NON-NLS-1$
		case Scope4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_3093); //$NON-NLS-1$
		case Invoke6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_3140); //$NON-NLS-1$
		case OpaqueActivity6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_3141); //$NON-NLS-1$
		case PartnerActivity6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_3142); //$NON-NLS-1$
		case Pick6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_3143); //$NON-NLS-1$
		case Receive5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_3144); //$NON-NLS-1$
		case Reply4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_3145); //$NON-NLS-1$
		case Rethrow4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_3146); //$NON-NLS-1$
		case Throw2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_3147); //$NON-NLS-1$
		case Validate2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_3148); //$NON-NLS-1$
		case Wait2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_3149); //$NON-NLS-1$
		case While2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_3150); //$NON-NLS-1$
		case Assign10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_3122); //$NON-NLS-1$
		case Compensate10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_3123); //$NON-NLS-1$
		case CompensateScope10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_3124); //$NON-NLS-1$
		case Empty10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_3125); //$NON-NLS-1$
		case Exit10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_3126); //$NON-NLS-1$
		case ExtensionActivity10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_3127); //$NON-NLS-1$
		case Flow6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", BpeldiagElementTypes.Flow_3176); //$NON-NLS-1$
		case Reply5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_3070); //$NON-NLS-1$
		case Rethrow5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_3071); //$NON-NLS-1$
		case Scope5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_3072); //$NON-NLS-1$
		case EventHandler2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?EventHandler", BpeldiagElementTypes.EventHandler_3243); //$NON-NLS-1$
		case OnAlarm3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OnAlarm", BpeldiagElementTypes.OnAlarm_3244); //$NON-NLS-1$
		case ForEach7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_3245); //$NON-NLS-1$
		case Throw3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_3094); //$NON-NLS-1$
		case Validate3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_3095); //$NON-NLS-1$
		case Wait3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_3096); //$NON-NLS-1$
		case While3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_3097); //$NON-NLS-1$
		case ForEach8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_3129); //$NON-NLS-1$
		case If5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", BpeldiagElementTypes.If_3177); //$NON-NLS-1$
		case Receive6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_3167); //$NON-NLS-1$
		case RepeatUntil5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", BpeldiagElementTypes.RepeatUntil_3168); //$NON-NLS-1$
		case Throw4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_3159); //$NON-NLS-1$
		case Validate4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_3160); //$NON-NLS-1$
		case Wait4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_3161); //$NON-NLS-1$
		case While4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_3162); //$NON-NLS-1$
		case Invoke7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_3130); //$NON-NLS-1$
		case OpaqueActivity7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_3131); //$NON-NLS-1$
		case PartnerActivity7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_3132); //$NON-NLS-1$
		case Pick7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_3133); //$NON-NLS-1$
		case Receive7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_3134); //$NON-NLS-1$
		case RepeatUntil6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", BpeldiagElementTypes.RepeatUntil_3178); //$NON-NLS-1$
		case Reply6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_3135); //$NON-NLS-1$
		case Rethrow6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_3136); //$NON-NLS-1$
		case Scope6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_3179); //$NON-NLS-1$
		case Sequence2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", BpeldiagElementTypes.Sequence_3180); //$NON-NLS-1$
		case Assign11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_3033); //$NON-NLS-1$
		case Compensate11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_3034); //$NON-NLS-1$
		case CompensateScope11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_3035); //$NON-NLS-1$
		case Empty11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_3036); //$NON-NLS-1$
		case Exit11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_3037); //$NON-NLS-1$
		case ExtensionActivity11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_3038); //$NON-NLS-1$
		case Flow7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", BpeldiagElementTypes.Flow_3039); //$NON-NLS-1$
		case Throw5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_3073); //$NON-NLS-1$
		case Validate5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_3074); //$NON-NLS-1$
		case Wait5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_3075); //$NON-NLS-1$
		case While5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_3076); //$NON-NLS-1$
		case Throw6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_3137); //$NON-NLS-1$
		case Validate6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_3138); //$NON-NLS-1$
		case Wait6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_3139); //$NON-NLS-1$
		case While6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_3128); //$NON-NLS-1$
		case ForEach9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_3040); //$NON-NLS-1$
		case If6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", BpeldiagElementTypes.If_3032); //$NON-NLS-1$
		case Reply7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_3169); //$NON-NLS-1$
		case Rethrow7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_3170); //$NON-NLS-1$
		case Scope7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_3171); //$NON-NLS-1$
		case Throw7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_3172); //$NON-NLS-1$
		case Validate7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_3173); //$NON-NLS-1$
		case Wait7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_3174); //$NON-NLS-1$
		case While7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_3175); //$NON-NLS-1$
		case ElseIf2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ElseIf", BpeldiagElementTypes.ElseIf_3246); //$NON-NLS-1$
		case Assign12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_3181); //$NON-NLS-1$
		case Compensate12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_3182); //$NON-NLS-1$
		case CompensateScope12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_3183); //$NON-NLS-1$
		case Empty12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_3184); //$NON-NLS-1$
		case Exit12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_3185); //$NON-NLS-1$
		case ExtensionActivity12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_3186); //$NON-NLS-1$
		case Flow8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", BpeldiagElementTypes.Flow_3187); //$NON-NLS-1$
		case ForEach10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_3188); //$NON-NLS-1$
		case If7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", BpeldiagElementTypes.If_3189); //$NON-NLS-1$
		case Else2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Else", BpeldiagElementTypes.Else_3247); //$NON-NLS-1$
		case Assign13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_3204); //$NON-NLS-1$
		case Compensate13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_3205); //$NON-NLS-1$
		case CompensateScope13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_3206); //$NON-NLS-1$
		case Empty13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_3207); //$NON-NLS-1$
		case Exit13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_3208); //$NON-NLS-1$
		case ExtensionActivity13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_3209); //$NON-NLS-1$
		case Flow9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", BpeldiagElementTypes.Flow_3210); //$NON-NLS-1$
		case ForEach11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_3211); //$NON-NLS-1$
		case If8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", BpeldiagElementTypes.If_3212); //$NON-NLS-1$
		case Invoke8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_3213); //$NON-NLS-1$
		case OpaqueActivity8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_3214); //$NON-NLS-1$
		case PartnerActivity8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_3215); //$NON-NLS-1$
		case Pick8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_3216); //$NON-NLS-1$
		case Receive8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_3217); //$NON-NLS-1$
		case RepeatUntil7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", BpeldiagElementTypes.RepeatUntil_3218); //$NON-NLS-1$
		case Reply8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_3219); //$NON-NLS-1$
		case Rethrow8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_3220); //$NON-NLS-1$
		case Scope8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_3221); //$NON-NLS-1$
		case Sequence3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", BpeldiagElementTypes.Sequence_3222); //$NON-NLS-1$
		case Invoke9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_3041); //$NON-NLS-1$
		case OpaqueActivity9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_3042); //$NON-NLS-1$
		case PartnerActivity9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_3043); //$NON-NLS-1$
		case Pick9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_3044); //$NON-NLS-1$
		case Receive9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_3045); //$NON-NLS-1$
		case RepeatUntil8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", BpeldiagElementTypes.RepeatUntil_3046); //$NON-NLS-1$
		case Reply9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_3047); //$NON-NLS-1$
		case Rethrow9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_3048); //$NON-NLS-1$
		case Scope9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_3049); //$NON-NLS-1$
		case Sequence4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", BpeldiagElementTypes.Sequence_3050); //$NON-NLS-1$
		case Throw8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_3051); //$NON-NLS-1$
		case Validate8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_3052); //$NON-NLS-1$
		case Wait8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_3053); //$NON-NLS-1$
		case While8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_3054); //$NON-NLS-1$
		case Throw9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_3223); //$NON-NLS-1$
		case Validate9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_3224); //$NON-NLS-1$
		case Wait9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_3225); //$NON-NLS-1$
		case While9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_3226); //$NON-NLS-1$
		case Invoke10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_3190); //$NON-NLS-1$
		case OpaqueActivity10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_3191); //$NON-NLS-1$
		case PartnerActivity10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_3192); //$NON-NLS-1$
		case Pick10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_3193); //$NON-NLS-1$
		case Receive10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_3194); //$NON-NLS-1$
		case RepeatUntil9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", BpeldiagElementTypes.RepeatUntil_3195); //$NON-NLS-1$
		case Reply10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_3196); //$NON-NLS-1$
		case Rethrow10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_3197); //$NON-NLS-1$
		case Scope10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_3198); //$NON-NLS-1$
		case Sequence5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", BpeldiagElementTypes.Sequence_3199); //$NON-NLS-1$
		case Throw10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_3200); //$NON-NLS-1$
		case Validate10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_3201); //$NON-NLS-1$
		case Wait10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_3202); //$NON-NLS-1$
		case While10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_3203); //$NON-NLS-1$
		case If9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", BpeldiagElementTypes.If_3248); //$NON-NLS-1$
		case Invoke11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_3249); //$NON-NLS-1$
		case OpaqueActivity11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_3250); //$NON-NLS-1$
		case PartnerActivity11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_3251); //$NON-NLS-1$
		case Pick11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_3252); //$NON-NLS-1$
		case Receive11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_3253); //$NON-NLS-1$
		case RepeatUntil10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", BpeldiagElementTypes.RepeatUntil_3254); //$NON-NLS-1$
		case Reply11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_3255); //$NON-NLS-1$
		case Rethrow11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_3256); //$NON-NLS-1$
		case Scope11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_3257); //$NON-NLS-1$
		case Sequence6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", BpeldiagElementTypes.Sequence_3258); //$NON-NLS-1$
		case Throw11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_3259); //$NON-NLS-1$
		case Validate11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_3260); //$NON-NLS-1$
		case Wait11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_3261); //$NON-NLS-1$
		case While11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_3262); //$NON-NLS-1$
		case OnEvent2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OnEvent", BpeldiagElementTypes.OnEvent_3263); //$NON-NLS-1$
		case Assign14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Assign", BpeldiagElementTypes.Assign_3264); //$NON-NLS-1$
		case Compensate14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Compensate", BpeldiagElementTypes.Compensate_3265); //$NON-NLS-1$
		case CompensateScope14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?CompensateScope", BpeldiagElementTypes.CompensateScope_3266); //$NON-NLS-1$
		case Empty14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Empty", BpeldiagElementTypes.Empty_3267); //$NON-NLS-1$
		case Exit14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Exit", BpeldiagElementTypes.Exit_3268); //$NON-NLS-1$
		case ExtensionActivity14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ExtensionActivity", BpeldiagElementTypes.ExtensionActivity_3269); //$NON-NLS-1$
		case Flow10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Flow", BpeldiagElementTypes.Flow_3270); //$NON-NLS-1$
		case ForEach12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_3271); //$NON-NLS-1$
		case If10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", BpeldiagElementTypes.If_3272); //$NON-NLS-1$
		case Invoke12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_3273); //$NON-NLS-1$
		case OpaqueActivity12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_3274); //$NON-NLS-1$
		case PartnerActivity12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_3275); //$NON-NLS-1$
		case Pick12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_3276); //$NON-NLS-1$
		case Receive12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_3277); //$NON-NLS-1$
		case RepeatUntil11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", BpeldiagElementTypes.RepeatUntil_3278); //$NON-NLS-1$
		case Reply12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_3279); //$NON-NLS-1$
		case Rethrow12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_3280); //$NON-NLS-1$
		case Scope12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_3281); //$NON-NLS-1$
		case Sequence7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", BpeldiagElementTypes.Sequence_3282); //$NON-NLS-1$
		case Throw12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_3283); //$NON-NLS-1$
		case Validate12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_3284); //$NON-NLS-1$
		case Wait12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_3285); //$NON-NLS-1$
		case While12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_3286); //$NON-NLS-1$
		case ForEach13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_3287); //$NON-NLS-1$
		case If11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", BpeldiagElementTypes.If_3288); //$NON-NLS-1$
		case Invoke13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_3289); //$NON-NLS-1$
		case OpaqueActivity13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_3290); //$NON-NLS-1$
		case PartnerActivity13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_3291); //$NON-NLS-1$
		case Pick13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_3292); //$NON-NLS-1$
		case Receive13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_3293); //$NON-NLS-1$
		case RepeatUntil12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", BpeldiagElementTypes.RepeatUntil_3294); //$NON-NLS-1$
		case Reply13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_3295); //$NON-NLS-1$
		case Rethrow13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_3296); //$NON-NLS-1$
		case Scope13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_3297); //$NON-NLS-1$
		case Sequence8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", BpeldiagElementTypes.Sequence_3298); //$NON-NLS-1$
		case Throw13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_3299); //$NON-NLS-1$
		case Validate13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_3300); //$NON-NLS-1$
		case Wait13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_3301); //$NON-NLS-1$
		case While13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_3302); //$NON-NLS-1$
		case ForEach14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?ForEach", BpeldiagElementTypes.ForEach_3010); //$NON-NLS-1$
		case If12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?If", BpeldiagElementTypes.If_3011); //$NON-NLS-1$
		case Invoke14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Invoke", BpeldiagElementTypes.Invoke_3012); //$NON-NLS-1$
		case OpaqueActivity14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?OpaqueActivity", BpeldiagElementTypes.OpaqueActivity_3013); //$NON-NLS-1$
		case PartnerActivity14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity", BpeldiagElementTypes.PartnerActivity_3014); //$NON-NLS-1$
		case Pick14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Pick", BpeldiagElementTypes.Pick_3015); //$NON-NLS-1$
		case Receive14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Receive", BpeldiagElementTypes.Receive_3016); //$NON-NLS-1$
		case RepeatUntil13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?RepeatUntil", BpeldiagElementTypes.RepeatUntil_3017); //$NON-NLS-1$
		case Reply14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Reply", BpeldiagElementTypes.Reply_3018); //$NON-NLS-1$
		case Rethrow14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Rethrow", BpeldiagElementTypes.Rethrow_3019); //$NON-NLS-1$
		case Scope14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Scope", BpeldiagElementTypes.Scope_3020); //$NON-NLS-1$
		case Sequence9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Sequence", BpeldiagElementTypes.Sequence_3002); //$NON-NLS-1$
		case Throw14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Throw", BpeldiagElementTypes.Throw_3021); //$NON-NLS-1$
		case Validate14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Validate", BpeldiagElementTypes.Validate_3022); //$NON-NLS-1$
		case Wait14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?Wait", BpeldiagElementTypes.Wait_3023); //$NON-NLS-1$
		case While14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?While", BpeldiagElementTypes.While_3024); //$NON-NLS-1$
		case EventHandler3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://docs.oasis-open.org/wsbpel/2.0/process/executable?EventHandler", BpeldiagElementTypes.EventHandler_3303); //$NON-NLS-1$
		case PartnerActivityOperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://docs.oasis-open.org/wsbpel/2.0/process/executable?PartnerActivity?operation", BpeldiagElementTypes.PartnerActivityOperation_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = BpeldiagDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& BpeldiagElementTypes.isKnownElementType(elementType)) {
			image = BpeldiagElementTypes.getImage(elementType);
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
		if (element instanceof BpeldiagNavigatorGroup) {
			BpeldiagNavigatorGroup group = (BpeldiagNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof BpeldiagNavigatorItem) {
			BpeldiagNavigatorItem navigatorItem = (BpeldiagNavigatorItem) element;
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
		switch (BpeldiagVisualIDRegistry.getVisualID(view)) {
		case ProcessContainerEditPart.VISUAL_ID:
			return getProcessContainer_1000Text(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_2001Text(view);
		case AssignEditPart.VISUAL_ID:
			return getAssign_2002Text(view);
		case CompensateEditPart.VISUAL_ID:
			return getCompensate_2003Text(view);
		case CompensateScopeEditPart.VISUAL_ID:
			return getCompensateScope_2004Text(view);
		case EmptyEditPart.VISUAL_ID:
			return getEmpty_2005Text(view);
		case ExitEditPart.VISUAL_ID:
			return getExit_2006Text(view);
		case ExtensionActivityEditPart.VISUAL_ID:
			return getExtensionActivity_2007Text(view);
		case FlowEditPart.VISUAL_ID:
			return getFlow_2008Text(view);
		case ForEachEditPart.VISUAL_ID:
			return getForEach_2009Text(view);
		case IfEditPart.VISUAL_ID:
			return getIf_2010Text(view);
		case InvokeEditPart.VISUAL_ID:
			return getInvoke_2011Text(view);
		case OpaqueActivityEditPart.VISUAL_ID:
			return getOpaqueActivity_2012Text(view);
		case PickEditPart.VISUAL_ID:
			return getPick_2014Text(view);
		case ReceiveEditPart.VISUAL_ID:
			return getReceive_2015Text(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2016Text(view);
		case ReplyEditPart.VISUAL_ID:
			return getReply_2017Text(view);
		case RethrowEditPart.VISUAL_ID:
			return getRethrow_2018Text(view);
		case ScopeEditPart.VISUAL_ID:
			return getScope_2019Text(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2020Text(view);
		case ThrowEditPart.VISUAL_ID:
			return getThrow_2021Text(view);
		case ValidateEditPart.VISUAL_ID:
			return getValidate_2022Text(view);
		case WaitEditPart.VISUAL_ID:
			return getWait_2023Text(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_2024Text(view);
		case PartnerActivityEditPart.VISUAL_ID:
			return getPartnerActivity_2013Text(view);
		case ElseIfEditPart.VISUAL_ID:
			return getElseIf_2025Text(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_2026Text(view);
		case OnAlarmEditPart.VISUAL_ID:
			return getOnAlarm_2027Text(view);
		case OnEventEditPart.VISUAL_ID:
			return getOnEvent_2028Text(view);
		case OnMessageEditPart.VISUAL_ID:
			return getOnMessage_2029Text(view);
		case EventHandlerEditPart.VISUAL_ID:
			return getEventHandler_2030Text(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2031Text(view);
		case Assign2EditPart.VISUAL_ID:
			return getAssign_3001Text(view);
		case Compensate2EditPart.VISUAL_ID:
			return getCompensate_3004Text(view);
		case CompensateScope2EditPart.VISUAL_ID:
			return getCompensateScope_3005Text(view);
		case Empty2EditPart.VISUAL_ID:
			return getEmpty_3006Text(view);
		case Exit2EditPart.VISUAL_ID:
			return getExit_3007Text(view);
		case ExtensionActivity2EditPart.VISUAL_ID:
			return getExtensionActivity_3008Text(view);
		case Flow2EditPart.VISUAL_ID:
			return getFlow_3009Text(view);
		case Assign3EditPart.VISUAL_ID:
			return getAssign_3055Text(view);
		case Compensate3EditPart.VISUAL_ID:
			return getCompensate_3056Text(view);
		case CompensateScope3EditPart.VISUAL_ID:
			return getCompensateScope_3057Text(view);
		case Empty3EditPart.VISUAL_ID:
			return getEmpty_3058Text(view);
		case Exit3EditPart.VISUAL_ID:
			return getExit_3059Text(view);
		case ExtensionActivity3EditPart.VISUAL_ID:
			return getExtensionActivity_3060Text(view);
		case Flow3EditPart.VISUAL_ID:
			return getFlow_3061Text(view);
		case ForEach2EditPart.VISUAL_ID:
			return getForEach_3062Text(view);
		case Assign4EditPart.VISUAL_ID:
			return getAssign_3077Text(view);
		case Compensate4EditPart.VISUAL_ID:
			return getCompensate_3078Text(view);
		case CompensateScope4EditPart.VISUAL_ID:
			return getCompensateScope_3079Text(view);
		case Empty4EditPart.VISUAL_ID:
			return getEmpty_3080Text(view);
		case Exit4EditPart.VISUAL_ID:
			return getExit_3081Text(view);
		case ExtensionActivity4EditPart.VISUAL_ID:
			return getExtensionActivity_3082Text(view);
		case ForEach3EditPart.VISUAL_ID:
			return getForEach_3083Text(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3084Text(view);
		case Assign5EditPart.VISUAL_ID:
			return getAssign_3098Text(view);
		case Compensate5EditPart.VISUAL_ID:
			return getCompensate_3099Text(view);
		case CompensateScope5EditPart.VISUAL_ID:
			return getCompensateScope_3100Text(view);
		case Empty5EditPart.VISUAL_ID:
			return getEmpty_3101Text(view);
		case Exit5EditPart.VISUAL_ID:
			return getExit_3102Text(view);
		case ExtensionActivity5EditPart.VISUAL_ID:
			return getExtensionActivity_3103Text(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3104Text(view);
		case ForEach4EditPart.VISUAL_ID:
			return getForEach_3105Text(view);
		case Invoke2EditPart.VISUAL_ID:
			return getInvoke_3085Text(view);
		case OpaqueActivity2EditPart.VISUAL_ID:
			return getOpaqueActivity_3086Text(view);
		case PartnerActivity2EditPart.VISUAL_ID:
			return getPartnerActivity_3087Text(view);
		case Pick2EditPart.VISUAL_ID:
			return getPick_3088Text(view);
		case OnAlarm2EditPart.VISUAL_ID:
			return getOnAlarm_3227Text(view);
		case Assign6EditPart.VISUAL_ID:
			return getAssign_3228Text(view);
		case Compensate6EditPart.VISUAL_ID:
			return getCompensate_3229Text(view);
		case CompensateScope6EditPart.VISUAL_ID:
			return getCompensateScope_3230Text(view);
		case Empty6EditPart.VISUAL_ID:
			return getEmpty_3231Text(view);
		case Exit6EditPart.VISUAL_ID:
			return getExit_3232Text(view);
		case ExtensionActivity6EditPart.VISUAL_ID:
			return getExtensionActivity_3233Text(view);
		case Flow4EditPart.VISUAL_ID:
			return getFlow_3234Text(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3063Text(view);
		case Invoke3EditPart.VISUAL_ID:
			return getInvoke_3163Text(view);
		case OpaqueActivity3EditPart.VISUAL_ID:
			return getOpaqueActivity_3164Text(view);
		case PartnerActivity3EditPart.VISUAL_ID:
			return getPartnerActivity_3165Text(view);
		case Pick3EditPart.VISUAL_ID:
			return getPick_3166Text(view);
		case OnMessage2EditPart.VISUAL_ID:
			return getOnMessage_3235Text(view);
		case Assign7EditPart.VISUAL_ID:
			return getAssign_3236Text(view);
		case Compensate7EditPart.VISUAL_ID:
			return getCompensate_3237Text(view);
		case CompensateScope7EditPart.VISUAL_ID:
			return getCompensateScope_3238Text(view);
		case Empty7EditPart.VISUAL_ID:
			return getEmpty_3239Text(view);
		case Exit7EditPart.VISUAL_ID:
			return getExit_3240Text(view);
		case ExtensionActivity7EditPart.VISUAL_ID:
			return getExtensionActivity_3241Text(view);
		case Flow5EditPart.VISUAL_ID:
			return getFlow_3242Text(view);
		case Invoke4EditPart.VISUAL_ID:
			return getInvoke_3064Text(view);
		case OpaqueActivity4EditPart.VISUAL_ID:
			return getOpaqueActivity_3065Text(view);
		case PartnerActivity4EditPart.VISUAL_ID:
			return getPartnerActivity_3066Text(view);
		case Pick4EditPart.VISUAL_ID:
			return getPick_3067Text(view);
		case Receive2EditPart.VISUAL_ID:
			return getReceive_3068Text(view);
		case RepeatUntil2EditPart.VISUAL_ID:
			return getRepeatUntil_3069Text(view);
		case Assign8EditPart.VISUAL_ID:
			return getAssign_3106Text(view);
		case Compensate8EditPart.VISUAL_ID:
			return getCompensate_3107Text(view);
		case CompensateScope8EditPart.VISUAL_ID:
			return getCompensateScope_3108Text(view);
		case Empty8EditPart.VISUAL_ID:
			return getEmpty_3109Text(view);
		case Exit8EditPart.VISUAL_ID:
			return getExit_3110Text(view);
		case ExtensionActivity8EditPart.VISUAL_ID:
			return getExtensionActivity_3111Text(view);
		case RepeatUntil3EditPart.VISUAL_ID:
			return getRepeatUntil_3112Text(view);
		case ForEach5EditPart.VISUAL_ID:
			return getForEach_3113Text(view);
		case Receive3EditPart.VISUAL_ID:
			return getReceive_3089Text(view);
		case RepeatUntil4EditPart.VISUAL_ID:
			return getRepeatUntil_3090Text(view);
		case Invoke5EditPart.VISUAL_ID:
			return getInvoke_3151Text(view);
		case OpaqueActivity5EditPart.VISUAL_ID:
			return getOpaqueActivity_3152Text(view);
		case PartnerActivity5EditPart.VISUAL_ID:
			return getPartnerActivity_3153Text(view);
		case Pick5EditPart.VISUAL_ID:
			return getPick_3154Text(view);
		case Receive4EditPart.VISUAL_ID:
			return getReceive_3155Text(view);
		case Reply2EditPart.VISUAL_ID:
			return getReply_3156Text(view);
		case Rethrow2EditPart.VISUAL_ID:
			return getRethrow_3157Text(view);
		case Scope2EditPart.VISUAL_ID:
			return getScope_3158Text(view);
		case Assign9EditPart.VISUAL_ID:
			return getAssign_3114Text(view);
		case Compensate9EditPart.VISUAL_ID:
			return getCompensate_3115Text(view);
		case CompensateScope9EditPart.VISUAL_ID:
			return getCompensateScope_3116Text(view);
		case Empty9EditPart.VISUAL_ID:
			return getEmpty_3117Text(view);
		case Exit9EditPart.VISUAL_ID:
			return getExit_3118Text(view);
		case ExtensionActivity9EditPart.VISUAL_ID:
			return getExtensionActivity_3119Text(view);
		case Scope3EditPart.VISUAL_ID:
			return getScope_3120Text(view);
		case ForEach6EditPart.VISUAL_ID:
			return getForEach_3121Text(view);
		case Reply3EditPart.VISUAL_ID:
			return getReply_3091Text(view);
		case Rethrow3EditPart.VISUAL_ID:
			return getRethrow_3092Text(view);
		case Scope4EditPart.VISUAL_ID:
			return getScope_3093Text(view);
		case Invoke6EditPart.VISUAL_ID:
			return getInvoke_3140Text(view);
		case OpaqueActivity6EditPart.VISUAL_ID:
			return getOpaqueActivity_3141Text(view);
		case PartnerActivity6EditPart.VISUAL_ID:
			return getPartnerActivity_3142Text(view);
		case Pick6EditPart.VISUAL_ID:
			return getPick_3143Text(view);
		case Receive5EditPart.VISUAL_ID:
			return getReceive_3144Text(view);
		case Reply4EditPart.VISUAL_ID:
			return getReply_3145Text(view);
		case Rethrow4EditPart.VISUAL_ID:
			return getRethrow_3146Text(view);
		case Throw2EditPart.VISUAL_ID:
			return getThrow_3147Text(view);
		case Validate2EditPart.VISUAL_ID:
			return getValidate_3148Text(view);
		case Wait2EditPart.VISUAL_ID:
			return getWait_3149Text(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3150Text(view);
		case Assign10EditPart.VISUAL_ID:
			return getAssign_3122Text(view);
		case Compensate10EditPart.VISUAL_ID:
			return getCompensate_3123Text(view);
		case CompensateScope10EditPart.VISUAL_ID:
			return getCompensateScope_3124Text(view);
		case Empty10EditPart.VISUAL_ID:
			return getEmpty_3125Text(view);
		case Exit10EditPart.VISUAL_ID:
			return getExit_3126Text(view);
		case ExtensionActivity10EditPart.VISUAL_ID:
			return getExtensionActivity_3127Text(view);
		case Flow6EditPart.VISUAL_ID:
			return getFlow_3176Text(view);
		case Reply5EditPart.VISUAL_ID:
			return getReply_3070Text(view);
		case Rethrow5EditPart.VISUAL_ID:
			return getRethrow_3071Text(view);
		case Scope5EditPart.VISUAL_ID:
			return getScope_3072Text(view);
		case EventHandler2EditPart.VISUAL_ID:
			return getEventHandler_3243Text(view);
		case OnAlarm3EditPart.VISUAL_ID:
			return getOnAlarm_3244Text(view);
		case ForEach7EditPart.VISUAL_ID:
			return getForEach_3245Text(view);
		case Throw3EditPart.VISUAL_ID:
			return getThrow_3094Text(view);
		case Validate3EditPart.VISUAL_ID:
			return getValidate_3095Text(view);
		case Wait3EditPart.VISUAL_ID:
			return getWait_3096Text(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3097Text(view);
		case ForEach8EditPart.VISUAL_ID:
			return getForEach_3129Text(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3177Text(view);
		case Receive6EditPart.VISUAL_ID:
			return getReceive_3167Text(view);
		case RepeatUntil5EditPart.VISUAL_ID:
			return getRepeatUntil_3168Text(view);
		case Throw4EditPart.VISUAL_ID:
			return getThrow_3159Text(view);
		case Validate4EditPart.VISUAL_ID:
			return getValidate_3160Text(view);
		case Wait4EditPart.VISUAL_ID:
			return getWait_3161Text(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3162Text(view);
		case Invoke7EditPart.VISUAL_ID:
			return getInvoke_3130Text(view);
		case OpaqueActivity7EditPart.VISUAL_ID:
			return getOpaqueActivity_3131Text(view);
		case PartnerActivity7EditPart.VISUAL_ID:
			return getPartnerActivity_3132Text(view);
		case Pick7EditPart.VISUAL_ID:
			return getPick_3133Text(view);
		case Receive7EditPart.VISUAL_ID:
			return getReceive_3134Text(view);
		case RepeatUntil6EditPart.VISUAL_ID:
			return getRepeatUntil_3178Text(view);
		case Reply6EditPart.VISUAL_ID:
			return getReply_3135Text(view);
		case Rethrow6EditPart.VISUAL_ID:
			return getRethrow_3136Text(view);
		case Scope6EditPart.VISUAL_ID:
			return getScope_3179Text(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3180Text(view);
		case Assign11EditPart.VISUAL_ID:
			return getAssign_3033Text(view);
		case Compensate11EditPart.VISUAL_ID:
			return getCompensate_3034Text(view);
		case CompensateScope11EditPart.VISUAL_ID:
			return getCompensateScope_3035Text(view);
		case Empty11EditPart.VISUAL_ID:
			return getEmpty_3036Text(view);
		case Exit11EditPart.VISUAL_ID:
			return getExit_3037Text(view);
		case ExtensionActivity11EditPart.VISUAL_ID:
			return getExtensionActivity_3038Text(view);
		case Flow7EditPart.VISUAL_ID:
			return getFlow_3039Text(view);
		case Throw5EditPart.VISUAL_ID:
			return getThrow_3073Text(view);
		case Validate5EditPart.VISUAL_ID:
			return getValidate_3074Text(view);
		case Wait5EditPart.VISUAL_ID:
			return getWait_3075Text(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3076Text(view);
		case Throw6EditPart.VISUAL_ID:
			return getThrow_3137Text(view);
		case Validate6EditPart.VISUAL_ID:
			return getValidate_3138Text(view);
		case Wait6EditPart.VISUAL_ID:
			return getWait_3139Text(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3128Text(view);
		case ForEach9EditPart.VISUAL_ID:
			return getForEach_3040Text(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3032Text(view);
		case Reply7EditPart.VISUAL_ID:
			return getReply_3169Text(view);
		case Rethrow7EditPart.VISUAL_ID:
			return getRethrow_3170Text(view);
		case Scope7EditPart.VISUAL_ID:
			return getScope_3171Text(view);
		case Throw7EditPart.VISUAL_ID:
			return getThrow_3172Text(view);
		case Validate7EditPart.VISUAL_ID:
			return getValidate_3173Text(view);
		case Wait7EditPart.VISUAL_ID:
			return getWait_3174Text(view);
		case While7EditPart.VISUAL_ID:
			return getWhile_3175Text(view);
		case ElseIf2EditPart.VISUAL_ID:
			return getElseIf_3246Text(view);
		case Assign12EditPart.VISUAL_ID:
			return getAssign_3181Text(view);
		case Compensate12EditPart.VISUAL_ID:
			return getCompensate_3182Text(view);
		case CompensateScope12EditPart.VISUAL_ID:
			return getCompensateScope_3183Text(view);
		case Empty12EditPart.VISUAL_ID:
			return getEmpty_3184Text(view);
		case Exit12EditPart.VISUAL_ID:
			return getExit_3185Text(view);
		case ExtensionActivity12EditPart.VISUAL_ID:
			return getExtensionActivity_3186Text(view);
		case Flow8EditPart.VISUAL_ID:
			return getFlow_3187Text(view);
		case ForEach10EditPart.VISUAL_ID:
			return getForEach_3188Text(view);
		case If7EditPart.VISUAL_ID:
			return getIf_3189Text(view);
		case Else2EditPart.VISUAL_ID:
			return getElse_3247Text(view);
		case Assign13EditPart.VISUAL_ID:
			return getAssign_3204Text(view);
		case Compensate13EditPart.VISUAL_ID:
			return getCompensate_3205Text(view);
		case CompensateScope13EditPart.VISUAL_ID:
			return getCompensateScope_3206Text(view);
		case Empty13EditPart.VISUAL_ID:
			return getEmpty_3207Text(view);
		case Exit13EditPart.VISUAL_ID:
			return getExit_3208Text(view);
		case ExtensionActivity13EditPart.VISUAL_ID:
			return getExtensionActivity_3209Text(view);
		case Flow9EditPart.VISUAL_ID:
			return getFlow_3210Text(view);
		case ForEach11EditPart.VISUAL_ID:
			return getForEach_3211Text(view);
		case If8EditPart.VISUAL_ID:
			return getIf_3212Text(view);
		case Invoke8EditPart.VISUAL_ID:
			return getInvoke_3213Text(view);
		case OpaqueActivity8EditPart.VISUAL_ID:
			return getOpaqueActivity_3214Text(view);
		case PartnerActivity8EditPart.VISUAL_ID:
			return getPartnerActivity_3215Text(view);
		case Pick8EditPart.VISUAL_ID:
			return getPick_3216Text(view);
		case Receive8EditPart.VISUAL_ID:
			return getReceive_3217Text(view);
		case RepeatUntil7EditPart.VISUAL_ID:
			return getRepeatUntil_3218Text(view);
		case Reply8EditPart.VISUAL_ID:
			return getReply_3219Text(view);
		case Rethrow8EditPart.VISUAL_ID:
			return getRethrow_3220Text(view);
		case Scope8EditPart.VISUAL_ID:
			return getScope_3221Text(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3222Text(view);
		case Invoke9EditPart.VISUAL_ID:
			return getInvoke_3041Text(view);
		case OpaqueActivity9EditPart.VISUAL_ID:
			return getOpaqueActivity_3042Text(view);
		case PartnerActivity9EditPart.VISUAL_ID:
			return getPartnerActivity_3043Text(view);
		case Pick9EditPart.VISUAL_ID:
			return getPick_3044Text(view);
		case Receive9EditPart.VISUAL_ID:
			return getReceive_3045Text(view);
		case RepeatUntil8EditPart.VISUAL_ID:
			return getRepeatUntil_3046Text(view);
		case Reply9EditPart.VISUAL_ID:
			return getReply_3047Text(view);
		case Rethrow9EditPart.VISUAL_ID:
			return getRethrow_3048Text(view);
		case Scope9EditPart.VISUAL_ID:
			return getScope_3049Text(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3050Text(view);
		case Throw8EditPart.VISUAL_ID:
			return getThrow_3051Text(view);
		case Validate8EditPart.VISUAL_ID:
			return getValidate_3052Text(view);
		case Wait8EditPart.VISUAL_ID:
			return getWait_3053Text(view);
		case While8EditPart.VISUAL_ID:
			return getWhile_3054Text(view);
		case Throw9EditPart.VISUAL_ID:
			return getThrow_3223Text(view);
		case Validate9EditPart.VISUAL_ID:
			return getValidate_3224Text(view);
		case Wait9EditPart.VISUAL_ID:
			return getWait_3225Text(view);
		case While9EditPart.VISUAL_ID:
			return getWhile_3226Text(view);
		case Invoke10EditPart.VISUAL_ID:
			return getInvoke_3190Text(view);
		case OpaqueActivity10EditPart.VISUAL_ID:
			return getOpaqueActivity_3191Text(view);
		case PartnerActivity10EditPart.VISUAL_ID:
			return getPartnerActivity_3192Text(view);
		case Pick10EditPart.VISUAL_ID:
			return getPick_3193Text(view);
		case Receive10EditPart.VISUAL_ID:
			return getReceive_3194Text(view);
		case RepeatUntil9EditPart.VISUAL_ID:
			return getRepeatUntil_3195Text(view);
		case Reply10EditPart.VISUAL_ID:
			return getReply_3196Text(view);
		case Rethrow10EditPart.VISUAL_ID:
			return getRethrow_3197Text(view);
		case Scope10EditPart.VISUAL_ID:
			return getScope_3198Text(view);
		case Sequence5EditPart.VISUAL_ID:
			return getSequence_3199Text(view);
		case Throw10EditPart.VISUAL_ID:
			return getThrow_3200Text(view);
		case Validate10EditPart.VISUAL_ID:
			return getValidate_3201Text(view);
		case Wait10EditPart.VISUAL_ID:
			return getWait_3202Text(view);
		case While10EditPart.VISUAL_ID:
			return getWhile_3203Text(view);
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
		case RepeatUntil10EditPart.VISUAL_ID:
			return getRepeatUntil_3254Text(view);
		case Reply11EditPart.VISUAL_ID:
			return getReply_3255Text(view);
		case Rethrow11EditPart.VISUAL_ID:
			return getRethrow_3256Text(view);
		case Scope11EditPart.VISUAL_ID:
			return getScope_3257Text(view);
		case Sequence6EditPart.VISUAL_ID:
			return getSequence_3258Text(view);
		case Throw11EditPart.VISUAL_ID:
			return getThrow_3259Text(view);
		case Validate11EditPart.VISUAL_ID:
			return getValidate_3260Text(view);
		case Wait11EditPart.VISUAL_ID:
			return getWait_3261Text(view);
		case While11EditPart.VISUAL_ID:
			return getWhile_3262Text(view);
		case OnEvent2EditPart.VISUAL_ID:
			return getOnEvent_3263Text(view);
		case Assign14EditPart.VISUAL_ID:
			return getAssign_3264Text(view);
		case Compensate14EditPart.VISUAL_ID:
			return getCompensate_3265Text(view);
		case CompensateScope14EditPart.VISUAL_ID:
			return getCompensateScope_3266Text(view);
		case Empty14EditPart.VISUAL_ID:
			return getEmpty_3267Text(view);
		case Exit14EditPart.VISUAL_ID:
			return getExit_3268Text(view);
		case ExtensionActivity14EditPart.VISUAL_ID:
			return getExtensionActivity_3269Text(view);
		case Flow10EditPart.VISUAL_ID:
			return getFlow_3270Text(view);
		case ForEach12EditPart.VISUAL_ID:
			return getForEach_3271Text(view);
		case If10EditPart.VISUAL_ID:
			return getIf_3272Text(view);
		case Invoke12EditPart.VISUAL_ID:
			return getInvoke_3273Text(view);
		case OpaqueActivity12EditPart.VISUAL_ID:
			return getOpaqueActivity_3274Text(view);
		case PartnerActivity12EditPart.VISUAL_ID:
			return getPartnerActivity_3275Text(view);
		case Pick12EditPart.VISUAL_ID:
			return getPick_3276Text(view);
		case Receive12EditPart.VISUAL_ID:
			return getReceive_3277Text(view);
		case RepeatUntil11EditPart.VISUAL_ID:
			return getRepeatUntil_3278Text(view);
		case Reply12EditPart.VISUAL_ID:
			return getReply_3279Text(view);
		case Rethrow12EditPart.VISUAL_ID:
			return getRethrow_3280Text(view);
		case Scope12EditPart.VISUAL_ID:
			return getScope_3281Text(view);
		case Sequence7EditPart.VISUAL_ID:
			return getSequence_3282Text(view);
		case Throw12EditPart.VISUAL_ID:
			return getThrow_3283Text(view);
		case Validate12EditPart.VISUAL_ID:
			return getValidate_3284Text(view);
		case Wait12EditPart.VISUAL_ID:
			return getWait_3285Text(view);
		case While12EditPart.VISUAL_ID:
			return getWhile_3286Text(view);
		case ForEach13EditPart.VISUAL_ID:
			return getForEach_3287Text(view);
		case If11EditPart.VISUAL_ID:
			return getIf_3288Text(view);
		case Invoke13EditPart.VISUAL_ID:
			return getInvoke_3289Text(view);
		case OpaqueActivity13EditPart.VISUAL_ID:
			return getOpaqueActivity_3290Text(view);
		case PartnerActivity13EditPart.VISUAL_ID:
			return getPartnerActivity_3291Text(view);
		case Pick13EditPart.VISUAL_ID:
			return getPick_3292Text(view);
		case Receive13EditPart.VISUAL_ID:
			return getReceive_3293Text(view);
		case RepeatUntil12EditPart.VISUAL_ID:
			return getRepeatUntil_3294Text(view);
		case Reply13EditPart.VISUAL_ID:
			return getReply_3295Text(view);
		case Rethrow13EditPart.VISUAL_ID:
			return getRethrow_3296Text(view);
		case Scope13EditPart.VISUAL_ID:
			return getScope_3297Text(view);
		case Sequence8EditPart.VISUAL_ID:
			return getSequence_3298Text(view);
		case Throw13EditPart.VISUAL_ID:
			return getThrow_3299Text(view);
		case Validate13EditPart.VISUAL_ID:
			return getValidate_3300Text(view);
		case Wait13EditPart.VISUAL_ID:
			return getWait_3301Text(view);
		case While13EditPart.VISUAL_ID:
			return getWhile_3302Text(view);
		case ForEach14EditPart.VISUAL_ID:
			return getForEach_3010Text(view);
		case If12EditPart.VISUAL_ID:
			return getIf_3011Text(view);
		case Invoke14EditPart.VISUAL_ID:
			return getInvoke_3012Text(view);
		case OpaqueActivity14EditPart.VISUAL_ID:
			return getOpaqueActivity_3013Text(view);
		case PartnerActivity14EditPart.VISUAL_ID:
			return getPartnerActivity_3014Text(view);
		case Pick14EditPart.VISUAL_ID:
			return getPick_3015Text(view);
		case Receive14EditPart.VISUAL_ID:
			return getReceive_3016Text(view);
		case RepeatUntil13EditPart.VISUAL_ID:
			return getRepeatUntil_3017Text(view);
		case Reply14EditPart.VISUAL_ID:
			return getReply_3018Text(view);
		case Rethrow14EditPart.VISUAL_ID:
			return getRethrow_3019Text(view);
		case Scope14EditPart.VISUAL_ID:
			return getScope_3020Text(view);
		case Sequence9EditPart.VISUAL_ID:
			return getSequence_3002Text(view);
		case Throw14EditPart.VISUAL_ID:
			return getThrow_3021Text(view);
		case Validate14EditPart.VISUAL_ID:
			return getValidate_3022Text(view);
		case Wait14EditPart.VISUAL_ID:
			return getWait_3023Text(view);
		case While14EditPart.VISUAL_ID:
			return getWhile_3024Text(view);
		case EventHandler3EditPart.VISUAL_ID:
			return getEventHandler_3303Text(view);
		case PartnerActivityOperationEditPart.VISUAL_ID:
			return getPartnerActivityOperation_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getProcessContainer_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProcess_2001Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Process_2001,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ProcessNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_2002Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Assign_2002,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(AssignNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_2003Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_2003,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_2004Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_2004,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_2005Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Empty_2005,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(EmptyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_2006Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_2006,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_2007Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_2007,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_2008Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Flow_2008,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(FlowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_2009Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.ForEach_2009,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ForEachNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5077); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_2010Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.If_2010, view.getElement() != null ? view
						.getElement() : view, BpeldiagVisualIDRegistry
						.getType(IfNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_2011Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Invoke_2011,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(InvokeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5079); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_2012Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_2012,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5080); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_2014Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_2014,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5082); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_2015Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Receive_2015,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ReceiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5083); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_2016Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.RepeatUntil_2016,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RepeatUntilNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5084); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_2017Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Reply_2017,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ReplyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5085); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_2018Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Rethrow_2018,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(RethrowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5086); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_2019Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Scope_2019,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ScopeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5087); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_2020Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Sequence_2020,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(SequenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5088); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_2021Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Throw_2021,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ThrowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5089); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_2022Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_2022,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5090); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_2023Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_2023,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5091); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_2024Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.While_2024,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WhileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5092); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_2013Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_2013,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5081); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getElseIf_2025Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ElseIf_2025,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5264); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getElse_2026Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Else_2026,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5288); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOnAlarm_2027Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OnAlarm_2027,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5366); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOnEvent_2028Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OnEvent_2028,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5367); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOnMessage_2029Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OnMessage_2029,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5368); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventHandler_2030Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.EventHandler_2030,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5369); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_2031Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Operation_2031,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5370); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3001Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Assign_3001,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(AssignName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3004Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_3004,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3005Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_3005,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3006Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Empty_3006,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(EmptyName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3007Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_3007,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3008Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_3008,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3009Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Flow_3009,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(FlowName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3055Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Assign_3055,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(AssignName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5115); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3056Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_3056,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5116); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3057Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_3057,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5117); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3058Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Empty_3058,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(EmptyName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5118); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3059Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_3059,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5119); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3060Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_3060,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5120); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3061Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Flow_3061,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(FlowName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5136); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3062Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ForEach_3062,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ForEachName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5121); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3077Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Assign_3077,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(AssignName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5137); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3078Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_3078,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5138); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3079Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_3079,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5139); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3080Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Empty_3080,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(EmptyName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5140); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3081Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_3081,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5141); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3082Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_3082,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5142); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3083Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ForEach_3083,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ForEachName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5157); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3084Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.If_3084, view.getElement() != null ? view
						.getElement() : view, BpeldiagVisualIDRegistry
						.getType(IfName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5143); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3098Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Assign_3098,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(AssignName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5158); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3099Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_3099,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5159); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3100Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_3100,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5160); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3101Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Empty_3101,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(EmptyName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5161); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3102Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_3102,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5162); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3103Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_3103,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5163); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3104Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.If_3104, view.getElement() != null ? view
						.getElement() : view, BpeldiagVisualIDRegistry
						.getType(IfName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5235); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3105Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ForEach_3105,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ForEachName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5221); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3085Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Invoke_3085,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(InvokeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5144); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3086Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_3086,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5145); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3087Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_3087,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5146); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3088Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_3088,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5147); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOnAlarm_3227Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OnAlarm_3227,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5364); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3228Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Assign_3228,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(AssignName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5289); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3229Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_3229,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5290); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3230Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_3230,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5291); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3231Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Empty_3231,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(EmptyName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5292); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3232Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_3232,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5293); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3233Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_3233,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5294); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3234Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Flow_3234,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(FlowName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5363); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3063Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.If_3063, view.getElement() != null ? view
						.getElement() : view, BpeldiagVisualIDRegistry
						.getType(IfName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5122); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3163Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Invoke_3163,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(InvokeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5222); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3164Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_3164,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5223); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3165Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_3165,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5224); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3166Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_3166,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5225); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOnMessage_3235Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OnMessage_3235,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5362); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3236Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Assign_3236,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(AssignName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5295); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3237Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_3237,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5296); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3238Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_3238,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5297); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3239Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Empty_3239,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(EmptyName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5298); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3240Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_3240,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5299); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3241Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_3241,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5300); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3242Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Flow_3242,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(FlowName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5345); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3064Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Invoke_3064,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(InvokeName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5123); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3065Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_3065,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5124); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3066Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_3066,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5125); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3067Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_3067,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5126); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3068Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Receive_3068,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ReceiveName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5127); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3069Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.RepeatUntil_3069,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RepeatUntilName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5128); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3106Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Assign_3106,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(AssignName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5164); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3107Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_3107,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5165); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3108Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_3108,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5166); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3109Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Empty_3109,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(EmptyName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5167); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3110Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_3110,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5168); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3111Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_3111,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5169); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3112Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.RepeatUntil_3112,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RepeatUntilName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5220); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3113Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ForEach_3113,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ForEachName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5207); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3089Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Receive_3089,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ReceiveName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5148); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3090Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.RepeatUntil_3090,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RepeatUntilName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5149); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3151Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Invoke_3151,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(InvokeName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5208); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3152Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_3152,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5209); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3153Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_3153,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5210); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3154Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_3154,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5211); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3155Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Receive_3155,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ReceiveName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5212); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3156Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Reply_3156,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ReplyName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5213); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3157Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Rethrow_3157,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RethrowName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5214); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3158Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Scope_3158,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ScopeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5215); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3114Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Assign_3114,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(AssignName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5170); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3115Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_3115,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5171); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3116Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_3116,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5172); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3117Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Empty_3117,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(EmptyName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5173); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3118Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_3118,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5174); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3119Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_3119,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5175); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3120Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Scope_3120,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ScopeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5206); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3121Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ForEach_3121,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ForEachName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5194); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3091Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Reply_3091,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ReplyName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5150); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3092Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Rethrow_3092,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RethrowName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5151); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3093Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Scope_3093,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ScopeName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5152); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3140Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Invoke_3140,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(InvokeName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5195); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3141Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_3141,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5196); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3142Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_3142,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5197); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3143Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_3143,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5198); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3144Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Receive_3144,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ReceiveName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5199); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3145Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Reply_3145,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ReplyName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5200); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3146Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Rethrow_3146,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RethrowName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5201); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3147Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Throw_3147,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ThrowName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5202); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3148Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_3148,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5203); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3149Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_3149,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5204); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3150Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.While_3150,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WhileName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5205); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3122Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Assign_3122,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(AssignName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5176); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3123Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_3123,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5177); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3124Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_3124,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5178); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3125Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Empty_3125,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(EmptyName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5179); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3126Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_3126,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5180); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3127Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_3127,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5181); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3176Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Flow_3176,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(FlowName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5240); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3070Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Reply_3070,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ReplyName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5129); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3071Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Rethrow_3071,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RethrowName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5130); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3072Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Scope_3072,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ScopeName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5131); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventHandler_3243Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.EventHandler_3243,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5344); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOnAlarm_3244Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OnAlarm_3244,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5319); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3245Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ForEach_3245,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ForEachName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5303); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3094Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Throw_3094,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ThrowName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5153); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3095Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_3095,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5154); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3096Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_3096,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5155); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3097Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.While_3097,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WhileName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5156); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3129Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ForEach_3129,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ForEachName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5182); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3177Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.If_3177, view.getElement() != null ? view
						.getElement() : view, BpeldiagVisualIDRegistry
						.getType(IfName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5239); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3167Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Receive_3167,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ReceiveName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5226); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3168Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.RepeatUntil_3168,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RepeatUntilName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5227); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3159Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Throw_3159,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ThrowName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5216); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3160Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_3160,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5217); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3161Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_3161,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5218); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3162Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.While_3162,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WhileName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5219); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3130Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Invoke_3130,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(InvokeName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5183); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3131Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_3131,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5184); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3132Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_3132,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5185); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3133Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_3133,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5186); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3134Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Receive_3134,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ReceiveName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5187); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3178Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.RepeatUntil_3178,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RepeatUntilName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5238); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3135Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Reply_3135,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ReplyName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5188); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3136Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Rethrow_3136,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RethrowName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5189); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3179Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Scope_3179,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ScopeName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5236); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3180Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Sequence_3180,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(SequenceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5237); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3033Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Assign_3033,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(AssignName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5093); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3034Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_3034,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5094); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3035Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_3035,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5095); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3036Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Empty_3036,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(EmptyName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5096); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3037Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_3037,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5097); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3038Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_3038,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5098); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3039Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Flow_3039,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(FlowName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5099); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3073Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Throw_3073,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ThrowName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5132); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3074Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_3074,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5133); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3075Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_3075,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5134); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3076Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.While_3076,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WhileName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5135); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3137Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Throw_3137,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ThrowName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5190); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3138Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_3138,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5191); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3139Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_3139,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5192); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3128Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.While_3128,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WhileName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5193); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3040Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ForEach_3040,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ForEachName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5100); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3032Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.If_3032, view.getElement() != null ? view
						.getElement() : view, BpeldiagVisualIDRegistry
						.getType(IfName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3169Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Reply_3169,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ReplyName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5228); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3170Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Rethrow_3170,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RethrowName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5229); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3171Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Scope_3171,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ScopeName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5230); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3172Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Throw_3172,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ThrowName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5231); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3173Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_3173,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5232); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3174Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_3174,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5233); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3175Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.While_3175,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WhileName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5234); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getElseIf_3246Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ElseIf_3246,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5302); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3181Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Assign_3181,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(AssignName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5241); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3182Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_3182,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5242); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3183Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_3183,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5243); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3184Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Empty_3184,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(EmptyName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5244); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3185Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_3185,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5245); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3186Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_3186,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5246); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3187Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Flow_3187,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(FlowName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5247); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3188Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ForEach_3188,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ForEachName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5248); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3189Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.If_3189, view.getElement() != null ? view
						.getElement() : view, BpeldiagVisualIDRegistry
						.getType(IfName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5249); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getElse_3247Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Else_3247,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5301); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3204Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Assign_3204,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(AssignName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5265); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3205Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_3205,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5266); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3206Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_3206,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5267); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3207Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Empty_3207,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(EmptyName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5268); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3208Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_3208,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5269); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3209Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_3209,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5270); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3210Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Flow_3210,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(FlowName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5271); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3211Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ForEach_3211,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ForEachName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5272); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3212Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.If_3212, view.getElement() != null ? view
						.getElement() : view, BpeldiagVisualIDRegistry
						.getType(IfName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5273); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3213Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Invoke_3213,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(InvokeName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5274); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3214Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_3214,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5275); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3215Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_3215,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5276); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3216Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_3216,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5277); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3217Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Receive_3217,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ReceiveName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5278); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3218Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.RepeatUntil_3218,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RepeatUntilName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5279); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3219Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Reply_3219,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ReplyName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5280); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3220Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Rethrow_3220,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RethrowName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5281); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3221Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Scope_3221,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ScopeName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5282); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3222Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Sequence_3222,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(SequenceName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5283); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3041Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Invoke_3041,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(InvokeName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5101); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3042Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_3042,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5102); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3043Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_3043,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5103); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3044Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_3044,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5104); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3045Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Receive_3045,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ReceiveName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5105); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3046Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.RepeatUntil_3046,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RepeatUntilName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5106); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3047Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Reply_3047,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ReplyName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5107); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3048Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Rethrow_3048,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RethrowName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5108); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3049Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Scope_3049,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ScopeName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5109); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3050Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Sequence_3050,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(SequenceName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5114); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3051Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Throw_3051,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ThrowName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5110); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3052Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_3052,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5111); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3053Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_3053,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5112); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3054Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.While_3054,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WhileName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5113); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3223Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Throw_3223,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ThrowName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5284); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3224Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_3224,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5285); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3225Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_3225,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5286); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3226Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.While_3226,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WhileName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5287); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3190Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Invoke_3190,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(InvokeName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5250); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3191Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_3191,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5251); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3192Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_3192,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5252); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3193Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_3193,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5253); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3194Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Receive_3194,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ReceiveName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5254); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3195Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.RepeatUntil_3195,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RepeatUntilName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5255); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3196Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Reply_3196,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ReplyName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5256); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3197Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Rethrow_3197,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RethrowName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5257); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3198Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Scope_3198,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ScopeName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5258); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3199Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Sequence_3199,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(SequenceName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5259); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3200Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Throw_3200,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ThrowName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5260); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3201Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_3201,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5261); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3202Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_3202,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5262); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3203Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.While_3203,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(WhileName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5263); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3248Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.If_3248, view.getElement() != null ? view
						.getElement() : view, BpeldiagVisualIDRegistry
						.getType(IfName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5304); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3249Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Invoke_3249,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(InvokeName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5305); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3250Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_3250,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5306); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3251Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_3251,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5307); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3252Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_3252,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5308); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3253Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Receive_3253,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ReceiveName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5309); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3254Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.RepeatUntil_3254,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RepeatUntilName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5310); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3255Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Reply_3255,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ReplyName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5311); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3256Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Rethrow_3256,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RethrowName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5312); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3257Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Scope_3257,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ScopeName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5313); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3258Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Sequence_3258,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(SequenceName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5314); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3259Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Throw_3259,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ThrowName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5315); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3260Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_3260,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5316); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3261Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_3261,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5317); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3262Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.While_3262,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(WhileName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5318); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOnEvent_3263Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OnEvent_3263,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5343); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssign_3264Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Assign_3264,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(AssignName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5320); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensate_3265Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Compensate_3265,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5321); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompensateScope_3266Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.CompensateScope_3266,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(CompensateScopeName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5322); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmpty_3267Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Empty_3267,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(EmptyName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5323); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExit_3268Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Exit_3268,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(ExitName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5324); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtensionActivity_3269Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ExtensionActivity_3269,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ExtensionActivityName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5325); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlow_3270Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Flow_3270,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(FlowName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5326); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3271Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ForEach_3271,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ForEachName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5327); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3272Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.If_3272, view.getElement() != null ? view
						.getElement() : view, BpeldiagVisualIDRegistry
						.getType(IfName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5328); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3273Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Invoke_3273,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(InvokeName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5329); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3274Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_3274,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5330); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3275Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_3275,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5331); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3276Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_3276,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5332); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3277Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Receive_3277,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ReceiveName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5333); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3278Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.RepeatUntil_3278,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RepeatUntilName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5334); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3279Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Reply_3279,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ReplyName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5335); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3280Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Rethrow_3280,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RethrowName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5336); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3281Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Scope_3281,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ScopeName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5337); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3282Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Sequence_3282,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(SequenceName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5338); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3283Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Throw_3283,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ThrowName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5339); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3284Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_3284,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5340); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3285Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_3285,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5341); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3286Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.While_3286,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(WhileName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5342); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3287Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ForEach_3287,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ForEachName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5346); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3288Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.If_3288, view.getElement() != null ? view
						.getElement() : view, BpeldiagVisualIDRegistry
						.getType(IfName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5347); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3289Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Invoke_3289,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(InvokeName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5348); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3290Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_3290,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5349); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3291Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_3291,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5350); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3292Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_3292,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5351); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3293Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Receive_3293,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ReceiveName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5352); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3294Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.RepeatUntil_3294,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RepeatUntilName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5353); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3295Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Reply_3295,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ReplyName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5354); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3296Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Rethrow_3296,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RethrowName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5355); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3297Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Scope_3297,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ScopeName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5356); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3298Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Sequence_3298,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(SequenceName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5357); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3299Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Throw_3299,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ThrowName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5358); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3300Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_3300,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5359); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3301Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_3301,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5360); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3302Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.While_3302,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(WhileName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5361); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForEach_3010Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.ForEach_3010,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ForEachName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3011Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.If_3011, view.getElement() != null ? view
						.getElement() : view, BpeldiagVisualIDRegistry
						.getType(IfName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvoke_3012Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Invoke_3012,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(InvokeName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueActivity_3013Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.OpaqueActivity_3013,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(OpaqueActivityName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivity_3014Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivity_3014,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(PartnerActivityName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPick_3015Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Pick_3015,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(PickName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReceive_3016Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Receive_3016,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ReceiveName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatUntil_3017Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.RepeatUntil_3017,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RepeatUntilName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReply_3018Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Reply_3018,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ReplyName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRethrow_3019Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Rethrow_3019,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(RethrowName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScope_3020Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Scope_3020,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ScopeName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3002Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Sequence_3002,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(SequenceName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrow_3021Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.Throw_3021,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(ThrowName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValidate_3022Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Validate_3022,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(ValidateName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWait_3023Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.Wait_3023,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry.getType(WaitName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3024Text(View view) {
		IParser parser = BpeldiagParserProvider
				.getParser(BpeldiagElementTypes.While_3024,
						view.getElement() != null ? view.getElement() : view,
						BpeldiagVisualIDRegistry
								.getType(WhileName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventHandler_3303Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.EventHandler_3303,
				view.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5365); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPartnerActivityOperation_4001Text(View view) {
		IParser parser = BpeldiagParserProvider.getParser(
				BpeldiagElementTypes.PartnerActivityOperation_4001, view
						.getElement() != null ? view.getElement() : view,
				BpeldiagVisualIDRegistry
						.getType(WrappingLabel15EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BpeldiagDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
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
		return ProcessContainerEditPart.MODEL_ID
				.equals(BpeldiagVisualIDRegistry.getModelID(view));
	}

}
