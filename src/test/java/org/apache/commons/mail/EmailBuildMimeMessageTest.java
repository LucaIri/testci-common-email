package org.apache.commons.mail;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailBuildMimeMessageTest {
	
	private EmailConcrete email;	
	private MimeMessage message1;
	private Session session1;
	private String fromadd = "Lucas@Vasquez.com";
	private String hostnm = "luca iri";
	
	@Before
	public void setUp() throws Exception {
		email = new EmailConcrete();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void TestBuildMimeMessageFromAndAddtoNotNull() throws EmailException {
		email.hostName = hostnm;
		email.setFrom("johnsmith@gmail.com");
		email.addTo(fromadd);
		assertNull(email.message);
		email.buildMimeMessage();
	}
	/*
	 * @Test public void TestBuildMimeMessageFromAndAddtoNull() throws
	 * EmailException { email.hostName = hostnm; try { email.setFrom(null); } catch
	 * (EmailException ee) { ee.printStackTrace(); }
	 * 
	 * email.addTo(fromadd); assertNull(email.message); email.buildMimeMessage(); }
	 */
	
	@Test
	public void TestBuildMimeMessageHeaderListGreaterThanZero() throws EmailException {
		email.hostName = hostnm;
		email.setFrom("john@smith.com");
		email.addTo(fromadd);
		Map<String, String> map = new HashMap<String, String>();
		map.put("add1", "content1");
		map.put("add2", "content2");
		email.setHeaders(map);
		assertEquals(2, email.headers.size());
		email.buildMimeMessage();
	}
	@Test
	public void TestBuildMimeMessageCcListGreaterThanZero() throws UnsupportedEncodingException, EmailException {
		InternetAddress ia = new InternetAddress();
		ia.setPersonal("luca");
		ia.setAddress("cantonMI@hi.com");
		email.hostName = hostnm;
		email.setFrom("john@smith.com");
		email.addTo(fromadd);
		Collection<InternetAddress> map = new ArrayList<InternetAddress>();
		System.out.println(map);
		map.add(ia);
		email.setCc(map);
		email.buildMimeMessage();
	}
	@Test
	public void TestBuildMimeMessageBCcListGreaterThanZero() throws EmailException, UnsupportedEncodingException {
		InternetAddress ia = new InternetAddress();
		ia.setPersonal("luca");
		ia.setAddress("cantonMI@hi.com");
		email.hostName = hostnm;
		email.setFrom("john@smith.com");
		email.addTo(fromadd);
		Collection<InternetAddress> map = new ArrayList<InternetAddress>();
		System.out.println(map);
		map.add(ia);
		email.setBcc(map);
		email.buildMimeMessage();
	}
	
	@Test
	public void TestBuildMimeMessageReplyListGreaterThanZero() throws UnsupportedEncodingException, EmailException {
		InternetAddress ia = new InternetAddress();
		ia.setPersonal("luca");
		ia.setAddress("cantonMI@hi.com");
		email.hostName = hostnm;
		email.setFrom("john@smith.com");
		email.addTo(fromadd);
		Collection<InternetAddress> map = new ArrayList<InternetAddress>();
		map.add(ia);
		email.setReplyTo(map);
		email.buildMimeMessage();
	}
	
	@Test
	public void TestContentEmail() throws EmailException {
		email.hostName = hostnm;
		email.setFrom("john@smith.com");
		email.addTo(fromadd);
		Object test = 123;
		email.setContent(test, "int");
		email.buildMimeMessage();
		
	}
	@Test
	public void TestEmailBodyNotNullEmail() throws EmailException {
		email.hostName = hostnm;
		email.setFrom("john@smith.com");
		email.addTo(fromadd);
		MimeMultipart mmulti = new MimeMultipart("String");
		email.setContent(mmulti);
		email.buildMimeMessage();
		
	}

}
