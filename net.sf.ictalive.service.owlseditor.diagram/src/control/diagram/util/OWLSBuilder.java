package control.diagram.util;


import impl.owl.OWLIndividualListImpl;
import impl.owls.process.constructs.SetImpl;

import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.internal.util.Log;
import org.mindswap.owl.OWLDataProperty;
import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.OWLType;
import org.mindswap.owl.vocabulary.RDF;
import org.mindswap.owl.vocabulary.XSD;
import org.mindswap.owls.expression.Condition;
import org.mindswap.owls.process.AtomicProcess;
import org.mindswap.owls.process.CompositeProcess;
import org.mindswap.owls.process.Perform;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.Produce;
import org.mindswap.owls.process.Result;
import org.mindswap.owls.process.Sequence;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.variable.Link;
import org.mindswap.owls.process.variable.LinkBinding;
import org.mindswap.owls.process.variable.Loc;
import org.mindswap.owls.process.variable.LocBinding;
import org.mindswap.owls.process.variable.Output;
import org.mindswap.owls.process.variable.OutputBinding;
import org.mindswap.owls.process.variable.Parameter;
import org.mindswap.owls.process.variable.ValueOf;
import org.mindswap.owls.profile.Profile;
import org.mindswap.owls.service.Service;
import org.mindswap.owls.validator.OWLSValidator;
import org.mindswap.owls.validator.ValidationException;
import org.mindswap.owls.validator.ValidationMessage;
import org.mindswap.owls.validator.ValidationReport;
import org.mindswap.owls.vocabulary.OWLS;
import org.mindswap.utils.URIUtils;

import net.sf.ictalive.service.serviceui.*;

import control.ControlPackage;
import control.util.ControlSwitch;

/**
 * @generated NOT
 */

public class OWLSBuilder extends ControlSwitch<Object> {
	OWLKnowledgeBase serviceKB;
	OWLOntology serviceOntology;
	Map<Integer, OWLIndividual> ontologyMap;
	Map<Integer, Integer> paramToPerformMap, specifierToSourceMap;
	Map<EObject, String> objectToErrorMessageMap;
	Service createdService;
	URI baseURI;
	private final int THIS_PERFORM_HASH = -1;
	private final String aspURIString = "http://www.ist-alive.eu/ontologies/ALIVE-Template.owl";
	private final String slotType = "http://www.ist-alive.eu/ontologies/ALIVE-Template.owl#isSlot";
	private final String aspBindingsType = "http://www.ist-alive.eu/ontologies/ALIVE-Template.owl#aspBindings";
	private final String aspCodeType = "http://www.ist-alive.eu/ontologies/ALIVE-Template.owl#aspCode";
	private final String objectListURIString = "http://www.daml.org/services/owl-s/1.2/generic/ObjectList.owl";


	public OWLSBuilder() {
		super();
		System.err.println("In constructor");

	}

	private URI makeURI(String localName) {
		return URIUtils.createURI(baseURI, localName);
	}

	private OWLType createType(String typeName) {
		URI typeURI = URIUtils.createURI(typeName);
		return serviceOntology.createDataType(typeURI);
	}


