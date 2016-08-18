package com.tiy.ssa.weekthree.assignmentten.chess;

import java.util.ArrayList;
import java.util.Arrays;

public class King extends AllChessPieceMethods
{

    final int x;
    final int y;
    final int val;

    public King(int x, int y)
    {
        this.x = x;
        this.y = y;
        val = 5;
    }

    @Override
    public Location where()
    {
        Location kingStart = new Location(x, y);
        return kingStart;
    }

    @Override
    public boolean canMove(Location where)
    {
        if (!isOnBoard(where))
        {
            return false;
        }

        if (kingMove(where))
            return true;
        else
            return false;
    }

    public boolean kingMove(Location where)
    {
        ArrayList<Integer> kingMoves = new ArrayList<>(Arrays.asList(1, -1));
        
        if(where.equals(where()))
            return false;

        if (kingMoves.contains(where().x - where.x) && (where().y == where.y))
            return true;
        if (kingMoves.contains(where().y - where.y) && (where().x == where.x))
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
        King other = (King) obj;
        if (val != other.val)
            return false;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

}
