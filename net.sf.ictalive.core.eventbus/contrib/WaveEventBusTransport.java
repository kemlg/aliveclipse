package net.sf.ictalive.eventbus.transport;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.waveprotocol.wave.examples.fedone.waveclient.common.ClientBackend;
import org.waveprotocol.wave.examples.fedone.waveclient.common.ClientUtils;
import org.waveprotocol.wave.examples.fedone.waveclient.common.ClientWaveView;
import org.waveprotocol.wave.examples.fedone.waveclient.common.WaveletOperationListener;
import org.waveprotocol.wave.examples.fedone.waveclient.console.ConsoleUtils;
import org.waveprotocol.wave.model.document.operation.BufferedDocOp;
import org.waveprotocol.wave.model.document.operation.DocOpComponentType;
import org.waveprotocol.wave.model.document.operation.impl.AttributesImpl;
import org.waveprotocol.wave.model.document.operation.impl.DocOpBuilder;
import org.waveprotocol.wave.model.operation.wave.WaveletDocumentOperation;
import org.waveprotocol.wave.model.wave.ParticipantId;
import org.waveprotocol.wave.model.wave.data.WaveletData;

import com.google.common.collect.ImmutableMap;

public class WaveEventBusTransport implements IEventBusTransport, WaveletOperationListener
{
	private ClientBackend				cb;
	private WaveletData					wd;
	private Date						startDate;
	private IEventBusTransportListener	transportListener;

	@Override
	public void publish(String xml)
	{
		ClientWaveView	cwv;
		DocOpBuilder	dob;
		BufferedDocOp	dop;
		int				n;

		// System.out.println("Publishing " + obj + "...");
		if(wd == null)
		{
			cwv = cb.getIndexWave();
			try
			{
				cwv = cb.getWave(ClientUtils.getIndexEntries(cwv).get(0).getWaveId());
			}
			catch(IndexOutOfBoundsException e)
			{
				cwv = cb.createConversationWave();			
			}

			try
			{
				wd = ClientUtils.getConversationRoot(cwv);

				if(wd == null)
				{
					wd = cwv.createWavelet(ClientUtils.getConversationRootId(cwv));
				}
			}
			catch(NullPointerException e)
			{
				cwv = cb.createConversationWave();			
				wd = ClientUtils.getConversationRoot(cwv);
			}
		}

		dob = new DocOpBuilder();
		dop = wd.getDocuments().get("main");

		if(dop == null)
		{
			n = 0;
		}
		else
		{		
			n = ClientUtils.findDocumentSize(dop);
		}

		if(n > 0)
		{
			dob.retain(n);
		}

		dob.elementStart(ConsoleUtils.LINE, new AttributesImpl(ImmutableMap.of(ConsoleUtils.LINE_AUTHOR, cb.getUserId().getAddress())));
		dob.elementEnd();
		dob.characters(xml);

		cb.sendWaveletOperation(wd.getWaveletName(), new WaveletDocumentOperation("main", dob.build()));

		// System.out.println("Published.");
	}

	@Override
	public void initialise(String code, String host, IEventBusTransportListener ebtl)
	{
		try
		{
			startDate = Calendar.getInstance().getTime();
			cb = new ClientBackend("tranchis@" + host, host, 9876);
			cb.addWaveletOperationListener(this);
			System.out.println("Ready to receive events");
			this.transportListener = ebtl;
		}
		catch (IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	@Override
	public void noOp(String arg0, WaveletData arg1)
	{
	}

	@Override
	public void onDeltaSequenceEnd(WaveletData arg0)
	{
	}

	@Override
	public void onDeltaSequenceStart(WaveletData arg0)
	{
	}

	@Override
	public void participantAdded(String arg0, WaveletData arg1,
			ParticipantId arg2)
	{
	}

	@Override
	public void participantRemoved(String arg0, WaveletData arg1,
			ParticipantId arg2)
	{
	}

	@Override
	public void waveletDocumentUpdated(String arg0, WaveletData arg1,
			WaveletDocumentOperation arg2)
	{
		String	st;
		
		if(!arg0.equals("digest-author"))
		{
			if(arg2.getOperation().getType(2) == DocOpComponentType.CHARACTERS)
			{
				st = arg2.getOperation().getCharactersString(2);
			}
			else
			{
				st = arg2.getOperation().getCharactersString(3);
			}
			// System.out.println("Received " + st.length() + " bytes.");
			try
			{
				if(transportListener != null)
				{
					transportListener.dispatch(st);
				}
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
			}
		}
	}

	@Override
	public boolean isValid(Date timestamp)
	{
		return timestamp != null && startDate.before(timestamp);
	}
}