package control.diagram.util;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.mindswap.owl.OWLDataProperty;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.process.AnyOrder;
import org.mindswap.owls.process.AsProcess;
import org.mindswap.owls.process.AtomicProcess;
import org.mindswap.owls.process.Choice;
import org.mindswap.owls.process.CompositeProcess;
import org.mindswap.owls.process.ControlConstruct;
import org.mindswap.owls.process.ControlConstructVisitor;
import org.mindswap.owls.process.ForEach;
import org.mindswap.owls.process.IfThenElse;
import org.mindswap.owls.process.Perform;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.Produce;
import org.mindswap.owls.process.RepeatUntil;
import org.mindswap.owls.process.RepeatWhile;
import org.mindswap.owls.process.Sequence;
import org.mindswap.owls.process.Split;
import org.mindswap.owls.process.SplitJoin;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.variable.InputBinding;
import org.mindswap.owls.process.variable.OutputBinding;
import org.mindswap.owls.process.variable.ValueOf;
import org.mindswap.owls.service.Service;
import org.mindswap.owls.vocabulary.OWLS;

import control.AbstractProcess;
import control.ControlFactory;
import control.ControlPackage;
import control.Ontology;
import control.TemplateConstraint;
import control.ValueSpecifierElement;

public class OWLSTreeWalker implements ControlConstructVisitor {

	Map<Integer, FeatureDescription> childToParentFeatureMap = new HashMap<Integer, FeatureDescription>();
	Map<Integer, Integer> OWL2XMIFeatureMap = new HashMap<Integer, Integer>();
	Map<Integer, control.Parameter> paramOWLS2EcoreMap = new HashMap<Integer, control.Parameter>();
	Map<Integer, control.Result> outputBinding2ResultMap = new HashMap<Integer, control.Result>();

	List<control.Binding> bindingList = new LinkedList<control.Binding>();

	ControlFactory cf;
	control.OuterProcess model;

	// running totals of each type used for name suffixes
	private int ccListCount = 0;
	private int ccBagCount = 0;
	private int importedOntologyCount = 0;

	private final String slotType = "http://www.ist-alive.eu/ontologies/ALIVE-Template.owl#isSlot";
	private final String aspBindingsType = "http://www.ist-alive.eu/ontologies/ALIVE-Template.owl#aspBindings";
	private final String aspCodeType = "http://www.ist-alive.eu/ontologies/ALIVE-Template.owl#aspCode";

	public OWLSTreeWalker() {
		cf = ControlFactory.eINSTANCE;

		// root element of new XMI model
		model = cf.createOuterProcess();

	}

	public control.OuterProcess getOuterProcess() {
		if (!model.eIsSet(ControlPackage.Literals.OUTER_PROCESS__BINDINGS)) {
			model.eSet(ControlPackage.Literals.OUTER_PROCESS__BINDINGS,
					bindingList);
		}
		return model;
	}

	public List<control.Binding> getBindings() {

		if (!bindingList.isEmpty()) {
			return bindingList;
		} else {
			return null;
		}

	}

	/*
	 * Describes the (probably parent) EObject and the property on it that a
	 * child must itself to be
	 */
	public class FeatureDescription {
		public EObject targetEObject;
		public EStructuralFeature featureID;

		public FeatureDescription(EObject _targetEObject,
				EStructuralFeature _feature) {
			targetEObject = _targetEObject;
			featureID = _feature;
		}
	}

	private void printMessage(ControlConstruct _cc) {
		System.out.println("Visiting " + _cc.getLocalName() + " Hashcode: "
				+ _cc.hashCode());
	}

	public void visitChildren(ControlConstruct _cc) {
		for (ControlConstruct theConstruct : _cc.getConstructs()) {
			theConstruct.accept(this);
		}
	}

	public void visitNode(ControlConstruct _cc) {
		_cc.accept(this);
	}

