package net.sf.ictalive.operetta.OM.diagram.is.providers;

import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneSceneIDEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.TransitionToSceneArcTypeEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.parsers.MessageFormatParser;
import net.sf.ictalive.operetta.OM.diagram.is.part.OperAVisualIDRegistry;

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
	private IParser sceneSceneID_5101Parser;

	/**
	 * @generated
	 */
	private IParser getSceneSceneID_5101Parser() {
		if (sceneSceneID_5101Parser == null) {
			EAttribute[] features = new EAttribute[] { OMPackage.eINSTANCE
					.getScene_SceneID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sceneSceneID_5101Parser = parser;
		}
		return sceneSceneID_5101Parser;
	}

	/**
	 * @generated
	 */
	private IParser landmarkName_5104Parser;

	/**
	 * @generated
	 */
	private IParser getLandmarkName_5104Parser() {
		if (landmarkName_5104Parser == null) {
			EAttribute[] features = new EAttribute[] { OMPackage.eINSTANCE
					.getLandmark_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { OMPackage.eINSTANCE
					.getLandmark_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			landmarkName_5104Parser = parser;
		}
		return landmarkName_5104Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SceneSceneIDEditPart.VISUAL_ID:
			return getSceneSceneID_5101Parser();
		case LandmarkNameEditPart.VISUAL_ID:
			return getLandmarkName_5104Parser();
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
