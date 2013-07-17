package net.sf.ictalive.SL2Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.Ontology;
import net.sf.ictalive.operetta.OM.OperAModel;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.coordination.actions.*;
import net.sf.ictalive.owls.expr.Condition;
import net.sf.ictalive.owls.expr.ExprFactory;
import net.sf.ictalive.owls.expr.Expression;
import net.sf.ictalive.owls.expr.ExpressionLanguage;
import net.sf.ictalive.owls.process.*;
import net.sf.ictalive.rules.ruleml.RulemlFactory;
import net.sf.ictalive.rules.swrl.AtomList;
import net.sf.ictalive.rules.swrl.SwrlFactory;
import net.sf.ictalive.service.discovery.client.WebServiceClientFactory;
import net.sf.ictalive.service.tool.AliveRepoManagerHook;
import net.sf.ictalive.service.tool.RemoteWebServiceRepositoryCallback;


public class ConvertSL2Actions {
	
	protected static boolean debug = false;	
	public static boolean GENERATE_OPERA = true;
		
	public static final java.net.URI CONGO_12 =	java.net.URI.create("Congo/CongoService.owl");
	public static final java.net.URI BRAVO_12 =	java.net.URI.create("Bravo/BravoAirService.owl");
	public static final java.net.URI AMAZON_12 = java.net.URI.create("examples/AmazonBookPrice.owl");
	public static final java.net.URI CJ = java.net.URI.create("owls/CalicoJack.owl");
	public static final java.net.URI CONTEXT_SERVICE = java.net.URI.create("owls/ContextService.owls");
	public static final java.net.URI PREFERENCES_SERVICE = java.net.URI.create("owls/PreferencesService.owls");
	public static final java.net.URI CONTEXT_SERVICE_URI = java.net.URI.create("http://services.alive.calicojack.co.uk/ContextServiceWrapper");
		
	private static String FileNameGEN = "gen";
	private static org.eclipse.emf.common.util.URI OutFolder = org.eclipse.emf.common.util.URI.createFileURI("out");	
	private static String ActionModel =   "gen.actions";
	
	OperAModel opera;
	static ActionsCollection actionCol;
	
	public static void main(String[] args){		
				
		//URI  owlsURI = URI.createURI("Congo/CongoService.owl");
		//URI  owlsURI = URI.createURI("Bravo/BravoAirService.owl");
		URI  owlsURI = URI.createURI("owls/ContextService.owls");
		
		URI actionsURI = URI.createURI("gen.actions");
		URI operaURI = URI.createURI("gen.opera");
			
		convert(owlsURI, actionsURI, operaURI);		
		
	}
	
