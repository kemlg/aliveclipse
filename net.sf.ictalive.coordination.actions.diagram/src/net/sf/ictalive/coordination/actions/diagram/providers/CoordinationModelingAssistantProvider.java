package net.sf.ictalive.coordination.actions.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import net.sf.ictalive.coordination.actions.diagram.edit.parts.ActionsCollectionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AnyOrderEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomListAtomListFigureCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionAtomicActionCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ChoiceEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ClassAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.CompositeActionCompositeActionCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ConditionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructBagEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructListEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataLiteral2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataLiteralEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataRangeAtomDataRangeArgCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataRangeAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DatavaluedPropertyAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DifferentIndividualsAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Expression2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ExpressionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualPropertyAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.InputBindingEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.InputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.OutputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ParticipantEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.PerformEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatUntilEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatWhileEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SameIndividualAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SequenceEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitJoinEditPart;
import net.sf.ictalive.coordination.actions.diagram.part.ActionDiagramEditorPlugin;
import net.sf.ictalive.coordination.actions.diagram.part.Messages;

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
		if (editPart instanceof RepeatUntilEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.Condition_3087);
			return types;
		}
		if (editPart instanceof RepeatWhileEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.Condition_3088);
			return types;
		}
		if (editPart instanceof IfThenElseEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.Condition_3089);
			return types;
		}
		if (editPart instanceof ConditionEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.AtomList_3055);
			return types;
		}
		if (editPart instanceof ClassAtomEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(CoordinationElementTypes.IndividualID_3057);
			types.add(CoordinationElementTypes.IndividualVariable_3058);
			return types;
		}
		if (editPart instanceof IndividualPropertyAtomEditPart) {
			ArrayList types = new ArrayList(4);
			types.add(CoordinationElementTypes.IndividualID_3060);
			types.add(CoordinationElementTypes.IndividualVariable_3061);
			types.add(CoordinationElementTypes.IndividualID_3062);
			types.add(CoordinationElementTypes.IndividualVariable_3063);
			return types;
		}
		if (editPart instanceof SameIndividualAtomEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(CoordinationElementTypes.IndividualID_3065);
			types.add(CoordinationElementTypes.IndividualVariable_3066);
			return types;
		}
		if (editPart instanceof DifferentIndividualsAtomEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(CoordinationElementTypes.IndividualID_3068);
			types.add(CoordinationElementTypes.IndividualVariable_3069);
			return types;
		}
		if (editPart instanceof DataRangeAtomEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.DataValue_3090);
			return types;
		}
		if (editPart instanceof DataLiteralEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.DataValue_3073);
			return types;
		}
		if (editPart instanceof DatavaluedPropertyAtomEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(CoordinationElementTypes.IndividualVariable_3076);
			types.add(CoordinationElementTypes.IndividualID_3077);
			return types;
		}
		if (editPart instanceof DataLiteral2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.DataValue_3073);
			return types;
		}
		if (editPart instanceof Condition2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.AtomList_3055);
			return types;
		}
		if (editPart instanceof AtomicActionResultEditPart) {
			ArrayList types = new ArrayList(3);
			types.add(CoordinationElementTypes.Distribution_3086);
			types.add(CoordinationElementTypes.Distribution_3084);
			types.add(CoordinationElementTypes.Distribution_3085);
			return types;
		}
		if (editPart instanceof ExpressionEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.AtomList_3055);
			return types;
		}
		if (editPart instanceof Expression2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.AtomList_3055);
			return types;
		}
		if (editPart instanceof CompositeActionCompositeActionCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.Condition_3054);
			return types;
		}
		if (editPart instanceof AtomListAtomListFigureCompartmentEditPart) {
			ArrayList types = new ArrayList(7);
			types.add(CoordinationElementTypes.ClassAtom_3056);
			types.add(CoordinationElementTypes.IndividualPropertyAtom_3059);
			types.add(CoordinationElementTypes.SameIndividualAtom_3064);
			types.add(CoordinationElementTypes.DifferentIndividualsAtom_3067);
			types.add(CoordinationElementTypes.BuiltInAtom_3070);
			types.add(CoordinationElementTypes.DataRangeAtom_3071);
			types.add(CoordinationElementTypes.DatavaluedPropertyAtom_3075);
			return types;
		}
		if (editPart instanceof DataRangeAtomDataRangeArgCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(CoordinationElementTypes.DataLiteral_3072);
			types.add(CoordinationElementTypes.DataVariable_3074);
			return types;
		}
		if (editPart instanceof DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(CoordinationElementTypes.DataLiteral_3078);
			types.add(CoordinationElementTypes.DataVariable_3079);
			return types;
		}
		if (editPart instanceof AtomicActionAtomicActionCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(CoordinationElementTypes.Condition_3080);
			types.add(CoordinationElementTypes.AtomicActionResult_3081);
			return types;
		}
		if (editPart instanceof AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.Expression_3082);
			return types;
		}
		if (editPart instanceof AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(CoordinationElementTypes.Expression_3083);
			return types;
		}
		if (editPart instanceof ActionsCollectionEditPart) {
			ArrayList types = new ArrayList(17);
			types.add(CoordinationElementTypes.CompositeAction_2024);
			types.add(CoordinationElementTypes.AtomicAction_2025);
			types.add(CoordinationElementTypes.Input_2026);
			types.add(CoordinationElementTypes.Output_2027);
			types.add(CoordinationElementTypes.Participant_2028);
			types.add(CoordinationElementTypes.Sequence_2029);
			types.add(CoordinationElementTypes.AnyOrder_2030);
			types.add(CoordinationElementTypes.ControlConstructBag_2031);
			types.add(CoordinationElementTypes.Perform_2032);
			types.add(CoordinationElementTypes.Choice_2033);
			types.add(CoordinationElementTypes.ControlConstructList_2034);
			types.add(CoordinationElementTypes.RepeatUntil_2035);
			types.add(CoordinationElementTypes.RepeatWhile_2036);
			types.add(CoordinationElementTypes.IfThenElse_2037);
			types.add(CoordinationElementTypes.InputBinding_2038);
			types.add(CoordinationElementTypes.Split_2039);
			types.add(CoordinationElementTypes.SplitJoin_2040);
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
		if (sourceEditPart instanceof AtomicActionEditPart) {
			return ((AtomicActionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
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
		if (sourceEditPart instanceof RepeatUntilEditPart) {
			return ((RepeatUntilEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RepeatWhileEditPart) {
			return ((RepeatWhileEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof IfThenElseEditPart) {
			return ((IfThenElseEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InputBindingEditPart) {
			return ((InputBindingEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SplitEditPart) {
			return ((SplitEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SplitJoinEditPart) {
			return ((SplitJoinEditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (targetEditPart instanceof ParticipantEditPart) {
			return ((ParticipantEditPart) targetEditPart)
					.getMARelTypesOnTarget();
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
		if (targetEditPart instanceof RepeatUntilEditPart) {
			return ((RepeatUntilEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof RepeatWhileEditPart) {
			return ((RepeatWhileEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof IfThenElseEditPart) {
			return ((IfThenElseEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InputBindingEditPart) {
			return ((InputBindingEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SplitEditPart) {
			return ((SplitEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SplitJoinEditPart) {
			return ((SplitJoinEditPart) targetEditPart).getMARelTypesOnTarget();
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
		if (sourceEditPart instanceof AtomicActionEditPart) {
			return ((AtomicActionEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntilEditPart) {
			return ((RepeatUntilEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RepeatWhileEditPart) {
			return ((RepeatWhileEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof IfThenElseEditPart) {
			return ((IfThenElseEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InputBindingEditPart) {
			return ((InputBindingEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SplitEditPart) {
			return ((SplitEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SplitJoinEditPart) {
			return ((SplitJoinEditPart) sourceEditPart)
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
		if (targetEditPart instanceof ParticipantEditPart) {
			return ((ParticipantEditPart) targetEditPart)
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
		if (targetEditPart instanceof RepeatUntilEditPart) {
			return ((RepeatUntilEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof RepeatWhileEditPart) {
			return ((RepeatWhileEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof IfThenElseEditPart) {
			return ((IfThenElseEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InputBindingEditPart) {
			return ((InputBindingEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SplitEditPart) {
			return ((SplitEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SplitJoinEditPart) {
			return ((SplitJoinEditPart) targetEditPart)
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
		if (sourceEditPart instanceof AtomicActionEditPart) {
			return ((AtomicActionEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof RepeatUntilEditPart) {
			return ((RepeatUntilEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RepeatWhileEditPart) {
			return ((RepeatWhileEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof IfThenElseEditPart) {
			return ((IfThenElseEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InputBindingEditPart) {
			return ((InputBindingEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SplitEditPart) {
			return ((SplitEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SplitJoinEditPart) {
			return ((SplitJoinEditPart) sourceEditPart)
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
				ActionDiagramEditorPlugin.getInstance()
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
