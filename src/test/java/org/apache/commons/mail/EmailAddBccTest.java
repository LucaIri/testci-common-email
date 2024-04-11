package org.apache.commons.mail;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EmailAddBccTest {

	private static final String[] TEST_EMAILS = { "ac@bd.com", "b.c@d.org", "hellomynameisgeorge@zyxwvutsrq.com.bc",
			"bigGuy@rgb.com", "mIkEwAzOwSkI...@hn.org" };
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
	public void testAddBcc() throws Exception {
		email.addBcc(TEST_EMAILS);

		assertEquals(5, email.getBccAddresses().size());
	}
	
	
	  @Test(expected = EmailException.class)
	  public void testAddBccNullCase() throws EmailException {
		String[] test = {};
		email.addBcc(test);
	}
}
