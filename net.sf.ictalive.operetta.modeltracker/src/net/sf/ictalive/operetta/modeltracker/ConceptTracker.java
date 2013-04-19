package net.sf.ictalive.operetta.modeltracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import net.sf.ictalive.operetta.OM.Arc;
import net.sf.ictalive.operetta.OM.DeonticStatement;
import net.sf.ictalive.operetta.OM.Dependency;
import net.sf.ictalive.operetta.OM.HierarchyDependency;
import net.sf.ictalive.operetta.OM.IndividualDeonticStatement;
import net.sf.ictalive.operetta.OM.Landmark;
import net.sf.ictalive.operetta.OM.LandmarkPattern;
import net.sf.ictalive.operetta.OM.MarketDependency;
import net.sf.ictalive.operetta.OM.NetworkDependency;
import net.sf.ictalive.operetta.OM.Norm;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.OperAModel;
import net.sf.ictalive.operetta.OM.PartialOrder;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.Player;
import net.sf.ictalive.operetta.OM.Right;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.operetta.OM.RoleDeonticStatement;
import net.sf.ictalive.operetta.OM.Scene;
import net.sf.ictalive.operetta.OM.SceneToTransitionArc;
import net.sf.ictalive.operetta.OM.Transition;
import net.sf.ictalive.operetta.OM.TransitionNorm;
import net.sf.ictalive.operetta.OM.TransitionToSceneArc;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;

public class ConceptTracker {

	// A ConceptTracked keeps track of the concepts that were present in the model before the last time computeUpdates()
	// was called, and the concepts that are present since it was called. Each ModelTracker has its own ConceptTracker.
	
	public Set<TrackedConcept> savedTrackedConcepts = null;

	
	public List<String> computeUpdateOperations(TransactionalEditingDomain editingDomain) {
		//System.out.println("Concept tracker "+this+":computeUpdates()");
		Set<TrackedConcept> currentTrackedConcepts = computeCurrentTrackedConcepts(editingDomain); 
		
		List<String> updateOperations = new ArrayList<String>();
		
			/*
			System.out.println("Previous:");
			for (TrackedConcept c : previousTrackedConcepts )
				System.out.println("Concept: "+c);
			
			System.out.println("Current:");
			for (TrackedConcept c : currentTrackedConcepts )
				System.out.println("Concept: "+c);
			 */
			
		
		
			Set<TrackedConcept> removedConcepts = new TreeSet<TrackedConcept>(savedTrackedConcepts);
			removedConcepts.removeAll( currentTrackedConcepts );
		
			for ( TrackedConcept removedConcept : removedConcepts )
				updateOperations.add( removedConcept.mkRemoveOperation() );
		
			Set<TrackedConcept> addedConcepts = new TreeSet<TrackedConcept>(currentTrackedConcepts);
			addedConcepts.removeAll( savedTrackedConcepts );
		
			for ( TrackedConcept addedConcept : addedConcepts )
				updateOperations.add( addedConcept.mkAddOperation() );
		
		
			
		return updateOperations;

	}

