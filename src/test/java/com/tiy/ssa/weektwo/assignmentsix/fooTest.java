package com.tiy.ssa.weektwo.assignmentsix;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class fooTest
{

   
    @Test
    public void test()
    {

        Set<foo> s = new HashSet<>();
        
        assertTrue(s.add(new foo("potato")));
        assertTrue(s.add(new foo("potato")));
        
    
   
        
    }

}
