package com.tiy.ssa.weekone.assignmentone;

public class Thermometer
{
	private Double temperature;
	private boolean convert;
	private String unit;
	private Double temp = .0;
	
	
//	public Thermometer(int temperature, String deg)
//	{
//		
//			this(temperature, true, deg); this calls the constructor below and then puts in values	
//		
//	}
	
	public Thermometer(Double temperature, String unit )
	{
		this.temperature = temperature;
		this.unit = unit;
		
	}
	
	
	public int display(boolean convert)
	{
		
		getTemp(convert);
		
		
		return (int) Math.round(temp);
	}
	
	public void getTemp(boolean convert)
	{
		if(unit.toLowerCase() == "c")
		{
			
			if(convert == true)
			{
				
				
				cToF();
				
				
			}
			else if(convert == false)
			{
				temp = temperature;
				
				
			}
			
		}
		else if(unit.toLowerCase() == "f")
		{
			
			if(convert == true)
			{
				
				fToC();
				
			}
			else if(convert == false)
			{
				temp = temperature;
				
			}
			
		}
	}
	
	private void fToC()
	{
		temp = ((temperature - 32) * (5))/9;
	}
	
	private void cToF()
	{
		temp = (temperature * 9 / 5) + (32);
	}
	
	
	
}
