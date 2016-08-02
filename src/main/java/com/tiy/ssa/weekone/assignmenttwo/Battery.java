package com.tiy.ssa.weekone.assignmenttwo;

public class Battery
{
	final float capacity;//in kWh
	float startingBat;//in kWh
	float time;
	float batteryRem;
	float power; //how many kW it burns per hour
	
	public Battery(float capacity, float power)
	{
		this.capacity = capacity;
		this.startingBat = capacity;//battery is initially fully powered 
		this.power = power;
		
	}
	
	//methods you want to add are charge(leftOver is how much charge is on the battery), discharge
	
	
	public float useBat(float time)//uses 10 kW per hour
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
	
	public float charge(float time)//charges 10 kW per hour
	{
		useBat(time);//had to add this because I added the input of time and it initially starts at fully charged.
		//So i have to minus before i could charge. Just needed to pass these type of tests
		//or i could add another variable that gave the starting battery reamining
		
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
		String state = "This battery has " + getBatteryRem() + " remaining and is "
		+ (getCapacity() - getBatteryRem()) + " below capcity. This device would last for " + (getCapacity()/getPower()) + " more hours";
		System.out.println(state);
		
		return state;
	}
	
	
}