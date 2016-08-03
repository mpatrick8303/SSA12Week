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
	
	
	public float discharge(float time)//uses power to see how much it takes away per hour
	{
		this.time = time;
		getTimeM();
		getPowerM();
		
		amountUsed();
		getState();
		return batteryRem;
			
	}
	
	public float charge(float time)//saying it charges at the same rate it uses power
	{
		this.time = time;
		getTimeM();
		getPowerM();
		
		
		amountCharged();
		getState();
		return batteryRem;
	
	}
	
	private void amountUsed()
	{
		batteryRem = startingBat;
		int i = 0;
		
		while(batteryRem > 0 && time > i)
		{
			batteryRem = batteryRem - power;
			i++;
		}
	}
	
	private void amountCharged()
	{
		batteryRem = startingBat;
		
		int i = 0;
		
		while(batteryRem < capacity && time > i)
		{
			batteryRem = batteryRem + power;
			i++;
		}
	}
	
	public int howLong()
	{
		float howLong = (getBatteryRem()/power);
		return (int) howLong;
	}
	
	public void getTimeM()
	{
		time = time*60;
		
	}
	
	
	public void getPowerM()
	{
		power = power/60; //how much is used/charged per minute
		
	}
	
	public float getCapacity()
	{
		return capacity;
	}
	
	public int getBatteryRem()
	{
		
		return (int) batteryRem;
	}
	
	public String getState()
	{
		String state = "This device battery has around " + getBatteryRem() + "kW remaining. This device will last for " + howLong() + " more minutes";
		System.out.println(state);
		
		return state;
	}
	
	
}