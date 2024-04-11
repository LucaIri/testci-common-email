package org.apache.commons.mail;

//import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;

//import java.util.ArrayList;
//import java.util.List;

//import javax.mail.internet.InternetAddress;

import org.junit.Test;

public class EmailAddReplyToTest {

	private static final String REPLY_NAME = "Luca Iri";
	private static final String REPLY_EMAIL = "Luca@whoru.com";
	//private static final String REPLY_CHARSET = "Lucaset";
	
	
	//private static final String[] REPLY_EMAIL = {"lucairi@abc.com", "hello@abc.com"};
	
	private EmailConcrete email;
	//private List<InternetAddress> replyList = new ArrayList<InternetAddress>();
	@Before
	public void setUpEmailAddReplyToTest() throws Exception {
		email = new EmailConcrete();
	}

	@After
	public void tearDownEmailAddReplyToTest() throws Exception {

	}
	
	@Test //(expected = IllegalArgumentException.class)
	public void testAddReplyTo() throws Exception{
		try{
			String testEm = "hello.me@you.org";
			String testNm = "John Smith";
			email.addReplyTo(testEm, testNm);
		}
		catch (EmailException ee) {
			System.out.println("Invalid email");
		}
		
		
		//assertEquals(1, email.getReplyToAddresses().size());
		
	}

}
