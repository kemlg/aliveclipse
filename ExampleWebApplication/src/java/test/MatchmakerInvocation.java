/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import matchmakerclient.MatchMaker;
import matchmakerclient.MatchMakerWSImpl;
import matchmakerclient.MatchResult;

/**
 *
 * @author sergio
 */
public class MatchmakerInvocation {
    public static void main(String args[]) {
        MatchMaker mm = new MatchMaker();
        MatchMakerWSImpl mmp = mm.getMatchMakerPort();
        
//        mmp.mapDomainOntology("http://www.owl-ontologies.com/ECSDI.owl", "file:/Users/sergio/Documents/Research/ecsdi/aliveclipse/ExampleOntology/ECSDIOntology.owl");
//        mmp.registerServiceByURL("file:/Users/sergio/Documents/Research/ecsdi/aliveclipse/ExampleOntology/ECSDIServices.owl");
//        List<MatchResult> lmr = mmp.performMatchByURL("file:/Users/sergio/Documents/Research/ecsdi/aliveclipse/ExampleOntology/ECSDIServicesQuery.owl");
//        Iterator<MatchResult> it = lmr.iterator();
//        while(it.hasNext()) {
//            MatchResult mr = it.next();
//            System.out.println(mr.getService());
//        }
        
        List<String> inputs = new LinkedList<String>();
        inputs.add("http://www.owl-ontologies.com/ECSDI.owl#Ecografia");
        inputs.add("http://www.owl-ontologies.com/ECSDI.owl#Paciente");
        List<String> outputs = new LinkedList<String>();
        outputs.add("http://www.owl-ontologies.com/ECSDI.owl#Cita");
        List<MatchResult> lmr = mmp.performSignatureMatch(inputs, outputs);
        Iterator<MatchResult> it = lmr.iterator();
        while(it.hasNext()) {
            MatchResult mr = it.next();
            System.out.println(mr.getService());
        }
    }
}
