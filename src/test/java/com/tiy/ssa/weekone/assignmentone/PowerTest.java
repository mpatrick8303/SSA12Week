package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerTest
{

	@Test
	public void test()
	{
//		assertEquals("", 1, new Power(1).pOf1());
//		assertEquals("", 2, new Power(2).pOf1());
//		assertEquals("", 3, new Power(3).pOf1());
//		
//		assertEquals("", 1, new Power(1).pOf2());
//		assertEquals("", 4, new Power(2).pOf2());
//		assertEquals("", 9, new Power(3).pOf2());
//		
//		assertEquals("", 1, new Power(1).pOf3());
//		assertEquals("", 8, new Power(2).pOf3());
//		assertEquals("", 27, new Power(3).pOf3());
		
		assertEquals("", 1, new Power(1,1).pOf());
		assertEquals("", 2, new Power(2,1).pOf());
		assertEquals("", 3, new Power(3,1).pOf());
		assertEquals("", 1, new Power(1,2).pOf());
		assertEquals("", 4, new Power(2,2).pOf());
		assertEquals("", 9, new Power(3,2).pOf());
		assertEquals("", 1, new Power(1,3).pOf());
		assertEquals("", 8, new Power(2,3).pOf());
		assertEquals("", 27, new Power(3,3).pOf());
	}

}
