package edu.bath.alivetemplates;

import jaspwrapper.items.Model;

import java.util.Map;

import org.mindswap.owls.process.Process;

/**
 * A wrapper used to return answer set information used to transform 
 * templates into concrete composite services.
 * @author adan
 *
 */
public class TemplateAnswerSet {
	private Map<Process, Process> answerSetMapping;
	private Model answerSetModel;
	
	public TemplateAnswerSet(Map<Process, Process> mapping, Model model) {
		this.answerSetMapping = mapping;
		this.answerSetModel = model;
	}
	
	/**
	 * Fetches the mapping represented by this answer set.
	 * @return A mapping from slot processes to concrete replacements.
	 */
	public Map<Process, Process> getMapping() {
		return this.answerSetMapping;
	}
	
	/**
	 * Fetches 'raw' answer set model so additional information can be passed through 
	 * ASP and recovered by code using the API.
	 * @return JASPWrapper answer set model.
	 */
	public Model getModel() {
		return this.answerSetModel;
	}
}