	public boolean initialiseService(String _uri)  {
		serviceKB = OWLFactory.createKB();
		ontologyMap = new HashMap<Integer, OWLIndividual>();
		paramToPerformMap = new HashMap<Integer, Integer>();
		specifierToSourceMap = new HashMap<Integer, Integer>();
		objectToErrorMessageMap = new HashMap<EObject, String>();



		try {
			baseURI = new URI(_uri);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			//objectToErrorMessageMap.put(_process, " - Invalid base uri" + aspURI.toString());

			e.printStackTrace();
			return false;
		}

		return true;

	}
	public void processOWLSModel(control.OuterProcess _process) {

		baseURI = URIUtils.createURI(_process.getServiceURI());

		serviceOntology = serviceKB.createOntology(URIUtils.standardURI(baseURI));
		createdService = serviceOntology.createService(makeURI(_process.getServiceName()));
		
		
		Profile newProfile = serviceOntology.createProfile(makeURI(_process.getServiceName() + "_profile"));

		
		
		newProfile.setTextDescription(_process.getServiceDescription());

		OWLOntology objectListOntology = null;
		try {
			objectListOntology = serviceKB.read(new URI(objectListURIString));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} catch (Exception e2) {
			e2.printStackTrace(System.err);
			objectToErrorMessageMap.put(_process, " - couldn't read objectList ontology at " + objectListURIString);
			return;
		}
		
		if(objectListOntology!=null) {
		serviceOntology.addImport(objectListOntology);
		}
		
		
		// do all ontology imports - hardcoded and in diagram
		List<String> ontologyURIStrings = new LinkedList<String>();
		ontologyURIStrings.add(aspURIString);
//		ontologyURIStrings.add(objectListURIString);
		for(control.Ontology _ontology : _process.getOntologies()) {
			if(_ontology.eIsSet(ControlPackage.Literals.ONTOLOGY__ONTOLOGY_URI) && _ontology.getOntologyURI().length()>0) {
				ontologyURIStrings.add(_ontology.getOntologyURI());
			}
		}
		String ontologyImportError = addImportedOntologies(ontologyURIStrings);
		// returns null if successful, otherwise error message
		// (having stopped at first error)
		if(ontologyImportError!=null) {
			objectToErrorMessageMap.put(_process, ontologyImportError);
			return;
		}
		
		
		org.mindswap.owls.process.CompositeProcess outercp = serviceOntology.createCompositeProcess(makeURI(_process.getName()));


		
		
		// set service level aspCode and aspBindings properties, if present in the model
		if(_process.eIsSet(ControlPackage.Literals.OUTER_PROCESS__TEMPLATE_CONSTRAINTS)) {
			control.TemplateConstraint constraint = _process.getTemplateConstraints();
			
			// add (unset) properties on Service for templates
			addOWLProperty(createdService, URIUtils.createURI(aspBindingsType));
			addOWLProperty(createdService, URIUtils.createURI(aspCodeType));
			
			createdService.setProperty(serviceKB.getDataProperty(URIUtils.createURI(aspBindingsType)), constraint.getAspBinding());
			createdService.setProperty(serviceKB.getDataProperty(URIUtils.createURI(aspCodeType)), constraint.getAspCode());

		}





		// visit inputs

		for(control.Input _input:_process.getHasInput()) {
			org.mindswap.owls.process.variable.Input owlInput = caseInput(_input);
			outercp.addInput(owlInput);
			newProfile.addInput(owlInput);
			paramToPerformMap.put(_input.hashCode(), THIS_PERFORM_HASH);
		}

		//visit outputs
		for(control.Output _output : _process.getHasOutput()) {
			org.mindswap.owls.process.variable.Output owlOutput = caseOutput(_output);
			outercp.addOutput(owlOutput);
			newProfile.addOutput(owlOutput);
			paramToPerformMap.put(_output.hashCode(), THIS_PERFORM_HASH);

		}

		//setup preconditions
		// TODO when we've figured out how to make expressions
		for(control.Expr theExpr : _process.getHasPrecondition()) {
			outercp.addCondition((Condition<?>) doSwitch(theExpr));
		}

		//visit results
		for(control.Result theResult : _process.getHasResult()) {
			outercp.addResult((Result) doSwitch(theResult));
		}


		for(control.Loc _loc : _process.getOuterLocals()) {
			org.mindswap.owls.process.variable.Local theLoc = (org.mindswap.owls.process.variable.Loc)doSwitch(_loc);
			outercp.addLocal(theLoc);

		}

		for(control.Link _link : _process.getOuterLinks()) {
			// TODO see Loc above
			org.mindswap.owls.process.variable.Local theLink = (org.mindswap.owls.process.variable.Link)doSwitch(_link);
			outercp.addLocal(theLink);
		}


		// visit composedOf
		control.ControlConstruct _construct = _process.getConstruct();
		//System.out.println("Control construct is" + _construct.eClass());


		Object owlsConstruct = doSwitch(_construct);
		outercp.setComposedOf((org.mindswap.owls.process.ControlConstruct)owlsConstruct);

		// need to process BindingSource bindings first, before the actual bindings
		// but they are mixed together in _process.getBindings()
		// for now, let's process it twice, first to handle the BindingSources
		// then again for the actual bindings
		for(control.Binding _binding : _process.getBindings()) {
			if(_binding.eClass() == ControlPackage.Literals.OUTPUT_BINDING_SOURCE) {
				doSwitch(_binding);
			}
			// else noop for actual bindings
		}

		//finally, once everything is built, we can visit the all the actual bindings
		for(control.Binding _binding : _process.getBindings()) {
			// i.e. everything we haven't already processed on the first pass
			if(_binding.eClass() != ControlPackage.Literals.OUTPUT_BINDING_SOURCE) {
				doSwitch(_binding);
			}
			// else noop for output binding source (already processed)
		}
		
		//System.out.println("Outer process bindings reported as : "+ outercp.getAllBindings().toString());

		// add profile to service
		createdService.addProfile(newProfile);
		createdService.setProcess(outercp);
		// and set name. Can't do until profile is set
		createdService.setName(_process.getServiceName());

		//add properties for Adan

		//System.out.println("OWLS Builder - reached end of processResource");
		//	writeOutput(System.err);

	}

	private String addImportedOntologies(List<String> ontologyURIStrings) {
		for(String ontologyURIString: ontologyURIStrings) {
			OWLOntology newOntology = null;
			try {
				URI newURI = URIUtils.createURI(ontologyURIString);
				newOntology = Activator.getDefault().loadOntologyFromURI(newURI);
			} catch (RuntimeException e2) {
				e2.printStackTrace(System.err);
				return " - couldn't read ontology at " + ontologyURIString;
			}
			if(newOntology==null) {
				return "Ontology load returned null for: " + ontologyURIString;
			}
			serviceOntology.addImport(newOntology);
		}
		return null;
	}

	public org.mindswap.owls.process.variable.Input caseInput(control.Input theInput) {

		org.mindswap.owls.process.variable.Input newInput = serviceOntology.createInput(makeURI(getNameSafely(theInput)));
		ontologyMap.put(theInput.hashCode(), newInput);

		newInput.setLabel(getNameSafely(theInput), "EN");
		//System.out.println("Added input - hash = " + theInput.hashCode() + " name = "+ theInput.getName());

		OWLType owlParamType = null;

		if(theInput.eIsSet(ControlPackage.Literals.PROCESS_VAR__PARAMETER_TYPE)) {
			owlParamType = createType(theInput.getParameterType());
			newInput.setParamType(owlParamType);
		}

		if(theInput.eIsSet(ControlPackage.Literals.PROCESS_VAR__PARAMETER_VALUE) && !theInput.getParameterValue().isEmpty()) {
			if(owlParamType==null) {
				String errorMessage = new String(" - has parameter value but no parameter type");
				objectToErrorMessageMap.put(theInput, errorMessage);
				return null;
			}
			
			OWLDataValue constValue = serviceOntology.createDataValue(theInput.getParameterValue(),RDF.XMLLiteral);
			newInput.setConstantValue(constValue);
		}
		return newInput;
	}

