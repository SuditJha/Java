package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@Before
	public void setupBeforeTests() {
		System.out.println("In Before Test");
		System.out.println("Occurs before every Test");
		System.out.println("Used to do some setup before running tests");
	}
	
	
	
	@Test
	public void test1() {
		System.out.println("Test 1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2 executed");
	}
	
	@After
	public void tearDownAfterTests() {
		System.out.println("In After Test");
		System.out.println("Occurs after every test");
		System.out.println("Tear Down Setup (:");
		System.out.println("Write clean up code, connection close, etc");
			
	}
	
	
}
