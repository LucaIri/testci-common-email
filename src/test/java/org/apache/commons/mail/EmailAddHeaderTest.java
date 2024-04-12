package org.apache.commons.mail;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class EmailAddHeaderTest {


	private EmailConcrete email;

	@Before
	public void setUpEmailTest() throws Exception {
		email = new EmailConcrete();
	}

	@After
	public void tearDownEmailTest() throws Exception {

	}
	/*
	 * @Test public void test() { fail("Not yet implemented"); }
	 */
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddHeaderName(){
		String name = null;
		String val = "5";
		email.addHeader(name, val);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddHeaderValue(){
		String name = "John Smith";
		String val = null;
		email.addHeader(name, val);
	}
	
	@Test
	public void testPutHeader() throws Exception{
		String name = "John Smith";
		String val = "5";
		
		email.addHeader(name, val);
		
		
	}

}
