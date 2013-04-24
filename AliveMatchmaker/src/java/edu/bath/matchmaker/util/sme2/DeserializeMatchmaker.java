package edu.bath.matchmaker.util.sme2;

import edu.bath.matchmaker.MatchMaker;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class DeserializeMatchmaker {

    public static void main(String[] args) throws Exception {
        File matchmakerFile = new File("sme2matchmaker.ser");
        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(matchmakerFile)));

        MatchMaker mm = (MatchMaker)in.readObject();
        System.out.println(mm);
        System.out.println(mm.getServices().size());
    }

}
