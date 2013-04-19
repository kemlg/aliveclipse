package net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.*;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.parsers.MessageFormatParser;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;
import net.sf.ictalive.owls.process.ProcessPackage;

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

/**
 * @generated
 */
public class MappingParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser processName_5296Parser;

	/**
	 * @generated
	 */
	private IParser getProcessName_5296Parser() {
		if (processName_5296Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getProcess_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Process {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Process {0}"); //$NON-NLS-1$
			parser.setEditPattern("Process {0}"); //$NON-NLS-1$
			processName_5296Parser = parser;
		}
		return processName_5296Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicActionName_5297Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicActionName_5297Parser() {
		if (atomicActionName_5297Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Atomic Action {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			atomicActionName_5297Parser = parser;
		}
		return atomicActionName_5297Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeActionName_5302Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeActionName_5302Parser() {
		if (compositeActionName_5302Parser == null) {
			EAttribute[] features = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { ProcessPackage.eINSTANCE
					.getProcess_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Composite Action {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			compositeActionName_5302Parser = parser;
		}
		return compositeActionName_5302Parser;
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
	private IParser compensateName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5002Parser() {
		if (compensateName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5002Parser = parser;
		}
		return compensateName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5003Parser() {
		if (compensateScopeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5003Parser = parser;
		}
		return compensateScopeName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5004Parser() {
		if (emptyName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5004Parser = parser;
		}
		return emptyName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5005Parser() {
		if (exitName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5005Parser = parser;
		}
		return exitName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5006Parser() {
		if (extensionActivityName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5006Parser = parser;
		}
		return extensionActivityName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5278Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5278Parser() {
		if (flowName_5278Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5278Parser = parser;
		}
		return flowName_5278Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5007Parser() {
		if (assignName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5007Parser = parser;
		}
		return assignName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5008Parser() {
		if (compensateName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5008Parser = parser;
		}
		return compensateName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5009Parser() {
		if (compensateScopeName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5009Parser = parser;
		}
		return compensateScopeName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5010Parser() {
		if (emptyName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5010Parser = parser;
		}
		return emptyName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5011Parser() {
		if (exitName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5011Parser = parser;
		}
		return exitName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5012Parser() {
		if (extensionActivityName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5012Parser = parser;
		}
		return extensionActivityName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5277Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5277Parser() {
		if (flowName_5277Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5277Parser = parser;
		}
		return flowName_5277Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5276Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5276Parser() {
		if (forEachName_5276Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5276Parser = parser;
		}
		return forEachName_5276Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5013Parser() {
		if (assignName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5013Parser = parser;
		}
		return assignName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5014Parser() {
		if (compensateName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5014Parser = parser;
		}
		return compensateName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5015Parser() {
		if (compensateScopeName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5015Parser = parser;
		}
		return compensateScopeName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5016Parser() {
		if (emptyName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5016Parser = parser;
		}
		return emptyName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5017Parser() {
		if (exitName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5017Parser = parser;
		}
		return exitName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5018Parser() {
		if (extensionActivityName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5018Parser = parser;
		}
		return extensionActivityName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5275Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5275Parser() {
		if (forEachName_5275Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5275Parser = parser;
		}
		return forEachName_5275Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5274Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5274Parser() {
		if (ifName_5274Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5274Parser = parser;
		}
		return ifName_5274Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5019Parser() {
		if (assignName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5019Parser = parser;
		}
		return assignName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5020Parser() {
		if (compensateName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5020Parser = parser;
		}
		return compensateName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5021Parser() {
		if (compensateScopeName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5021Parser = parser;
		}
		return compensateScopeName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5022Parser() {
		if (emptyName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5022Parser = parser;
		}
		return emptyName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5023Parser() {
		if (exitName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5023Parser = parser;
		}
		return exitName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5024Parser() {
		if (extensionActivityName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5024Parser = parser;
		}
		return extensionActivityName_5024Parser;
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
	private IParser invokeName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5025Parser() {
		if (invokeName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5025Parser = parser;
		}
		return invokeName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5026Parser() {
		if (opaqueActivityName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5026Parser = parser;
		}
		return opaqueActivityName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5027Parser() {
		if (partnerActivityName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5027Parser = parser;
		}
		return partnerActivityName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5271Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5271Parser() {
		if (pickName_5271Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5271Parser = parser;
		}
		return pickName_5271Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5028Parser() {
		if (assignName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5028Parser = parser;
		}
		return assignName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5029Parser() {
		if (compensateName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5029Parser = parser;
		}
		return compensateName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5030Parser() {
		if (compensateScopeName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5030Parser = parser;
		}
		return compensateScopeName_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5031Parser() {
		if (emptyName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5031Parser = parser;
		}
		return emptyName_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5032Parser() {
		if (exitName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5032Parser = parser;
		}
		return exitName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5033Parser() {
		if (extensionActivityName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5033Parser = parser;
		}
		return extensionActivityName_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5269Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5269Parser() {
		if (flowName_5269Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5269Parser = parser;
		}
		return flowName_5269Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5268Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5268Parser() {
		if (ifName_5268Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5268Parser = parser;
		}
		return ifName_5268Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5034Parser() {
		if (invokeName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5034Parser = parser;
		}
		return invokeName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5035Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5035Parser() {
		if (opaqueActivityName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5035Parser = parser;
		}
		return opaqueActivityName_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5036Parser() {
		if (partnerActivityName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5036Parser = parser;
		}
		return partnerActivityName_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5267Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5267Parser() {
		if (pickName_5267Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5267Parser = parser;
		}
		return pickName_5267Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5037Parser() {
		if (assignName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5037Parser = parser;
		}
		return assignName_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5038Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5038Parser() {
		if (compensateName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5038Parser = parser;
		}
		return compensateName_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5039Parser() {
		if (compensateScopeName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5039Parser = parser;
		}
		return compensateScopeName_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5040Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5040Parser() {
		if (emptyName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5040Parser = parser;
		}
		return emptyName_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5041Parser() {
		if (exitName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5041Parser = parser;
		}
		return exitName_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5042Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5042Parser() {
		if (extensionActivityName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5042Parser = parser;
		}
		return extensionActivityName_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5249Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5249Parser() {
		if (flowName_5249Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5249Parser = parser;
		}
		return flowName_5249Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5043Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5043Parser() {
		if (invokeName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5043Parser = parser;
		}
		return invokeName_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5044Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5044Parser() {
		if (opaqueActivityName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5044Parser = parser;
		}
		return opaqueActivityName_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5045Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5045Parser() {
		if (partnerActivityName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5045Parser = parser;
		}
		return partnerActivityName_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5046Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5046Parser() {
		if (pickName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5046Parser = parser;
		}
		return pickName_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5047Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5047Parser() {
		if (receiveName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5047Parser = parser;
		}
		return receiveName_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5248Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5248Parser() {
		if (repeatUntilName_5248Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5248Parser = parser;
		}
		return repeatUntilName_5248Parser;
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
	private IParser compensateName_5049Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5049Parser() {
		if (compensateName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5049Parser = parser;
		}
		return compensateName_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5050Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5050Parser() {
		if (compensateScopeName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5050Parser = parser;
		}
		return compensateScopeName_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5051Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5051Parser() {
		if (emptyName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5051Parser = parser;
		}
		return emptyName_5051Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5052Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5052Parser() {
		if (exitName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5052Parser = parser;
		}
		return exitName_5052Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5053Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5053Parser() {
		if (extensionActivityName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5053Parser = parser;
		}
		return extensionActivityName_5053Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5247Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5247Parser() {
		if (repeatUntilName_5247Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5247Parser = parser;
		}
		return repeatUntilName_5247Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5246Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5246Parser() {
		if (forEachName_5246Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5246Parser = parser;
		}
		return forEachName_5246Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5054Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5054Parser() {
		if (receiveName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5054Parser = parser;
		}
		return receiveName_5054Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5245Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5245Parser() {
		if (repeatUntilName_5245Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5245Parser = parser;
		}
		return repeatUntilName_5245Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5055Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5055Parser() {
		if (invokeName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5055Parser = parser;
		}
		return invokeName_5055Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5056Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5056Parser() {
		if (opaqueActivityName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5056Parser = parser;
		}
		return opaqueActivityName_5056Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5057Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5057Parser() {
		if (partnerActivityName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5057Parser = parser;
		}
		return partnerActivityName_5057Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5058Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5058Parser() {
		if (pickName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5058Parser = parser;
		}
		return pickName_5058Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5059Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5059Parser() {
		if (receiveName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5059Parser = parser;
		}
		return receiveName_5059Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5060Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5060Parser() {
		if (replyName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5060Parser = parser;
		}
		return replyName_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5061Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5061Parser() {
		if (rethrowName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5061Parser = parser;
		}
		return rethrowName_5061Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5244Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5244Parser() {
		if (scopeName_5244Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5244Parser = parser;
		}
		return scopeName_5244Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5062Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5062Parser() {
		if (assignName_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5062Parser = parser;
		}
		return assignName_5062Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5063Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5063Parser() {
		if (compensateName_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5063Parser = parser;
		}
		return compensateName_5063Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5064Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5064Parser() {
		if (compensateScopeName_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5064Parser = parser;
		}
		return compensateScopeName_5064Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5065Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5065Parser() {
		if (emptyName_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5065Parser = parser;
		}
		return emptyName_5065Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5066Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5066Parser() {
		if (exitName_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5066Parser = parser;
		}
		return exitName_5066Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5067Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5067Parser() {
		if (extensionActivityName_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5067Parser = parser;
		}
		return extensionActivityName_5067Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5243Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5243Parser() {
		if (scopeName_5243Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5243Parser = parser;
		}
		return scopeName_5243Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5242Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5242Parser() {
		if (forEachName_5242Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5242Parser = parser;
		}
		return forEachName_5242Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5068Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5068Parser() {
		if (replyName_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5068Parser = parser;
		}
		return replyName_5068Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5069Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5069Parser() {
		if (rethrowName_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5069Parser = parser;
		}
		return rethrowName_5069Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5241Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5241Parser() {
		if (scopeName_5241Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5241Parser = parser;
		}
		return scopeName_5241Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5070Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5070Parser() {
		if (invokeName_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5070Parser = parser;
		}
		return invokeName_5070Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5071Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5071Parser() {
		if (opaqueActivityName_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5071Parser = parser;
		}
		return opaqueActivityName_5071Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5072Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5072Parser() {
		if (partnerActivityName_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5072Parser = parser;
		}
		return partnerActivityName_5072Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5073Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5073Parser() {
		if (pickName_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5073Parser = parser;
		}
		return pickName_5073Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5074Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5074Parser() {
		if (receiveName_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5074Parser = parser;
		}
		return receiveName_5074Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5075Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5075Parser() {
		if (replyName_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5075Parser = parser;
		}
		return replyName_5075Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5076Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5076Parser() {
		if (rethrowName_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5076Parser = parser;
		}
		return rethrowName_5076Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5077Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5077Parser() {
		if (throwName_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5077Parser = parser;
		}
		return throwName_5077Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5078Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5078Parser() {
		if (validateName_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5078Parser = parser;
		}
		return validateName_5078Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5079Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5079Parser() {
		if (waitName_5079Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5079Parser = parser;
		}
		return waitName_5079Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5240Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5240Parser() {
		if (whileName_5240Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5240Parser = parser;
		}
		return whileName_5240Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5080Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5080Parser() {
		if (assignName_5080Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5080Parser = parser;
		}
		return assignName_5080Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5081Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5081Parser() {
		if (compensateName_5081Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5081Parser = parser;
		}
		return compensateName_5081Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5082Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5082Parser() {
		if (compensateScopeName_5082Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5082Parser = parser;
		}
		return compensateScopeName_5082Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5083Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5083Parser() {
		if (emptyName_5083Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5083Parser = parser;
		}
		return emptyName_5083Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5084Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5084Parser() {
		if (exitName_5084Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5084Parser = parser;
		}
		return exitName_5084Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5085Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5085Parser() {
		if (extensionActivityName_5085Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5085Parser = parser;
		}
		return extensionActivityName_5085Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5239Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5239Parser() {
		if (flowName_5239Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5239Parser = parser;
		}
		return flowName_5239Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5086Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5086Parser() {
		if (replyName_5086Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5086Parser = parser;
		}
		return replyName_5086Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5087Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5087Parser() {
		if (rethrowName_5087Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5087Parser = parser;
		}
		return rethrowName_5087Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5238Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5238Parser() {
		if (scopeName_5238Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5238Parser = parser;
		}
		return scopeName_5238Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5196Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5196Parser() {
		if (forEachName_5196Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5196Parser = parser;
		}
		return forEachName_5196Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5088Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5088Parser() {
		if (throwName_5088Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5088Parser = parser;
		}
		return throwName_5088Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5089Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5089Parser() {
		if (validateName_5089Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5089Parser = parser;
		}
		return validateName_5089Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5090Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5090Parser() {
		if (waitName_5090Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5090Parser = parser;
		}
		return waitName_5090Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5195Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5195Parser() {
		if (whileName_5195Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5195Parser = parser;
		}
		return whileName_5195Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5091Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5091Parser() {
		if (forEachName_5091Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5091Parser = parser;
		}
		return forEachName_5091Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5194Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5194Parser() {
		if (ifName_5194Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5194Parser = parser;
		}
		return ifName_5194Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5092Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5092Parser() {
		if (receiveName_5092Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5092Parser = parser;
		}
		return receiveName_5092Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5193Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5193Parser() {
		if (repeatUntilName_5193Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5193Parser = parser;
		}
		return repeatUntilName_5193Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5093Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5093Parser() {
		if (throwName_5093Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5093Parser = parser;
		}
		return throwName_5093Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5094Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5094Parser() {
		if (validateName_5094Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5094Parser = parser;
		}
		return validateName_5094Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5095Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5095Parser() {
		if (waitName_5095Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5095Parser = parser;
		}
		return waitName_5095Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5192Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5192Parser() {
		if (whileName_5192Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5192Parser = parser;
		}
		return whileName_5192Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5096Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5096Parser() {
		if (invokeName_5096Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5096Parser = parser;
		}
		return invokeName_5096Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5097Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5097Parser() {
		if (opaqueActivityName_5097Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5097Parser = parser;
		}
		return opaqueActivityName_5097Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5098Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5098Parser() {
		if (partnerActivityName_5098Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5098Parser = parser;
		}
		return partnerActivityName_5098Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5099Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5099Parser() {
		if (pickName_5099Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5099Parser = parser;
		}
		return pickName_5099Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5100Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5100Parser() {
		if (receiveName_5100Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5100Parser = parser;
		}
		return receiveName_5100Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5101Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5101Parser() {
		if (repeatUntilName_5101Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5101Parser = parser;
		}
		return repeatUntilName_5101Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5102Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5102Parser() {
		if (replyName_5102Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5102Parser = parser;
		}
		return replyName_5102Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5103Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5103Parser() {
		if (rethrowName_5103Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5103Parser = parser;
		}
		return rethrowName_5103Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5104Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5104Parser() {
		if (scopeName_5104Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5104Parser = parser;
		}
		return scopeName_5104Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5191Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5191Parser() {
		if (sequenceName_5191Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5191Parser = parser;
		}
		return sequenceName_5191Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5105Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5105Parser() {
		if (assignName_5105Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5105Parser = parser;
		}
		return assignName_5105Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5106Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5106Parser() {
		if (compensateName_5106Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5106Parser = parser;
		}
		return compensateName_5106Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5107Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5107Parser() {
		if (compensateScopeName_5107Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5107Parser = parser;
		}
		return compensateScopeName_5107Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5108Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5108Parser() {
		if (emptyName_5108Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5108Parser = parser;
		}
		return emptyName_5108Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5109Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5109Parser() {
		if (exitName_5109Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5109Parser = parser;
		}
		return exitName_5109Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5110Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5110Parser() {
		if (extensionActivityName_5110Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5110Parser = parser;
		}
		return extensionActivityName_5110Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5119Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5119Parser() {
		if (flowName_5119Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5119Parser = parser;
		}
		return flowName_5119Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5111Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5111Parser() {
		if (throwName_5111Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5111Parser = parser;
		}
		return throwName_5111Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5112Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5112Parser() {
		if (validateName_5112Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5112Parser = parser;
		}
		return validateName_5112Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5113Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5113Parser() {
		if (waitName_5113Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5113Parser = parser;
		}
		return waitName_5113Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5118Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5118Parser() {
		if (whileName_5118Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5118Parser = parser;
		}
		return whileName_5118Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5114Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5114Parser() {
		if (throwName_5114Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5114Parser = parser;
		}
		return throwName_5114Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5115Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5115Parser() {
		if (validateName_5115Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5115Parser = parser;
		}
		return validateName_5115Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5116Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5116Parser() {
		if (waitName_5116Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5116Parser = parser;
		}
		return waitName_5116Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5117Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5117Parser() {
		if (whileName_5117Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5117Parser = parser;
		}
		return whileName_5117Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5120Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5120Parser() {
		if (forEachName_5120Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5120Parser = parser;
		}
		return forEachName_5120Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5190Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5190Parser() {
		if (ifName_5190Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5190Parser = parser;
		}
		return ifName_5190Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5121Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5121Parser() {
		if (replyName_5121Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5121Parser = parser;
		}
		return replyName_5121Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5122Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5122Parser() {
		if (rethrowName_5122Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5122Parser = parser;
		}
		return rethrowName_5122Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5123Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5123Parser() {
		if (scopeName_5123Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5123Parser = parser;
		}
		return scopeName_5123Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5124Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5124Parser() {
		if (throwName_5124Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5124Parser = parser;
		}
		return throwName_5124Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5125Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5125Parser() {
		if (validateName_5125Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5125Parser = parser;
		}
		return validateName_5125Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5126Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5126Parser() {
		if (waitName_5126Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5126Parser = parser;
		}
		return waitName_5126Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5127Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5127Parser() {
		if (whileName_5127Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5127Parser = parser;
		}
		return whileName_5127Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5128Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5128Parser() {
		if (assignName_5128Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5128Parser = parser;
		}
		return assignName_5128Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5129Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5129Parser() {
		if (compensateName_5129Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5129Parser = parser;
		}
		return compensateName_5129Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5130Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5130Parser() {
		if (compensateScopeName_5130Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5130Parser = parser;
		}
		return compensateScopeName_5130Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5131Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5131Parser() {
		if (emptyName_5131Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5131Parser = parser;
		}
		return emptyName_5131Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5132Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5132Parser() {
		if (exitName_5132Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5132Parser = parser;
		}
		return exitName_5132Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5133Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5133Parser() {
		if (extensionActivityName_5133Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5133Parser = parser;
		}
		return extensionActivityName_5133Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5134Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5134Parser() {
		if (flowName_5134Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5134Parser = parser;
		}
		return flowName_5134Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5135Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5135Parser() {
		if (forEachName_5135Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5135Parser = parser;
		}
		return forEachName_5135Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5174Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5174Parser() {
		if (ifName_5174Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5174Parser = parser;
		}
		return ifName_5174Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5136Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5136Parser() {
		if (assignName_5136Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5136Parser = parser;
		}
		return assignName_5136Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5137Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5137Parser() {
		if (compensateName_5137Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5137Parser = parser;
		}
		return compensateName_5137Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5138Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5138Parser() {
		if (compensateScopeName_5138Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5138Parser = parser;
		}
		return compensateScopeName_5138Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5139Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5139Parser() {
		if (emptyName_5139Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5139Parser = parser;
		}
		return emptyName_5139Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5140Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5140Parser() {
		if (exitName_5140Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5140Parser = parser;
		}
		return exitName_5140Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5141Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5141Parser() {
		if (extensionActivityName_5141Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5141Parser = parser;
		}
		return extensionActivityName_5141Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5142Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5142Parser() {
		if (flowName_5142Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5142Parser = parser;
		}
		return flowName_5142Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5143Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5143Parser() {
		if (forEachName_5143Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5143Parser = parser;
		}
		return forEachName_5143Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5144Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5144Parser() {
		if (ifName_5144Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5144Parser = parser;
		}
		return ifName_5144Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5145Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5145Parser() {
		if (invokeName_5145Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5145Parser = parser;
		}
		return invokeName_5145Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5146Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5146Parser() {
		if (opaqueActivityName_5146Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5146Parser = parser;
		}
		return opaqueActivityName_5146Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5147Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5147Parser() {
		if (partnerActivityName_5147Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5147Parser = parser;
		}
		return partnerActivityName_5147Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5148Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5148Parser() {
		if (pickName_5148Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5148Parser = parser;
		}
		return pickName_5148Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5149Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5149Parser() {
		if (receiveName_5149Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5149Parser = parser;
		}
		return receiveName_5149Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5150Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5150Parser() {
		if (repeatUntilName_5150Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5150Parser = parser;
		}
		return repeatUntilName_5150Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5151Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5151Parser() {
		if (replyName_5151Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5151Parser = parser;
		}
		return replyName_5151Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5152Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5152Parser() {
		if (rethrowName_5152Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5152Parser = parser;
		}
		return rethrowName_5152Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5153Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5153Parser() {
		if (scopeName_5153Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5153Parser = parser;
		}
		return scopeName_5153Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5168Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5168Parser() {
		if (sequenceName_5168Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5168Parser = parser;
		}
		return sequenceName_5168Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5154Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5154Parser() {
		if (invokeName_5154Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5154Parser = parser;
		}
		return invokeName_5154Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5155Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5155Parser() {
		if (opaqueActivityName_5155Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5155Parser = parser;
		}
		return opaqueActivityName_5155Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5156Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5156Parser() {
		if (partnerActivityName_5156Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5156Parser = parser;
		}
		return partnerActivityName_5156Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5157Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5157Parser() {
		if (pickName_5157Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5157Parser = parser;
		}
		return pickName_5157Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5158Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5158Parser() {
		if (receiveName_5158Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5158Parser = parser;
		}
		return receiveName_5158Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5159Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5159Parser() {
		if (repeatUntilName_5159Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5159Parser = parser;
		}
		return repeatUntilName_5159Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5160Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5160Parser() {
		if (replyName_5160Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5160Parser = parser;
		}
		return replyName_5160Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5161Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5161Parser() {
		if (rethrowName_5161Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5161Parser = parser;
		}
		return rethrowName_5161Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5162Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5162Parser() {
		if (scopeName_5162Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5162Parser = parser;
		}
		return scopeName_5162Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5167Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5167Parser() {
		if (sequenceName_5167Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5167Parser = parser;
		}
		return sequenceName_5167Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5163Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5163Parser() {
		if (throwName_5163Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5163Parser = parser;
		}
		return throwName_5163Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5164Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5164Parser() {
		if (validateName_5164Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5164Parser = parser;
		}
		return validateName_5164Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5165Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5165Parser() {
		if (waitName_5165Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5165Parser = parser;
		}
		return waitName_5165Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5166Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5166Parser() {
		if (whileName_5166Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5166Parser = parser;
		}
		return whileName_5166Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5169Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5169Parser() {
		if (throwName_5169Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5169Parser = parser;
		}
		return throwName_5169Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5170Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5170Parser() {
		if (validateName_5170Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5170Parser = parser;
		}
		return validateName_5170Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5171Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5171Parser() {
		if (waitName_5171Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5171Parser = parser;
		}
		return waitName_5171Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5172Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5172Parser() {
		if (whileName_5172Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5172Parser = parser;
		}
		return whileName_5172Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5175Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5175Parser() {
		if (invokeName_5175Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5175Parser = parser;
		}
		return invokeName_5175Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5176Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5176Parser() {
		if (opaqueActivityName_5176Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5176Parser = parser;
		}
		return opaqueActivityName_5176Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5177Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5177Parser() {
		if (partnerActivityName_5177Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5177Parser = parser;
		}
		return partnerActivityName_5177Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5178Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5178Parser() {
		if (pickName_5178Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5178Parser = parser;
		}
		return pickName_5178Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5179Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5179Parser() {
		if (receiveName_5179Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5179Parser = parser;
		}
		return receiveName_5179Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5180Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5180Parser() {
		if (repeatUntilName_5180Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5180Parser = parser;
		}
		return repeatUntilName_5180Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5181Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5181Parser() {
		if (replyName_5181Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5181Parser = parser;
		}
		return replyName_5181Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5182Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5182Parser() {
		if (rethrowName_5182Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5182Parser = parser;
		}
		return rethrowName_5182Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5183Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5183Parser() {
		if (scopeName_5183Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5183Parser = parser;
		}
		return scopeName_5183Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5184Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5184Parser() {
		if (sequenceName_5184Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5184Parser = parser;
		}
		return sequenceName_5184Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5185Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5185Parser() {
		if (throwName_5185Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5185Parser = parser;
		}
		return throwName_5185Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5186Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5186Parser() {
		if (validateName_5186Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5186Parser = parser;
		}
		return validateName_5186Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5187Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5187Parser() {
		if (waitName_5187Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5187Parser = parser;
		}
		return waitName_5187Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5188Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5188Parser() {
		if (whileName_5188Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5188Parser = parser;
		}
		return whileName_5188Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5197Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5197Parser() {
		if (ifName_5197Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5197Parser = parser;
		}
		return ifName_5197Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5198Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5198Parser() {
		if (invokeName_5198Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5198Parser = parser;
		}
		return invokeName_5198Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5199Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5199Parser() {
		if (opaqueActivityName_5199Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5199Parser = parser;
		}
		return opaqueActivityName_5199Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5200Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5200Parser() {
		if (partnerActivityName_5200Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5200Parser = parser;
		}
		return partnerActivityName_5200Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5201Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5201Parser() {
		if (pickName_5201Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5201Parser = parser;
		}
		return pickName_5201Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5202Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5202Parser() {
		if (receiveName_5202Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5202Parser = parser;
		}
		return receiveName_5202Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5203Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5203Parser() {
		if (repeatUntilName_5203Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5203Parser = parser;
		}
		return repeatUntilName_5203Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5204Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5204Parser() {
		if (replyName_5204Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5204Parser = parser;
		}
		return replyName_5204Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5205Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5205Parser() {
		if (rethrowName_5205Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5205Parser = parser;
		}
		return rethrowName_5205Parser;
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
	private IParser sequenceName_5207Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5207Parser() {
		if (sequenceName_5207Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5207Parser = parser;
		}
		return sequenceName_5207Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5208Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5208Parser() {
		if (throwName_5208Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5208Parser = parser;
		}
		return throwName_5208Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5209Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5209Parser() {
		if (validateName_5209Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5209Parser = parser;
		}
		return validateName_5209Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5210Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5210Parser() {
		if (waitName_5210Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5210Parser = parser;
		}
		return waitName_5210Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5211Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5211Parser() {
		if (whileName_5211Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5211Parser = parser;
		}
		return whileName_5211Parser;
	}

	/**
	 * @generated
	 */
	private IParser assignName_5213Parser;

	/**
	 * @generated
	 */
	private IParser getAssignName_5213Parser() {
		if (assignName_5213Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assign {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assign {0}"); //$NON-NLS-1$
			assignName_5213Parser = parser;
		}
		return assignName_5213Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateName_5214Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateName_5214Parser() {
		if (compensateName_5214Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Compensate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Compensate {0}"); //$NON-NLS-1$
			compensateName_5214Parser = parser;
		}
		return compensateName_5214Parser;
	}

	/**
	 * @generated
	 */
	private IParser compensateScopeName_5215Parser;

	/**
	 * @generated
	 */
	private IParser getCompensateScopeName_5215Parser() {
		if (compensateScopeName_5215Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CompensateScope {0}"); //$NON-NLS-1$
			parser.setEditPattern("CompensateScope {0}"); //$NON-NLS-1$
			compensateScopeName_5215Parser = parser;
		}
		return compensateScopeName_5215Parser;
	}

	/**
	 * @generated
	 */
	private IParser emptyName_5216Parser;

	/**
	 * @generated
	 */
	private IParser getEmptyName_5216Parser() {
		if (emptyName_5216Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Empty {0}"); //$NON-NLS-1$
			parser.setEditPattern("Empty {0}"); //$NON-NLS-1$
			emptyName_5216Parser = parser;
		}
		return emptyName_5216Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitName_5217Parser;

	/**
	 * @generated
	 */
	private IParser getExitName_5217Parser() {
		if (exitName_5217Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Exit {0}"); //$NON-NLS-1$
			parser.setEditPattern("Exit {0}"); //$NON-NLS-1$
			exitName_5217Parser = parser;
		}
		return exitName_5217Parser;
	}

	/**
	 * @generated
	 */
	private IParser extensionActivityName_5218Parser;

	/**
	 * @generated
	 */
	private IParser getExtensionActivityName_5218Parser() {
		if (extensionActivityName_5218Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("ExtensionActivity {0}"); //$NON-NLS-1$
			extensionActivityName_5218Parser = parser;
		}
		return extensionActivityName_5218Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowName_5219Parser;

	/**
	 * @generated
	 */
	private IParser getFlowName_5219Parser() {
		if (flowName_5219Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Flow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Flow {0}"); //$NON-NLS-1$
			flowName_5219Parser = parser;
		}
		return flowName_5219Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5220Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5220Parser() {
		if (forEachName_5220Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5220Parser = parser;
		}
		return forEachName_5220Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5221Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5221Parser() {
		if (ifName_5221Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5221Parser = parser;
		}
		return ifName_5221Parser;
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
	private IParser sequenceName_5231Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5231Parser() {
		if (sequenceName_5231Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5231Parser = parser;
		}
		return sequenceName_5231Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5232Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5232Parser() {
		if (throwName_5232Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5232Parser = parser;
		}
		return throwName_5232Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5233Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5233Parser() {
		if (validateName_5233Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5233Parser = parser;
		}
		return validateName_5233Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5234Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5234Parser() {
		if (waitName_5234Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5234Parser = parser;
		}
		return waitName_5234Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5235Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5235Parser() {
		if (whileName_5235Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5235Parser = parser;
		}
		return whileName_5235Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5250Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5250Parser() {
		if (forEachName_5250Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5250Parser = parser;
		}
		return forEachName_5250Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5251Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5251Parser() {
		if (ifName_5251Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5251Parser = parser;
		}
		return ifName_5251Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5252Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5252Parser() {
		if (invokeName_5252Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5252Parser = parser;
		}
		return invokeName_5252Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5253Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5253Parser() {
		if (opaqueActivityName_5253Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5253Parser = parser;
		}
		return opaqueActivityName_5253Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5254Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5254Parser() {
		if (partnerActivityName_5254Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5254Parser = parser;
		}
		return partnerActivityName_5254Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5255Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5255Parser() {
		if (pickName_5255Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5255Parser = parser;
		}
		return pickName_5255Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5256Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5256Parser() {
		if (receiveName_5256Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5256Parser = parser;
		}
		return receiveName_5256Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5257Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5257Parser() {
		if (repeatUntilName_5257Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5257Parser = parser;
		}
		return repeatUntilName_5257Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5258Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5258Parser() {
		if (replyName_5258Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5258Parser = parser;
		}
		return replyName_5258Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5259Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5259Parser() {
		if (rethrowName_5259Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5259Parser = parser;
		}
		return rethrowName_5259Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5260Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5260Parser() {
		if (scopeName_5260Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5260Parser = parser;
		}
		return scopeName_5260Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5261Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5261Parser() {
		if (sequenceName_5261Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5261Parser = parser;
		}
		return sequenceName_5261Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5262Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5262Parser() {
		if (throwName_5262Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5262Parser = parser;
		}
		return throwName_5262Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5263Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5263Parser() {
		if (validateName_5263Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5263Parser = parser;
		}
		return validateName_5263Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5264Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5264Parser() {
		if (waitName_5264Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5264Parser = parser;
		}
		return waitName_5264Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5265Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5265Parser() {
		if (whileName_5265Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5265Parser = parser;
		}
		return whileName_5265Parser;
	}

	/**
	 * @generated
	 */
	private IParser forEachName_5279Parser;

	/**
	 * @generated
	 */
	private IParser getForEachName_5279Parser() {
		if (forEachName_5279Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditorPattern("ForEach {0}"); //$NON-NLS-1$
			parser.setEditPattern("ForEach {0}"); //$NON-NLS-1$
			forEachName_5279Parser = parser;
		}
		return forEachName_5279Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifName_5280Parser;

	/**
	 * @generated
	 */
	private IParser getIfName_5280Parser() {
		if (ifName_5280Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("If {0}"); //$NON-NLS-1$
			parser.setEditorPattern("If {0}"); //$NON-NLS-1$
			parser.setEditPattern("If {0}"); //$NON-NLS-1$
			ifName_5280Parser = parser;
		}
		return ifName_5280Parser;
	}

	/**
	 * @generated
	 */
	private IParser invokeName_5281Parser;

	/**
	 * @generated
	 */
	private IParser getInvokeName_5281Parser() {
		if (invokeName_5281Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Invoke {0}"); //$NON-NLS-1$
			parser.setEditPattern("Invoke {0}"); //$NON-NLS-1$
			invokeName_5281Parser = parser;
		}
		return invokeName_5281Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActivityName_5282Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActivityName_5282Parser() {
		if (opaqueActivityName_5282Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("OpaqueActivity {0}"); //$NON-NLS-1$
			opaqueActivityName_5282Parser = parser;
		}
		return opaqueActivityName_5282Parser;
	}

	/**
	 * @generated
	 */
	private IParser partnerActivityName_5283Parser;

	/**
	 * @generated
	 */
	private IParser getPartnerActivityName_5283Parser() {
		if (partnerActivityName_5283Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditorPattern("PartnerActivity {0}"); //$NON-NLS-1$
			parser.setEditPattern("PartnerActivity {0}"); //$NON-NLS-1$
			partnerActivityName_5283Parser = parser;
		}
		return partnerActivityName_5283Parser;
	}

	/**
	 * @generated
	 */
	private IParser pickName_5284Parser;

	/**
	 * @generated
	 */
	private IParser getPickName_5284Parser() {
		if (pickName_5284Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Pick {0}"); //$NON-NLS-1$
			parser.setEditPattern("Pick {0}"); //$NON-NLS-1$
			pickName_5284Parser = parser;
		}
		return pickName_5284Parser;
	}

	/**
	 * @generated
	 */
	private IParser receiveName_5285Parser;

	/**
	 * @generated
	 */
	private IParser getReceiveName_5285Parser() {
		if (receiveName_5285Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Receive {0}"); //$NON-NLS-1$
			parser.setEditPattern("Receive {0}"); //$NON-NLS-1$
			receiveName_5285Parser = parser;
		}
		return receiveName_5285Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatUntilName_5286Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatUntilName_5286Parser() {
		if (repeatUntilName_5286Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditorPattern("RepeatUntil {0}"); //$NON-NLS-1$
			parser.setEditPattern("RepeatUntil {0}"); //$NON-NLS-1$
			repeatUntilName_5286Parser = parser;
		}
		return repeatUntilName_5286Parser;
	}

	/**
	 * @generated
	 */
	private IParser replyName_5287Parser;

	/**
	 * @generated
	 */
	private IParser getReplyName_5287Parser() {
		if (replyName_5287Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Reply {0}"); //$NON-NLS-1$
			parser.setEditPattern("Reply {0}"); //$NON-NLS-1$
			replyName_5287Parser = parser;
		}
		return replyName_5287Parser;
	}

	/**
	 * @generated
	 */
	private IParser rethrowName_5288Parser;

	/**
	 * @generated
	 */
	private IParser getRethrowName_5288Parser() {
		if (rethrowName_5288Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Rethrow {0}"); //$NON-NLS-1$
			parser.setEditPattern("Rethrow {0}"); //$NON-NLS-1$
			rethrowName_5288Parser = parser;
		}
		return rethrowName_5288Parser;
	}

	/**
	 * @generated
	 */
	private IParser scopeName_5289Parser;

	/**
	 * @generated
	 */
	private IParser getScopeName_5289Parser() {
		if (scopeName_5289Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scope {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scope {0}"); //$NON-NLS-1$
			scopeName_5289Parser = parser;
		}
		return scopeName_5289Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5290Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5290Parser() {
		if (sequenceName_5290Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sequence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sequence {0}"); //$NON-NLS-1$
			sequenceName_5290Parser = parser;
		}
		return sequenceName_5290Parser;
	}

	/**
	 * @generated
	 */
	private IParser throwName_5291Parser;

	/**
	 * @generated
	 */
	private IParser getThrowName_5291Parser() {
		if (throwName_5291Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Throw {0}"); //$NON-NLS-1$
			parser.setEditPattern("Throw {0}"); //$NON-NLS-1$
			throwName_5291Parser = parser;
		}
		return throwName_5291Parser;
	}

	/**
	 * @generated
	 */
	private IParser validateName_5292Parser;

	/**
	 * @generated
	 */
	private IParser getValidateName_5292Parser() {
		if (validateName_5292Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Validate {0}"); //$NON-NLS-1$
			parser.setEditPattern("Validate {0}"); //$NON-NLS-1$
			validateName_5292Parser = parser;
		}
		return validateName_5292Parser;
	}

	/**
	 * @generated
	 */
	private IParser waitName_5293Parser;

	/**
	 * @generated
	 */
	private IParser getWaitName_5293Parser() {
		if (waitName_5293Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Wait {0}"); //$NON-NLS-1$
			parser.setEditPattern("Wait {0}"); //$NON-NLS-1$
			waitName_5293Parser = parser;
		}
		return waitName_5293Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileName_5294Parser;

	/**
	 * @generated
	 */
	private IParser getWhileName_5294Parser() {
		if (whileName_5294Parser == null) {
			EAttribute[] features = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { BPELPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("While {0}"); //$NON-NLS-1$
			parser.setEditorPattern("While {0}"); //$NON-NLS-1$
			parser.setEditPattern("While {0}"); //$NON-NLS-1$
			whileName_5294Parser = parser;
		}
		return whileName_5294Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ProcessNameEditPart.VISUAL_ID:
			return getProcessName_5296Parser();
		case AtomicActionNameEditPart.VISUAL_ID:
			return getAtomicActionName_5297Parser();
		case CompositeActionNameEditPart.VISUAL_ID:
			return getCompositeActionName_5302Parser();
		case AssignNameEditPart.VISUAL_ID:
			return getAssignName_5001Parser();
		case CompensateNameEditPart.VISUAL_ID:
			return getCompensateName_5002Parser();
		case CompensateScopeNameEditPart.VISUAL_ID:
			return getCompensateScopeName_5003Parser();
		case EmptyNameEditPart.VISUAL_ID:
			return getEmptyName_5004Parser();
		case ExitNameEditPart.VISUAL_ID:
			return getExitName_5005Parser();
		case ExtensionActivityNameEditPart.VISUAL_ID:
			return getExtensionActivityName_5006Parser();
		case FlowNameEditPart.VISUAL_ID:
			return getFlowName_5278Parser();
		case AssignName2EditPart.VISUAL_ID:
			return getAssignName_5007Parser();
		case CompensateName2EditPart.VISUAL_ID:
			return getCompensateName_5008Parser();
		case CompensateScopeName2EditPart.VISUAL_ID:
			return getCompensateScopeName_5009Parser();
		case EmptyName2EditPart.VISUAL_ID:
			return getEmptyName_5010Parser();
		case ExitName2EditPart.VISUAL_ID:
			return getExitName_5011Parser();
		case ExtensionActivityName2EditPart.VISUAL_ID:
			return getExtensionActivityName_5012Parser();
		case FlowName2EditPart.VISUAL_ID:
			return getFlowName_5277Parser();
		case ForEachNameEditPart.VISUAL_ID:
			return getForEachName_5276Parser();
		case AssignName3EditPart.VISUAL_ID:
			return getAssignName_5013Parser();
		case CompensateName3EditPart.VISUAL_ID:
			return getCompensateName_5014Parser();
		case CompensateScopeName3EditPart.VISUAL_ID:
			return getCompensateScopeName_5015Parser();
		case EmptyName3EditPart.VISUAL_ID:
			return getEmptyName_5016Parser();
		case ExitName3EditPart.VISUAL_ID:
			return getExitName_5017Parser();
		case ExtensionActivityName3EditPart.VISUAL_ID:
			return getExtensionActivityName_5018Parser();
		case ForEachName2EditPart.VISUAL_ID:
			return getForEachName_5275Parser();
		case IfNameEditPart.VISUAL_ID:
			return getIfName_5274Parser();
		case AssignName4EditPart.VISUAL_ID:
			return getAssignName_5019Parser();
		case CompensateName4EditPart.VISUAL_ID:
			return getCompensateName_5020Parser();
		case CompensateScopeName4EditPart.VISUAL_ID:
			return getCompensateScopeName_5021Parser();
		case EmptyName4EditPart.VISUAL_ID:
			return getEmptyName_5022Parser();
		case ExitName4EditPart.VISUAL_ID:
			return getExitName_5023Parser();
		case ExtensionActivityName4EditPart.VISUAL_ID:
			return getExtensionActivityName_5024Parser();
		case IfName2EditPart.VISUAL_ID:
			return getIfName_5273Parser();
		case ForEachName3EditPart.VISUAL_ID:
			return getForEachName_5272Parser();
		case InvokeNameEditPart.VISUAL_ID:
			return getInvokeName_5025Parser();
		case OpaqueActivityNameEditPart.VISUAL_ID:
			return getOpaqueActivityName_5026Parser();
		case PartnerActivityNameEditPart.VISUAL_ID:
			return getPartnerActivityName_5027Parser();
		case PickNameEditPart.VISUAL_ID:
			return getPickName_5271Parser();
		case AssignName5EditPart.VISUAL_ID:
			return getAssignName_5028Parser();
		case CompensateName5EditPart.VISUAL_ID:
			return getCompensateName_5029Parser();
		case CompensateScopeName5EditPart.VISUAL_ID:
			return getCompensateScopeName_5030Parser();
		case EmptyName5EditPart.VISUAL_ID:
			return getEmptyName_5031Parser();
		case ExitName5EditPart.VISUAL_ID:
			return getExitName_5032Parser();
		case ExtensionActivityName5EditPart.VISUAL_ID:
			return getExtensionActivityName_5033Parser();
		case FlowName3EditPart.VISUAL_ID:
			return getFlowName_5269Parser();
		case IfName3EditPart.VISUAL_ID:
			return getIfName_5268Parser();
		case InvokeName2EditPart.VISUAL_ID:
			return getInvokeName_5034Parser();
		case OpaqueActivityName2EditPart.VISUAL_ID:
			return getOpaqueActivityName_5035Parser();
		case PartnerActivityName2EditPart.VISUAL_ID:
			return getPartnerActivityName_5036Parser();
		case PickName2EditPart.VISUAL_ID:
			return getPickName_5267Parser();
		case AssignName6EditPart.VISUAL_ID:
			return getAssignName_5037Parser();
		case CompensateName6EditPart.VISUAL_ID:
			return getCompensateName_5038Parser();
		case CompensateScopeName6EditPart.VISUAL_ID:
			return getCompensateScopeName_5039Parser();
		case EmptyName6EditPart.VISUAL_ID:
			return getEmptyName_5040Parser();
		case ExitName6EditPart.VISUAL_ID:
			return getExitName_5041Parser();
		case ExtensionActivityName6EditPart.VISUAL_ID:
			return getExtensionActivityName_5042Parser();
		case FlowName4EditPart.VISUAL_ID:
			return getFlowName_5249Parser();
		case InvokeName3EditPart.VISUAL_ID:
			return getInvokeName_5043Parser();
		case OpaqueActivityName3EditPart.VISUAL_ID:
			return getOpaqueActivityName_5044Parser();
		case PartnerActivityName3EditPart.VISUAL_ID:
			return getPartnerActivityName_5045Parser();
		case PickName3EditPart.VISUAL_ID:
			return getPickName_5046Parser();
		case ReceiveNameEditPart.VISUAL_ID:
			return getReceiveName_5047Parser();
		case RepeatUntilNameEditPart.VISUAL_ID:
			return getRepeatUntilName_5248Parser();
		case AssignName7EditPart.VISUAL_ID:
			return getAssignName_5048Parser();
		case CompensateName7EditPart.VISUAL_ID:
			return getCompensateName_5049Parser();
		case CompensateScopeName7EditPart.VISUAL_ID:
			return getCompensateScopeName_5050Parser();
		case EmptyName7EditPart.VISUAL_ID:
			return getEmptyName_5051Parser();
		case ExitName7EditPart.VISUAL_ID:
			return getExitName_5052Parser();
		case ExtensionActivityName7EditPart.VISUAL_ID:
			return getExtensionActivityName_5053Parser();
		case RepeatUntilName2EditPart.VISUAL_ID:
			return getRepeatUntilName_5247Parser();
		case ForEachName4EditPart.VISUAL_ID:
			return getForEachName_5246Parser();
		case ReceiveName2EditPart.VISUAL_ID:
			return getReceiveName_5054Parser();
		case RepeatUntilName3EditPart.VISUAL_ID:
			return getRepeatUntilName_5245Parser();
		case InvokeName4EditPart.VISUAL_ID:
			return getInvokeName_5055Parser();
		case OpaqueActivityName4EditPart.VISUAL_ID:
			return getOpaqueActivityName_5056Parser();
		case PartnerActivityName4EditPart.VISUAL_ID:
			return getPartnerActivityName_5057Parser();
		case PickName4EditPart.VISUAL_ID:
			return getPickName_5058Parser();
		case ReceiveName3EditPart.VISUAL_ID:
			return getReceiveName_5059Parser();
		case ReplyNameEditPart.VISUAL_ID:
			return getReplyName_5060Parser();
		case RethrowNameEditPart.VISUAL_ID:
			return getRethrowName_5061Parser();
		case ScopeNameEditPart.VISUAL_ID:
			return getScopeName_5244Parser();
		case AssignName8EditPart.VISUAL_ID:
			return getAssignName_5062Parser();
		case CompensateName8EditPart.VISUAL_ID:
			return getCompensateName_5063Parser();
		case CompensateScopeName8EditPart.VISUAL_ID:
			return getCompensateScopeName_5064Parser();
		case EmptyName8EditPart.VISUAL_ID:
			return getEmptyName_5065Parser();
		case ExitName8EditPart.VISUAL_ID:
			return getExitName_5066Parser();
		case ExtensionActivityName8EditPart.VISUAL_ID:
			return getExtensionActivityName_5067Parser();
		case ScopeName2EditPart.VISUAL_ID:
			return getScopeName_5243Parser();
		case ForEachName5EditPart.VISUAL_ID:
			return getForEachName_5242Parser();
		case ReplyName2EditPart.VISUAL_ID:
			return getReplyName_5068Parser();
		case RethrowName2EditPart.VISUAL_ID:
			return getRethrowName_5069Parser();
		case ScopeName3EditPart.VISUAL_ID:
			return getScopeName_5241Parser();
		case InvokeName5EditPart.VISUAL_ID:
			return getInvokeName_5070Parser();
		case OpaqueActivityName5EditPart.VISUAL_ID:
			return getOpaqueActivityName_5071Parser();
		case PartnerActivityName5EditPart.VISUAL_ID:
			return getPartnerActivityName_5072Parser();
		case PickName5EditPart.VISUAL_ID:
			return getPickName_5073Parser();
		case ReceiveName4EditPart.VISUAL_ID:
			return getReceiveName_5074Parser();
		case ReplyName3EditPart.VISUAL_ID:
			return getReplyName_5075Parser();
		case RethrowName3EditPart.VISUAL_ID:
			return getRethrowName_5076Parser();
		case ThrowNameEditPart.VISUAL_ID:
			return getThrowName_5077Parser();
		case ValidateNameEditPart.VISUAL_ID:
			return getValidateName_5078Parser();
		case WaitNameEditPart.VISUAL_ID:
			return getWaitName_5079Parser();
		case WhileNameEditPart.VISUAL_ID:
			return getWhileName_5240Parser();
		case AssignName9EditPart.VISUAL_ID:
			return getAssignName_5080Parser();
		case CompensateName9EditPart.VISUAL_ID:
			return getCompensateName_5081Parser();
		case CompensateScopeName9EditPart.VISUAL_ID:
			return getCompensateScopeName_5082Parser();
		case EmptyName9EditPart.VISUAL_ID:
			return getEmptyName_5083Parser();
		case ExitName9EditPart.VISUAL_ID:
			return getExitName_5084Parser();
		case ExtensionActivityName9EditPart.VISUAL_ID:
			return getExtensionActivityName_5085Parser();
		case FlowName5EditPart.VISUAL_ID:
			return getFlowName_5239Parser();
		case ReplyName4EditPart.VISUAL_ID:
			return getReplyName_5086Parser();
		case RethrowName4EditPart.VISUAL_ID:
			return getRethrowName_5087Parser();
		case ScopeName4EditPart.VISUAL_ID:
			return getScopeName_5238Parser();
		case ForEachName6EditPart.VISUAL_ID:
			return getForEachName_5196Parser();
		case ThrowName2EditPart.VISUAL_ID:
			return getThrowName_5088Parser();
		case ValidateName2EditPart.VISUAL_ID:
			return getValidateName_5089Parser();
		case WaitName2EditPart.VISUAL_ID:
			return getWaitName_5090Parser();
		case WhileName2EditPart.VISUAL_ID:
			return getWhileName_5195Parser();
		case ForEachName7EditPart.VISUAL_ID:
			return getForEachName_5091Parser();
		case IfName4EditPart.VISUAL_ID:
			return getIfName_5194Parser();
		case ReceiveName5EditPart.VISUAL_ID:
			return getReceiveName_5092Parser();
		case RepeatUntilName4EditPart.VISUAL_ID:
			return getRepeatUntilName_5193Parser();
		case ThrowName3EditPart.VISUAL_ID:
			return getThrowName_5093Parser();
		case ValidateName3EditPart.VISUAL_ID:
			return getValidateName_5094Parser();
		case WaitName3EditPart.VISUAL_ID:
			return getWaitName_5095Parser();
		case WhileName3EditPart.VISUAL_ID:
			return getWhileName_5192Parser();
		case InvokeName6EditPart.VISUAL_ID:
			return getInvokeName_5096Parser();
		case OpaqueActivityName6EditPart.VISUAL_ID:
			return getOpaqueActivityName_5097Parser();
		case PartnerActivityName6EditPart.VISUAL_ID:
			return getPartnerActivityName_5098Parser();
		case PickName6EditPart.VISUAL_ID:
			return getPickName_5099Parser();
		case ReceiveName6EditPart.VISUAL_ID:
			return getReceiveName_5100Parser();
		case RepeatUntilName5EditPart.VISUAL_ID:
			return getRepeatUntilName_5101Parser();
		case ReplyName5EditPart.VISUAL_ID:
			return getReplyName_5102Parser();
		case RethrowName5EditPart.VISUAL_ID:
			return getRethrowName_5103Parser();
		case ScopeName5EditPart.VISUAL_ID:
			return getScopeName_5104Parser();
		case SequenceNameEditPart.VISUAL_ID:
			return getSequenceName_5191Parser();
		case AssignName10EditPart.VISUAL_ID:
			return getAssignName_5105Parser();
		case CompensateName10EditPart.VISUAL_ID:
			return getCompensateName_5106Parser();
		case CompensateScopeName10EditPart.VISUAL_ID:
			return getCompensateScopeName_5107Parser();
		case EmptyName10EditPart.VISUAL_ID:
			return getEmptyName_5108Parser();
		case ExitName10EditPart.VISUAL_ID:
			return getExitName_5109Parser();
		case ExtensionActivityName10EditPart.VISUAL_ID:
			return getExtensionActivityName_5110Parser();
		case FlowName6EditPart.VISUAL_ID:
			return getFlowName_5119Parser();
		case ThrowName4EditPart.VISUAL_ID:
			return getThrowName_5111Parser();
		case ValidateName4EditPart.VISUAL_ID:
			return getValidateName_5112Parser();
		case WaitName4EditPart.VISUAL_ID:
			return getWaitName_5113Parser();
		case WhileName4EditPart.VISUAL_ID:
			return getWhileName_5118Parser();
		case ThrowName5EditPart.VISUAL_ID:
			return getThrowName_5114Parser();
		case ValidateName5EditPart.VISUAL_ID:
			return getValidateName_5115Parser();
		case WaitName5EditPart.VISUAL_ID:
			return getWaitName_5116Parser();
		case WhileName5EditPart.VISUAL_ID:
			return getWhileName_5117Parser();
		case ForEachName8EditPart.VISUAL_ID:
			return getForEachName_5120Parser();
		case IfName5EditPart.VISUAL_ID:
			return getIfName_5190Parser();
		case ReplyName6EditPart.VISUAL_ID:
			return getReplyName_5121Parser();
		case RethrowName6EditPart.VISUAL_ID:
			return getRethrowName_5122Parser();
		case ScopeName6EditPart.VISUAL_ID:
			return getScopeName_5123Parser();
		case ThrowName6EditPart.VISUAL_ID:
			return getThrowName_5124Parser();
		case ValidateName6EditPart.VISUAL_ID:
			return getValidateName_5125Parser();
		case WaitName6EditPart.VISUAL_ID:
			return getWaitName_5126Parser();
		case WhileName6EditPart.VISUAL_ID:
			return getWhileName_5127Parser();
		case AssignName11EditPart.VISUAL_ID:
			return getAssignName_5128Parser();
		case CompensateName11EditPart.VISUAL_ID:
			return getCompensateName_5129Parser();
		case CompensateScopeName11EditPart.VISUAL_ID:
			return getCompensateScopeName_5130Parser();
		case EmptyName11EditPart.VISUAL_ID:
			return getEmptyName_5131Parser();
		case ExitName11EditPart.VISUAL_ID:
			return getExitName_5132Parser();
		case ExtensionActivityName11EditPart.VISUAL_ID:
			return getExtensionActivityName_5133Parser();
		case FlowName7EditPart.VISUAL_ID:
			return getFlowName_5134Parser();
		case ForEachName9EditPart.VISUAL_ID:
			return getForEachName_5135Parser();
		case IfName6EditPart.VISUAL_ID:
			return getIfName_5174Parser();
		case AssignName12EditPart.VISUAL_ID:
			return getAssignName_5136Parser();
		case CompensateName12EditPart.VISUAL_ID:
			return getCompensateName_5137Parser();
		case CompensateScopeName12EditPart.VISUAL_ID:
			return getCompensateScopeName_5138Parser();
		case EmptyName12EditPart.VISUAL_ID:
			return getEmptyName_5139Parser();
		case ExitName12EditPart.VISUAL_ID:
			return getExitName_5140Parser();
		case ExtensionActivityName12EditPart.VISUAL_ID:
			return getExtensionActivityName_5141Parser();
		case FlowName8EditPart.VISUAL_ID:
			return getFlowName_5142Parser();
		case ForEachName10EditPart.VISUAL_ID:
			return getForEachName_5143Parser();
		case IfName7EditPart.VISUAL_ID:
			return getIfName_5144Parser();
		case InvokeName7EditPart.VISUAL_ID:
			return getInvokeName_5145Parser();
		case OpaqueActivityName7EditPart.VISUAL_ID:
			return getOpaqueActivityName_5146Parser();
		case PartnerActivityName7EditPart.VISUAL_ID:
			return getPartnerActivityName_5147Parser();
		case PickName7EditPart.VISUAL_ID:
			return getPickName_5148Parser();
		case ReceiveName7EditPart.VISUAL_ID:
			return getReceiveName_5149Parser();
		case RepeatUntilName6EditPart.VISUAL_ID:
			return getRepeatUntilName_5150Parser();
		case ReplyName7EditPart.VISUAL_ID:
			return getReplyName_5151Parser();
		case RethrowName7EditPart.VISUAL_ID:
			return getRethrowName_5152Parser();
		case ScopeName7EditPart.VISUAL_ID:
			return getScopeName_5153Parser();
		case SequenceName2EditPart.VISUAL_ID:
			return getSequenceName_5168Parser();
		case InvokeName8EditPart.VISUAL_ID:
			return getInvokeName_5154Parser();
		case OpaqueActivityName8EditPart.VISUAL_ID:
			return getOpaqueActivityName_5155Parser();
		case PartnerActivityName8EditPart.VISUAL_ID:
			return getPartnerActivityName_5156Parser();
		case PickName8EditPart.VISUAL_ID:
			return getPickName_5157Parser();
		case ReceiveName8EditPart.VISUAL_ID:
			return getReceiveName_5158Parser();
		case RepeatUntilName7EditPart.VISUAL_ID:
			return getRepeatUntilName_5159Parser();
		case ReplyName8EditPart.VISUAL_ID:
			return getReplyName_5160Parser();
		case RethrowName8EditPart.VISUAL_ID:
			return getRethrowName_5161Parser();
		case ScopeName8EditPart.VISUAL_ID:
			return getScopeName_5162Parser();
		case SequenceName3EditPart.VISUAL_ID:
			return getSequenceName_5167Parser();
		case ThrowName7EditPart.VISUAL_ID:
			return getThrowName_5163Parser();
		case ValidateName7EditPart.VISUAL_ID:
			return getValidateName_5164Parser();
		case WaitName7EditPart.VISUAL_ID:
			return getWaitName_5165Parser();
		case WhileName7EditPart.VISUAL_ID:
			return getWhileName_5166Parser();
		case ThrowName8EditPart.VISUAL_ID:
			return getThrowName_5169Parser();
		case ValidateName8EditPart.VISUAL_ID:
			return getValidateName_5170Parser();
		case WaitName8EditPart.VISUAL_ID:
			return getWaitName_5171Parser();
		case WhileName8EditPart.VISUAL_ID:
			return getWhileName_5172Parser();
		case InvokeName9EditPart.VISUAL_ID:
			return getInvokeName_5175Parser();
		case OpaqueActivityName9EditPart.VISUAL_ID:
			return getOpaqueActivityName_5176Parser();
		case PartnerActivityName9EditPart.VISUAL_ID:
			return getPartnerActivityName_5177Parser();
		case PickName9EditPart.VISUAL_ID:
			return getPickName_5178Parser();
		case ReceiveName9EditPart.VISUAL_ID:
			return getReceiveName_5179Parser();
		case RepeatUntilName8EditPart.VISUAL_ID:
			return getRepeatUntilName_5180Parser();
		case ReplyName9EditPart.VISUAL_ID:
			return getReplyName_5181Parser();
		case RethrowName9EditPart.VISUAL_ID:
			return getRethrowName_5182Parser();
		case ScopeName9EditPart.VISUAL_ID:
			return getScopeName_5183Parser();
		case SequenceName4EditPart.VISUAL_ID:
			return getSequenceName_5184Parser();
		case ThrowName9EditPart.VISUAL_ID:
			return getThrowName_5185Parser();
		case ValidateName9EditPart.VISUAL_ID:
			return getValidateName_5186Parser();
		case WaitName9EditPart.VISUAL_ID:
			return getWaitName_5187Parser();
		case WhileName9EditPart.VISUAL_ID:
			return getWhileName_5188Parser();
		case IfName8EditPart.VISUAL_ID:
			return getIfName_5197Parser();
		case InvokeName10EditPart.VISUAL_ID:
			return getInvokeName_5198Parser();
		case OpaqueActivityName10EditPart.VISUAL_ID:
			return getOpaqueActivityName_5199Parser();
		case PartnerActivityName10EditPart.VISUAL_ID:
			return getPartnerActivityName_5200Parser();
		case PickName10EditPart.VISUAL_ID:
			return getPickName_5201Parser();
		case ReceiveName10EditPart.VISUAL_ID:
			return getReceiveName_5202Parser();
		case RepeatUntilName9EditPart.VISUAL_ID:
			return getRepeatUntilName_5203Parser();
		case ReplyName10EditPart.VISUAL_ID:
			return getReplyName_5204Parser();
		case RethrowName10EditPart.VISUAL_ID:
			return getRethrowName_5205Parser();
		case ScopeName10EditPart.VISUAL_ID:
			return getScopeName_5206Parser();
		case SequenceName5EditPart.VISUAL_ID:
			return getSequenceName_5207Parser();
		case ThrowName10EditPart.VISUAL_ID:
			return getThrowName_5208Parser();
		case ValidateName10EditPart.VISUAL_ID:
			return getValidateName_5209Parser();
		case WaitName10EditPart.VISUAL_ID:
			return getWaitName_5210Parser();
		case WhileName10EditPart.VISUAL_ID:
			return getWhileName_5211Parser();
		case AssignName13EditPart.VISUAL_ID:
			return getAssignName_5213Parser();
		case CompensateName13EditPart.VISUAL_ID:
			return getCompensateName_5214Parser();
		case CompensateScopeName13EditPart.VISUAL_ID:
			return getCompensateScopeName_5215Parser();
		case EmptyName13EditPart.VISUAL_ID:
			return getEmptyName_5216Parser();
		case ExitName13EditPart.VISUAL_ID:
			return getExitName_5217Parser();
		case ExtensionActivityName13EditPart.VISUAL_ID:
			return getExtensionActivityName_5218Parser();
		case FlowName9EditPart.VISUAL_ID:
			return getFlowName_5219Parser();
		case ForEachName11EditPart.VISUAL_ID:
			return getForEachName_5220Parser();
		case IfName9EditPart.VISUAL_ID:
			return getIfName_5221Parser();
		case InvokeName11EditPart.VISUAL_ID:
			return getInvokeName_5222Parser();
		case OpaqueActivityName11EditPart.VISUAL_ID:
			return getOpaqueActivityName_5223Parser();
		case PartnerActivityName11EditPart.VISUAL_ID:
			return getPartnerActivityName_5224Parser();
		case PickName11EditPart.VISUAL_ID:
			return getPickName_5225Parser();
		case ReceiveName11EditPart.VISUAL_ID:
			return getReceiveName_5226Parser();
		case RepeatUntilName10EditPart.VISUAL_ID:
			return getRepeatUntilName_5227Parser();
		case ReplyName11EditPart.VISUAL_ID:
			return getReplyName_5228Parser();
		case RethrowName11EditPart.VISUAL_ID:
			return getRethrowName_5229Parser();
		case ScopeName11EditPart.VISUAL_ID:
			return getScopeName_5230Parser();
		case SequenceName6EditPart.VISUAL_ID:
			return getSequenceName_5231Parser();
		case ThrowName11EditPart.VISUAL_ID:
			return getThrowName_5232Parser();
		case ValidateName11EditPart.VISUAL_ID:
			return getValidateName_5233Parser();
		case WaitName11EditPart.VISUAL_ID:
			return getWaitName_5234Parser();
		case WhileName11EditPart.VISUAL_ID:
			return getWhileName_5235Parser();
		case ForEachName12EditPart.VISUAL_ID:
			return getForEachName_5250Parser();
		case IfName10EditPart.VISUAL_ID:
			return getIfName_5251Parser();
		case InvokeName12EditPart.VISUAL_ID:
			return getInvokeName_5252Parser();
		case OpaqueActivityName12EditPart.VISUAL_ID:
			return getOpaqueActivityName_5253Parser();
		case PartnerActivityName12EditPart.VISUAL_ID:
			return getPartnerActivityName_5254Parser();
		case PickName12EditPart.VISUAL_ID:
			return getPickName_5255Parser();
		case ReceiveName12EditPart.VISUAL_ID:
			return getReceiveName_5256Parser();
		case RepeatUntilName11EditPart.VISUAL_ID:
			return getRepeatUntilName_5257Parser();
		case ReplyName12EditPart.VISUAL_ID:
			return getReplyName_5258Parser();
		case RethrowName12EditPart.VISUAL_ID:
			return getRethrowName_5259Parser();
		case ScopeName12EditPart.VISUAL_ID:
			return getScopeName_5260Parser();
		case SequenceName7EditPart.VISUAL_ID:
			return getSequenceName_5261Parser();
		case ThrowName12EditPart.VISUAL_ID:
			return getThrowName_5262Parser();
		case ValidateName12EditPart.VISUAL_ID:
			return getValidateName_5263Parser();
		case WaitName12EditPart.VISUAL_ID:
			return getWaitName_5264Parser();
		case WhileName12EditPart.VISUAL_ID:
			return getWhileName_5265Parser();
		case ForEachName13EditPart.VISUAL_ID:
			return getForEachName_5279Parser();
		case IfName11EditPart.VISUAL_ID:
			return getIfName_5280Parser();
		case InvokeName13EditPart.VISUAL_ID:
			return getInvokeName_5281Parser();
		case OpaqueActivityName13EditPart.VISUAL_ID:
			return getOpaqueActivityName_5282Parser();
		case PartnerActivityName13EditPart.VISUAL_ID:
			return getPartnerActivityName_5283Parser();
		case PickName13EditPart.VISUAL_ID:
			return getPickName_5284Parser();
		case ReceiveName13EditPart.VISUAL_ID:
			return getReceiveName_5285Parser();
		case RepeatUntilName12EditPart.VISUAL_ID:
			return getRepeatUntilName_5286Parser();
		case ReplyName13EditPart.VISUAL_ID:
			return getReplyName_5287Parser();
		case RethrowName13EditPart.VISUAL_ID:
			return getRethrowName_5288Parser();
		case ScopeName13EditPart.VISUAL_ID:
			return getScopeName_5289Parser();
		case SequenceName8EditPart.VISUAL_ID:
			return getSequenceName_5290Parser();
		case ThrowName13EditPart.VISUAL_ID:
			return getThrowName_5291Parser();
		case ValidateName13EditPart.VISUAL_ID:
			return getValidateName_5292Parser();
		case WaitName13EditPart.VISUAL_ID:
			return getWaitName_5293Parser();
		case WhileName13EditPart.VISUAL_ID:
			return getWhileName_5294Parser();
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
			return getParser(MappingVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MappingVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MappingElementTypes.getElement(hint) == null) {
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
