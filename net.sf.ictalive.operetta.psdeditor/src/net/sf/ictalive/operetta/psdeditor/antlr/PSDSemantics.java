package net.sf.ictalive.operetta.psdeditor.antlr;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import net.sf.ictalive.operetta.OM.Atom;
import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.Conjunction;
import net.sf.ictalive.operetta.OM.Constant;
import net.sf.ictalive.operetta.OM.Disjunction;
import net.sf.ictalive.operetta.OM.Function;
import net.sf.ictalive.operetta.OM.Implication;
import net.sf.ictalive.operetta.OM.Negation;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.PathFormula;
import net.sf.ictalive.operetta.OM.StateFormula;
import net.sf.ictalive.operetta.OM.Term;
import net.sf.ictalive.operetta.OM.Variable;
import net.sf.ictalive.operetta.psdeditor.antlr.PSDParser.Range;
import net.sf.ictalive.operetta.psdeditor.antlr.PSDParser.Ranges;

public class PSDSemantics {

	public static PathFormula semPath(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, Ranges paths1){
		return (PathFormula)createBinaryFromList(editingDomain, om, allRanges, paths1, 
				OMPackage.eINSTANCE.getUntil(), OMPackage.eINSTANCE.getUntil_FromPathFormula(), OMPackage.eINSTANCE.getUntil_UntilPathFormula()); 
	}

	public static PathFormula semPath1_0(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, StateFormula state){
		return (PathFormula)createShared(editingDomain, om, allRanges, startPos, endPos, OMPackage.eINSTANCE.getNext(),
                                    OMPackage.eINSTANCE.getNext_PathFormula(), state);
	}

	public static PathFormula semPath1_1(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, StateFormula state){
		return (PathFormula)createShared(editingDomain, om, allRanges, startPos, endPos, OMPackage.eINSTANCE.getSometime(),
                                    OMPackage.eINSTANCE.getSometime_PathFormula(), state);
	}

	public static PathFormula semPath1_2(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, StateFormula state){
		return (PathFormula)createShared(editingDomain, om, allRanges, startPos, endPos, OMPackage.eINSTANCE.getAlways(),
                                    OMPackage.eINSTANCE.getAlways_PathFormula(), state);
	}

	public static PathFormula semPath2(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, Ranges paths3){
		return (PathFormula)createBinaryFromList(editingDomain, om, allRanges, paths3, 
				OMPackage.eINSTANCE.getPathImplication(), OMPackage.eINSTANCE.getPathImplication_AntecedentPathFormula(), OMPackage.eINSTANCE.getPathImplication_ConsequentPathFormula()); 
	}

	public static PathFormula semPath3(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, Ranges paths4){
		return (PathFormula)createBinaryFromList(editingDomain, om, allRanges, paths4, 
				OMPackage.eINSTANCE.getPathDisjunction(), OMPackage.eINSTANCE.getPathDisjunction_LeftPathFormula(), OMPackage.eINSTANCE.getPathDisjunction_RightPathFormula()); 
	}


	public static PathFormula semPath4(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, Ranges paths5){
		return (PathFormula)createBinaryFromList(editingDomain, om, allRanges, paths5, 
				OMPackage.eINSTANCE.getPathConjunction(), OMPackage.eINSTANCE.getPathConjunction_LeftPathFormula(), OMPackage.eINSTANCE.getPathConjunction_RightPathFormula()); 
	}
	
	public static PathFormula semPath5(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, PathFormula path5){
		return (PathFormula)createShared(editingDomain, om, allRanges, startPos, endPos, OMPackage.eINSTANCE.getPathNegation(),
                                    OMPackage.eINSTANCE.getPathNegation_PathFormula(), path5);
	}

	public static StateFormula semState0_0(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, PathFormula path1){
		return (StateFormula)createShared(editingDomain, om, allRanges, startPos, endPos, OMPackage.eINSTANCE.getExistsPath(),
                                    OMPackage.eINSTANCE.getExistsPath_PathFormula(), path1);
	}

	public static StateFormula semState0_1(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, PathFormula path1){
		return (StateFormula)createShared(editingDomain, om, allRanges, startPos, endPos, OMPackage.eINSTANCE.getForAllPaths(),
                                    OMPackage.eINSTANCE.getForAllPaths_PathFormula(), path1);
	}

