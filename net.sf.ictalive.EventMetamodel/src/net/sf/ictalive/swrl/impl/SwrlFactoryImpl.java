/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl.impl;

import net.sf.ictalive.swrl.*;

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
public class SwrlFactoryImpl extends EFactoryImpl implements SwrlFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SwrlFactory init()
	{
		try
		{
			SwrlFactory theSwrlFactory = (SwrlFactory)EPackage.Registry.INSTANCE.getEFactory("http://swrl/v0.5"); 
			if (theSwrlFactory != null)
			{
				return theSwrlFactory;
			}
		}
		catch (Exception exception)
		{
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
	public SwrlFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case SwrlPackage.RULE: return createRule();
			case SwrlPackage.ANNOTATION: return createAnnotation();
			case SwrlPackage.ANTECEDENT: return createAntecedent();
			case SwrlPackage.CONSEQUENT: return createConsequent();
			case SwrlPackage.CLASS_ATOM: return createClassAtom();
			case SwrlPackage.INDIVIDUAL_PROPERTY_ATOM: return createIndividualPropertyAtom();
			case SwrlPackage.INDIVIDUAL_VARIABLE: return createIndividualVariable();
			case SwrlPackage.INDIVIDUAL_ID: return createIndividualID();
			case SwrlPackage.SAME_AS_ATOM: return createSameAsAtom();
			case SwrlPackage.DIFFERENT_FROM_ATOM: return createDifferentFromAtom();
			case SwrlPackage.BUILT_IN_ATOM: return createBuiltInAtom();
			case SwrlPackage.DATA_VARIABLE: return createDataVariable();
			case SwrlPackage.DATA_LITERAL: return createDataLiteral();
			case SwrlPackage.DATA_RANGE_ATOM: return createDataRangeAtom();
			case SwrlPackage.DATA_VALUED_PROPERTY_ATOM: return createDataValuedPropertyAtom();
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
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case SwrlPackage.RULE_TYPE:
				return createRuleTypeFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case SwrlPackage.RULE_TYPE:
				return convertRuleTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule()
	{
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation()
	{
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Antecedent createAntecedent()
	{
		AntecedentImpl antecedent = new AntecedentImpl();
		return antecedent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consequent createConsequent()
	{
		ConsequentImpl consequent = new ConsequentImpl();
		return consequent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAtom createClassAtom()
	{
		ClassAtomImpl classAtom = new ClassAtomImpl();
		return classAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualPropertyAtom createIndividualPropertyAtom()
	{
		IndividualPropertyAtomImpl individualPropertyAtom = new IndividualPropertyAtomImpl();
		return individualPropertyAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualVariable createIndividualVariable()
	{
		IndividualVariableImpl individualVariable = new IndividualVariableImpl();
		return individualVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualID createIndividualID()
	{
		IndividualIDImpl individualID = new IndividualIDImpl();
		return individualID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SameAsAtom createSameAsAtom()
	{
		SameAsAtomImpl sameAsAtom = new SameAsAtomImpl();
		return sameAsAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferentFromAtom createDifferentFromAtom()
	{
		DifferentFromAtomImpl differentFromAtom = new DifferentFromAtomImpl();
		return differentFromAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInAtom createBuiltInAtom()
	{
		BuiltInAtomImpl builtInAtom = new BuiltInAtomImpl();
		return builtInAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataVariable createDataVariable()
	{
		DataVariableImpl dataVariable = new DataVariableImpl();
		return dataVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLiteral createDataLiteral()
	{
		DataLiteralImpl dataLiteral = new DataLiteralImpl();
		return dataLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRangeAtom createDataRangeAtom()
	{
		DataRangeAtomImpl dataRangeAtom = new DataRangeAtomImpl();
		return dataRangeAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValuedPropertyAtom createDataValuedPropertyAtom()
	{
		DataValuedPropertyAtomImpl dataValuedPropertyAtom = new DataValuedPropertyAtomImpl();
		return dataValuedPropertyAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleType createRuleTypeFromString(EDataType eDataType, String initialValue)
	{
		RuleType result = RuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwrlPackage getSwrlPackage()
	{
		return (SwrlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SwrlPackage getPackage()
	{
		return SwrlPackage.eINSTANCE;
	}

} //SwrlFactoryImpl
