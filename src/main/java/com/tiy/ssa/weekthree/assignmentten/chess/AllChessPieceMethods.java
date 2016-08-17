package com.tiy.ssa.weekthree.assignmentten.chess;

public abstract class AllChessPieceMethods implements Piece
{
    @Override
    public int compareTo(Piece o)
    {
        if (this.getVal() == o.getVal())
        {
            if ((this.where().x - 4) + (this.where().y - 4) > (o.where().x - 4) + (o.where().y - 4))
                return 1;
            if ((this.where().x - 4) + (this.where().y - 4) < (o.where().x - 4) + (o.where().y - 4))
                return -1;
            else
                return 0;

        }
        if (this.getVal() > o.getVal())
            return 1;
        else
            return -1;
    }



    public boolean isOnBoard(Location where)
    {
        if (where.x > 7 || where.x < 0 || where.y > 7 || where.y < 0)
            return false;
        else
            return true;

    }
    
    
}
