/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.provider;


import java.util.Collection;
import java.util.List;

import net.sf.ictalive.operetta.OM.Arc;
import net.sf.ictalive.operetta.OM.IS;
import net.sf.ictalive.operetta.OM.Landmark;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Player;
import net.sf.ictalive.operetta.OM.Scene;
import net.sf.ictalive.operetta.OM.SceneToTransitionArc;
import net.sf.ictalive.operetta.OM.Transition;
import net.sf.ictalive.operetta.OM.TransitionNorm;
import net.sf.ictalive.operetta.OM.TransitionToSceneArc;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.ictalive.operetta.OM.TransitionNorm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionNormItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionNormItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIDPropertyDescriptor(object);
			addFromScenePropertyDescriptor(object);
			addFromPlayersPropertyDescriptor(object);
			addFromResultsPropertyDescriptor(object);
			addToScenePropertyDescriptor(object);
			addToPlayerPropertyDescriptor(object);
			addAttachedToPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransitionNorm_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransitionNorm_ID_feature", "_UI_TransitionNorm_type"),
				 OMPackage.Literals.TRANSITION_NORM__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Scene feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFromScenePropertyDescriptor(Object object) {
		TransitionNorm norm = (TransitionNorm) object;
		if(norm.getAttachedTo() == null) { 
			itemPropertyDescriptors.add
				(createItemPropertyDescriptor
					(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
					 getResourceLocator(),
					 getString("_UI_TransitionNorm_fromScene_feature"),
					 getString("_UI_PropertyDescriptor_description", "_UI_TransitionNorm_fromScene_feature", "_UI_TransitionNorm_type"),
					 OMPackage.Literals.TRANSITION_NORM__FROM_SCENE,
					 true,
					 false,
					 true,
					 null,
					 null,
					 null));
		} else {
			itemPropertyDescriptors.add
				(new ItemPropertyDescriptor
					(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
					 getResourceLocator(),
					 getString("_UI_TransitionNorm_fromScene_feature"),
					 getString("_UI_PropertyDescriptor_description", "_UI_TransitionNorm_fromScene_feature", "_UI_TransitionNorm_type"),
					 OMPackage.Literals.TRANSITION_NORM__FROM_SCENE,
					 true,
					 false,
					 true,
					 null,
					 null,
					 null){
						/* (non-Javadoc)
						 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getChoiceOfValues(java.lang.Object)
						 */
						@Override
						public Collection<?> getChoiceOfValues(Object object) {
							TransitionNorm tn = (TransitionNorm) object;
							Transition parent = tn.getAttachedTo();
							IS is = (IS)parent.eContainer();
							EList<Scene> fromScenes = new BasicEList<Scene>();
							for(Arc arc : is.getArcs()) {
								if(arc instanceof SceneToTransitionArc){
									SceneToTransitionArc sttArc = (SceneToTransitionArc) arc;
									if(sttArc.getTo() == parent)
										fromScenes.add(sttArc.getFrom());
								}
								
							}
							
							return fromScenes;
						}
			});
		}
	}

	/**
	 * This adds a property descriptor for the From Players feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFromPlayersPropertyDescriptor(Object object) {
		TransitionNorm norm = (TransitionNorm) object;
		if(norm.getAttachedTo() == null) { 
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransitionNorm_fromPlayers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransitionNorm_fromPlayers_feature", "_UI_TransitionNorm_type"),
				 OMPackage.Literals.TRANSITION_NORM__FROM_PLAYERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
		} else {
			itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransitionNorm_fromPlayers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransitionNorm_fromPlayers_feature", "_UI_TransitionNorm_type"),
				 OMPackage.Literals.TRANSITION_NORM__FROM_PLAYERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
					/* (non-Javadoc)
					 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getChoiceOfValues(java.lang.Object)
					 */
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						TransitionNorm tn = (TransitionNorm) object;
						Transition parent = tn.getAttachedTo();
						IS is = (IS)parent.eContainer();
						EList<Scene> fromScenes = new BasicEList<Scene>();
						
						if(tn.getFromScene() == null) {
							for(Arc arc : is.getArcs()) {
								if(arc instanceof SceneToTransitionArc){
									SceneToTransitionArc sttArc = (SceneToTransitionArc) arc;
									if(sttArc.getTo() == parent)
										fromScenes.add(sttArc.getFrom());
								}
								
							}
						} else {
							fromScenes.add(tn.getFromScene());
						}
						
						EList<Player> players = new BasicEList<Player>();
						for(Scene scene : fromScenes) {
							players.addAll(scene.getPlayers());
						}
						
						return players;
					}
			});
		}
	}

	/**
	 * This adds a property descriptor for the From Results feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFromResultsPropertyDescriptor(Object object) {
		TransitionNorm norm = (TransitionNorm) object;
		if(norm.getAttachedTo() == null) { 
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransitionNorm_fromResults_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransitionNorm_fromResults_feature", "_UI_TransitionNorm_type"),
				 OMPackage.Literals.TRANSITION_NORM__FROM_RESULTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
		} else {
			itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransitionNorm_fromResults_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransitionNorm_fromResults_feature", "_UI_TransitionNorm_type"),
				 OMPackage.Literals.TRANSITION_NORM__FROM_RESULTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null){
					/* (non-Javadoc)
					 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getChoiceOfValues(java.lang.Object)
					 */
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						TransitionNorm tn = (TransitionNorm) object;
						Transition parent = tn.getAttachedTo();
						IS is = (IS)parent.eContainer();
						EList<Scene> fromScenes = new BasicEList<Scene>();
						
						if(tn.getFromScene() == null) {
							for(Arc arc : is.getArcs()) {
								if(arc instanceof SceneToTransitionArc){
									SceneToTransitionArc sttArc = (SceneToTransitionArc) arc;
									if(sttArc.getTo() == parent)
										fromScenes.add(sttArc.getFrom());
								}

							}
						} else {
							fromScenes.add(tn.getFromScene());
						}
						
						EList<Landmark> results = new BasicEList<Landmark>();
						for(Scene scene : fromScenes) {
							results.addAll(scene.getResults());
						}
						
						return results;
					}
			});
		}
	}

	/**
	 * This adds a property descriptor for the To Scene feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addToScenePropertyDescriptor(Object object) {
		TransitionNorm norm = (TransitionNorm) object;
		if(norm.getAttachedTo() == null) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransitionNorm_toScene_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransitionNorm_toScene_feature", "_UI_TransitionNorm_type"),
				 OMPackage.Literals.TRANSITION_NORM__TO_SCENE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
		} else {
			itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
					(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
							getResourceLocator(),
							getString("_UI_TransitionNorm_toScene_feature"),
							getString("_UI_PropertyDescriptor_description", "_UI_TransitionNorm_toScene_feature", "_UI_TransitionNorm_type"),
							OMPackage.Literals.TRANSITION_NORM__TO_SCENE,
							true,
							false,
							true,
							null,
							null,
							null){
				/* (non-Javadoc)
				 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getChoiceOfValues(java.lang.Object)
				 */
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					TransitionNorm tn = (TransitionNorm) object;
					Transition parent = tn.getAttachedTo();
					IS is = (IS)parent.eContainer();
					EList<Scene> toScenes = new BasicEList<Scene>();
					for(Arc arc : is.getArcs()) {
						if(arc instanceof TransitionToSceneArc){
							TransitionToSceneArc ttsArc = (TransitionToSceneArc) arc;
							if(ttsArc.getFrom() == parent)
								toScenes.add(ttsArc.getTo());
						}

					}

					return toScenes;
				}
			});
		}
	}

	/**
	 * This adds a property descriptor for the To Player feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addToPlayerPropertyDescriptor(Object object) {
		TransitionNorm norm = (TransitionNorm) object;
		if(norm.getAttachedTo() == null) {
			itemPropertyDescriptors.add
			(createItemPropertyDescriptor
					(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
							getResourceLocator(),
							getString("_UI_TransitionNorm_toPlayer_feature"),
							getString("_UI_PropertyDescriptor_description", "_UI_TransitionNorm_toPlayer_feature", "_UI_TransitionNorm_type"),
							OMPackage.Literals.TRANSITION_NORM__TO_PLAYER,
							true,
							false,
							true,
							null,
							null,
							null));
		} else {
			itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
					(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
							getResourceLocator(),
							getString("_UI_TransitionNorm_toPlayer_feature"),
							getString("_UI_PropertyDescriptor_description", "_UI_TransitionNorm_toPlayer_feature", "_UI_TransitionNorm_type"),
							OMPackage.Literals.TRANSITION_NORM__TO_PLAYER,
							true,
							false,
							true,
							null,
							null,
							null){
				/* (non-Javadoc)
				 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getChoiceOfValues(java.lang.Object)
				 */
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					TransitionNorm tn = (TransitionNorm) object;
					Transition parent = tn.getAttachedTo();
					IS is = (IS)parent.eContainer();
					EList<Scene> toScenes = new BasicEList<Scene>();
					
					if(tn.getToScene() == null) {
						for(Arc arc : is.getArcs()) {
							if(arc instanceof TransitionToSceneArc){
								TransitionToSceneArc ttsArc = (TransitionToSceneArc) arc;
								if(ttsArc.getFrom() == parent)
									toScenes.add(ttsArc.getTo());
							}
	
						}
 					} else {
 						toScenes.add(tn.getToScene());
 					}

					EList<Player> players = new BasicEList<Player>();
					for(Scene scene : toScenes) {
						players.addAll(scene.getPlayers());
					}

					return players;
				}
			});
		}
	}

	/**
	 * This adds a property descriptor for the Attached To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttachedToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransitionNorm_attachedTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransitionNorm_attachedTo_feature", "_UI_TransitionNorm_type"),
				 OMPackage.Literals.TRANSITION_NORM__ATTACHED_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns TransitionNorm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TransitionNorm"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TransitionNorm)object).getID();
		return label == null || label.length() == 0 ?
			getString("_UI_TransitionNorm_type") :
			getString("_UI_TransitionNorm_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TransitionNorm.class)) {
			case OMPackage.TRANSITION_NORM__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OperAEditPlugin.INSTANCE;
	}

}
