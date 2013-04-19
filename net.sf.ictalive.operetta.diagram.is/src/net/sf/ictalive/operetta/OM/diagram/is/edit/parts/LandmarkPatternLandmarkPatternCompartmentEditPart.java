package net.sf.ictalive.operetta.OM.diagram.is.edit.parts;

import java.util.HashMap;
import java.util.Map;

import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneEditPart.SceneFigure;
import net.sf.ictalive.operetta.OM.diagram.is.edit.policies.LandmarkPatternLandmarkPatternCompartmentCanonicalEditPolicy;
import net.sf.ictalive.operetta.OM.diagram.is.edit.policies.LandmarkPatternLandmarkPatternCompartmentItemSemanticEditPolicy;
import net.sf.ictalive.operetta.OM.diagram.is.part.Messages;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutAnimator;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ResizableCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.PropertyHandlerEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.internal.properties.Properties;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class LandmarkPatternLandmarkPatternCompartmentEditPart extends
		ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7102;

	/**
	 * @generated
	 */
	public LandmarkPatternLandmarkPatternCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.LandmarkPatternLandmarkPatternCompartmentEditPart_title;
	}

	/**
	 * @generated and modified
	 */
	public IFigure createFigure() {
		ShapeCompartmentFigure scf = new ShapeCompartmentFigure(
				getCompartmentName(), getMapMode()) {
			public Dimension getMinClientDimension() {
				if (isExpanded())
					return new Dimension(200, 200);
				else
					return new Dimension(10, 10);
			}
		};

		scf.getContentPane().setLayoutManager(getLayoutManager());
		scf.getContentPane().addLayoutListener(LayoutAnimator.getDefault());

		ResizableCompartmentFigure result = (ResizableCompartmentFigure) scf;
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated and modified
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new LandmarkPatternLandmarkPatternCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new LandmarkPatternLandmarkPatternCompartmentCanonicalEditPolicy());

		installEditPolicy(EditPolicyRoles.PROPERTY_HANDLER_ROLE,
				new SynchronizedExpansionPropertyHandlerEditPolicy() {
					@Override
					public ResizableCompartmentEditPart getSynchronizedCompartment() {
						return (SceneSceneCompartmentEditPart) getParent()
								.getParent();
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
