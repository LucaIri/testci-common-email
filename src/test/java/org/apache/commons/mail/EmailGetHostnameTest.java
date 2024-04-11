package org.apache.commons.mail;




import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailGetHostnameTest {

	private EmailConcrete email;

	@Before
	public void setUpEmailGetHostnameTest() throws Exception {
		email = new EmailConcrete();
	}

	@After
	public void tearDownEmailGetHostnameTest() throws Exception {
	}

	@Test
	public void testSessionNull() {
		String hostname = email.getHostName();
	}
	
	@Test
	public void testSessionIsNotEmpty() {
		email.setHostName("Luca");
		String hostname = email.getHostName();
	}
	

}
