package net.sf.ictalive.operetta.OM.util;

import java.util.List;

import net.sf.ictalive.operetta.OM.Always;
import net.sf.ictalive.operetta.OM.ExistsPath;
import net.sf.ictalive.operetta.OM.ForAllPaths;
import net.sf.ictalive.operetta.OM.Next;
import net.sf.ictalive.operetta.OM.PathFormula;
import net.sf.ictalive.operetta.OM.Sometime;
import net.sf.ictalive.operetta.OM.StateFormula;


public class PrettyPrint {

	public static String prettyPrintPrefix(Pretty parent, String operator, Pretty operand) {
		return operator + ppPrecedenceAndNull(parent, operand);
	}

	// PRECONDITION: all binary operators are left associative.
	public static String prettyPrintBinary(Pretty parent, String operator, Pretty left, Pretty right) {
		String rightOperandText = ppPrecedenceAndNull(parent, right);
		if(right != null) 
			if (parent.getPrecedence() == right.getPrecedence())
				rightOperandText = "(" + rightOperandText + ")";
		return ppPrecedenceAndNull(parent, left) + operator + rightOperandText;
	}

	// PRECONDITION: elements cannot be null (same as in write() pretty printers)
	// Children are always terms, so no need to insert []'s. Furthermore, precedence is not applicable because children are presented as a list.
	public static String prettyPrintList(String open, String close, String separator, List<Pretty> elements) {
		String elementsText = elements.size() == 0 ? ""  : elements.get(0).prettyPrint();
		
		for (int i = 1; i < elements.size(); i++) {
			elementsText += ", " + elements.get(i).prettyPrint();
		}
		return open + elementsText + close;
	}

	static String ppPrecedenceAndNull(Pretty parent, Pretty p) {
		if(p == null) return "<null>";
		
		String result = p.prettyPrint();
		if (p instanceof StateFormula && ( !(parent instanceof StateFormula) && !(parent instanceof Next || parent instanceof Sometime || parent instanceof Always) ||
		                                 	parent instanceof ExistsPath ||
		                                 	parent instanceof ForAllPaths))
			return "["+result+"]";
		else
			if (parent instanceof StateFormula && !(p instanceof StateFormula))
				return result;
			else
				if (parent.getPrecedence() > p.getPrecedence())
					return "("+result+")";
				else	
					return result; 
	}
	
	// add [] if p is a StateFormula
	public static String prettyPrintPSD(Pretty p) {
		String prettyP = p == null ? "<null>" : p.prettyPrint();
		
		if (p instanceof StateFormula) 
			return "["+prettyP+"]";
		else
			return prettyP;
	}
}
