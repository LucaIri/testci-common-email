package org.apache.commons.mail;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailSetFromTest {
	
	private EmailConcrete email;
	
	@Before
	public void setUp() throws Exception {
		email = new EmailConcrete();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetFrom() throws EmailException {
		String emailtest = "hello@abc.com";
		email.setFrom(emailtest);
	}

}
