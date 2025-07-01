package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testArraySort_RandomSort() {
		int[] expected = {1,2,3,4};
		int[] actual = {2,1,4,3};
		Arrays.sort(actual);
		//assertEquals(expected, actual); // gives error .. they are two diff objects
		// assertEquals expects same objects
		assertArrayEquals(expected, actual);
	}
	
	

}
