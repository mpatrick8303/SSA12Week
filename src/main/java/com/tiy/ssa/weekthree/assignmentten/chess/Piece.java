package com.tiy.ssa.weekthree.assignmentten.chess;

public interface Piece extends Comparable<Piece>
{
    int val = 0;

    Location where();

    boolean canMove(Location where);

    @Override
    String toString();

    @Override
    /**
     * chess pieces have an intrinsic 'value'
     * ordered descending:
     * King
     * Queen
     * Rook
     * Bishop/Knight (tied)
     * Pawn
     * 
     * in addition pieces have the same value can
     * be valued by their location relative to the 'center'
     * of the board (3, 3) . . . (4, 4)
     */
    public int compareTo(Piece o);

    /**
     * take into account intrinsic value and location
     * 
     * @param other
     * @return
     * @return
     */

    public int getVal();

    @Override
    boolean equals(Object other);

    @Override
    public int hashCode();

    public static int whosBetter(Piece a, Piece b)
    {
        return 1;
    }
    
    
    

}