package com.tiy.ssa.weekone.assignmentfour;

public class Knight
{
	private int orginX;
	private int orginY;
	private int n; //counter of how many times move has been called
	private int sA = 4;


	private int[] ints = new int[20];
	private int whatMove = getwhatMove(8,1);
	
	public Knight (int orginX, int orginY)
	{
		this.orginX = orginX;
		this.orginY = orginY;
	}
	
	public boolean move()
	{
		
		sA = sA +  2;
	
		switch(n)
		{
		case 0:
			int aX = 0;//1st spot in the array
			int aY = 1;//2nd spot in the array
			ints[aX] = orginX;
			ints[aY] = orginY;
			System.out.print("orgin:(" + ints[aX] + ",");
			System.out.print(ints [aY] + ")");
			aX = 2;
			aY = 3;
			move1(whatMove, ints, aX, aY);
			break;
		case 1: 
			aX = 4;
			aY = 5;
			move2(whatMove, ints, aX, aY);
			break;
		case 2:
			aX = 6;
			aY = 7;
			move3(whatMove, ints, aX, aY);
			break;
		case 3: 
			aX = 8;
			aY = 9;
			move4(whatMove, ints, aX, aY);	
			break;
		
		}
		boolean goodMove = isValid();
		goodMove = notBackwards();
		if(n >= 4)
		{
			goodMove = isHome();
		}
		
		return goodMove;
	}
	
	public int[] getPosition(int[] ints, int aX, int aY)
	{
		int spot1 = ints[aX];
		int spot2 = ints[aY];
		int[] pos = {spot1, spot2};
		
		return pos;
	}
	
	public int[] moveUpRight(int[] ints, int aX,int aY)
	{
		int cX = ints[aX-2] + 1;
		int cY = ints[aY-2] + 2;
		ints[aX] = cX;
		ints[aY] = cY;
		return ints;
	}
	public int[] moveUpLeft(int[] ints, int aX,int aY)
	{
		int cX = ints[aX-2] - 1;
		int cY = ints[aY-2] + 2;
		ints[aX] = cX;
		ints[aY] = cY;
		return ints;	
	}
	public int[] moveRightUp(int[] ints, int aX,int aY)
	{
		int cX = ints[aX-2] + 2;
		int cY = ints[aY-2] + 1;
		ints[aX] = cX;
		ints[aY] = cY;
		return ints;	
	}
	public int[] moveRightDown(int[] ints, int aX,int aY)
	{
		int cX = ints[aX-2] + 2;
		int cY = ints[aY-2] - 1;
		ints[aX] = cX;
		ints[aY] = cY;
		return ints;	
	}
	public int[] moveDownLeft(int[] ints, int aX,int aY)
	{
		int cX = ints[aX-2] - 1;
		int cY = ints[aY-2] - 2;
		ints[aX] = cX;
		ints[aY] = cY;
		return ints;	
	}
	public int[] moveDownRight(int[] ints, int aX,int aY)
	{
		int cX = ints[aX-2] + 1;
		int cY = ints[aY-2] - 2;
		ints[aX] = cX;
		ints[aY] = cY;
		return ints;	
	}
	public int[] moveLeftUp(int[] ints, int aX,int aY)
	{
		int cX = ints[aX-2] - 2;
		int cY = ints[aY-2] + 1;
		ints[aX] = cX;
		ints[aY] = cY;
		return ints;	
	}
	public int[] moveLeftDown(int[] ints, int aX,int aY)
	{
		int cX = ints[aX-2]- 2;
		int cY = ints[aY-2] - 1;
		ints[aX] = cX;
		ints[aY] = cY;
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
			int [] pos = getPosition(ints, aX, aY);
			
			System.out.print(" Move 1(" + pos[0] + ",");
			System.out.print(pos[1] + ")");
			
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
			aX = 4;
			aY = 5;
			int [] pos = getPosition(ints, aX, aY);
		
			System.out.print(" Move 2(" + pos[0] + ",");
			System.out.print(pos[1] + ")");
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
			aX = 6;
			aY = 7;
			int [] pos = getPosition(ints, aX, aY);
		
			System.out.print(" Move 3(" + pos[0] + ",");
			System.out.print(pos[1] + ")");
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
			aX = 8;
			aY = 9;
			int [] pos = getPosition(ints, aX, aY);
		
			System.out.print(" Back Home(" + pos[0] + ",");
			System.out.println(pos[1] + ")");
			n++;
	}
	
	public boolean isValid()
	{
		int aX = sA - 4;
		int aY = sA - 3;
		if((ints[aX] == (ints[aX-2]+2)) || (ints[aX] == (ints[aX-2]-2)) && (ints[aY] == (ints[aY-2]+1)) || (ints[aY] == (ints[aY-2]-1)))
		{
			
			return true;
		}
		else if ((ints[aX] == (ints[aX-2]+1)) || (ints[aX] == (ints[aX-2]-1)) && (ints[aY] == (ints[aY-2]+2)) || (ints[aY] == (ints[aY-2]-2)))
		{
			return true;
		}
		else{return false;}
	}
	
	public boolean isHome()
	{
		int aX = sA -4;
		int aY = sA - 3;
		if(n==0)
		{
			return false;
		}
		if(ints[0] == ints[aX] && ints[1] == ints[aY])
		{
			return true;
		}
		else{return false;}
	}
	
	public boolean leastAmountMoves()
	{
		if(n == 4)
		{
			return true;
		}
		else{return false;}
	}
	
	public boolean notBackwards()
	{
		int aX = sA - 4;
		int aY = sA -3;
		
		if(ints[aX] == ints[aX-2] && ints[aY] == ints[aY-2])
		{
			return false;
		}
		else{return true;}
	}
	
}
