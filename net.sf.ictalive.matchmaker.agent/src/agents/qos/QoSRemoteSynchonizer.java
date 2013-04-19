package agents.qos;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.common.base.Preconditions;

import agents.QualityOfServiceAggregator.Stats;

public class QoSRemoteSynchonizer {

	File target;
	transient Thread synchthread;

	public QoSRemoteSynchonizer(File filename) {
		this.target = Preconditions.checkNotNull(filename);
	}

	public synchronized boolean isRunning() {
		return synchthread != null;
	}

	public void initializeMap(Map<URI, Stats> map) throws JAXBException {
		if (!target.exists())
			return;
		JAXBContext jaxbCts = JAXBContext.newInstance(QoSEntry.class,
				QoSEntries.class);
		Unmarshaller um = jaxbCts.createUnmarshaller();
		Object o = um.unmarshal(target);
		Preconditions.checkNotNull(o);
		Preconditions.checkState(o instanceof QoSEntries);
		QoSHelper.toMap(map, (QoSEntries) o);
	}

	public void writeMap(Map<URI, Stats> map) throws JAXBException {
		JAXBContext jaxbCts = JAXBContext.newInstance(QoSEntry.class,
				QoSEntries.class);
		Marshaller m = jaxbCts.createMarshaller();
		m.marshal(QoSHelper.fromMap(map), target);
	}

	public synchronized void stopSychronizer() {
		if (synchthread != null) {
			Thread t = synchthread;
			synchthread = null;
			t.interrupt();
		}
	}

	public synchronized void startSynchronizer(final Map<URI, Stats> map,
			final int period) {
		Preconditions.checkState(synchthread == null,
				"Synchronizer already runnign ");
		Runnable r = new Runnable() {

			@Override
			public void run() {
				while (synchthread != null) {
					try {
						Thread.sleep(period);
					} catch (InterruptedException e) {
						continue;
					}
					try {
						writeMap(map);
					} catch (JAXBException e) {
						e.printStackTrace();
					}
				}
			}
		};
		synchthread = new Thread(r);
		synchthread.start();
	}
}
