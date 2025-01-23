package assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BirthdayParadoxTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("May 1", BirthdayParadox.formatDate(121));
		assertEquals("Sep 23", BirthdayParadox.formatDate(250));
		assertEquals("Jan 20", BirthdayParadox.formatDate(20));
		assertEquals("Mar 30", BirthdayParadox.formatDate(79));
		assertEquals("Oct 31", BirthdayParadox.formatDate(121));
		assertEquals("Jun 5", BirthdayParadox.formatDate(156));
		assertEquals("Feb 9", BirthdayParadox.formatDate(40));
		assertEquals("Apr 11", BirthdayParadox.formatDate(101));
		assertEquals("Jul 7", BirthdayParadox.formatDate(188));
		assertEquals("Nov 29", BirthdayParadox.formatDate(333));
		assertEquals("Aug 21", BirthdayParadox.formatDate(233));
		assertEquals("Dec 17", BirthdayParadox.formatDate(351));
		
	}

}
