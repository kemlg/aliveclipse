package edu.bath.alivetemplates;

import java.net.URI;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lexer/parser for ASP bindings table.
 * @author adan
 *
 */
class ASPBindings {
	Logger log = LoggerFactory.getLogger(ASPBindings.class);
	private String bindingString;
	private List<ASPBindingModel> models = new LinkedList<ASPBindingModel>();
	
	public String getOrig() {
		return this.bindingString;
	}
	
	/* Regex-es */
	// Taken from http://timezra.blogspot.com/2010/05/regex-to-validate-uris.html
	private static final String URI_REFERENCE_REGEX = "(([a-zA-Z][a-zA-Z0-9\\+\\-\\.]*:((((//((((([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\);:\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)\\@)?((((([a-zA-Z0-9](([a-zA-Z0-9\\-])*[a-zA-Z0-9])?)\\.)*([a-zA-Z](([a-zA-Z0-9\\-])*[a-zA-Z0-9])?)(\\.)?)|([0-9]+((\\.[0-9]+){3})))(:[0-9]*)?))?|([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\)$,;:\\@\\&=\\+]|(%[a-fA-F0-9]{2}))+)(/(([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*(;([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)*)(/(([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*(;([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)*))*)?)|(/(([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*(;([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)*)(/(([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*(;([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)*))*))(\\?([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\);/\\?:\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)?)|(([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\);\\?:\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\);/\\?:\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)))|(((//((((([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\);:\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)\\@)?((((([a-zA-Z0-9](([a-zA-Z0-9\\-])*[a-zA-Z0-9])?)\\.)*([a-zA-Z](([a-zA-Z0-9\\-])*[a-zA-Z0-9])?)(\\.)?)|([0-9]+((\\.[0-9]+){3})))(:[0-9]*)?))?|([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\)$,;:\\@\\&=\\+]|(%[a-fA-F0-9]{2}))+)(/(([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*(;([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)*)(/(([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*(;([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)*))*)?)|(/(([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*(;([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)*)(/(([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*(;([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)*))*)|(([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\);\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))+(/(([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*(;([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)*)(/(([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*(;([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\):\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)*))*)?))(\\?([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\);/\\?:\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)?))?(\\#([a-zA-Z0-9\\-_\\.!\\~\\*'\\(\\);/\\?:\\@\\&=\\+$,]|(%[a-fA-F0-9]{2}))*)?";
	// Some slightly more sane regular expressions
	private static final String aspPropertyNameRegex = "[a-z_][A-Za-z0-9_]*";
	private static final String aspPropertyNameHeadRegex = "'"+aspPropertyNameRegex+"'";
	private static final String aspPropertyURIRegex = URI_REFERENCE_REGEX;
	private static final String aspPropertyBodyRegex = aspPropertyNameHeadRegex+":"+aspPropertyURIRegex;
	private static final String aspPropertyDVEntryRegex = aspPropertyNameRegex+":"+aspPropertyURIRegex;
	private static final String aspPropertyDVMapRegex = aspPropertyDVEntryRegex+"(,"+aspPropertyDVEntryRegex+")*";
	private static final String aspPropertyInstanceRegex = "\\{"+aspPropertyDVMapRegex+"\\}";
	private static final String aspPropertyFullRegex = aspPropertyBodyRegex+"("+aspPropertyInstanceRegex+")?";
	/* Compiled patterns */
	private static final Pattern aspPropertyNamePattern = Pattern.compile(aspPropertyNameRegex);
	private static final Pattern aspPropertyNameHeadPattern = Pattern.compile(aspPropertyNameHeadRegex);
	private static final Pattern aspPropertyURIPattern = Pattern.compile(aspPropertyURIRegex);
	//private static final Pattern aspPropertyBodyPattern = Pattern.compile(aspPropertyBodyRegex);
	//private static final Pattern aspPropertyDVEntryPattern = Pattern.compile(aspPropertyDVEntryRegex);
	private static final Pattern aspPropertyDVMapPattern = Pattern.compile(aspPropertyDVMapRegex);
	private static final Pattern aspPropertyInstancePattern = Pattern.compile(aspPropertyInstanceRegex);
	