	public OWLIndividual caseResult(control.Result _result) {
		org.mindswap.owls.process.Result owlResult = serviceOntology.createResult(makeURI(getNameSafely(_result)));
		ontologyMap.put(_result.hashCode(), owlResult);


		// cardinality of inCondition is 0...*
		//	if(_result.eIsSet(ControlPackage.Literals.RESULT__IN_CONDITION)) {
		//	for(control.Expr anExpression : _result.getInCondition()) {
		//	owlResult.addCondition((org.mindswap.owls.expression.Expr<Object>) anExpression);
		//		org.mindswap.owls.expression.Expression.SWRL expression = new impl.owls.expression.ExpressionImpl(null);
		//}	
		//}

		return owlResult;
	}

	// control flow control constructs (i.e. not CCBag / List, Perform, Process

	public OWLIndividual caseSequence(control.Sequence _sequence) {

		org.mindswap.owls.process.Sequence returnSequence = serviceOntology.createSequence(makeURI(getNameSafely(_sequence)));
		//System.out.println("Calling specific Sequence");

		control.ControlConstructList _cclist = _sequence.getComponents();
		OWLIndividualList<org.mindswap.owls.process.ControlConstruct> owlCCList = (OWLIndividualList<org.mindswap.owls.process.ControlConstruct>)doSwitch(_cclist);

		// add components from return
		for(org.mindswap.owls.process.ControlConstruct newOWLCC : owlCCList) {
			returnSequence.addComponent(newOWLCC);
		}

		return returnSequence;
	}

	public OWLIndividual caseSplit (control.Split _split) {
		// see caseSequence - split is equivalent (except contains a CCBag rather than CCList)
		org.mindswap.owls.process.Split owlSplit = serviceOntology.createSplit(makeURI(getNameSafely(_split)));

		control.ControlConstructBag _ccBag = _split.getComponents();
		OWLIndividualList<org.mindswap.owls.process.ControlConstruct> owlCCBag = (OWLIndividualList<org.mindswap.owls.process.ControlConstruct>)doSwitch(_ccBag);

		// add components from return
		for(org.mindswap.owls.process.ControlConstruct newOWLCC : owlCCBag) {
			owlSplit.addComponent(newOWLCC);
		}

		return owlSplit;
	}

	public OWLIndividual caseSplitJoin (control.SplitJoin _splitJoin) {
		//exactly as caseSplit
		org.mindswap.owls.process.SplitJoin owlSplitJoin = serviceOntology.createSplitJoin(makeURI(getNameSafely(_splitJoin)));

		control.ControlConstructBag _ccBag = _splitJoin.getComponents();
		OWLIndividualList<org.mindswap.owls.process.ControlConstruct> owlCCBag = (OWLIndividualList<org.mindswap.owls.process.ControlConstruct>)doSwitch(_ccBag);

		// add components from return
		for(org.mindswap.owls.process.ControlConstruct newOWLCC : owlCCBag) {
			owlSplitJoin.addComponent(newOWLCC);
		}

		return owlSplitJoin;


	}

	public OWLIndividual caseChoice (control.Choice _choice) {
		// exactly as per Sequence
		org.mindswap.owls.process.Choice returnChoice = serviceOntology.createChoice(makeURI(getNameSafely(_choice)));
		//System.out.println("Calling specific Choice");


		control.ControlConstructBag _ccbag = _choice.getComponents();
		OWLIndividualList<org.mindswap.owls.process.ControlConstruct> owlCCBag = (OWLIndividualList<org.mindswap.owls.process.ControlConstruct>)doSwitch(_ccbag);

		// add components from return
		for(org.mindswap.owls.process.ControlConstruct newOWLCC : owlCCBag) {

			returnChoice.addComponent(newOWLCC);
		}

		return returnChoice;
	}

	public OWLIndividual caseAnyOrder (control.AnyOrder _anyOrder) {
		// see caseSequence

		org.mindswap.owls.process.AnyOrder owlAnyOrder = serviceOntology.createAnyOrder(makeURI(getNameSafely(_anyOrder)));

		control.ControlConstructBag _ccbag = _anyOrder.getComponents();
		OWLIndividualList<org.mindswap.owls.process.ControlConstruct> owlCCBag = (OWLIndividualList<org.mindswap.owls.process.ControlConstruct>)doSwitch(_ccbag);

		// add components from return
		for(org.mindswap.owls.process.ControlConstruct newOWLCC : owlCCBag) {
			owlAnyOrder.addComponent(newOWLCC);
		}

		return owlAnyOrder;
	}

	// conditional control constructs next. We don't have the OWL-S abstract class Iterate in the metamodel
	// so some duplication here

	public OWLIndividual caseIfThenElse (control.IfThenElse _ifThenElse) {

		org.mindswap.owls.process.IfThenElse owlIfThenElse = serviceOntology.createIfThenElse(makeURI(getNameSafely(_ifThenElse)));

		// FIXME - we need to do something about conditions.
		// most likely for now we should assume they are SWRL statements, and build them 
		// by inspecting the Control.Expression / Control.Condition
		//owlIfThenElse.setCondition((org.mindswap.owls.expression.Condition<Object>) _ifThenElse.getIfCondition());

		//THEN branch must be set
		control.ControlConstruct _thenConstruct = _ifThenElse.getThen();
		owlIfThenElse.setThen((org.mindswap.owls.process.ControlConstruct)doSwitch(_thenConstruct));

		//ELSE branch could be null
		if(_ifThenElse.eIsSet(ControlPackage.Literals.IF_THEN_ELSE__ELSE)) {
			control.ControlConstruct _elseConstruct = _ifThenElse.getElse();
			owlIfThenElse.setElse((org.mindswap.owls.process.ControlConstruct)doSwitch(_elseConstruct));
		}

		return owlIfThenElse;
	}

