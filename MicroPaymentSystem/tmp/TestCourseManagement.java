package ase.example.cms;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCourseManagement {

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
	public void testSum() {
		//fail("Not yet implemented");
		long a = 5;
		long b = 6;
		long actual = a+b;
		long expected = 11;
		
		assertEquals(expected, actual);
	}
	
	
	
	@Test
	public void testCourseManagement(){
		
		Course course = new Course("1", "BSc IS");
		
				
		Student nm = new Student("1", "NM");
		
		Module module = new Module("M1", " Introduction to ASE");
		
		ModuleInstance offer = new ModuleInstance(module, nm);
		course.addModule(offer);
		
		
		ModuleInstance anotherOffer = new ModuleInstance(module, nm);
		course.addModule(anotherOffer);
		
		
		
		//Test
		assertEquals(course.getNumberOfModulesOffered(), 2);
		
		
	}
	
	
	
	

}
