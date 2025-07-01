package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	StringHelper helper = new StringHelper();
	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Position() {
	
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		
					//expected, actual
	}
		
	@Test
	public void testTruncateAInFirst2Positions_AInFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_NoAInFirstPosition() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativity() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositive() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
}
