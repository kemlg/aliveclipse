package edu.bath.matchmaker.util.sme2;

import com.google.common.collect.Lists;
import edu.bath.matchmaker.MatchMaker;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Benchmark {
    public static void main(String[] args) throws Exception {
//        HTTPServer server = null;
        try {
//            server = LocalWebServer.createOwlsTc3Server(80);

            List<URI> services = getServices();
//            services = services.subList(264, services.size());
            List<URI> queries = getQueries().subList(0, 5);

//            for (AbstractPlugin mm : Arrays.asList(new Alive_Composite())) {//, new Alive_Logical(), new Alive_Syntactic(), new Alive_Composite2())) {
            for (de.dfki.sme2.IMatchmakerPlugin mm : Arrays.asList(new Alive_MatchingParams(), new Alive_MoreSpecificParams(), new Alive_Logical(), new Alive_Syntactic())) {
                long start = System.currentTimeMillis();
                int count = 0;
                for (final URI service : queries) {
                    System.out.println((++count) + " " + service);
                    mm.input(service.toURL());
                }
                System.out.println("Time: " + (System.currentTimeMillis() - start));
                start = System.currentTimeMillis();
    //            System.out.println("querying...");
                for (URI query : queries) {
    //                System.out.println("##### " + query);
                    Object o = mm.query(query.toURL());
                    System.out.println(o);
                }
                System.out.println("Time: " + (System.currentTimeMillis() - start));
            }
//            System.out.println("done");
        } finally {
//            server.stop();
        }
    }

    private static MatchMaker createMyMatchMaker() {
        MatchMaker mm = new MatchMaker();
        return mm;
    }

    static List<URI> getServices() throws IOException {
        return getURIs("/edu/bath/matchmaker/util/sme2/services.txt", 969);
    }

    static List<URI> getQueries() throws IOException {
        return getURIs("/edu/bath/matchmaker/util/sme2/queries.txt", 29);
    }

    private static List<URI> getURIs(String resource, int estimatedSize) throws IOException {
        Scanner scanner = new Scanner(Benchmark.class.getResourceAsStream(resource));
        List<URI> services = Lists.newArrayListWithCapacity(estimatedSize);
        while (scanner.hasNextLine()) {
            services.add(URI.create(scanner.nextLine()));
        }
        scanner.close();
        return services;
    }

    private static final Runtime rt = Runtime.getRuntime();
    static void gcTillYouDrop() {
        rt.gc();
        rt.runFinalization();
        final CountDownLatch latch = new CountDownLatch(1);
        new Object() {

            protected void finalize() {
                latch.countDown();
            }
        };
        rt.gc();
        try {
            latch.await();
        } catch (InterruptedException ie) {
            throw new Error(ie);
        }
    }
}
