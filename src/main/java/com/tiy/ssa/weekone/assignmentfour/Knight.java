package com.tiy.ssa.weekone.assignmentfour;

public class Knight
{
	private int orginX;
	private int orginY;
	private int n; //counter of how many times move has been called

	private int aS = 4;
	int[] ints = new int[10];
	int whatMove = getwhatMove(8,1);
	
	public Knight (int orginX, int orginY)
	{
		this.orginX = orginX;
		this.orginY = orginY;
	}
	
	public int move()
	{

		
	
		switch(n)
		{
		case 0:
			int aX = 0;//1st spot in the array
			int aY = 1;//2nd spot in the array
			ints[aX] = orginX;
			ints[aY] = orginY;
			move1(whatMove, ints, aX, aY);
			break;
		case 1: 
			aX = 2;
			aY = 3;
			move2(whatMove, ints, aX, aY);
			break;
		case 2:
			aX = 4;
			aY = 5;
			move3(whatMove, ints, aX, aY);
			break;
		case 3: 
			aX = 6;
			aY = 7;
			move4(whatMove, ints, aX, aY);
			break;
			
		}
		
		return n;
	}
	
	public int[] getPosition(int[] ints, int aX, int aY)
	{
		
		aX = ints[aX];
		aY = ints[aY];
		int[] pos = {aX, aY};
		
		return pos;
	
		
	
		
	}
	
	public int[] moveUpRight(int[] ints, int aX,int aY)
	{
		
		int cX = ints[aX] + 1;
		int cY = ints[aY] + 2;
		ints[aX+2] = cX;
		ints[aY+2] = cY;
		return ints;
		
	}
	public int[] moveUpLeft(int[] ints, int aX,int aY)
	{

		int cX = ints[aX] - 1;
		int cY = ints[aY] + 2;
		ints[aX+2] = cX;
		ints[aY+2] = cY;
		return ints;
		
	}
	public int[] moveRightUp(int[] ints, int aX,int aY)
	{

		int cX = ints[aX] + 2;
		int cY = ints[aY] + 1;
		ints[aX+2] = cX;
		ints[aY+2] = cY;
		return ints;
		
	}
	public int[] moveRightDown(int[] ints, int aX,int aY)
	{
		int cX = ints[aX] + 2;
		int cY = ints[aY] - 1;
		ints[aX+2] = cX;
		ints[aY+2] = cY;
		return ints;
		
	}
	public int[] moveDownLeft(int[] ints, int aX,int aY)
	{
		int cX = ints[aX] - 1;
		int cY = ints[aY] - 2;
		ints[aX+2] = cX;
		ints[aY+2] = cY;
		return ints;
		
	}
	public int[] moveDownRight(int[] ints, int aX,int aY)
	{
		int cX = ints[aX] + 1;
		int cY = ints[aY] - 2;
		ints[aX+2] = cX;
		ints[aY+2] = cY;
		return ints;
		
	}
	public int[] moveLeftUp(int[] ints, int aX,int aY)
	{
		int cX = ints[aX] - 2;
		int cY = ints[aY] + 1;
		ints[aX+2] = cX;
		ints[aY+2] = cY;
		return ints;
		
	}
	public int[] moveLeftDown(int[] ints, int aX,int aY)
	{
		int cX = ints[aX] - 2;
		int cY = ints[aY] - 1;
		ints[aX+2] = cX;
		ints[aY+2] = cY;
		return ints;
		
	}
	
	public int getwhatMove(int max, int min)
	{
		
		return ((int) (Math.random()*(max - min))) + min;
	}
	
	public void move1(int whatMove, int[] ints, int aX, int aY)
	{
			
		switch (whatMove)
		{
		case 1: 
			moveUpRight(ints, aX, aY);
			break;
		case 2: 
			moveUpLeft(ints, aX, aY);
			break;
		case 3: 
			moveRightUp(ints, aX, aY);
			break;
		case 4: 
			moveRightDown(ints, aX, aY);
			break;
		case 5: 
			moveDownRight(ints, aX, aY);
			break;
		case 6: 
			moveDownLeft(ints, aX, aY);
			break;
		case 7: 
			moveLeftUp(ints, aX, aY);
			break;
		case 8: 
			moveLeftDown(ints, aX, aY);
			break;
			
		}
			
		
			getPosition(ints, aX, aY);
			n++;
		
			
			
	
	}
	
	public void move2(int whatMove, int[] ints, int aX, int aY)
	{
			
		switch (whatMove)
		{
		case 1: 
			moveRightDown(ints, aX, aY);
			break;
		case 2: 
			moveLeftDown(ints, aX, aY);
			break;
		case 3: 
			moveUpLeft(ints, aX, aY);
			break;
		case 4: 
			moveDownLeft(ints, aX, aY);
			break;
		case 5: 
			moveRightUp(ints, aX, aY);
			break;
		case 6: 
			moveLeftUp(ints, aX, aY);
			break;
		case 7: 
			moveUpRight(ints, aX, aY);
			break;
		case 8: 
			moveDownRight(ints, aX, aY);
			break;
			
		}
			
			
			getPosition(ints, aX, aY);
			n++;
			
		
			
			
	
	}
	
	public void move3(int whatMove, int[] ints, int aX, int aY)
	{
			
		switch (whatMove)
		{
		case 1: 
			moveDownLeft(ints, aX, aY);
			break;
		case 2: 
			moveDownRight(ints, aX, aY);
			break;
		case 3: 
			moveLeftDown(ints, aX, aY);
			break;
		case 4: 
			moveLeftUp(ints, aX, aY);
			break;
		case 5: 
			moveUpLeft(ints, aX, aY);
			break;
		case 6: 
			moveUpRight(ints, aX, aY);
			break;
		case 7: 
			moveRightDown(ints, aX, aY);
			break;
		case 8: 
			moveRightUp(ints, aX, aY);
			break;
			
		}
			
			
			getPosition(ints, aX, aY);
			n++;
	
		
			
			
	
	}
	
	public void move4(int whatMove, int[] ints, int aX, int aY)
	{
			
		switch (whatMove)
		{
		case 1: 
			moveLeftUp(ints, aX, aY);
			break;
		case 2: 
			moveRightUp(ints, aX, aY);
			break;
		case 3: 
			moveDownRight(ints, aX, aY);
			break;
		case 4: 
			moveUpRight(ints, aX, aY);
			break;
		case 5:
			moveLeftDown(ints, aX, aY);
			break;
		case 6: 
			moveRightDown(ints, aX, aY);
			break;
		case 7: 
			moveDownLeft(ints, aX, aY);
			break;
		case 8:
			moveUpLeft(ints, aX, aY);
			break;
			
		}
			
			
			getPosition(ints, aX, aY);
			n++;
		
		
			
			
	
	}
	
}
