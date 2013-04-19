package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.agents.Agent;
import net.sf.ictalive.coordination.tasks.ActionGrounding;
import net.sf.ictalive.coordination.tasks.ActionGroundingList;
import net.sf.ictalive.coordination.tasks.Plan;
import net.sf.ictalive.coordination.wfvv.diagram.edit.helpers.WfvvBaseEditHelper;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;
import net.sf.ictalive.operetta.OM.Norm;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.runtime.action.Action;
import net.sf.ictalive.runtime.action.CoordinationAction;
import net.sf.ictalive.runtime.action.PlanningActions;
import net.sf.ictalive.runtime.action.ServiceInvocation;
import net.sf.ictalive.runtime.enactment.Enactment;
import net.sf.ictalive.runtime.enactment.Resource;
import net.sf.ictalive.runtime.event.Actor;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.fact.CommunicativeAct;
import net.sf.ictalive.runtime.fact.Disaster;
import net.sf.ictalive.runtime.fact.Fact;
import net.sf.ictalive.runtime.fact.FailureAct;
import net.sf.ictalive.runtime.fact.TaskViolation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class WfvvBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected WfvvBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(WfvvVisualIDRegistry
						.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand()
					: new CommandProxy(editPolicyCommand);
			request.setParameter(WfvvBaseEditHelper.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(WfvvBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(WfvvBaseEditHelper.EDIT_POLICY_COMMAND, null);
		request.setParameter(WfvvBaseEditHelper.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = WfvvElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		private static final String OPPOSITE_END_VAR = "oppositeEnd"; //$NON-NLS-1$

		/**
		 * @generated
		 */
		public static boolean canCreateFactDueTo_4001(Fact source, Action target) {
			if (source != null) {
				if (source.getDueTo() != null) {
					return false;
				}
			}

			return canExistFactDueTo_4001(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateFactEffect_4002(Fact source,
				Action target) {
			if (source != null) {
				if (source.getEffect() != null) {
					return false;
				}
			}

			return canExistFactEffect_4002(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateFactRelate_4003(Fact source, Fact target) {
			if (source != null) {
				if (source.getRelate().contains(target)) {
					return false;
				}
			}

			return canExistFactRelate_4003(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreatePlanningActionsPlan_4005(
				PlanningActions source, Plan target) {
			if (source != null) {
				if (source.getPlan() != null) {
					return false;
				}
			}

			return canExistPlanningActionsPlan_4005(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateServiceInvocationEnactingAgent_4006(
				ServiceInvocation source, Agent target) {
			if (source != null) {
				if (source.getEnactingAgent() != null) {
					return false;
				}
			}

			return canExistServiceInvocationEnactingAgent_4006(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateFailureActReason_4008(FailureAct source,
				EObject target) {
			if (source != null) {
				if (source.getReason() != null) {
					return false;
				}
			}

			return canExistFailureActReason_4008(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateDisasterReason_4009(Disaster source,
				EObject target) {
			if (source != null) {
				if (source.getReason() != null) {
					return false;
				}
			}

			return canExistDisasterReason_4009(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateNSNorms_4010(
				net.sf.ictalive.operetta.OM.NS source, Norm target) {
			if (source != null) {
				if (source.getNorms().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistNSNorms_4010(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateCommunicativeActReceiver_4011(
				CommunicativeAct source, Actor target) {
			if (source != null) {
				if (source.getReceiver() != null) {
					return false;
				}
			}

			return canExistCommunicativeActReceiver_4011(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateCommunicativeActSender_4012(
				CommunicativeAct source, Actor target) {
			if (source != null) {
				if (source.getSender() != null) {
					return false;
				}
			}

			return canExistCommunicativeActSender_4012(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateTaskViolationUnmetRequirement_4013(
				TaskViolation source, Objective target) {
			if (source != null) {
				if (source.getUnmetRequirement().contains(target)) {
					return false;
				}
			}

			return canExistTaskViolationUnmetRequirement_4013(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateActionByActor_4014(Action source,
				Actor target) {
			if (source != null) {
				if (source.getByActor() != null) {
					return false;
				}
			}

			return canExistActionByActor_4014(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateActionEnactment_4015(Action source,
				Enactment target) {
			if (source != null) {
				if (source.getEnactment().contains(target)) {
					return false;
				}
			}

			return canExistActionEnactment_4015(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateActionCause_4016(Action source,
				Fact target) {
			if (source != null) {
				if (source.getCause() != null) {
					return false;
				}
			}

			return canExistActionCause_4016(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateEnactmentResource_4017(Enactment source,
				Resource target) {
			if (source != null) {
				if (source.getResource().contains(target)) {
					return false;
				}
			}

			return canExistEnactmentResource_4017(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateCoordinationActionCoordAction_4018(
				CoordinationAction source, ActionGrounding target) {
			if (source != null) {
				if (source.getCoordAction() != null) {
					return false;
				}
			}

			return canExistCoordinationActionCoordAction_4018(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateCoordinationActionPlan_4004(
				CoordinationAction source, Plan target) {
			if (source != null) {
				if (source.getPlan() != null) {
					return false;
				}
			}

			return canExistCoordinationActionPlan_4004(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateEventAsserter_4019(Event source,
				Actor target) {
			if (source != null) {
				if (source.getAsserter() != null) {
					return false;
				}
			}
			if (target != null && (target.getEmit().contains(target))) {
				return false;
			}

			return canExistEventAsserter_4019(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateActorAgent_4020(Actor source,
				Agent target) {
			if (source != null) {
				if (source.getAgent() != null) {
					return false;
				}
			}

			return canExistActorAgent_4020(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreatePlanHasAtomicProcessGroundingList_4021(
				Plan source, ActionGroundingList target) {
			if (source != null) {
				if (source.getHasAtomicProcessGroundingList() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistPlanHasAtomicProcessGroundingList_4021(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateActionGroundingListRest_4022(
				ActionGroundingList source, ActionGroundingList target) {
			if (source != null) {
				if (source.getRest() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistActionGroundingListRest_4022(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateActionGroundingOwlsProcess_4023(
				ActionGrounding source,
				net.sf.ictalive.coordination.actions.Action target) {
			if (source != null) {
				if (source.getOwlsProcess() != null) {
					return false;
				}
			}

			return canExistActionGroundingOwlsProcess_4023(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canExistFactDueTo_4001(Fact source, Action target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistFactEffect_4002(Fact source, Action target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistFactRelate_4003(Fact source, Fact target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistPlanningActionsPlan_4005(
				PlanningActions source, Plan target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistServiceInvocationEnactingAgent_4006(
				ServiceInvocation source, Agent target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistFailureActReason_4008(FailureAct source,
				EObject target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistDisasterReason_4009(Disaster source,
				EObject target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistNSNorms_4010(
				net.sf.ictalive.operetta.OM.NS source, Norm target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistCommunicativeActReceiver_4011(
				CommunicativeAct source, Actor target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistCommunicativeActSender_4012(
				CommunicativeAct source, Actor target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistTaskViolationUnmetRequirement_4013(
				TaskViolation source, Objective target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistActionByActor_4014(Action source,
				Actor target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistActionEnactment_4015(Action source,
				Enactment target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistActionCause_4016(Action source,
				Fact target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistEnactmentResource_4017(Enactment source,
				Resource target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistCoordinationActionCoordAction_4018(
				CoordinationAction source, ActionGrounding target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistCoordinationActionPlan_4004(
				CoordinationAction source, Plan target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistEventAsserter_4019(Event source,
				Actor target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistActorAgent_4020(Actor source, Agent target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistPlanHasAtomicProcessGroundingList_4021(
				Plan source, ActionGroundingList target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistActionGroundingListRest_4022(
				ActionGroundingList source, ActionGroundingList target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistActionGroundingOwlsProcess_4023(
				ActionGrounding source,
				net.sf.ictalive.coordination.actions.Action target) {
			return true;
		}
	}

}
