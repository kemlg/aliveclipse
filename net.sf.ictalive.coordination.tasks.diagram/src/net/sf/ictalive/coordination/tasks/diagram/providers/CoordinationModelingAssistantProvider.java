package net.sf.ictalive.coordination.tasks.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AnyOrderEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomListAtomListFigureCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ChoiceEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ClassAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ConditionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructBagEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructListEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataLiteral2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataLiteralEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataRangeAtomDataRangeArgCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataRangeAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DatavaluedPropertyAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DifferentIndividualsAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualPropertyAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputMessageMapEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.OutputEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.PerformEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.SameIndividualAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.SequenceEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskPreconditionCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TasksCollectionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.part.Messages;
import net.sf.ictalive.coordination.tasks.diagram.part.TaskDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class CoordinationModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof TaskEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.InputMessageMap_3057);
			return types;
		}
		if (editPart instanceof ConditionEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.AtomList_3032);
			return types;
		}
		if (editPart instanceof ClassAtomEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(CoordinationElementTypes.IndividualID_3034);
			types.add(CoordinationElementTypes.IndividualVariable_3035);
			return types;
		}
		if (editPart instanceof IndividualPropertyAtomEditPart) {
			ArrayList types = new ArrayList(4);
			types.add(CoordinationElementTypes.IndividualID_3037);
			types.add(CoordinationElementTypes.IndividualVariable_3038);
			types.add(CoordinationElementTypes.IndividualID_3039);
			types.add(CoordinationElementTypes.IndividualVariable_3040);
			return types;
		}
		if (editPart instanceof SameIndividualAtomEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(CoordinationElementTypes.IndividualID_3042);
			types.add(CoordinationElementTypes.IndividualVariable_3043);
			return types;
		}
		if (editPart instanceof DifferentIndividualsAtomEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(CoordinationElementTypes.IndividualID_3045);
			types.add(CoordinationElementTypes.IndividualVariable_3046);
			return types;
		}
		if (editPart instanceof DataRangeAtomEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.DataValue_3058);
			return types;
		}
		if (editPart instanceof DataLiteralEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.DataValue_3050);
			return types;
		}
		if (editPart instanceof DatavaluedPropertyAtomEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(CoordinationElementTypes.IndividualVariable_3053);
			types.add(CoordinationElementTypes.IndividualID_3054);
			return types;
		}
		if (editPart instanceof DataLiteral2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.DataValue_3050);
			return types;
		}
		if (editPart instanceof TaskPreconditionCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.Condition_3031);
			return types;
		}
		if (editPart instanceof AtomListAtomListFigureCompartmentEditPart) {
			ArrayList types = new ArrayList(7);
			types.add(CoordinationElementTypes.ClassAtom_3033);
			types.add(CoordinationElementTypes.IndividualPropertyAtom_3036);
			types.add(CoordinationElementTypes.SameIndividualAtom_3041);
			types.add(CoordinationElementTypes.DifferentIndividualsAtom_3044);
			types.add(CoordinationElementTypes.BuiltInAtom_3047);
			types.add(CoordinationElementTypes.DataRangeAtom_3048);
			types.add(CoordinationElementTypes.DatavaluedPropertyAtom_3052);
			return types;
		}
		if (editPart instanceof DataRangeAtomDataRangeArgCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(CoordinationElementTypes.DataLiteral_3049);
			types.add(CoordinationElementTypes.DataVariable_3051);
			return types;
		}
		if (editPart instanceof DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(CoordinationElementTypes.DataLiteral_3055);
			types.add(CoordinationElementTypes.DataVariable_3056);
			return types;
		}
		if (editPart instanceof TasksCollectionEditPart) {
			ArrayList types = new ArrayList(11);
			types.add(CoordinationElementTypes.CompositeAction_2020);
			types.add(CoordinationElementTypes.Task_2021);
			types.add(CoordinationElementTypes.AtomicAction_2022);
			types.add(CoordinationElementTypes.Input_2023);
			types.add(CoordinationElementTypes.Output_2024);
			types.add(CoordinationElementTypes.Sequence_2025);
			types.add(CoordinationElementTypes.AnyOrder_2026);
			types.add(CoordinationElementTypes.ControlConstructBag_2027);
			types.add(CoordinationElementTypes.Perform_2028);
			types.add(CoordinationElementTypes.Choice_2029);
			types.add(CoordinationElementTypes.ControlConstructList_2030);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CompositeActionEditPart) {
			return ((CompositeActionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TaskEditPart) {
			return ((TaskEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SequenceEditPart) {
			return ((SequenceEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AnyOrderEditPart) {
			return ((AnyOrderEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ControlConstructBagEditPart) {
			return ((ControlConstructBagEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PerformEditPart) {
			return ((PerformEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ChoiceEditPart) {
			return ((ChoiceEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ControlConstructListEditPart) {
			return ((ControlConstructListEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InputMessageMapEditPart) {
			return ((InputMessageMapEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof CompositeActionEditPart) {
			return ((CompositeActionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AtomicActionEditPart) {
			return ((AtomicActionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InputEditPart) {
			return ((InputEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OutputEditPart) {
			return ((OutputEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SequenceEditPart) {
			return ((SequenceEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AnyOrderEditPart) {
			return ((AnyOrderEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ControlConstructBagEditPart) {
			return ((ControlConstructBagEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PerformEditPart) {
			return ((PerformEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ChoiceEditPart) {
			return ((ChoiceEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ControlConstructListEditPart) {
			return ((ControlConstructListEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CompositeActionEditPart) {
			return ((CompositeActionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TaskEditPart) {
			return ((TaskEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SequenceEditPart) {
			return ((SequenceEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AnyOrderEditPart) {
			return ((AnyOrderEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ControlConstructBagEditPart) {
			return ((ControlConstructBagEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PerformEditPart) {
			return ((PerformEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ChoiceEditPart) {
			return ((ChoiceEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ControlConstructListEditPart) {
			return ((ControlConstructListEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InputMessageMapEditPart) {
			return ((InputMessageMapEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof CompositeActionEditPart) {
			return ((CompositeActionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AtomicActionEditPart) {
			return ((AtomicActionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InputEditPart) {
			return ((InputEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OutputEditPart) {
			return ((OutputEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SequenceEditPart) {
			return ((SequenceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AnyOrderEditPart) {
			return ((AnyOrderEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ControlConstructBagEditPart) {
			return ((ControlConstructBagEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PerformEditPart) {
			return ((PerformEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ChoiceEditPart) {
			return ((ChoiceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ControlConstructListEditPart) {
			return ((ControlConstructListEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CompositeActionEditPart) {
			return ((CompositeActionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TaskEditPart) {
			return ((TaskEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SequenceEditPart) {
			return ((SequenceEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AnyOrderEditPart) {
			return ((AnyOrderEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ControlConstructBagEditPart) {
			return ((ControlConstructBagEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PerformEditPart) {
			return ((PerformEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ChoiceEditPart) {
			return ((ChoiceEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ControlConstructListEditPart) {
			return ((ControlConstructListEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InputMessageMapEditPart) {
			return ((InputMessageMapEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				TaskDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog
				.setMessage(Messages.CoordinationModelingAssistantProviderMessage);
		dialog.setTitle(Messages.CoordinationModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
