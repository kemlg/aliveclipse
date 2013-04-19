package agents;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import agents.QualityOfServiceAggregator.Stats;
import agents.qos.QoSRemoteSynchonizer;

public class TestQoSSyncer {

	String testfilename = "testdata/testQos.xml";
	File testfile = new File(testfilename);

	@Before
	public void setup() {
		if (testfile.exists()) {
			testfile.delete();
		}
	}

	Map<URI, Stats> testMap() {
		HashMap<URI, Stats> testMap = new HashMap<URI, Stats>();
		testMap.put(URI.create("urn:test-svc1#foo"), new Stats(10, 1, 100000));
		testMap.put(URI.create("urn:test-svc2#foo"), new Stats(11, 2, 200000));
		testMap.put(URI.create("urn:test-svc3#foo"), new Stats(12, 3, 300000));
		return testMap;
	}

	String readFile(File f) throws IOException {
		InputStream is = new FileInputStream(f);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte buf[] = new byte[1024];
		int nread;
		while ((nread = is.read(buf)) > 0) {
			bos.write(buf, 0, nread);
		}
		return new String(bos.toByteArray());
	}

	@Test
	public void testWriteQosData() throws Exception {
		Assert.assertFalse(testfile.exists());

		QoSRemoteSynchonizer sync = new QoSRemoteSynchonizer(testfile);
		sync.writeMap(testMap());
		Assert.assertTrue(testfile.exists());
		String value = readFile(testfile);
		// System.err.println("got file \n" + value);

	}

	@Test
	public void testReadQosData() throws Exception {
		testWriteQosData();
		QoSRemoteSynchonizer sync = new QoSRemoteSynchonizer(testfile);
		Map<URI, Stats> statsMap = new HashMap<URI, Stats>();
		sync.initializeMap(statsMap);
		Assert.assertEquals(testMap(), statsMap);
	}

	@Test
	public void testSync() throws Exception {
		testWriteQosData();
		Map<URI, Stats> testMap = testMap();
		QoSRemoteSynchonizer sync = new QoSRemoteSynchonizer(testfile);
		sync.startSynchronizer(testMap, 2000);
		testMap.put(URI.create("urn:testother"), new Stats(50, 30, 1000));
		Thread.sleep(5000);
		Assert.assertTrue(sync.isRunning());
		QoSRemoteSynchonizer other = new QoSRemoteSynchonizer(testfile);

		Map<URI, Stats> actual = new HashMap<URI, Stats>();
		other.initializeMap(actual);
		Assert.assertEquals(testMap, actual);

		sync.stopSychronizer();
		Thread.sleep(1000);
		Assert.assertFalse(sync.isRunning());

	}
}
