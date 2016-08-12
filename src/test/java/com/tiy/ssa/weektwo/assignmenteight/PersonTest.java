package com.tiy.ssa.weektwo.assignmenteight;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PersonTest
{
//    @Before
//    public void setup()
//    {
//        
//    }

    @Test
    public void Persontest()
    {
        Person bill = new Person(new Name("Bill","Patrick"),new SocialSecurityNumber("123456789"));
        Person jeanne = new Person(new Name("Jeanne","Patrick"),new SocialSecurityNumber("987654321"));
        Person mike = new Person(new Name("Mike","Patrick"),new SocialSecurityNumber("147258369"));

        
        bill.setBirth(LocalDate.of(1950, Month.MARCH, 30));
        bill.setDeath(LocalDate.of(2010, Month.MARCH, 30));
        bill.setParentI(null);
        bill.setParentII(null);
        bill.addChild(mike);
        
        assertEquals("","Bill",bill.name.firstN);
        assertEquals("","Patrick", bill.name.lastN);
        assertEquals("",new SocialSecurityNumber("123456789"),bill.ssn);
        assertEquals("",LocalDate.of(1950, Month.MARCH, 30),bill.getBirth());
        assertEquals("",LocalDate.of(2010, Month.MARCH, 30),bill.getDeath());
        assertTrue("",bill.getChildren().contains(mike));
        
        
        jeanne.setBirth(LocalDate.of(1950, Month.JUNE, 30));
        jeanne.setDeath(LocalDate.of(2010, Month.JUNE, 30));
        jeanne.addChild(mike);
        
        assertEquals("","Jeanne",jeanne.name.firstN);
        assertEquals("","Patrick", jeanne.name.lastN);
        assertEquals("",new SocialSecurityNumber("987654321"),jeanne.ssn);
        assertEquals("",LocalDate.of(1950, Month.JUNE, 30),jeanne.getBirth());
        assertEquals("",LocalDate.of(2010, Month.JUNE, 30),jeanne.getDeath());
        assertEquals("",null,jeanne.getParentI());
        assertEquals("",null,jeanne.getParentII());
        assertTrue("",jeanne.getChildren().contains(mike));
       
        
        mike.setBirth(LocalDate.of(1992, Month.DECEMBER, 24));
        mike.setParentI(bill);
        mike.setParentII(jeanne);
        
        assertEquals("","Mike",mike.name.firstN);
        assertEquals("","Patrick", mike.name.lastN);
        assertEquals("",new SocialSecurityNumber("147258369"),mike.ssn);
        assertEquals("",LocalDate.of(1992, Month.DECEMBER, 24),mike.getBirth());
        assertEquals("",null,mike.getDeath());
        assertEquals("",bill,mike.getParentI());
        assertEquals("",jeanne,mike.getParentII());
    }
    
    Person test = new Person(new Name("Michael","Patrick"),new SocialSecurityNumber("123456789"));
    Person testChild1 = new Person(new Name("Brett","Patrick"),new SocialSecurityNumber("987654321"));
    Person testChild2 = new Person(new Name("Adam","Patrick"),new SocialSecurityNumber("147258369"));
    Person testChild3 = new Person(new Name("Lisa","Patrick"),new SocialSecurityNumber("369258147"));
    
    @Test
    public void addChildTest()
    {
        test.addChild(testChild1);
        assertTrue("",test.getChildren().contains(testChild1));
    }
    
    @Test
    public void add_getChildrenTest()
    {
        List<Person> children = new ArrayList<>();
        children.add(testChild1);
        children.add(testChild2);
        children.add(testChild3);
        test.addChildren(children);
        
        assertTrue("",test.getChildren().contains(testChild1));
        assertTrue("",test.getChildren().contains(testChild2));
        assertTrue("",test.getChildren().contains(testChild3));
        assertTrue("",test.getChildren().containsAll(children));
        
       
    }
    
    @Test
    public void testAge()
    {
        test.setBirth(LocalDate.of(1950, Month.APRIL, 30));
        
        assertEquals("", 66,test.age());
     
    }
    
    @Test
    public void testIsAlive()
    {
        test.setBirth(LocalDate.of(1950, Month.APRIL, 30));
        test.setDeath(LocalDate.of(1960, Month.APRIL, 30));
        assertEquals("",false,test.isAlive());
        
        testChild1.setBirth(LocalDate.of(2000, Month.APRIL, 30));
        assertEquals("",true,testChild1.isAlive());
        
    }
    

}
