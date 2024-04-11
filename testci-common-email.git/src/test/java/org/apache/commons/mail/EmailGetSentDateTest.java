package org.apache.commons.mail;


import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailGetSentDateTest {

	private EmailConcrete email;	
	private Date date1;
	
	@Before
	public void setUp() throws Exception {
		email = new EmailConcrete();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetSentDateNull() {
		date1 = null;
		email.setSentDate(date1);
		
		email.getSentDate();
	}
	
	@Test
	public void testGetSentDateNotNull() {
		date1 = new Date(1000000);
		email.setSentDate(date1);
		
		email.getSentDate();
	}
	

}
