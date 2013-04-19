package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import java.util.Iterator;

import net.sf.ictalive.coordination.actions.diagram.edit.helpers.CoordinationBaseEditHelper;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;
import net.sf.ictalive.owls.process.AnyOrder;
import net.sf.ictalive.owls.process.Binding;
import net.sf.ictalive.owls.process.Choice;
import net.sf.ictalive.owls.process.CompositeProcess;
import net.sf.ictalive.owls.process.ControlConstruct;
import net.sf.ictalive.owls.process.ControlConstructBag;
import net.sf.ictalive.owls.process.ControlConstructList;
import net.sf.ictalive.owls.process.IfThenElse;
import net.sf.ictalive.owls.process.Input;
import net.sf.ictalive.owls.process.Output;
import net.sf.ictalive.owls.process.Parameter;
import net.sf.ictalive.owls.process.Participant;
import net.sf.ictalive.owls.process.Perform;
import net.sf.ictalive.owls.process.Process;
import net.sf.ictalive.owls.process.RepeatUntil;
import net.sf.ictalive.owls.process.RepeatWhile;
import net.sf.ictalive.owls.process.Sequence;
import net.sf.ictalive.owls.process.Split;
import net.sf.ictalive.owls.process.SplitJoin;

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
public class CoordinationBaseItemSemanticEditPolicy extends SemanticEditPolicy {

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
	protected CoordinationBaseItemSemanticEditPolicy(IElementType elementType) {
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
				Integer id = new Integer(CoordinationVisualIDRegistry
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
			request.setParameter(
					CoordinationBaseEditHelper.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(CoordinationBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(CoordinationBaseEditHelper.EDIT_POLICY_COMMAND,
				null);
		request.setParameter(CoordinationBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				null);
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
		IElementType requestContextElementType = CoordinationElementTypes
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
		public static boolean canCreateProcessHasInput_4026(Process source,
				Input target) {
			if (source != null) {
				if (source.getHasInput().contains(target)) {
					return false;
				}
			}

			return canExistProcessHasInput_4026(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateProcessHasOutput_4027(Process source,
				Output target) {
			if (source != null) {
				if (source.getHasOutput().contains(target)) {
					return false;
				}
			}

			return canExistProcessHasOutput_4027(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateProcessPerformedBy_4028(Process source,
				Participant target) {
			if (source != null) {
				if (source.getPerformedBy() != null) {
					return false;
				}
			}

			return canExistProcessPerformedBy_4028(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateCompositeProcessComposedOf_4029(
				CompositeProcess source, ControlConstruct target) {
			if (source != null) {
				if (source.getComposedOf() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistCompositeProcessComposedOf_4029(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreatePerformProcess_4030(Perform source,
				Process target) {
			if (source != null) {
				if (source.getProcess() != null) {
					return false;
				}
			}

			return canExistPerformProcess_4030(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateChoiceComponents_4031(Choice source,
				ControlConstructBag target) {
			if (source != null) {
				if (source.getComponents() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistChoiceComponents_4031(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateAnyOrderComponents_4032(AnyOrder source,
				ControlConstructBag target) {
			if (source != null) {
				if (source.getComponents() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistAnyOrderComponents_4032(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSequenceComponents_4033(Sequence source,
				ControlConstructList target) {
			if (source != null) {
				if (source.getComponents() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistSequenceComponents_4033(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSplitComponents_4045(Split source,
				ControlConstructBag target) {
			if (source != null) {
				if (source.getComponents() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistSplitComponents_4045(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSplitJoinComponents_4046(
				SplitJoin source, ControlConstructBag target) {
			if (source != null) {
				if (source.getComponents() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistSplitJoinComponents_4046(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateControlConstructBagRest_4034(
				ControlConstructBag source, ControlConstructBag target) {
			if (source != null) {
				if (source.getRest() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistControlConstructBagRest_4034(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateControlConstructListRest_4035(
				ControlConstructList source, ControlConstructList target) {
			if (source != null) {
				if (source.getRest() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistControlConstructListRest_4035(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateIfThenElseThen_4036(IfThenElse source,
				ControlConstruct target) {
			if (source != null) {
				if (source.getThen() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistIfThenElseThen_4036(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateIfThenElseElse_4037(IfThenElse source,
				ControlConstruct target) {
			if (source != null) {
				if (source.getElse() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistIfThenElseElse_4037(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateRepeatUntilUntilProcess_4038(
				RepeatUntil source, ControlConstruct target) {
			if (source != null) {
				if (source.getUntilProcess() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistRepeatUntilUntilProcess_4038(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateRepeatWhileWhileProcess_4039(
				RepeatWhile source, ControlConstruct target) {
			if (source != null) {
				if (source.getWhileProcess() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistRepeatWhileWhileProcess_4039(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateControlConstructBagFirst_4040(
				ControlConstructBag source, ControlConstruct target) {
			if (source != null) {
				if (source.getFirst() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistControlConstructBagFirst_4040(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateControlConstructListFirst_4041(
				ControlConstructList source, ControlConstruct target) {
			if (source != null) {
				if (source.getFirst() != null) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistControlConstructListFirst_4041(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreatePerformHasDataFrom_4042(Perform source,
				Binding target) {
			if (source != null) {
				if (source.getHasDataFrom().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}

			return canExistPerformHasDataFrom_4042(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateBindingValueFrom_4043(Binding source,
				EObject target) {
			if (source != null) {
				if (source.getValueFrom() != null) {
					return false;
				}
			}

			return canExistBindingValueFrom_4043(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateBindingToParam_4044(Binding source,
				Parameter target) {
			if (source != null) {
				if (source.getToParam() != null) {
					return false;
				}
			}

			return canExistBindingToParam_4044(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canExistProcessHasInput_4026(Process source,
				Input target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistProcessHasOutput_4027(Process source,
				Output target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistProcessPerformedBy_4028(Process source,
				Participant target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistCompositeProcessComposedOf_4029(
				CompositeProcess source, ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistPerformProcess_4030(Perform source,
				Process target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistChoiceComponents_4031(Choice source,
				ControlConstructBag target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistAnyOrderComponents_4032(AnyOrder source,
				ControlConstructBag target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSequenceComponents_4033(Sequence source,
				ControlConstructList target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSplitComponents_4045(Split source,
				ControlConstructBag target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSplitJoinComponents_4046(
				SplitJoin source, ControlConstructBag target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistControlConstructBagRest_4034(
				ControlConstructBag source, ControlConstructBag target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistControlConstructListRest_4035(
				ControlConstructList source, ControlConstructList target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistIfThenElseThen_4036(IfThenElse source,
				ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistIfThenElseElse_4037(IfThenElse source,
				ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistRepeatUntilUntilProcess_4038(
				RepeatUntil source, ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistRepeatWhileWhileProcess_4039(
				RepeatWhile source, ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistControlConstructBagFirst_4040(
				ControlConstructBag source, ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistControlConstructListFirst_4041(
				ControlConstructList source, ControlConstruct target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistPerformHasDataFrom_4042(Perform source,
				Binding target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistBindingValueFrom_4043(Binding source,
				EObject target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistBindingToParam_4044(Binding source,
				Parameter target) {
			return true;
		}
	}

}
