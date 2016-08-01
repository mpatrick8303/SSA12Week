package com.tiy.ssa.weekone.assignmentone;

public class Power
{
	private double result = 1;
	private int num;
	private int powerO;
	
	
	public Power(int num, int powerO)
	{
		this.num = num;
		this.powerO = powerO;
	}
	
//	public int pOf1()
//	{
//		result = num;
//		
//		return result;
//	}
//	
//	public int pOf2()
//	{
//		result = num*num;
//		return result;
//	}
//	
//	public int pOf3()
//	{
//		result = num*num*num;
//		return result;
//	}
//	
	public int pOf()
	{
		
		if(powerO < 2)
		{
			result = num;
		}
		else
		{
			result = Math.pow((double)num, (double)powerO);
			
		}
		return (int) result;
	}
	
//	public int pOf()
//	{
//		
//		int num1 = 1;
//		
//		if(powerO == 1)
//		{
//			result = num;
//		}
//		else
//		{
//			for(int i = 1; i<=powerO;i++)
//			{
//				num1 = (int) result;
//				result = num1*num;
//			}
//			
//		}
//		return (int)result;
//	}
	
}