	/**
	 * Inititate based on a binding string
	 * @param bindings
	 */
	public ASPBindings(String bindings) {
		this.bindingString = bindings;
		
		String bindingLines[] = bindings.split("\n");
		for(String line : bindingLines) {
			line = line.replaceAll("\\s", ""); // Strip out whitespace, it isn't needed
			if(line.equals(""))// Skip blank lines
				continue;
			
			// An invalid line is skipped and reported
			boolean valid = line.matches(aspPropertyFullRegex);
			if(!valid) {
				log.info("Invalid ASP binding '"+line+"'.");
				continue;
			}
			
			// Offset to start matching from, updated each time we take a bit off the line
			int startFrom = 0;
			// Data structure in which to store object
			ASPBindingModel model = new ASPBindingModel();
			
			// Braces are here to scope matcher to prevent accidentally using it again elsewhere.
			{
				// Extract asp property name
				Matcher nameHeadMatcher = aspPropertyNameHeadPattern.matcher(line);
				nameHeadMatcher.find(startFrom);
				startFrom = nameHeadMatcher.end();
				
				Matcher nameMatcher = aspPropertyNamePattern.matcher(nameHeadMatcher.group());
				nameMatcher.find();
				model.aspPropertyName = nameMatcher.group();
			} {
				// Extract property URI
				Matcher uriMatcher = aspPropertyURIPattern.matcher(line);
				uriMatcher.find(startFrom+1);
				startFrom = uriMatcher.end();
				model.aspPropertyURI=URI.create(uriMatcher.group());
			} 
			instances: {
				// Extract instances
				if(line.substring(startFrom).equals("")) // If it doesn't have an instances section, break
					break instances;
				
				Matcher instancesMatcher = aspPropertyInstancePattern.matcher(line);
				instancesMatcher.find(startFrom);
				
				Matcher mapMatcher = aspPropertyDVMapPattern.matcher(instancesMatcher.group());
				mapMatcher.find();
				String[] entries = mapMatcher.group().split(",");// NOTE: It is probably best to avoid
				// commas in URIs!
				
				for(String entry : entries) {
					Matcher entryNameMatcher = aspPropertyNamePattern.matcher(entry);
					entryNameMatcher.find();					
					startFrom = entryNameMatcher.end();
					
					Matcher entryURIMatcher = aspPropertyURIPattern.matcher(entry);
					entryURIMatcher.find(startFrom+1);
					
					model.aspPropertyInstanceNames.put(entryNameMatcher.group(), 
							URI.create(entryURIMatcher.group()));
				}
			}
			
			models.add(model);
		}
	}
	
	public class ASPBindingModel {
		private String aspPropertyName;
		private URI aspPropertyURI;
		private Map<String, URI> aspPropertyInstanceNames = new HashMap<String, URI>();
		
		public String toString() {
			String output = "Name: "+aspPropertyName+"\n";
			output += "Property URI: "+aspPropertyURI.toString()+"\n";
			for(Entry<String, URI> dataItem : aspPropertyInstanceNames.entrySet()) {
				output += "  "+dataItem.getKey()+", "+dataItem.getValue().toString()+"\n";
			}
			return output;
		}
	}
	
	/**
	 * Fetch binding objects.
	 * @return
	 */
	public Map<String, URI> getPropertyBindingMap() {
		Map<String, URI> bindingMap = new HashMap<String, URI>();
		
		for(ASPBindingModel model : models) {
			bindingMap.put(model.aspPropertyName, model.aspPropertyURI);
		}
		
		return bindingMap;
	}
	
	/**
	 * Fetch binding object for a particular property.
	 * @param property
	 * @return
	 */
	public Map<String, URI> getIndividualBindingMap(URI property) {
		for(ASPBindingModel model : models) {
			if(model.aspPropertyURI.equals(property)) {
				return model.aspPropertyInstanceNames;
			}
		}
		
		return null;
	}
	
	public List<ASPBindingModel> getModels() {
		return this.models;
	}
}
