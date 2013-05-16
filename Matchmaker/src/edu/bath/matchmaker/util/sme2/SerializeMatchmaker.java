package edu.bath.matchmaker.util.sme2;

import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OwlsUtils;
import edu.bath.matchmaker.Preferences;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.util.List;
import net.freeutils.httpserver.HTTPServer;

/**
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class SerializeMatchmaker {

    public static void main(String[] args) throws Exception {
        HTTPServer server = LocalWebServer.createOwlsTc3Server(80);

        MatchMaker mm = new MatchMaker(
                new Preferences.DescriptionSimilarityDecorator(),
                new Preferences.ParamExactnessDecorator());

        List<URI> services = Benchmark.getServices();
        int pos = 0;
        for (URI service : services) {
            System.out.println(services.size() - (pos++));
            mm.registerService(OwlsUtils.parseURI(service));
        }

        server.stop();

        File matchmakerFile = new File("sme2matchmaker.ser");
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(matchmakerFile)));

        out.writeObject(mm);
        out.flush();
        out.close();
    }

}
