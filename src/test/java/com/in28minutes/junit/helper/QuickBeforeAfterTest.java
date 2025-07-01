package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@BeforeClass
	public static void setupBeforeClass() {
		System.out.println("In before Class");
		System.out.println("It is Static method ");
		System.out.println("Runs Once Before class execution starts");
		System.out.println("==========================================");
	}

	@Before
	public void setupBeforeTests() {
		System.out.println("In Before Test");
		System.out.println("Occurs before every Test");
		System.out.println("Used to do some setup before running tests");
//		System.out.println("==========================================");
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
		System.out.println("==========================================");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("In After Class");
		System.out.println("It is Static method ");
		System.out.println("Runs Once After Class ");
		System.out.println("USed to maybe close db connection");
	System.out.println("==========================================");
	}
	
	
}
