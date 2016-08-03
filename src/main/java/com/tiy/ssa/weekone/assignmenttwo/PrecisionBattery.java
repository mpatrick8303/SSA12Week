package com.tiy.ssa.weekone.assignmenttwo;

import java.math.BigDecimal;

public class PrecisionBattery
{
	
			final BigDecimal capacity;//in kWh
			BigDecimal startingBat;//in kWh
			BigDecimal power; //how many kW it burns per hour
			BigDecimal batteryCharge;
			BigDecimal batDischarge;
			
			public PrecisionBattery(BigDecimal capacity)//, BigDecimal startingBat
			{
				this.capacity = capacity;
				this.startingBat = capacity;
				
				
			}
			
			//methods you want to add are charge(leftOver is how much charge is on the battery), discharge
			
			
			public BigDecimal discharge(BigDecimal batDischarge)
			{
				if(startingBat.subtract(batDischarge).compareTo(BigDecimal.ZERO) == -1)
				{
					startingBat = BigDecimal.ZERO;
				}
				else
				{
					amountDischarged(batDischarge);
				}
				
//				getState();
				return startingBat;
					
			}
			
			public BigDecimal charge(BigDecimal batCharge)
			{		
				if(startingBat.add(batCharge).compareTo(capacity) == 1)
				{
					startingBat = capacity;
				}
				else
				{
					amountCharged(batCharge);
				}
				
//				getState();
				return startingBat;
			
			}
			
			private BigDecimal amountDischarged(BigDecimal batDischarge)
			{
				
				
				
				startingBat = startingBat.subtract(batDischarge);
				return startingBat;
				
			}
			
			private BigDecimal amountCharged(BigDecimal batCharge)
			{
				
				startingBat = startingBat.add(batCharge);
				
				return startingBat;
			}
			
			public BigDecimal howLong(BigDecimal power)
			{
				BigDecimal howL = (getCapacity().divide(power));
				return  howL;
			}
			
			
			
			public BigDecimal getCapacity()
			{
				return capacity;
			}
			

			
			
}



