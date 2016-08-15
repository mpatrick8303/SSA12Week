package InheritanceExamples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Rectangle_SquareTest
{

    @Test
    public void Rectangletest()
    {
       Rectangle r = new Rectangle(2,4);
       assertEquals("",8,r.area(),.01 );
       
       r.setHeight(5);
       assertEquals("",20,r.area(),.01 );
       
       r.setWidth(2);
       assertEquals("",10,r.area(),.01 );
       
       
       
    }
    
    @Test
    public void SquareTest()
    {
//        Square s = new Square(2,4);
//        assertEquals("",16,s.area(),.01);
        
        Square s = new Square(4);
        assertEquals("",16f,s.area(),.01);
        
        s.setHeight(5);
        assertEquals("",25f,s.area(),.01);
        
        s.setWidth(6);
        assertEquals("",36f,s.area(),.01);
    }

}
