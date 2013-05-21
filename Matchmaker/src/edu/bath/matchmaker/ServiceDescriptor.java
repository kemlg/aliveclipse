package edu.bath.matchmaker;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.io.Serializable;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.grounding.AtomicGrounding;
import org.mindswap.owls.grounding.Grounding;
import org.mindswap.owls.grounding.WSDLAtomicGrounding;
import org.mindswap.owls.process.AtomicProcess;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.variable.Output;
import org.mindswap.owls.process.variable.Parameter;
import org.mindswap.owls.profile.Profile;
import org.mindswap.owls.service.Service;

/**
 * A service descriptor, containing the service's URI and input/output parameter names and types.
 *
 * <p>This type implements {@linkplain #equals(Object)} and {@linkplain #hashCode()} in terms of {@link #getURI()},
 * {@link #getInputs()} and {@link #getOutputs()}.
 *
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class ServiceDescriptor implements Serializable {
    private final URI uri;
    private final ImmutableMap<URI, URI> inputs;
    private final ImmutableMap<URI, URI> outputs;
    private final ImmutableSet<URI> inputTypes;
    private final ImmutableSet<URI> outputTypes;

    private static final long serialVersionUID = 0L;

    ServiceDescriptor(URI uri,
            ImmutableMap<URI, URI> inputToType,
            ImmutableMap<URI, URI> outputToType) {
        this.uri = uri;
        this.inputs = inputToType;
        this.outputs = outputToType;
        this.inputTypes = ImmutableSet.copyOf(inputToType.values());
        this.outputTypes = ImmutableSet.copyOf(outputToType.values());
    }

    @Override
    public int hashCode() {
        return uri.hashCode() + 39 * inputs.hashCode() + 39 * 39 * outputTypes.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ServiceDescriptor)) {
            return false;
        }
        ServiceDescriptor that = (ServiceDescriptor)o;
        return this.uri.equals(that.uri) && this.inputs.equals(that.inputs) && this.outputs.equals(that.outputs);
    }

    /**
     * Returns the URI of this service.
     *
     * @return the URI of this service
     */
    public URI getURI() {
        return uri;
    }

    /**
     * Returns the set of input types of this service.
     *
     * @return the set of input types of this service
     */
    public ImmutableSet<URI> getInputTypes() {
        return inputTypes;
    }

    /**
     * Returns the set of output types of this service.
     *
     * @return the set of output types of this service
     */
    public ImmutableSet<URI> getOutputTypes() {
        return outputTypes;
    }

    /**
     * Returns the input names (mapped to their respective type) of this service.
     *
     * @return the input names (mapped to their respective type) of this service
     */
    public ImmutableMap<URI, URI> getInputs() {
        return inputs;
    }

    /**
     * Returns the output names (mapped to their respective type) of this service.
     *
     * @return the output names (mapped to their respective type) of this service
     */
    public ImmutableMap<URI, URI> getOutputs() {
        return outputs;
    }

    @Override
    public String toString() {
        Function<URI, URI> inputToType = Functions.forMap(inputs);
        Function<URI, URI> outputToType = Functions.forMap(outputs);
        return "{" + uri + ": " 
                + Joiner.on(", ").join(Iterables.transform(inputs.keySet(), inputToType))
                + " => "
                + Joiner.on(", ").join(Iterables.transform(outputs.keySet(), outputToType))
                + "}";
    }

    /**
     * Creates a ServiceDescriptor from a {@link Service} object.
     *
     * @param service the service
     * @return a corresponding service descriptor
     */
    public static Vector<ServiceDescriptor> fromService(Service service) {
        AtomicProcess   ap;
        Vector<ServiceDescriptor> sd = new Vector<ServiceDescriptor>();
        
        ap = (AtomicProcess) service.getProcess();
        if(ap == null) {
            Iterator<Grounding> it = service.getGroundings().iterator();
            Iterator<Object> itA;
            WSDLAtomicGrounding wag;

            while(it.hasNext()) {
                Grounding g = it.next();
                itA = g.getAtomicGroundings().iterator();
                while(itA.hasNext()) {
                    wag = (WSDLAtomicGrounding)itA.next();
                    System.out.println("Operation: " + wag.getOperation());
                    sd.add(new ServiceDescriptor(wag.getOperation(),
                        paramsToTypes(OwlsUtils.Parameters.INPUT.parametersOf(wag.getProcess())),
                        paramsToTypes(OwlsUtils.Parameters.OUTPUT.parametersOf(wag.getProcess()))));
                }
            }
        }
        else {
             try
            {
                sd.add(new ServiceDescriptor(((WSDLAtomicGrounding)ap.getService().getGrounding().getAtomicGroundings().iterator().next()).getOperation(), // service.getURI(),
                    paramsToTypes(OwlsUtils.Parameters.INPUT.parametersOf(ap)),
                    paramsToTypes(OwlsUtils.Parameters.OUTPUT.parametersOf(ap))));
                }
            catch(NullPointerException ex)
            {
                try{
                sd.add(new ServiceDescriptor(((WSDLAtomicGrounding)service.getGroundings().iterator().next().getAtomicGroundings().iterator().next()).getOperationRef().getOperation(), // service.getURI(),
                    paramsToTypes(OwlsUtils.Parameters.INPUT.parametersOf((AtomicProcess)service.getProcess())),
                    paramsToTypes(OwlsUtils.Parameters.OUTPUT.parametersOf((AtomicProcess)service.getProcess()))));
                } catch(Exception ex2) {
                    ex2.printStackTrace();
                    System.out.println(service.getName());
                sd.add(new ServiceDescriptor(service.getURI(),
                    paramsToTypes(OwlsUtils.Parameters.INPUT.parametersOf((AtomicProcess)service.getProcess())),
                    paramsToTypes(OwlsUtils.Parameters.OUTPUT.parametersOf((AtomicProcess)service.getProcess()))));
                }
            }
        }
        
        return sd;
    }

    /**
     * Creates a ServiceDescriptor with a service URI, inputs and outputs. Inputs and outputs
     * are represented as Maps from input/output parameter names to their respective types.
     *
     * @param serviceURI the URI of the described service
     * @param inputsToTypes the inputs of the service, in (name -> type) representation
     * @param outputsToTypes the outputs of the service, in (name -> type) representation
     * @return a ServiceDescriptor corresponding to the supplied arguments
     */
    public static ServiceDescriptor fromInputsOutputs(URI serviceURI,
            Map<URI, URI> inputsToTypes, Map<URI, URI> outputsToTypes) {
        return new ServiceDescriptor(serviceURI, ImmutableMap.copyOf(inputsToTypes), ImmutableMap.copyOf(outputsToTypes));
    }
    
    private static ImmutableMap<URI, URI> paramsToTypes(Iterable<? extends Parameter> params) {
        ImmutableMap.Builder<URI, URI> builder = ImmutableMap.builder();
        for (Parameter p : params) {
            System.out.println("Parameter: " + p.getURI());
            builder.put(p.getURI(), p.getParamType().getURI());
        }
        return builder.build();
    }

    /**
     * Translates this service descriptor to OWL-S, in a newly created and independend ontology.
     * Note that this does <em>not</em>
     * download from this service's URI the actual service OWL-S description (assuming it is even accessible at that location), merely
     * translates this object to an equivalent OWL-S construct. If you want to download the service description from this service's URI,
     * see {@link OwlsUtils#parseURI(java.net.URI)}.
     *
     * @param textualDescription a textual description of this service, which is added to the profile of the OWL-S service (can be null)
     * @return the Service object representing this service in the ontology
     */
    public Service toOwls(String textualDescription) {
        return toOwls(OWLFactory.createKB().createOntology(uri), textualDescription);
    }

    /**
     * Translates this service descriptor to OWL-S, in the specified ontology.
     *
     * Note that this does <em>not</em>
     * download from this service's URI the actual service OWL-S description (assuming it is even accessible at that location), merely
     * translates this object to an equivalent OWL-S construct. If you want to download the service description from this service's URI,
     * see {@link OwlsUtils#parseURI(java.net.URI)}.
     * 
     * @param onto the ontology in which to translate this service descriptor to OWL-S
     * @param textualDescription a textual description of this service, which is added to the profile of the OWL-S service (can be null)
     * @return the Service object representing this service in the ontology
     */
    public Service toOwls(OWLOntology onto, String textualDescription) {
        Service service = onto.createService(uri);

        String label = toString();

        Process process = onto.createAtomicProcess(null);
        service.setProcess(process);
        process.setLabel(label, null);

        Profile profile = onto.createProfile(null);
        service.addProfile(profile);
        profile.setLabel(label, null);
        if (textualDescription != null) {
            profile.setTextDescription(textualDescription);
        }

        for (Entry<URI, URI> in : inputs.entrySet()) {
            URI name = in.getKey();
            URI type = in.getValue();
            Input input = onto.createInput(name);
            input.setParamType(onto.createClass(type));
            process.addInput(input);
            profile.addInput(input);
        }
        for (Entry<URI, URI> out : outputs.entrySet()) {
            URI name = out.getKey();
            URI type =  out.getValue();
            Output output = onto.createOutput(name);
            output.setParamType(onto.createClass(type));
            process.addOutput(output);
            profile.addOutput(output);
        }

        return service;
    }
}
