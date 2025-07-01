package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
	StringHelper helper = new StringHelper();
	
	private String expectedOutput;
	private String input;
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	
	@Parameters
	public static Collection<String[]> testConditions() {
		String[][] expectedOutputs = {
				{"AACD", "CD"},
				{"ACD", "CD"},
				{"CDEF", "CDEF"}
		};
		
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
	
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
	
}
