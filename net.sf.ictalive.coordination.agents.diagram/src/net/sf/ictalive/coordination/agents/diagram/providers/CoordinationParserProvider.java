package net.sf.ictalive.coordination.agents.diagram.providers;

import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AgentNameEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.AtomicActionNameEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.CompositeActionNameEditPart;
import net.sf.ictalive.coordination.agents.diagram.edit.parts.RoleNameEditPart;
import net.sf.ictalive.coordination.agents.diagram.parsers.MessageFormatParser;
import net.sf.ictalive.coordination.agents.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.owls.process.ProcessPackage;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CoordinationParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser agentName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getAgentName_5004Parser() {
		if (agentName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { AgentsPackage.eINSTANCE
					.getAgent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			agentName_5004Parser = parser;
		}
		return agentName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_5005Parser() {
		if (roleName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { OMPackage.eINSTANCE
					.getRole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			roleName_5005Parser = parser;
		}
		return roleName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicActionName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicActionName_5006Parser() {
		if (atomicActionName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atomicActionName_5006Parser = parser;
		}
		return atomicActionName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeActionName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeActionName_5007Parser() {
		if (compositeActionName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeActionName_5007Parser = parser;
		}
		return compositeActionName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case AgentNameEditPart.VISUAL_ID:
			return getAgentName_5004Parser();
		case RoleNameEditPart.VISUAL_ID:
			return getRoleName_5005Parser();
		case AtomicActionNameEditPart.VISUAL_ID:
			return getAtomicActionName_5006Parser();
		case CompositeActionNameEditPart.VISUAL_ID:
			return getCompositeActionName_5007Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CoordinationVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CoordinationVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CoordinationElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