	public static StateFormula semState1(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, Ranges states2){
		return (StateFormula)createBinaryFromList(editingDomain, om, allRanges, states2, 
				OMPackage.eINSTANCE.getImplication(), OMPackage.eINSTANCE.getImplication_AntecedentStateFormula(), OMPackage.eINSTANCE.getImplication_ConsequentStateFormula()); 
	}

	public static StateFormula semState2(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, Ranges states3){
		return (StateFormula)createBinaryFromList(editingDomain, om, allRanges, states3, 
				OMPackage.eINSTANCE.getDisjunction(), OMPackage.eINSTANCE.getDisjunction_LeftStateFormula(), OMPackage.eINSTANCE.getDisjunction_RightStateFormula()); 
	}

	public static StateFormula semState3(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, Ranges states4){
		return (StateFormula)createBinaryFromList(editingDomain, om, allRanges, states4, 
				OMPackage.eINSTANCE.getConjunction(), OMPackage.eINSTANCE.getConjunction_LeftStateFormula(), OMPackage.eINSTANCE.getConjunction_RightStateFormula()); 
	}

	public static StateFormula semState4(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, StateFormula state4){
		return (StateFormula)createShared(editingDomain, om, allRanges, startPos, endPos, OMPackage.eINSTANCE.getNegation(),
                                    OMPackage.eINSTANCE.getNegation_StateFormula(), state4);
	}

	public static Atom semAtom(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, String ident, List<Term>maybeTerms){
		Atom a = (Atom)createShared(editingDomain, om, allRanges, startPos, endPos, OMPackage.eINSTANCE.getAtom(),		
                OMPackage.eINSTANCE.getAtom_Predicate(), ident, OMPackage.eINSTANCE.getAtom_Arguments(), maybeTerms);
		return a;
	}

	public static Term semTerm_0(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, String ident, List<Term>maybeTerms){
		return (Function)createShared(editingDomain, om, allRanges, startPos, endPos, OMPackage.eINSTANCE.getFunction(),		
                    OMPackage.eINSTANCE.getFunction_Name(), ident, OMPackage.eINSTANCE.getFunction_Arguments(), maybeTerms);
	}
	
	public static Term semTerm_1(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, String var){
		return (Variable)createShared(editingDomain, om, allRanges, startPos, endPos, OMPackage.eINSTANCE.getVariable(),		
		                    OMPackage.eINSTANCE.getVariable_Name(), var);
	}

	public static Term semTerm_2(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, String number){
		return (Constant)createShared(editingDomain, om, allRanges, startPos, endPos, OMPackage.eINSTANCE.getConstant(),		
		                    OMPackage.eINSTANCE.getConstant_Name(), number);
	}

	public static EObject createShared(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, EClass eClass,
         	EStructuralFeature feature, Object value) {
		
		EObject eObject = null;
		
		if (editingDomain != null) // Only use sharing for final parse (when editing domain is set)
			if (OMPackage.eINSTANCE.getPartialStateDescription().isSuperTypeOf(eClass))
				eObject = find(eClass, feature, value, om.getCs().getFormulas());
			else
				eObject = find(eClass, feature, value, om.getCs().getTerms());
		
		if ( eObject == null) {
			eObject = create(editingDomain, om, allRanges, startPos, endPos, eClass);
			setFeature(editingDomain, eObject, feature, value);
		}
		return eObject;
	}
	// todo: document
	public static EObject createShared(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, EClass eClass,
			EStructuralFeature feature1, Object value1, EStructuralFeature feature2, Object value2) {
		
		EObject eObject = null;
		
		if (editingDomain != null) // Only use sharing for final parse (when editing domain is set)
			if (OMPackage.eINSTANCE.getPartialStateDescription().isSuperTypeOf(eClass))
				eObject = find(eClass, feature1, value1, feature2, value2, om.getCs().getFormulas());
			else
				eObject = find(eClass, feature1, value1, feature2, value2, om.getCs().getTerms());
		// Encapsulating the getFormulas/getTerms in a method is tricky and maybe not even possible.

		if ( eObject == null) {
			eObject = create(editingDomain, om, allRanges, startPos, endPos, eClass);
			setFeature(editingDomain, eObject, feature1, value1);
			setFeature(editingDomain, eObject, feature2, value2);
		}
		return eObject;
	}