	public void populateOuterProcess(Service s, CompositeProcess _cp,
			OWLOntology serviceOntology) {
		model.setServiceURI(s.getURI().toString());
		// get name from service profile
		model.setServiceName(s.getLocalName());
		model.setServiceDescription(s.getProfile().getTextDescription());
		model.setName(_cp.getLocalName());

		// process IOPR for outer process
		model.eSet(ControlPackage.Literals.OUTER_PROCESS__HAS_INPUT,
				makeControlInputs(_cp));
		model.eSet(ControlPackage.Literals.OUTER_PROCESS__HAS_OUTPUT,
				makeControlOutputs(_cp));
		model.eSet(ControlPackage.Literals.OUTER_PROCESS__HAS_RESULT,
				makeControlResults(_cp));

		// setup template constraints if present
		makeControlConstraint(s,_cp);

		// finally, setup target feature map for outerProcess.Contruct (i.e.
		// composedOf)
		System.out.println("Outer process composedOf hashcode: "
				+ _cp.getComposedOf().hashCode());
		childToParentFeatureMap.put(_cp.getComposedOf().hashCode(),
				new FeatureDescription(model,
						ControlPackage.Literals.OUTER_PROCESS__CONSTRUCT));

		java.util.Set<OWLOntology> allOntologies = serviceOntology
				.getImports(false);
		Service parentService = s;
		List<Ontology> importedOntologies = new LinkedList<Ontology>();
		for (OWLOntology anOntology : allOntologies) {

			System.out.println("KB Ontology: " + anOntology.getURI());
			Ontology newOntology = cf.createOntology();
			newOntology.setName("Ontology" + (++importedOntologyCount));
			newOntology.setOntologyURI(anOntology.getURI().toString());
			importedOntologies.add(newOntology);
		}

		if (!importedOntologies.isEmpty()) {
			model.eSet(ControlPackage.Literals.OUTER_PROCESS__ONTOLOGIES,
					importedOntologies);
		}

	}

	@Override
	public void visit(AnyOrder arg0) {
		printMessage(arg0);

		// instantiate new control EObject and copy features
		// from OWL-S object
		control.AnyOrder newAnyOrder = cf.createAnyOrder();

		if (arg0.getLocalName() != null) {
			newAnyOrder.setName(arg0.getLocalName());
		} else {
			newAnyOrder.setName("AnyOrder_" + arg0.hashCode());
		}

		// get parent feature description and set to new EObject
		FeatureDescription targetFeature = childToParentFeatureMap.get(arg0
				.hashCode());
		targetFeature.targetEObject.eSet(targetFeature.featureID, newAnyOrder);

		newAnyOrder.setComponents(makeConstructBags(arg0));

		visitChildren(arg0);
	}

	@Override
	public void visit(AsProcess arg0) {
		// TODO Auto-generated method stub
		printMessage(arg0);
		visitChildren(arg0);

	}

	@Override
	public void visit(Choice arg0) {
		printMessage(arg0);
		// instantiate new control EObject and copy features
		// from OWL-S object
		control.Choice newChoice = cf.createChoice();

		if (arg0.getLocalName() != null) {
			newChoice.setName(arg0.getLocalName());
		} else {
			newChoice.setName("Choice_" + arg0.hashCode());
		}

		// get parent feature description and set to new EObject
		FeatureDescription targetFeature = childToParentFeatureMap.get(arg0
				.hashCode());
		targetFeature.targetEObject.eSet(targetFeature.featureID, newChoice);

		newChoice.setComponents(makeConstructBags(arg0));

		visitChildren(arg0);
	}

	@Override
	public void visit(ForEach arg0) {
		// TODO Auto-generated method stub
		printMessage(arg0);
		visitChildren(arg0);

	}

	@Override
	public void visit(IfThenElse arg0) {
		printMessage(arg0);

		// instantiate new control EObject and copy features
		// from OWL-S object
		control.IfThenElse newIfThenElse = cf.createIfThenElse();
		if (arg0.getLocalName() != null) {
			newIfThenElse.setName(arg0.getLocalName());
		} else {
			newIfThenElse.setName("IfThenElse_" + arg0.hashCode());
		}

		// get parent feature description and set to new EObject
		FeatureDescription targetFeature = childToParentFeatureMap.get(arg0
				.hashCode());
		// System.out.println("Target object: " +
		// targetFeature.targetEObject.toString());
		// System.out.println("Target feature: " + targetFeature.featureID);
		targetFeature.targetEObject
				.eSet(targetFeature.featureID, newIfThenElse);

		// set target feature description for children and visit them
		if (arg0.getThen() != null) {
			childToParentFeatureMap.put(arg0.getThen().hashCode(),
					new FeatureDescription(newIfThenElse,
							ControlPackage.Literals.IF_THEN_ELSE__THEN));
			visitNode(arg0.getThen());
		}

		if (arg0.getElse() != null) {
			childToParentFeatureMap.put(arg0.getElse().hashCode(),
					new FeatureDescription(newIfThenElse,
							ControlPackage.Literals.IF_THEN_ELSE__ELSE));
			visitNode(arg0.getElse());
		}

	}

