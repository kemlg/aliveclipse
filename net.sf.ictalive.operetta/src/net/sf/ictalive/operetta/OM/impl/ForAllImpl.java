/**
 */
package net.sf.ictalive.operetta.OM.impl;

import net.sf.ictalive.operetta.OM.ForAll;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.util.PrettyPrint;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>For All</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class ForAllImpl extends FirstOrderQuantifierImpl implements ForAll {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ForAllImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.FOR_ALL;
	}

	@Override
	public EList<PartialStateDescription> getSubFormulas() {
		EList<PartialStateDescription> result = new BasicEList<PartialStateDescription>();
		
		if (formula != null) {
			result.add(formula);
			result.addAll(formula.getSubFormulas());
		}
		
		return result;
	}

	@Override
	public int getPrecedence() {
		return 23;
	}

	@Override
	public String prettyPrint() {
		return PrettyPrint.prettyPrintPrefix(this, "∀ ", formula);
	}

} // ForAllImpl