	public static void convert(URI owlsURI, URI actionsURI, URI operaURI){
		if (debug) System.out.println("start convert -> ");
		
		ConvertSL2Actions transformation = new ConvertSL2Actions();
		
		// for File location
		transformation.initRepoManagerHookFile(); 
		// for URI location
		//transformation.initRepoManagerHook(); 
		
		try {	
			transformation.process(owlsURI, actionsURI, operaURI);		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void initRepoManagerHook(){
		
		WebServiceClientFactory wscf = new WebServiceClientFactory();
		
		try {
			wscf.setWsdlLocation(new java.net.URL("http://147.83.200.118:8080/repo/ws/ObjectRepo?wsdl"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Set up the repository calback hook - this is used to locate ontologies which are imported to services
		// optional  
		AliveRepoManagerHook.reset();
		// Set up the basic Jena Hooks
		AliveRepoManagerHook.setup(true);
		// Add a web service repository callback
		AliveRepoManagerHook.addLocatorCallback(new RemoteWebServiceRepositoryCallback(wscf));	
	
	}
	
	public void initRepoManagerHookFile(){
		
		WebServiceClientFactory wscf = new WebServiceClientFactory();
		
		try {
			wscf.setWsdlLocation(new java.net.URL("http://147.83.200.118:8080/repo/ws/ObjectRepo?wsdl"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Set up the repository calback hook - this is used to locate ontologies which are imported to services
		// optional  
		AliveRepoManagerHook.reset();
		// Set up the basic Jena Hooks
		AliveRepoManagerHook.setup(true);
		
		AliveRepoManagerHook.addFilePathEntry("Congo/www.daml.org/services/owl-s/1.2/"); 
		AliveRepoManagerHook.addFilePathEntry("Congo/www.isi.edu/~pan/damltime/");
	
		// Add a web service repository callback
	//	AliveRepoManagerHook.addLocatorCallback(new RemoteWebServiceRepositoryCallback(wscf));
	
		AliveRepoManagerHook.addFilePathEntry("owls");
		
	}
	
	public boolean process(java.net.URI uri) throws Exception {
	
		org.mindswap.owl.OWLKnowledgeBase kb = org.mindswap.owl.OWLFactory.createKB();
	//	OWLOntology ont = kb.read(uri);	
	//	OWLOntology ont = kb.read(java.net.URI.create("http://GUIServices.upctmt.org/ShowGUIService" ));
		
		FileInputStream a = new FileInputStream(uri.toString());//"owls/ContextService.owls");
		org.mindswap.owl.OWLOntology ont = kb.read(a, null);
		////
		
		if (debug)System.out.println("num of services: "+ ont.getServices(false).size() );
				
		initialiseContainers();
		
		String ns = ""; 
		
		if(ont.getServices(false) != null) {
			for (org.mindswap.owls.service.Service service : ont.getServices(false)) {				
				if (debug)System.out.print("service URI: "+ service.getURI().toString());
				if (debug) System.out.println("service LName: "+ service.getLocalName());				
				
				processService( service );				
				ns = "http://" + service.getURI().getHost() +  service.getURI().getPath();				
			}		
		}	
		
		//saving opera
		if(GENERATE_OPERA)
			UtilOL.saveOperA(opera, URI.createFileURI( UtilOL.OperaModel ));
		
		actionCol.setNs( ns );
		
		//saving actions
		saveActionCol(actionCol, URI.createFileURI( ActionModel ));
				
		return true;
	}	
	
	
	//public boolean process(java.net.URI uri) throws Exception {
	public boolean process(URI owlsURI, URI actionsURI, URI operaURI) throws Exception {
		org.mindswap.owl.OWLKnowledgeBase kb = org.mindswap.owl.OWLFactory.createKB();	
				
		FileInputStream a = new FileInputStream(owlsURI.toString());
		org.mindswap.owl.OWLOntology ont = kb.read(a, null);
				
		if (debug)System.out.println("Num of services Found: "+ ont.getServices(false).size() +"");
						
		initialiseContainers();
		
		String ns = ""; 		
		if(ont.getServices(false) != null) {
			for (org.mindswap.owls.service.Service service : ont.getServices(false)) {				
				if (debug)System.out.println("service URI: "+ service.getURI().toString());					
				
				processService( service );				
				ns = "http://" + service.getURI().getHost() +  service.getURI().getPath();				
			}		
		}	
		
		//saving opera
		if(GENERATE_OPERA)
			UtilOL.saveOperA(opera, operaURI);//URI.createFileURI( OperaModel ));
		
		actionCol.setNs( ns );
		
		//saving actions
		saveActionCol(actionCol, actionsURI);//URI.createFileURI( ActionModel ));
				
		return true;
	}	
	
	public void processService(org.mindswap.owls.service.Service service){
		if (debug)System.err.println("-- Processing Service: "+  service.getQName());
		
		org.mindswap.owls.process.Process process =  service.getProcess();
	
		if (process!=null){
			
			Action action = null;
			if(process instanceof org.mindswap.owls.process.AtomicProcess){
				if (debug) System.out.println(" > processing atomic process with qname : "+  process.getQName());
								
				action = processAtomicAction( (org.mindswap.owls.process.AtomicProcess) process);
				if(action!=null)
					actionCol.getActions().add( action );
				
			}else if(process instanceof org.mindswap.owls.process.CompositeProcess){
				if (debug)System.out.println(" > processing composite process with qname : "+  process.getQName());				
				
				action = processCompositeAction( (org.mindswap.owls.process.CompositeProcess) process);
				if(action!=null)
					actionCol.getActions().add( action );
			}else{
				
			}			
			
			for (org.mindswap.owls.process.variable.Participant participant : process.getParticipants()) {
				processParticipant (participant, action); 
			}
			
		}
		
		if (debug)System.err.println("-- End Process Service: ");
		
	}	
	
	public Participant processParticipant(org.mindswap.owls.process.variable.Participant p, Action action){
		
		Participant participant = null;
		
		if(!existsParticipant(p.getLocalName()) ) {	
			
			if (debug)System.out.println(" add Participant "  + p.getLocalName() );	
			
			participant = ProcessFactory.eINSTANCE.createParticipant();
			
			participant.setName( p.getLocalName() );
			
			actionCol.getParticipants().add( participant );
			
		//get existing one
		}else{			
			if (debug)System.out.println(" get existing Participant "  + p.getLocalName() );	
			
			participant = getParticipant(p.getLocalName());			
		}
						
		if(action!=null){
			//action.setHasParticipant( participant );
			Role r = OMFactory.eINSTANCE.createRole();
			r.setName(participant.getName());
			action.getPerformedByRole().add( r );
		}
		
		return  participant;
	}
		
	public static Parameter processParameter(org.mindswap.owls.process.variable.Parameter p){
		Parameter parameter =null;
		
		if(p instanceof org.mindswap.owls.process.variable.Input){
			parameter = ProcessFactory.eINSTANCE.createInput();
			
			if (debug)System.out.println("  adding input: "+  p.getName());
			
		}else{
			parameter = ProcessFactory.eINSTANCE.createOutput();
			
			if (debug)System.out.println("  adding output: "+  p.getName());
		}
		
		parameter.setName( p.getLocalName() );
		parameter.setNs(p.getNamespace());
				
		actionCol.getParameters().add( parameter );
		
		if(GENERATE_OPERA)
			UtilOL.processConcept(p, parameter);
		
	
		return parameter;
	}

	
	public static AtomicAction processAtomicAction(org.mindswap.owls.process.AtomicProcess process){
		
		if(existsAction(process.getLocalName())) return null;
		
		AtomicAction action = ActionsFactory.eINSTANCE.createAtomicAction();		
				
		action.setName( process.getLocalName() );		
		
		if (debug)System.out.println(" creating atomic action : "+  action.getName());
				
		if (debug)System.out.println(" num of inputs : "+   process.getInputs().size());
		//processing inputs
		for (org.mindswap.owls.process.variable.Input i : process.getInputs()) {
			action.getHasInput().add( (Input) processParameter(i) );
		}
		
		if (debug)System.out.println(" num of outputs : "+   process.getOutputs().size());
		//processing outputs
		for (org.mindswap.owls.process.variable.Output o : process.getOutputs()) {
			action.getHasOutput().add( (Output) processParameter(o) );
		}
		
		if (debug)System.out.println(" num of conditions : "+   process.getConditions().size());
		//processing conditions
		if(process.getConditions().size()>0){
			
			Condition condition = ExprFactory.eINSTANCE.createCondition();
			
			AtomList atomList  = SwrlFactory.eINSTANCE.createAtomList(); 
			
			condition.setExpressionBody( atomList );
			
			for (org.mindswap.owls.expression.Condition cond : process.getConditions()) {
				
				if (debug)System.out.println("  condition " + cond);
				System.out.println("  condition " + cond.getClass());
				
				if(cond instanceof impl.jena.SWRLExpressionImpl){
				//	System.out.println("   is swrl " + cond.getClass());
					impl.jena.SWRLExpressionImpl swrl = (impl.jena.SWRLExpressionImpl)cond;		
					
					ConvertSWRL.processOWLList( swrl.getBody(), condition );	
					
					condition.setLogicLanguage( ExpressionLanguage.SWRL );
					
				}else{
					System.err.println("   ! unsuported condition (not swrl) " + cond.getClass());					
				}				
				
			}	
						
			action.setHasPrecondition(  condition );				
		}
				
		return action;
	}
		
	public static CompositeAction processCompositeAction(org.mindswap.owls.process.CompositeProcess process){
		
		if(existsAction(process.getLocalName())) return null;
		
		CompositeAction action = ActionsFactory.eINSTANCE.createCompositeAction();
	
		action.setName( process.getLocalName() );		
		
		if (debug)System.out.println(" creating composite action : "+  action.getName());
	
		if (debug)System.out.println(" num of inputs : "+   process.getInputs().size());
		//processing inputs
		for (org.mindswap.owls.process.variable.Input i : process.getInputs()) {
			action.getHasInput().add( (Input)processParameter(i) );
		}
		
		if (debug)System.out.println(" num of outputs : "+   process.getOutputs().size());
		//processing outputs
		for (org.mindswap.owls.process.variable.Output o : process.getOutputs()) {
			action.getHasOutput().add( (Output)processParameter(o) );
		}
		
		if (debug)System.out.println(" num of conditions : "+   process.getConditions().size());
		//processing conditions
		if(process.getConditions().size()>0){
			
			Condition condition = ExprFactory.eINSTANCE.createCondition();
			
			AtomList atomList  = SwrlFactory.eINSTANCE.createAtomList(); 
			
			condition.setExpressionBody( atomList );
			
			for (org.mindswap.owls.expression.Condition cond : process.getConditions()) {
				
				if (debug)System.out.println("  condition " + cond);				
				
				if(cond instanceof impl.jena.SWRLExpressionImpl){
				
					impl.jena.SWRLExpressionImpl swrl = (impl.jena.SWRLExpressionImpl)cond;		
					
					ConvertSWRL.processOWLList( swrl.getBody(), condition );	
					
					condition.setLogicLanguage( ExpressionLanguage.SWRL );
					
				}else{
					System.err.println("   ! unsuported condition (not swrl) " + cond.getClass());
					
				}				
				
			}	
			
			action.setHasPrecondition(  condition );
			
		}
		
		
		if (debug)System.out.println(" num of results : "+   process.getResults().size());		
		/*
		//processing results
		if(process.getResults().size()>0){
			
			Result result = ProcessFactory.eINSTANCE.createResult();			
			Expression exp  = ExprFactory.eINSTANCE.createExpression();		
			result.setHasEffect( exp );
			
			for (org.mindswap.owls.process.Result res  : process.getResults()) {
				
				if (debug)System.out.println("  result " + res.getLocalName());
				
				for (org.mindswap.owls.expression.Expression obj : res.getEffects()) {
					if (debug)System.out.println("  result effect " + obj );
				}				
			}				
			action.getHasResult().add( result );			
		}
		*/
		
		ControlConstruct controlConstruct = processCombosedOf ( process.getComposedOf());
		
		if(controlConstruct!=null)
			action.setComposedOf(controlConstruct);	
		
		return action;
	}
		
	private static ControlConstruct processCombosedOf(org.mindswap.owls.process.ControlConstruct cont){
		
		ControlConstruct controlConstruct = null;
				
		if(cont instanceof org.mindswap.owls.process.AnyOrder){	
			if (debug)System.out.println(" visit AnyOrder" );	
			org.mindswap.owls.process.AnyOrder ao = (org.mindswap.owls.process.AnyOrder)cont;
			
			org.mindswap.owl.OWLIndividualList<org.mindswap.owls.process.ControlConstruct> list = ao.getConstructs();
					
			AnyOrder anyOrder = ProcessFactory.eINSTANCE.createAnyOrder(); 
			
			processAnyOrderList(list, anyOrder);
			
			controlConstruct = anyOrder;
			
		}
		else if(cont instanceof org.mindswap.owls.process.AsProcess) {			
			if (debug)System.out.println(" visit asProcess" );	
		}
		else if(cont instanceof  org.mindswap.owls.process.Choice) {			
			if (debug)System.out.println(" visit Choice" );				
		}
		else if(cont instanceof  org.mindswap.owls.process.ForEach) {			
			if (debug)System.out.println(" visit FortEach" );	
		}
		else if(cont instanceof  org.mindswap.owls.process.IfThenElse) {			
			if (debug)System.out.println(" visit IfThenElse" );	
			
			org.mindswap.owls.process.IfThenElse ifthenelse = (org.mindswap.owls.process.IfThenElse)cont;
			if (debug)System.out.println("if condition" + ifthenelse.getCondition());					
						
			IfThenElse ifthen = ProcessFactory.eINSTANCE.createIfThenElse();
			
			controlConstruct = ifthen;			
		}
		else if(cont instanceof  org.mindswap.owls.process.Perform ) {
			if (debug)System.out.println(" visit Perform"   );			
			
			org.mindswap.owls.process.Perform p = (org.mindswap.owls.process.Perform)cont;				
			Perform perform = ConvertSL2Actions.maptoPerform(p);
				
			controlConstruct = perform;
		}

		else if(cont instanceof  org.mindswap.owls.process.Produce) {			
			if (debug)System.out.println(" visit Produce" );			
		}
		else if(cont instanceof  org.mindswap.owls.process.RepeatUntil) {			
			if (debug)System.out.println(" visit RepeatUntil" );	
		}
		else if(cont instanceof  org.mindswap.owls.process.RepeatWhile) {			
			if (debug)System.out.println(" visit RepeatWhile" );	
			
		}
		else if(cont instanceof  org.mindswap.owls.process.Sequence) {			
			if (debug)System.out.println(" visit Sequence" );			
			org.mindswap.owls.process.Sequence seq = (org.mindswap.owls.process.Sequence) cont;
									
			Sequence sequence = ProcessFactory.eINSTANCE.createSequence(); 
				
			org.mindswap.owl.OWLIndividualList<org.mindswap.owls.process.ControlConstruct> list = seq.getConstructs();
			
			if (debug)System.out.println(" - seq items " + list.size());
			
			processSequenceList(list, sequence);			
				
			controlConstruct = sequence;
		}
		else if(cont instanceof  org.mindswap.owls.process.Set) {			
			if (debug)System.out.println(" visit Set" );	
		}

		else if(cont instanceof  org.mindswap.owls.process.Split) {			
			if (debug)System.out.println(" visit Split" );	
		}
		else if(cont instanceof  org.mindswap.owls.process.SplitJoin ) {			
			if (debug)System.out.println(" visit SplitJoin" );	
		}
		else{
			
			
		}
		
		return controlConstruct;		
		
	}
	
	public static void processSequenceList(org.mindswap.owl.OWLIndividualList<org.mindswap.owls.process.ControlConstruct> list, Sequence sequence){
		
		if(list.size()>0){	
			ControlConstructList lst = ProcessFactory.eINSTANCE.createControlConstructList();
			sequence.setComponents(lst);
			
			processFirst(list.get(0), lst);
		}
	
		if(list.size() > 1){
			list.remove(0);
			processRest(list, sequence.getComponents());
		}

	}
	
	private  static void processFirst(org.mindswap.owls.process.ControlConstruct first, ControlConstructList lst){		
		ControlConstruct f = processCombosedOf( first );	 //Get ControlConstruct - e.g. Perform			
		lst.setFirst(f);
	}
			
	private  static void processFirst(org.mindswap.owls.process.ControlConstruct first, ControlConstructBag lst){
		ControlConstruct f = processCombosedOf( first );				
		lst.setFirst(f);
	}
	
	private  static void processRest(org.mindswap.owl.OWLIndividualList<org.mindswap.owls.process.ControlConstruct> rest, ControlConstructList lst){
				
		ControlConstructList restList = ProcessFactory.eINSTANCE.createControlConstructList();
		lst.setRest( restList);
		
		if(rest.size()>0)		
			processFirst(rest.get(0), restList);
		
		if(rest.size()>1)	{	
				rest.remove(0);
				processRest(rest,restList);		
		}
	}
	
	private static void processRest(org.mindswap.owl.OWLIndividualList<org.mindswap.owls.process.ControlConstruct> rest, ControlConstructBag lst){
		ControlConstructBag restList = ProcessFactory.eINSTANCE.createControlConstructBag();						
		lst.setRest( restList);
		
		if(rest.size()>0)		
			processFirst(rest.get(0), restList);
		
		if(rest.size()>1)	{	
				rest.remove(0);
				processRest(rest,restList);		
		}
		
	}
	

	public static void processAnyOrderList(org.mindswap.owl.OWLIndividualList<org.mindswap.owls.process.ControlConstruct> list, AnyOrder anyOrder){
			
		if(list.size()>0){	
			ControlConstructBag lst = ProcessFactory.eINSTANCE.createControlConstructBag();
			anyOrder.setComponents(lst);
			
			processFirst(list.get(0), lst);
		}
	
		if(list.size() > 1){
			list.remove(0);
			processRest(list, anyOrder.getComponents());
		}

	}
	
	
	private void initialiseContainers(){
		if (debug)System.out.print("initialiseContainers: ");
		if (debug)System.out.println(" action model is: " + ActionModel + " opera model is : " + UtilOL.OperaModel);
		
		
		File actionFile = new File ( ActionModel );
		if (actionFile.exists()){
			actionCol = loadActionCol ( URI.createURI(ActionModel) );
		}else{
			actionCol = ActionsFactory.eINSTANCE.createActionsCollection();
		}
		
		if (GENERATE_OPERA){
			File operaFile = new File ( UtilOL.OperaModel );
			if (operaFile.exists()){
				opera = UtilOL.loadOperA( URI.createURI(UtilOL.OperaModel) );
			}else{
				opera = OMFactory.eINSTANCE.createOperAModel();
				OM om = OMFactory.eINSTANCE.createOM();
				CS cs = OMFactory.eINSTANCE.createCS();
				Ontology ontology = OMFactory.eINSTANCE.createOntology();
				ontology.setOntologyID("Default");
				cs.getOntology().add(ontology);
				om.setCs(cs);
				opera.setOm(om);		
				
			}
			
			UtilOL.setOperaModel( opera );
		}			
		
	}
	
	private  void saveActionCol(ActionsCollection actionCol, org.eclipse.emf.common.util.URI actionURI){		
			if (debug)System.err.println("save actions collection " + actionCol + " at: "+ actionURI);
		
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("actions", new XMIResourceFactoryImpl());
			
			ResourceSet resSet = new ResourceSetImpl();
			Resource resource = resSet.createResource( actionURI );
			resource.getContents().add( actionCol );
		
			try {
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}	
	
	private static ActionsCollection loadActionCol(URI actionModel){
		
		ActionsPackage.eINSTANCE.eClass();		
	
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("actions", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(actionModel, true);
				
		ActionsCollection actionCol= (ActionsCollection) resource.getContents().get(0);	
		
		if (debug)System.out.println("load Actions num "  + actionCol.getActions().size());		
		
		return  actionCol;		
	}
			
	public boolean existsParticipant(String name){	
		for (Participant participant : actionCol.getParticipants()) {
			if( participant.getName().equalsIgnoreCase( name ) )
				return true;
		}
		return false;
	}
	
	public Participant getParticipant(String name){	
		for (Participant participant : actionCol.getParticipants()) {
			if( participant.getName().equalsIgnoreCase( name ) )
				return participant;
		}
		return null;
	}
	
	
	public static boolean existsAction(String name){	
			for (Action action : actionCol.getActions()) {
				if(action.getName().equalsIgnoreCase( name ) )
					return true;
			}
			return false;
	}
	
	public static Action getAction(String name){
		for (Action action : actionCol.getActions()) {
			if(action.getName().equalsIgnoreCase( name ) )
				return action;
		}
		return null;
	}
	
	public boolean existsParameter(String name){		
			for (Parameter parameter : actionCol.getParameters() ) {
				if( parameter.getName().equalsIgnoreCase(  name ) )
					return true;
			}
			return false;
	}
		
	public static Perform maptoPerform(org.mindswap.owls.process.Perform perf ){		
		Perform perform = ProcessFactory.eINSTANCE.createPerform();	
		
		org.mindswap.owls.process.Process pr = perf.getProcess();	
		
		perform.setName(perf.getLocalName() );
		
		Action action = null;
		if(existsAction(pr.getLocalName())==false){
			if(pr instanceof org.mindswap.owls.process.CompositeProcess ){
				action = processCompositeAction( (org.mindswap.owls.process.CompositeProcess)pr );
			}else{
				action = processAtomicAction( (org.mindswap.owls.process.AtomicProcess)pr );
			}
		
			actionCol.getActions().add( action );
			
		}else{
			action = getAction(pr.getLocalName());			
		}
				
		perform.setProcess( action);
		
		return perform;
	}

}

