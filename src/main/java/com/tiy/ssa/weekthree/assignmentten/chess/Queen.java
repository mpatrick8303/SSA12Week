package com.tiy.ssa.weekthree.assignmentten.chess;

public class Queen extends AllChessPieceMethods
{

    final int x;
    final int y;
    final int val;

    public Queen(int x, int y)
    {
        this.x = x;
        this.y = y;
        val = 4;
    }

    @Override
    public Location where()
    {
        Location queenStart = new Location(x, y);
        return queenStart;
    }

    @Override
    public boolean canMove(Location where)
    {
        if (!isOnBoard(where))
        {
            return false;
        }

        if (queenMove(where))
            return true;
        else
            return false;

    }

    public boolean queenMove(Location where)
    {
        boolean move = false;
        int moveX = Math.abs(where().x - where.x);
        int moveY = Math.abs(where().y - where.y);

        if (moveX == moveY)
            move = true;
        if ((where().x != where.x && where().y == where.y) || (where().y != where.y && where().x == where.x))
            move = true;

        return move;
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
        Queen other = (Queen) obj;
        if (val != other.val)
            return false;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }


}
