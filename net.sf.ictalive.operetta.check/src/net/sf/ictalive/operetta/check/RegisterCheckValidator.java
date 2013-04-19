package net.sf.ictalive.operetta.check;

import java.util.ArrayList;

import org.eclipse.ui.IStartup;
import org.eclipse.xtend.typesystem.emf.check.CheckRegistry;
import net.sf.ictalive.operetta.OM.OMPackage;

public class RegisterCheckValidator implements IStartup {
	
	public void earlyStartup() {
		CheckRegistry.getInstance().registerCheckFile(
				OMPackage.eINSTANCE, "check/om.chk", false, new ArrayList());
	}
	
}