	public OWLIndividual caseRepeatUntil (control.RepeatUntil _repeatUntil) {
		// see caseIfThenElse. Same applies here for condition.

		org.mindswap.owls.process.RepeatUntil owlRepeatUntil = serviceOntology.createRepeatUntil(makeURI(getNameSafely(_repeatUntil)));

		owlRepeatUntil.setCondition((org.mindswap.owls.expression.Condition<Object>)_repeatUntil.getUntilCondition());

		control.ControlConstruct _untilConstruct = _repeatUntil.getUntilProcess();
		owlRepeatUntil.setComponent((org.mindswap.owls.process.ControlConstruct)doSwitch(_untilConstruct));

		return owlRepeatUntil;
	}

	public OWLIndividual caseRepeatWhile (control.RepeatWhile _repeatWhile) {
		// see caseIfThenElse. Same applies here for condition.

		org.mindswap.owls.process.RepeatWhile owlRepeatWhile = serviceOntology.createRepeatWhile(makeURI(getNameSafely(_repeatWhile)));

		owlRepeatWhile.setCondition((org.mindswap.owls.expression.Condition<Object>)_repeatWhile.getWhileCondition());

		control.ControlConstruct _whileConstruct = _repeatWhile.getWhileProcess();
		owlRepeatWhile.setComponent((org.mindswap.owls.process.ControlConstruct)doSwitch(_whileConstruct));

		return owlRepeatWhile;
	}

	public OWLIndividualList<OWLIndividual> caseControlConstructList(control.ControlConstructList _cclist) {
		// recursive visitor for ControlConstructList
		// OWL-S api doesn't require CCList | Bag to be instantiated directly.
		// instead just pass the contained control constructs directly to the 
		// containing feature of the CCList | Bag
		// will be reconstructed by the API when the OWL-S is serialized

		//System.out.println("In control construct list");
		OWLIndividualList<OWLIndividual> newList = new OWLIndividualListImpl<OWLIndividual>();


		if(_cclist.eIsSet(ControlPackage.Literals.CONTROL_CONSTRUCT_LIST__FIRST)) {
			control.ControlConstruct first = _cclist.getFirst();
			// ControlConstructList.first must (if set) be a ControlConstruct, so process it
			OWLIndividual firstOWL = (OWLIndividual)doSwitch(first);
			newList.add(firstOWL);
		}

		// if ControlConstructList.rest is set, it must be another List, so recurse into it
		// and accumulate into restList
		OWLIndividualList<OWLIndividual> restList = new OWLIndividualListImpl<OWLIndividual>();
		if(_cclist.eIsSet(ControlPackage.Literals.CONTROL_CONSTRUCT_LIST__REST)) {
			restList = (OWLIndividualList<OWLIndividual>)doSwitch(_cclist.getRest());
		}

		// merge the two lists for return
		newList.addAll(restList);
		return newList;

	}

	public OWLIndividualList<OWLIndividual> caseControlConstructBag(control.ControlConstructBag _ccBag) {
		// see caseControlConstructList

		//System.out.println("In control construct bag");

		OWLIndividualList<OWLIndividual> newList = new OWLIndividualListImpl<OWLIndividual>();

		if(_ccBag.eIsSet(ControlPackage.Literals.CONTROL_CONSTRUCT_BAG__FIRST)) {
			control.ControlConstruct first = _ccBag.getFirst();
			// ControlConstructList.first must always be set to a ControlConstruct, so process it
			OWLIndividual firstOWL = (OWLIndividual)doSwitch(first);
			//System.out.println("First component in CCBag is: " + firstOWL.toPrettyString());
			newList.add(firstOWL);
		}

		// if ControlConstructBag.rest is set, it must be another CCBag, so recurse into it
		// and accumulate into restList
		OWLIndividualList<OWLIndividual> restList = new OWLIndividualListImpl<OWLIndividual>();
		if(_ccBag.eIsSet(ControlPackage.Literals.CONTROL_CONSTRUCT_BAG__REST)) {
			restList = (OWLIndividualList<OWLIndividual>)doSwitch(_ccBag.getRest());
		}

		// merge the two lists for return
		newList.addAll(restList);

		return newList;
	}



	public OWLIndividual casePerform(control.Perform _perform) {
		//System.out.println("In perform");
		org.mindswap.owls.process.Perform newPerform = serviceOntology.createPerform(makeURI(_perform.getName()));

		int addedParamHashes = 0;
		if(_perform.eIsSet(ControlPackage.Literals.PERFORM__THE_PROCESS)) {
			// must contain a process
			Process containsProcess = (Process)doSwitch(_perform.getTheProcess());
			newPerform.setProcess(containsProcess);
			addedParamHashes = getChildParamsFromPerform(_perform.hashCode(), _perform.getTheProcess());
		}

		//System.out.println("Added perform " + _perform.getName() + " : " + _perform.hashCode() + " with " + addedParamHashes + "params");

		ontologyMap.put(_perform.hashCode(), newPerform);

		return newPerform;
	}

	public OWLIndividual caseProduce(control.Produce _produce) {
		//System.out.println("Visiting produce: " + _produce.getName());
		org.mindswap.owls.process.Produce newProduce = serviceOntology.createProduce(makeURI(_produce.getName()));
		ontologyMap.put(_produce.hashCode(), newProduce);

		return newProduce;
	}

	public OWLIndividual caseSet(control.Set _set) {
		//System.out.println("Visiting set: " + _set.getName());

		// API has no OWLOntology.createSet factory method. Not sure why.
		// This is what it would do (see e.g. OWLOntology.createProduce).
		OWLIndividual setInd = serviceOntology.createInstance(OWLS.Process.Set, makeURI(_set.getName()));
		org.mindswap.owls.process.Set newSet = new SetImpl(setInd);

		ontologyMap.put(_set.hashCode(), newSet);


		return newSet;
	}

