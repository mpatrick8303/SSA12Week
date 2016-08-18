package com.tiy.ssa.weekthree.assignmentten.chess;

import java.util.ArrayList;
import java.util.Arrays;

public class Knight extends AllChessPieceMethods
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
        Location knightStart = new Location(x, y);
        return knightStart;
    }

    @Override
    public boolean canMove(Location where)
    {
        if (!isOnBoard(where))
        {
            return false;
        }

        if (knightMove(where))
            return true;
        else
            return false;

    }

    public boolean knightMove(Location where)
    {
        ArrayList<Integer> knightMoves = new ArrayList<>(Arrays.asList(1, -1));
        ArrayList<Integer> knightMoves2 = new ArrayList<>(Arrays.asList(2, -2));

        
        if(where.equals(where()))
            return false;
        if (knightMoves.contains(where().x - where.x) && (knightMoves2.contains(where().y - where.y)))
            return true;
        if (knightMoves2.contains(where().x - where.x) && (knightMoves.contains(where().y - where.y)))
            return true;
        else
            return false;
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
