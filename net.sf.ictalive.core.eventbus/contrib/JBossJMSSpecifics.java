package net.sf.ictalive.eventbus.transport.jms;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.Topic;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class JBossJMSSpecifics implements IJMSSpecifics
{
	private Context ctx;

	@Override
	public Session getSession(String host) throws NamingException, JMSException
	{
		Connection			connection;
		ConnectionFactory	factory;
		Properties			props;
		Context				ctx;
		Session				session;

		props = new Properties();
		props.put(Context.PROVIDER_URL, "jnp://" + host + ":1099");
		props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
		props.put(Context.URL_PKG_PREFIXES, "org.jboss.naming.client:org.jboss.naming:org.jnp.interfaces");

		ctx = new InitialContext(props);
		factory = (ConnectionFactory)ctx.lookup("/ConnectionFactory");
		this.ctx = ctx;

		connection = factory.createConnection();
		session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		connection.start();
		
		return session;
	}

	@Override
	public Topic getTopic(String code) throws NamingException
	{
		Topic				topic;

		topic = (Topic) ctx.lookup(code);
		
		return topic;
	}
}
