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
		
		assertTrue(k1.move());//tests isValid in the move method
		assertTrue(k1.move());
		assertTrue(k1.move());
		assertTrue(k1.move());// tests isValid and isHome in move method
		
		assertTrue(k1.move());//random stays the same because i made it final
        assertTrue(k1.move());
        assertTrue(k1.move());
        assertTrue(k1.move());
		
		Knight k2 = new Knight(1,2);
		
		assertTrue(k2.move());
		assertTrue(k2.move());
		assertTrue(k2.move());
		assertTrue(k2.move());
		
		Knight k3 = new Knight(-1,-2);
		
		assertTrue(k3.move());
		assertTrue(k3.move());
		assertTrue(k3.move());
		assertTrue(k3.move());
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
