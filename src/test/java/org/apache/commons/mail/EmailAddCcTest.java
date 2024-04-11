package org.apache.commons.mail;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EmailAddCcTest {

	private static final String CC_EMAIL = "hellofriend@abc.org";
	
	

	// private String[] testValChars = {" ", "a", "A", "\uc5ec", "0123456789",
	// "012345678901234567890", "\n"};

	private EmailConcrete email;

	@Before
	public void setUpEmailTest() throws Exception {
		email = new EmailConcrete();
	}

	@After
	public void tearDownEmailTest() throws Exception {

	}
	
	 
	@Test 
	public void testAddCc() throws Exception{
			email.addCc(CC_EMAIL);
		  
			assertEquals(1, email.getCcAddresses().size());
	}

}
