package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Battery1Test
{


//	
	@Test
	public void howLong()
	{
		
		assertEquals("", 10, new Battery1(100).howLong(10), .01);
//		assertEquals("charging it for 30 when the battery has 80", 110, new Battery1(100,80).charge(30), .01); //should not work bc over 100
		
	}
	
	@Test
	public void battery()
	{
		
		Battery1 b = new Battery1(100);
		assertEquals(70, b.discharge(30), .01);
		assertEquals(90, b.charge(20), .01);
//		assertEquals(-10, b.discharge(100), .01);(would minus to -10 and fail becuase it stops at 0)
	}

}
