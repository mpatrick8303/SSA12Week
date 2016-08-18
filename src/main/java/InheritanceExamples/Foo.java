package InheritanceExamples;

import java.time.LocalDate;

public class Foo
{
    public void foo(LocalDate date)
    {
        System.err.println("foo(LD) called");
    }
    
    public void foo(LocalDate date, int offset)
    {
        
    }
    
    public void foo(Object obj)
    {
        System.err.println("foo(obj) called");
    }
    
    
}
