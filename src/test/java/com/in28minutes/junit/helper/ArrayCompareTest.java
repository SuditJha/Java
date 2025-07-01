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
	
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] arr = null;
		Arrays.sort(arr);
	}
	
	
	@Test(timeout=100)
	public void testSort_Performance() {
		int[] arr = {12,345,67,28};
		for(int i = 0; i < 1000000; i++) {
			arr[2] = i;
			Arrays.sort(arr);
		}
	}
	

}