	public OWLIndividual caseRemoteProcess(control.RemoteProcess _innerRemoteProcess) {

		URI serviceURI = URIUtils.createURI(_innerRemoteProcess.getRemoteURI());

		//URI remoteOntology = URIUtils.standardURI(serviceURI);
		EObject container = _innerRemoteProcess.eContainer();

		Service remoteService;

		try {
			System.err.println("Remote URL: " + _innerRemoteProcess.getRemoteURL());
			//URL serviceURL = new URL(_innerRemoteProcess.getRemoteURL());
			//OWLOntology remoteOntology = serviceKB.read(serviceURL.openStream(), serviceURI);
			OWLOntology remoteOntology = serviceKB.read(serviceURI);
			List<Service>remoteServiceList = remoteOntology.getServices(true);
			remoteService = remoteServiceList.get(0);
		} catch (IOException e) {
			String errorMessage = new String("couldn't import remote service " + serviceURI.toString());
			objectToErrorMessageMap.put(container, errorMessage);
			e.printStackTrace();
			return null;
		} 
		//System.out.println("Imported service: " + remoteService.getURI());

		Process remoteServiceProcess = remoteService.getProcess();
		serviceOntology.addImport(remoteService.getOntology());

		//match inputs and outputs of _innerProcess object to remote service
		// by local name
		//fail if we can't match all the inputs mentioned in the mode
		for(control.Input modelInput : _innerRemoteProcess.getHasInput()) {
			//attempt to match
			Input owlInput = remoteServiceProcess.getInput(modelInput.getName());
			if(owlInput == null) {
				String errorMessage = new String("model input: " + modelInput.getName() + "  is not in remote service profile. ");
				objectToErrorMessageMap.put(_innerRemoteProcess, errorMessage);
				return null;
			}
			// if match succeeds, add to ontology with hashcode of model input
			//System.out.println("Matched remote service input to model input: " + owlInput.getURI().toString() + " hash: " + modelInput.hashCode());
			ontologyMap.put(modelInput.hashCode(), owlInput);
		}

		for(control.Output modelOutput : _innerRemoteProcess.getHasOutput()) {
			//attempt to match
			Output owlOutput = remoteServiceProcess.getOutput(modelOutput.getName());
			if(owlOutput == null) {
				//System.out.println("Model input: " + modelOutput.getName() + " is not in remote service profile. Aborting");
				String errorMessage = new String("model output: " + modelOutput.getName() + "  is not in remote service profile. ");
				objectToErrorMessageMap.put(_innerRemoteProcess, errorMessage);
				return null;
			}


			// if match succeeds, add to ontology with hashcode of model output
			//System.out.println("Matched remote service output to model output: " + owlOutput.getURI().toString()  + " hash: " + modelOutput.hashCode());
			ontologyMap.put(modelOutput.hashCode(), owlOutput);
		}


		return remoteService.getProcess();

	}

	public OWLIndividual caseTemplateProcess(control.TemplateProcess _innerTemplateProcess) {

		URI processURI = URIUtils.createURI(getNameSafely(_innerTemplateProcess));

		EObject container = _innerTemplateProcess.eContainer();


		if(!_innerTemplateProcess.eIsSet(ControlPackage.Literals.TEMPLATE_PROCESS__SLOT_NAME)) {
			//If slotName property is not set, fail with error and abort
			String errorMessage = new String("Template process has no SlotName property. Aborting ");
			objectToErrorMessageMap.put(_innerTemplateProcess, errorMessage);
			return null;
		}

		CompositeProcess templateProcess = null;
		Sequence dummySequence;

		try {
			templateProcess = serviceOntology.createCompositeProcess(processURI);
			dummySequence = serviceOntology.createSequence(new URI(processURI + "_sequence"));
			templateProcess.setComposedOf(dummySequence);
			//ontologyMap.put(12345678, dummySequence);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			String errorMessage = new String("Template process has malformed URI");
			objectToErrorMessageMap.put(_innerTemplateProcess, errorMessage);
			e.printStackTrace();
		}

		// add Inputs and outputs
		for(control.Input templateInput : _innerTemplateProcess.getHasInput()) {
			templateProcess.addInput((Input) doSwitch(templateInput));
		}

		for(control.Output templateOutput : _innerTemplateProcess.getHasOutput()) {
			templateProcess.addOutput((Output) doSwitch(templateOutput));
		}

		//set slotName property on Process
		// add slot properties

		addSlotInfo(templateProcess, URIUtils.createURI(slotType), _innerTemplateProcess.getSlotName());


		ontologyMap.put(_innerTemplateProcess.hashCode(), templateProcess);


		return templateProcess;		

	}




	public org.mindswap.owls.process.variable.Output caseOutput(control.Output theOutput) {

		org.mindswap.owls.process.variable.Output newOutput = serviceOntology.createOutput(makeURI(theOutput.getName()));
		ontologyMap.put(theOutput.hashCode(), newOutput);
		// newInput.setParamType(arg0)
		newOutput.setLabel(theOutput.getName(), "EN");
		//System.out.println("Added output - hash = " +theOutput.hashCode() + " name = " +theOutput.getName());

		OWLType owlParamType = null;

		if(theOutput.eIsSet(ControlPackage.Literals.PROCESS_VAR__PARAMETER_TYPE)) {
			owlParamType = createType(theOutput.getParameterType());
			newOutput.setParamType(owlParamType);
		}

		if(theOutput.eIsSet(ControlPackage.Literals.PROCESS_VAR__PARAMETER_VALUE) && !theOutput.getParameterValue().isEmpty()) {
			if(owlParamType==null) {
				String errorMessage = new String(" - has parameter value but no parameter type");
				objectToErrorMessageMap.put(theOutput, errorMessage);
				return null;
			}
			OWLDataValue constValue = serviceOntology.createDataValue(theOutput.getParameterValue());
			newOutput.setConstantValue(constValue);
		}


		return newOutput;
	}

