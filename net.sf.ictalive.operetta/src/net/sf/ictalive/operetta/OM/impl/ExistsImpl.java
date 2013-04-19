/**
 */
package net.sf.ictalive.operetta.OM.impl;

import net.sf.ictalive.operetta.OM.Exists;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.util.PrettyPrint;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Exists</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class ExistsImpl extends FirstOrderQuantifierImpl implements Exists {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExistsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.EXISTS;
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
		return 22;
	}

	@Override
	public String prettyPrint() {
		return PrettyPrint.prettyPrintPrefix(this, "∃ ", formula);
	}

} // ExistsImpl
