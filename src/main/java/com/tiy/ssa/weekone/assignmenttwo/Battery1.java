package com.tiy.ssa.weekone.assignmenttwo;
// i left my original code with time implemented at battery then created battery1 without time.
public class Battery1
{
		final float capacity;//in kWh
		float startingBat;//in kWh
		float power; //how many kW it burns per hour
		
		
		public Battery1(float capacity)
		{
			this.capacity = capacity;
			this.startingBat = capacity;
			
			
		}
		
		//methods you want to add are charge(leftOver is how much charge is on the battery), discharge
		
		
		public float discharge(float batDischarge)
		{
			if((startingBat - batDischarge) < 0)
			{
				startingBat = 0;
			}
			else
			{
				amountDischarged(batDischarge);
			}
			
//			getState();
			return startingBat;
				
		}
		
		public float charge(float batCharge)
		{		
			if((startingBat + batCharge) > capacity)
			{
				startingBat = capacity;
			}
			else
			{
				amountCharged(batCharge);
			}
			
//			getState();
			return startingBat;
		
		}
		
		private float amountDischarged(float batDischarge)
		{
			
			
			
			startingBat = startingBat - batDischarge;
			return startingBat;
			
		}
		
		private float amountCharged(float batCharge)
		{
			
			startingBat = startingBat + batCharge;
			
			return startingBat;
		}
		
		public int howLong(float power)
		{
			if(power == 0)
			{
				return 0;
			}
			else
			{
				System.out.format("%. of minutes remaining for a device with %. of power using a bettery with %.0 kw leftover", (int)(getCapacity()/power));
				return (int)(getCapacity()/power);
				
			}
			
		}
		
		
		
		
		
		
		public float getCapacity()
		{
			return capacity;
		}
		
		public float getBatteryRem()
		{
			
			return startingBat;
		}
		
//		public String getState()
//		{
//			String state = "This device battery has around " + getBatteryRem() + "kW remaining. This device will last for " + howLong + " more minutes";
//			System.out.println(state);
//			
//			return state;
//		}
		
		
	}

