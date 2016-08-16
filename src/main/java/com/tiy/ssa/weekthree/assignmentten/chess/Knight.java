package com.tiy.ssa.weekthree.assignmentten.chess;

import java.util.ArrayList;
import java.util.Arrays;

public class Knight implements Piece
{
    final int x;
    final int y;
    final int val;
    
    public Knight(int x, int y)
    {
     this.x = x;
     this.y = y;
     val = 2;
    }
   

    @Override
    public Location where()
    {
        Location knightStart = new Location(x,y);
        return knightStart;
    }

    @Override
    public boolean canMove(Location where)
    {
        if(where.x > 7 || where.x < 0 || where.y > 7 || where.y <0)
        {
            return false;
        }
        
        ArrayList<Integer> knightMoves = new ArrayList<>(Arrays.asList(1,-1));
        ArrayList<Integer> knightMoves2 = new ArrayList<>(Arrays.asList(2,-2));
      
        if(knightMoves.contains(where().x-where.x) && (knightMoves2.contains(where().y-where.y)))
            return true;
        if(knightMoves2.contains(where().x-where.x) && (knightMoves.contains(where().y-where.y)))
            return true;
        else
            return false;
                   
           
    }

    @Override
    public int compareTo(Piece o)
    {
        if(this.val == o.getVal())
        {
            if((this.where().x - 4) + (this.where().y - 4) > (o.where().x - 4) + (o.where().y - 4))
                return 1;
            if((this.where().x - 4) + (this.where().y - 4) < (o.where().x - 4) + (o.where().y - 4))
                return -1;
            else
                return 0;
                
        }
        if(this.val > o.getVal())
            return 1;
        else
            return -1;
    }


    @Override
    public int getVal()
    {
        return val;
    }


    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + val;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }


    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Knight other = (Knight) obj;
        if (val != other.val)
            return false;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
    
    

}
