package control.diagram.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.part.WorkbenchPart;
import org.mindswap.owl.*;
import org.mindswap.owls.expression.Condition;
import org.mindswap.owls.process.Result;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.variable.Output;
import org.mindswap.owls.process.variable.ResultVar;
import org.mindswap.owls.service.Service;
import org.mindswap.utils.URIUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import impl.owls.process.*;

import control.ControlFactory;
import control.ControlPackage;
import control.Expr;
import control.diagram.part.ControlDiagramEditorPlugin;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.client.WebServiceClientFactory;
import net.sf.ictalive.service.tool.*;
/**
 * @generated NOT
 */
public class RemoteServiceImporter {

	OWLOntology oo;
	OWLKnowledgeBase kb;

	static final String SWRL_URI_STRING = "http://www.w3.org/2003/11/swrl";
	static final String KIF_URI_STRING = "http://logic.stanford.edu/kif/kif.html";
	static final String DRS_URI_STRING = "http://www.daml.org/services/owl-s/1.1/generic/drs.owl";

	private static Shell pluginShell;
	Logger log = LoggerFactory.getLogger(RemoteServiceImporter.class);


	public RemoteServiceImporter() {

		oo = null; 
		kb = OWLFactory.createKB();
	}


	public control.RemoteProcess setupAliveRepo(Shell _shell) {

		OWLOntology remoteOntology;
		Service selectedService = null;

		if(_shell != null) {
			pluginShell = _shell;
		} else {
			pluginShell = ControlDiagramEditorPlugin.getInstance().getWorkbench().getDisplay().getActiveShell();	
		}

		/**
		 * add new service import wizard
		 */
		ServiceImportWizard wizard = new ServiceImportWizard();
		WizardDialog wDialog = new WizardDialog(_shell, wizard);
		//wDialog.create();
		wDialog.open();

		ObjectDescriptor newOD = wizard.getObjectDescriptor();
		URI serviceURI = newOD.getUri();
		URL serviceURL = null;
		try {
			serviceURL = newOD.getResourceURL().toURL();
		} catch (MalformedURLException e) {
			makeMessageBox(SWT.ICON_ERROR, "Aborting - malformed service URL");	
			return null;
		}

		try {
			remoteOntology = kb.read(serviceURL.openStream(), serviceURI);
		} catch (IOException e) {
			makeMessageBox(SWT.ICON_ERROR, "IOError reading remote service from:\n" + serviceURL.toString());	
			e.printStackTrace();
			return null;
		}
		try {
			List<Service>remoteServiceList = remoteOntology.getServices(true);
			selectedService = remoteServiceList.get(0);
		} catch (RuntimeException re) {
			makeMessageBox(SWT.ICON_ERROR, "Error reading remote service from:\n" + serviceURL.toString());	
			re.printStackTrace();
			return null;
		}

		if(selectedService!=null) {
			makeMessageBox(SWT.ICON_INFORMATION, "Successfully imported service: " + selectedService.getLocalName());		
		} else {
			makeMessageBox(SWT.ICON_ERROR, "Aborting - no service chosen");	
			return null;
		}

		control.RemoteProcess returnProcess = convertService(selectedService);
		returnProcess.setRemoteURL(serviceURL.toString());
		returnProcess.setRemoteURI(serviceURI.toString());

		return returnProcess;

	}

	private Service chooseService(OWLIndividualList<Service> _serviceList) {

		String[] serviceNames; 
		Service returnService = null;
		if(_serviceList.size()==1) {
			returnService = _serviceList.get(0);
		} else if (_serviceList.size() > 1){
			Map<String, Service> serviceNameMap = new HashMap<String, Service>();
			for(Service theService : _serviceList) {
				serviceNameMap.put(theService.getLocalName(), theService);
			}
			serviceNames =  (String[])( serviceNameMap.keySet().toArray( new String[serviceNameMap.size()] ) );	
			java.util.Arrays.sort(serviceNames);
			String chosenService = (String) JOptionPane.showInputDialog(null, 
					"Multiple services are available at this URI",
					"Select service to import",
					JOptionPane.QUESTION_MESSAGE,
					null, 
					serviceNames,
					serviceNames[0]
			);
			if(chosenService!=null) {
				returnService = serviceNameMap.get(chosenService);
			} 

		}
		return returnService;
	}

	private void makeMessageBox(int style, String msgString) {
		MessageBox mb = new MessageBox(pluginShell, style);

		mb.setText("Import remote service");
		mb.setMessage(msgString);
		mb.open();
	}

	private control.RemoteProcess convertService(Service _service) {

		control.RemoteProcess returnProcess = ControlFactory.eINSTANCE.createRemoteProcess();

		if(!(_service.getLocalName()==null)) {
			returnProcess.setName(_service.getLocalName());
		}

		returnProcess.setRemoteURI(_service.getURI().toString());

		List<control.Input> inputList = getInputs(_service);
		if(!(inputList==null)) {
			returnProcess.eSet(ControlPackage.Literals.ABSTRACT_PROCESS__HAS_INPUT, inputList);
		}


		List<control.Output> outputList = getOutputs(_service);
		if(!(outputList==null)) {
			returnProcess.eSet(ControlPackage.Literals.ABSTRACT_PROCESS__HAS_OUTPUT, outputList);
		}

		List<control.Expr> preconditionList = getPreconditions(_service);
		if(!(preconditionList==null)) {
			returnProcess.eSet(ControlPackage.Literals.REMOTE_PROCESS__EXPRESSIONS, preconditionList);
		}

		List<control.Result> resultList = getResults(_service);
		if(!(resultList==null)) {
			System.out.println("Setting result list");
			returnProcess.eSet(ControlPackage.Literals.REMOTE_PROCESS__HAS_RESULT, resultList);
		}

		System.out.println("Set " + returnProcess.getHasInput().size() + " inputs");

		return returnProcess;
	}


