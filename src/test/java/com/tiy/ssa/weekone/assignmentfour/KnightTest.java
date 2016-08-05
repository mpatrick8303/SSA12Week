package com.tiy.ssa.weekone.assignmentfour;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tiy.ssa.weekone.assignmentthree.PigLatin;

public class KnightTest
{

	@Test
	public void test()
	{
		
		Knight k1 = new Knight(0,0);
		assertEquals(1, k1.move());
		assertEquals(2, k1.move());
		assertEquals(3, k1.move());
		assertEquals(4, k1.move());
		
	}
//
//	@Test
//	public void stringy()
//	{
//		String abc = "ABC";
//		abc.toLowerCase();
//		assertEquals("","abc",abc);
//	}will fail because once a string is initialized you can't change the state of that string

}
