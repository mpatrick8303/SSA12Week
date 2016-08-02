package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tiy.ssa.weekone.assignmentone.Thermometer;

public class BatteryTests
{

	@Test
	public void use()
	{
		assertEquals("using it for 2 hours", 80, new Battery(100, 10).useBat(2), .01);//.01 is delta and is for how much it can be off by
//		assertEquals("using it for 2 hours under 0", -20, new Battery(0,2).use(), .01); shouldn't work bc it's below 0
		
	}
	

	@Test
	public void charge()
	{
		
		assertEquals("charging it for 2 hours", 100, new Battery(100, 10).charge(2), .01);
//		assertEquals("charging it for 2 hours outside of capacity", 120, new Battery(100,2).charge(), .01); should not work bc over 100
		
	}
	
//	@Test
//	public void getState()
//	{
//		use(2);
//		assertEquals("", "This battery has" + getBatteryRem() + "remaining and is " + (getCapacity() - getBatteryRem()) + "below capcity", new Battery(100).getState());
//	}
	

}
