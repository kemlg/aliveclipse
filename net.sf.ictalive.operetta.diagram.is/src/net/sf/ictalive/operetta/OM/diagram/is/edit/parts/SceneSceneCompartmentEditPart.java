package net.sf.ictalive.operetta.OM.diagram.is.edit.parts;

import java.util.HashMap;
import java.util.Map;

import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneEditPart.SceneFigure;
import net.sf.ictalive.operetta.OM.diagram.is.edit.policies.SceneSceneCompartmentCanonicalEditPolicy;
import net.sf.ictalive.operetta.OM.diagram.is.edit.policies.SceneSceneCompartmentItemSemanticEditPolicy;
import net.sf.ictalive.operetta.OM.diagram.is.part.Messages;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ResizableCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.PropertyHandlerEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.internal.properties.Properties;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SceneSceneCompartmentEditPart extends ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7101;

	/**
	 * @generated
	 */
	public SceneSceneCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.SceneSceneCompartmentEditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated and Modified
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SceneSceneCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new SceneSceneCompartmentCanonicalEditPolicy());

		installEditPolicy(EditPolicyRoles.PROPERTY_HANDLER_ROLE,
				new SynchronizedExpansionPropertyHandlerEditPolicy() {
					@Override
					// when new Scenes are created collapsed, there is no landmark compartment yet, so we return null
					public ResizableCompartmentEditPart getSynchronizedCompartment() {
						if (getChildren().size() > 0) {
							LandmarkPatternEditPart landmarkPattern = (LandmarkPatternEditPart) getChildren()
									.get(0);
							if (landmarkPattern.getChildren().size() > 0)
								return (LandmarkPatternLandmarkPatternCompartmentEditPart) landmarkPattern
										.getChildren().get(0);
							else
								return null;
						} else
							return null;
					}
				});

		// double click toggles expansion of the landmark compartment. Unfortunately, the landmark compartment itself doesn't respond to the open policy
		// so we cannot collapse it with double click inside the landmark compartment.
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenEditPolicy() {
			protected org.eclipse.gef.commands.Command getOpenCommand(
					Request request) {
				ChangePropertyValueRequest r = new ChangePropertyValueRequest(
						DiagramUIMessages.PropertyDescriptorFactory_CollapseCompartment,
						Properties.ID_COLLAPSED, SceneSceneCompartmentEditPart.this.getCompartmentFigure().isExpanded());
				org.eclipse.gef.commands.Command cc = SceneSceneCompartmentEditPart.this
						.getCommand(r);
				
				return cc;
			}
		});
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}
}
