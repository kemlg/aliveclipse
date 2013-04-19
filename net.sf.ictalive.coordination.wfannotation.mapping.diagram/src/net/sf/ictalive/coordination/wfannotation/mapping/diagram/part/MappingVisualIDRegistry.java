package net.sf.ictalive.coordination.wfannotation.mapping.diagram.part;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer;
import net.sf.ictalive.coordination.wfannotation.mapping.MappingPackage;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.*;
import net.sf.ictalive.owls.process.ProcessPackage;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MappingVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.sf.ictalive.coordination.wfannotation.mapping.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MappingContainerEditPart.MODEL_ID.equals(view.getType())) {
				return MappingContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				MappingDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MappingPackage.eINSTANCE.getMappingContainer().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((MappingContainer) domainElement)) {
			return MappingContainerEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry
				.getModelID(containerView);
		if (!MappingContainerEditPart.MODEL_ID.equals(containerModelID)
				&& !"bpel".equals(containerModelID) && !"actions".equals(containerModelID)) { //$NON-NLS-1$ //$NON-NLS-2$
			return -1;
		}
		int containerVisualID;
		if (MappingContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MappingContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ProcessProcessCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return AssignEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScopeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return EmptyEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return ExitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return FlowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandler2EditPart.VISUAL_ID;
			}
			break;
		case FlowFlowCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEachEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return ReceiveEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			break;
		case FlowFlowCompartment2EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEachEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return ReceiveEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			break;
		case ForEachForEachCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return PickEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			break;
		case ForEachForEachCompartment2EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return PickEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElseIf().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElse().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartment2EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElseIf().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElse().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			break;
		case ForEachForEachCompartment3EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return PickEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			break;
		case PickPickCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarmEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return OnMessageEditPart.VISUAL_ID;
			}
			break;
		case OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While10EditPart.VISUAL_ID;
			}
			break;
		case FlowFlowCompartment3EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEachEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return ReceiveEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartment3EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElseIf().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElse().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			break;
		case PickPickCompartment2EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarmEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return OnMessageEditPart.VISUAL_ID;
			}
			break;
		case OnMessageOnMessageCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While12EditPart.VISUAL_ID;
			}
			break;
		case FlowFlowCompartment4EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEachEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return ReceiveEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			break;
		case PickPickCompartment3EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarmEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return OnMessageEditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplyEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return RethrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return ScopeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplyEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return RethrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return ScopeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			break;
		case ForEachForEachCompartment4EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return PickEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplyEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return RethrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return ScopeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			break;
		case PickPickCompartment4EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarmEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return OnMessageEditPart.VISUAL_ID;
			}
			break;
		case ScopeScopeCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return WaitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandlerEditPart.VISUAL_ID;
			}
			break;
		case ScopeScopeCompartment2EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return WaitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandlerEditPart.VISUAL_ID;
			}
			break;
		case ForEachForEachCompartment5EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return PickEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			break;
		case ScopeScopeCompartment3EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return WaitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandlerEditPart.VISUAL_ID;
			}
			break;
		case PickPickCompartment5EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarmEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return OnMessageEditPart.VISUAL_ID;
			}
			break;
		case WhileWhileCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			break;
		case FlowFlowCompartment5EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEachEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return ReceiveEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			break;
		case ScopeScopeCompartment4EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return WaitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandlerEditPart.VISUAL_ID;
			}
			break;
		case EventHandlerEventHandlerCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarm2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnEvent().isSuperTypeOf(
					domainElement.eClass())) {
				return OnEventEditPart.VISUAL_ID;
			}
			break;
		case OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While10EditPart.VISUAL_ID;
			}
			break;
		case ForEachForEachCompartment6EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return PickEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileCompartment2EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			break;
		case ForEachForEachCompartment7EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return PickEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartment4EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElseIf().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElse().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplyEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return RethrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return ScopeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileCompartment3EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			break;
		case PickPickCompartment6EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarmEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return OnMessageEditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplyEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return RethrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return ScopeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			break;
		case ScopeScopeCompartment5EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return WaitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandlerEditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While7EditPart.VISUAL_ID;
			}
			break;
		case FlowFlowCompartment6EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEachEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return ReceiveEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileCompartment4EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileCompartment5EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			break;
		case ForEachForEachCompartment8EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return PickEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartment5EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElseIf().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElse().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			break;
		case ScopeScopeCompartment6EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return WaitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandlerEditPart.VISUAL_ID;
			}
			break;
		case WhileWhileCompartment6EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			break;
		case ElseIfEliseIfCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While9EditPart.VISUAL_ID;
			}
			break;
		case FlowFlowCompartment7EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEachEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return ReceiveEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			break;
		case ForEachForEachCompartment9EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return PickEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartment6EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElseIf().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElse().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			break;
		case ElseElseCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity12EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While8EditPart.VISUAL_ID;
			}
			break;
		case FlowFlowCompartment8EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEachEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return ReceiveEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			break;
		case ForEachForEachCompartment10EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return PickEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartment7EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElseIf().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElse().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			break;
		case PickPickCompartment7EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarmEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return OnMessageEditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplyEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return RethrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return ScopeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			break;
		case ScopeScopeCompartment7EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return WaitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandlerEditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceCompartment2EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While7EditPart.VISUAL_ID;
			}
			break;
		case PickPickCompartment8EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarmEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return OnMessageEditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplyEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return RethrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return ScopeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			break;
		case ScopeScopeCompartment8EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return WaitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandlerEditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceCompartment3EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While7EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileCompartment7EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileCompartment8EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			break;
		case PickPickCompartment9EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarmEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return OnMessageEditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplyEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return RethrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return ScopeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			break;
		case ScopeScopeCompartment9EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return WaitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandlerEditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceCompartment4EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While7EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileCompartment9EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartment8EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElseIf().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElse().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			break;
		case PickPickCompartment10EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarmEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return OnMessageEditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplyEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return RethrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return ScopeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			break;
		case ScopeScopeCompartment10EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return WaitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandlerEditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceCompartment5EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While7EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileCompartment10EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			break;
		case OnEventOnEventCompartmentEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity13EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait11EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While11EditPart.VISUAL_ID;
			}
			break;
		case FlowFlowCompartment9EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEachEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return ReceiveEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			break;
		case ForEachForEachCompartment11EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return PickEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartment9EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElseIf().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElse().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			break;
		case PickPickCompartment11EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarmEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return OnMessageEditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplyEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return RethrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return ScopeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			break;
		case ScopeScopeCompartment11EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return WaitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandlerEditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceCompartment6EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While7EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileCompartment11EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			break;
		case ForEachForEachCompartment12EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return PickEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartment10EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElseIf().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElse().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			break;
		case PickPickCompartment12EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarmEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return OnMessageEditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplyEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return RethrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return ScopeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			break;
		case ScopeScopeCompartment12EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return WaitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandlerEditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceCompartment7EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While7EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileCompartment12EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			break;
		case ForEachForEachCompartment13EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivityEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return PickEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartment11EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElseIf().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getElse().isSuperTypeOf(
					domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			break;
		case PickPickCompartment13EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarmEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return OnMessageEditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplyEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return RethrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return ScopeEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			break;
		case ScopeScopeCompartment13EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow3EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrowEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return WaitEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEventHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return EventHandlerEditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceCompartment8EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity10EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope8EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While7EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileCompartment13EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getAssign().isSuperTypeOf(
					domainElement.eClass())) {
				return Assign9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensate().isSuperTypeOf(
					domainElement.eClass())) {
				return Compensate9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getCompensateScope().isSuperTypeOf(
					domainElement.eClass())) {
				return CompensateScope9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getEmpty().isSuperTypeOf(
					domainElement.eClass())) {
				return Empty9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExit().isSuperTypeOf(
					domainElement.eClass())) {
				return Exit9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getExtensionActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtensionActivity9EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getFlow().isSuperTypeOf(
					domainElement.eClass())) {
				return Flow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getForEach().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEach7EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getInvoke().isSuperTypeOf(
					domainElement.eClass())) {
				return Invoke6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOpaqueActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPartnerActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return PartnerActivity6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getPick().isSuperTypeOf(
					domainElement.eClass())) {
				return Pick6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReceive().isSuperTypeOf(
					domainElement.eClass())) {
				return Receive6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getReply().isSuperTypeOf(
					domainElement.eClass())) {
				return Reply5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getRethrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Rethrow5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getScope().isSuperTypeOf(
					domainElement.eClass())) {
				return Scope5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getThrow().isSuperTypeOf(
					domainElement.eClass())) {
				return Throw5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getValidate().isSuperTypeOf(
					domainElement.eClass())) {
				return Validate5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWait().isSuperTypeOf(
					domainElement.eClass())) {
				return Wait5EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			break;
		case EventHandlerEventHandlerCompartment2EditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getOnAlarm().isSuperTypeOf(
					domainElement.eClass())) {
				return OnAlarm2EditPart.VISUAL_ID;
			}
			if (BPELPackage.eINSTANCE.getOnEvent().isSuperTypeOf(
					domainElement.eClass())) {
				return OnEventEditPart.VISUAL_ID;
			}
			break;
		case MappingContainerEditPart.VISUAL_ID:
			if (BPELPackage.eINSTANCE.getProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return ProcessEditPart.VISUAL_ID;
			}
			if (ActionsPackage.eINSTANCE.getAtomicAction().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicActionEditPart.VISUAL_ID;
			}
			if (ActionsPackage.eINSTANCE.getCompositeAction().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeActionEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrderEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBagEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return PerformEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return ChoiceEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getControlConstructList()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructListEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntilEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhileEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElseEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoinEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry
				.getModelID(containerView);
		if (!MappingContainerEditPart.MODEL_ID.equals(containerModelID)
				&& !"bpel".equals(containerModelID) && !"actions".equals(containerModelID)) { //$NON-NLS-1$ //$NON-NLS-2$
			return false;
		}
		int containerVisualID;
		if (MappingContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MappingContainerEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ProcessEditPart.VISUAL_ID:
			if (ProcessNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcessProcessCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicActionEditPart.VISUAL_ID:
			if (AtomicActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeActionEditPart.VISUAL_ID:
			if (CompositeActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeActionCompositeActionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilEditPart.VISUAL_ID:
			if (RepeatUntilRepeatUntilCompartment13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileEditPart.VISUAL_ID:
			if (RepeatWhileRepeatWhileCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseEditPart.VISUAL_ID:
			if (IfThenElseIfThenElseCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssignEditPart.VISUAL_ID:
			if (AssignNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateEditPart.VISUAL_ID:
			if (CompensateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateScopeEditPart.VISUAL_ID:
			if (CompensateScopeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EmptyEditPart.VISUAL_ID:
			if (EmptyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExitEditPart.VISUAL_ID:
			if (ExitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionActivityEditPart.VISUAL_ID:
			if (ExtensionActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FlowEditPart.VISUAL_ID:
			if (FlowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFlowCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign2EditPart.VISUAL_ID:
			if (AssignName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Compensate2EditPart.VISUAL_ID:
			if (CompensateName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateScope2EditPart.VISUAL_ID:
			if (CompensateScopeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Empty2EditPart.VISUAL_ID:
			if (EmptyName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exit2EditPart.VISUAL_ID:
			if (ExitName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionActivity2EditPart.VISUAL_ID:
			if (ExtensionActivityName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Flow2EditPart.VISUAL_ID:
			if (FlowName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFlowCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachEditPart.VISUAL_ID:
			if (ForEachNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachForEachCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign3EditPart.VISUAL_ID:
			if (AssignName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Compensate3EditPart.VISUAL_ID:
			if (CompensateName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateScope3EditPart.VISUAL_ID:
			if (CompensateScopeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Empty3EditPart.VISUAL_ID:
			if (EmptyName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exit3EditPart.VISUAL_ID:
			if (ExitName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionActivity3EditPart.VISUAL_ID:
			if (ExtensionActivityName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEach2EditPart.VISUAL_ID:
			if (ForEachName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachForEachCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfEditPart.VISUAL_ID:
			if (IfNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign4EditPart.VISUAL_ID:
			if (AssignName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Compensate4EditPart.VISUAL_ID:
			if (CompensateName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateScope4EditPart.VISUAL_ID:
			if (CompensateScopeName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Empty4EditPart.VISUAL_ID:
			if (EmptyName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exit4EditPart.VISUAL_ID:
			if (ExitName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionActivity4EditPart.VISUAL_ID:
			if (ExtensionActivityName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If2EditPart.VISUAL_ID:
			if (IfName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEach3EditPart.VISUAL_ID:
			if (ForEachName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachForEachCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InvokeEditPart.VISUAL_ID:
			if (InvokeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActivityEditPart.VISUAL_ID:
			if (OpaqueActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartnerActivityEditPart.VISUAL_ID:
			if (PartnerActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickEditPart.VISUAL_ID:
			if (PickNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickPickCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnAlarmEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign5EditPart.VISUAL_ID:
			if (AssignName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Compensate5EditPart.VISUAL_ID:
			if (CompensateName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateScope5EditPart.VISUAL_ID:
			if (CompensateScopeName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Empty5EditPart.VISUAL_ID:
			if (EmptyName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exit5EditPart.VISUAL_ID:
			if (ExitName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionActivity5EditPart.VISUAL_ID:
			if (ExtensionActivityName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Flow3EditPart.VISUAL_ID:
			if (FlowName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFlowCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If3EditPart.VISUAL_ID:
			if (IfName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Invoke2EditPart.VISUAL_ID:
			if (InvokeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActivity2EditPart.VISUAL_ID:
			if (OpaqueActivityName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartnerActivity2EditPart.VISUAL_ID:
			if (PartnerActivityName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pick2EditPart.VISUAL_ID:
			if (PickName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickPickCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnMessageEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageOnMessageCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign6EditPart.VISUAL_ID:
			if (AssignName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Compensate6EditPart.VISUAL_ID:
			if (CompensateName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateScope6EditPart.VISUAL_ID:
			if (CompensateScopeName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Empty6EditPart.VISUAL_ID:
			if (EmptyName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exit6EditPart.VISUAL_ID:
			if (ExitName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionActivity6EditPart.VISUAL_ID:
			if (ExtensionActivityName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Flow4EditPart.VISUAL_ID:
			if (FlowName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFlowCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Invoke3EditPart.VISUAL_ID:
			if (InvokeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActivity3EditPart.VISUAL_ID:
			if (OpaqueActivityName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartnerActivity3EditPart.VISUAL_ID:
			if (PartnerActivityName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pick3EditPart.VISUAL_ID:
			if (PickName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickPickCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReceiveEditPart.VISUAL_ID:
			if (ReceiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil2EditPart.VISUAL_ID:
			if (RepeatUntilNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign7EditPart.VISUAL_ID:
			if (AssignName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Compensate7EditPart.VISUAL_ID:
			if (CompensateName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateScope7EditPart.VISUAL_ID:
			if (CompensateScopeName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Empty7EditPart.VISUAL_ID:
			if (EmptyName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exit7EditPart.VISUAL_ID:
			if (ExitName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionActivity7EditPart.VISUAL_ID:
			if (ExtensionActivityName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil3EditPart.VISUAL_ID:
			if (RepeatUntilName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEach4EditPart.VISUAL_ID:
			if (ForEachName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachForEachCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Receive2EditPart.VISUAL_ID:
			if (ReceiveName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil4EditPart.VISUAL_ID:
			if (RepeatUntilName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Invoke4EditPart.VISUAL_ID:
			if (InvokeName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActivity4EditPart.VISUAL_ID:
			if (OpaqueActivityName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartnerActivity4EditPart.VISUAL_ID:
			if (PartnerActivityName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pick4EditPart.VISUAL_ID:
			if (PickName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickPickCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Receive3EditPart.VISUAL_ID:
			if (ReceiveName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReplyEditPart.VISUAL_ID:
			if (ReplyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RethrowEditPart.VISUAL_ID:
			if (RethrowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeEditPart.VISUAL_ID:
			if (ScopeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeScopeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign8EditPart.VISUAL_ID:
			if (AssignName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Compensate8EditPart.VISUAL_ID:
			if (CompensateName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateScope8EditPart.VISUAL_ID:
			if (CompensateScopeName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Empty8EditPart.VISUAL_ID:
			if (EmptyName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exit8EditPart.VISUAL_ID:
			if (ExitName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionActivity8EditPart.VISUAL_ID:
			if (ExtensionActivityName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scope2EditPart.VISUAL_ID:
			if (ScopeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeScopeCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEach5EditPart.VISUAL_ID:
			if (ForEachName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachForEachCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Reply2EditPart.VISUAL_ID:
			if (ReplyName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rethrow2EditPart.VISUAL_ID:
			if (RethrowName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scope3EditPart.VISUAL_ID:
			if (ScopeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeScopeCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Invoke5EditPart.VISUAL_ID:
			if (InvokeName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActivity5EditPart.VISUAL_ID:
			if (OpaqueActivityName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartnerActivity5EditPart.VISUAL_ID:
			if (PartnerActivityName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pick5EditPart.VISUAL_ID:
			if (PickName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickPickCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Receive4EditPart.VISUAL_ID:
			if (ReceiveName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Reply3EditPart.VISUAL_ID:
			if (ReplyName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rethrow3EditPart.VISUAL_ID:
			if (RethrowName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ThrowEditPart.VISUAL_ID:
			if (ThrowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValidateEditPart.VISUAL_ID:
			if (ValidateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WaitEditPart.VISUAL_ID:
			if (WaitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileEditPart.VISUAL_ID:
			if (WhileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign9EditPart.VISUAL_ID:
			if (AssignName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Compensate9EditPart.VISUAL_ID:
			if (CompensateName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateScope9EditPart.VISUAL_ID:
			if (CompensateScopeName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Empty9EditPart.VISUAL_ID:
			if (EmptyName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exit9EditPart.VISUAL_ID:
			if (ExitName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionActivity9EditPart.VISUAL_ID:
			if (ExtensionActivityName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Flow5EditPart.VISUAL_ID:
			if (FlowName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFlowCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Reply4EditPart.VISUAL_ID:
			if (ReplyName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rethrow4EditPart.VISUAL_ID:
			if (RethrowName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scope4EditPart.VISUAL_ID:
			if (ScopeName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeScopeCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventHandlerEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEventHandlerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnAlarm2EditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEach6EditPart.VISUAL_ID:
			if (ForEachName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachForEachCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Throw2EditPart.VISUAL_ID:
			if (ThrowName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate2EditPart.VISUAL_ID:
			if (ValidateName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wait2EditPart.VISUAL_ID:
			if (WaitName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While2EditPart.VISUAL_ID:
			if (WhileName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEach7EditPart.VISUAL_ID:
			if (ForEachName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachForEachCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If4EditPart.VISUAL_ID:
			if (IfName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Receive5EditPart.VISUAL_ID:
			if (ReceiveName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil5EditPart.VISUAL_ID:
			if (RepeatUntilName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Throw3EditPart.VISUAL_ID:
			if (ThrowName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate3EditPart.VISUAL_ID:
			if (ValidateName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wait3EditPart.VISUAL_ID:
			if (WaitName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While3EditPart.VISUAL_ID:
			if (WhileName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Invoke6EditPart.VISUAL_ID:
			if (InvokeName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActivity6EditPart.VISUAL_ID:
			if (OpaqueActivityName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartnerActivity6EditPart.VISUAL_ID:
			if (PartnerActivityName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pick6EditPart.VISUAL_ID:
			if (PickName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickPickCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Receive6EditPart.VISUAL_ID:
			if (ReceiveName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil6EditPart.VISUAL_ID:
			if (RepeatUntilName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Reply5EditPart.VISUAL_ID:
			if (ReplyName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rethrow5EditPart.VISUAL_ID:
			if (RethrowName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scope5EditPart.VISUAL_ID:
			if (ScopeName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeScopeCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence2EditPart.VISUAL_ID:
			if (SequenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign10EditPart.VISUAL_ID:
			if (AssignName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Compensate10EditPart.VISUAL_ID:
			if (CompensateName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateScope10EditPart.VISUAL_ID:
			if (CompensateScopeName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Empty10EditPart.VISUAL_ID:
			if (EmptyName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exit10EditPart.VISUAL_ID:
			if (ExitName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionActivity10EditPart.VISUAL_ID:
			if (ExtensionActivityName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Flow6EditPart.VISUAL_ID:
			if (FlowName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFlowCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Throw4EditPart.VISUAL_ID:
			if (ThrowName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate4EditPart.VISUAL_ID:
			if (ValidateName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wait4EditPart.VISUAL_ID:
			if (WaitName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While4EditPart.VISUAL_ID:
			if (WhileName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Throw5EditPart.VISUAL_ID:
			if (ThrowName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate5EditPart.VISUAL_ID:
			if (ValidateName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wait5EditPart.VISUAL_ID:
			if (WaitName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While5EditPart.VISUAL_ID:
			if (WhileName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEach8EditPart.VISUAL_ID:
			if (ForEachName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachForEachCompartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If5EditPart.VISUAL_ID:
			if (IfName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Reply6EditPart.VISUAL_ID:
			if (ReplyName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rethrow6EditPart.VISUAL_ID:
			if (RethrowName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scope6EditPart.VISUAL_ID:
			if (ScopeName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeScopeCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Throw6EditPart.VISUAL_ID:
			if (ThrowName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate6EditPart.VISUAL_ID:
			if (ValidateName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wait6EditPart.VISUAL_ID:
			if (WaitName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While6EditPart.VISUAL_ID:
			if (WhileName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElseIfEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseIfEliseIfCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign11EditPart.VISUAL_ID:
			if (AssignName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Compensate11EditPart.VISUAL_ID:
			if (CompensateName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateScope11EditPart.VISUAL_ID:
			if (CompensateScopeName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Empty11EditPart.VISUAL_ID:
			if (EmptyName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exit11EditPart.VISUAL_ID:
			if (ExitName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionActivity11EditPart.VISUAL_ID:
			if (ExtensionActivityName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Flow7EditPart.VISUAL_ID:
			if (FlowName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFlowCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEach9EditPart.VISUAL_ID:
			if (ForEachName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachForEachCompartment9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If6EditPart.VISUAL_ID:
			if (IfName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElseEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseElseCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign12EditPart.VISUAL_ID:
			if (AssignName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Compensate12EditPart.VISUAL_ID:
			if (CompensateName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateScope12EditPart.VISUAL_ID:
			if (CompensateScopeName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Empty12EditPart.VISUAL_ID:
			if (EmptyName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exit12EditPart.VISUAL_ID:
			if (ExitName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionActivity12EditPart.VISUAL_ID:
			if (ExtensionActivityName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Flow8EditPart.VISUAL_ID:
			if (FlowName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFlowCompartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEach10EditPart.VISUAL_ID:
			if (ForEachName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachForEachCompartment10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If7EditPart.VISUAL_ID:
			if (IfName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Invoke7EditPart.VISUAL_ID:
			if (InvokeName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActivity7EditPart.VISUAL_ID:
			if (OpaqueActivityName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartnerActivity7EditPart.VISUAL_ID:
			if (PartnerActivityName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pick7EditPart.VISUAL_ID:
			if (PickName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickPickCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Receive7EditPart.VISUAL_ID:
			if (ReceiveName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil7EditPart.VISUAL_ID:
			if (RepeatUntilName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Reply7EditPart.VISUAL_ID:
			if (ReplyName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rethrow7EditPart.VISUAL_ID:
			if (RethrowName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scope7EditPart.VISUAL_ID:
			if (ScopeName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeScopeCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence3EditPart.VISUAL_ID:
			if (SequenceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Invoke8EditPart.VISUAL_ID:
			if (InvokeName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActivity8EditPart.VISUAL_ID:
			if (OpaqueActivityName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartnerActivity8EditPart.VISUAL_ID:
			if (PartnerActivityName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pick8EditPart.VISUAL_ID:
			if (PickName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickPickCompartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Receive8EditPart.VISUAL_ID:
			if (ReceiveName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil8EditPart.VISUAL_ID:
			if (RepeatUntilName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Reply8EditPart.VISUAL_ID:
			if (ReplyName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rethrow8EditPart.VISUAL_ID:
			if (RethrowName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scope8EditPart.VISUAL_ID:
			if (ScopeName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeScopeCompartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence4EditPart.VISUAL_ID:
			if (SequenceName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Throw7EditPart.VISUAL_ID:
			if (ThrowName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate7EditPart.VISUAL_ID:
			if (ValidateName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wait7EditPart.VISUAL_ID:
			if (WaitName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While7EditPart.VISUAL_ID:
			if (WhileName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Throw8EditPart.VISUAL_ID:
			if (ThrowName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate8EditPart.VISUAL_ID:
			if (ValidateName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wait8EditPart.VISUAL_ID:
			if (WaitName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While8EditPart.VISUAL_ID:
			if (WhileName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileCompartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Invoke9EditPart.VISUAL_ID:
			if (InvokeName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActivity9EditPart.VISUAL_ID:
			if (OpaqueActivityName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartnerActivity9EditPart.VISUAL_ID:
			if (PartnerActivityName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pick9EditPart.VISUAL_ID:
			if (PickName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickPickCompartment9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Receive9EditPart.VISUAL_ID:
			if (ReceiveName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil9EditPart.VISUAL_ID:
			if (RepeatUntilName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Reply9EditPart.VISUAL_ID:
			if (ReplyName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rethrow9EditPart.VISUAL_ID:
			if (RethrowName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scope9EditPart.VISUAL_ID:
			if (ScopeName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeScopeCompartment9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence5EditPart.VISUAL_ID:
			if (SequenceName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Throw9EditPart.VISUAL_ID:
			if (ThrowName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate9EditPart.VISUAL_ID:
			if (ValidateName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wait9EditPart.VISUAL_ID:
			if (WaitName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While9EditPart.VISUAL_ID:
			if (WhileName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileCompartment9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If8EditPart.VISUAL_ID:
			if (IfName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Invoke10EditPart.VISUAL_ID:
			if (InvokeName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActivity10EditPart.VISUAL_ID:
			if (OpaqueActivityName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartnerActivity10EditPart.VISUAL_ID:
			if (PartnerActivityName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pick10EditPart.VISUAL_ID:
			if (PickName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickPickCompartment10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Receive10EditPart.VISUAL_ID:
			if (ReceiveName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil10EditPart.VISUAL_ID:
			if (RepeatUntilName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Reply10EditPart.VISUAL_ID:
			if (ReplyName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rethrow10EditPart.VISUAL_ID:
			if (RethrowName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scope10EditPart.VISUAL_ID:
			if (ScopeName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeScopeCompartment10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence6EditPart.VISUAL_ID:
			if (SequenceName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Throw10EditPart.VISUAL_ID:
			if (ThrowName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate10EditPart.VISUAL_ID:
			if (ValidateName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wait10EditPart.VISUAL_ID:
			if (WaitName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While10EditPart.VISUAL_ID:
			if (WhileName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileCompartment10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnEventEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnEventOnEventCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign13EditPart.VISUAL_ID:
			if (AssignName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Compensate13EditPart.VISUAL_ID:
			if (CompensateName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompensateScope13EditPart.VISUAL_ID:
			if (CompensateScopeName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Empty13EditPart.VISUAL_ID:
			if (EmptyName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exit13EditPart.VISUAL_ID:
			if (ExitName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionActivity13EditPart.VISUAL_ID:
			if (ExtensionActivityName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Flow9EditPart.VISUAL_ID:
			if (FlowName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFlowCompartment9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEach11EditPart.VISUAL_ID:
			if (ForEachName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachForEachCompartment11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If9EditPart.VISUAL_ID:
			if (IfName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartment9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Invoke11EditPart.VISUAL_ID:
			if (InvokeName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActivity11EditPart.VISUAL_ID:
			if (OpaqueActivityName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartnerActivity11EditPart.VISUAL_ID:
			if (PartnerActivityName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pick11EditPart.VISUAL_ID:
			if (PickName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickPickCompartment11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Receive11EditPart.VISUAL_ID:
			if (ReceiveName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil11EditPart.VISUAL_ID:
			if (RepeatUntilName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Reply11EditPart.VISUAL_ID:
			if (ReplyName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rethrow11EditPart.VISUAL_ID:
			if (RethrowName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scope11EditPart.VISUAL_ID:
			if (ScopeName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeScopeCompartment11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence7EditPart.VISUAL_ID:
			if (SequenceName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Throw11EditPart.VISUAL_ID:
			if (ThrowName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate11EditPart.VISUAL_ID:
			if (ValidateName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wait11EditPart.VISUAL_ID:
			if (WaitName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While11EditPart.VISUAL_ID:
			if (WhileName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileCompartment11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEach12EditPart.VISUAL_ID:
			if (ForEachName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachForEachCompartment12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If10EditPart.VISUAL_ID:
			if (IfName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartment10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Invoke12EditPart.VISUAL_ID:
			if (InvokeName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActivity12EditPart.VISUAL_ID:
			if (OpaqueActivityName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartnerActivity12EditPart.VISUAL_ID:
			if (PartnerActivityName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pick12EditPart.VISUAL_ID:
			if (PickName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickPickCompartment12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Receive12EditPart.VISUAL_ID:
			if (ReceiveName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil12EditPart.VISUAL_ID:
			if (RepeatUntilName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Reply12EditPart.VISUAL_ID:
			if (ReplyName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rethrow12EditPart.VISUAL_ID:
			if (RethrowName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scope12EditPart.VISUAL_ID:
			if (ScopeName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeScopeCompartment12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence8EditPart.VISUAL_ID:
			if (SequenceName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Throw12EditPart.VISUAL_ID:
			if (ThrowName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate12EditPart.VISUAL_ID:
			if (ValidateName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wait12EditPart.VISUAL_ID:
			if (WaitName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While12EditPart.VISUAL_ID:
			if (WhileName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileCompartment12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEach13EditPart.VISUAL_ID:
			if (ForEachName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachForEachCompartment13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If11EditPart.VISUAL_ID:
			if (IfName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartment11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Invoke13EditPart.VISUAL_ID:
			if (InvokeName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActivity13EditPart.VISUAL_ID:
			if (OpaqueActivityName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PartnerActivity13EditPart.VISUAL_ID:
			if (PartnerActivityName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pick13EditPart.VISUAL_ID:
			if (PickName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickPickCompartment13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Receive13EditPart.VISUAL_ID:
			if (ReceiveName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil13EditPart.VISUAL_ID:
			if (RepeatUntilName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Reply13EditPart.VISUAL_ID:
			if (ReplyName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rethrow13EditPart.VISUAL_ID:
			if (RethrowName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scope13EditPart.VISUAL_ID:
			if (ScopeName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeScopeCompartment13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence9EditPart.VISUAL_ID:
			if (SequenceName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceCompartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Throw13EditPart.VISUAL_ID:
			if (ThrowName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate13EditPart.VISUAL_ID:
			if (ValidateName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Wait13EditPart.VISUAL_ID:
			if (WaitName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While13EditPart.VISUAL_ID:
			if (WhileName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileCompartment13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventHandler2EditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEventHandlerCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcessProcessCompartmentEditPart.VISUAL_ID:
			if (AssignEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmptyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandler2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FlowFlowCompartmentEditPart.VISUAL_ID:
			if (Assign2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReceiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FlowFlowCompartment2EditPart.VISUAL_ID:
			if (Assign2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReceiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachForEachCompartmentEditPart.VISUAL_ID:
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachForEachCompartment2EditPart.VISUAL_ID:
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartmentEditPart.VISUAL_ID:
			if (Assign4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartment2EditPart.VISUAL_ID:
			if (Assign4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachForEachCompartment3EditPart.VISUAL_ID:
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickPickCompartmentEditPart.VISUAL_ID:
			if (OnAlarmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnAlarmOnAlarmCompartmentEditPart.VISUAL_ID:
			if (Assign5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FlowFlowCompartment3EditPart.VISUAL_ID:
			if (Assign2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReceiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartment3EditPart.VISUAL_ID:
			if (Assign4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickPickCompartment2EditPart.VISUAL_ID:
			if (OnAlarmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnMessageOnMessageCompartmentEditPart.VISUAL_ID:
			if (Assign6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FlowFlowCompartment4EditPart.VISUAL_ID:
			if (Assign2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReceiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickPickCompartment3EditPart.VISUAL_ID:
			if (OnAlarmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID:
			if (Assign7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RethrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilCompartment2EditPart.VISUAL_ID:
			if (Assign7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RethrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachForEachCompartment4EditPart.VISUAL_ID:
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilCompartment3EditPart.VISUAL_ID:
			if (Assign7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RethrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickPickCompartment4EditPart.VISUAL_ID:
			if (OnAlarmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeScopeCompartmentEditPart.VISUAL_ID:
			if (Assign8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeScopeCompartment2EditPart.VISUAL_ID:
			if (Assign8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachForEachCompartment5EditPart.VISUAL_ID:
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeScopeCompartment3EditPart.VISUAL_ID:
			if (Assign8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickPickCompartment5EditPart.VISUAL_ID:
			if (OnAlarmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileCompartmentEditPart.VISUAL_ID:
			if (Assign9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FlowFlowCompartment5EditPart.VISUAL_ID:
			if (Assign2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReceiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeScopeCompartment4EditPart.VISUAL_ID:
			if (Assign8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventHandlerEventHandlerCompartmentEditPart.VISUAL_ID:
			if (OnAlarm2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnAlarmOnAlarmCompartment2EditPart.VISUAL_ID:
			if (Assign5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachForEachCompartment6EditPart.VISUAL_ID:
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileCompartment2EditPart.VISUAL_ID:
			if (Assign9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachForEachCompartment7EditPart.VISUAL_ID:
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartment4EditPart.VISUAL_ID:
			if (Assign4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilCompartment4EditPart.VISUAL_ID:
			if (Assign7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RethrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileCompartment3EditPart.VISUAL_ID:
			if (Assign9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickPickCompartment6EditPart.VISUAL_ID:
			if (OnAlarmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilCompartment5EditPart.VISUAL_ID:
			if (Assign7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RethrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeScopeCompartment5EditPart.VISUAL_ID:
			if (Assign8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceCompartmentEditPart.VISUAL_ID:
			if (Assign10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FlowFlowCompartment6EditPart.VISUAL_ID:
			if (Assign2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReceiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileCompartment4EditPart.VISUAL_ID:
			if (Assign9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileCompartment5EditPart.VISUAL_ID:
			if (Assign9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachForEachCompartment8EditPart.VISUAL_ID:
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartment5EditPart.VISUAL_ID:
			if (Assign4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeScopeCompartment6EditPart.VISUAL_ID:
			if (Assign8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileCompartment6EditPart.VISUAL_ID:
			if (Assign9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElseIfEliseIfCompartmentEditPart.VISUAL_ID:
			if (Assign11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FlowFlowCompartment7EditPart.VISUAL_ID:
			if (Assign2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReceiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachForEachCompartment9EditPart.VISUAL_ID:
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartment6EditPart.VISUAL_ID:
			if (Assign4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElseElseCompartmentEditPart.VISUAL_ID:
			if (Assign12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FlowFlowCompartment8EditPart.VISUAL_ID:
			if (Assign2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReceiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachForEachCompartment10EditPart.VISUAL_ID:
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartment7EditPart.VISUAL_ID:
			if (Assign4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickPickCompartment7EditPart.VISUAL_ID:
			if (OnAlarmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilCompartment6EditPart.VISUAL_ID:
			if (Assign7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RethrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeScopeCompartment7EditPart.VISUAL_ID:
			if (Assign8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceCompartment2EditPart.VISUAL_ID:
			if (Assign10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickPickCompartment8EditPart.VISUAL_ID:
			if (OnAlarmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilCompartment7EditPart.VISUAL_ID:
			if (Assign7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RethrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeScopeCompartment8EditPart.VISUAL_ID:
			if (Assign8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceCompartment3EditPart.VISUAL_ID:
			if (Assign10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileCompartment7EditPart.VISUAL_ID:
			if (Assign9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileCompartment8EditPart.VISUAL_ID:
			if (Assign9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickPickCompartment9EditPart.VISUAL_ID:
			if (OnAlarmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilCompartment8EditPart.VISUAL_ID:
			if (Assign7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RethrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeScopeCompartment9EditPart.VISUAL_ID:
			if (Assign8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceCompartment4EditPart.VISUAL_ID:
			if (Assign10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileCompartment9EditPart.VISUAL_ID:
			if (Assign9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartment8EditPart.VISUAL_ID:
			if (Assign4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickPickCompartment10EditPart.VISUAL_ID:
			if (OnAlarmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilCompartment9EditPart.VISUAL_ID:
			if (Assign7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RethrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeScopeCompartment10EditPart.VISUAL_ID:
			if (Assign8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceCompartment5EditPart.VISUAL_ID:
			if (Assign10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileCompartment10EditPart.VISUAL_ID:
			if (Assign9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnEventOnEventCompartmentEditPart.VISUAL_ID:
			if (Assign13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FlowFlowCompartment9EditPart.VISUAL_ID:
			if (Assign2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEachEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReceiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachForEachCompartment11EditPart.VISUAL_ID:
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartment9EditPart.VISUAL_ID:
			if (Assign4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickPickCompartment11EditPart.VISUAL_ID:
			if (OnAlarmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilCompartment10EditPart.VISUAL_ID:
			if (Assign7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RethrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeScopeCompartment11EditPart.VISUAL_ID:
			if (Assign8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceCompartment6EditPart.VISUAL_ID:
			if (Assign10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileCompartment11EditPart.VISUAL_ID:
			if (Assign9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachForEachCompartment12EditPart.VISUAL_ID:
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartment10EditPart.VISUAL_ID:
			if (Assign4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickPickCompartment12EditPart.VISUAL_ID:
			if (OnAlarmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilCompartment11EditPart.VISUAL_ID:
			if (Assign7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RethrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeScopeCompartment12EditPart.VISUAL_ID:
			if (Assign8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceCompartment7EditPart.VISUAL_ID:
			if (Assign10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileCompartment12EditPart.VISUAL_ID:
			if (Assign9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEachForEachCompartment13EditPart.VISUAL_ID:
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartment11EditPart.VISUAL_ID:
			if (Assign4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PickPickCompartment13EditPart.VISUAL_ID:
			if (OnAlarmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilCompartment12EditPart.VISUAL_ID:
			if (Assign7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RethrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScopeScopeCompartment13EditPart.VISUAL_ID:
			if (Assign8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceCompartment8EditPart.VISUAL_ID:
			if (Assign10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileCompartment13EditPart.VISUAL_ID:
			if (Assign9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Compensate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompensateScope9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Empty9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionActivity9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Flow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEach7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invoke6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PartnerActivity6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pick6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Receive6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Reply5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rethrow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scope5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Throw5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Wait5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventHandlerEventHandlerCompartment2EditPart.VISUAL_ID:
			if (OnAlarm2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MappingContainerEditPart.VISUAL_ID:
			if (ProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructBagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PerformEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChoiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeProcessComposedOfEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PerformProcessEditPart.VISUAL_ID:
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoiceComponentsEditPart.VISUAL_ID:
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrderComponentsEditPart.VISUAL_ID:
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceComponentsEditPart.VISUAL_ID:
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagRestEditPart.VISUAL_ID:
			if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructListRestEditPart.VISUAL_ID:
			if (WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseThenEditPart.VISUAL_ID:
			if (WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseElseEditPart.VISUAL_ID:
			if (WrappingLabel17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilUntilProcessEditPart.VISUAL_ID:
			if (WrappingLabel18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileWhileProcessEditPart.VISUAL_ID:
			if (WrappingLabel19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagFirstEditPart.VISUAL_ID:
			if (WrappingLabel20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructListFirstEditPart.VISUAL_ID:
			if (WrappingLabel21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitComponentsEditPart.VISUAL_ID:
			if (WrappingLabel22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoinComponentsEditPart.VISUAL_ID:
			if (WrappingLabel23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MappingPackage.eINSTANCE.getPartnerActivityToAtomicActionMapping()
				.isSuperTypeOf(domainElement.eClass())) {
			return PartnerActivityToAtomicActionMappingEditPart.VISUAL_ID;
		}
		if (MappingPackage.eINSTANCE.getProcessToCompositeActionMapping()
				.isSuperTypeOf(domainElement.eClass())) {
			return ProcessToCompositeActionMappingEditPart.VISUAL_ID;
		}
		if (MappingPackage.eINSTANCE.getSequenceToSequenceMapping()
				.isSuperTypeOf(domainElement.eClass())) {
			return SequenceToSequenceMappingEditPart.VISUAL_ID;
		}
		if (MappingPackage.eINSTANCE.getIfToIfThenElseMapping().isSuperTypeOf(
				domainElement.eClass())) {
			return IfToIfThenElseMappingEditPart.VISUAL_ID;
		}
		if (MappingPackage.eINSTANCE.getWhileToRepeatWhileMapping()
				.isSuperTypeOf(domainElement.eClass())) {
			return WhileToRepeatWhileMappingEditPart.VISUAL_ID;
		}
		if (MappingPackage.eINSTANCE.getRepeatUntilToRepeatUntilMapping()
				.isSuperTypeOf(domainElement.eClass())) {
			return RepeatUntilToRepeatUntilMappingEditPart.VISUAL_ID;
		}
		if (MappingPackage.eINSTANCE.getFlowToSplitJoinMapping().isSuperTypeOf(
				domainElement.eClass())) {
			return FlowToSplitJoinMappingEditPart.VISUAL_ID;
		}
		if (MappingPackage.eINSTANCE.getForToRepeatWhileMapping()
				.isSuperTypeOf(domainElement.eClass())) {
			return ForToRepeatWhileMappingEditPart.VISUAL_ID;
		}
		if (MappingPackage.eINSTANCE.getScopeToCompositeActionMapping()
				.isSuperTypeOf(domainElement.eClass())) {
			return ScopeToCompositeActionMappingEditPart.VISUAL_ID;
		}
		if (MappingPackage.eINSTANCE.getElseIfToIfThenElseMapping()
				.isSuperTypeOf(domainElement.eClass())) {
			return ElseIfToIfThenElseMappingEditPart.VISUAL_ID;
		}
		if (MappingPackage.eINSTANCE.getElseToElseMapping().isSuperTypeOf(
				domainElement.eClass())) {
			return ElseToElseMappingEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(MappingContainer element) {
		return true;
	}

}
