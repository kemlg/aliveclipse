/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl.impl;

import net.sf.ictalive.rules.swrl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwrlFactoryImpl extends EFactoryImpl implements SwrlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SwrlFactory init() {
		try {
			SwrlFactory theSwrlFactory = (SwrlFactory)EPackage.Registry.INSTANCE.getEFactory("http://ict-alive.sourceforge.net/swrl"); 
			if (theSwrlFactory != null) {
				return theSwrlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SwrlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwrlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SwrlPackage.ATOM_LIST: return createAtomList();
			case SwrlPackage.BUILT_IN_ATOM: return createBuiltInAtom();
			case SwrlPackage.CLASS_ATOM: return createClassAtom();
			case SwrlPackage.INDIVIDUAL_PROPERTY_ATOM: return createIndividualPropertyAtom();
			case SwrlPackage.SAME_INDIVIDUAL_ATOM: return createSameIndividualAtom();
			case SwrlPackage.DIFFERENT_INDIVIDUALS_ATOM: return createDifferentIndividualsAtom();
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM: return createDatavaluedPropertyAtom();
			case SwrlPackage.DATA_RANGE_ATOM: return createDataRangeAtom();
			case SwrlPackage.DATA_VALUE: return createDataValue();
			case SwrlPackage.INDIVIDUAL_VARIABLE: return createIndividualVariable();
			case SwrlPackage.INDIVIDUAL_ID: return createIndividualID();
			case SwrlPackage.DATA_VARIABLE: return createDataVariable();
			case SwrlPackage.DATA_LITERAL: return createDataLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SwrlPackage.DEFAULT_BUILT_IN:
				return createDefaultBuiltInFromString(eDataType, initialValue);
			case SwrlPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SwrlPackage.DEFAULT_BUILT_IN:
				return convertDefaultBuiltInToString(eDataType, instanceValue);
			case SwrlPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomList createAtomList() {
		AtomListImpl atomList = new AtomListImpl();
		return atomList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInAtom createBuiltInAtom() {
		BuiltInAtomImpl builtInAtom = new BuiltInAtomImpl();
		return builtInAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAtom createClassAtom() {
		ClassAtomImpl classAtom = new ClassAtomImpl();
		return classAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualPropertyAtom createIndividualPropertyAtom() {
		IndividualPropertyAtomImpl individualPropertyAtom = new IndividualPropertyAtomImpl();
		return individualPropertyAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SameIndividualAtom createSameIndividualAtom() {
		SameIndividualAtomImpl sameIndividualAtom = new SameIndividualAtomImpl();
		return sameIndividualAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferentIndividualsAtom createDifferentIndividualsAtom() {
		DifferentIndividualsAtomImpl differentIndividualsAtom = new DifferentIndividualsAtomImpl();
		return differentIndividualsAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatavaluedPropertyAtom createDatavaluedPropertyAtom() {
		DatavaluedPropertyAtomImpl datavaluedPropertyAtom = new DatavaluedPropertyAtomImpl();
		return datavaluedPropertyAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRangeAtom createDataRangeAtom() {
		DataRangeAtomImpl dataRangeAtom = new DataRangeAtomImpl();
		return dataRangeAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue createDataValue() {
		DataValueImpl dataValue = new DataValueImpl();
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualVariable createIndividualVariable() {
		IndividualVariableImpl individualVariable = new IndividualVariableImpl();
		return individualVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualID createIndividualID() {
		IndividualIDImpl individualID = new IndividualIDImpl();
		return individualID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataVariable createDataVariable() {
		DataVariableImpl dataVariable = new DataVariableImpl();
		return dataVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLiteral createDataLiteral() {
		DataLiteralImpl dataLiteral = new DataLiteralImpl();
		return dataLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultBuiltIn createDefaultBuiltInFromString(EDataType eDataType, String initialValue) {
		DefaultBuiltIn result = DefaultBuiltIn.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultBuiltInToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwrlPackage getSwrlPackage() {
		return (SwrlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SwrlPackage getPackage() {
		return SwrlPackage.eINSTANCE;
	}

} //SwrlFactoryImpl
