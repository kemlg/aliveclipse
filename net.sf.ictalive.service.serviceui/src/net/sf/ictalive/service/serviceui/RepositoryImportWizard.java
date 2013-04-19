package net.sf.ictalive.service.serviceui;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.query.DiscoverySearch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.mindswap.utils.URIUtils;

import com.google.common.base.Preconditions;

/**
 * Wizard which allows a resource from the repository to be imported into the
 * workspace
 * 
 * @author occ
 * 
 */
public class RepositoryImportWizard extends Wizard implements IWorkbenchWizard {
	ServiceRepositoryImportPage repositoryImportPage;
	WizardNewFileCreationPage newFilePage;
	DiscoverySearch search;

	public RepositoryImportWizard() {
		this(DiscoverySearch.search());
	}

	public RepositoryImportWizard(DiscoverySearch search) {
		Preconditions.checkNotNull(search);
		this.search = search;
	}

	@Override
	public void addPages() {
		super.addPages();

		addPage(repositoryImportPage = new ServiceRepositoryImportPage(
				"Select an artifact to import", search));
		repositoryImportPage.setTitle("Import from repository");
		repositoryImportPage.setDescription("Select an object to import from the repository");
		addPage(newFilePage = new WizardNewFileCreationPage(
				"Select Location in workspace to save file",
				new StructuredSelection()) {

			@Override
			public void createControl(Composite parent) {
				// TODO Auto-generated method stub
				super.createControl(parent);
				getControl().addListener(SWT.Show, new Listener() {

					@Override
					public void handleEvent(Event event) {
						ObjectDescriptor od;
						if (null != (od = repositoryImportPage
								.getSelectedObjectDescriptor())) {

							URI objectURI = od.getUri();

							String main = URIUtils.standardURI(objectURI)
									.toString();
							int lastIdx = main.lastIndexOf("/");
							if (lastIdx != -1) {
								String part = main.substring(lastIdx+1);
								newFilePage.setFileName(part);
							}

						}

					}
				});
			}

		});

		newFilePage.setDescription("Select a destination OWLS file");
		newFilePage.setFileExtension("owl");
		newFilePage.setFileName("new_object.owl");
		newFilePage.setAllowExistingResources(true);
	}

	@Override
	public boolean performFinish() {
		final IFile targetFile = newFilePage.createNewFile();
		final ObjectDescriptor descriptor = repositoryImportPage
				.getSelectedObjectDescriptor();
		Preconditions.checkNotNull(targetFile);
		Preconditions.checkNotNull(descriptor);

		WorkspaceModifyOperation op = new WorkspaceModifyOperation() {

			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException,
					InterruptedException {
				try {
					monitor.beginTask("Downloading "
							+ descriptor.getUri().toString(),
							IProgressMonitor.UNKNOWN);
					InputStream is = descriptor.getResourceURL().toURL()
							.openStream();

					targetFile.appendContents(is, true, true,
							new SubProgressMonitor(monitor,
									IProgressMonitor.UNKNOWN));

				} catch (Exception e) {
					e.printStackTrace();
				} finally {

					monitor.done();
				}

			}
		};

		try {
			getContainer().run(false, true, op);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

}
