package control.diagram.util;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.ObjectRepository;
import net.sf.ictalive.service.serviceui.Activator;
import net.sf.ictalive.service.serviceui.RepositoryConnector;
import net.sf.ictalive.service.serviceui.ServiceRepositoryExportPage;
import net.sf.ictalive.service.serviceui.ServiceRepositoryImportPage;
import net.sf.ictalive.service.serviceui.RepositoryConnector.SynchronizeResources;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.wizard.Wizard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PublishOWLSWizard extends Wizard {

	private final IFile fileToExport;

	public PublishOWLSWizard(IFile _fileToExport) {
		fileToExport = _fileToExport;
	}

	private ServiceRepositoryExportPage exportPage;

	Logger log = LoggerFactory.getLogger(PublishOWLSWizard.class);

	public void addPages() {
		log.debug("Adding page to publishOWLSWizard");
		exportPage = new ServiceRepositoryExportPage("Publish to repository",
				fileToExport);
		exportPage.setTitle("Publish to repository");
		exportPage
				.setDescription("Set  or the object properties to publish the object");
		this.addPage(exportPage);
	}

	@Override
	public boolean canFinish() {
		return exportPage.isPageComplete();
	}

	@Override
	public boolean performFinish() {
		final IFile res = fileToExport;
		final ObjectDescriptor od = exportPage.gatherObjectData();
		boolean keepSynced = exportPage.keepSynced();
		try {
			RepositoryConnector.saveRepoProperties(res, keepSynced, od);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		Job syncJob = new Job("Uploading " + res.getName()) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				ObjectRepository objectr = Activator.getDefault()
						.getRepository(new SubProgressMonitor(monitor, 1));
				Map<IFile, ObjectDescriptor> desc = Collections.singletonMap(
						res, od);
				SynchronizeResources syncr = new SynchronizeResources(desc,
						objectr);
				try {
					syncr.run(new SubProgressMonitor(monitor, 1));
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return Status.OK_STATUS;
			}
		};
		syncJob.schedule();
		return true;
	}
}
