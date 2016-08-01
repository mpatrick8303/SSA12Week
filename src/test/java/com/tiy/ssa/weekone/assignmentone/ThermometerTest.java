package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThermometerTest
{

	@Test
	public void display()
	{
		assertEquals("F", 78.0, new Thermometer(78.0, false, "f").display(false, "f"),.001);//have to add the .001 to say how many decimal points to go to
		assertEquals("212F -> 100c", 100.0, new Thermometer(212.0, true, "f").display(true, "f"),.001);
		
		
		assertEquals("C", 212.0, new Thermometer(212.0, false, "c").display(false, "c"),.001);
		assertEquals("100c -> 212 F", 232, new Thermometer(111.0, true, "c").display(true, "c"),.001);
		
		
	}
	
//	@Test
//	public void integerDivision()
//	{
//		assertEquals("", 1.0, 9F/5, .01); //adding the F changes the 9 to a float 
//	}

}
