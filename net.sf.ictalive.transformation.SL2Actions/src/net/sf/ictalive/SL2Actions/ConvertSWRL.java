package net.sf.ictalive.SL2Actions;


//import impl.jena.SWRLExpressionImpl;

//import org.mindswap.owl.OWLDataProperty;
//import org.mindswap.owl.list.OWLList;
//import org.mindswap.swrl.DataPropertyAtom;
//import org.mindswap.swrl.SWRLDataObject;
//import org.mindswap.swrl.SWRLIndividualObject;
//import com.clarkparsia.pellet.rules.model.DatavaluedPropertyAtom;


import net.sf.ictalive.owls.expr.Condition;
import net.sf.ictalive.operetta.OM.Concept;
import net.sf.ictalive.rules.swrl.*;

public class ConvertSWRL {
	
			
	public static IndividualVariable mapIndividualObject(org.mindswap.swrl.SWRLIndividualObject iObject){
		IndividualVariable indVar =  SwrlFactory.eINSTANCE.createIndividualVariable();
		
		indVar.setName( iObject.getLocalName() );
		
		Concept c = UtilOL.processConcept( iObject, null);
		
		indVar.setConceptType(c);
		
		return indVar;		
	}
	
	public static DObject mapDataObject(org.mindswap.swrl.SWRLDataObject dObject){
		
		DataVariable dataVar =  SwrlFactory.eINSTANCE.createDataVariable();
		
		dataVar.setName( dObject.toString() );	
		
		return dataVar;		
	}
	
	public static SameIndividualAtom mapSameIndividualAtom( org.mindswap.swrl.SameIndividualAtom sa ){
		if(ConvertSL2Actions.debug)System.out.println("   mapSameIndividualAtom " + sa );		
		SameIndividualAtom atom =  SwrlFactory.eINSTANCE.createSameIndividualAtom();
					
		org.mindswap.swrl.SWRLIndividualObject   indobj1 = sa.getArgument1();					
		atom.getArgs().add( mapIndividualObject(indobj1));
		
		org.mindswap.swrl.SWRLIndividualObject   indobj2 = sa.getArgument2();			
		atom.getArgs().add( mapIndividualObject(indobj2));
		
		return atom;		
	}
	
	
	public static DifferentIndividualsAtom  mapDifferentIndividualsAtom( org.mindswap.swrl.DifferentIndividualsAtom da ){
		if(ConvertSL2Actions.debug)System.out.println("   mapSameIndividualAtom " + da );
		
		DifferentIndividualsAtom  atom =  SwrlFactory.eINSTANCE.createDifferentIndividualsAtom();
					
		org.mindswap.swrl.SWRLIndividualObject   indobj1 = da.getArgument1();		
		atom.getArgs().add( mapIndividualObject(indobj1));
				
		org.mindswap.swrl.SWRLIndividualObject   indobj2 = da.getArgument2();		
		atom.getArgs().add( mapIndividualObject(indobj2));
		
		return atom;		
	}
	
	public static ClassAtom mapClassAtom( org.mindswap.swrl.ClassAtom ca ){
		if(ConvertSL2Actions.debug)System.out.println("   mapClassAtom " + ca );
		ClassAtom atom =  SwrlFactory.eINSTANCE.createClassAtom();
		
		org.mindswap.owl.OWLClass predicate =   ca.getClassPredicate();		
		Concept c = UtilOL.processConcept( predicate, null);		
		atom.setClassPredicate( c  );
		
		org.mindswap.swrl.SWRLIndividualObject   indobj = ca.getArgument1();			
		atom.setArgument1( mapIndividualObject(indobj)   );		
		
		return atom;
		
	}
	
