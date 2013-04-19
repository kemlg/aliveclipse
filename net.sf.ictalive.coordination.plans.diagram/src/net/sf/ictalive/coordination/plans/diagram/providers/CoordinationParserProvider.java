package net.sf.ictalive.coordination.plans.diagram.providers;

import net.sf.ictalive.coordination.plans.diagram.edit.parts.AtomicActionNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.CompositeActionNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputMessageMapMessagePartEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.OutputNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.TaskNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.parsers.MessageFormatParser;
import net.sf.ictalive.coordination.plans.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.tasks.TasksPackage;
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
	private IParser taskName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_5007Parser() {
		if (taskName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { TasksPackage.eINSTANCE
					.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Task {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			taskName_5007Parser = parser;
		}
		return taskName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicActionName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicActionName_5009Parser() {
		if (atomicActionName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Atomic Action {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			atomicActionName_5009Parser = parser;
		}
		return atomicActionName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeActionName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeActionName_5010Parser() {
		if (compositeActionName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Composite Action {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			compositeActionName_5010Parser = parser;
		}
		return compositeActionName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getInputName_5011Parser() {
		if (inputName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Input {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			inputName_5011Parser = parser;
		}
		return inputName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getOutputName_5012Parser() {
		if (outputName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Output {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			outputName_5012Parser = parser;
		}
		return outputName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputMessageMapMessagePart_5008Parser;

	/**
	 * @generated
	 */
	private IParser getInputMessageMapMessagePart_5008Parser() {
		if (inputMessageMapMessagePart_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { TasksPackage.eINSTANCE
					.getInputMessageMap_MessagePart() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Input Message Map {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			inputMessageMapMessagePart_5008Parser = parser;
		}
		return inputMessageMapMessagePart_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TaskNameEditPart.VISUAL_ID:
			return getTaskName_5007Parser();
		case AtomicActionNameEditPart.VISUAL_ID:
			return getAtomicActionName_5009Parser();
		case CompositeActionNameEditPart.VISUAL_ID:
			return getCompositeActionName_5010Parser();
		case InputNameEditPart.VISUAL_ID:
			return getInputName_5011Parser();
		case OutputNameEditPart.VISUAL_ID:
			return getOutputName_5012Parser();
		case InputMessageMapMessagePartEditPart.VISUAL_ID:
			return getInputMessageMapMessagePart_5008Parser();
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