	public org.mindswap.owls.process.variable.InputBinding caseInputBinding(control.InputBinding theInputBinding) {

		System.out.println("Visited input binding");

		Integer toParamHash = theInputBinding.getToParam().hashCode();
		Integer valueSourceHash = theInputBinding.getValueSource().hashCode();



		org.mindswap.owls.process.variable.Input owlToParam = (org.mindswap.owls.process.variable.Input)(ontologyMap.get(toParamHash));
		System.out.println("OWL toParam = " + owlToParam.toPrettyString());

		Perform targetPerform = getPerformWithParam(toParamHash);

		System.out.println("OWL toParam belongs to Perform: " + targetPerform.toPrettyString());
		Perform valueSourcePerform = getPerformWithParam(valueSourceHash);

		OWLIndividual owlValueSource = ontologyMap.get(valueSourceHash);
		// first case to support - valueOf binding type
		// value source must be *either* of Parameter or Loc (a Loc of the current Perform).
		if(owlValueSource.canCastTo(Parameter.class)) {
			org.mindswap.owls.process.variable.Parameter sourceParam = owlValueSource.castTo(Parameter.class);


			System.out.println("Value source is an input from Perform: " + valueSourcePerform.toPrettyString());

			targetPerform.addBinding(owlToParam, valueSourcePerform, sourceParam);
			System.out.println("Target perform: " + targetPerform.getLocalName() + " now has bindings: " + targetPerform.getAllBindings().toString());
		}

		return null;
	}

	public org.mindswap.owls.process.variable.OutputBinding caseOutputBinding(control.OutputBinding _outputBinding) {

		control.ValueSpecifier bindingElement = _outputBinding.getOrigin();
		OWLIndividual valueSpecifierContainer  = ontologyMap.get(bindingElement.eContainer().hashCode());

		Integer sourceParamHash = specifierToSourceMap.get(bindingElement.hashCode());
		if(sourceParamHash==null) {
			// specifier has no outputBindingSource
			// would cause NPE later on, so get out and abandon the process
			String errorMessage = new String(" - value specifier has no outputSourceBinding");
			objectToErrorMessageMap.put(bindingElement, errorMessage);
			return null;
		}
		OWLIndividual sourceParam = ontologyMap.get(sourceParamHash);
		OWLIndividual sourcePerform = ontologyMap.get(paramToPerformMap.get(sourceParamHash));

		control.Output toOutput = _outputBinding.getToParam();

		System.out.println("Output Binding - source is: " + bindingElement.toString());
		System.out.println("Output Binding source container is: " + valueSpecifierContainer.getURI());
		System.out.println("Output Binding - toParam is: " + toOutput.hashCode() + " URI = " + ontologyMap.get(toOutput.hashCode()).getURI());
		System.out.println("Output Binding - target of outputSource is: " + sourceParam.getURI());
		System.out.println("Output Binding - final source perform is: " + sourcePerform.getURI());

		OutputBinding newOutputBinding = serviceOntology.createOutputBinding(makeURI("OutputBinding_" + _outputBinding.hashCode()));
		newOutputBinding.setProcessVar(ontologyMap.get(toOutput.hashCode()).castTo(Output.class));

		if(bindingElement.eClass() == ControlPackage.Literals.VALUE_SOURCE) {
			System.out.println("Found value source specifier");
			ValueOf newValueOf = serviceOntology.createValueOf(null);
			newValueOf.setSource(sourceParam.castTo(Parameter.class), sourcePerform.castTo(Perform.class));
			newValueOf.setToBinding(newOutputBinding);
		} else if(bindingElement.eClass() == ControlPackage.Literals.VALUE_FUNCTION) {
			System.out.println("Found value function specifier");
			// must pass a valid SPARQL expression here, or NPE when calling setToBinding
			// so make a valid SPARQL expression which will be ignored by the API (i.e. any
			// type other than CONSTRUCT
			objectToErrorMessageMap.put(bindingElement, "- only valueSource (aka valueOf) binding elements are currently supported");
			return null;
			//			SPARQLExpressionImpl sparqlExpr = new SPARQLExpressionImpl(null);
			//			sparqlExpr.setBody("SELECT ?");
			//			SPARQLValueFunction newValueFunction = new SPARQLValueFunction(sparqlExpr, newOutputBinding);
			// constructor above doesn't actually do setToBinding on the enclosing binding
			//			newValueFunction.setToBinding(newOutputBinding);
			//			System.out.println("Check is valueFunctionBinding (should be TRUE): " + newOutputBinding.isValueFunctionBinding());

		}

		if(newOutputBinding.isValueOfBinding()) {
			if(valueSpecifierContainer.canCastTo(Result.class)) {
				Result owlResult = valueSpecifierContainer.castTo(Result.class);
				owlResult.addBinding(newOutputBinding);
				//System.out.println("Added output binding to result: " + owlResult.getURI());

			} else if (valueSpecifierContainer.canCastTo(Produce.class)) {
				Produce owlProduce = valueSpecifierContainer.castTo(Produce.class);	
				owlProduce.addBinding(newOutputBinding);
				//System.out.println("Added output binding to produce: " + owlProduce.getURI());
			}
		} else {
			// if we fail to add the binding to a result or perform
			// remove it from the kb
			//System.out.println("Couldn't process output binding, removing from kb");
			String errorMessage = new String("output binding is not in Result or Produce");
			objectToErrorMessageMap.put(bindingElement, errorMessage);
			serviceOntology.remove(newOutputBinding, false);
			return null;

		}


		return null;
	}

