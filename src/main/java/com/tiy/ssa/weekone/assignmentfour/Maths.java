package com.tiy.ssa.weekone.assignmentfour;

public class Maths
{
	private Maths() //makes it so you can't call/instantiate the math class. Outside you can construct the object of type mathS
	{
		
	}
	
	public static int squareRoot(int num)
	{
		int sqVal = 0;
		
		for(int i = 0;(i*i)<=num ; sqVal = i, i++){}
		
		
		return sqVal;
		
	}
	
	public static int cubeRoot(int num)
	{
		int cuVal = 0;		
		int i = 0;
		
		while((i*i*i) <= num)
		{
			cuVal = i;
			i++;
		}
		return cuVal;
	}
}