	public Set<TrackedConcept> computeCurrentTrackedConcepts(TransactionalEditingDomain editingDomain) {
		GMFResource gmfresource = (GMFResource)editingDomain.getResourceSet().getResources().get(0);
		if (gmfresource.getContents().size() == 0) {
			// this sometimes happens when commandWasPerformed is called while the editor is still being initialized.
			return new TreeSet<TrackedConcept>(); 
		}
			
        // TODO: this 0 is unsafe. If another resource is added, it might not be at 0 anymore.						
		OM om = ((OperAModel)gmfresource.getContents().get(0)).getOm();
		
		List<TrackedConcept> currentTrackedConcepts = new ArrayList<TrackedConcept>();
		
		// Traverse the OM model and add the concepts to currentTrackedConcepts
		for (Role role : om.getSs().getRoles()) {
			currentTrackedConcepts.add( trackRole(role) );
			for (Right r : role.getRights())
				currentTrackedConcepts.add( trackRight( r, role ) );
		}
		
		for (Norm x : om.getNs().getNorms()) 
			currentTrackedConcepts.add( trackNorm(x) );
		
		for (Objective objective : om.getSs().getObjectives()) {
			currentTrackedConcepts.add( trackObjective(objective) );
			for (Role role : objective.getUsedByRole())
				currentTrackedConcepts.add( trackObjectiveRole(objective, role) );
			for (Objective subObjective : objective.getSubObjectives())
				currentTrackedConcepts.add( trackParentObjective(subObjective, objective) );
		}
		
		for (Dependency dependency : om.getSs().getDependencies()) {
			currentTrackedConcepts.add( trackDependency(dependency) );
			for (Objective objective : dependency.getObjectOfDependency())
				currentTrackedConcepts.add( trackDependencyObjective(dependency, objective) );
		}
		
		for (Arc arc : om.getIs().getArcs()) {
			currentTrackedConcepts.add( trackArc(arc) );
			for (Role role : arc.getAccessible())
				currentTrackedConcepts.add( trackArcRole(arc, role) );
		}
		
		for (Transition x : om.getIs().getTransitions()) 
			currentTrackedConcepts.add( trackTransition(x) );

		for (TransitionNorm x : om.getNs().getTransitionNorms()) 
			currentTrackedConcepts.add( trackTransitionNorm(x) );

		for (Scene scene : om.getIs().getScenes()) {
			currentTrackedConcepts.add( trackScene(scene) );
			LandmarkPattern ip;
			ip = scene.getInteractionPattern();
			if(ip != null) {
				for (Landmark landmark : scene.getInteractionPattern().getLandmarks()) {
					currentTrackedConcepts.add( trackLandmark(landmark,scene) );
					for (Objective objective : landmark.getEntails())
						currentTrackedConcepts.add( trackLandmarkObjective(landmark, objective) );
				}
				for (PartialOrder po : scene.getInteractionPattern().getLandmarkOrder())
					currentTrackedConcepts.add( trackPartialOrder(po, scene) );
				}
			for (Player p : scene.getPlayers()) 
				currentTrackedConcepts.add( trackPlayer(p, scene) );
		}
		
		currentTrackedConcepts.removeAll(Collections.singletonList(null)); // remove the null elements from the list
		
		return new TreeSet<TrackedConcept>( currentTrackedConcepts );
	}
	
	
	
	// An overview of all Operators can be found in Misc/Reorganization Operator List.xls
	
	public TrackedConcept trackRole(Role r) {
		return TrackedConcept.mkConceptRole( getIdOrNull(r) );
	}

	public TrackedConcept trackNorm(Norm n) {
		
		DeonticStatement deontics = n.getDeontics();
		
		if (deontics != null) {
			String type, subject;

			if (deontics instanceof IndividualDeonticStatement) {
				type = "Individual";
				subject = getIdOrNull( ((IndividualDeonticStatement)deontics).getActor() );
			}
			else {
				type = "Role";
				subject = getIdOrNull( ((RoleDeonticStatement)deontics).getRole() );
			}

			return TrackedConcept.mkConceptNorm(getIdOrNull(n), psdOrNull(n.getActivatingCondition()), psdOrNull(n.getDeactivatingCondition()),
					psdOrNull(n.getMaintenanceCondition()), psdOrNull(n.getRepairCondition()), psdOrNull(n.getTimeout()), 
				typeStringOrNull(deontics.getModality()), 
				psdOrNull(deontics.getWhat()),
				type,
				subject);
		}
		return null;
	}

	public TrackedConcept trackObjective( Objective o ) {
		return TrackedConcept.mkConceptObjective( getIdOrNull(o), psdOrNull(o.getStateDescription()) );		
	}
	
	public TrackedConcept trackObjectiveRole( Objective objective, Role role) {
		return TrackedConcept.mkConceptObjectiveRole( getIdOrNull(objective), getIdOrNull(role) );
	}
	
	public TrackedConcept trackParentObjective( Objective subObjective, Objective objective){
		return TrackedConcept.mkConceptParentObjective( getIdOrNull(subObjective), getIdOrNull(objective)) ;
	}
	
	public TrackedConcept trackDependency(Dependency d) {
		String type = "";
		Role dependant = null;
		Role dependee = null;

		if (d instanceof MarketDependency){ 
			type = "Market";
			dependant = ((MarketDependency)d).getDependant();
			dependee = ((MarketDependency)d).getDependee();
		}
		else if (d instanceof HierarchyDependency) { 
			type = "Hierarchy";
			dependant = ((HierarchyDependency)d).getDependant();
			dependee = ((HierarchyDependency)d).getDependee();
		}
		else if (d instanceof NetworkDependency) { 
			type = "Network";
			dependant = ((NetworkDependency)d).getDependant1();
			dependee = ((NetworkDependency)d).getDependant2();
		}
		
		return TrackedConcept.mkConceptDependency( getIdOrNull(d), type, getIdOrNull( dependant ),	getIdOrNull( dependee ));
	}
	
	public TrackedConcept trackDependencyObjective(Dependency dependency, Objective objective ) {
		return TrackedConcept.mkConceptDependencyObjective( getIdOrNull(dependency), getIdOrNull(objective) );
	}
	
