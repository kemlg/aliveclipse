package edu.bath.alivetemplates;

import java.net.URI;
import java.util.LinkedList;
import java.util.List;

import org.mindswap.owl.OWLDataProperty;
import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.process.CompositeProcess;
import org.mindswap.owls.process.ControlConstruct;
import org.mindswap.owls.process.Process;

public class TemplateHelper {

	/**
	 * Get a list of all slots.
	 * 
	 * @return List of all processes which are slots.
	 */
	public static List<org.mindswap.owls.process.Process> findTemplateSlots(
			CompositeProcess process) {
		ControlConstruct root = process.getComposedOf();
		List<org.mindswap.owls.process.Process> slotProcesses = new LinkedList<org.mindswap.owls.process.Process>();

		OWLIndividualList<org.mindswap.owls.process.Process> processes = root
				.getAllProcesses(true);
		for (org.mindswap.owls.process.Process p : processes)
			if (isSlot(p))
				slotProcesses.add(p);

		return slotProcesses;
	}

	public static final URI IS_SLOT_URI = URI
			.create("http://www.ist-alive.eu/ontologies/ALIVE-Template.owl#isSlot");

	/**
	 * retrieves the template slot property from the KB
	 * 
	 * @param kb
	 * 
	 * @throws TemplateException
	 *             if it can't be loaded
	 * @return the property
	 */
	public static OWLDataProperty getTemplateSlotProperty(OWLKnowledgeBase kb) {
		/* Find the slot marker property */
		OWLDataProperty templateProperty = kb.getDataProperty(IS_SLOT_URI);
		if (templateProperty == null)
			throw new TemplateException(
					"Could not find template tag property {} in knowledge base (did you import it?).",
					IS_SLOT_URI);
		return templateProperty;
	}

	/**
	 * Tests to see if a process is a lot.
	 * 
	 * @param p
	 *            Process to test.
	 * @return True if p is a slot, otherwise false.
	 */
	public static boolean isSlot(org.mindswap.owls.process.Process process) {
		if (process.canCastTo(CompositeProcess.class)
				&& process
						.getProperty(getTemplateSlotProperty(process.getKB())) != null)
			return true;
		return false;
	}

	/**
	 * Extracts the slot name property of a slot process,
	 * 
	 * if this isnt' set or is empty it will return the local name of the slot
	 * 
	 * @param slotProc
	 * @return
	 */
	public static String getSlotName(Process slotProc) {
		OWLDataProperty slotProp = getTemplateSlotProperty(slotProc.getKB());
		OWLDataValue val = slotProc.getProperty(slotProp);
		if (val != null && val.getValue() != null) {
			return val.getValue().toString();
		} else {
			return slotProc.getLocalName();
		}
	}
}