	public static <O> EObject createShared(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, EClass eClass,
			EStructuralFeature feature, Object value, EReference reference, List<O> values) {
		
		EObject eObject = null;
		//System.out.println("creating shared "+ eClass + ": "+values);
		if (editingDomain != null) // Only use sharing for final parse (when editing domain is set)
			if (OMPackage.eINSTANCE.getPartialStateDescription().isSuperTypeOf(eClass))
				eObject = find(eClass, feature, value, reference, values, om.getCs().getFormulas());
			else
				eObject = find(eClass, feature, value, reference, values, om.getCs().getTerms());
		// Encapsulating the getFormulas/getTerms in a method is tricky and maybe not even possible.

		if ( eObject == null) {
			eObject = create(editingDomain, om, allRanges, startPos, endPos, eClass);
			setFeature(editingDomain, eObject, feature, value);
			if (values != null)
				addToReference(editingDomain, eObject, reference, values);
		}
		return eObject;
	}

	/*
	 * Searches list for an object of type eClass for which feature has the specified value.
	 */
	public static <T extends EObject> EObject find(EClass eClass, EStructuralFeature feature, Object value, List<T> list) {
		for (T x : list) {
			if ( x.eClass() == eClass && x.eGet(feature) != null && x.eGet(feature).equals(value) )
				return x;
		}
		return null;
	}

	/*
	 * Searches list for an object of type eClass for which feature1 has value1 and feature2 has value2.
	 */
	public static <T extends EObject> EObject find(EClass eClass, EStructuralFeature feature1, Object value1, EStructuralFeature feature2, Object value2, List<T> list) {
		for (T x : list) {
			if ( x.eClass() == eClass && x.eGet(feature1) != null && x.eGet(feature2) != null && x.eGet(feature1).equals(value1) && x.eGet(feature2).equals(value2) )
				return x;
		}
		return null;
	}

	/*
	 * Searches list for an object of type eClass for which feature has the specified value and reference corresponds to the list values.
	 */
	public static <T extends EObject> EObject find(EClass eClass, EStructuralFeature feature, Object value, EReference reference, List values, List<T> list) {
		for (T x : list) {
			// need to check whether reference is in x's reference, otherwise we get a null pointer exception. For features, there is no problem if eGet is called for a non-existent feature.
			if ( x.eClass() == eClass && x.eGet(feature) != null && x.eClass().getEAllReferences().contains(reference) && x.eGet(reference) != null &&  
					x.eGet(feature).equals(value) && (x.eGet(reference)).equals(values) ) {
				return x;
			}
		}
		return null;
	}

	public static EObject create(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, int startPos, int endPos, EClass eClass) {
		EObject newEObject = OMFactory.eINSTANCE.create(eClass);
		allRanges.track(startPos, endPos, newEObject);

		EList containerList = newEObject instanceof PartialStateDescription ? om.getCs().getFormulas() : om.getCs().getTerms(); 
		
		if (editingDomain == null)
			containerList.add(newEObject);
		else
			editingDomain.getCommandStack().execute(
					AddCommand.create(editingDomain, om.getCs(), containerList, newEObject));
			

		return newEObject;
	}

	public static void setFeature(TransactionalEditingDomain editingDomain, EObject owner, EStructuralFeature feature, Object value) {
		if (editingDomain == null)
			owner.eSet(feature, value);
		else
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, owner, feature, value));
		
	}

	public static <O> void addToReference(TransactionalEditingDomain editingDomain, EObject owner, EReference reference, List<O> values) {
		if (editingDomain == null) {
			((EList<O>)owner.eGet(reference)).addAll(values);
		}
		else
			editingDomain.getCommandStack().execute(
						AddCommand.create(editingDomain, owner, reference, values));
	}
	
	// binary structure is turned into n-ary structure by the parser (otherwise it is left-recursive)
	// here we make it binary again. The Ranges argument contains the operands, each with a range from the start of the
	// expression to the end of the operand. The created binary structure is left associative.

	public static Object createBinaryFromList(TransactionalEditingDomain editingDomain, OM om, Ranges allRanges, Ranges ranges, 
			EClass eClass, EStructuralFeature leftFeature, EStructuralFeature rightFeature) {
		Range state = ranges.remove(0);		
		Object f = state.object;  
		for (Range psdRange : ranges) {
			f = createShared(editingDomain, om, allRanges, psdRange.startPos, psdRange.endPos, eClass,
					leftFeature, f,
					rightFeature, psdRange.object);
		}
		return f;
	}
}
