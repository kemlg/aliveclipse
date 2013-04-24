package edu.bath.matchmaker;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import javax.xml.namespace.QName;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;
import org.mindswap.wsdl.WSDLOperation;
import org.mindswap.wsdl.WSDLParameter;
import org.mindswap.wsdl.WSDLService;
import org.mindswap.wsdl.WSDLTranslator;

/**
 * Simple utility to transform a WSDL-described service to an OWLS ontology.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class Wsdl2Owls {
    private Wsdl2Owls() { }

    /**
     * Reads the specified {@code WSDL} service description and returns a list of {@link Service} instances
     * resulting from translating the former to {@code OWLS}.
     *
     * @param wsdl the location of the {@code WSDL} description of a service
     * @return a list of {@code Service} instances
     */
    public static List<Service> read(URI wsdl) throws IOException {
        List<Service> services = Lists.newArrayList();
        try {
            WSDLService service = WSDLService.createService(wsdl);
            for (WSDLOperation op : service.getOperations()) {
                OWLKnowledgeBase kb = OWLFactory.createKB();
                OWLOntology serviceOntology = kb.createOntology(service.getFileURI(), service.getFileURI(), true);
                WSDLTranslator translator = new WSDLTranslator(serviceOntology, op, op.getName(), "");
                translator.setServiceName(op.getName());
                translator.setTextDescription(op.getDescription());

                for (WSDLParameter input : op.getInputs()) {
                    translator.addInput(input, input.getName(), toURI(input.getType()), null);
                }

                for (WSDLParameter output : op.getOutputs()) {
                    translator.addOutput(output, output.getName(), toURI(output.getType()), null);
                }

//                Service serviceObject = ;
//                kb.load(service., true)
                services.add(translator.getService());
            }
        } catch (IOException e) {
            throw e;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new IOException(e);
        }
        return Collections.unmodifiableList(services);
    }

    private static URI toURI(QName qname) {
        return URI.create(qname.getNamespaceURI() + "#" + qname.getLocalPart());
    }
}
