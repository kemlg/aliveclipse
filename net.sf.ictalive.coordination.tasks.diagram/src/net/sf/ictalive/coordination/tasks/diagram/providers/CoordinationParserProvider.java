package net.sf.ictalive.coordination.tasks.diagram.providers;

import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomicActionNameEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.BuiltInAtomBuiltInEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.CompositeActionNameEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ConditionNameEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataValueLiteral2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataValueLiteralEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataValueType2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataValueTypeEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataVariableName2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataVariableNameEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableName2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableName3EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableName4EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableName5EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableName6EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableNameEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputMessageMapMessagePartEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputNameEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.OutputNameEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskNameEditPart;
import net.sf.ictalive.coordination.tasks.diagram.parsers.MessageFormatParser;
import net.sf.ictalive.coordination.tasks.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.owls.expr.ExprPackage;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.rules.swrl.SwrlPackage;

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
	private IParser compositeActionName_5035Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeActionName_5035Parser() {
		if (compositeActionName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Composite Action {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			compositeActionName_5035Parser = parser;
		}
		return compositeActionName_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_5049Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_5049Parser() {
		if (taskName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { TasksPackage.eINSTANCE
					.getTask_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { TasksPackage.eINSTANCE
					.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Task {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			taskName_5049Parser = parser;
		}
		return taskName_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicActionName_5050Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicActionName_5050Parser() {
		if (atomicActionName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Atomic Action {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			atomicActionName_5050Parser = parser;
		}
		return atomicActionName_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputName_5051Parser;

	/**
	 * @generated
	 */
	private IParser getInputName_5051Parser() {
		if (inputName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Input {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			inputName_5051Parser = parser;
		}
		return inputName_5051Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputName_5052Parser;

	/**
	 * @generated
	 */
	private IParser getOutputName_5052Parser() {
		if (outputName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Output {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			outputName_5052Parser = parser;
		}
		return outputName_5052Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionName_5047Parser;

	/**
	 * @generated
	 */
	private IParser getConditionName_5047Parser() {
		if (conditionName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Precondition {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			conditionName_5047Parser = parser;
		}
		return conditionName_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser individualVariableName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualVariableName_5036Parser() {
		if (individualVariableName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			individualVariableName_5036Parser = parser;
		}
		return individualVariableName_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser individualVariableName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualVariableName_5037Parser() {
		if (individualVariableName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			individualVariableName_5037Parser = parser;
		}
		return individualVariableName_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser individualVariableName_5038Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualVariableName_5038Parser() {
		if (individualVariableName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			individualVariableName_5038Parser = parser;
		}
		return individualVariableName_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser individualVariableName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualVariableName_5039Parser() {
		if (individualVariableName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			individualVariableName_5039Parser = parser;
		}
		return individualVariableName_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser individualVariableName_5040Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualVariableName_5040Parser() {
		if (individualVariableName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			individualVariableName_5040Parser = parser;
		}
		return individualVariableName_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser builtInAtomBuiltIn_5041Parser;

	/**
	 * @generated
	 */
	private IParser getBuiltInAtomBuiltIn_5041Parser() {
		if (builtInAtomBuiltIn_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getBuiltInAtom_BuiltIn() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} args:"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			builtInAtomBuiltIn_5041Parser = parser;
		}
		return builtInAtomBuiltIn_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataValueLiteral_5042Parser;

	/**
	 * @generated
	 */
	private IParser getDataValueLiteral_5042Parser() {
		if (dataValueLiteral_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataValue_Literal() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataValue_Literal() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Value {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			dataValueLiteral_5042Parser = parser;
		}
		return dataValueLiteral_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataValueType_5043Parser;

	/**
	 * @generated
	 */
	private IParser getDataValueType_5043Parser() {
		if (dataValueType_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataValue_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Type {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Type {0}"); //$NON-NLS-1$
			parser.setEditPattern("Type {0}"); //$NON-NLS-1$
			dataValueType_5043Parser = parser;
		}
		return dataValueType_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataVariableName_5044Parser;

	/**
	 * @generated
	 */
	private IParser getDataVariableName_5044Parser() {
		if (dataVariableName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			dataVariableName_5044Parser = parser;
		}
		return dataVariableName_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataValueLiteral_5062Parser;

	/**
	 * @generated
	 */
	private IParser getDataValueLiteral_5062Parser() {
		if (dataValueLiteral_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataValue_Literal() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataValue_Literal() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Value {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			dataValueLiteral_5062Parser = parser;
		}
		return dataValueLiteral_5062Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataValueType_5063Parser;

	/**
	 * @generated
	 */
	private IParser getDataValueType_5063Parser() {
		if (dataValueType_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataValue_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Type {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Type {0}"); //$NON-NLS-1$
			parser.setEditPattern("Type {0}"); //$NON-NLS-1$
			dataValueType_5063Parser = parser;
		}
		return dataValueType_5063Parser;
	}

	/**
	 * @generated
	 */
	private IParser individualVariableName_5045Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualVariableName_5045Parser() {
		if (individualVariableName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			individualVariableName_5045Parser = parser;
		}
		return individualVariableName_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataVariableName_5046Parser;

	/**
	 * @generated
	 */
	private IParser getDataVariableName_5046Parser() {
		if (dataVariableName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			dataVariableName_5046Parser = parser;
		}
		return dataVariableName_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputMessageMapMessagePart_5048Parser;

	/**
	 * @generated
	 */
	private IParser getInputMessageMapMessagePart_5048Parser() {
		if (inputMessageMapMessagePart_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { TasksPackage.eINSTANCE
					.getInputMessageMap_MessagePart() };
			EAttribute[] editableFeatures = new EAttribute[] { TasksPackage.eINSTANCE
					.getInputMessageMap_MessagePart() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("InputMessageMap MessagePart {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			inputMessageMapMessagePart_5048Parser = parser;
		}
		return inputMessageMapMessagePart_5048Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CompositeActionNameEditPart.VISUAL_ID:
			return getCompositeActionName_5035Parser();
		case TaskNameEditPart.VISUAL_ID:
			return getTaskName_5049Parser();
		case AtomicActionNameEditPart.VISUAL_ID:
			return getAtomicActionName_5050Parser();
		case InputNameEditPart.VISUAL_ID:
			return getInputName_5051Parser();
		case OutputNameEditPart.VISUAL_ID:
			return getOutputName_5052Parser();
		case ConditionNameEditPart.VISUAL_ID:
			return getConditionName_5047Parser();
		case IndividualVariableNameEditPart.VISUAL_ID:
			return getIndividualVariableName_5036Parser();
		case IndividualVariableName2EditPart.VISUAL_ID:
			return getIndividualVariableName_5037Parser();
		case IndividualVariableName3EditPart.VISUAL_ID:
			return getIndividualVariableName_5038Parser();
		case IndividualVariableName4EditPart.VISUAL_ID:
			return getIndividualVariableName_5039Parser();
		case IndividualVariableName5EditPart.VISUAL_ID:
			return getIndividualVariableName_5040Parser();
		case BuiltInAtomBuiltInEditPart.VISUAL_ID:
			return getBuiltInAtomBuiltIn_5041Parser();
		case DataValueLiteralEditPart.VISUAL_ID:
			return getDataValueLiteral_5042Parser();
		case DataValueTypeEditPart.VISUAL_ID:
			return getDataValueType_5043Parser();
		case DataVariableNameEditPart.VISUAL_ID:
			return getDataVariableName_5044Parser();
		case DataValueLiteral2EditPart.VISUAL_ID:
			return getDataValueLiteral_5062Parser();
		case DataValueType2EditPart.VISUAL_ID:
			return getDataValueType_5063Parser();
		case IndividualVariableName6EditPart.VISUAL_ID:
			return getIndividualVariableName_5045Parser();
		case DataVariableName2EditPart.VISUAL_ID:
			return getDataVariableName_5046Parser();
		case InputMessageMapMessagePartEditPart.VISUAL_ID:
			return getInputMessageMapMessagePart_5048Parser();
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
