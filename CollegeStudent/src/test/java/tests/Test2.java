package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.CollegeStudent;

public class Test2 {
	
	// Ruth McGee
	CollegeStudent myStudent2 = new CollegeStudent("Kent Miller");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetAge() {
		myStudent2.setAge(18);
		int myAge = myStudent2.getAge();
		assertEquals(18, myAge, 0);
	}
	

	@Test
	public void TestGetFullName() {
		String myTestName = myStudent2.getFullName();
		assertEquals("Kent Miller", myTestName);
	}
	
}
