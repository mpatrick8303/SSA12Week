package com.tiy.ssa.weektwo.assignmenteight;

import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigInteger;

public class FactorialTest
{

    @Test
    public void testFactorial()
    {
        assertEquals("",BigInteger.valueOf(120),Factorial.factorial(5));
        assertEquals("",BigInteger.valueOf(720),Factorial.factorial(6));
        assertEquals("",BigInteger.valueOf(3628800),Factorial.factorial(10));
        assertEquals("",BigInteger.valueOf(1),Factorial.factorial(1));
        assertEquals("",BigInteger.valueOf(1),Factorial.factorial(0));
        assertEquals("",BigInteger.valueOf(6),Factorial.factorial(3));
        assertEquals("",BigInteger.valueOf(39916800),Factorial.factorial(11));
        assertEquals("",BigInteger.valueOf(40320),Factorial.factorial(8));
        assertEquals("",BigInteger.valueOf(362880),Factorial.factorial(9));
        assertEquals("",BigInteger.valueOf(2),Factorial.factorial(2));
        
        assertEquals("",BigInteger.valueOf(120),Factorial.factorial(5));
        
        
    }

}
