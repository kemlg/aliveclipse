package net.sf.ictalive.service.enactment.simpleevents;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class SimpleLogPrinter {
	public static void main(String[] args) {
		if (args.length < 1 || args[0].length() == 0) {
			System.err.println("No logfile specified");
			System.exit(1);
		}
		String logfile = args[0];
		try {
			FileInputStream fis = new FileInputStream(logfile);

			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			JAXBContext jc = JAXBContext
					.newInstance("eu.istalive.service.enactment.simpleevents");
			Unmarshaller unmarshaller = jc.createUnmarshaller();

			String xmlString = null;
			while (null != (xmlString = br.readLine())) {
				SimpleEnactmentEvent see = (SimpleEnactmentEvent) unmarshaller
						.unmarshal(new StringReader(xmlString));
				System.out.println(see);
			}
		} catch (EOFException eof) {
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
}
