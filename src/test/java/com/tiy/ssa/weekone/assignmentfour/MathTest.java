package com.tiy.ssa.weekone.assignmentfour;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest
{

	@Test
	public void test()
	{
		//bc it's static you don't need to make a new instance everytime it just calling/running the method. cannot maintain it's state always restarting
		assertEquals(3, Maths.squareRoot(9));
		assertEquals(4, Maths.squareRoot(16));
		assertEquals(5, Maths.squareRoot(25));
		assertEquals(5, Maths.squareRoot(25));
		assertEquals(3, Maths.squareRoot(10));
		assertEquals(4, Maths.squareRoot(24));
		assertEquals(1, Maths.squareRoot(1));
		assertEquals(0, Maths.squareRoot(0));
		
		assertEquals(2, Maths.cubeRoot(8));
		assertEquals(3, Maths.cubeRoot(27));
		assertEquals(4, Maths.cubeRoot(64));
		assertEquals(2, Maths.cubeRoot(10));
		assertEquals(3, Maths.cubeRoot(29));
		assertEquals(1, Maths.cubeRoot(1));
		assertEquals(0, Maths.cubeRoot(0));
		
		
	}

}