	@Override
	public void visit(Perform arg0) {
		printMessage(arg0);

		control.Perform newPerform = cf.createPerform();
		if (arg0.getLocalName() != null) {
			newPerform.setName(arg0.getLocalName());
		} else {
			newPerform.setName("Perform_" + arg0.hashCode());
		}

		// get parent (i.e. target) feature description and set to new EObject
		FeatureDescription targetFeature = childToParentFeatureMap.get(arg0
				.hashCode());
		System.out.println("Target object: "
				+ targetFeature.targetEObject.toString());
		System.out.println("Target feature: " + targetFeature.featureID);
		targetFeature.targetEObject.eSet(targetFeature.featureID, newPerform);

		System.out.println("Perform now contained by: "
				+ newPerform.eContainingFeature().toString());

		// child of perform is not a ControlConstruct
		// handle real / slot process directly (not by visit).
		// exit if no process is set
		if (arg0.getProcess() == null) {
			return;
		}

		Process owlProcess = arg0.getProcess();
		AbstractProcess newProcess = null;
		// is this a template process? Check if ALIVE-Template:isSlot is a
		// value.
		OWLDataProperty slotProperty = owlProcess.getKB().getDataProperty(
				URI.create(slotType));
		System.out.println("Slot property: " + slotProperty.toPrettyString());
		newProcess = cf.createTemplateProcess();

		if (owlProcess.hasProperty(slotProperty)
				&& owlProcess.getProperty(slotProperty) != null) {
			// this is a slot process (property won't be set without a value)
			String slotName = owlProcess.getProperty(slotProperty).toString();
			control.TemplateProcess newTemplateProcess = cf
					.createTemplateProcess();
			if (owlProcess.getLocalName() != null) {
				newTemplateProcess.setName(owlProcess.getLocalName());
			} else {
				newTemplateProcess.setName("TemplateProcess_"
						+ owlProcess.hashCode());
			}
			newTemplateProcess.setSlotName(slotName);
			newProcess = newTemplateProcess;
		} else {
			// this is a real remote process
			control.RemoteProcess newRemoteProcess = cf.createRemoteProcess();
			if (owlProcess.getLocalName() != null) {
				newRemoteProcess.setName(owlProcess.getLocalName());
			} else {
				newRemoteProcess.setName("RemoteProcess_"
						+ owlProcess.hashCode());
			}

			newRemoteProcess.setRemoteURI(owlProcess.getURI().toString());
			// process preconditions and results only for remote processes, not
			// slot dummy processes
			List<control.Result> newResults = makeControlResults(owlProcess);
			if (!newResults.isEmpty()) {
				newProcess.eSet(
						ControlPackage.Literals.REMOTE_PROCESS__HAS_RESULT,
						newResults);
			}
			newProcess = newRemoteProcess;
		}

		// process inputs and outputs for both process types
		List<control.Input> newInputs = makeControlInputs(owlProcess);
		if (!newInputs.isEmpty()) {
			newProcess.eSet(
					ControlPackage.Literals.ABSTRACT_PROCESS__HAS_INPUT,
					newInputs);
		}

		// for(Input anInput : owlProcess.getInputs()) {
		// InputBinding aBinding = arg0.getBindingFor(anInput);
		// if(aBinding!=null) {
		// System.out.println("Input: " + anInput.getLocalName() +
		// "has no input binding");
		// } else {
		// System.out.println("Input: " + anInput.getLocalName() +
		// "has input binding to: " + aBinding.getProcessVar().toString());
		//
		// }
		//			
		//			
		//			
		// }

		List<control.Output> newOutputs = makeControlOutputs(owlProcess);
		if (!newOutputs.isEmpty()) {
			newProcess.eSet(
					ControlPackage.Literals.ABSTRACT_PROCESS__HAS_OUTPUT,
					newOutputs);
		}

		newPerform.setTheProcess(newProcess);

	}

	@Override
	public void visit(Produce arg0) {
		// TODO Auto-generated method stub
		printMessage(arg0);
		visitChildren(arg0);

	}

	@Override
	public void visit(RepeatUntil arg0) {
		// TODO Auto-generated method stub
		printMessage(arg0);
		visitChildren(arg0);

	}

	@Override
	public void visit(RepeatWhile arg0) {
		// TODO Auto-generated method stub
		printMessage(arg0);
		visitChildren(arg0);

	}

