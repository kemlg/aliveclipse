package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.actions.AtomicAction;
import net.sf.ictalive.coordination.actions.CompositeAction;
import net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.helpers.MappingBaseEditHelper;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;
import net.sf.ictalive.owls.process.AnyOrder;
import net.sf.ictalive.owls.process.Choice;
import net.sf.ictalive.owls.process.CompositeProcess;
import net.sf.ictalive.owls.process.ControlConstruct;
import net.sf.ictalive.owls.process.ControlConstructBag;
import net.sf.ictalive.owls.process.ControlConstructList;
import net.sf.ictalive.owls.process.IfThenElse;
import net.sf.ictalive.owls.process.Perform;
import net.sf.ictalive.owls.process.RepeatWhile;
import net.sf.ictalive.owls.process.Split;
import net.sf.ictalive.owls.process.SplitJoin;

import org.eclipse.bpel.model.Else;
import org.eclipse.bpel.model.ElseIf;
import org.eclipse.bpel.model.Flow;
import org.eclipse.bpel.model.ForEach;
import org.eclipse.bpel.model.If;
import org.eclipse.bpel.model.PartnerActivity;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.RepeatUntil;
import org.eclipse.bpel.model.Scope;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.bpel.model.While;
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
public class MappingBaseItemSemanticEditPolicy extends SemanticEditPolicy {

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
	protected MappingBaseItemSemanticEditPolicy(IElementType elementType) {
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
				Integer id = new Integer(MappingVisualIDRegistry
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
			request.setParameter(MappingBaseEditHelper.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(MappingBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(MappingBaseEditHelper.EDIT_POLICY_COMMAND, null);
		request.setParameter(MappingBaseEditHelper.CONTEXT_ELEMENT_TYPE, null);
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
		IElementType requestContextElementType = MappingElementTypes
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
		public static boolean canCreatePartnerActivityToAtomicActionMapping_4001(
				MappingContainer container, PartnerActivity source,
				AtomicAction target) {
			return canExistPartnerActivityToAtomicActionMapping_4001(container,
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateProcessToCompositeActionMapping_4002(
				MappingContainer container, Process source,
				CompositeAction target) {
			return canExistProcessToCompositeActionMapping_4002(container,
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSequenceToSequenceMapping_4016(
				MappingContainer container, Sequence source,
				net.sf.ictalive.owls.process.Sequence target) {
			return canExistSequenceToSequenceMapping_4016(container, source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateIfToIfThenElseMapping_4017(
				MappingContainer container, If source, IfThenElse target) {
			return canExistIfToIfThenElseMapping_4017(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateWhileToRepeatWhileMapping_4018(
				MappingContainer container, While source, RepeatWhile target) {
			return canExistWhileToRepeatWhileMapping_4018(container, source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateRepeatUntilToRepeatUntilMapping_4019(
				MappingContainer container, RepeatUntil source,
				net.sf.ictalive.owls.process.RepeatUntil target) {
			return canExistRepeatUntilToRepeatUntilMapping_4019(container,
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateFlowToSplitJoinMapping_4020(
				MappingContainer container, Flow source, SplitJoin target) {
			return canExistFlowToSplitJoinMapping_4020(container, source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateForToRepeatWhileMapping_4021(
				MappingContainer container, ForEach source, RepeatWhile target) {
			return canExistForToRepeatWhileMapping_4021(container, source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateScopeToCompositeActionMapping_4022(
				MappingContainer container, Scope source, CompositeAction target) {
			return canExistScopeToCompositeActionMapping_4022(container,
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateElseIfToIfThenElseMapping_4023(
				MappingContainer container, ElseIf source, IfThenElse target) {
			return canExistElseIfToIfThenElseMapping_4023(container, source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateElseToElseMapping_4024(
				MappingContainer container, Else source, ControlConstruct target) {
			return canExistElseToElseMapping_4024(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateCompositeProcessComposedOf_4003(
				CompositeProcess source, ControlConstruct target) {
			if (source != null) {
				if (source.getComposedOf() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistCompositeProcessComposedOf_4003(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreatePerformProcess_4004(Perform source,
				net.sf.ictalive.owls.process.Process target) {
			if (source != null) {
				if (source.getProcess() != null) {
					return false;
				}
			}

			return canExistPerformProcess_4004(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateChoiceComponents_4005(Choice source,
				ControlConstructBag target) {
			if (source != null) {
				if (source.getComponents() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistChoiceComponents_4005(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateAnyOrderComponents_4006(AnyOrder source,
				ControlConstructBag target) {
			if (source != null) {
				if (source.getComponents() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistAnyOrderComponents_4006(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSequenceComponents_4007(
				net.sf.ictalive.owls.process.Sequence source,
				ControlConstructList target) {
			if (source != null) {
				if (source.getComponents() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistSequenceComponents_4007(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateControlConstructBagRest_4008(
				ControlConstructBag source, ControlConstructBag target) {
			if (source != null) {
				if (source.getRest() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistControlConstructBagRest_4008(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateControlConstructListRest_4009(
				ControlConstructList source, ControlConstructList target) {
			if (source != null) {
				if (source.getRest() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistControlConstructListRest_4009(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateIfThenElseThen_4010(IfThenElse source,
				ControlConstruct target) {
			if (source != null) {
				if (source.getThen() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistIfThenElseThen_4010(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateIfThenElseElse_4011(IfThenElse source,
				ControlConstruct target) {
			if (source != null) {
				if (source.getElse() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistIfThenElseElse_4011(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateRepeatUntilUntilProcess_4012(
				net.sf.ictalive.owls.process.RepeatUntil source,
				ControlConstruct target) {
			if (source != null) {
				if (source.getUntilProcess() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistRepeatUntilUntilProcess_4012(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateRepeatWhileWhileProcess_4013(
				RepeatWhile source, ControlConstruct target) {
			if (source != null) {
				if (source.getWhileProcess() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistRepeatWhileWhileProcess_4013(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateControlConstructBagFirst_4014(
				ControlConstructBag source, ControlConstruct target) {
			if (source != null) {
				if (source.getFirst() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistControlConstructBagFirst_4014(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateControlConstructListFirst_4015(
				ControlConstructList source, ControlConstruct target) {
			if (source != null) {
				if (source.getFirst() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistControlConstructListFirst_4015(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSplitComponents_4025(Split source,
				ControlConstructBag target) {
			if (source != null) {
				if (source.getComponents() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistSplitComponents_4025(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSplitJoinComponents_4026(
				SplitJoin source, ControlConstructBag target) {
			if (source != null) {
				if (source.getComponents() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistSplitJoinComponents_4026(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canExistPartnerActivityToAtomicActionMapping_4001(
				MappingContainer container, PartnerActivity source,
				AtomicAction target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistProcessToCompositeActionMapping_4002(
				MappingContainer container, Process source,
				CompositeAction target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSequenceToSequenceMapping_4016(
				MappingContainer container, Sequence source,
				net.sf.ictalive.owls.process.Sequence target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistIfToIfThenElseMapping_4017(
				MappingContainer container, If source, IfThenElse target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistWhileToRepeatWhileMapping_4018(
				MappingContainer container, While source, RepeatWhile target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistRepeatUntilToRepeatUntilMapping_4019(
				MappingContainer container, RepeatUntil source,
				net.sf.ictalive.owls.process.RepeatUntil target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistFlowToSplitJoinMapping_4020(
				MappingContainer container, Flow source, SplitJoin target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistForToRepeatWhileMapping_4021(
				MappingContainer container, ForEach source, RepeatWhile target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistScopeToCompositeActionMapping_4022(
				MappingContainer container, Scope source, CompositeAction target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistElseIfToIfThenElseMapping_4023(
				MappingContainer container, ElseIf source, IfThenElse target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistElseToElseMapping_4024(
				MappingContainer container, Else source, ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistCompositeProcessComposedOf_4003(
				CompositeProcess source, ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistPerformProcess_4004(Perform source,
				net.sf.ictalive.owls.process.Process target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistChoiceComponents_4005(Choice source,
				ControlConstructBag target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistAnyOrderComponents_4006(AnyOrder source,
				ControlConstructBag target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSequenceComponents_4007(
				net.sf.ictalive.owls.process.Sequence source,
				ControlConstructList target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistControlConstructBagRest_4008(
				ControlConstructBag source, ControlConstructBag target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistControlConstructListRest_4009(
				ControlConstructList source, ControlConstructList target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistIfThenElseThen_4010(IfThenElse source,
				ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistIfThenElseElse_4011(IfThenElse source,
				ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistRepeatUntilUntilProcess_4012(
				net.sf.ictalive.owls.process.RepeatUntil source,
				ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistRepeatWhileWhileProcess_4013(
				RepeatWhile source, ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistControlConstructBagFirst_4014(
				ControlConstructBag source, ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistControlConstructListFirst_4015(
				ControlConstructList source, ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSplitComponents_4025(Split source,
				ControlConstructBag target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSplitJoinComponents_4026(
				SplitJoin source, ControlConstructBag target) {
			return true;
		}
	}

}
