package net.sf.ictalive.log.analysis_v2;

import java.util.Vector;
import net.sf.ictalive.operetta.OM.Role;

public class OperAObject {

	String name;
	Vector<Role> performedBy;
	
	public OperAObject(){}
	
	public OperAObject(String n){
		name = n;	
	}
	
	public void addPerformedBy(Vector<Role> n){
		performedBy = n;
	}
	
	public String getName(){ return name;}
	public Vector<Role> getPerformedBy() { return performedBy; }
	
}
