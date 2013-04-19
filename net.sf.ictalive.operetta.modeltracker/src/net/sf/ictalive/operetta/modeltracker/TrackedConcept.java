package net.sf.ictalive.operetta.modeltracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrackedConcept implements Comparable {
	
	static final int ROLE = 0;
	static final int NORM = 1;
	static final int OBJECTIVE = 2;
	static final int OBJECTIVEROLE = 3;
	static final int PARENTOBJECTIVE = 4;
	static final int DEPENDENCY = 5;
	static final int DEPENDENCYOBJECTIVE = 6;
	static final int SCENE = 7;
	static final int TRANSITIONTOSCENEARC = 8;
	static final int SCENETOTRANSITIONARC = 9;
	static final int ARCROLE = 10;
	static final int TRANSITION = 11;
	static final int TRANSITIONNORM = 12;
	static final int LANDMARK = 13;
	static final int LANDMARKOBJECTIVE = 14;
	static final int PARTIALORDER = 15;
	static final int PLAYER = 16;
	static final int RIGHT = 17;

	
	protected int conceptType;
	
	/* Concepts that have an id can be removed by "remove..(id)", instead of having to specify all parameters
	 * values. The id needs to be unique in the model. If a concept has no id, it is null.
	 */
	protected String id;
	

	protected List<String> parameters;
	
	
	// An overview of all Operators can be found in Misc/Reorganization Operator List.xls

	public TrackedConcept( int conceptType, String id, List<String> parameters) {
		this.conceptType = conceptType;
		this.id = id;
		this.parameters = parameters;
	}
	
	public String mkAddOperation() {
		if ( id != null )
			return "add" + typeString() + "(" + id + commaPrefixed(parameters) + ");";
		else
			return "add" + typeString() + "(" + commaSeparated(parameters) + ");";
	}
	
	public String mkRemoveOperation() {
		if ( id != null )
			return "remove" + typeString() + "(" + id + ");";
		else
			return "remove" + typeString() + "(" + commaSeparated(parameters) + ");";
	}
	
	public String typeString() {
		switch (conceptType) {
			case ROLE:
				return "Role";
			case NORM:
				return "Norm";
			case OBJECTIVE:
				return "Objective";
			case OBJECTIVEROLE:
				return "ObjectiveRole";
			case PARENTOBJECTIVE:
				return "ParentObjective";
			case DEPENDENCY:
				return "Dependency";
			case DEPENDENCYOBJECTIVE:
				return "DependencyObjective";
			case SCENE:
				return "Scene";
			case SCENETOTRANSITIONARC:
				return "SceneToTransitionArc";
			case TRANSITIONTOSCENEARC:
				return "TransitionToSceneArc";
			case ARCROLE:
				return "ArcRole";
			case TRANSITION:
				return "Transition";
			case TRANSITIONNORM:
				return "TransitionNorm";
			case LANDMARK:
				return "Landmark";
			case LANDMARKOBJECTIVE:
				return "LandmarkObjective";
			case PARTIALORDER:
				return "PartialOrder";
			case PLAYER:
				return "Player";
			case RIGHT:
				return "Right";
			default:
				return null;
		}
	}

	protected static String commaPrefixed(List<String> strings) {
		String result = "";
		for (int i=0; i<strings.size(); i++)
				result += ", " + strings.get(i);
		return result;	
	}

	protected static String commaSeparated(List<String> strings) {
		if (strings.size() == 0)
			return "";
		else {
			String result = strings.get(0);
		
			for (int i=1; i<strings.size(); i++)
				result += ", " + strings.get(i);
			return result;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * 
	 * Compare TrackedConcepts, disregarding the id field if the trackedconcept doesn't have one.
	 */
	@Override
	public int compareTo(Object o) throws ClassCastException {
		if (! (o instanceof TrackedConcept) )
			throw new ClassCastException( "TrackedConcept compared to "+o.getClass().getName() );
		
		TrackedConcept c2 = (TrackedConcept)o;
		
		if (conceptType - c2.conceptType != 0)
			return conceptType - c2.conceptType;
		
		if (id != null && id.compareTo(c2.id) != 0) // because c2 has the same type as c1, we know c2.id != null if c1 != null
			return id.compareTo(c2.id);             // (whether or not id is null depends on the type alone)
		
		
		for (int i=0; i<parameters.size(); i++) // conceptTypes are equal, so both TrackedConcepts have the same number of parameters.
			if (parameters.get(i).compareTo(c2.parameters.get(i)) != 0)
				return parameters.get(i).compareTo(c2.parameters.get(i));
			
		return 0;	
		
	}
	
	public String toString() {
		return typeString() + "("+ (id != null ? (id + ", ") : "") + commaSeparated( parameters )+')';
	}
	
	// If one of the parameters is null, null is returned.
	private static TrackedConcept mkConcept( int conceptType, List<String>parameters) {
		if ( !parameters.contains(null) )
			return new TrackedConcept(conceptType, null, parameters);
		else
			return null;
	}

	// Constructor for concept with an id field. If the id or one of the parameters is null, null is returned.
	private static TrackedConcept mkConcept( int conceptType, String id, List<String>parameters) {
		if ( id != null && !parameters.contains(null) )
			return new TrackedConcept(conceptType, id, parameters);
		else
			return null;
	}

	
	
	// static methods for creating concepts for model objects. If one of the fields is null, the returned concept is null.
	
	public static TrackedConcept mkConceptRole( String id ) {
		return mkConcept( ROLE, id, new ArrayList<String>());
	}

	public static TrackedConcept mkConceptNorm( String id, String activatePSD, String expirePSD, String maintPSD, String repairPSD, String deadPSD,
			String deonModalityType, String deonPSD, String type, String subject) {
		return mkConcept( NORM, id, new ArrayList<String>(Arrays.asList(
				activatePSD,
				expirePSD,
				maintPSD,
				deadPSD,
				repairPSD,
				deonModalityType,
				deonPSD,
				type,
				subject
				)));
	}

	public static TrackedConcept mkConceptObjective( String id, String psd ) {
		return mkConcept( OBJECTIVE, id, new ArrayList<String>(Arrays.asList(
				psd
		)));
	}
	
	public static TrackedConcept mkConceptObjectiveRole( String objectiveName, String roleName ) {
		return mkConcept( OBJECTIVEROLE, new ArrayList<String>(Arrays.asList(
				objectiveName,
				roleName
		)));
	}

	public static TrackedConcept mkConceptParentObjective( String childObjectiveName, String parentObjectiveName ) {
		return mkConcept( PARENTOBJECTIVE, new ArrayList<String>(Arrays.asList(
				childObjectiveName,
				parentObjectiveName
		)));
	}


	public static TrackedConcept mkConceptDependency( String dId, String type, String dependant, String dependee ) {
		return mkConcept( DEPENDENCY, new ArrayList<String>(Arrays.asList(
				dId,
				type,
				dependant,
				dependee
				)));
	}

	public static TrackedConcept mkConceptDependencyObjective( String dependencyId, String objectiveName ) {
		return mkConcept( DEPENDENCYOBJECTIVE, new ArrayList<String>(Arrays.asList(
				dependencyId,
				objectiveName
		)));
	}

	public static TrackedConcept mkConceptScene( String id, String description, String type ) {
		return mkConcept( SCENE, id, new ArrayList<String>(Arrays.asList(
				description,
				type
			)));
	}

	public static TrackedConcept mkConceptTransitionToSceneArc( String id, String type, String from, String to ) {
		return mkConcept( TRANSITIONTOSCENEARC, id, new ArrayList<String>(Arrays.asList(
				type,
				from,
				to
				)));
	}

	public static TrackedConcept mkConceptSceneToTransitionArc( String id, String from, String to ) {
		return mkConcept( SCENETOTRANSITIONARC, id, new ArrayList<String>(Arrays.asList(
				from,
				to
				)));
	}

	public static TrackedConcept mkConceptArcRole( String arcId, String roleName ) {
		return mkConcept( ARCROLE, new ArrayList<String>(Arrays.asList(
				arcId,
				roleName
		)));

	}

	public static TrackedConcept mkConceptTransition( String id, String type ) {
		return mkConcept( TRANSITION, id, new ArrayList<String>(Arrays.asList(
				type
		)));
	}

	public static TrackedConcept mkConceptTransitionNorm( String id, String transitionId ) {
		return mkConcept( TRANSITIONNORM, id, new ArrayList<String>(Arrays.asList(
				transitionId
		)));
	}

	public static TrackedConcept mkConceptLandmark( String name, String sceneId, String PSD, String isResult) {
		return mkConcept( LANDMARK, new ArrayList<String>(Arrays.asList(
				name,
				sceneId,
				PSD,
				isResult
		)));
	}
	
	public static TrackedConcept mkConceptLandmarkObjective( String landmarkName, String objectiveName ) {
		return mkConcept( LANDMARKOBJECTIVE, new ArrayList<String>(Arrays.asList(
				landmarkName,
				objectiveName
		)));
	}
	 
	public static TrackedConcept mkConceptPartialOrder( String sceneId, String fromLandmarkName, String toLandmarkName ) {
		return mkConcept( PARTIALORDER, new ArrayList<String>(Arrays.asList(
				sceneId,
				fromLandmarkName,
				toLandmarkName
		)));
	}

	public static TrackedConcept mkConceptPlayer( String id, String roleName, String sceneId) {
		return mkConcept( PLAYER, id, new ArrayList<String>(Arrays.asList(
				roleName,
				sceneId
		)));
	}

	public static TrackedConcept mkConceptRight( String id, String roleName, String expPsd ) {
		return mkConcept( RIGHT, id, new ArrayList<String>(Arrays.asList(
				roleName,
				expPsd
		)));
	}

}
	