	public List<control.Input> getInputs(Service _service) {
		if(_service==null || _service.getProcess() == null || _service.getProcess().getInputs().size()==0) {
			return null;
		}
		List<control.Input> inputList = new ArrayList<control.Input>();

		for(Input owlInput : _service.getProcess().getInputs()) {
			control.Input newInput = ControlFactory.eINSTANCE.createInput();
			newInput.setName(owlInput.getName());
			newInput.setParameterType(owlInput.getParamType().getURI().toString());
			inputList.add(newInput);
			System.out.println("Adding input: " + newInput.getName() + " " + newInput.getParameterType());
		}

		return inputList;
	}

	public List<control.Output> getOutputs(Service _service) {
		if(_service==null || _service.getProcess() == null || _service.getProcess().getOutputs().size()==0) {
			return null;
		}
		List<control.Output> outputList = new ArrayList<control.Output>();

		for(Output owlOutput : _service.getProcess().getOutputs()) {
			control.Output newOutput = ControlFactory.eINSTANCE.createOutput();
			newOutput.setName(owlOutput.getName());
			newOutput.setParameterType(owlOutput.getParamType().getURI().toString());
			outputList.add(newOutput);
			System.out.println("Adding output: " + newOutput.getName() + " " + newOutput.getParameterType());
		}

		return outputList;
	}

	public List<control.Expr> getPreconditions(Service _service) {
		if(_service==null || _service.getProcess() == null || _service.getProcess().getConditions().size()==0) {
			return null;
		}
		List<control.Expr> conditionList = new ArrayList<control.Expr>();

		for(Condition owlCondition : _service.getProcess().getConditions()) {
			Expr newCondition = ControlFactory.eINSTANCE.createCondition();
			newCondition.setName(owlCondition.getLocalName());
			// set logic language by matching URI
			newCondition.setLogicLanguage(getOWLLogicLanguage(owlCondition));

			newCondition.setBodyLiteral(owlCondition.getBody().toString());
			conditionList.add(newCondition);
		}
		return conditionList;
	}

	public List<control.Result> getResults(Service _service) {
		if(_service==null || _service.getProcess() == null || _service.getProcess().getResults().size()==0) {
			return null;
		}
		List<control.Result> ResultList = new ArrayList<control.Result>();

		for(Result owlResult : _service.getProcess().getResults()) {
			control.Result newResult = ControlFactory.eINSTANCE.createResult();
			if(owlResult.getLocalName()!=null) {
				newResult.setName(owlResult.getLocalName());
			} else {
				newResult.setName("Result_" + ResultList.size());
			}

			// according to OWL-S API
			// result may have 0...* resultVars
			// OWL-S standard seems to say 0...1
			// so that's what we're doing
			ResultVar owlResultVar = owlResult.getResultVar();
			control.ResultVar newResultVar = ControlFactory.eINSTANCE.createResultVar();
			newResultVar.setParameterType(owlResultVar.getParamType().getURI().toString());

			newResult.setHasResultVar(newResultVar);

			for(Condition owlCondition : owlResult.getConditions()) {
				control.Expr newExpr = ControlFactory.eINSTANCE.createExpr();

				// set logic language by matching URI
				newExpr.setLogicLanguage(getOWLLogicLanguage(owlCondition));

				newExpr.setBodyLiteral(owlCondition.getBody().toString());
			}

			ResultList.add(newResult);
			System.out.println("Adding Result: " + newResult.getName());

		}

		return ResultList;
	}

	private control.ExpressionLanguage getOWLLogicLanguage(Condition owlCondition) {

		String owlLanguageString = owlCondition.getLanguage().getRefURI().toString();
		control.ExpressionLanguage retLang;
		if(owlLanguageString.equalsIgnoreCase(KIF_URI_STRING)) {
			retLang = control.ExpressionLanguage.KIF;
		} else if(owlLanguageString.equalsIgnoreCase(SWRL_URI_STRING)) {
			retLang = control.ExpressionLanguage.SWRL;
		} else if(owlLanguageString.equalsIgnoreCase(DRS_URI_STRING)) {
			retLang = control.ExpressionLanguage.DRS;
		} else {
			retLang = null;
		}
		return retLang;
	}

	private URI getURIFromUser() {
		IInputValidator inputValidator = new IInputValidator() {
			@Override
			public String isValid(String newText) {
				// Check for valid URI / empty string
				if(newText.length()==0 || makeURI(newText)==null) {
					return "Please enter a valid URI";
				}
				return null;
			}
		};

		InputDialog uriInput = new InputDialog(pluginShell, "Import service", "Enter the URI of the remote service",
				"", inputValidator);

		String inputURI;
		if(uriInput.open()==Window.OK) {
			inputURI = uriInput.getValue();
		} else {
			return null;
		}

		URI returnURI = URI.create(inputURI);

		return returnURI;
	}

	private URI makeURI(String uriText) {
		URI newURI = null;
		try {
			newURI = URIUtil.fromString(uriText);
		} catch(URISyntaxException e) {
			return null;
		}
		return newURI;
	}

}

