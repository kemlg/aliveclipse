package net.sf.ictalive.coordination.agents.diagram.oaw.util;

public class PathUtils {

	private String path;

	private String runAgentScapeBuildFile,injectAgentsBuildFile, generatedFilesDir;
	
	private static PathUtils INSTANCE = new PathUtils();
	
	private PathUtils(){
		super();
		path = null;
		runAgentScapeBuildFile = "runAgentScape_build.xml";
		injectAgentsBuildFile="injectAgents_build.xml";
		generatedFilesDir = null;
	}
	
	public static void setAgentScapePath(String path){
		PathUtils.INSTANCE.path = path;
	}
	
	public static String getAgentScapePath(){
		return PathUtils.INSTANCE.path;
	}
	
	public static String getRunAgentScapeBuildFileName(){
		return PathUtils.INSTANCE.runAgentScapeBuildFile;
	}
	
	public static String getInjectAgentsBuildFileName(){
		return PathUtils.INSTANCE.injectAgentsBuildFile;
	}

	public static String getGeneratedFilesDir() {
		return PathUtils.INSTANCE.generatedFilesDir;
	}

	public static void setGeneratedFilesDir(String generatedFilesDir) {
		PathUtils.INSTANCE.generatedFilesDir = generatedFilesDir;
	}
	
	
	
}
