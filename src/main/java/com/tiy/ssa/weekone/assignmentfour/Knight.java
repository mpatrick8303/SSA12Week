package com.tiy.ssa.weekone.assignmentfour;

public class Knight
{
	private int orginX;
	private int orginY;
	private int n;
	private int aS = 4;
	
	public Knight (int orginX, int orginY)
	{
		this.orginX = orginX;
		this.orginY = orginY;
	}
	
	public int move()
	{
		int[] ints = new int[aS+2];
		int aX = 0;//1st spot in the array
		int aY = 1;//2nd spot in the array
		n = 0; //counter of how many times move has been called
		
		ints[aX] = orginX;
		ints[aY] = orginY;
		
		int whatMove = getwhatMove(8,1);
	
		switch(n)
		{
		case 0:
			move1(whatMove, ints, aX, aY);
			break;
		case 1: 
			move2(whatMove, ints, aX, aY);
			break;
		case 2:
			move3(whatMove, ints, aX, aY);
			break;
		case 3: 
			move4(whatMove, ints, aX, aY);
			break;
			
		}
//		if(n == 0)
//		{
//			
//			
//			switch (whatMove)
//			{
//			case 1: whatMove = 1;
//				moveUpRight(ints, aX, aY);
//				break;
//			case 2: whatMove = 2;
//				moveUpLeft(ints, aX, aY);
//				break;
//			case 3: whatMove = 3;
//				moveRightUp(ints, aX, aY);
//				break;
//			case 4: whatMove = 4;
//				moveRightDown(ints, aX, aY);
//				break;
//			case 5: whatMove = 5;
//				moveDownRight(ints, aX, aY);
//				break;
//			case 6: whatMove = 6;
//				moveDownLeft(ints, aX, aY);
//				break;
//			case 7: whatMove = 7;
//				moveLeftUp(ints, aX, aY);
//				break;
//			case 8: whatMove = 8;
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
//			switch(whatMove)
//			{
//			case 1: whatMove = 1;
//				moveRightDown(ints, aX, aY);
//				break;
//			case 2: whatMove = 2;
//				moveLeftDown(ints, aX, aY);
//				break;
//			case 3: whatMove = 3;
//				moveUpLeft(ints, aX, aY);
//				break;
//			case 4: whatMove = 4;
//				moveDownLeft(ints, aX, aY);
//				break;
//			case 5: whatMove = 5;
//				moveRightUp(ints, aX, aY);
//				break;
//			case 6: whatMove = 6;
//				moveLeftUp(ints, aX, aY);
//				break;
//			case 7: whatMove = 7;
//				moveUpRight(ints, aX, aY);
//				break;
//			case 8: whatMove = 8;
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
			
			aX = aX +2;
			aY = aY +2;
			getPosition(ints, aX, aY);
			n++;
			aS = aS + 2;
		
			
			
	
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
			
			aX = aX +2;
			aY = aY +2;
			getPosition(ints, aX, aY);
			n++;
			aS = aS + 2;
		
			
			
	
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
			
			aX = aX +2;
			aY = aY +2;
			getPosition(ints, aX, aY);
			n++;
			aS = aS + 2;
		
			
			
	
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
			
			aX = aX +2;
			aY = aY +2;
			getPosition(ints, aX, aY);
			n++;
			aS = aS + 2;
		
			
			
	
	}
	
}
