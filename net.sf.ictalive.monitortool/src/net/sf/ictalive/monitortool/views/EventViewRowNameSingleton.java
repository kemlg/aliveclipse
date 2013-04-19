package net.sf.ictalive.monitortool.views;

public class EventViewRowNameSingleton 
{
	public static String[] rowNames = initRowNames();
	public static int[] rowBounds = initRowBounds();
	
	public static int LOCAL_KEY = 0;
	public static int ASSERTER = 1;
	public static int CONTENT = 2;
	public static int CONTENTEFFECT = 3;
	public static int POINT_OF_VIEW = 4;
	public static int PROVENANCE = 5;
	public static int TIMESTAMP = 6;
	
	private static String[] initRowNames()
	{
		String[] res = new String[7];
		
		res[0] = "Local key";
		res[1] = "Asserter";
		res[2] = "Content";
		res[3] = "Effect";
		res[4] = "Point of View";
		res[5] = "Provenance";
		res[6] = "TimeStamp";
		
		
		return res;
		
	}
	
	
	private static int[] initRowBounds()
	{
		int [] res = { 300, 300, 300, 300,300,300,300 };
		return res;
	}
}