	@Override
	public void visit(Sequence arg0) {
		control.Sequence newSequence = cf.createSequence();
		newSequence.setName(arg0.getLocalName());

		System.out.println("Sequence hashcode: " + arg0.hashCode());

		// get parent (i.e. target) feature description and set to new EObject
		FeatureDescription targetFeature = childToParentFeatureMap.get(arg0
				.hashCode());
		targetFeature.targetEObject.eSet(targetFeature.featureID, newSequence);

		newSequence.setComponents(makeConstructLists(arg0));

		printMessage(arg0);
		visitChildren(arg0);
	}

	@Override
	public void visit(org.mindswap.owls.process.Set arg0) {
		// TODO Auto-generated method stub
		printMessage(arg0);
		visitChildren(arg0);

	}

	@Override
	public void visit(Split arg0) {
		printMessage(arg0);
		control.Split newSplit = cf.createSplit();

		if (arg0.getLocalName() != null) {
			newSplit.setName(arg0.getLocalName());
		} else {
			newSplit.setName("Split_" + arg0.hashCode());
		}

		// get parent (i.e. target) feature description and set to new EObject
		FeatureDescription targetFeature = childToParentFeatureMap.get(arg0
				.hashCode());
		targetFeature.targetEObject.eSet(targetFeature.featureID, newSplit);

		newSplit.setComponents(makeConstructBags(arg0));

		visitChildren(arg0);
	}

	@Override
	public void visit(SplitJoin arg0) {
		printMessage(arg0);
		control.SplitJoin newSplitJoin = cf.createSplitJoin();
		if (arg0.getLocalName() != null) {
			newSplitJoin.setName(arg0.getLocalName());
		} else {
			newSplitJoin.setName("SplitJoin_" + arg0.hashCode());
		}

		// get parent (i.e. target) feature description and set to new EObject
		FeatureDescription targetFeature = childToParentFeatureMap.get(arg0
				.hashCode());
		targetFeature.targetEObject.eSet(targetFeature.featureID, newSplitJoin);

		newSplitJoin.setComponents(makeConstructBags(arg0));

		visitChildren(arg0);

	}

	private control.ControlConstructBag makeConstructBags(ControlConstruct arg0) {
		int childCount = arg0.getConstructs().size();
		List<ControlConstruct> owlCCList = arg0.getConstructs();
		List<control.ControlConstructBag> ccbList = new ArrayList<control.ControlConstructBag>();
		// make a control construct list for each construct
		for (int i = 0; i < childCount; i++) {
			control.ControlConstructBag newBag = cf.createControlConstructBag();
			newBag.setName("ccBag" + (++ccBagCount));
			ccbList.add(i, newBag);

			childToParentFeatureMap
					.put(
							owlCCList.get(i).hashCode(),
							new FeatureDescription(
									newBag,
									ControlPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST));
			System.out.println("Added owl cc: "
					+ owlCCList.get(i).getLocalName() + " hash: "
					+ owlCCList.get(i).hashCode());

			System.out.println("Made new control construct bag: "
					+ newBag.hashCode());
			if (i > 0) {
				ccbList.get(i - 1).setRest(newBag);
			}
		}
		return ccbList.isEmpty() ? null : ccbList.get(0);
	}

	private control.ControlConstructList makeConstructLists(
			ControlConstruct arg0) {
		int childCount = arg0.getConstructs().size();
		List<ControlConstruct> owlCCList = arg0.getConstructs();
		List<control.ControlConstructList> cclList = new ArrayList<control.ControlConstructList>();
		// make a control construct list for each construct
		for (int i = 0; i < childCount; i++) {
			control.ControlConstructList newList = cf
					.createControlConstructList();
			// name the lists with class field count in order of finding them
			newList.setName("ccList" + (++ccListCount));
			cclList.add(i, newList);

			childToParentFeatureMap
					.put(
							owlCCList.get(i).hashCode(),
							new FeatureDescription(
									newList,
									ControlPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST));
			System.out.println("Added owl cc: "
					+ owlCCList.get(i).getLocalName() + " hash: "
					+ owlCCList.get(i).hashCode());

			System.out.println("Made new control construct bag: "
					+ newList.hashCode());
			if (i > 0) {
				cclList.get(i - 1).setRest(newList);
			}
		}
		return cclList.isEmpty() ? null : cclList.get(0);
	}

