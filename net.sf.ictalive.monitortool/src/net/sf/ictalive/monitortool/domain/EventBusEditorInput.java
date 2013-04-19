package net.sf.ictalive.monitortool.domain;

import java.io.InputStream;
import java.io.Reader;
import java.net.URI;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFileState;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IPathVariableManager;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceProxy;
import org.eclipse.core.resources.IResourceProxyVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;

public class EventBusEditorInput implements IEditorInput, IPersistableElement, IFile
{
	public EventBusEditorInput()
	{
		System.out.println("EventBusEditorInput");
	}

	@Override
	public boolean exists()
	{
		System.out.println("exists");
		return true;
	}

	@Override
	public ImageDescriptor getImageDescriptor()
	{
		System.out.println("getImageDescriptor");
		return ImageDescriptor.getMissingImageDescriptor();
	}

	@Override
	public String getName()
	{
		System.out.println("getName");
		return "getName()";
	}

	@Override
	public IPersistableElement getPersistable()
	{
		System.out.println("getPersistable");
		return this;
	}

	@Override
	public String getToolTipText()
	{
		System.out.println("getToolTipText");
		return "getToolTipText()";
	}

	@Override
	public Object getAdapter(Class arg0)
	{
		System.out.println("getAdapter(" + arg0.getName() + ")");
		return this;
	}

	@Override
	public String getFactoryId()
	{
		System.out.println("getFactoryId");
		return "monitortool.editors.EventBusEditorInputFactory";
	}

