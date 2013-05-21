package test;

import ecografiaclient.EcografiaPortType;
import ecografiaclient.EcografiaService;

public class EcografiaInvocation {
    public static void main(String args[]) {
        EcografiaService    es;
        EcografiaPortType   ept;
        
        es = new EcografiaService();
        ept = es.getEcografiaPort();
        ept.asignarCita("ecografia", "paciente");
    }
}
