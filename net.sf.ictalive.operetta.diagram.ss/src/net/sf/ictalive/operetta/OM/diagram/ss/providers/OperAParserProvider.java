package net.sf.ictalive.operetta.OM.diagram.ss.providers;

import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.HierarchyDependencyNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.MarketDependencyNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.NetworkDependencyNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.RoleNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.RoleRoleTypeEditPart;
import net.sf.ictalive.operetta.OM.diagram.ss.parsers.MessageFormatParser;
import net.sf.ictalive.operetta.OM.diagram.ss.part.OperAVisualIDRegistry;

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
public class OperAParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser roleName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_5001Parser() {
		if (roleName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { OMPackage.eINSTANCE
					.getRole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			roleName_5001Parser = parser;
		}
		return roleName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser roleRoleType_5002Parser;

	/**
	 * @generated
	 */
	private IParser getRoleRoleType_5002Parser() {
		if (roleRoleType_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { OMPackage.eINSTANCE
					.getRole_RoleType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("\"{0}\""); //$NON-NLS-1$
			parser.setEditorPattern("\"{0}\""); //$NON-NLS-1$
			parser.setEditPattern("\"{0}\""); //$NON-NLS-1$
			roleRoleType_5002Parser = parser;
		}
		return roleRoleType_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser networkDependencyName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getNetworkDependencyName_6001Parser() {
		if (networkDependencyName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { OMPackage.eINSTANCE
					.getDependency_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			networkDependencyName_6001Parser = parser;
		}
		return networkDependencyName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser marketDependencyName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getMarketDependencyName_6002Parser() {
		if (marketDependencyName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { OMPackage.eINSTANCE
					.getDependency_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			marketDependencyName_6002Parser = parser;
		}
		return marketDependencyName_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser hierarchyDependencyName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getHierarchyDependencyName_6003Parser() {
		if (hierarchyDependencyName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { OMPackage.eINSTANCE
					.getDependency_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hierarchyDependencyName_6003Parser = parser;
		}
		return hierarchyDependencyName_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RoleNameEditPart.VISUAL_ID:
			return getRoleName_5001Parser();
		case RoleRoleTypeEditPart.VISUAL_ID:
			return getRoleRoleType_5002Parser();
		case NetworkDependencyNameEditPart.VISUAL_ID:
			return getNetworkDependencyName_6001Parser();
		case MarketDependencyNameEditPart.VISUAL_ID:
			return getMarketDependencyName_6002Parser();
		case HierarchyDependencyNameEditPart.VISUAL_ID:
			return getHierarchyDependencyName_6003Parser();
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
			return getParser(OperAVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(OperAVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (OperAElementTypes.getElement(hint) == null) {
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
