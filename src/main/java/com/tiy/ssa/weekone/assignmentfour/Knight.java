package com.tiy.ssa.weekone.assignmentfour;

public class Knight
{
	private int orginX;
	private int orginY;
	private int n;
	
	public Knight (int orginX, int orginY)
	{
		this.orginX = orginX;
		this.orginY = orginY;
	}
	
	public int move()
	{
		int aS = 4;
		int[] ints = new int[aS+2];
		int aX = 0;//1st spot in the array
		int aY = 1;//2nd spot in the array
		n = 0; //counter of how many times move has been called
		
		ints[aX] = orginX;
		ints[aY] = orginY;
		
		int rand = getRandom(8,1);
		if(n == 0){ move1(rand,ints,aX,aY)}
//		{
//			
//			
//			switch (rand)
//			{
//			case 1: rand = 1;
//				moveUpRight(ints, aX, aY);
//				break;
//			case 2: rand = 2;
//				moveUpLeft(ints, aX, aY);
//				break;
//			case 3: rand = 3;
//				moveRightUp(ints, aX, aY);
//				break;
//			case 4: rand = 4;
//				moveRightDown(ints, aX, aY);
//				break;
//			case 5: rand = 5;
//				moveDownRight(ints, aX, aY);
//				break;
//			case 6: rand = 6;
//				moveDownLeft(ints, aX, aY);
//				break;
//			case 7: rand = 7;
//				moveLeftUp(ints, aX, aY);
//				break;
//			case 8: rand = 8;
//				moveLeftDown(ints, aX, aY);
//				break;
//			
//			}
//			
//			aX = aX +2;
//			aY = aY +2;
//			getPosition(ints, aX, aY);
//			n++;
//			aS = aS + 2;
//			return n;
//			
//			
//		}
//		else
//		{
//			switch(rand)
//			{
//			case 1: rand = 1;
//				moveRightDown(ints, aX, aY);
//				break;
//			case 2: rand = 2;
//				moveLeftDown(ints, aX, aY);
//				break;
//			case 3: rand = 3;
//				moveUpLeft(ints, aX, aY);
//				break;
//			case 4: rand = 4;
//				moveDownLeft(ints, aX, aY);
//				break;
//			case 5: rand = 5;
//				moveRightUp(ints, aX, aY);
//				break;
//			case 6: rand = 6;
//				moveLeftUp(ints, aX, aY);
//				break;
//			case 7: rand = 7;
//				moveUpRight(ints, aX, aY);
//				break;
//			case 8: rand = 8;
//				moveDownRight(ints, aX, aY);
//				break;
//			}
//		
//			aX = aX +2;
//			aY = aY +2;
//			getPosition(ints, aX, aY);
//			n++;
//			aS = aS + 2;
//			return n;
//		}
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
//		if(n == 0)
//		{
//			int cX = ints[aX] + 1;
//			int cY = ints[aY] + 2;
//			ints[aX] = cX;
//			ints[aY] = cY;
//			return ints;
//		}
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
	
	public int getRandom(int max, int min)
	{
		
		return ((int) (Math.random()*(max - min))) + min;
	}
	
	public void move1(int rand, int[] ints, aX, aY)
	{
			
		switch (rand)
		{
		case 1: rand = 1;
			moveUpRight(ints, aX, aY);
			break;
		case 2: rand = 2;
			moveUpLeft(ints, aX, aY);
			break;
		case 3: rand = 3;
			moveRightUp(ints, aX, aY);
			break;
		case 4: rand = 4;
			moveRightDown(ints, aX, aY);
			break;
		case 5: rand = 5;
			moveDownRight(ints, aX, aY);
			break;
		case 6: rand = 6;
			moveDownLeft(ints, aX, aY);
			break;
		case 7: rand = 7;
			moveLeftUp(ints, aX, aY);
			break;
		case 8: rand = 8;
			moveLeftDown(ints, aX, aY);
			break;
			
		}
			
			aX = aX +2;
			aY = aY +2;
			getPosition(ints, aX, aY);
			n++;
			aS = aS + 2;
			return n;
			
			
//		
	}
	
}