	private List<control.Input> makeControlInputs(Process owlProcess) {
		List<control.Input> newInputs = new LinkedList<control.Input>();
		for (Input anInput : owlProcess.getInputs()) {
			control.Input newInput = cf.createInput();
			if (anInput.getLocalName() != null) {
				newInput.setName(anInput.getLocalName());
			} else {
				newInput.setName("Input: " + anInput.hashCode());
			}

			if (anInput.getParamType() != null) {
				newInput.setParameterType(anInput.getParamType().getURI()
						.toString());
			}

			if (anInput.getConstantValue() != null) {
				newInput.setParameterValue(anInput.getConstantValue()
						.toString());
			}
			newInputs.add(newInput);
			System.out.println("Added input: " + newInput.getName() + ":"
					+ anInput.hashCode());

			// store in map so we can find this control.Param to make bindings
			// later
			paramOWLS2EcoreMap.put(anInput.hashCode(), newInput);
		}
		return newInputs;
	}

	private List<control.Output> makeControlOutputs(Process owlProcess) {
		List<control.Output> newOutputs = new LinkedList<control.Output>();
		for (org.mindswap.owls.process.variable.Output anOutput : owlProcess
				.getOutputs()) {
			control.Output newOutput = cf.createOutput();
			if (anOutput.getLocalName() != null) {
				newOutput.setName(anOutput.getLocalName());
			} else {
				newOutput.setName("Output_" + anOutput.hashCode());
			}

			if (anOutput.getParamType() != null) {
				newOutput.setParameterType(anOutput.getParamType().getURI()
						.toString());
			}

			if (anOutput.getConstantValue() != null) {
				newOutput.setParameterValue(anOutput.getConstantValue()
						.toString());
			}
			newOutputs.add(newOutput);
			// store in map so we can find this control.Param to make bindings
			// later
			paramOWLS2EcoreMap.put(anOutput.hashCode(), newOutput);
		}
		return newOutputs;
	}

	private List<control.Result> makeControlResults(Process owlProcess) {
		List<control.Result> newResults = new LinkedList<control.Result>();
		for (org.mindswap.owls.process.Result aResult : owlProcess.getResults()) {
			control.Result newResult = cf.createResult();

			if (aResult.getLocalName() != null) {
				newResult.setName(aResult.getLocalName());
			} else {
				newResult.setName("Result_" + aResult.hashCode());
			}

			if (aResult.getEffect() != null) {

				control.Expr resultEffect = cf.createExpr();

				if (aResult.getEffect().getLocalName() != null) {
					resultEffect.setName(aResult.getEffect().getLocalName());
				} else {
					resultEffect.setName(newResult.getName() + "_effect");
				}

				resultEffect.setBodyLiteral(aResult.getEffect().getBody()
						.toString());

				// FIXME need map between possible string values and
				// control.ExpressionLanguage enum
				aResult.getEffect().getLanguage().toString();

				newResult.setHasEffect(resultEffect);
			}

			if (aResult.getResultVar() != null) {
				org.mindswap.owls.process.variable.ResultVar owlResultVar = aResult
						.getResultVar();
				control.ResultVar newResultVar = cf.createResultVar();
				if (owlResultVar.getLocalName() != null) {
					newResultVar.setName(owlResultVar.getLocalName());
				} else {
					newResultVar.setName(newResult.getName() + "_resultVar");
				}

				if (owlResultVar.getParamType() != null) {
					newResultVar.setParameterType(owlResultVar.getParamType()
							.toString());
				}

				if (owlResultVar.getConstantValue() != null) {
					newResultVar.setParameterValue(owlResultVar
							.getConstantValue().toString());
				}
			}

			// deal with outputBindings - put in map so we can associate the
			// outputBinding with a result
			for (OutputBinding aBinding : aResult.getBindings()) {
				outputBinding2ResultMap.put(aBinding.hashCode(), newResult);
			}

			newResults.add(newResult);
		}
		return newResults;
	}

	private void makeControlConstraint(Service parentService,Process owlProcess) {

		OWLDataProperty aspBindingProperty = owlProcess.getKB()
				.getDataProperty(URI.create(aspBindingsType));
		OWLDataProperty aspCodeProperty = owlProcess.getKB().getDataProperty(
				URI.create(aspCodeType));
		if (parentService.hasProperty(aspBindingProperty)
				&& parentService.hasProperty(aspCodeProperty)) {
			String aspBindingLiteral = parentService.getProperty(
					aspBindingProperty).toString();
			String aspCodeLiteral = parentService.getProperty(aspCodeProperty)
					.toString();

			TemplateConstraint newConstraint = cf.createTemplateConstraint();
			newConstraint.setName("Template constraint");
			newConstraint
					.setAspBinding(aspBindingLiteral != null ? aspBindingLiteral
							: "null");
			newConstraint.setAspCode(aspCodeLiteral != null ? aspCodeLiteral
					: "null");
			if (aspBindingLiteral != null | aspCodeLiteral != null) {
				model.setTemplateConstraints(newConstraint);
			}
		}

	}

