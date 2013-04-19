package net.sf.ictalive.service.serviceui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.ObjectRepository;
import net.sf.ictalive.service.discovery.WebServiceRepository;
import net.sf.ictalive.service.serviceui.RepositoryConnector.FindSyncedResourcesAction;
import net.sf.ictalive.service.serviceui.RepositoryConnector.SynchronizeResources;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class RepositorySyncWizard extends Wizard {

	IContainer initialContainer;
	List<IFile> syncResources;

	public RepositorySyncWizard(IContainer initialContainer) {
		this.initialContainer = initialContainer;
	}

	@Override
	public void addPages() {
		addPage(repoListPage = new RepoListPage());
		setNeedsProgressMonitor(true);

	}

	RepoListPage repoListPage;

	public class RepoListPage extends WizardPage {
		org.eclipse.swt.widgets.List resourceList;

		public RepoListPage() {
			super("Exported items");

		}

		void updateResourceList() {
			resourceList.removeAll();
			for (IFile file : syncResources) {
				resourceList.add(file.toString());
			}

		}

		@Override
		public void createControl(Composite parent) {
			Composite comp = new Composite(parent, SWT.NONE);
			setControl(comp);
			setDescription("the following resources will be exported to the repository");
			setTitle("Exported items");
			comp.setLayout(new FillLayout());

			resourceList = new org.eclipse.swt.widgets.List(comp, SWT.BORDER
					| SWT.SINGLE);

			comp.addListener(SWT.Show, new Listener() {

				@Override
				public void handleEvent(Event event) {
					if (syncResources == null) {
						FindSyncedResourcesAction action = new FindSyncedResourcesAction(

						initialContainer);
						try {
							getContainer().run(false, true, action);
						} catch (Exception e) {
							e.printStackTrace();
							return;
						}
						if (action.getResources().isEmpty()) {
							setErrorMessage("No synchronized resources found");
						} else {
							setPageComplete(true);
							syncResources = action.getResources();
							updateResourceList();

						}
					}
				}
			});

		}
	}

	@Override
	public void createPageControls(Composite pageContainer) {

		super.createPageControls(pageContainer);
	}

	@Override
	public boolean canFinish() {
		return repoListPage.isPageComplete();
	}

	@Override
	public boolean performFinish() {
		Job job = new Job("Uploading files") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Uploading resources",
						syncResources.size() + 1);
				ObjectRepository wsr = Activator.getDefault().getRepository(
						new SubProgressMonitor(monitor, 1));

				Map<IFile, ObjectDescriptor> info = new HashMap<IFile, ObjectDescriptor>();
				for (IFile res : syncResources) {
					try {
						ObjectDescriptor od = RepositoryConnector
								.getRepoProperties(res);
						if (od != null) {
							info.put(res, od);
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}

				}
				SynchronizeResources synca = new SynchronizeResources(info, wsr);
				try {
					synca.run(new SubProgressMonitor(monitor, syncResources
							.size()));
				} catch (Exception e) {
					e.printStackTrace();
					return Status.CANCEL_STATUS;
				} finally {
					monitor.done();
				}
				return Status.OK_STATUS;
			}
		};
		;

		job.schedule();
		return true;
	}
}