	public TrackedConcept trackScene(Scene s) {
		String sceneId = getIdOrNull(s);
		return TrackedConcept.mkConceptScene( sceneId, "\"" + nullToEmpty( s.getDescription() ) + "\"", typeStringOrNull( s.getType() ) );
		}

	public TrackedConcept trackArc(Arc a) {
		if (a instanceof TransitionToSceneArc) {
			TransitionToSceneArc ts = (TransitionToSceneArc)a;
			
			return TrackedConcept.mkConceptTransitionToSceneArc( getIdOrNull(ts), typeStringOrNull( ts.getType() ),
						getIdOrNull( ts.getFrom() ), getIdOrNull( ts.getTo() ) );			
		}
		else {
			SceneToTransitionArc st = (SceneToTransitionArc)a;

			return TrackedConcept.mkConceptSceneToTransitionArc( getIdOrNull(st), getIdOrNull( st.getFrom() ), getIdOrNull( st.getTo() ) );
		}
	}

	public TrackedConcept trackArcRole(Arc arc, Role role) {
		return TrackedConcept.mkConceptArcRole( getIdOrNull(arc), getIdOrNull(role) );
	}

	public TrackedConcept trackTransition(Transition t) {
		return TrackedConcept.mkConceptTransition(t.getTransitionID(), typeStringOrNull(t.getTransitionType()) );		
	}

	public TrackedConcept trackTransitionNorm(TransitionNorm tn) {
		return TrackedConcept.mkConceptTransitionNorm(getIdOrNull(tn), getIdOrNull(tn.getAttachedTo()) );		
	}

	public TrackedConcept trackLandmark(Landmark l, Scene scene) {
		return TrackedConcept.mkConceptLandmark( 
				l.getName(), 
				getIdOrNull(scene),
				psdOrNull( l.getStateDescription() ),
				String.valueOf(l.isIsResult()) );
	}

	public TrackedConcept trackLandmarkObjective( Landmark landmark, Objective objective ) {
		return TrackedConcept.mkConceptLandmarkObjective( getIdOrNull(landmark), getIdOrNull(objective) );
	}

	public TrackedConcept trackPartialOrder(PartialOrder po, Scene scene) {
		return TrackedConcept.mkConceptPartialOrder(getIdOrNull(scene), 
				po.getFrom() == null ? null : po.getFrom().getName(),
				po.getTo() == null ? null : po.getTo().getName());
	}
	
	public TrackedConcept trackPlayer(Player p, Scene scene) {
		return TrackedConcept.mkConceptPlayer(getIdOrNull(p), getIdOrNull(p.getRole()), getIdOrNull(scene) );
	}

	public TrackedConcept trackRight(Right r, Role role) {
		return TrackedConcept.mkConceptRight(getIdOrNull(r), getIdOrNull(role), psdOrNull(r.getExpr()));
	}
	
	
	// Utilities
	protected String typeStringOrNull( Object type ) {
		if (type == null)
			return null;
		else
			return type.toString();
	}
		
	protected String psdOrNull( PartialStateDescription psd ) {
		if (psd == null)
			return null;
		else
			return psd.prettyPrint(); // change to psd.toString() if we don't want unicode in history.
	}
	// return the object's id (or name) or null if the object (or its id/name) is null
	protected String getIdOrNull( Object o ) {
		if (o == null)
			return null;
		else
			if (o instanceof Role)
				return ((Role)o).getName();
			else if (o instanceof Norm)
				return ((Norm)o).getNormID();
			else if (o instanceof Objective)
				return ((Objective)o).getName();
			else if (o instanceof Dependency)
				return ((Dependency)o).getID();
			else if (o instanceof Scene)
				return ((Scene)o).getSceneID();
			else if (o instanceof Arc)
				return ((Arc)o).getArcID();
			else if (o instanceof Transition)
				return ((Transition)o).getTransitionID();
			else if (o instanceof TransitionNorm)
				return ((TransitionNorm)o).getID();
			else if (o instanceof Landmark)
				return ((Landmark)o).getName();
			else if (o instanceof PartialOrder)
				return ((PartialOrder)o).getName();
			else if (o instanceof Player)
				return ((Player)o).getPlayerID() + ""; // this is a character
			else if (o instanceof Right)
				return ((Right)o).getName();
			else
				System.err.println("net.sf.ictalive.operetta.modeltracker.ModelTracker.getIdOrNull: Unimplemented type "+o.getClass()+".");
				return "";
	}
/*
 * 		Role
		Norm
		Objective
		Dependency
		Scene
		Arc
		Transition
		TransitionNorm
		Landmark
		PartialOrder
		Player
		Right

 * */
	protected String nullToEmpty( String str ) {
		if (str == null)
			return "";
		else
			return str;
	}

	
	
}
