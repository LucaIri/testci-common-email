package org.apache.commons.mail;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailGetSocketConnectionTimeoutTest {

	private EmailConcrete email;	
	
	@Before
	public void setUp() throws Exception {
		email = new EmailConcrete();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetSocketConnectionTimeout() {
		email.getSocketConnectionTimeout();
	}

}