	@Override
	public void saveState(IMemento arg0)
	{
		System.out.println("saveState");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void appendContents(InputStream arg0, int arg1, IProgressMonitor arg2)
			throws CoreException
	{
		System.out.println("appendContents");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void appendContents(InputStream arg0, boolean arg1, boolean arg2,
			IProgressMonitor arg3) throws CoreException
	{
		System.out.println("appendContents");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(InputStream arg0, boolean arg1, IProgressMonitor arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		System.out.println("create");
		
	}

	@Override
	public void create(InputStream arg0, int arg1, IProgressMonitor arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		System.out.println("create");
		
	}

	@Override
	public void createLink(IPath arg0, int arg1, IProgressMonitor arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		System.out.println("createLink");
		
	}

	@Override
	public void createLink(URI arg0, int arg1, IProgressMonitor arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(boolean arg0, boolean arg1, IProgressMonitor arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCharset() throws CoreException
	{
		System.out.println("getCharset");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCharset(boolean arg0) throws CoreException
	{
		System.out.println("getCharset");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCharsetFor(Reader arg0) throws CoreException
	{
		System.out.println("getCharsetFor");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContentDescription getContentDescription() throws CoreException
	{
		System.out.println("getContentDescription");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getContents() throws CoreException
	{
		System.out.println("getContents");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getContents(boolean arg0) throws CoreException
	{
		System.out.println("getContents");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEncoding() throws CoreException
	{
		System.out.println("getEncoding");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IPath getFullPath()
	{
		System.out.println("getFullPath");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IFileState[] getHistory(IProgressMonitor arg0) throws CoreException
	{
		System.out.println("getHistory");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isReadOnly()
	{
		System.out.println("isReadOnly");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(IPath arg0, boolean arg1, boolean arg2,
			IProgressMonitor arg3) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCharset(String arg0) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCharset(String arg0, IProgressMonitor arg1)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setContents(InputStream arg0, int arg1, IProgressMonitor arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setContents(IFileState arg0, int arg1, IProgressMonitor arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setContents(InputStream arg0, boolean arg1, boolean arg2,
			IProgressMonitor arg3) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setContents(IFileState arg0, boolean arg1, boolean arg2,
			IProgressMonitor arg3) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(IResourceVisitor arg0) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(IResourceProxyVisitor arg0, int arg1)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(IResourceVisitor arg0, int arg1, boolean arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(IResourceVisitor arg0, int arg1, int arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearHistory(IProgressMonitor arg0) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void copy(IPath arg0, boolean arg1, IProgressMonitor arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void copy(IPath arg0, int arg1, IProgressMonitor arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void copy(IProjectDescription arg0, boolean arg1,
			IProgressMonitor arg2) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void copy(IProjectDescription arg0, int arg1, IProgressMonitor arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public IMarker createMarker(String arg0) throws CoreException
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResourceProxy createProxy()
	{
		System.out.println("createProxy");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(boolean arg0, IProgressMonitor arg1)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int arg0, IProgressMonitor arg1) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMarkers(String arg0, boolean arg1, int arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public IMarker findMarker(long arg0) throws CoreException
	{
		System.out.println("findMarker");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMarker[] findMarkers(String arg0, boolean arg1, int arg2)
			throws CoreException
	{
		System.out.println("findMarkers");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findMaxProblemSeverity(String arg0, boolean arg1, int arg2)
			throws CoreException
	{
		System.out.println("findMaxProblemSeverity");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getFileExtension()
	{
		System.out.println("getFileExtension");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getLocalTimeStamp()
	{
		System.out.println("getLocalTimeStamp");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IPath getLocation()
	{
		System.out.println("getLocation");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getLocationURI()
	{
		System.out.println("getLocationURI");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMarker getMarker(long arg0)
	{
		System.out.println("getMarker");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getModificationStamp()
	{
		System.out.println("getModificationStamp");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IContainer getParent()
	{
		System.out.println("getParent");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getPersistentProperties() throws CoreException
	{
		System.out.println("getPersistentProperties");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPersistentProperty(QualifiedName arg0)
			throws CoreException
	{
		System.out.println("getPersistentProperty");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IProject getProject()
	{
		System.out.println("getProject ");
		return ResourcesPlugin.getWorkspace().getRoot().getProject();
	}

	@Override
	public IPath getProjectRelativePath()
	{
		System.out.println("getProjectRelativePath");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPath getRawLocation()
	{
		System.out.println("getRawLocation");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getRawLocationURI()
	{
		System.out.println("getRawLocationURI");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceAttributes getResourceAttributes()
	{
		System.out.println("getResourceAttributes");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getSessionProperties() throws CoreException
	{
		System.out.println("getSessionProperties");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getSessionProperty(QualifiedName arg0) throws CoreException
	{
		System.out.println("getSessionProperty");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getType()
	{
		System.out.println("getType");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IWorkspace getWorkspace()
	{
		System.out.println("getWorkspace");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccessible()
	{
		System.out.println("isAccessible");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDerived()
	{
		System.out.println("isDerived");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDerived(int arg0)
	{
		System.out.println("isDerived");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHidden()
	{
		System.out.println("isHidden");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHidden(int arg0)
	{
		System.out.println("isHidden");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLinked()
	{
		System.out.println("isLinked");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLinked(int arg0)
	{
		System.out.println("isLinked");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLocal(int arg0)
	{
		System.out.println("isLocal");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPhantom()
	{
		System.out.println("isPhantom");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSynchronized(int arg0)
	{
		System.out.println("isSynchronized");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTeamPrivateMember()
	{
		System.out.println("isTeamPrivateMember");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTeamPrivateMember(int arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(IPath arg0, boolean arg1, IProgressMonitor arg2)
			throws CoreException
	{
		System.out.println("move");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(IPath arg0, int arg1, IProgressMonitor arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(IProjectDescription arg0, int arg1, IProgressMonitor arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(IProjectDescription arg0, boolean arg1, boolean arg2,
			IProgressMonitor arg3) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refreshLocal(int arg0, IProgressMonitor arg1)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revertModificationStamp(long arg0) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDerived(boolean arg0) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHidden(boolean arg0) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLocal(boolean arg0, int arg1, IProgressMonitor arg2)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public long setLocalTimeStamp(long arg0) throws CoreException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPersistentProperty(QualifiedName arg0, String arg1)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setReadOnly(boolean arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResourceAttributes(ResourceAttributes arg0)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSessionProperty(QualifiedName arg0, Object arg1)
			throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTeamPrivateMember(boolean arg0) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void touch(IProgressMonitor arg0) throws CoreException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(ISchedulingRule arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isConflicting(ISchedulingRule arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	
	/**
	 * Added by occ - for Helios Compatibility 
	 */
	public IPathVariableManager getPathVariableManager() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean isVirtual() {
		// TODO Auto-generated method stub
		return false;
	}
	

	public void setDerived(boolean arg0, IProgressMonitor arg1)
			throws CoreException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(IResourceProxyVisitor arg0, int arg1, int arg2)
			throws CoreException {
		// TODO Auto-generated method stub
		
	}
}