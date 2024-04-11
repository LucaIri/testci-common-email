package org.apache.commons.mail;


import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Session;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailGetMailSessionTest {
	private static final String MAIL_P = EmailConstants.MAIL_PORT;
	private EmailConcrete email;
	private Session session1;
	private Session session2;
	private Properties prop;
	private String smtpPort;
	private Authenticator authenticator;
	private String hostname;
	private String bounceaddress;
	private int socketTimeout = EmailConstants.SOCKET_TIMEOUT_MS;

	@Before
	public void setUpEmailTest() throws Exception {
		email = new EmailConcrete();
	}

	@After
	public void tearDownEmailTest() throws Exception {

	}

	@Test
	public void testSessionNull() throws EmailException {
		try{
			this.session1 = null;
			email.getMailSession();
		}
		catch(EmailException ee) {
			System.out.println("Cannot find valid hostname for mail session");
		}
		
	}
	
	@Test
	public void testSessionBounceAddressNotNull() throws EmailException {
		bounceaddress = "steve";
		email.setBounceAddress(bounceaddress);
		this.session1 = null;
		session2.getInstance(prop);
		email.getMailSession();
	}
	@Test
	public void testGetMailSessionHostname() throws EmailException {
		email.hostName = "luca iri";
		email.getMailSession();
	}
	
	@Test
	public void testGetMailSessionSSLOnConnect() throws EmailException {
		email.setSSLOnConnect(true);
		email.getMailSession();
	}
}