	public void makeInputBinding(InputBinding _theBinding) {

		Input anInput = _theBinding.getProcessVar();
		Process owlProcess = anInput.getProcess();

		control.InputBinding newInputBinding = null;

		try {
			if (owlProcess.getPerform() != null
					&& owlProcess.getPerform().getBindingFor(anInput) != null) {
				InputBinding anInputBinding = owlProcess.getPerform()
						.getBindingFor(anInput);
				System.out.println("Binding on input: "
						+ anInputBinding.toString());
				OWLIndividual valueSourceInd = anInputBinding
						.getProperty(OWLS.Process.valueSource);
				ValueOf sourceValueOf = valueSourceInd.castTo(ValueOf.class);
				System.out.println("Value source type: "
						+ valueSourceInd.getType().toPrettyString());
				System.out.println("Value source param: "
						+ sourceValueOf.getParameter().getLocalName() + ":"
						+ sourceValueOf.getParameter().hashCode()
						+ " from perform: "
						+ sourceValueOf.getPerform().getLocalName());

				control.Parameter sourceParam = paramOWLS2EcoreMap
						.get(sourceValueOf.getParameter().hashCode());
				control.Input processVar = (control.Input) paramOWLS2EcoreMap
						.get(anInput.hashCode());
				newInputBinding = cf.createInputBinding();
				newInputBinding.setToParam(processVar);
				newInputBinding.setValueSource(sourceParam);

			}
		} catch (RuntimeException e) {
			System.out.println("Failed to make binding on "
					+ anInput.getLocalName());
			e.printStackTrace();
			throw e;

		}

		if (newInputBinding != null) {
			System.out.println("Added new input binding on "
					+ anInput.getLocalName());
			bindingList.add(newInputBinding);
		} else {
			System.out.println("Failed to make input binding on "
					+ anInput.getLocalName());
		}
	}

	public void makeOutputBinding(OutputBinding _theBinding) {
		control.OutputBinding newBinding = cf.createOutputBinding();
		control.outputBindingSource newBindingSource = cf
				.createoutputBindingSource();

		// get control.Result for this outputBinding
		control.Result targetResult = outputBinding2ResultMap.get(_theBinding
				.hashCode());
		System.out.println("Output binding belongs to result: "
				+ targetResult.getName());
		System.out.println("Output binding has process var: "
				+ _theBinding.getProcessVar().getLocalName());

		// get ValueSource for the binding
		OWLIndividual valueSourceInd = _theBinding
				.getProperty(OWLS.Process.valueSource);
		ValueOf sourceValueOf = valueSourceInd.castTo(ValueOf.class);
		System.out.println("Value source type: "
				+ valueSourceInd.getType().toPrettyString());
		System.out.println("Value source param: "
				+ sourceValueOf.getParameter().getLocalName() + ":"
				+ sourceValueOf.getParameter().hashCode() + " from perform: "
				+ sourceValueOf.getPerform().getLocalName());

		control.Parameter sourceParam = paramOWLS2EcoreMap.get(sourceValueOf
				.getParameter().hashCode());

		// first make valueSource in Result containing outputBinding
		control.ValueSource newVS = cf.createValueSource();
		targetResult.getBindingSource().add(newVS);
		System.out.println("Binding source list: "
				+ targetResult.getBindingSource().toString());

		// then make outputBindingSource from result to processVar
		control.outputBindingSource newOBS = cf.createoutputBindingSource();
		newOBS.setSource(sourceParam);
		newOBS.setSpecifierElement(newVS);

		// then finally make an output binding proper from the valueSource to
		// the output
		control.OutputBinding newOB = cf.createOutputBinding();
		newOB.setOrigin(newVS);
		newOB.setToParam((control.Output) paramOWLS2EcoreMap.get(_theBinding
				.getProcessVar().hashCode()));

		bindingList.add(newOB);
		bindingList.add(newOBS);

	}
}
