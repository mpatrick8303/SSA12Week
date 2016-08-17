package com.tiy.ssa.weekthree.assignmentten.chess;

public class Bishop extends AllChessPieceMethods
{

    final int x;
    final int y;
    final int val;

    public Bishop(int x, int y)
    {
        this.x = x;
        this.y = y;
        val = 2;
    }

    @Override
    public Location where()
    {
        Location bishopStart = new Location(x, y);
        return bishopStart;
    }

    @Override
    public boolean canMove(Location where)
    {
        if (!isOnBoard(where))
        {
            return false;
        }

        if (bishopMove(where))
            return true;
        else
            return false;

    }

    public boolean bishopMove(Location where)
    {
        int moveX = Math.abs(where().x - where.x);
        int moveY = Math.abs(where().y - where.y);

        if (moveX == moveY)
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
        Bishop other = (Bishop) obj;
        if (val != other.val)
            return false;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

}
