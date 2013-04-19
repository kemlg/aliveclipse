package net.sf.ictalive.coordination.actions.diagram.providers;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionNameEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultHasDensityEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.BuiltInAtomBuiltInEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.CompositeActionNameEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ConditionName2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ConditionName3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ConditionName4EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ConditionName5EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ConditionNameEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataValueLiteral2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataValueLiteralEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataValueType2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataValueTypeEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataVariableName2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataVariableNameEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Distribution2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Distribution3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DistributionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ExpressionName2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ExpressionNameEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariableName2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariableName3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariableName4EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariableName5EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariableName6EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariableNameEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.InputNameEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.OutputNameEditPart;
import net.sf.ictalive.coordination.actions.diagram.parsers.MessageFormatParser;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry;
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
	private IParser compositeActionName_5055Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeActionName_5055Parser() {
		if (compositeActionName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Composite Action {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			compositeActionName_5055Parser = parser;
		}
		return compositeActionName_5055Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicActionName_5060Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicActionName_5060Parser() {
		if (atomicActionName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Atomic Action {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			atomicActionName_5060Parser = parser;
		}
		return atomicActionName_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputName_5061Parser;

	/**
	 * @generated
	 */
	private IParser getInputName_5061Parser() {
		if (inputName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Input {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			inputName_5061Parser = parser;
		}
		return inputName_5061Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputName_5062Parser;

	/**
	 * @generated
	 */
	private IParser getOutputName_5062Parser() {
		if (outputName_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Output {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			outputName_5062Parser = parser;
		}
		return outputName_5062Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionName_5054Parser;

	/**
	 * @generated
	 */
	private IParser getConditionName_5054Parser() {
		if (conditionName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Precondition {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			conditionName_5054Parser = parser;
		}
		return conditionName_5054Parser;
	}

	/**
	 * @generated
	 */
	private IParser individualVariableName_5043Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualVariableName_5043Parser() {
		if (individualVariableName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			individualVariableName_5043Parser = parser;
		}
		return individualVariableName_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser individualVariableName_5044Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualVariableName_5044Parser() {
		if (individualVariableName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			individualVariableName_5044Parser = parser;
		}
		return individualVariableName_5044Parser;
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
	private IParser individualVariableName_5046Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualVariableName_5046Parser() {
		if (individualVariableName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			individualVariableName_5046Parser = parser;
		}
		return individualVariableName_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser individualVariableName_5047Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualVariableName_5047Parser() {
		if (individualVariableName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			individualVariableName_5047Parser = parser;
		}
		return individualVariableName_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser builtInAtomBuiltIn_5048Parser;

	/**
	 * @generated
	 */
	private IParser getBuiltInAtomBuiltIn_5048Parser() {
		if (builtInAtomBuiltIn_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getBuiltInAtom_BuiltIn() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} args:"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			builtInAtomBuiltIn_5048Parser = parser;
		}
		return builtInAtomBuiltIn_5048Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataValueLiteral_5049Parser;

	/**
	 * @generated
	 */
	private IParser getDataValueLiteral_5049Parser() {
		if (dataValueLiteral_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataValue_Literal() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataValue_Literal() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Value {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			dataValueLiteral_5049Parser = parser;
		}
		return dataValueLiteral_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataValueType_5050Parser;

	/**
	 * @generated
	 */
	private IParser getDataValueType_5050Parser() {
		if (dataValueType_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataValue_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Type {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Type {0}"); //$NON-NLS-1$
			parser.setEditPattern("Type {0}"); //$NON-NLS-1$
			dataValueType_5050Parser = parser;
		}
		return dataValueType_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataVariableName_5051Parser;

	/**
	 * @generated
	 */
	private IParser getDataVariableName_5051Parser() {
		if (dataVariableName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			dataVariableName_5051Parser = parser;
		}
		return dataVariableName_5051Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataValueLiteral_5076Parser;

	/**
	 * @generated
	 */
	private IParser getDataValueLiteral_5076Parser() {
		if (dataValueLiteral_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataValue_Literal() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataValue_Literal() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Value {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			dataValueLiteral_5076Parser = parser;
		}
		return dataValueLiteral_5076Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataValueType_5077Parser;

	/**
	 * @generated
	 */
	private IParser getDataValueType_5077Parser() {
		if (dataValueType_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataValue_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Type {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Type {0}"); //$NON-NLS-1$
			parser.setEditPattern("Type {0}"); //$NON-NLS-1$
			dataValueType_5077Parser = parser;
		}
		return dataValueType_5077Parser;
	}

	/**
	 * @generated
	 */
	private IParser individualVariableName_5052Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualVariableName_5052Parser() {
		if (individualVariableName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getIndividualVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			individualVariableName_5052Parser = parser;
		}
		return individualVariableName_5052Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataVariableName_5053Parser;

	/**
	 * @generated
	 */
	private IParser getDataVariableName_5053Parser() {
		if (dataVariableName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SwrlPackage.eINSTANCE
					.getDataVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			dataVariableName_5053Parser = parser;
		}
		return dataVariableName_5053Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionName_5056Parser;

	/**
	 * @generated
	 */
	private IParser getConditionName_5056Parser() {
		if (conditionName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Precondition {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			conditionName_5056Parser = parser;
		}
		return conditionName_5056Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicActionResultHasDensity_5059Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicActionResultHasDensity_5059Parser() {
		if (atomicActionResultHasDensity_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { ActionsPackage.eINSTANCE
					.getAtomicActionResult_HasDensity() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Density {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Density {0}"); //$NON-NLS-1$
			parser.setEditPattern("Density {0}"); //$NON-NLS-1$
			atomicActionResultHasDensity_5059Parser = parser;
		}
		return atomicActionResultHasDensity_5059Parser;
	}

	/**
	 * @generated
	 */
	private IParser expressionName_5057Parser;

	/**
	 * @generated
	 */
	private IParser getExpressionName_5057Parser() {
		if (expressionName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			expressionName_5057Parser = parser;
		}
		return expressionName_5057Parser;
	}

	/**
	 * @generated
	 */
	private IParser expressionName_5058Parser;

	/**
	 * @generated
	 */
	private IParser getExpressionName_5058Parser() {
		if (expressionName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			expressionName_5058Parser = parser;
		}
		return expressionName_5058Parser;
	}

	/**
	 * @generated
	 */
	private IParser distribution_3084Parser;

	/**
	 * @generated
	 */
	private IParser getDistribution_3084Parser() {
		if (distribution_3084Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActionsPackage.eINSTANCE.getDistribution_Datapoint(),
					ActionsPackage.eINSTANCE.getDistribution_Density() };
			MessageFormatParser parser = new MessageFormatParser(features);
			distribution_3084Parser = parser;
		}
		return distribution_3084Parser;
	}

	/**
	 * @generated
	 */
	private IParser distribution_3085Parser;

	/**
	 * @generated
	 */
	private IParser getDistribution_3085Parser() {
		if (distribution_3085Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActionsPackage.eINSTANCE.getDistribution_Datapoint(),
					ActionsPackage.eINSTANCE.getDistribution_Density() };
			MessageFormatParser parser = new MessageFormatParser(features);
			distribution_3085Parser = parser;
		}
		return distribution_3085Parser;
	}

	/**
	 * @generated
	 */
	private IParser distribution_3086Parser;

	/**
	 * @generated
	 */
	private IParser getDistribution_3086Parser() {
		if (distribution_3086Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActionsPackage.eINSTANCE.getDistribution_Datapoint(),
					ActionsPackage.eINSTANCE.getDistribution_Density() };
			MessageFormatParser parser = new MessageFormatParser(features);
			distribution_3086Parser = parser;
		}
		return distribution_3086Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionName_5064Parser;

	/**
	 * @generated
	 */
	private IParser getConditionName_5064Parser() {
		if (conditionName_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("if {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			conditionName_5064Parser = parser;
		}
		return conditionName_5064Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionName_5065Parser;

	/**
	 * @generated
	 */
	private IParser getConditionName_5065Parser() {
		if (conditionName_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("if {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			conditionName_5065Parser = parser;
		}
		return conditionName_5065Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionName_5066Parser;

	/**
	 * @generated
	 */
	private IParser getConditionName_5066Parser() {
		if (conditionName_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ExprPackage.eINSTANCE
					.getExpression_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("if {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			conditionName_5066Parser = parser;
		}
		return conditionName_5066Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CompositeActionNameEditPart.VISUAL_ID:
			return getCompositeActionName_5055Parser();
		case AtomicActionNameEditPart.VISUAL_ID:
			return getAtomicActionName_5060Parser();
		case InputNameEditPart.VISUAL_ID:
			return getInputName_5061Parser();
		case OutputNameEditPart.VISUAL_ID:
			return getOutputName_5062Parser();
		case ConditionNameEditPart.VISUAL_ID:
			return getConditionName_5054Parser();
		case IndividualVariableNameEditPart.VISUAL_ID:
			return getIndividualVariableName_5043Parser();
		case IndividualVariableName2EditPart.VISUAL_ID:
			return getIndividualVariableName_5044Parser();
		case IndividualVariableName3EditPart.VISUAL_ID:
			return getIndividualVariableName_5045Parser();
		case IndividualVariableName4EditPart.VISUAL_ID:
			return getIndividualVariableName_5046Parser();
		case IndividualVariableName5EditPart.VISUAL_ID:
			return getIndividualVariableName_5047Parser();
		case BuiltInAtomBuiltInEditPart.VISUAL_ID:
			return getBuiltInAtomBuiltIn_5048Parser();
		case DataValueLiteralEditPart.VISUAL_ID:
			return getDataValueLiteral_5049Parser();
		case DataValueTypeEditPart.VISUAL_ID:
			return getDataValueType_5050Parser();
		case DataVariableNameEditPart.VISUAL_ID:
			return getDataVariableName_5051Parser();
		case DataValueLiteral2EditPart.VISUAL_ID:
			return getDataValueLiteral_5076Parser();
		case DataValueType2EditPart.VISUAL_ID:
			return getDataValueType_5077Parser();
		case IndividualVariableName6EditPart.VISUAL_ID:
			return getIndividualVariableName_5052Parser();
		case DataVariableName2EditPart.VISUAL_ID:
			return getDataVariableName_5053Parser();
		case ConditionName2EditPart.VISUAL_ID:
			return getConditionName_5056Parser();
		case AtomicActionResultHasDensityEditPart.VISUAL_ID:
			return getAtomicActionResultHasDensity_5059Parser();
		case ExpressionNameEditPart.VISUAL_ID:
			return getExpressionName_5057Parser();
		case ExpressionName2EditPart.VISUAL_ID:
			return getExpressionName_5058Parser();
		case DistributionEditPart.VISUAL_ID:
			return getDistribution_3084Parser();
		case Distribution2EditPart.VISUAL_ID:
			return getDistribution_3085Parser();
		case Distribution3EditPart.VISUAL_ID:
			return getDistribution_3086Parser();
		case ConditionName3EditPart.VISUAL_ID:
			return getConditionName_5064Parser();
		case ConditionName4EditPart.VISUAL_ID:
			return getConditionName_5065Parser();
		case ConditionName5EditPart.VISUAL_ID:
			return getConditionName_5066Parser();
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
