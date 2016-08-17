package com.tiy.ssa.weekthree.assignmentten.chess;

import static org.junit.Assert.*;

import org.junit.Test;

public class PieceTest
{

    @Test
    public void pawnTest()
    {
        Pawn p1 = new Pawn(1,1);
        assertTrue(p1.canMove(new Location(1,2)));
        assertTrue(p1.canMove(new Location(1,3)));

        assertFalse(p1.canMove(new Location(1,4)));
        assertFalse(p1.canMove(new Location(2,1)));
        assertFalse(p1.canMove(new Location(9,1)));
        assertFalse(p1.canMove(new Location(1,1)));

        Pawn p2 = new Pawn(4,4);
        assertTrue(p2.canMove(new Location(4,5)));

        assertFalse(p2.canMove(new Location(4,7)));
        assertFalse(p2.canMove(new Location(1,4)));
        assertFalse(p2.canMove(new Location(2,1)));
        assertFalse(p2.canMove(new Location(-9,4)));

    }

    @Test
    public void knightTest()
    {
        Knight kn1 = new Knight(1,0);
        assertTrue(kn1.canMove(new Location(2,2)));
        assertTrue(kn1.canMove(new Location(3,1)));

        assertFalse(kn1.canMove(new Location(1,1)));
        assertFalse(kn1.canMove(new Location(0,3)));
        assertFalse(kn1.canMove(new Location(10,0)));
        assertFalse(kn1.canMove(new Location(0,8)));

        Knight kn2 = new Knight(4,4);
        assertTrue(kn2.canMove(new Location(5,6)));
        assertTrue(kn2.canMove(new Location(2,3)));

        assertFalse(kn2.canMove(new Location(3,1)));
        assertFalse(kn2.canMove(new Location(8,5)));
    }
    //    
    @Test
    public void kingTest()
    {
        King k1 = new King(4,0);
        assertTrue(k1.canMove(new Location(5,0)));
        assertTrue(k1.canMove(new Location(3,0)));
        assertTrue(k1.canMove(new Location(4,1)));


        assertFalse(k1.canMove(new Location(3,1)));
        assertFalse(k1.canMove(new Location(5,1)));
        assertFalse(k1.canMove(new Location(10,0)));
        assertFalse(k1.canMove(new Location(0,8)));

        King k2 = new King(4,4);
        assertTrue(k2.canMove(new Location(5,4)));
        assertTrue(k2.canMove(new Location(3,4)));
        assertTrue(k2.canMove(new Location(4,5)));
        assertTrue(k2.canMove(new Location(4,3)));

        assertFalse(k2.canMove(new Location(5,5)));
        assertFalse(k2.canMove(new Location(3,3)));

    }

    @Test
    public void bishopTest()
    {
        Bishop b1 = new Bishop(2,0);
        assertTrue(b1.canMove(new Location(5,3)));
        assertTrue(b1.canMove(new Location(0,2)));
        assertTrue(b1.canMove(new Location(3,1)));


        assertFalse(b1.canMove(new Location(2,4)));
        assertFalse(b1.canMove(new Location(6,0)));
        assertFalse(b1.canMove(new Location(10,0)));
        assertFalse(b1.canMove(new Location(0,8)));

        Bishop b2 = new Bishop(4,4);
        assertTrue(b2.canMove(new Location(7,7)));
        assertTrue(b2.canMove(new Location(0,0)));
        assertTrue(b2.canMove(new Location(6,2)));
        assertTrue(b2.canMove(new Location(2,6)));

        assertFalse(b2.canMove(new Location(4,1)));
        assertFalse(b2.canMove(new Location(1,4)));
    }

    @Test
    public void rookTest()
    {
        Rook r1 = new Rook(0,0);
        assertTrue(r1.canMove(new Location(5,0)));
        assertTrue(r1.canMove(new Location(0,5)));


        assertFalse(r1.canMove(new Location(1,1)));
        assertFalse(r1.canMove(new Location(1,4)));
        assertFalse(r1.canMove(new Location(10,0)));
        assertFalse(r1.canMove(new Location(0,8)));

        Rook r2 = new Rook(4,4);
        assertTrue(r2.canMove(new Location(4,0)));
        assertTrue(r2.canMove(new Location(7,4)));

        assertFalse(r2.canMove(new Location(5,5)));
        assertFalse(r2.canMove(new Location(3,3)));;
    }

