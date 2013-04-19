package net.sf.ictalive.SL2Actions;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.operetta.OM.Concept;
import net.sf.ictalive.operetta.OM.ConceptType;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.OperAModel;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.owls.process.Parameter;
import net.sf.ictalive.owls.process.Participant;
import net.sf.ictalive.operetta.OM.Atom;

public class UtilOL {
	
	private static OperAModel opera;
	
	private static String FileNameGEN = "gen";
	private static org.eclipse.emf.common.util.URI OutFolder = org.eclipse.emf.common.util.URI.createFileURI("out");
	//private static String OperaModel =  OutFolder + "/OrganisationModel/"+ FileNameGEN +".opera";
	public static String OperaModel =  "gen.opera";

	
	public static void setOperaModel(OperAModel myOpera){		
		opera = myOpera;
	}
	
	//add also to opera
	public static Atom processAtom(org.mindswap.swrl.DataPropertyAtom obj, boolean createConcept){
		Atom atom = null;
		
		String id = obj.getPropertyPredicate().getLocalName() + "(" + obj.getArgument1().getLocalName()+ "," + "SS)" ;//obj.getArgument2().get 
		if (ConvertSL2Actions.debug)System.out.println("  atom id " + id);
		
		if(!existsAtom( id )) {
			atom  = OMFactory.eINSTANCE.createAtom();
			if (ConvertSL2Actions.debug)System.out.println("  creating atom " + id);
			
			if(createConcept){
				Concept concept = processConcept(obj, null);	
				atom.setConcept( concept );
			}
					
			atom.setPredicate(id);
			
			opera.getOm().getCs().getFormulas().add( atom );
			
		}else{
			if (ConvertSL2Actions.debug)System.out.println("  getting existing atom " + id);
			atom = (Atom)getAtom( id );
			
		}
		return atom;
	}
	
	public static Concept processConcept(Object obj, Parameter parameter){
		Concept concept = null;
		
		//Parameter
		if(obj instanceof org.mindswap.owls.process.variable.Parameter){
			org.mindswap.owls.process.variable.Parameter p = (org.mindswap.owls.process.variable.Parameter)obj;
			
			if(!existsConcept(p.getURI().toString())) {
			
				concept = OMFactory.eINSTANCE.createConcept();
				
				concept.setConcept( p.getName() );
				concept.setURI( p.getURI().toString() );
				concept.setType( ConceptType.CLASS );
				
				if (ConvertSL2Actions.debug)System.out.println("  adding concept : "+  concept.getConcept());
								
				opera.getOm().getCs().getDefaultOntology().getClasses().add( concept );
				
				parameter.getParameterType().add( concept );
				
			
			}else{
				concept = getConcept( p.getURI().toString() );
				
				parameter.getParameterType().add( concept );
				
				if (ConvertSL2Actions.debug)System.out.println("  getting existing concept : "+  concept.getConcept());
			}
		}		
		//Predicate
		else if(obj instanceof org.mindswap.owl.OWLProperty){
			
			org.mindswap.owl.OWLProperty predicate = (org.mindswap.owl.OWLProperty) obj;
			
			if(!existsConcept(predicate.getURI().toString())) {
				
				concept = OMFactory.eINSTANCE.createConcept();
				
				concept.setConcept( predicate.getLocalName() );
				concept.setURI( predicate.getURI().toString() );
				concept.setType( ConceptType.CLASS );
				
				if (ConvertSL2Actions.debug)System.out.println("  adding concept : "+  concept.getConcept());
								
				opera.getOm().getCs().getDefaultOntology().getClasses().add( concept );
						
			
			}else{
				concept = getConcept( predicate.getURI().toString() );				
				
				if (ConvertSL2Actions.debug)System.out.println("  getting existing concept : "+  concept.getConcept());
			}
		}
		//Class Predicate
		else if(obj instanceof org.mindswap.owl.OWLClass){
			
			org.mindswap.owl.OWLClass predicate = (org.mindswap.owl.OWLClass) obj;
			
			if(!existsConcept(predicate.getURI().toString())) {
				
				concept = OMFactory.eINSTANCE.createConcept();
				
				concept.setConcept( predicate.getLocalName() );
				concept.setURI( predicate.getURI().toString() );
				concept.setType( ConceptType.CLASS );
				
				if (ConvertSL2Actions.debug)System.out.println("  adding concept : "+  concept.getConcept());
								
				opera.getOm().getCs().getDefaultOntology().getClasses().add( concept );
					
			}else{
				concept = getConcept( predicate.getURI().toString() );
				
				if (ConvertSL2Actions.debug)System.out.println("  getting existing concept : "+  concept.getConcept());
			}
		}
		//Argument
		else if(obj instanceof org.mindswap.swrl.SWRLIndividualObject){
			
			org.mindswap.swrl.SWRLIndividualObject arg = (org.mindswap.swrl.SWRLIndividualObject) obj;
			
			if(!existsConcept(arg.getURI().toString())) {
				
				concept = OMFactory.eINSTANCE.createConcept();
				
				concept.setConcept( arg.getLocalName() );
				concept.setURI( arg.getURI().toString() );
				concept.setType( ConceptType.CLASS );
				
				if (ConvertSL2Actions.debug)System.out.println("  adding concept : "+  concept.getConcept());
								
				opera.getOm().getCs().getDefaultOntology().getClasses().add( concept );
							
			}else{
				concept = getConcept( arg.getURI().toString() );
			
				if (ConvertSL2Actions.debug)System.out.println("  getting existing concept : "+  concept.getConcept());
			}
		}
		return concept;
	}
	
