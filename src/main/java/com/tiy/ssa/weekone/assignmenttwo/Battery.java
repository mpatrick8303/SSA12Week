package com.tiy.ssa.weekone.assignmenttwo;

public class Battery
{
	final float capacity;//in kWh
	float startingBat;//in kWh
	float time;
	float batteryRem;
	float power; //how many kW it burns per hour
	
	public Battery(float capacity, float startingBat, float power)
	{
		this.capacity = capacity;
		this.startingBat = startingBat;//added this so i could use time
		this.power = power;
		
	}
	
	//methods you want to add are charge(leftOver is how much charge is on the battery), discharge
	
	
	public float useBat(float time)//uses power to see how much it takes away per hour
	{
		batteryRem = startingBat;
		int i = 0;
		
		while(batteryRem > 0 && time > i)
		{
			batteryRem = batteryRem - getPower();
			i++;
		}
		getState();
		return batteryRem;
			
	}
	
	public float charge(float time)
	{
		batteryRem = startingBat;
		
		int i = 0;
		
		while(batteryRem <= capacity && time > i)
		{
			batteryRem = batteryRem + getPower();
			i++;
		}
		getState();
		return batteryRem;
	
	}
	
	public float getPower()
	{
		return power;
	}

	public float getCapacity()
	{
		return capacity;
	}

	

	public float getBatteryRem()
	{
		return batteryRem;
	}
	
	public String getState()
	{
		String state = "This battery has " + getBatteryRem() + "kW remaining. This device would last for " + (getBatteryRem()/getPower()) + " more hours";
		System.out.println(state);
		
		return state;
	}
	
	
}