    @Test
    public void queenTest()
    {
        Queen q1 = new Queen(3,0);
        assertTrue(q1.canMove(new Location(3,5)));
        assertTrue(q1.canMove(new Location(6,0)));
        assertTrue(q1.canMove(new Location(1,0)));
        assertTrue(q1.canMove(new Location(0,3)));
        assertTrue(q1.canMove(new Location(6,3)));



        assertFalse(q1.canMove(new Location(2,2)));
        assertFalse(q1.canMove(new Location(4,6)));
        assertFalse(q1.canMove(new Location(10,0)));
        assertFalse(q1.canMove(new Location(0,8)));

        Queen q2 = new Queen(4,4);
        assertTrue(q2.canMove(new Location(4,7)));
        assertTrue(q2.canMove(new Location(4,0)));
        assertTrue(q2.canMove(new Location(2,6)));
        assertTrue(q2.canMove(new Location(6,6)));

        assertFalse(q2.canMove(new Location(3,1)));
        assertFalse(q2.canMove(new Location(3,6)));
    }

    @Test
    public void compareToTest()
    {
        Pawn p1 = new Pawn(1,0);
        Knight kn1 = new Knight(1,0);
        King k1 = new King(1,0);
        Bishop b1 = new Bishop(1,0);
        Rook r1 = new Rook(1,0);
        Queen q1 = new Queen(1,0);

        assertEquals(-1,p1.compareTo(kn1));
        assertEquals(-1,p1.compareTo(k1));
        assertEquals(-1,p1.compareTo(b1));
        assertEquals(-1,p1.compareTo(r1));
        assertEquals(-1,p1.compareTo(q1));

        assertEquals(1,kn1.compareTo(p1));
        assertEquals(0,kn1.compareTo(b1));
        assertEquals(-1,kn1.compareTo(r1));
        assertEquals(-1,kn1.compareTo(q1));
        assertEquals(-1,kn1.compareTo(k1));

        assertEquals(1,b1.compareTo(p1));
        assertEquals(0,b1.compareTo(kn1));
        assertEquals(-1,b1.compareTo(r1));
        assertEquals(-1,b1.compareTo(q1));
        assertEquals(-1,b1.compareTo(k1));

        assertEquals(1,q1.compareTo(p1));
        assertEquals(1,q1.compareTo(kn1));  
        assertEquals(1,q1.compareTo(b1));  
        assertEquals(1,q1.compareTo(r1));
        assertEquals(-1,q1.compareTo(k1));

        assertEquals(1,k1.compareTo(p1));
        assertEquals(1,k1.compareTo(b1));
        assertEquals(1,k1.compareTo(kn1));
        assertEquals(1,k1.compareTo(r1));
        assertEquals(1,k1.compareTo(q1));

        Pawn p2 = new Pawn(3,3);
        Pawn p3 = new Pawn(3,4);
        assertEquals(1,p3.compareTo(p2));

        Knight kn2 = new Knight(3,3);
        Knight kn3 = new Knight(3,4);
        assertEquals(1,kn3.compareTo(kn2));

        King k2 = new King(3,3);
        King k3 = new King(3,4);
        assertEquals(1,k3.compareTo(k2));

        Bishop b2 = new Bishop(3,3);
        Bishop b3 = new Bishop(3,4);
        assertEquals(1,b3.compareTo(b2));

        Rook r2 = new Rook(3,3);
        Rook r3 = new Rook(3,4);
        assertEquals(1,r3.compareTo(r2));

        Queen q2 = new Queen(3,3);
        Queen q3 = new Queen(3,4);
        assertEquals(1,q3.compareTo(q2));

        assertEquals(1,q3.compareTo(b2));
        assertEquals(-1,p3.compareTo(r2));
    }


}