	public OWLIndividual caseLocBinding(control.LocBinding _locBinding) {
		// locBinding can - only come from a set
		//System.out.println("LocBinding - Visiting LocBinding");
		control.ValueSpecifier bindingElement = _locBinding.getOrigin();
		OWLIndividual valueSpecifierContainer  = ontologyMap.get(bindingElement.eContainer().hashCode());

		Integer sourceParamHash = specifierToSourceMap.get(bindingElement.hashCode());
		OWLIndividual sourceParam = ontologyMap.get(sourceParamHash);
		OWLIndividual sourcePerform = ontologyMap.get(paramToPerformMap.get(sourceParamHash));


		control.Loc toLoc = _locBinding.getToLoc();


		LocBinding newLocBinding = serviceOntology.createLocBinding(makeURI("LocBinding_" + _locBinding.hashCode()));
		newLocBinding.setProcessVar(ontologyMap.get(toLoc.hashCode()).castTo(Loc.class));


		// for now, just supporting valueSource (i.e. valueOf) binding specifiers
		if(bindingElement.eClass() == ControlPackage.Literals.VALUE_SOURCE) {
			//System.out.println("LocBinding - Found value source specifier");
			ValueOf newValueOf = serviceOntology.createValueOf(null);
			newValueOf.setSource(sourceParam.castTo(Parameter.class), sourcePerform.castTo(Perform.class));
			newValueOf.setToBinding(newLocBinding);


		} else {
			// should add support for valueFunction etc. See caseOutputBinding
			// if we fail out of supported valueSpecifier types, get the binding out of the kb
			// and abandon the process
			objectToErrorMessageMap.put(bindingElement, "- only valueSource (aka valueOf) binding elements are currently supported");
			serviceOntology.remove(newLocBinding, false);
			return null;
		}

		if(valueSpecifierContainer.canCastTo(org.mindswap.owls.process.Set.class)) {
			//System.out.println("LocBinding - coming from a Set");
			org.mindswap.owls.process.Set targetSet = valueSpecifierContainer.castTo(org.mindswap.owls.process.Set.class);
			targetSet.addBinding(newLocBinding);		
		} else { // if this is coming from a container which isn't a (OWL-S) Set, we have a problem
			//System.out.println("LocBinding - ERROR - coming from " + valueSpecifierContainer.getURI());
			objectToErrorMessageMap.put(bindingElement, "- LocBinding must be in a Set control construct");
			serviceOntology.remove(newLocBinding, false);
			return null;

		}

		return null;
	}

	public OWLIndividual caseLinkBinding(control.LinkBinding _linkBinding) {
		// locBinding can - only come from a set
		//System.out.println("LinkBinding - Visiting LinkBinding");
		control.ValueSpecifier bindingElement = _linkBinding.getOrigin();
		OWLIndividual valueSpecifierContainer  = ontologyMap.get(bindingElement.eContainer().hashCode());

		Integer sourceParamHash = specifierToSourceMap.get(bindingElement.hashCode());
		OWLIndividual sourceParam = ontologyMap.get(sourceParamHash);
		OWLIndividual sourcePerform = ontologyMap.get(paramToPerformMap.get(sourceParamHash));

		control.Link toLink = _linkBinding.getToLink();

		LinkBinding newLinkBinding = serviceOntology.createLinkBinding(makeURI("LinkBinding_" + _linkBinding.hashCode()));
		newLinkBinding.setProcessVar(ontologyMap.get(toLink.hashCode()).castTo(Link.class));


		// for now, just supporting valueSource (i.e. valueOf) binding specifiers
		if(bindingElement.eClass() == ControlPackage.Literals.VALUE_SOURCE) {
			//System.out.println("LinkBinding - Found value source specifier");
			ValueOf newValueOf = serviceOntology.createValueOf(null);
			newValueOf.setSource(sourceParam.castTo(Parameter.class), sourcePerform.castTo(Perform.class));
			newValueOf.setToBinding(newLinkBinding);			
		} else {
			// should add support for valueFunction etc. See caseOutputBinding
			// if we fail out of supported valueSpecifier types, get the binding out of the kb
			// and abandon the process
			objectToErrorMessageMap.put(bindingElement, "- only valueSource (aka valueOf) binding elements are currently supported");
			serviceOntology.remove(newLinkBinding, false);
			return null;
		}

		if(valueSpecifierContainer.canCastTo(org.mindswap.owls.process.Produce.class)) {
			//System.out.println("LocBinding - coming from a Produce");
			org.mindswap.owls.process.Produce targetProduce = valueSpecifierContainer.castTo(org.mindswap.owls.process.Produce.class);
			targetProduce.addBinding(newLinkBinding);		
		} else { // if this is coming from a container which isn't a (OWL-S) Produce, we have a problem
			//System.out.println("LocBinding - ERROR - coming from " + valueSpecifierContainer.getURI());
			objectToErrorMessageMap.put(bindingElement, "- LinkBinding must be in a Produce control construct");
			serviceOntology.remove(newLinkBinding, false);		
			return null;

		}

		return null;
	}

	public OWLIndividual caseLoc(control.Loc _loc) {
		org.mindswap.owls.process.variable.Loc newLoc = serviceOntology.createLoc(makeURI(_loc.getName()));
		ontologyMap.put(_loc.hashCode(), newLoc);
		//System.out.println("Added Loc to ontology, hash: " + _loc.hashCode());

		if(_loc.eIsSet(ControlPackage.Literals.PROCESS_VAR__PARAMETER_TYPE)) {
			newLoc.setParamType(createType(_loc.getParameterType()));
		}
		//TODO should also set constant value, if one exists

		return newLoc;
	}

