/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl.util;

import net.sf.ictalive.swrl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.swrl.SwrlPackage
 * @generated
 */
public class SwrlAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SwrlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwrlAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = SwrlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwrlSwitch<Adapter> modelSwitch =
		new SwrlSwitch<Adapter>()
		{
			@Override
			public Adapter caseRule(Rule object)
			{
				return createRuleAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object)
			{
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAtom(Atom object)
			{
				return createAtomAdapter();
			}
			@Override
			public Adapter caseAntecedent(Antecedent object)
			{
				return createAntecedentAdapter();
			}
			@Override
			public Adapter caseConsequent(Consequent object)
			{
				return createConsequentAdapter();
			}
			@Override
			public Adapter caseClassAtom(ClassAtom object)
			{
				return createClassAtomAdapter();
			}
			@Override
			public Adapter caseIndividualPropertyAtom(IndividualPropertyAtom object)
			{
				return createIndividualPropertyAtomAdapter();
			}
			@Override
			public Adapter caseIndividualObject(IndividualObject object)
			{
				return createIndividualObjectAdapter();
			}
			@Override
			public Adapter caseIndividualVariable(IndividualVariable object)
			{
				return createIndividualVariableAdapter();
			}
			@Override
			public Adapter caseIndividualID(IndividualID object)
			{
				return createIndividualIDAdapter();
			}
			@Override
			public Adapter caseSameAsAtom(SameAsAtom object)
			{
				return createSameAsAtomAdapter();
			}
			@Override
			public Adapter caseDifferentFromAtom(DifferentFromAtom object)
			{
				return createDifferentFromAtomAdapter();
			}
			@Override
			public Adapter caseBuiltInAtom(BuiltInAtom object)
			{
				return createBuiltInAtomAdapter();
			}
			@Override
			public Adapter caseDataObject(DataObject object)
			{
				return createDataObjectAdapter();
			}
			@Override
			public Adapter caseDataVariable(DataVariable object)
			{
				return createDataVariableAdapter();
			}
			@Override
			public Adapter caseDataLiteral(DataLiteral object)
			{
				return createDataLiteralAdapter();
			}
			@Override
			public Adapter caseDataRangeAtom(DataRangeAtom object)
			{
				return createDataRangeAtomAdapter();
			}
			@Override
			public Adapter caseDataValuedPropertyAtom(DataValuedPropertyAtom object)
			{
				return createDataValuedPropertyAtomAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.Atom
	 * @generated
	 */
	public Adapter createAtomAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.Antecedent <em>Antecedent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.Antecedent
	 * @generated
	 */
	public Adapter createAntecedentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.Consequent <em>Consequent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.Consequent
	 * @generated
	 */
	public Adapter createConsequentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.ClassAtom <em>Class Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.ClassAtom
	 * @generated
	 */
	public Adapter createClassAtomAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.IndividualPropertyAtom <em>Individual Property Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.IndividualPropertyAtom
	 * @generated
	 */
	public Adapter createIndividualPropertyAtomAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.IndividualObject <em>Individual Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.IndividualObject
	 * @generated
	 */
	public Adapter createIndividualObjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.IndividualVariable <em>Individual Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.IndividualVariable
	 * @generated
	 */
	public Adapter createIndividualVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.IndividualID <em>Individual ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.IndividualID
	 * @generated
	 */
	public Adapter createIndividualIDAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.SameAsAtom <em>Same As Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.SameAsAtom
	 * @generated
	 */
	public Adapter createSameAsAtomAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.DifferentFromAtom <em>Different From Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.DifferentFromAtom
	 * @generated
	 */
	public Adapter createDifferentFromAtomAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.BuiltInAtom <em>Built In Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.BuiltInAtom
	 * @generated
	 */
	public Adapter createBuiltInAtomAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.DataObject
	 * @generated
	 */
	public Adapter createDataObjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.DataVariable <em>Data Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.DataVariable
	 * @generated
	 */
	public Adapter createDataVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.DataLiteral <em>Data Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.DataLiteral
	 * @generated
	 */
	public Adapter createDataLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.DataRangeAtom <em>Data Range Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.DataRangeAtom
	 * @generated
	 */
	public Adapter createDataRangeAtomAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.swrl.DataValuedPropertyAtom <em>Data Valued Property Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.swrl.DataValuedPropertyAtom
	 * @generated
	 */
	public Adapter createDataValuedPropertyAtomAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //SwrlAdapterFactory
