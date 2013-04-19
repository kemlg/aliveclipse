package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts.*;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.parsers.MessageFormatParser;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagVisualIDRegistry;

import org.eclipse.bpel.model.BPELPackage;
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
import org.eclipse.wst.wsdl.WSDLPackage;

/**
 * @generated
 */
public class BpeldiagParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser processName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getProcessName_5002Parser() {
		if (processName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getProcess_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Process {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Process {0}"); //$NON-NLS-1$
			parser.setEditPattern("Process {0}"); //$NON-NLS-1$
			processName_5002Parser = parser;
		}
		return processName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5048Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5048Parser() {
		if (assignName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5048Parser = parser;
		}
		return assignName_5048Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5071Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5071Parser() {
		if (compensateName_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5071Parser = parser;
		}
		return compensateName_5071Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5072Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5072Parser() {
		if (compensateScopeName_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5072Parser = parser;
		}
		return compensateScopeName_5072Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5073Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5073Parser() {
		if (emptyName_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5073Parser = parser;
		}
		return emptyName_5073Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5074Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5074Parser() {
		if (exitName_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5074Parser = parser;
		}
		return exitName_5074Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5075Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5075Parser() {
		if (extensionActivityName_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5075Parser = parser;
		}
		return extensionActivityName_5075Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5076Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5076Parser() {
		if (flowName_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5076Parser = parser;
		}
		return flowName_5076Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5077Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5077Parser() {
		if (forEachName_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5077Parser = parser;
		}
		return forEachName_5077Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5078Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5078Parser() {
		if (ifName_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5078Parser = parser;
		}
		return ifName_5078Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5079Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5079Parser() {
		if (invokeName_5079Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5079Parser = parser;
		}
		return invokeName_5079Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5080Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5080Parser() {
		if (opaqueActivityName_5080Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5080Parser = parser;
		}
		return opaqueActivityName_5080Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5082Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5082Parser() {
		if (pickName_5082Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5082Parser = parser;
		}
		return pickName_5082Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5083Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5083Parser() {
		if (receiveName_5083Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5083Parser = parser;
		}
		return receiveName_5083Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5084Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5084Parser() {
		if (repeatUntilName_5084Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5084Parser = parser;
		}
		return repeatUntilName_5084Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5085Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5085Parser() {
		if (replyName_5085Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5085Parser = parser;
		}
		return replyName_5085Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5086Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5086Parser() {
		if (rethrowName_5086Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5086Parser = parser;
		}
		return rethrowName_5086Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5087Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5087Parser() {
		if (scopeName_5087Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5087Parser = parser;
		}
		return scopeName_5087Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5088Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5088Parser() {
		if (sequenceName_5088Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5088Parser = parser;
		}
		return sequenceName_5088Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5089Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5089Parser() {
		if (throwName_5089Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5089Parser = parser;
		}
		return throwName_5089Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5090Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5090Parser() {
		if (validateName_5090Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5090Parser = parser;
		}
		return validateName_5090Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5091Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5091Parser() {
		if (waitName_5091Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5091Parser = parser;
		}
		return waitName_5091Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5092Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5092Parser() {
		if (whileName_5092Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5092Parser = parser;
		}
		return whileName_5092Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5081Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5081Parser() {
		if (partnerActivityName_5081Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5081Parser = parser;
		}
		return partnerActivityName_5081Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationName_5370Parser;

	/**
	 * @generated
	 */
	private IParser getOperationName_5370Parser() {
		if (operationName_5370Parser == null) {
			EAttribute[] features = new EAttribute[] { WSDLPackage.eINSTANCE
					.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Operation {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Operation {0}"); //$NON-NLS-1$
			parser.setEditPattern("Operation {0}"); //$NON-NLS-1$
			operationName_5370Parser = parser;
		}
		return operationName_5370Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5001Parser() {
		if (assignName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5001Parser = parser;
		}
		return assignName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5005Parser() {
		if (compensateName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5005Parser = parser;
		}
		return compensateName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5006Parser() {
		if (compensateScopeName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5006Parser = parser;
		}
		return compensateScopeName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5007Parser() {
		if (emptyName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5007Parser = parser;
		}
		return emptyName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5008Parser() {
		if (exitName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5008Parser = parser;
		}
		return exitName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5009Parser() {
		if (extensionActivityName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5009Parser = parser;
		}
		return extensionActivityName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5010Parser() {
		if (flowName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5010Parser = parser;
		}
		return flowName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5115Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5115Parser() {
		if (assignName_5115Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5115Parser = parser;
		}
		return assignName_5115Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5116Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5116Parser() {
		if (compensateName_5116Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5116Parser = parser;
		}
		return compensateName_5116Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5117Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5117Parser() {
		if (compensateScopeName_5117Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5117Parser = parser;
		}
		return compensateScopeName_5117Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5118Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5118Parser() {
		if (emptyName_5118Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5118Parser = parser;
		}
		return emptyName_5118Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5119Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5119Parser() {
		if (exitName_5119Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5119Parser = parser;
		}
		return exitName_5119Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5120Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5120Parser() {
		if (extensionActivityName_5120Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5120Parser = parser;
		}
		return extensionActivityName_5120Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5136Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5136Parser() {
		if (flowName_5136Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5136Parser = parser;
		}
		return flowName_5136Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5121Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5121Parser() {
		if (forEachName_5121Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5121Parser = parser;
		}
		return forEachName_5121Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5137Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5137Parser() {
		if (assignName_5137Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5137Parser = parser;
		}
		return assignName_5137Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5138Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5138Parser() {
		if (compensateName_5138Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5138Parser = parser;
		}
		return compensateName_5138Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5139Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5139Parser() {
		if (compensateScopeName_5139Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5139Parser = parser;
		}
		return compensateScopeName_5139Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5140Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5140Parser() {
		if (emptyName_5140Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5140Parser = parser;
		}
		return emptyName_5140Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5141Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5141Parser() {
		if (exitName_5141Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5141Parser = parser;
		}
		return exitName_5141Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5142Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5142Parser() {
		if (extensionActivityName_5142Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5142Parser = parser;
		}
		return extensionActivityName_5142Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5157Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5157Parser() {
		if (forEachName_5157Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5157Parser = parser;
		}
		return forEachName_5157Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5143Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5143Parser() {
		if (ifName_5143Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5143Parser = parser;
		}
		return ifName_5143Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5158Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5158Parser() {
		if (assignName_5158Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5158Parser = parser;
		}
		return assignName_5158Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5159Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5159Parser() {
		if (compensateName_5159Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5159Parser = parser;
		}
		return compensateName_5159Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5160Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5160Parser() {
		if (compensateScopeName_5160Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5160Parser = parser;
		}
		return compensateScopeName_5160Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5161Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5161Parser() {
		if (emptyName_5161Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5161Parser = parser;
		}
		return emptyName_5161Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5162Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5162Parser() {
		if (exitName_5162Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5162Parser = parser;
		}
		return exitName_5162Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5163Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5163Parser() {
		if (extensionActivityName_5163Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5163Parser = parser;
		}
		return extensionActivityName_5163Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5235Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5235Parser() {
		if (ifName_5235Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5235Parser = parser;
		}
		return ifName_5235Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5221Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5221Parser() {
		if (forEachName_5221Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5221Parser = parser;
		}
		return forEachName_5221Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5144Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5144Parser() {
		if (invokeName_5144Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5144Parser = parser;
		}
		return invokeName_5144Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5145Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5145Parser() {
		if (opaqueActivityName_5145Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5145Parser = parser;
		}
		return opaqueActivityName_5145Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5146Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5146Parser() {
		if (partnerActivityName_5146Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5146Parser = parser;
		}
		return partnerActivityName_5146Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5147Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5147Parser() {
		if (pickName_5147Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5147Parser = parser;
		}
		return pickName_5147Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5289Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5289Parser() {
		if (assignName_5289Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5289Parser = parser;
		}
		return assignName_5289Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5290Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5290Parser() {
		if (compensateName_5290Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5290Parser = parser;
		}
		return compensateName_5290Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5291Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5291Parser() {
		if (compensateScopeName_5291Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5291Parser = parser;
		}
		return compensateScopeName_5291Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5292Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5292Parser() {
		if (emptyName_5292Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5292Parser = parser;
		}
		return emptyName_5292Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5293Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5293Parser() {
		if (exitName_5293Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5293Parser = parser;
		}
		return exitName_5293Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5294Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5294Parser() {
		if (extensionActivityName_5294Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5294Parser = parser;
		}
		return extensionActivityName_5294Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5363Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5363Parser() {
		if (flowName_5363Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5363Parser = parser;
		}
		return flowName_5363Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5122Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5122Parser() {
		if (ifName_5122Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5122Parser = parser;
		}
		return ifName_5122Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5222Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5222Parser() {
		if (invokeName_5222Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5222Parser = parser;
		}
		return invokeName_5222Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5223Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5223Parser() {
		if (opaqueActivityName_5223Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5223Parser = parser;
		}
		return opaqueActivityName_5223Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5224Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5224Parser() {
		if (partnerActivityName_5224Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5224Parser = parser;
		}
		return partnerActivityName_5224Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5225Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5225Parser() {
		if (pickName_5225Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5225Parser = parser;
		}
		return pickName_5225Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5295Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5295Parser() {
		if (assignName_5295Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5295Parser = parser;
		}
		return assignName_5295Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5296Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5296Parser() {
		if (compensateName_5296Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5296Parser = parser;
		}
		return compensateName_5296Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5297Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5297Parser() {
		if (compensateScopeName_5297Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5297Parser = parser;
		}
		return compensateScopeName_5297Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5298Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5298Parser() {
		if (emptyName_5298Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5298Parser = parser;
		}
		return emptyName_5298Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5299Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5299Parser() {
		if (exitName_5299Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5299Parser = parser;
		}
		return exitName_5299Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5300Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5300Parser() {
		if (extensionActivityName_5300Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5300Parser = parser;
		}
		return extensionActivityName_5300Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5345Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5345Parser() {
		if (flowName_5345Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5345Parser = parser;
		}
		return flowName_5345Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5123Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5123Parser() {
		if (invokeName_5123Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5123Parser = parser;
		}
		return invokeName_5123Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5124Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5124Parser() {
		if (opaqueActivityName_5124Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5124Parser = parser;
		}
		return opaqueActivityName_5124Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5125Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5125Parser() {
		if (partnerActivityName_5125Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5125Parser = parser;
		}
		return partnerActivityName_5125Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5126Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5126Parser() {
		if (pickName_5126Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5126Parser = parser;
		}
		return pickName_5126Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5127Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5127Parser() {
		if (receiveName_5127Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5127Parser = parser;
		}
		return receiveName_5127Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5128Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5128Parser() {
		if (repeatUntilName_5128Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5128Parser = parser;
		}
		return repeatUntilName_5128Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5164Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5164Parser() {
		if (assignName_5164Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5164Parser = parser;
		}
		return assignName_5164Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5165Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5165Parser() {
		if (compensateName_5165Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5165Parser = parser;
		}
		return compensateName_5165Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5166Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5166Parser() {
		if (compensateScopeName_5166Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5166Parser = parser;
		}
		return compensateScopeName_5166Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5167Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5167Parser() {
		if (emptyName_5167Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5167Parser = parser;
		}
		return emptyName_5167Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5168Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5168Parser() {
		if (exitName_5168Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5168Parser = parser;
		}
		return exitName_5168Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5169Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5169Parser() {
		if (extensionActivityName_5169Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5169Parser = parser;
		}
		return extensionActivityName_5169Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5220Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5220Parser() {
		if (repeatUntilName_5220Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5220Parser = parser;
		}
		return repeatUntilName_5220Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5207Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5207Parser() {
		if (forEachName_5207Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5207Parser = parser;
		}
		return forEachName_5207Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5148Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5148Parser() {
		if (receiveName_5148Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5148Parser = parser;
		}
		return receiveName_5148Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5149Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5149Parser() {
		if (repeatUntilName_5149Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5149Parser = parser;
		}
		return repeatUntilName_5149Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5208Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5208Parser() {
		if (invokeName_5208Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5208Parser = parser;
		}
		return invokeName_5208Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5209Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5209Parser() {
		if (opaqueActivityName_5209Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5209Parser = parser;
		}
		return opaqueActivityName_5209Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5210Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5210Parser() {
		if (partnerActivityName_5210Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5210Parser = parser;
		}
		return partnerActivityName_5210Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5211Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5211Parser() {
		if (pickName_5211Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5211Parser = parser;
		}
		return pickName_5211Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5212Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5212Parser() {
		if (receiveName_5212Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5212Parser = parser;
		}
		return receiveName_5212Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5213Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5213Parser() {
		if (replyName_5213Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5213Parser = parser;
		}
		return replyName_5213Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5214Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5214Parser() {
		if (rethrowName_5214Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5214Parser = parser;
		}
		return rethrowName_5214Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5215Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5215Parser() {
		if (scopeName_5215Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5215Parser = parser;
		}
		return scopeName_5215Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5170Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5170Parser() {
		if (assignName_5170Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5170Parser = parser;
		}
		return assignName_5170Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5171Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5171Parser() {
		if (compensateName_5171Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5171Parser = parser;
		}
		return compensateName_5171Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5172Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5172Parser() {
		if (compensateScopeName_5172Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5172Parser = parser;
		}
		return compensateScopeName_5172Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5173Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5173Parser() {
		if (emptyName_5173Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5173Parser = parser;
		}
		return emptyName_5173Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5174Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5174Parser() {
		if (exitName_5174Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5174Parser = parser;
		}
		return exitName_5174Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5175Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5175Parser() {
		if (extensionActivityName_5175Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5175Parser = parser;
		}
		return extensionActivityName_5175Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5206Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5206Parser() {
		if (scopeName_5206Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5206Parser = parser;
		}
		return scopeName_5206Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5194Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5194Parser() {
		if (forEachName_5194Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5194Parser = parser;
		}
		return forEachName_5194Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5150Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5150Parser() {
		if (replyName_5150Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5150Parser = parser;
		}
		return replyName_5150Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5151Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5151Parser() {
		if (rethrowName_5151Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5151Parser = parser;
		}
		return rethrowName_5151Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5152Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5152Parser() {
		if (scopeName_5152Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5152Parser = parser;
		}
		return scopeName_5152Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5195Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5195Parser() {
		if (invokeName_5195Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5195Parser = parser;
		}
		return invokeName_5195Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5196Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5196Parser() {
		if (opaqueActivityName_5196Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5196Parser = parser;
		}
		return opaqueActivityName_5196Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5197Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5197Parser() {
		if (partnerActivityName_5197Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5197Parser = parser;
		}
		return partnerActivityName_5197Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5198Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5198Parser() {
		if (pickName_5198Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5198Parser = parser;
		}
		return pickName_5198Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5199Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5199Parser() {
		if (receiveName_5199Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5199Parser = parser;
		}
		return receiveName_5199Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5200Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5200Parser() {
		if (replyName_5200Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5200Parser = parser;
		}
		return replyName_5200Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5201Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5201Parser() {
		if (rethrowName_5201Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5201Parser = parser;
		}
		return rethrowName_5201Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5202Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5202Parser() {
		if (throwName_5202Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5202Parser = parser;
		}
		return throwName_5202Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5203Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5203Parser() {
		if (validateName_5203Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5203Parser = parser;
		}
		return validateName_5203Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5204Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5204Parser() {
		if (waitName_5204Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5204Parser = parser;
		}
		return waitName_5204Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5205Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5205Parser() {
		if (whileName_5205Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5205Parser = parser;
		}
		return whileName_5205Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5176Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5176Parser() {
		if (assignName_5176Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5176Parser = parser;
		}
		return assignName_5176Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5177Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5177Parser() {
		if (compensateName_5177Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5177Parser = parser;
		}
		return compensateName_5177Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5178Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5178Parser() {
		if (compensateScopeName_5178Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5178Parser = parser;
		}
		return compensateScopeName_5178Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5179Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5179Parser() {
		if (emptyName_5179Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5179Parser = parser;
		}
		return emptyName_5179Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5180Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5180Parser() {
		if (exitName_5180Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5180Parser = parser;
		}
		return exitName_5180Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5181Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5181Parser() {
		if (extensionActivityName_5181Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5181Parser = parser;
		}
		return extensionActivityName_5181Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5240Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5240Parser() {
		if (flowName_5240Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5240Parser = parser;
		}
		return flowName_5240Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5129Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5129Parser() {
		if (replyName_5129Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5129Parser = parser;
		}
		return replyName_5129Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5130Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5130Parser() {
		if (rethrowName_5130Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5130Parser = parser;
		}
		return rethrowName_5130Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5131Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5131Parser() {
		if (scopeName_5131Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5131Parser = parser;
		}
		return scopeName_5131Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5303Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5303Parser() {
		if (forEachName_5303Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5303Parser = parser;
		}
		return forEachName_5303Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5153Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5153Parser() {
		if (throwName_5153Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5153Parser = parser;
		}
		return throwName_5153Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5154Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5154Parser() {
		if (validateName_5154Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5154Parser = parser;
		}
		return validateName_5154Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5155Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5155Parser() {
		if (waitName_5155Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5155Parser = parser;
		}
		return waitName_5155Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5156Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5156Parser() {
		if (whileName_5156Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5156Parser = parser;
		}
		return whileName_5156Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5182Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5182Parser() {
		if (forEachName_5182Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5182Parser = parser;
		}
		return forEachName_5182Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5239Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5239Parser() {
		if (ifName_5239Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5239Parser = parser;
		}
		return ifName_5239Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5226Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5226Parser() {
		if (receiveName_5226Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5226Parser = parser;
		}
		return receiveName_5226Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5227Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5227Parser() {
		if (repeatUntilName_5227Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5227Parser = parser;
		}
		return repeatUntilName_5227Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5216Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5216Parser() {
		if (throwName_5216Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5216Parser = parser;
		}
		return throwName_5216Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5217Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5217Parser() {
		if (validateName_5217Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5217Parser = parser;
		}
		return validateName_5217Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5218Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5218Parser() {
		if (waitName_5218Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5218Parser = parser;
		}
		return waitName_5218Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5219Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5219Parser() {
		if (whileName_5219Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5219Parser = parser;
		}
		return whileName_5219Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5183Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5183Parser() {
		if (invokeName_5183Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5183Parser = parser;
		}
		return invokeName_5183Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5184Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5184Parser() {
		if (opaqueActivityName_5184Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5184Parser = parser;
		}
		return opaqueActivityName_5184Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5185Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5185Parser() {
		if (partnerActivityName_5185Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5185Parser = parser;
		}
		return partnerActivityName_5185Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5186Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5186Parser() {
		if (pickName_5186Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5186Parser = parser;
		}
		return pickName_5186Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5187Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5187Parser() {
		if (receiveName_5187Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5187Parser = parser;
		}
		return receiveName_5187Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5238Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5238Parser() {
		if (repeatUntilName_5238Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5238Parser = parser;
		}
		return repeatUntilName_5238Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5188Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5188Parser() {
		if (replyName_5188Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5188Parser = parser;
		}
		return replyName_5188Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5189Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5189Parser() {
		if (rethrowName_5189Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5189Parser = parser;
		}
		return rethrowName_5189Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5236Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5236Parser() {
		if (scopeName_5236Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5236Parser = parser;
		}
		return scopeName_5236Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5237Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5237Parser() {
		if (sequenceName_5237Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5237Parser = parser;
		}
		return sequenceName_5237Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5093Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5093Parser() {
		if (assignName_5093Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5093Parser = parser;
		}
		return assignName_5093Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5094Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5094Parser() {
		if (compensateName_5094Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5094Parser = parser;
		}
		return compensateName_5094Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5095Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5095Parser() {
		if (compensateScopeName_5095Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5095Parser = parser;
		}
		return compensateScopeName_5095Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5096Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5096Parser() {
		if (emptyName_5096Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5096Parser = parser;
		}
		return emptyName_5096Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5097Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5097Parser() {
		if (exitName_5097Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5097Parser = parser;
		}
		return exitName_5097Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5098Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5098Parser() {
		if (extensionActivityName_5098Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5098Parser = parser;
		}
		return extensionActivityName_5098Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5099Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5099Parser() {
		if (flowName_5099Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5099Parser = parser;
		}
		return flowName_5099Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5132Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5132Parser() {
		if (throwName_5132Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5132Parser = parser;
		}
		return throwName_5132Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5133Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5133Parser() {
		if (validateName_5133Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5133Parser = parser;
		}
		return validateName_5133Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5134Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5134Parser() {
		if (waitName_5134Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5134Parser = parser;
		}
		return waitName_5134Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5135Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5135Parser() {
		if (whileName_5135Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5135Parser = parser;
		}
		return whileName_5135Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5190Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5190Parser() {
		if (throwName_5190Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5190Parser = parser;
		}
		return throwName_5190Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5191Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5191Parser() {
		if (validateName_5191Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5191Parser = parser;
		}
		return validateName_5191Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5192Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5192Parser() {
		if (waitName_5192Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5192Parser = parser;
		}
		return waitName_5192Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5193Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5193Parser() {
		if (whileName_5193Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5193Parser = parser;
		}
		return whileName_5193Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5100Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5100Parser() {
		if (forEachName_5100Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5100Parser = parser;
		}
		return forEachName_5100Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5056Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5056Parser() {
		if (ifName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5056Parser = parser;
		}
		return ifName_5056Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5228Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5228Parser() {
		if (replyName_5228Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5228Parser = parser;
		}
		return replyName_5228Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5229Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5229Parser() {
		if (rethrowName_5229Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5229Parser = parser;
		}
		return rethrowName_5229Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5230Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5230Parser() {
		if (scopeName_5230Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5230Parser = parser;
		}
		return scopeName_5230Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5231Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5231Parser() {
		if (throwName_5231Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5231Parser = parser;
		}
		return throwName_5231Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5232Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5232Parser() {
		if (validateName_5232Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5232Parser = parser;
		}
		return validateName_5232Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5233Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5233Parser() {
		if (waitName_5233Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5233Parser = parser;
		}
		return waitName_5233Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5234Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5234Parser() {
		if (whileName_5234Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5234Parser = parser;
		}
		return whileName_5234Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5241Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5241Parser() {
		if (assignName_5241Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5241Parser = parser;
		}
		return assignName_5241Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5242Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5242Parser() {
		if (compensateName_5242Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5242Parser = parser;
		}
		return compensateName_5242Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5243Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5243Parser() {
		if (compensateScopeName_5243Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5243Parser = parser;
		}
		return compensateScopeName_5243Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5244Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5244Parser() {
		if (emptyName_5244Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5244Parser = parser;
		}
		return emptyName_5244Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5245Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5245Parser() {
		if (exitName_5245Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5245Parser = parser;
		}
		return exitName_5245Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5246Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5246Parser() {
		if (extensionActivityName_5246Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5246Parser = parser;
		}
		return extensionActivityName_5246Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5247Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5247Parser() {
		if (flowName_5247Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5247Parser = parser;
		}
		return flowName_5247Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5248Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5248Parser() {
		if (forEachName_5248Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5248Parser = parser;
		}
		return forEachName_5248Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5249Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5249Parser() {
		if (ifName_5249Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5249Parser = parser;
		}
		return ifName_5249Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5265Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5265Parser() {
		if (assignName_5265Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5265Parser = parser;
		}
		return assignName_5265Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5266Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5266Parser() {
		if (compensateName_5266Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5266Parser = parser;
		}
		return compensateName_5266Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5267Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5267Parser() {
		if (compensateScopeName_5267Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5267Parser = parser;
		}
		return compensateScopeName_5267Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5268Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5268Parser() {
		if (emptyName_5268Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5268Parser = parser;
		}
		return emptyName_5268Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5269Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5269Parser() {
		if (exitName_5269Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5269Parser = parser;
		}
		return exitName_5269Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5270Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5270Parser() {
		if (extensionActivityName_5270Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5270Parser = parser;
		}
		return extensionActivityName_5270Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5271Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5271Parser() {
		if (flowName_5271Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5271Parser = parser;
		}
		return flowName_5271Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5272Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5272Parser() {
		if (forEachName_5272Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5272Parser = parser;
		}
		return forEachName_5272Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5273Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5273Parser() {
		if (ifName_5273Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5273Parser = parser;
		}
		return ifName_5273Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5274Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5274Parser() {
		if (invokeName_5274Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5274Parser = parser;
		}
		return invokeName_5274Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5275Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5275Parser() {
		if (opaqueActivityName_5275Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5275Parser = parser;
		}
		return opaqueActivityName_5275Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5276Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5276Parser() {
		if (partnerActivityName_5276Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5276Parser = parser;
		}
		return partnerActivityName_5276Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5277Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5277Parser() {
		if (pickName_5277Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5277Parser = parser;
		}
		return pickName_5277Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5278Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5278Parser() {
		if (receiveName_5278Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5278Parser = parser;
		}
		return receiveName_5278Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5279Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5279Parser() {
		if (repeatUntilName_5279Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5279Parser = parser;
		}
		return repeatUntilName_5279Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5280Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5280Parser() {
		if (replyName_5280Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5280Parser = parser;
		}
		return replyName_5280Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5281Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5281Parser() {
		if (rethrowName_5281Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5281Parser = parser;
		}
		return rethrowName_5281Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5282Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5282Parser() {
		if (scopeName_5282Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5282Parser = parser;
		}
		return scopeName_5282Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5283Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5283Parser() {
		if (sequenceName_5283Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5283Parser = parser;
		}
		return sequenceName_5283Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5101Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5101Parser() {
		if (invokeName_5101Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5101Parser = parser;
		}
		return invokeName_5101Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5102Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5102Parser() {
		if (opaqueActivityName_5102Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5102Parser = parser;
		}
		return opaqueActivityName_5102Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5103Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5103Parser() {
		if (partnerActivityName_5103Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5103Parser = parser;
		}
		return partnerActivityName_5103Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5104Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5104Parser() {
		if (pickName_5104Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5104Parser = parser;
		}
		return pickName_5104Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5105Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5105Parser() {
		if (receiveName_5105Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5105Parser = parser;
		}
		return receiveName_5105Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5106Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5106Parser() {
		if (repeatUntilName_5106Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5106Parser = parser;
		}
		return repeatUntilName_5106Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5107Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5107Parser() {
		if (replyName_5107Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5107Parser = parser;
		}
		return replyName_5107Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5108Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5108Parser() {
		if (rethrowName_5108Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5108Parser = parser;
		}
		return rethrowName_5108Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5109Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5109Parser() {
		if (scopeName_5109Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5109Parser = parser;
		}
		return scopeName_5109Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5114Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5114Parser() {
		if (sequenceName_5114Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5114Parser = parser;
		}
		return sequenceName_5114Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5110Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5110Parser() {
		if (throwName_5110Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5110Parser = parser;
		}
		return throwName_5110Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5111Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5111Parser() {
		if (validateName_5111Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5111Parser = parser;
		}
		return validateName_5111Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5112Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5112Parser() {
		if (waitName_5112Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5112Parser = parser;
		}
		return waitName_5112Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5113Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5113Parser() {
		if (whileName_5113Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5113Parser = parser;
		}
		return whileName_5113Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5284Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5284Parser() {
		if (throwName_5284Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5284Parser = parser;
		}
		return throwName_5284Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5285Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5285Parser() {
		if (validateName_5285Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5285Parser = parser;
		}
		return validateName_5285Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5286Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5286Parser() {
		if (waitName_5286Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5286Parser = parser;
		}
		return waitName_5286Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5287Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5287Parser() {
		if (whileName_5287Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5287Parser = parser;
		}
		return whileName_5287Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5250Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5250Parser() {
		if (invokeName_5250Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5250Parser = parser;
		}
		return invokeName_5250Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5251Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5251Parser() {
		if (opaqueActivityName_5251Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5251Parser = parser;
		}
		return opaqueActivityName_5251Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5252Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5252Parser() {
		if (partnerActivityName_5252Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5252Parser = parser;
		}
		return partnerActivityName_5252Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5253Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5253Parser() {
		if (pickName_5253Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5253Parser = parser;
		}
		return pickName_5253Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5254Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5254Parser() {
		if (receiveName_5254Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5254Parser = parser;
		}
		return receiveName_5254Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5255Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5255Parser() {
		if (repeatUntilName_5255Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5255Parser = parser;
		}
		return repeatUntilName_5255Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5256Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5256Parser() {
		if (replyName_5256Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5256Parser = parser;
		}
		return replyName_5256Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5257Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5257Parser() {
		if (rethrowName_5257Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5257Parser = parser;
		}
		return rethrowName_5257Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5258Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5258Parser() {
		if (scopeName_5258Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5258Parser = parser;
		}
		return scopeName_5258Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5259Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5259Parser() {
		if (sequenceName_5259Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5259Parser = parser;
		}
		return sequenceName_5259Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5260Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5260Parser() {
		if (throwName_5260Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5260Parser = parser;
		}
		return throwName_5260Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5261Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5261Parser() {
		if (validateName_5261Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5261Parser = parser;
		}
		return validateName_5261Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5262Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5262Parser() {
		if (waitName_5262Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5262Parser = parser;
		}
		return waitName_5262Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5263Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5263Parser() {
		if (whileName_5263Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5263Parser = parser;
		}
		return whileName_5263Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5304Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5304Parser() {
		if (ifName_5304Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5304Parser = parser;
		}
		return ifName_5304Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5305Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5305Parser() {
		if (invokeName_5305Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5305Parser = parser;
		}
		return invokeName_5305Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5306Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5306Parser() {
		if (opaqueActivityName_5306Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5306Parser = parser;
		}
		return opaqueActivityName_5306Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5307Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5307Parser() {
		if (partnerActivityName_5307Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5307Parser = parser;
		}
		return partnerActivityName_5307Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5308Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5308Parser() {
		if (pickName_5308Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5308Parser = parser;
		}
		return pickName_5308Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5309Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5309Parser() {
		if (receiveName_5309Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5309Parser = parser;
		}
		return receiveName_5309Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5310Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5310Parser() {
		if (repeatUntilName_5310Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5310Parser = parser;
		}
		return repeatUntilName_5310Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5311Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5311Parser() {
		if (replyName_5311Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5311Parser = parser;
		}
		return replyName_5311Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5312Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5312Parser() {
		if (rethrowName_5312Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5312Parser = parser;
		}
		return rethrowName_5312Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5313Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5313Parser() {
		if (scopeName_5313Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5313Parser = parser;
		}
		return scopeName_5313Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5314Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5314Parser() {
		if (sequenceName_5314Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5314Parser = parser;
		}
		return sequenceName_5314Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5315Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5315Parser() {
		if (throwName_5315Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5315Parser = parser;
		}
		return throwName_5315Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5316Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5316Parser() {
		if (validateName_5316Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5316Parser = parser;
		}
		return validateName_5316Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5317Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5317Parser() {
		if (waitName_5317Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5317Parser = parser;
		}
		return waitName_5317Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5318Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5318Parser() {
		if (whileName_5318Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5318Parser = parser;
		}
		return whileName_5318Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5320Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5320Parser() {
		if (assignName_5320Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5320Parser = parser;
		}
		return assignName_5320Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5321Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5321Parser() {
		if (compensateName_5321Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5321Parser = parser;
		}
		return compensateName_5321Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5322Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5322Parser() {
		if (compensateScopeName_5322Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5322Parser = parser;
		}
		return compensateScopeName_5322Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5323Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5323Parser() {
		if (emptyName_5323Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5323Parser = parser;
		}
		return emptyName_5323Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5324Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5324Parser() {
		if (exitName_5324Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5324Parser = parser;
		}
		return exitName_5324Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5325Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5325Parser() {
		if (extensionActivityName_5325Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5325Parser = parser;
		}
		return extensionActivityName_5325Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5326Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5326Parser() {
		if (flowName_5326Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5326Parser = parser;
		}
		return flowName_5326Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5327Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5327Parser() {
		if (forEachName_5327Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5327Parser = parser;
		}
		return forEachName_5327Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5328Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5328Parser() {
		if (ifName_5328Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5328Parser = parser;
		}
		return ifName_5328Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5329Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5329Parser() {
		if (invokeName_5329Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5329Parser = parser;
		}
		return invokeName_5329Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5330Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5330Parser() {
		if (opaqueActivityName_5330Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5330Parser = parser;
		}
		return opaqueActivityName_5330Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5331Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5331Parser() {
		if (partnerActivityName_5331Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5331Parser = parser;
		}
		return partnerActivityName_5331Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5332Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5332Parser() {
		if (pickName_5332Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5332Parser = parser;
		}
		return pickName_5332Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5333Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5333Parser() {
		if (receiveName_5333Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5333Parser = parser;
		}
		return receiveName_5333Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5334Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5334Parser() {
		if (repeatUntilName_5334Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5334Parser = parser;
		}
		return repeatUntilName_5334Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5335Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5335Parser() {
		if (replyName_5335Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5335Parser = parser;
		}
		return replyName_5335Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5336Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5336Parser() {
		if (rethrowName_5336Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5336Parser = parser;
		}
		return rethrowName_5336Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5337Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5337Parser() {
		if (scopeName_5337Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5337Parser = parser;
		}
		return scopeName_5337Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5338Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5338Parser() {
		if (sequenceName_5338Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5338Parser = parser;
		}
		return sequenceName_5338Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5339Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5339Parser() {
		if (throwName_5339Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5339Parser = parser;
		}
		return throwName_5339Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5340Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5340Parser() {
		if (validateName_5340Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5340Parser = parser;
		}
		return validateName_5340Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5341Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5341Parser() {
		if (waitName_5341Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5341Parser = parser;
		}
		return waitName_5341Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5342Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5342Parser() {
		if (whileName_5342Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5342Parser = parser;
		}
		return whileName_5342Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5346Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5346Parser() {
		if (forEachName_5346Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5346Parser = parser;
		}
		return forEachName_5346Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5347Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5347Parser() {
		if (ifName_5347Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5347Parser = parser;
		}
		return ifName_5347Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5348Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5348Parser() {
		if (invokeName_5348Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5348Parser = parser;
		}
		return invokeName_5348Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5349Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5349Parser() {
		if (opaqueActivityName_5349Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5349Parser = parser;
		}
		return opaqueActivityName_5349Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5350Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5350Parser() {
		if (partnerActivityName_5350Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5350Parser = parser;
		}
		return partnerActivityName_5350Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5351Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5351Parser() {
		if (pickName_5351Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5351Parser = parser;
		}
		return pickName_5351Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5352Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5352Parser() {
		if (receiveName_5352Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5352Parser = parser;
		}
		return receiveName_5352Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5353Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5353Parser() {
		if (repeatUntilName_5353Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5353Parser = parser;
		}
		return repeatUntilName_5353Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5354Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5354Parser() {
		if (replyName_5354Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5354Parser = parser;
		}
		return replyName_5354Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5355Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5355Parser() {
		if (rethrowName_5355Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5355Parser = parser;
		}
		return rethrowName_5355Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5356Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5356Parser() {
		if (scopeName_5356Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5356Parser = parser;
		}
		return scopeName_5356Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5357Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5357Parser() {
		if (sequenceName_5357Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5357Parser = parser;
		}
		return sequenceName_5357Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5358Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5358Parser() {
		if (throwName_5358Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5358Parser = parser;
		}
		return throwName_5358Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5359Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5359Parser() {
		if (validateName_5359Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5359Parser = parser;
		}
		return validateName_5359Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5360Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5360Parser() {
		if (waitName_5360Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5360Parser = parser;
		}
		return waitName_5360Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5361Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5361Parser() {
		if (whileName_5361Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5361Parser = parser;
		}
		return whileName_5361Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5011Parser() {
		if (forEachName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5011Parser = parser;
		}
		return forEachName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5012Parser() {
		if (ifName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5012Parser = parser;
		}
		return ifName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5013Parser() {
		if (invokeName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5013Parser = parser;
		}
		return invokeName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5014Parser() {
		if (opaqueActivityName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5014Parser = parser;
		}
		return opaqueActivityName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5015Parser() {
		if (partnerActivityName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5015Parser = parser;
		}
		return partnerActivityName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5016Parser() {
		if (pickName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5016Parser = parser;
		}
		return pickName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5017Parser() {
		if (receiveName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5017Parser = parser;
		}
		return receiveName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5018Parser() {
		if (repeatUntilName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5018Parser = parser;
		}
		return repeatUntilName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5019Parser() {
		if (replyName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5019Parser = parser;
		}
		return replyName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5020Parser() {
		if (rethrowName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5020Parser = parser;
		}
		return rethrowName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5021Parser() {
		if (scopeName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5021Parser = parser;
		}
		return scopeName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5003Parser() {
		if (sequenceName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5003Parser = parser;
		}
		return sequenceName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5022Parser() {
		if (throwName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5022Parser = parser;
		}
		return throwName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5023Parser() {
		if (validateName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5023Parser = parser;
		}
		return validateName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5024Parser() {
		if (waitName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5024Parser = parser;
		}
		return waitName_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5025Parser() {
		if (whileName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5025Parser = parser;
		}
		return whileName_5025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ProcessNameEditPart.VISUAL_ID:
			return getProcessName_5002Parser();
		case AssignNameEditPart.VISUAL_ID:
			return getAssignName_5048Parser();
		case CompensateNameEditPart.VISUAL_ID:
			return getCompensateName_5071Parser();
		case CompensateScopeNameEditPart.VISUAL_ID:
			return getCompensateScopeName_5072Parser();
		case EmptyNameEditPart.VISUAL_ID:
			return getEmptyName_5073Parser();
		case ExitNameEditPart.VISUAL_ID:
			return getExitName_5074Parser();
		case ExtensionActivityNameEditPart.VISUAL_ID:
			return getExtensionActivityName_5075Parser();
		case FlowNameEditPart.VISUAL_ID:
			return getFlowName_5076Parser();
		case ForEachNameEditPart.VISUAL_ID:
			return getForEachName_5077Parser();
		case IfNameEditPart.VISUAL_ID:
			return getIfName_5078Parser();
		case InvokeNameEditPart.VISUAL_ID:
			return getInvokeName_5079Parser();
		case OpaqueActivityNameEditPart.VISUAL_ID:
			return getOpaqueActivityName_5080Parser();
		case PickNameEditPart.VISUAL_ID:
			return getPickName_5082Parser();
		case ReceiveNameEditPart.VISUAL_ID:
			return getReceiveName_5083Parser();
		case RepeatUntilNameEditPart.VISUAL_ID:
			return getRepeatUntilName_5084Parser();
		case ReplyNameEditPart.VISUAL_ID:
			return getReplyName_5085Parser();
		case RethrowNameEditPart.VISUAL_ID:
			return getRethrowName_5086Parser();
		case ScopeNameEditPart.VISUAL_ID:
			return getScopeName_5087Parser();
		case SequenceNameEditPart.VISUAL_ID:
			return getSequenceName_5088Parser();
		case ThrowNameEditPart.VISUAL_ID:
			return getThrowName_5089Parser();
		case ValidateNameEditPart.VISUAL_ID:
			return getValidateName_5090Parser();
		case WaitNameEditPart.VISUAL_ID:
			return getWaitName_5091Parser();
		case WhileNameEditPart.VISUAL_ID:
			return getWhileName_5092Parser();
		case PartnerActivityNameEditPart.VISUAL_ID:
			return getPartnerActivityName_5081Parser();
		case OperationNameEditPart.VISUAL_ID:
			return getOperationName_5370Parser();
		case AssignName2EditPart.VISUAL_ID:
			return getAssignName_5001Parser();
		case CompensateName2EditPart.VISUAL_ID:
			return getCompensateName_5005Parser();
		case CompensateScopeName2EditPart.VISUAL_ID:
			return getCompensateScopeName_5006Parser();
		case EmptyName2EditPart.VISUAL_ID:
			return getEmptyName_5007Parser();
		case ExitName2EditPart.VISUAL_ID:
			return getExitName_5008Parser();
		case ExtensionActivityName2EditPart.VISUAL_ID:
			return getExtensionActivityName_5009Parser();
		case FlowName2EditPart.VISUAL_ID:
			return getFlowName_5010Parser();
		case AssignName3EditPart.VISUAL_ID:
			return getAssignName_5115Parser();
		case CompensateName3EditPart.VISUAL_ID:
			return getCompensateName_5116Parser();
		case CompensateScopeName3EditPart.VISUAL_ID:
			return getCompensateScopeName_5117Parser();
		case EmptyName3EditPart.VISUAL_ID:
			return getEmptyName_5118Parser();
		case ExitName3EditPart.VISUAL_ID:
			return getExitName_5119Parser();
		case ExtensionActivityName3EditPart.VISUAL_ID:
			return getExtensionActivityName_5120Parser();
		case FlowName3EditPart.VISUAL_ID:
			return getFlowName_5136Parser();
		case ForEachName2EditPart.VISUAL_ID:
			return getForEachName_5121Parser();
		case AssignName4EditPart.VISUAL_ID:
			return getAssignName_5137Parser();
		case CompensateName4EditPart.VISUAL_ID:
			return getCompensateName_5138Parser();
		case CompensateScopeName4EditPart.VISUAL_ID:
			return getCompensateScopeName_5139Parser();
		case EmptyName4EditPart.VISUAL_ID:
			return getEmptyName_5140Parser();
		case ExitName4EditPart.VISUAL_ID:
			return getExitName_5141Parser();
		case ExtensionActivityName4EditPart.VISUAL_ID:
			return getExtensionActivityName_5142Parser();
		case ForEachName3EditPart.VISUAL_ID:
			return getForEachName_5157Parser();
		case IfName2EditPart.VISUAL_ID:
			return getIfName_5143Parser();
		case AssignName5EditPart.VISUAL_ID:
			return getAssignName_5158Parser();
		case CompensateName5EditPart.VISUAL_ID:
			return getCompensateName_5159Parser();
		case CompensateScopeName5EditPart.VISUAL_ID:
			return getCompensateScopeName_5160Parser();
		case EmptyName5EditPart.VISUAL_ID:
			return getEmptyName_5161Parser();
		case ExitName5EditPart.VISUAL_ID:
			return getExitName_5162Parser();
		case ExtensionActivityName5EditPart.VISUAL_ID:
			return getExtensionActivityName_5163Parser();
		case IfName3EditPart.VISUAL_ID:
			return getIfName_5235Parser();
		case ForEachName4EditPart.VISUAL_ID:
			return getForEachName_5221Parser();
		case InvokeName2EditPart.VISUAL_ID:
			return getInvokeName_5144Parser();
		case OpaqueActivityName2EditPart.VISUAL_ID:
			return getOpaqueActivityName_5145Parser();
		case PartnerActivityName2EditPart.VISUAL_ID:
			return getPartnerActivityName_5146Parser();
		case PickName2EditPart.VISUAL_ID:
			return getPickName_5147Parser();
		case AssignName6EditPart.VISUAL_ID:
			return getAssignName_5289Parser();
		case CompensateName6EditPart.VISUAL_ID:
			return getCompensateName_5290Parser();
		case CompensateScopeName6EditPart.VISUAL_ID:
			return getCompensateScopeName_5291Parser();
		case EmptyName6EditPart.VISUAL_ID:
			return getEmptyName_5292Parser();
		case ExitName6EditPart.VISUAL_ID:
			return getExitName_5293Parser();
		case ExtensionActivityName6EditPart.VISUAL_ID:
			return getExtensionActivityName_5294Parser();
		case FlowName4EditPart.VISUAL_ID:
			return getFlowName_5363Parser();
		case IfName4EditPart.VISUAL_ID:
			return getIfName_5122Parser();
		case InvokeName3EditPart.VISUAL_ID:
			return getInvokeName_5222Parser();
		case OpaqueActivityName3EditPart.VISUAL_ID:
			return getOpaqueActivityName_5223Parser();
		case PartnerActivityName3EditPart.VISUAL_ID:
			return getPartnerActivityName_5224Parser();
		case PickName3EditPart.VISUAL_ID:
			return getPickName_5225Parser();
		case AssignName7EditPart.VISUAL_ID:
			return getAssignName_5295Parser();
		case CompensateName7EditPart.VISUAL_ID:
			return getCompensateName_5296Parser();
		case CompensateScopeName7EditPart.VISUAL_ID:
			return getCompensateScopeName_5297Parser();
		case EmptyName7EditPart.VISUAL_ID:
			return getEmptyName_5298Parser();
		case ExitName7EditPart.VISUAL_ID:
			return getExitName_5299Parser();
		case ExtensionActivityName7EditPart.VISUAL_ID:
			return getExtensionActivityName_5300Parser();
		case FlowName5EditPart.VISUAL_ID:
			return getFlowName_5345Parser();
		case InvokeName4EditPart.VISUAL_ID:
			return getInvokeName_5123Parser();
		case OpaqueActivityName4EditPart.VISUAL_ID:
			return getOpaqueActivityName_5124Parser();
		case PartnerActivityName4EditPart.VISUAL_ID:
			return getPartnerActivityName_5125Parser();
		case PickName4EditPart.VISUAL_ID:
			return getPickName_5126Parser();
		case ReceiveName2EditPart.VISUAL_ID:
			return getReceiveName_5127Parser();
		case RepeatUntilName2EditPart.VISUAL_ID:
			return getRepeatUntilName_5128Parser();
		case AssignName8EditPart.VISUAL_ID:
			return getAssignName_5164Parser();
		case CompensateName8EditPart.VISUAL_ID:
			return getCompensateName_5165Parser();
		case CompensateScopeName8EditPart.VISUAL_ID:
			return getCompensateScopeName_5166Parser();
		case EmptyName8EditPart.VISUAL_ID:
			return getEmptyName_5167Parser();
		case ExitName8EditPart.VISUAL_ID:
			return getExitName_5168Parser();
		case ExtensionActivityName8EditPart.VISUAL_ID:
			return getExtensionActivityName_5169Parser();
		case RepeatUntilName3EditPart.VISUAL_ID:
			return getRepeatUntilName_5220Parser();
		case ForEachName5EditPart.VISUAL_ID:
			return getForEachName_5207Parser();
		case ReceiveName3EditPart.VISUAL_ID:
			return getReceiveName_5148Parser();
		case RepeatUntilName4EditPart.VISUAL_ID:
			return getRepeatUntilName_5149Parser();
		case InvokeName5EditPart.VISUAL_ID:
			return getInvokeName_5208Parser();
		case OpaqueActivityName5EditPart.VISUAL_ID:
			return getOpaqueActivityName_5209Parser();
		case PartnerActivityName5EditPart.VISUAL_ID:
			return getPartnerActivityName_5210Parser();
		case PickName5EditPart.VISUAL_ID:
			return getPickName_5211Parser();
		case ReceiveName4EditPart.VISUAL_ID:
			return getReceiveName_5212Parser();
		case ReplyName2EditPart.VISUAL_ID:
			return getReplyName_5213Parser();
		case RethrowName2EditPart.VISUAL_ID:
			return getRethrowName_5214Parser();
		case ScopeName2EditPart.VISUAL_ID:
			return getScopeName_5215Parser();
		case AssignName9EditPart.VISUAL_ID:
			return getAssignName_5170Parser();
		case CompensateName9EditPart.VISUAL_ID:
			return getCompensateName_5171Parser();
		case CompensateScopeName9EditPart.VISUAL_ID:
			return getCompensateScopeName_5172Parser();
		case EmptyName9EditPart.VISUAL_ID:
			return getEmptyName_5173Parser();
		case ExitName9EditPart.VISUAL_ID:
			return getExitName_5174Parser();
		case ExtensionActivityName9EditPart.VISUAL_ID:
			return getExtensionActivityName_5175Parser();
		case ScopeName3EditPart.VISUAL_ID:
			return getScopeName_5206Parser();
		case ForEachName6EditPart.VISUAL_ID:
			return getForEachName_5194Parser();
		case ReplyName3EditPart.VISUAL_ID:
			return getReplyName_5150Parser();
		case RethrowName3EditPart.VISUAL_ID:
			return getRethrowName_5151Parser();
		case ScopeName4EditPart.VISUAL_ID:
			return getScopeName_5152Parser();
		case InvokeName6EditPart.VISUAL_ID:
			return getInvokeName_5195Parser();
		case OpaqueActivityName6EditPart.VISUAL_ID:
			return getOpaqueActivityName_5196Parser();
		case PartnerActivityName6EditPart.VISUAL_ID:
			return getPartnerActivityName_5197Parser();
		case PickName6EditPart.VISUAL_ID:
			return getPickName_5198Parser();
		case ReceiveName5EditPart.VISUAL_ID:
			return getReceiveName_5199Parser();
		case ReplyName4EditPart.VISUAL_ID:
			return getReplyName_5200Parser();
		case RethrowName4EditPart.VISUAL_ID:
			return getRethrowName_5201Parser();
		case ThrowName2EditPart.VISUAL_ID:
			return getThrowName_5202Parser();
		case ValidateName2EditPart.VISUAL_ID:
			return getValidateName_5203Parser();
		case WaitName2EditPart.VISUAL_ID:
			return getWaitName_5204Parser();
		case WhileName2EditPart.VISUAL_ID:
			return getWhileName_5205Parser();
		case AssignName10EditPart.VISUAL_ID:
			return getAssignName_5176Parser();
		case CompensateName10EditPart.VISUAL_ID:
			return getCompensateName_5177Parser();
		case CompensateScopeName10EditPart.VISUAL_ID:
			return getCompensateScopeName_5178Parser();
		case EmptyName10EditPart.VISUAL_ID:
			return getEmptyName_5179Parser();
		case ExitName10EditPart.VISUAL_ID:
			return getExitName_5180Parser();
		case ExtensionActivityName10EditPart.VISUAL_ID:
			return getExtensionActivityName_5181Parser();
		case FlowName6EditPart.VISUAL_ID:
			return getFlowName_5240Parser();
		case ReplyName5EditPart.VISUAL_ID:
			return getReplyName_5129Parser();
		case RethrowName5EditPart.VISUAL_ID:
			return getRethrowName_5130Parser();
		case ScopeName5EditPart.VISUAL_ID:
			return getScopeName_5131Parser();
		case ForEachName7EditPart.VISUAL_ID:
			return getForEachName_5303Parser();
		case ThrowName3EditPart.VISUAL_ID:
			return getThrowName_5153Parser();
		case ValidateName3EditPart.VISUAL_ID:
			return getValidateName_5154Parser();
		case WaitName3EditPart.VISUAL_ID:
			return getWaitName_5155Parser();
		case WhileName3EditPart.VISUAL_ID:
			return getWhileName_5156Parser();
		case ForEachName8EditPart.VISUAL_ID:
			return getForEachName_5182Parser();
		case IfName5EditPart.VISUAL_ID:
			return getIfName_5239Parser();
		case ReceiveName6EditPart.VISUAL_ID:
			return getReceiveName_5226Parser();
		case RepeatUntilName5EditPart.VISUAL_ID:
			return getRepeatUntilName_5227Parser();
		case ThrowName4EditPart.VISUAL_ID:
			return getThrowName_5216Parser();
		case ValidateName4EditPart.VISUAL_ID:
			return getValidateName_5217Parser();
		case WaitName4EditPart.VISUAL_ID:
			return getWaitName_5218Parser();
		case WhileName4EditPart.VISUAL_ID:
			return getWhileName_5219Parser();
		case InvokeName7EditPart.VISUAL_ID:
			return getInvokeName_5183Parser();
		case OpaqueActivityName7EditPart.VISUAL_ID:
			return getOpaqueActivityName_5184Parser();
		case PartnerActivityName7EditPart.VISUAL_ID:
			return getPartnerActivityName_5185Parser();
		case PickName7EditPart.VISUAL_ID:
			return getPickName_5186Parser();
		case ReceiveName7EditPart.VISUAL_ID:
			return getReceiveName_5187Parser();
		case RepeatUntilName6EditPart.VISUAL_ID:
			return getRepeatUntilName_5238Parser();
		case ReplyName6EditPart.VISUAL_ID:
			return getReplyName_5188Parser();
		case RethrowName6EditPart.VISUAL_ID:
			return getRethrowName_5189Parser();
		case ScopeName6EditPart.VISUAL_ID:
			return getScopeName_5236Parser();
		case SequenceName2EditPart.VISUAL_ID:
			return getSequenceName_5237Parser();
		case AssignName11EditPart.VISUAL_ID:
			return getAssignName_5093Parser();
		case CompensateName11EditPart.VISUAL_ID:
			return getCompensateName_5094Parser();
		case CompensateScopeName11EditPart.VISUAL_ID:
			return getCompensateScopeName_5095Parser();
		case EmptyName11EditPart.VISUAL_ID:
			return getEmptyName_5096Parser();
		case ExitName11EditPart.VISUAL_ID:
			return getExitName_5097Parser();
		case ExtensionActivityName11EditPart.VISUAL_ID:
			return getExtensionActivityName_5098Parser();
		case FlowName7EditPart.VISUAL_ID:
			return getFlowName_5099Parser();
		case ThrowName5EditPart.VISUAL_ID:
			return getThrowName_5132Parser();
		case ValidateName5EditPart.VISUAL_ID:
			return getValidateName_5133Parser();
		case WaitName5EditPart.VISUAL_ID:
			return getWaitName_5134Parser();
		case WhileName5EditPart.VISUAL_ID:
			return getWhileName_5135Parser();
		case ThrowName6EditPart.VISUAL_ID:
			return getThrowName_5190Parser();
		case ValidateName6EditPart.VISUAL_ID:
			return getValidateName_5191Parser();
		case WaitName6EditPart.VISUAL_ID:
			return getWaitName_5192Parser();
		case WhileName6EditPart.VISUAL_ID:
			return getWhileName_5193Parser();
		case ForEachName9EditPart.VISUAL_ID:
			return getForEachName_5100Parser();
		case IfName6EditPart.VISUAL_ID:
			return getIfName_5056Parser();
		case ReplyName7EditPart.VISUAL_ID:
			return getReplyName_5228Parser();
		case RethrowName7EditPart.VISUAL_ID:
			return getRethrowName_5229Parser();
		case ScopeName7EditPart.VISUAL_ID:
			return getScopeName_5230Parser();
		case ThrowName7EditPart.VISUAL_ID:
			return getThrowName_5231Parser();
		case ValidateName7EditPart.VISUAL_ID:
			return getValidateName_5232Parser();
		case WaitName7EditPart.VISUAL_ID:
			return getWaitName_5233Parser();
		case WhileName7EditPart.VISUAL_ID:
			return getWhileName_5234Parser();
		case AssignName12EditPart.VISUAL_ID:
			return getAssignName_5241Parser();
		case CompensateName12EditPart.VISUAL_ID:
			return getCompensateName_5242Parser();
		case CompensateScopeName12EditPart.VISUAL_ID:
			return getCompensateScopeName_5243Parser();
		case EmptyName12EditPart.VISUAL_ID:
			return getEmptyName_5244Parser();
		case ExitName12EditPart.VISUAL_ID:
			return getExitName_5245Parser();
		case ExtensionActivityName12EditPart.VISUAL_ID:
			return getExtensionActivityName_5246Parser();
		case FlowName8EditPart.VISUAL_ID:
			return getFlowName_5247Parser();
		case ForEachName10EditPart.VISUAL_ID:
			return getForEachName_5248Parser();
		case IfName7EditPart.VISUAL_ID:
			return getIfName_5249Parser();
		case AssignName13EditPart.VISUAL_ID:
			return getAssignName_5265Parser();
		case CompensateName13EditPart.VISUAL_ID:
			return getCompensateName_5266Parser();
		case CompensateScopeName13EditPart.VISUAL_ID:
			return getCompensateScopeName_5267Parser();
		case EmptyName13EditPart.VISUAL_ID:
			return getEmptyName_5268Parser();
		case ExitName13EditPart.VISUAL_ID:
			return getExitName_5269Parser();
		case ExtensionActivityName13EditPart.VISUAL_ID:
			return getExtensionActivityName_5270Parser();
		case FlowName9EditPart.VISUAL_ID:
			return getFlowName_5271Parser();
		case ForEachName11EditPart.VISUAL_ID:
			return getForEachName_5272Parser();
		case IfName8EditPart.VISUAL_ID:
			return getIfName_5273Parser();
		case InvokeName8EditPart.VISUAL_ID:
			return getInvokeName_5274Parser();
		case OpaqueActivityName8EditPart.VISUAL_ID:
			return getOpaqueActivityName_5275Parser();
		case PartnerActivityName8EditPart.VISUAL_ID:
			return getPartnerActivityName_5276Parser();
		case PickName8EditPart.VISUAL_ID:
			return getPickName_5277Parser();
		case ReceiveName8EditPart.VISUAL_ID:
			return getReceiveName_5278Parser();
		case RepeatUntilName7EditPart.VISUAL_ID:
			return getRepeatUntilName_5279Parser();
		case ReplyName8EditPart.VISUAL_ID:
			return getReplyName_5280Parser();
		case RethrowName8EditPart.VISUAL_ID:
			return getRethrowName_5281Parser();
		case ScopeName8EditPart.VISUAL_ID:
			return getScopeName_5282Parser();
		case SequenceName3EditPart.VISUAL_ID:
			return getSequenceName_5283Parser();
		case InvokeName9EditPart.VISUAL_ID:
			return getInvokeName_5101Parser();
		case OpaqueActivityName9EditPart.VISUAL_ID:
			return getOpaqueActivityName_5102Parser();
		case PartnerActivityName9EditPart.VISUAL_ID:
			return getPartnerActivityName_5103Parser();
		case PickName9EditPart.VISUAL_ID:
			return getPickName_5104Parser();
		case ReceiveName9EditPart.VISUAL_ID:
			return getReceiveName_5105Parser();
		case RepeatUntilName8EditPart.VISUAL_ID:
			return getRepeatUntilName_5106Parser();
		case ReplyName9EditPart.VISUAL_ID:
			return getReplyName_5107Parser();
		case RethrowName9EditPart.VISUAL_ID:
			return getRethrowName_5108Parser();
		case ScopeName9EditPart.VISUAL_ID:
			return getScopeName_5109Parser();
		case SequenceName4EditPart.VISUAL_ID:
			return getSequenceName_5114Parser();
		case ThrowName8EditPart.VISUAL_ID:
			return getThrowName_5110Parser();
		case ValidateName8EditPart.VISUAL_ID:
			return getValidateName_5111Parser();
		case WaitName8EditPart.VISUAL_ID:
			return getWaitName_5112Parser();
		case WhileName8EditPart.VISUAL_ID:
			return getWhileName_5113Parser();
		case ThrowName9EditPart.VISUAL_ID:
			return getThrowName_5284Parser();
		case ValidateName9EditPart.VISUAL_ID:
			return getValidateName_5285Parser();
		case WaitName9EditPart.VISUAL_ID:
			return getWaitName_5286Parser();
		case WhileName9EditPart.VISUAL_ID:
			return getWhileName_5287Parser();
		case InvokeName10EditPart.VISUAL_ID:
			return getInvokeName_5250Parser();
		case OpaqueActivityName10EditPart.VISUAL_ID:
			return getOpaqueActivityName_5251Parser();
		case PartnerActivityName10EditPart.VISUAL_ID:
			return getPartnerActivityName_5252Parser();
		case PickName10EditPart.VISUAL_ID:
			return getPickName_5253Parser();
		case ReceiveName10EditPart.VISUAL_ID:
			return getReceiveName_5254Parser();
		case RepeatUntilName9EditPart.VISUAL_ID:
			return getRepeatUntilName_5255Parser();
		case ReplyName10EditPart.VISUAL_ID:
			return getReplyName_5256Parser();
		case RethrowName10EditPart.VISUAL_ID:
			return getRethrowName_5257Parser();
		case ScopeName10EditPart.VISUAL_ID:
			return getScopeName_5258Parser();
		case SequenceName5EditPart.VISUAL_ID:
			return getSequenceName_5259Parser();
		case ThrowName10EditPart.VISUAL_ID:
			return getThrowName_5260Parser();
		case ValidateName10EditPart.VISUAL_ID:
			return getValidateName_5261Parser();
		case WaitName10EditPart.VISUAL_ID:
			return getWaitName_5262Parser();
		case WhileName10EditPart.VISUAL_ID:
			return getWhileName_5263Parser();
		case IfName9EditPart.VISUAL_ID:
			return getIfName_5304Parser();
		case InvokeName11EditPart.VISUAL_ID:
			return getInvokeName_5305Parser();
		case OpaqueActivityName11EditPart.VISUAL_ID:
			return getOpaqueActivityName_5306Parser();
		case PartnerActivityName11EditPart.VISUAL_ID:
			return getPartnerActivityName_5307Parser();
		case PickName11EditPart.VISUAL_ID:
			return getPickName_5308Parser();
		case ReceiveName11EditPart.VISUAL_ID:
			return getReceiveName_5309Parser();
		case RepeatUntilName10EditPart.VISUAL_ID:
			return getRepeatUntilName_5310Parser();
		case ReplyName11EditPart.VISUAL_ID:
			return getReplyName_5311Parser();
		case RethrowName11EditPart.VISUAL_ID:
			return getRethrowName_5312Parser();
		case ScopeName11EditPart.VISUAL_ID:
			return getScopeName_5313Parser();
		case SequenceName6EditPart.VISUAL_ID:
			return getSequenceName_5314Parser();
		case ThrowName11EditPart.VISUAL_ID:
			return getThrowName_5315Parser();
		case ValidateName11EditPart.VISUAL_ID:
			return getValidateName_5316Parser();
		case WaitName11EditPart.VISUAL_ID:
			return getWaitName_5317Parser();
		case WhileName11EditPart.VISUAL_ID:
			return getWhileName_5318Parser();
		case AssignName14EditPart.VISUAL_ID:
			return getAssignName_5320Parser();
		case CompensateName14EditPart.VISUAL_ID:
			return getCompensateName_5321Parser();
		case CompensateScopeName14EditPart.VISUAL_ID:
			return getCompensateScopeName_5322Parser();
		case EmptyName14EditPart.VISUAL_ID:
			return getEmptyName_5323Parser();
		case ExitName14EditPart.VISUAL_ID:
			return getExitName_5324Parser();
		case ExtensionActivityName14EditPart.VISUAL_ID:
			return getExtensionActivityName_5325Parser();
		case FlowName10EditPart.VISUAL_ID:
			return getFlowName_5326Parser();
		case ForEachName12EditPart.VISUAL_ID:
			return getForEachName_5327Parser();
		case IfName10EditPart.VISUAL_ID:
			return getIfName_5328Parser();
		case InvokeName12EditPart.VISUAL_ID:
			return getInvokeName_5329Parser();
		case OpaqueActivityName12EditPart.VISUAL_ID:
			return getOpaqueActivityName_5330Parser();
		case PartnerActivityName12EditPart.VISUAL_ID:
			return getPartnerActivityName_5331Parser();
		case PickName12EditPart.VISUAL_ID:
			return getPickName_5332Parser();
		case ReceiveName12EditPart.VISUAL_ID:
			return getReceiveName_5333Parser();
		case RepeatUntilName11EditPart.VISUAL_ID:
			return getRepeatUntilName_5334Parser();
		case ReplyName12EditPart.VISUAL_ID:
			return getReplyName_5335Parser();
		case RethrowName12EditPart.VISUAL_ID:
			return getRethrowName_5336Parser();
		case ScopeName12EditPart.VISUAL_ID:
			return getScopeName_5337Parser();
		case SequenceName7EditPart.VISUAL_ID:
			return getSequenceName_5338Parser();
		case ThrowName12EditPart.VISUAL_ID:
			return getThrowName_5339Parser();
		case ValidateName12EditPart.VISUAL_ID:
			return getValidateName_5340Parser();
		case WaitName12EditPart.VISUAL_ID:
			return getWaitName_5341Parser();
		case WhileName12EditPart.VISUAL_ID:
			return getWhileName_5342Parser();
		case ForEachName13EditPart.VISUAL_ID:
			return getForEachName_5346Parser();
		case IfName11EditPart.VISUAL_ID:
			return getIfName_5347Parser();
		case InvokeName13EditPart.VISUAL_ID:
			return getInvokeName_5348Parser();
		case OpaqueActivityName13EditPart.VISUAL_ID:
			return getOpaqueActivityName_5349Parser();
		case PartnerActivityName13EditPart.VISUAL_ID:
			return getPartnerActivityName_5350Parser();
		case PickName13EditPart.VISUAL_ID:
			return getPickName_5351Parser();
		case ReceiveName13EditPart.VISUAL_ID:
			return getReceiveName_5352Parser();
		case RepeatUntilName12EditPart.VISUAL_ID:
			return getRepeatUntilName_5353Parser();
		case ReplyName13EditPart.VISUAL_ID:
			return getReplyName_5354Parser();
		case RethrowName13EditPart.VISUAL_ID:
			return getRethrowName_5355Parser();
		case ScopeName13EditPart.VISUAL_ID:
			return getScopeName_5356Parser();
		case SequenceName8EditPart.VISUAL_ID:
			return getSequenceName_5357Parser();
		case ThrowName13EditPart.VISUAL_ID:
			return getThrowName_5358Parser();
		case ValidateName13EditPart.VISUAL_ID:
			return getValidateName_5359Parser();
		case WaitName13EditPart.VISUAL_ID:
			return getWaitName_5360Parser();
		case WhileName13EditPart.VISUAL_ID:
			return getWhileName_5361Parser();
		case ForEachName14EditPart.VISUAL_ID:
			return getForEachName_5011Parser();
		case IfName12EditPart.VISUAL_ID:
			return getIfName_5012Parser();
		case InvokeName14EditPart.VISUAL_ID:
			return getInvokeName_5013Parser();
		case OpaqueActivityName14EditPart.VISUAL_ID:
			return getOpaqueActivityName_5014Parser();
		case PartnerActivityName14EditPart.VISUAL_ID:
			return getPartnerActivityName_5015Parser();
		case PickName14EditPart.VISUAL_ID:
			return getPickName_5016Parser();
		case ReceiveName14EditPart.VISUAL_ID:
			return getReceiveName_5017Parser();
		case RepeatUntilName13EditPart.VISUAL_ID:
			return getRepeatUntilName_5018Parser();
		case ReplyName14EditPart.VISUAL_ID:
			return getReplyName_5019Parser();
		case RethrowName14EditPart.VISUAL_ID:
			return getRethrowName_5020Parser();
		case ScopeName14EditPart.VISUAL_ID:
			return getScopeName_5021Parser();
		case SequenceName9EditPart.VISUAL_ID:
			return getSequenceName_5003Parser();
		case ThrowName14EditPart.VISUAL_ID:
			return getThrowName_5022Parser();
		case ValidateName14EditPart.VISUAL_ID:
			return getValidateName_5023Parser();
		case WaitName14EditPart.VISUAL_ID:
			return getWaitName_5024Parser();
		case WhileName14EditPart.VISUAL_ID:
			return getWhileName_5025Parser();
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
			return getParser(BpeldiagVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(BpeldiagVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (BpeldiagElementTypes.getElement(hint) == null) {
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
