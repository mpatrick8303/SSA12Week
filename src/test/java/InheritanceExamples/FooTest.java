package com.tiy.ssa.weekthree.assignmenttwelve;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class FooTest
{

    @Test
    public void test()
    {
        Foo f = new Foo(); 
        LocalDate now = LocalDate.now();
        f.foo(now);
        
        Object o = now;
        f.foo(o);
        
  
        
    }

}
