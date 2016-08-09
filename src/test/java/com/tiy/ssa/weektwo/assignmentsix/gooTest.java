package com.tiy.ssa.weektwo.assignmentsix;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class gooTest
{

    @Test
    public void test()
    {
        Set<goo> s = new HashSet<>();

        assertTrue(s.add(new goo("potato")));
        assertFalse(s.add(new goo("potato")));

    }

}
