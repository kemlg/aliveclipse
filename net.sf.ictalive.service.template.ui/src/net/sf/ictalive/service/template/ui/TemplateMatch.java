package net.sf.ictalive.service.template.ui;

import java.util.List;
import java.util.Map;

import org.mindswap.owls.process.Process;
import org.mindswap.owls.service.Service;

public class TemplateMatch {
	Service template;
	public Service getTemplate() {
		return template;
	}

	Map<Process, Process> templateAssignments;

	public Map<Process, Process> getTemplateAssignments() {
		return templateAssignments;
	}

	List<Process> slots;

	public TemplateMatch(Service template, List<Process> slots,
			Map<Process, Process> templateAssignments) {
		super();
		this.template = template;
		this.slots = slots;
		this.templateAssignments = templateAssignments;
	}

	public List<Process> getSlots() {
		return slots;
	}

}