	public static boolean existsConcept(String uri){	
		for (Concept concept : opera.getOm().getCs().getDefaultOntology().getClasses()) {
			if(concept.getURI().equalsIgnoreCase( uri) )
				return true;
		}
		return false;
	}
	
	public static boolean existsAtom(String id){	
		for (PartialStateDescription formula : opera.getOm().getCs().getFormulas() ) {
			if(formula.getID().equalsIgnoreCase( id) )
				return true;
		}
		return false;
	}
	
	public static PartialStateDescription getAtom(String id){	
		for (PartialStateDescription formula : opera.getOm().getCs().getFormulas() ) {
			if(formula.getID().equalsIgnoreCase( id) )
				return formula;
		}
		return null;
	}
	
	public static Concept getConcept(String uri){	
		for (Concept concept : opera.getOm().getCs().getDefaultOntology().getClasses()) {
			if(concept.getURI().equalsIgnoreCase( uri) )
				return concept;
		}
		return null;
	}
	
	public static OperAModel loadOperA (URI operaModel){
		
		ActionsPackage.eINSTANCE.eClass();
		NotationPackage.eINSTANCE.eClass();		
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("opera", new XMIResourceFactoryImpl());
	
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(operaModel, true);
				
		OperAModel opera= (OperAModel) resource.getContents().get(0);	
		
		if (ConvertSL2Actions.debug)System.out.println("load Opera - num of concepts are "  + opera.getOm().getCs().getDefaultOntology().getClasses().size());		
		
		return  opera;		
	}
	
	public static  void saveOperA(OperAModel opera, URI operaURI){		
			if (ConvertSL2Actions.debug)System.err.println("save opera model " + opera+ " at: "+ operaURI);
		
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("opera", new XMIResourceFactoryImpl());
			
			ResourceSet resSet = new ResourceSetImpl();
			Resource resource = resSet.createResource( operaURI );
			resource.getContents().add( opera );
			
			Diagram is = NotationFactory.eINSTANCE.createDiagram();
			is.setName("IS_Diagram");
			is.setType("IS");
			is.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
			
			resource.getContents().add( is );
			
			Diagram ss = NotationFactory.eINSTANCE.createDiagram();
			ss.setName("SS_Diagram");
			ss.setType("SS");
			ss.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
			
			resource.getContents().add( ss );
			
			try {
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}		
	
	
}
