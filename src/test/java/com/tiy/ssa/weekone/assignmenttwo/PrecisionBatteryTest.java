package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class PrecisionBatteryTest
{

	@Test
	public void howLong()
	{
		
		assertEquals(new BigDecimal(10), new PrecisionBattery(new BigDecimal(100)).howLong(new BigDecimal(10)));
//		assertEquals("charging it for 30 when the battery has 80", 110, new Battery1(100,80).charge(30), .01); //should not work bc over 100
		
	}
	
	@Test
	public void battery()
	{
		
		PrecisionBattery b = new PrecisionBattery(new BigDecimal(100));
		assertEquals(new BigDecimal(70), b.discharge(new BigDecimal(30)));
		assertEquals(new BigDecimal(90), b.charge(new BigDecimal(20)));
//		assertEquals(new BigDecimal(110), b.charge(new BigDecimal(20))); would fail because it goes above 100
	}

}