	public static IndividualPropertyAtom mapIndividualPropertyAtom( org.mindswap.swrl.IndividualPropertyAtom pa ){
		if(ConvertSL2Actions.debug)System.out.println("   mapIndividualPropertyAtom " + pa );
		IndividualPropertyAtom atom =  SwrlFactory.eINSTANCE.createIndividualPropertyAtom();
		
		org.mindswap.owl.OWLObjectProperty objProp =   pa.getPropertyPredicate();		
		Concept c = UtilOL.processConcept(objProp, null);			
		atom.setPropertyPredicate( c  );
		
		org.mindswap.swrl.SWRLIndividualObject   indobj = pa.getArgument1();	
		atom.setArgument1( mapIndividualObject(indobj)   );
		
		org.mindswap.swrl.SWRLIndividualObject indobj2 = pa.getArgument2();			
		atom.setArgument2( mapIndividualObject(indobj2)   );		
		
		return atom;
		
	}
	
	public static DatavaluedPropertyAtom mapDataPropertyAtom(org.mindswap.swrl.DataPropertyAtom dp, Condition condition){
		if(ConvertSL2Actions.debug)System.out.println("    mapDataPropertyAtom " + dp );
		DatavaluedPropertyAtom atom =  SwrlFactory.eINSTANCE.createDatavaluedPropertyAtom();
	
		org.mindswap.owl.OWLDataProperty dataProp =   dp.getPropertyPredicate();		
		Concept c = UtilOL.processConcept(dataProp, null);			
		atom.setPropertyPredicate( c  );
		
		org.mindswap.swrl.SWRLIndividualObject   indobj = dp.getArgument1();					
		atom.setArgument1( mapIndividualObject(indobj)   );
		
		org.mindswap.swrl.SWRLDataObject dataobj = dp.getArgument2();		
		atom.setArgument2( mapDataObject(dataobj)  );
		
		//for condition
		String id = dataProp.getLocalName() + "(" + indobj.getLocalName()+ "," + dataobj + ")";//obj.getArgument2().get 
		condition.setName( id );
		
		return atom;		
	}
	
	protected static void processOWLList(org.mindswap.owl.list.OWLList<org.mindswap.swrl.Atom> lstAtom, Condition cond){
			
		org.mindswap.swrl.Atom f = lstAtom.getFirst();
				
		if(f instanceof org.mindswap.swrl.DataPropertyAtom){			
			((AtomList)cond.getExpressionBody()).getAtom().add(  mapDataPropertyAtom( (org.mindswap.swrl.DataPropertyAtom)f, cond ) );		
		}		
		else if(f instanceof org.mindswap.swrl.IndividualPropertyAtom){		
			((AtomList)cond.getExpressionBody()).getAtom().add(  mapIndividualPropertyAtom( (org.mindswap.swrl.IndividualPropertyAtom)f) );//DataPropertyAtom( (org.mindswap.swrl.DataPropertyAtom)f);		
		}
		else if(f instanceof org.mindswap.swrl.ClassAtom){				
			((AtomList)cond.getExpressionBody()).getAtom().add(  mapClassAtom( (org.mindswap.swrl.ClassAtom)f) );//DataPropertyAtom( (org.mindswap.swrl.DataPropertyAtom)f);		
		}
		else if(f instanceof org.mindswap.swrl.SameIndividualAtom){				
			((AtomList)cond.getExpressionBody()).getAtom().add(  mapSameIndividualAtom( (org.mindswap.swrl.SameIndividualAtom)f) );//DataPropertyAtom( (org.mindswap.swrl.DataPropertyAtom)f);		
		}
		else if(f instanceof org.mindswap.swrl.DifferentIndividualsAtom){				
			((AtomList)cond.getExpressionBody()).getAtom().add(  mapDifferentIndividualsAtom( (org.mindswap.swrl.DifferentIndividualsAtom)f) );//DataPropertyAtom( (org.mindswap.swrl.DataPropertyAtom)f);		
		}
		else if(f instanceof org.mindswap.swrl.BuiltinAtom){				
			System.err.println("   build in type - not supported " + f.getClass());	
		}		
		
	}	
	
}