	public OWLIndividual caseLink(control.Link _link) {
		org.mindswap.owls.process.variable.Link newLink = serviceOntology.createLink(makeURI(_link.getName()));
		ontologyMap.put(_link.hashCode(), newLink);

		if(_link.eIsSet(ControlPackage.Literals.PROCESS_VAR__PARAMETER_TYPE)) {
			newLink.setParamType(createType(_link.getParameterType()));
		}

		return newLink;
	}

	public OWLIndividual caseoutputBindingSource(control.outputBindingSource _outputBindingSource) {
		// does not produce an OWLIndividual.
		// just creates an entry in specifierToSourceMap so that when valueSpecifierElements are processed
		// we can find the variable that the outputBinding actually points to
		//System.out.println("Visiting outputBindingSource: " + _outputBindingSource.getName());
		control.ValueSpecifierElement theElement = _outputBindingSource.getSpecifierElement();
		control.ProcessVar theSource = _outputBindingSource.getSource();

		specifierToSourceMap.put(theElement.hashCode(), theSource.hashCode());

		return null;
	}

	private int getChildParamsFromPerform(int performHash, control.AbstractProcess _innerProcess) {

		int addedParams = 0;
		if(_innerProcess.eIsSet(ControlPackage.Literals.ABSTRACT_PROCESS__HAS_INPUT)) {
			for(control.Input theInput : (_innerProcess.getHasInput())) {
				paramToPerformMap.put(theInput.hashCode(), performHash);
				addedParams++;
			}
		}
		if(_innerProcess.eIsSet(ControlPackage.Literals.ABSTRACT_PROCESS__HAS_OUTPUT)) {
			for(control.Output theOutput : _innerProcess.getHasOutput()) {
				paramToPerformMap.put(theOutput.hashCode(), performHash);
				addedParams++;
			}
		}
		return addedParams;
	}

	private Perform getPerformWithParam(int paramHash) {

		Perform retPerform = null;

		if(paramToPerformMap.containsKey(paramHash)) {
			Integer retPerformHash = paramToPerformMap.get(paramHash);
			if(retPerformHash == THIS_PERFORM_HASH) {
				retPerform = OWLS.Process.ThisPerform;
			} else {
				retPerform = ontologyMap.get(retPerformHash).castTo(Perform.class);
			}
		}

		if(retPerform == null) {
			System.out.println("Couldn't find a perform for the param");
		} else {
			System.out.println("Perform " + retPerform.getURI() + " has param with hashcode = " + paramHash);
		}
		return retPerform;
	}

	public List<String> validateService() {
		OWLSValidator aValidator = new OWLSValidator();

		List<String> messageStrings = new LinkedList<String>();
		Set<ValidationMessage> messageSet;

		try {
			ValidationReport aReport = aValidator.validate(serviceOntology.getURI());
			messageSet = aReport.getMessages().get(createdService);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		for(ValidationMessage message : messageSet) {
			//System.out.println("Validator message: " + message.getMessage());
			messageStrings.add(message.getMessage());		
		}

		return messageStrings;


	}

	public List<String> getErrorStrings() {
		List<String> errorList = new LinkedList<String>();
		for(EObject object : objectToErrorMessageMap.keySet()) {
			StringBuilder objectName = new StringBuilder();
			if(object.eIsSet(ControlPackage.Literals.NAMED_ELEMENT__NAME)) {
				objectName.append((String)object.eGet(ControlPackage.Literals.NAMED_ELEMENT__NAME));
			} else {
				objectName.append("Unnamed object");
			}
			String errString = objectToErrorMessageMap.get(object);
			String messageString = "Can't serialize " + objectName.toString() + " " + errString;
			errorList.add(messageString);
		}

		if(errorList.isEmpty()) {
			return null;
		}
		return errorList;
	}

	private void addSlotInfo(Process _process, URI _propURI, String _slotName) {

		OWLDataProperty slotProperty = serviceKB.getDataProperty(_propURI);
		System.err.println("Slot dataProperty: " + slotProperty.toString() + " " + slotProperty.getOntology().toString());
		OWLDataValue slotValue = serviceKB.createDataValue(_slotName, XSD.string);
		Process ontProcess = serviceOntology.getProcess(_process.getURI());
		OWLIndividual owlInd = serviceOntology.createInstance(ontProcess.getType(), ontProcess.getURI());
		System.err.println("Ont process: " + ontProcess.getURI());
		owlInd.addProperty(slotProperty, slotValue);
	}

	private void addOWLProperty(OWLIndividual owlTarget, URI _propURI) {
		OWLDataProperty newProperty = serviceKB.getDataProperty(_propURI);

		System.err.println("New dataProperty: " + newProperty.toString() + " " + newProperty.getOntology().toString());

		Service owlService = serviceOntology.getService(owlTarget.getURI());
		OWLIndividual owlInstance = serviceOntology.createInstance(owlService.getType(), owlService.getURI());
		System.err.println("Ont service: " + owlService.getURI());
		try {
			owlInstance.addProperty(newProperty, "");
		} catch(RuntimeException re) {
			System.err.println("New dataProperty: " + newProperty.toString() + " " + newProperty.getOntology().toString());
			System.err.println("Ont service: " + owlService.getURI());
			throw re;
		}
	}

	private String getNameSafely(control.NamedElement _element) {
		// check if name of element is set and generate one if not using hashcode
		String retName;
		if(_element.eIsSet(ControlPackage.Literals.NAMED_ELEMENT__NAME)) {
			retName = _element.getName();
		} else {
			// name is not set
			retName = _element.getClass().getSimpleName().toString() + "_" + _element.hashCode();

		}

		return retName;
	}

	public void writeOutput(OutputStream os) {
		//				OWLWriter aWriter = serviceOntology.getWriter();
		//				aWriter.write(serviceOntology, os, serviceOntology.getURI());
		serviceOntology.write(os, serviceOntology.getURI());
	}

}
