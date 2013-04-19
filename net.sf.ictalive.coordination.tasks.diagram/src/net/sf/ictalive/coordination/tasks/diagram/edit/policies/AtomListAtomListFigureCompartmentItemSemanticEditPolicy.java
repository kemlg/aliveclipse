package net.sf.ictalive.coordination.tasks.diagram.edit.policies;

import net.sf.ictalive.coordination.tasks.diagram.edit.commands.BuiltInAtomCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.ClassAtomCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.DataRangeAtomCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.DatavaluedPropertyAtomCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.DifferentIndividualsAtomCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IndividualPropertyAtomCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.SameIndividualAtomCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AtomListAtomListFigureCompartmentItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AtomListAtomListFigureCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.AtomList_3032);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.ClassAtom_3033 == req.getElementType()) {
			return getGEFWrapper(new ClassAtomCreateCommand(req));
		}
		if (CoordinationElementTypes.IndividualPropertyAtom_3036 == req
				.getElementType()) {
			return getGEFWrapper(new IndividualPropertyAtomCreateCommand(req));
		}
		if (CoordinationElementTypes.SameIndividualAtom_3041 == req
				.getElementType()) {
			return getGEFWrapper(new SameIndividualAtomCreateCommand(req));
		}
		if (CoordinationElementTypes.DifferentIndividualsAtom_3044 == req
				.getElementType()) {
			return getGEFWrapper(new DifferentIndividualsAtomCreateCommand(req));
		}
		if (CoordinationElementTypes.BuiltInAtom_3047 == req.getElementType()) {
			return getGEFWrapper(new BuiltInAtomCreateCommand(req));
		}
		if (CoordinationElementTypes.DataRangeAtom_3048 == req.getElementType()) {
			return getGEFWrapper(new DataRangeAtomCreateCommand(req));
		}
		if (CoordinationElementTypes.DatavaluedPropertyAtom_3052 == req
				.getElementType()) {
			return getGEFWrapper(new DatavaluedPropertyAtomCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
