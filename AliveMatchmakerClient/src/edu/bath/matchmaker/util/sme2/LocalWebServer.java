package edu.bath.matchmaker.util.sme2;


import java.io.File;
import java.io.IOException;
import net.freeutils.httpserver.HTTPServer;
import net.freeutils.httpserver.HTTPServer.FileContextHandler;
import net.freeutils.httpserver.HTTPServer.VirtualHost;

/**
 * Fires a local web server which provides access to services (at "/") and ontologies (at "/ontology").
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class LocalWebServer {
    public static void main(String[] args) throws Exception {
        createOwlsTc3Server(80);
    }

    public static HTTPServer createOwlsTc3Server(int port) throws IOException {
        HTTPServer server = new HTTPServer(port);

        VirtualHost host = server.getVirtualHost(null);
        host.setAllowGeneratedIndex(true);
        host.addContext("/", new FileContextHandler(new File("sme2_v2_1/testcollections/owls-tc3/htdocs/"), "/"));
        server.start();
        return server;
    }
}
