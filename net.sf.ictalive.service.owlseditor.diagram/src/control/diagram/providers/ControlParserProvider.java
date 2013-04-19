/*
 * 
 */
package control.diagram.providers;

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

import control.ControlPackage;
import control.diagram.edit.parts.*;
import control.diagram.parsers.MessageFormatParser;
import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class ControlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser inputName_5129Parser;

	/**
	 * @generated
	 */
	private IParser getInputName_5129Parser() {
		if (inputName_5129Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5129Parser = parser;
		}
		return inputName_5129Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputName_5130Parser;

	/**
	 * @generated
	 */
	private IParser getOutputName_5130Parser() {
		if (outputName_5130Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputName_5130Parser = parser;
		}
		return outputName_5130Parser;
	}

	/**
	 * @generated
	 */
	private IParser locName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getLocName_5003Parser() {
		if (locName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locName_5003Parser = parser;
		}
		return locName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5097Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5097Parser() {
		if (sequenceName_5097Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sequenceName_5097Parser = parser;
		}
		return sequenceName_5097Parser;
	}

	/**
	 * @generated
	 */
	private IParser choiceName_5098Parser;

	/**
	 * @generated
	 */
	private IParser getChoiceName_5098Parser() {
		if (choiceName_5098Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			choiceName_5098Parser = parser;
		}
		return choiceName_5098Parser;
	}

	/**
	 * @generated
	 */
	private IParser anyOrderName_5099Parser;

	/**
	 * @generated
	 */
	private IParser getAnyOrderName_5099Parser() {
		if (anyOrderName_5099Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			anyOrderName_5099Parser = parser;
		}
		return anyOrderName_5099Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitName_5100Parser;

	/**
	 * @generated
	 */
	private IParser getSplitName_5100Parser() {
		if (splitName_5100Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitName_5100Parser = parser;
		}
		return splitName_5100Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitJoinName_5101Parser;

	/**
	 * @generated
	 */
	private IParser getSplitJoinName_5101Parser() {
		if (splitJoinName_5101Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitJoinName_5101Parser = parser;
		}
		return splitJoinName_5101Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifThenElseName_5102Parser;

	/**
	 * @generated
	 */
	private IParser getIfThenElseName_5102Parser() {
		if (ifThenElseName_5102Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifThenElseName_5102Parser = parser;
		}
		return ifThenElseName_5102Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5103Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5103Parser() {
		if (repeatUntilName_5103Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatUntilName_5103Parser = parser;
		}
		return repeatUntilName_5103Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatWhileName_5104Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatWhileName_5104Parser() {
		if (repeatWhileName_5104Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatWhileName_5104Parser = parser;
		}
		return repeatWhileName_5104Parser;
	}

	/**
	 * @generated
	 */
	private IParser performName_5105Parser;

	/**
	 * @generated
	 */
	private IParser getPerformName_5105Parser() {
		if (performName_5105Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			performName_5105Parser = parser;
		}
		return performName_5105Parser;
	}

	/**
	 * @generated
	 */
	private IParser produceName_5106Parser;

	/**
	 * @generated
	 */
	private IParser getProduceName_5106Parser() {
		if (produceName_5106Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			produceName_5106Parser = parser;
		}
		return produceName_5106Parser;
	}

	/**
	 * @generated
	 */
	private IParser setName_5107Parser;

	/**
	 * @generated
	 */
	private IParser getSetName_5107Parser() {
		if (setName_5107Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			setName_5107Parser = parser;
		}
		return setName_5107Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkName_5108Parser;

	/**
	 * @generated
	 */
	private IParser getLinkName_5108Parser() {
		if (linkName_5108Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			linkName_5108Parser = parser;
		}
		return linkName_5108Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionName_5110Parser;

	/**
	 * @generated
	 */
	private IParser getConditionName_5110Parser() {
		if (conditionName_5110Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionName_5110Parser = parser;
		}
		return conditionName_5110Parser;
	}

	/**
	 * @generated
	 */
	private IParser resultName_5119Parser;

	/**
	 * @generated
	 */
	private IParser getResultName_5119Parser() {
		if (resultName_5119Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			resultName_5119Parser = parser;
		}
		return resultName_5119Parser;
	}

	/**
	 * @generated
	 */
	private IParser ontologyName_5145Parser;

	/**
	 * @generated
	 */
	private IParser getOntologyName_5145Parser() {
		if (ontologyName_5145Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ontologyName_5145Parser = parser;
		}
		return ontologyName_5145Parser;
	}

	/**
	 * @generated
	 */
	private IParser templateConstraintName_5146Parser;

	/**
	 * @generated
	 */
	private IParser getTemplateConstraintName_5146Parser() {
		if (templateConstraintName_5146Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			templateConstraintName_5146Parser = parser;
		}
		return templateConstraintName_5146Parser;
	}

	/**
	 * @generated
	 */
	private IParser exprName_5120Parser;

	/**
	 * @generated
	 */
	private IParser getExprName_5120Parser() {
		if (exprName_5120Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exprName_5120Parser = parser;
		}
		return exprName_5120Parser;
	}

	/**
	 * @generated
	 */
	private IParser controlConstructListName_5096Parser;

	/**
	 * @generated
	 */
	private IParser getControlConstructListName_5096Parser() {
		if (controlConstructListName_5096Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			controlConstructListName_5096Parser = parser;
		}
		return controlConstructListName_5096Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5004Parser() {
		if (sequenceName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sequenceName_5004Parser = parser;
		}
		return sequenceName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser choiceName_5084Parser;

	/**
	 * @generated
	 */
	private IParser getChoiceName_5084Parser() {
		if (choiceName_5084Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			choiceName_5084Parser = parser;
		}
		return choiceName_5084Parser;
	}

	/**
	 * @generated
	 */
	private IParser controlConstructBagName_5083Parser;

	/**
	 * @generated
	 */
	private IParser getControlConstructBagName_5083Parser() {
		if (controlConstructBagName_5083Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			controlConstructBagName_5083Parser = parser;
		}
		return controlConstructBagName_5083Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5005Parser() {
		if (sequenceName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sequenceName_5005Parser = parser;
		}
		return sequenceName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser choiceName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getChoiceName_5006Parser() {
		if (choiceName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			choiceName_5006Parser = parser;
		}
		return choiceName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser anyOrderName_5082Parser;

	/**
	 * @generated
	 */
	private IParser getAnyOrderName_5082Parser() {
		if (anyOrderName_5082Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			anyOrderName_5082Parser = parser;
		}
		return anyOrderName_5082Parser;
	}

	/**
	 * @generated
	 */
	private IParser controlConstructBagName_5081Parser;

	/**
	 * @generated
	 */
	private IParser getControlConstructBagName_5081Parser() {
		if (controlConstructBagName_5081Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			controlConstructBagName_5081Parser = parser;
		}
		return controlConstructBagName_5081Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitName_5080Parser;

	/**
	 * @generated
	 */
	private IParser getSplitName_5080Parser() {
		if (splitName_5080Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitName_5080Parser = parser;
		}
		return splitName_5080Parser;
	}

	/**
	 * @generated
	 */
	private IParser controlConstructBagName_5079Parser;

	/**
	 * @generated
	 */
	private IParser getControlConstructBagName_5079Parser() {
		if (controlConstructBagName_5079Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			controlConstructBagName_5079Parser = parser;
		}
		return controlConstructBagName_5079Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitJoinName_5078Parser;

	/**
	 * @generated
	 */
	private IParser getSplitJoinName_5078Parser() {
		if (splitJoinName_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitJoinName_5078Parser = parser;
		}
		return splitJoinName_5078Parser;
	}

	/**
	 * @generated
	 */
	private IParser controlConstructBagName_5077Parser;

	/**
	 * @generated
	 */
	private IParser getControlConstructBagName_5077Parser() {
		if (controlConstructBagName_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			controlConstructBagName_5077Parser = parser;
		}
		return controlConstructBagName_5077Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifThenElseName_5069Parser;

	/**
	 * @generated
	 */
	private IParser getIfThenElseName_5069Parser() {
		if (ifThenElseName_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifThenElseName_5069Parser = parser;
		}
		return ifThenElseName_5069Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5007Parser() {
		if (sequenceName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sequenceName_5007Parser = parser;
		}
		return sequenceName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser choiceName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getChoiceName_5008Parser() {
		if (choiceName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			choiceName_5008Parser = parser;
		}
		return choiceName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser anyOrderName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getAnyOrderName_5009Parser() {
		if (anyOrderName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			anyOrderName_5009Parser = parser;
		}
		return anyOrderName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getSplitName_5010Parser() {
		if (splitName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitName_5010Parser = parser;
		}
		return splitName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitJoinName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getSplitJoinName_5011Parser() {
		if (splitJoinName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitJoinName_5011Parser = parser;
		}
		return splitJoinName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifThenElseName_5068Parser;

	/**
	 * @generated
	 */
	private IParser getIfThenElseName_5068Parser() {
		if (ifThenElseName_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifThenElseName_5068Parser = parser;
		}
		return ifThenElseName_5068Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5067Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5067Parser() {
		if (repeatUntilName_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatUntilName_5067Parser = parser;
		}
		return repeatUntilName_5067Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5012Parser() {
		if (sequenceName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sequenceName_5012Parser = parser;
		}
		return sequenceName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser choiceName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getChoiceName_5013Parser() {
		if (choiceName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			choiceName_5013Parser = parser;
		}
		return choiceName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser anyOrderName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getAnyOrderName_5014Parser() {
		if (anyOrderName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			anyOrderName_5014Parser = parser;
		}
		return anyOrderName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getSplitName_5015Parser() {
		if (splitName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitName_5015Parser = parser;
		}
		return splitName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitJoinName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getSplitJoinName_5016Parser() {
		if (splitJoinName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitJoinName_5016Parser = parser;
		}
		return splitJoinName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifThenElseName_5066Parser;

	/**
	 * @generated
	 */
	private IParser getIfThenElseName_5066Parser() {
		if (ifThenElseName_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifThenElseName_5066Parser = parser;
		}
		return ifThenElseName_5066Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatWhileName_5065Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatWhileName_5065Parser() {
		if (repeatWhileName_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatWhileName_5065Parser = parser;
		}
		return repeatWhileName_5065Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5017Parser() {
		if (sequenceName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sequenceName_5017Parser = parser;
		}
		return sequenceName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser choiceName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getChoiceName_5018Parser() {
		if (choiceName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			choiceName_5018Parser = parser;
		}
		return choiceName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser anyOrderName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getAnyOrderName_5019Parser() {
		if (anyOrderName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			anyOrderName_5019Parser = parser;
		}
		return anyOrderName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getSplitName_5020Parser() {
		if (splitName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitName_5020Parser = parser;
		}
		return splitName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitJoinName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getSplitJoinName_5021Parser() {
		if (splitJoinName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitJoinName_5021Parser = parser;
		}
		return splitJoinName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifThenElseName_5064Parser;

	/**
	 * @generated
	 */
	private IParser getIfThenElseName_5064Parser() {
		if (ifThenElseName_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifThenElseName_5064Parser = parser;
		}
		return ifThenElseName_5064Parser;
	}

	/**
	 * @generated
	 */
	private IParser performName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getPerformName_5030Parser() {
		if (performName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			performName_5030Parser = parser;
		}
		return performName_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser remoteProcessName_5137Parser;

	/**
	 * @generated
	 */
	private IParser getRemoteProcessName_5137Parser() {
		if (remoteProcessName_5137Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			remoteProcessName_5137Parser = parser;
		}
		return remoteProcessName_5137Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputName_5132Parser;

	/**
	 * @generated
	 */
	private IParser getInputName_5132Parser() {
		if (inputName_5132Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5132Parser = parser;
		}
		return inputName_5132Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputName_5133Parser;

	/**
	 * @generated
	 */
	private IParser getOutputName_5133Parser() {
		if (outputName_5133Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputName_5133Parser = parser;
		}
		return outputName_5133Parser;
	}

	/**
	 * @generated
	 */
	private IParser resultName_5134Parser;

	/**
	 * @generated
	 */
	private IParser getResultName_5134Parser() {
		if (resultName_5134Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			resultName_5134Parser = parser;
		}
		return resultName_5134Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueSourceName_5111Parser;

	/**
	 * @generated
	 */
	private IParser getValueSourceName_5111Parser() {
		if (valueSourceName_5111Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueSourceName_5111Parser = parser;
		}
		return valueSourceName_5111Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueFormName_5112Parser;

	/**
	 * @generated
	 */
	private IParser getValueFormName_5112Parser() {
		if (valueFormName_5112Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueFormName_5112Parser = parser;
		}
		return valueFormName_5112Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueFunctionName_5113Parser;

	/**
	 * @generated
	 */
	private IParser getValueFunctionName_5113Parser() {
		if (valueFunctionName_5113Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueFunctionName_5113Parser = parser;
		}
		return valueFunctionName_5113Parser;
	}

	/**
	 * @generated
	 */
	private IParser resultVarName_5114Parser;

	/**
	 * @generated
	 */
	private IParser getResultVarName_5114Parser() {
		if (resultVarName_5114Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			resultVarName_5114Parser = parser;
		}
		return resultVarName_5114Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionName_5115Parser;

	/**
	 * @generated
	 */
	private IParser getConditionName_5115Parser() {
		if (conditionName_5115Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionName_5115Parser = parser;
		}
		return conditionName_5115Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionName_5116Parser;

	/**
	 * @generated
	 */
	private IParser getConditionName_5116Parser() {
		if (conditionName_5116Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionName_5116Parser = parser;
		}
		return conditionName_5116Parser;
	}

	/**
	 * @generated
	 */
	private IParser exprName_5117Parser;

	/**
	 * @generated
	 */
	private IParser getExprName_5117Parser() {
		if (exprName_5117Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exprName_5117Parser = parser;
		}
		return exprName_5117Parser;
	}

	/**
	 * @generated
	 */
	private IParser exprName_5118Parser;

	/**
	 * @generated
	 */
	private IParser getExprName_5118Parser() {
		if (exprName_5118Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exprName_5118Parser = parser;
		}
		return exprName_5118Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionName_5135Parser;

	/**
	 * @generated
	 */
	private IParser getConditionName_5135Parser() {
		if (conditionName_5135Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionName_5135Parser = parser;
		}
		return conditionName_5135Parser;
	}

	/**
	 * @generated
	 */
	private IParser exprName_5136Parser;

	/**
	 * @generated
	 */
	private IParser getExprName_5136Parser() {
		if (exprName_5136Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exprName_5136Parser = parser;
		}
		return exprName_5136Parser;
	}

	/**
	 * @generated
	 */
	private IParser templateProcessName_5138Parser;

	/**
	 * @generated
	 */
	private IParser getTemplateProcessName_5138Parser() {
		if (templateProcessName_5138Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			templateProcessName_5138Parser = parser;
		}
		return templateProcessName_5138Parser;
	}

	/**
	 * @generated
	 */
	private IParser produceName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getProduceName_5034Parser() {
		if (produceName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			produceName_5034Parser = parser;
		}
		return produceName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueSourceName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getValueSourceName_5031Parser() {
		if (valueSourceName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueSourceName_5031Parser = parser;
		}
		return valueSourceName_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueFormName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getValueFormName_5032Parser() {
		if (valueFormName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueFormName_5032Parser = parser;
		}
		return valueFormName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueFunctionName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getValueFunctionName_5033Parser() {
		if (valueFunctionName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueFunctionName_5033Parser = parser;
		}
		return valueFunctionName_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser setName_5038Parser;

	/**
	 * @generated
	 */
	private IParser getSetName_5038Parser() {
		if (setName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			setName_5038Parser = parser;
		}
		return setName_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueSourceName_5035Parser;

	/**
	 * @generated
	 */
	private IParser getValueSourceName_5035Parser() {
		if (valueSourceName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueSourceName_5035Parser = parser;
		}
		return valueSourceName_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueFormName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getValueFormName_5036Parser() {
		if (valueFormName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueFormName_5036Parser = parser;
		}
		return valueFormName_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueFunctionName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getValueFunctionName_5037Parser() {
		if (valueFunctionName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueFunctionName_5037Parser = parser;
		}
		return valueFunctionName_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5039Parser() {
		if (sequenceName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sequenceName_5039Parser = parser;
		}
		return sequenceName_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser choiceName_5040Parser;

	/**
	 * @generated
	 */
	private IParser getChoiceName_5040Parser() {
		if (choiceName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			choiceName_5040Parser = parser;
		}
		return choiceName_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser anyOrderName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getAnyOrderName_5041Parser() {
		if (anyOrderName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			anyOrderName_5041Parser = parser;
		}
		return anyOrderName_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitName_5042Parser;

	/**
	 * @generated
	 */
	private IParser getSplitName_5042Parser() {
		if (splitName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitName_5042Parser = parser;
		}
		return splitName_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitJoinName_5043Parser;

	/**
	 * @generated
	 */
	private IParser getSplitJoinName_5043Parser() {
		if (splitJoinName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitJoinName_5043Parser = parser;
		}
		return splitJoinName_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifThenElseName_5063Parser;

	/**
	 * @generated
	 */
	private IParser getIfThenElseName_5063Parser() {
		if (ifThenElseName_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifThenElseName_5063Parser = parser;
		}
		return ifThenElseName_5063Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5056Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5056Parser() {
		if (repeatUntilName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatUntilName_5056Parser = parser;
		}
		return repeatUntilName_5056Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5055Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5055Parser() {
		if (repeatUntilName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatUntilName_5055Parser = parser;
		}
		return repeatUntilName_5055Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatWhileName_5054Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatWhileName_5054Parser() {
		if (repeatWhileName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatWhileName_5054Parser = parser;
		}
		return repeatWhileName_5054Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5048Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5048Parser() {
		if (repeatUntilName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatUntilName_5048Parser = parser;
		}
		return repeatUntilName_5048Parser;
	}

	/**
	 * @generated
	 */
	private IParser performName_5044Parser;

	/**
	 * @generated
	 */
	private IParser getPerformName_5044Parser() {
		if (performName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			performName_5044Parser = parser;
		}
		return performName_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser produceName_5045Parser;

	/**
	 * @generated
	 */
	private IParser getProduceName_5045Parser() {
		if (produceName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			produceName_5045Parser = parser;
		}
		return produceName_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser setName_5046Parser;

	/**
	 * @generated
	 */
	private IParser getSetName_5046Parser() {
		if (setName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			setName_5046Parser = parser;
		}
		return setName_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionName_5139Parser;

	/**
	 * @generated
	 */
	private IParser getConditionName_5139Parser() {
		if (conditionName_5139Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionName_5139Parser = parser;
		}
		return conditionName_5139Parser;
	}

	/**
	 * @generated
	 */
	private IParser exprName_5140Parser;

	/**
	 * @generated
	 */
	private IParser getExprName_5140Parser() {
		if (exprName_5140Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exprName_5140Parser = parser;
		}
		return exprName_5140Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatWhileName_5053Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatWhileName_5053Parser() {
		if (repeatWhileName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatWhileName_5053Parser = parser;
		}
		return repeatWhileName_5053Parser;
	}

	/**
	 * @generated
	 */
	private IParser performName_5049Parser;

	/**
	 * @generated
	 */
	private IParser getPerformName_5049Parser() {
		if (performName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			performName_5049Parser = parser;
		}
		return performName_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser produceName_5050Parser;

	/**
	 * @generated
	 */
	private IParser getProduceName_5050Parser() {
		if (produceName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			produceName_5050Parser = parser;
		}
		return produceName_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser setName_5051Parser;

	/**
	 * @generated
	 */
	private IParser getSetName_5051Parser() {
		if (setName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			setName_5051Parser = parser;
		}
		return setName_5051Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionName_5141Parser;

	/**
	 * @generated
	 */
	private IParser getConditionName_5141Parser() {
		if (conditionName_5141Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionName_5141Parser = parser;
		}
		return conditionName_5141Parser;
	}

	/**
	 * @generated
	 */
	private IParser exprName_5142Parser;

	/**
	 * @generated
	 */
	private IParser getExprName_5142Parser() {
		if (exprName_5142Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exprName_5142Parser = parser;
		}
		return exprName_5142Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatWhileName_5057Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatWhileName_5057Parser() {
		if (repeatWhileName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatWhileName_5057Parser = parser;
		}
		return repeatWhileName_5057Parser;
	}

	/**
	 * @generated
	 */
	private IParser performName_5058Parser;

	/**
	 * @generated
	 */
	private IParser getPerformName_5058Parser() {
		if (performName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			performName_5058Parser = parser;
		}
		return performName_5058Parser;
	}

	/**
	 * @generated
	 */
	private IParser produceName_5059Parser;

	/**
	 * @generated
	 */
	private IParser getProduceName_5059Parser() {
		if (produceName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			produceName_5059Parser = parser;
		}
		return produceName_5059Parser;
	}

	/**
	 * @generated
	 */
	private IParser setName_5060Parser;

	/**
	 * @generated
	 */
	private IParser getSetName_5060Parser() {
		if (setName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			setName_5060Parser = parser;
		}
		return setName_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionName_5143Parser;

	/**
	 * @generated
	 */
	private IParser getConditionName_5143Parser() {
		if (conditionName_5143Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionName_5143Parser = parser;
		}
		return conditionName_5143Parser;
	}

	/**
	 * @generated
	 */
	private IParser exprName_5144Parser;

	/**
	 * @generated
	 */
	private IParser getExprName_5144Parser() {
		if (exprName_5144Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getExpr_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exprName_5144Parser = parser;
		}
		return exprName_5144Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5070Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5070Parser() {
		if (repeatUntilName_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatUntilName_5070Parser = parser;
		}
		return repeatUntilName_5070Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatWhileName_5071Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatWhileName_5071Parser() {
		if (repeatWhileName_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatWhileName_5071Parser = parser;
		}
		return repeatWhileName_5071Parser;
	}

	/**
	 * @generated
	 */
	private IParser performName_5072Parser;

	/**
	 * @generated
	 */
	private IParser getPerformName_5072Parser() {
		if (performName_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			performName_5072Parser = parser;
		}
		return performName_5072Parser;
	}

	/**
	 * @generated
	 */
	private IParser produceName_5073Parser;

	/**
	 * @generated
	 */
	private IParser getProduceName_5073Parser() {
		if (produceName_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			produceName_5073Parser = parser;
		}
		return produceName_5073Parser;
	}

	/**
	 * @generated
	 */
	private IParser setName_5074Parser;

	/**
	 * @generated
	 */
	private IParser getSetName_5074Parser() {
		if (setName_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			setName_5074Parser = parser;
		}
		return setName_5074Parser;
	}

	/**
	 * @generated
	 */
	private IParser controlConstructBagName_5076Parser;

	/**
	 * @generated
	 */
	private IParser getControlConstructBagName_5076Parser() {
		if (controlConstructBagName_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			controlConstructBagName_5076Parser = parser;
		}
		return controlConstructBagName_5076Parser;
	}

	/**
	 * @generated
	 */
	private IParser anyOrderName_5085Parser;

	/**
	 * @generated
	 */
	private IParser getAnyOrderName_5085Parser() {
		if (anyOrderName_5085Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			anyOrderName_5085Parser = parser;
		}
		return anyOrderName_5085Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitName_5086Parser;

	/**
	 * @generated
	 */
	private IParser getSplitName_5086Parser() {
		if (splitName_5086Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitName_5086Parser = parser;
		}
		return splitName_5086Parser;
	}

	/**
	 * @generated
	 */
	private IParser splitJoinName_5087Parser;

	/**
	 * @generated
	 */
	private IParser getSplitJoinName_5087Parser() {
		if (splitJoinName_5087Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			splitJoinName_5087Parser = parser;
		}
		return splitJoinName_5087Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifThenElseName_5088Parser;

	/**
	 * @generated
	 */
	private IParser getIfThenElseName_5088Parser() {
		if (ifThenElseName_5088Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifThenElseName_5088Parser = parser;
		}
		return ifThenElseName_5088Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5089Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5089Parser() {
		if (repeatUntilName_5089Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatUntilName_5089Parser = parser;
		}
		return repeatUntilName_5089Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatWhileName_5090Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatWhileName_5090Parser() {
		if (repeatWhileName_5090Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatWhileName_5090Parser = parser;
		}
		return repeatWhileName_5090Parser;
	}

	/**
	 * @generated
	 */
	private IParser performName_5091Parser;

	/**
	 * @generated
	 */
	private IParser getPerformName_5091Parser() {
		if (performName_5091Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			performName_5091Parser = parser;
		}
		return performName_5091Parser;
	}

	/**
	 * @generated
	 */
	private IParser produceName_5092Parser;

	/**
	 * @generated
	 */
	private IParser getProduceName_5092Parser() {
		if (produceName_5092Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			produceName_5092Parser = parser;
		}
		return produceName_5092Parser;
	}

	/**
	 * @generated
	 */
	private IParser setName_5093Parser;

	/**
	 * @generated
	 */
	private IParser getSetName_5093Parser() {
		if (setName_5093Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			setName_5093Parser = parser;
		}
		return setName_5093Parser;
	}

	/**
	 * @generated
	 */
	private IParser controlConstructListName_5095Parser;

	/**
	 * @generated
	 */
	private IParser getControlConstructListName_5095Parser() {
		if (controlConstructListName_5095Parser == null) {
			EAttribute[] features = new EAttribute[] { ControlPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			controlConstructListName_5095Parser = parser;
		}
		return controlConstructListName_5095Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case InputNameEditPart.VISUAL_ID:
			return getInputName_5129Parser();
		case OutputNameEditPart.VISUAL_ID:
			return getOutputName_5130Parser();
		case LocNameEditPart.VISUAL_ID:
			return getLocName_5003Parser();
		case SequenceNameEditPart.VISUAL_ID:
			return getSequenceName_5097Parser();
		case ChoiceNameEditPart.VISUAL_ID:
			return getChoiceName_5098Parser();
		case AnyOrderNameEditPart.VISUAL_ID:
			return getAnyOrderName_5099Parser();
		case SplitNameEditPart.VISUAL_ID:
			return getSplitName_5100Parser();
		case SplitJoinNameEditPart.VISUAL_ID:
			return getSplitJoinName_5101Parser();
		case IfThenElseNameEditPart.VISUAL_ID:
			return getIfThenElseName_5102Parser();
		case RepeatUntilNameEditPart.VISUAL_ID:
			return getRepeatUntilName_5103Parser();
		case RepeatWhileNameEditPart.VISUAL_ID:
			return getRepeatWhileName_5104Parser();
		case PerformNameEditPart.VISUAL_ID:
			return getPerformName_5105Parser();
		case ProduceNameEditPart.VISUAL_ID:
			return getProduceName_5106Parser();
		case SetNameEditPart.VISUAL_ID:
			return getSetName_5107Parser();
		case LinkNameEditPart.VISUAL_ID:
			return getLinkName_5108Parser();
		case ConditionNameEditPart.VISUAL_ID:
			return getConditionName_5110Parser();
		case ResultNameEditPart.VISUAL_ID:
			return getResultName_5119Parser();
		case OntologyNameEditPart.VISUAL_ID:
			return getOntologyName_5145Parser();
		case TemplateConstraintNameEditPart.VISUAL_ID:
			return getTemplateConstraintName_5146Parser();
		case ExprNameEditPart.VISUAL_ID:
			return getExprName_5120Parser();
		case ControlConstructListNameEditPart.VISUAL_ID:
			return getControlConstructListName_5096Parser();
		case SequenceName2EditPart.VISUAL_ID:
			return getSequenceName_5004Parser();
		case ChoiceName2EditPart.VISUAL_ID:
			return getChoiceName_5084Parser();
		case ControlConstructBagNameEditPart.VISUAL_ID:
			return getControlConstructBagName_5083Parser();
		case SequenceName3EditPart.VISUAL_ID:
			return getSequenceName_5005Parser();
		case ChoiceName3EditPart.VISUAL_ID:
			return getChoiceName_5006Parser();
		case AnyOrderName2EditPart.VISUAL_ID:
			return getAnyOrderName_5082Parser();
		case ControlConstructBagName2EditPart.VISUAL_ID:
			return getControlConstructBagName_5081Parser();
		case SplitName2EditPart.VISUAL_ID:
			return getSplitName_5080Parser();
		case ControlConstructBagName3EditPart.VISUAL_ID:
			return getControlConstructBagName_5079Parser();
		case SplitJoinName2EditPart.VISUAL_ID:
			return getSplitJoinName_5078Parser();
		case ControlConstructBagName4EditPart.VISUAL_ID:
			return getControlConstructBagName_5077Parser();
		case IfThenElseName2EditPart.VISUAL_ID:
			return getIfThenElseName_5069Parser();
		case SequenceName4EditPart.VISUAL_ID:
			return getSequenceName_5007Parser();
		case ChoiceName4EditPart.VISUAL_ID:
			return getChoiceName_5008Parser();
		case AnyOrderName3EditPart.VISUAL_ID:
			return getAnyOrderName_5009Parser();
		case SplitName3EditPart.VISUAL_ID:
			return getSplitName_5010Parser();
		case SplitJoinName3EditPart.VISUAL_ID:
			return getSplitJoinName_5011Parser();
		case IfThenElseName3EditPart.VISUAL_ID:
			return getIfThenElseName_5068Parser();
		case RepeatUntilName2EditPart.VISUAL_ID:
			return getRepeatUntilName_5067Parser();
		case SequenceName5EditPart.VISUAL_ID:
			return getSequenceName_5012Parser();
		case ChoiceName5EditPart.VISUAL_ID:
			return getChoiceName_5013Parser();
		case AnyOrderName4EditPart.VISUAL_ID:
			return getAnyOrderName_5014Parser();
		case SplitName4EditPart.VISUAL_ID:
			return getSplitName_5015Parser();
		case SplitJoinName4EditPart.VISUAL_ID:
			return getSplitJoinName_5016Parser();
		case IfThenElseName4EditPart.VISUAL_ID:
			return getIfThenElseName_5066Parser();
		case RepeatWhileName2EditPart.VISUAL_ID:
			return getRepeatWhileName_5065Parser();
		case SequenceName6EditPart.VISUAL_ID:
			return getSequenceName_5017Parser();
		case ChoiceName6EditPart.VISUAL_ID:
			return getChoiceName_5018Parser();
		case AnyOrderName5EditPart.VISUAL_ID:
			return getAnyOrderName_5019Parser();
		case SplitName5EditPart.VISUAL_ID:
			return getSplitName_5020Parser();
		case SplitJoinName5EditPart.VISUAL_ID:
			return getSplitJoinName_5021Parser();
		case IfThenElseName5EditPart.VISUAL_ID:
			return getIfThenElseName_5064Parser();
		case PerformName2EditPart.VISUAL_ID:
			return getPerformName_5030Parser();
		case RemoteProcessNameEditPart.VISUAL_ID:
			return getRemoteProcessName_5137Parser();
		case InputName2EditPart.VISUAL_ID:
			return getInputName_5132Parser();
		case OutputName2EditPart.VISUAL_ID:
			return getOutputName_5133Parser();
		case ResultName2EditPart.VISUAL_ID:
			return getResultName_5134Parser();
		case ValueSourceNameEditPart.VISUAL_ID:
			return getValueSourceName_5111Parser();
		case ValueFormNameEditPart.VISUAL_ID:
			return getValueFormName_5112Parser();
		case ValueFunctionNameEditPart.VISUAL_ID:
			return getValueFunctionName_5113Parser();
		case ResultVarNameEditPart.VISUAL_ID:
			return getResultVarName_5114Parser();
		case ConditionName2EditPart.VISUAL_ID:
			return getConditionName_5115Parser();
		case ConditionName3EditPart.VISUAL_ID:
			return getConditionName_5116Parser();
		case ExprName2EditPart.VISUAL_ID:
			return getExprName_5117Parser();
		case ExprName3EditPart.VISUAL_ID:
			return getExprName_5118Parser();
		case ConditionName4EditPart.VISUAL_ID:
			return getConditionName_5135Parser();
		case ExprName4EditPart.VISUAL_ID:
			return getExprName_5136Parser();
		case TemplateProcessNameEditPart.VISUAL_ID:
			return getTemplateProcessName_5138Parser();
		case ProduceName2EditPart.VISUAL_ID:
			return getProduceName_5034Parser();
		case ValueSourceName2EditPart.VISUAL_ID:
			return getValueSourceName_5031Parser();
		case ValueFormName2EditPart.VISUAL_ID:
			return getValueFormName_5032Parser();
		case ValueFunctionName2EditPart.VISUAL_ID:
			return getValueFunctionName_5033Parser();
		case SetName2EditPart.VISUAL_ID:
			return getSetName_5038Parser();
		case ValueSourceName3EditPart.VISUAL_ID:
			return getValueSourceName_5035Parser();
		case ValueFormName3EditPart.VISUAL_ID:
			return getValueFormName_5036Parser();
		case ValueFunctionName3EditPart.VISUAL_ID:
			return getValueFunctionName_5037Parser();
		case SequenceName7EditPart.VISUAL_ID:
			return getSequenceName_5039Parser();
		case ChoiceName7EditPart.VISUAL_ID:
			return getChoiceName_5040Parser();
		case AnyOrderName6EditPart.VISUAL_ID:
			return getAnyOrderName_5041Parser();
		case SplitName6EditPart.VISUAL_ID:
			return getSplitName_5042Parser();
		case SplitJoinName6EditPart.VISUAL_ID:
			return getSplitJoinName_5043Parser();
		case IfThenElseName6EditPart.VISUAL_ID:
			return getIfThenElseName_5063Parser();
		case RepeatUntilName3EditPart.VISUAL_ID:
			return getRepeatUntilName_5056Parser();
		case RepeatUntilName4EditPart.VISUAL_ID:
			return getRepeatUntilName_5055Parser();
		case RepeatWhileName3EditPart.VISUAL_ID:
			return getRepeatWhileName_5054Parser();
		case RepeatUntilName5EditPart.VISUAL_ID:
			return getRepeatUntilName_5048Parser();
		case PerformName3EditPart.VISUAL_ID:
			return getPerformName_5044Parser();
		case ProduceName3EditPart.VISUAL_ID:
			return getProduceName_5045Parser();
		case SetName3EditPart.VISUAL_ID:
			return getSetName_5046Parser();
		case ConditionName5EditPart.VISUAL_ID:
			return getConditionName_5139Parser();
		case ExprName5EditPart.VISUAL_ID:
			return getExprName_5140Parser();
		case RepeatWhileName4EditPart.VISUAL_ID:
			return getRepeatWhileName_5053Parser();
		case PerformName4EditPart.VISUAL_ID:
			return getPerformName_5049Parser();
		case ProduceName4EditPart.VISUAL_ID:
			return getProduceName_5050Parser();
		case SetName4EditPart.VISUAL_ID:
			return getSetName_5051Parser();
		case ConditionName6EditPart.VISUAL_ID:
			return getConditionName_5141Parser();
		case ExprName6EditPart.VISUAL_ID:
			return getExprName_5142Parser();
		case RepeatWhileName5EditPart.VISUAL_ID:
			return getRepeatWhileName_5057Parser();
		case PerformName5EditPart.VISUAL_ID:
			return getPerformName_5058Parser();
		case ProduceName5EditPart.VISUAL_ID:
			return getProduceName_5059Parser();
		case SetName5EditPart.VISUAL_ID:
			return getSetName_5060Parser();
		case ConditionName7EditPart.VISUAL_ID:
			return getConditionName_5143Parser();
		case ExprName7EditPart.VISUAL_ID:
			return getExprName_5144Parser();
		case RepeatUntilName6EditPart.VISUAL_ID:
			return getRepeatUntilName_5070Parser();
		case RepeatWhileName6EditPart.VISUAL_ID:
			return getRepeatWhileName_5071Parser();
		case PerformName6EditPart.VISUAL_ID:
			return getPerformName_5072Parser();
		case ProduceName6EditPart.VISUAL_ID:
			return getProduceName_5073Parser();
		case SetName6EditPart.VISUAL_ID:
			return getSetName_5074Parser();
		case ControlConstructBagName5EditPart.VISUAL_ID:
			return getControlConstructBagName_5076Parser();
		case AnyOrderName7EditPart.VISUAL_ID:
			return getAnyOrderName_5085Parser();
		case SplitName7EditPart.VISUAL_ID:
			return getSplitName_5086Parser();
		case SplitJoinName7EditPart.VISUAL_ID:
			return getSplitJoinName_5087Parser();
		case IfThenElseName7EditPart.VISUAL_ID:
			return getIfThenElseName_5088Parser();
		case RepeatUntilName7EditPart.VISUAL_ID:
			return getRepeatUntilName_5089Parser();
		case RepeatWhileName7EditPart.VISUAL_ID:
			return getRepeatWhileName_5090Parser();
		case PerformName7EditPart.VISUAL_ID:
			return getPerformName_5091Parser();
		case ProduceName7EditPart.VISUAL_ID:
			return getProduceName_5092Parser();
		case SetName7EditPart.VISUAL_ID:
			return getSetName_5093Parser();
		case ControlConstructListName2EditPart.VISUAL_ID:
			return getControlConstructListName_5095Parser();
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
			return getParser(ControlVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ControlVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ControlElementTypes.getElement(hint) == null) {
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
