package com.tiy.ssa.weekone.assignmentone;

public class Thermometer
{
	private Double temperature;
	private boolean convert;
	private String deg;
	private Double temp = .0;
	private Integer tempI = 0;
	
//	public Thermometer(int temperature, String deg)
//	{
//		
//			this(temperature, true, deg); this calls the constructor below and then puts in values	
//		
//	}
	
	public Thermometer(Double temperature, boolean convert, String deg )
	{
		this.temperature = temperature;
		this.convert = convert;
		this.deg = deg;
		
	}
	
	
	public int display(boolean convert, String deg)
	{
		
		getTemp(convert, deg);
		
		
		return (int) Math.round(temp);
	}
	
	public void getTemp(boolean convert, String deg)
	{
		if(deg.toLowerCase() == "c")
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
		else if(deg.toLowerCase() == "f")
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
