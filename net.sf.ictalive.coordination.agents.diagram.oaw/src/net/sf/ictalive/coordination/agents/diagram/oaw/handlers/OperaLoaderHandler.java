package net.sf.ictalive.coordination.agents.diagram.oaw.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.print.attribute.standard.Severity;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.actions.AtomicAction;
import net.sf.ictalive.coordination.agents.Agent;
import net.sf.ictalive.coordination.agents.AgentsFactory;
import net.sf.ictalive.coordination.agents.MasModel;
import net.sf.ictalive.coordination.agents.diagram.oaw.Activator;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.PathUtils;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.OperAModel;
import net.sf.ictalive.operetta.OM.Role;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.ResourceUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class OperaLoaderHandler extends AbstractHandler {
	Shell shell;
	ResourceSet resourceSet;

	String asPath;
	String modelFile;
	String workingFiles;

	/**
	 * The constructor.
	 */
	public OperaLoaderHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("starting to execute");
		initialiseResourceSet();

		// get the shell
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		shell = window.getShell();

		// find AgentScape
		// file should be the mas file
		IFile file = ResourceUtil.getFile(HandlerUtil.getActiveEditor(event)
				.getEditorInput());
		IProject project = file.getProject();

		initialiseASPath(project, shell);

		if (asPath == null)
			return null;

		// find opera file and hence the actions etc.

		DirectoryDialog dirDlg = new DirectoryDialog(shell);

		dirDlg
				.setText("Please choose the folder where the OperettA, actions, etc files are:");

		workingFiles = dirDlg.open();

		if (workingFiles == null)
			return null;

		File actionFolder = new File(workingFiles);
		File[] actionFiles = actionFolder.listFiles(new FileFilter() {
			public boolean accept(File file) {
				return (file.getName().endsWith(".opera"));
			}
		});

		File operaFile = actionFiles[0];

		Resource operaResource = resourceSet.getResource(URI
				.createFileURI(operaFile.getAbsolutePath()), true);

		masCreateAgents(operaResource, file);

		// storeEverythingToAgentscape(operaFile);

		return null;
	}

	private void initialiseASPath(IProject project, Shell shell)
			throws ExecutionException {
		String asFile = project.getLocation().toString() + File.separator
				+ ASPathHandler.ASFILENAME;

		File agentscape = new File(asFile);
		if (agentscape.exists()) {
			try {
				FileReader fr = new FileReader(asFile);
				BufferedReader in = new BufferedReader(fr);

				asPath = in.readLine();
				in.close();
			} catch (Exception e) {
				MessageDialog.openError(shell, "Inject agents into AgentScape",
						"I/O Error");
				Activator.getDefault().getLog().log(
						new Status(Status.ERROR, Activator.PLUGIN_ID,
								"Error reading AgentScape path "
										+ e.getMessage(), e));
			}
		} else
			asPath = ASPathHandler.createASFile(project, shell);
		PathUtils.setAgentScapePath(asPath);
	}

	private void initialiseResourceSet() {
		// Create a resource set to hold the resources.
		resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(OMPackage.eNS_PREFIX,
				OMPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(OMPackage.eNS_URI,
				OMPackage.eINSTANCE);

		resourceSet.getPackageRegistry().put(ActionsPackage.eNS_PREFIX,
				ActionsPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(ActionsPackage.eNS_URI,
				ActionsPackage.eINSTANCE);

		resourceSet.getPackageRegistry().put(TasksPackage.eNS_PREFIX,
				TasksPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(TasksPackage.eNS_URI,
				TasksPackage.eINSTANCE);
	}

	public void generateMas(IProject project, File operaFile, File actionFile, File ontologyFile,
			MasModel mas, Shell shell) {
		initialiseResourceSet();
		try {
			initialiseASPath(project, shell);

			String ns = attemptToExtractNamespace(ontologyFile);

			mas.setDomainOntologyNameSpace(ns);
			
			Resource operaResource = resourceSet.getResource(getUri(operaFile),
					true);

			// Resource masResource = (masFile.exists()) ? resourceSet
			// .getResource(URI.createFileURI(masFile.getLocation()
			// .toOSString()), true) : resourceSet
			// .createResource(URI.createFileURI(masFile.getLocation()
			// .toOSString()));
			// MasModel mas = getMasModel(masResource);

			// URI masUri =
			// URI.createFileURI(ResourcesPlugin.getWorkspace().getRoot().getLocation().toPortableString()
			// + mas.eResource().getURI().devicePath());
			// URI operaUri = operaResource.getURI();
			// URI relativeOpera = operaUri.deresolve(masUri);
			// operaResource.setURI(relativeOpera);
			createAgents(operaResource, mas, new File[] { actionFile });
			// if (save)
			// saveResource(masResource);

			// deleteDirectoryFileContents(new File(asPath + "/input/"));
			// deleteDirectoryFileContents(new File(asPath +
			// "/input/CoordinationModel/"));
			// deleteDirectoryFileContents(new File(asPath +
			// "/input/OrganisationModel/"));

			// storeEverythingToAgentscape(operaFile);

		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String attemptToExtractNamespace(File rdfFile) {
		StringBuilder sb = new StringBuilder();
		FileReader in = null;
		try {
			in = new FileReader(rdfFile);
			for (int i = in.read(); i != -1; i = in.read()) {
				sb.append((char) i);
			}

		} catch (FileNotFoundException e) {
			Activator.getDefault().getLog().log(new Status(Status.WARNING, Activator.PLUGIN_ID, "Error reading ontology file", e));
		} catch (IOException e) {
			Activator.getDefault().getLog().log(new Status(Status.WARNING, Activator.PLUGIN_ID, "Error reading ontology file", e));
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				Activator.getDefault().getLog().log(new Status(Status.WARNING, Activator.PLUGIN_ID, "Error closing ontology file", e));
			}
		}
		int baseIndex = sb.indexOf("xml:base=");
		if (baseIndex != -1) {
			int start = sb.indexOf("\"", baseIndex)+1;
			int finish = sb.indexOf("\"", start);
			return sb.substring(start, finish).trim();
		}
		return "";
	}

	private URI getUri(File file) {
		return URI.createFileURI(file.getAbsolutePath());
	}

	private Object masCreateAgents(Resource operaResource, IFile masFile) {

		// IWorkbenchWindow window =
		// HandlerUtil.getActiveWorkbenchWindow(event);

		// String asFolderLocation = file.getParent().getParent().getName();
		// System.out.println(asFolderLocation);

		// String destDirectoryName = asPath + "/input/" + asFolderLocation;

		// If is not a mas file, abort
		if (!masFile.getFileExtension().equals("mas")) {
			// MessageDialog.openError(window.getShell(),"Generate agents","You are not in a .mas file!");
			// return null;

			modelFile = masFile.getLocation().toString();
			modelFile = modelFile.substring(0, modelFile.lastIndexOf("."))
					+ ".mas";
		} else {
			modelFile = masFile.getLocation().toString();
		}

		// String masName = masFile.getName();
		// masName = masName.substring(0, masName.lastIndexOf("."));

		File masfile = new File(modelFile);

		Resource masResource = resourceSet.getResource(URI
				.createFileURI(masfile.getAbsolutePath()), true);
		// masCreateRoleObjectives(operaResource, masResource);
		// masCreateActions(masResource);
		// masCreateAgentAndActions(masResource, destDirectoryName);
		// masCreateAgentAndActions(masResource, asFolderLocation);
		// attempt to get the MasModel from the selected file
		MasModel model = getMasModel(masResource);
		createAgents(operaResource, model);
		saveResource(masResource);

		return null;
	}

	private void saveResource(Resource resource) {
		try {
			resource.save(null);
		} catch (IOException e) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
		}
	}

	private MasModel getMasModel(Resource masResource) {
		MasModel model = null;
		for (EObject obj : masResource.getContents()) {
			if (obj instanceof MasModel) {
				model = (MasModel) obj;
				break;
			}
		}
		// did not find a MasModel, so create a new one and add it to
		// masResource
		if (model == null) {
			model = AgentsFactory.eINSTANCE.createMasModel();
			masResource.getContents().add(model);
		}
		return model;
	}

	private void createAgents(Resource operaResource, MasModel mas) {
		// assign actions to agents
		File actionFolder = new File(workingFiles);
		File[] actionFiles = actionFolder.listFiles(new FileFilter() {
			public boolean accept(File file) {
				return (file.getName().endsWith(".actions"));
			}
		});
		createAgents(operaResource, mas, actionFiles);
	}

	private void createAgents(Resource operaResource, MasModel mas,
			File[] actionFiles) {
		EList<Agent> agents = mas.getAgents();
		// craete agents one for each role
		for (TreeIterator<EObject> obj = operaResource.getAllContents(); obj
				.hasNext();) {
			EObject content = obj.next();

			if (content instanceof OperAModel) {
				net.sf.ictalive.operetta.OM.SS operaSS = ((net.sf.ictalive.operetta.OM.OperAModel) content)
						.getOm().getSs();

				EList<net.sf.ictalive.operetta.OM.Role> operaRoles = operaSS
						.getRoles();
				for (Role role : operaRoles) {
					Agent agent = getAgent(role, agents);
				}
			}
		}

		for (int i = 0; i < actionFiles.length; i++) {
			File action = actionFiles[i];

			Resource actionResource = null;
			try {
				actionResource = resourceSet.getResource(URI
						.createFileURI(action.getAbsolutePath()), true);
			} catch (Exception e) {
				Activator.getDefault().getLog()
						.log(
								new Status(Status.ERROR, Activator.PLUGIN_ID,
										"Error creating resource "
												+ e.getMessage(), e));
			}

			for (TreeIterator<EObject> obj = actionResource.getAllContents(); obj
					.hasNext();) {
				EObject content = obj.next();
				if (content instanceof AtomicAction) {
					AtomicAction a = (AtomicAction) content;
					for (Role role : a.getPerformedByRole()) {
						Agent agent = getAgent(role, agents);
						if (agent != null) {
							agent.getHasAction().add(a);
						}
					}
				}
			}
		}
	}

	private Agent getAgent(Role role, EList<Agent> agents) {
		for (Agent agent : agents) {
			if (agent.getHasRole().contains(role))
				return agent;
		}
		Agent agent = AgentsFactory.eINSTANCE.createAgent();
		agent.setName("agent" + agents.size());
		agent.getHasRole().add(role);
		agents.add(agent);
		return agent;
	}

	// private void masCreateAgentAndActions(Resource masResource, String
	// destDirectoryName)
	// {
	// for (TreeIterator<EObject> masObj = masResource.getAllContents();
	// masObj.hasNext();)
	// {
	// EObject masContent = masObj.next();
	//			
	// if(masContent instanceof MasModelImpl)
	// {
	// EList<mas.Role> roleList = ((MasModelImpl) masContent).getRoles();
	// EList<mas.Action> actionList = ((MasModelImpl) masContent).getActions();
	// EList<mas.Agent> agentList = ((MasModelImpl) masContent).getAgents();
	//				
	// for(int i=0; i< roleList.size(); i++)
	// {
	// mas.impl.AgentImpl newAgent = new mas.impl.AgentImpl();
	//					
	// newAgent.setName("Agent" + i);
	// newAgent.setAsFolderLocation(destDirectoryName);
	// EList<mas.Role> agentRoles = newAgent.getHasRole();
	// agentRoles.add(roleList.get(i));
	//					
	// EList<mas.Action> agentActions = newAgent.getHasAction();
	//					
	// //get actions for this role
	// mas.Role thisRole = roleList.get(i);
	// for(int j=0;j< actionList.size(); j++)
	// {
	// mas.Action testAction = actionList.get(j);
	//
	// String actionRoles = testAction.getPerformedByRole();
	// if(actionRoles.equals(thisRole.getName()))
	// {
	// agentActions.add(testAction);
	// }
	// }
	// agentList.add(newAgent);
	// }
	// }
	// }
	//		
	// try
	// {
	// masResource.save(null);
	// }
	// catch (IOException e)
	// {
	// e.printStackTrace();
	// }
	//
	// }

	// private void masCreateActions(Resource masResource)
	// {
	// for (TreeIterator<EObject> masObj = masResource.getAllContents();
	// masObj.hasNext();)
	// {
	// EObject masContent = masObj.next();
	//			
	// if(masContent instanceof MasModelImpl)
	// {
	// EList<mas.Role> roleList = ((MasModelImpl) masContent).getRoles();
	// EList<mas.Objective> objectiveList = ((MasModelImpl)
	// masContent).getObjectives();
	// EList<mas.Action> actionList = ((MasModelImpl) masContent).getActions();
	//				
	//				
	// File actionFolder = new File(workingFiles);
	// File[] actionFiles = actionFolder.listFiles(new FileFilter() {
	// public boolean accept(File file)
	// {
	// return (file.getName().endsWith(".actions"));
	// }
	// });
	// for(int i=0; i< actionFiles.length; i++)
	// {
	// File action = actionFiles[i];
	//
	// Resource actionResource = null;
	// try {
	// actionResource =
	// resourceSet.getResource(URI.createFileURI(action.getAbsolutePath()),true);
	// }
	// catch (Exception e)
	// {
	// System.out.println("ERROR creating resource");
	// e.printStackTrace();
	// }
	//					
	// for (TreeIterator<EObject> obj = actionResource.getAllContents();
	// obj.hasNext();)
	// {
	// EObject content = obj.next();
	// if(content instanceof AtomicActionImpl)
	// {
	// AtomicActionImpl opAction = (AtomicActionImpl) content;
	// mas.impl.ActionImpl newAction = new mas.impl.ActionImpl();
	// newAction.setName(opAction.getName());
	// newAction.setType("Atomic");
	//
	// //get performing roles
	//							
	// EList<String> performingRoles = opAction.getPerformedByRole();
	// String role ="";
	// for(int j=0; j< performingRoles.size(); j++)
	// {
	// role += performingRoles.get(j).trim() + " ";
	// }
	// role = role.trim();
	// newAction.setPerformedByRole(role);
	//							
	// actionList.add(newAction);
	// }
	// }
	// }
	// }
	// }
	//		
	// try
	// {
	// masResource.save(null);
	// }
	// catch (IOException e)
	// {
	// e.printStackTrace();
	// }
	// }

	// private void masCreateRoleObjectives(Resource operaResource, Resource
	// masResource)
	// {
	// for (TreeIterator<EObject> obj = operaResource.getAllContents();
	// obj.hasNext();)
	// {
	// EObject content = obj.next();
	//
	// if (content instanceof OperAModel)
	// {
	// net.sf.ictalive.operetta.OM.SS operaSS =
	// ((net.sf.ictalive.operetta.OM.OperAModel) content).getOm().getSs();
	//
	// EList<net.sf.ictalive.operetta.OM.Role> operaRoles = operaSS.getRoles();
	// EList<net.sf.ictalive.operetta.OM.Objective> operaObjectives =
	// operaSS.getObjectives();
	//				
	// for (TreeIterator<EObject> masObj = masResource.getAllContents();
	// masObj.hasNext();)
	// {
	// EObject masContent = masObj.next();
	//					
	// if(masContent instanceof MasModelImpl)
	// {
	// EList<mas.Role> roleList = ((MasModelImpl) masContent).getRoles();
	// EList<mas.Objective> objectiveList = ((MasModelImpl)
	// masContent).getObjectives();
	// mas.impl.RoleImpl newRole;
	// mas.impl.ObjectiveImpl newObjective;
	//
	// //add roles to mas
	// for(int i=0; i< operaRoles.size(); i++)
	// {
	// newRole = new mas.impl.RoleImpl();
	// net.sf.ictalive.operetta.OM.Role opRole = operaRoles.get(i);
	// newRole.setName(opRole.getName());
	// roleList.add(newRole);
	// }
	//
	// //add objectives to mas
	// for(int i=0; i< operaObjectives.size(); i++)
	// {
	// newObjective = new mas.impl.ObjectiveImpl();
	// net.sf.ictalive.operetta.OM.Objective opObjective =
	// operaObjectives.get(i);
	// newObjective.setName(opObjective.getName());
	// objectiveList.add(newObjective);
	//							
	// EList<net.sf.ictalive.operetta.OM.Role> opObjRoles =
	// opObjective.getUsedByRole();
	// if(opObjRoles.size() > 0)
	// {
	// for(int j=0; j<opObjRoles.size(); j++)
	// {
	// net.sf.ictalive.operetta.OM.Role opObjrole = opObjRoles.get(j);
	// newObjective.setUsedByRole(getMatchingMASrole(roleList, opObjrole));
	// }
	// }
	// }
	//
	// //add sub and parent objectives to the objectives
	// for(int i=0; i< operaObjectives.size(); i++)
	// {
	// mas.Objective masObjective = objectiveList.get(i);
	// net.sf.ictalive.operetta.OM.Objective opObjective =
	// operaObjectives.get(i);
	//							
	// EList<net.sf.ictalive.operetta.OM.Objective> parentObjective =
	// opObjective.getParentObjective();
	//							
	// if(parentObjective.size() > 0)
	// {
	// for(int j=0; j< parentObjective.size(); j++)
	// {
	// net.sf.ictalive.operetta.OM.Objective opParentObj =
	// parentObjective.get(j);
	// masObjective.setHasParentObjective(getMatchingMASobjective(objectiveList,
	// opParentObj));
	// }
	// }
	//							
	// EList<net.sf.ictalive.operetta.OM.Objective> subObjective =
	// opObjective.getSubObjectives();
	//							
	// if(subObjective.size() > 0)
	// {
	// for(int j=0; j< subObjective.size(); j++)
	// {
	// net.sf.ictalive.operetta.OM.Objective opSubObj = subObjective.get(j);
	// EList<mas.Objective> masSubObs = masObjective.getHasSubObjective();
	// masSubObs.add(getMatchingMASobjective(objectiveList, opSubObj));
	// }
	// }
	// }
	//						
	//						
	// //add objetives to roles
	// for(int i=0; i< operaRoles.size(); i++)
	// {
	// mas.Role masRole = roleList.get(i);
	// net.sf.ictalive.operetta.OM.Role opRole = operaRoles.get(i);
	//							
	// EList<net.sf.ictalive.operetta.OM.Objective> opRoleObjectives =
	// opRole.getObjectives();
	// EList<mas.Objective> masRoleObjectives = masRole.getHasObjective();
	//							
	// if(opRoleObjectives.size() > 0)
	// {
	// for(int j=0; j< opRoleObjectives.size(); j++)
	// {
	// net.sf.ictalive.operetta.OM.Objective opRoleObj =
	// opRoleObjectives.get(j);
	// masRoleObjectives.add(getMatchingMASobjective(objectiveList,opRoleObj));
	//									
	// }
	// }
	// }
	// }
	// }
	// }
	// }
	// try
	// {
	// masResource.save(null);
	// }
	// catch (IOException e)
	// {
	// e.printStackTrace();
	// }
	// }
	//
	// private mas.Objective getMatchingMASobjective(EList<mas.Objective>
	// objectiveList, Objective opObj)
	// {
	// for(int i=0; i<objectiveList.size(); i++)
	// {
	// mas.Objective masObjective = objectiveList.get(i);
	//
	// if(masObjective.getName().equalsIgnoreCase(opObj.getName()))
	// {
	// return(masObjective);
	// }
	// }
	//		
	// return null;
	// }
	//
	// private mas.Role getMatchingMASrole(EList<mas.Role> roleList,
	// net.sf.ictalive.operetta.OM.Role opObjrole)
	// {
	// for(int i=0; i<roleList.size(); i++)
	// {
	// mas.Role masRole = roleList.get(i);
	//
	// if(masRole.getName().equalsIgnoreCase(opObjrole.getName()))
	// {
	// return(masRole);
	// }
	// }
	// return null;
	// }

	public void storeEverythingToAgentscape(File operaFile) {
		// this method did have a parameter: ExecutionEvent event, but its not
		// used, so removed it
		File[] listOfFiles;

		// IFile file = ResourceUtil.getFile(HandlerUtil.getActiveEditor(event)
		// .getEditorInput());
		// String asFolderLocation = file.getParent().getParent().getName();

		String directoryPath = operaFile.getParent();
		// String destDirectoryName = asPath + "/input/" + asFolderLocation;
		String destDirectoryName = asPath + "/input/";
		File destDirectory = new File(destDirectoryName);

		destDirectory.mkdirs();

		listOfFiles = getFilesFromFolder(directoryPath, ".opera");
		try {
			copyFileToAs(listOfFiles[0], destDirectoryName);
		} catch (IOException e) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
		}

		listOfFiles = getFilesFromFolder(directoryPath, ".tasks");
		try {
			copyFileToAs(listOfFiles[0], destDirectoryName);
		} catch (IOException e) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
		}

		listOfFiles = getFilesFromFolder(directoryPath, ".actions");
		for (int i = 0; i < listOfFiles.length; i++) {

			try {
				copyFileToAs(listOfFiles[i], destDirectoryName);
			} catch (IOException e) {
				Activator.getDefault().getLog().log(
						new Status(Status.ERROR, Activator.PLUGIN_ID, e
								.getMessage(), e));
			}
		}

		listOfFiles = getFilesFromFolder(directoryPath, ".plans");
		for (int i = 0; i < listOfFiles.length; i++) {

			try {
				copyFileToAs(listOfFiles[i], destDirectoryName);
			} catch (IOException e) {
				Activator.getDefault().getLog().log(
						new Status(Status.ERROR, Activator.PLUGIN_ID, e
								.getMessage(), e));
			}
		}
	}

	private void deleteDirectory(File destDirectory) {
		File[] list = destDirectory.listFiles();
		for (int i = 0; i < list.length; i++) {
			File item = list[i];
			item.delete();
		}
		destDirectory.delete();
	}

	private void copyFileToAs(File sourceFile, String destDirectoryName)
			throws IOException {
		String destFileName = destDirectoryName + "/" + sourceFile.getName();
		File destFile = new File(destFileName);
		InputStream in = new FileInputStream(sourceFile);
		OutputStream out = new FileOutputStream(destFile);

		// Transfer bytes from in to out
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}

	private File[] getFilesFromFolder(String directoryPath,
			final String fileExtension) {
		File sourceFolder = new File(directoryPath);
		File[] list = sourceFolder.listFiles(new FileFilter() {
			public boolean accept(File file) {
				return (file.getName().endsWith(fileExtension));
			}
		});

		return list;
	}
}
