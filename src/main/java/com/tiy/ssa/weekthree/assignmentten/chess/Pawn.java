package com.tiy.ssa.weekthree.assignmentten.chess;

public class Pawn implements Piece
{
    final int x;
    final int y;
    final int val;
    
    public Pawn(int x, int y)
    {
     this.x = x;
     this.y = y;
     val = 1;
    }
   

    @Override
    public Location where()
    {
        Location pawnLoc = new Location(x,y);
        return pawnLoc;
    }

    @Override
    public boolean canMove(Location where)
    {
        if(where.x > 7 || where.x < 0 || where.y > 7 || where.y <0)
        {
            return false;
        }
        
        if(where().y == 1)
        {
            if(where().x == where.x && (where.y == ((where().y+1))|| (where.y == where().y+2)))
                return true;
            else
                return false;

        }
        else
        {
            if(where().x == where.x  && where.y == (where().y+1))
                return true;
            else
                return false;
        }
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
        Pawn other = (Pawn) obj;
        if (val != other.val)
            return false;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
    
    




}
