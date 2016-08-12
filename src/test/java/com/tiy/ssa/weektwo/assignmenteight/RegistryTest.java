package com.tiy.ssa.weektwo.assignmenteight;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Before;
import org.junit.Test;

public class RegistryTest
{
    Registry r1 = new Registry();
    
    Person brenda = new Person(new Name("Brenda","Patrick"),new SocialSecurityNumber("333333333"));       
    Person william = new Person(new Name("William","Patrick"),new SocialSecurityNumber("222222222"));              
    Person joe = new Person(new Name("Joe","Patrick"),new SocialSecurityNumber("111111111")); 
    Person mary = new Person(new Name("Mary","Patrick"),new SocialSecurityNumber("000000000"));      
    Person bill = new Person(new Name("Bill","Patrick"),new SocialSecurityNumber("987654321"));               
    Person jeanne = new Person(new Name("Jeanne","Patrick"),new SocialSecurityNumber("147258369"));              
    Person mike = new Person(new Name("Michael","Patrick"),new SocialSecurityNumber("123456789"));
    
    Person travis = new Person(new Name("Travis","Adams"), new SocialSecurityNumber("555555555"));
    
    
    
    
    
    @Before
    public void setup()
    {
        
        brenda.setBirth(LocalDate.of(1940, Month.MARCH, 30));
        brenda.addChild(bill);
        
        william.setBirth(LocalDate.of(1935, Month.MARCH, 30));
        william.addChild(bill);
        
        joe.setBirth(LocalDate.of(1925, Month.MARCH, 30));
        joe.setDeath(LocalDate.of(2000, Month.MARCH, 30));
        joe.addChild(jeanne);
        
        mary.setBirth(LocalDate.of(1920, Month.MARCH, 30));
        mary.addChild(jeanne);
        
        bill.setBirth(LocalDate.of(1950, Month.MARCH, 30));
        bill.addChild(mike);
        
        jeanne.setBirth(LocalDate.of(1955, Month.JUNE, 30));
        jeanne.addChild(mike);
        
        mike.setBirth(LocalDate.of(1992, Month.DECEMBER, 24));
        mike.setParentI(bill);
        mike.setParentII(jeanne);
        
        r1.add(mike);
        r1.add(jeanne);
        r1.add(bill);    
        r1.add(brenda);
        r1.add(william);
        r1.add(mary);
        r1.add(joe);

    }
   

    @Test
    public void ancestorstest()
    {

        
//        for (int i = 0; i < r1.ancestors(new SocialSecurityNumber("123456789")).size(); i++)
//        {
//            System.out.println(r1.ancestors(new SocialSecurityNumber("123456789")).get(i).getName().firstN);
//        }
//        
        assertTrue("",r1.ancestors(new SocialSecurityNumber("123456789")).contains(jeanne));
        assertTrue("",r1.ancestors(new SocialSecurityNumber("123456789")).contains(bill));
        assertTrue("",r1.ancestors(new SocialSecurityNumber("123456789")).contains(mary));
        assertTrue("",r1.ancestors(new SocialSecurityNumber("123456789")).contains(joe));
        assertTrue("",r1.ancestors(new SocialSecurityNumber("123456789")).contains(william));
        assertTrue("",r1.ancestors(new SocialSecurityNumber("123456789")).contains(brenda));
        
        assertTrue("",r1.ancestors(new SocialSecurityNumber("987654321")).contains(brenda));
        assertTrue("",r1.ancestors(new SocialSecurityNumber("987654321")).contains(william));
        
        assertTrue("",r1.ancestors(new SocialSecurityNumber("147258369")).contains(mary));
        assertTrue("",r1.ancestors(new SocialSecurityNumber("147258369")).contains(joe));
        
        assertTrue("",r1.ancestors(new SocialSecurityNumber("333333333")).isEmpty());
        
    }
    
    @Test
    public void decendentstest()
    {

//        System.out.println();
//        for (int i = 0; i < r1.decendents(new SocialSecurityNumber("333333333")).size(); i++)
//        {
//            System.out.println(r1.decendents(new SocialSecurityNumber("333333333")).get(i).getName().firstN);
//        }
        
        assertTrue("",r1.decendents(new SocialSecurityNumber("333333333")).contains(bill));
        assertTrue("",r1.decendents(new SocialSecurityNumber("333333333")).contains(mike));
        
        assertTrue("",r1.decendents(new SocialSecurityNumber("222222222")).contains(bill));
        assertTrue("",r1.decendents(new SocialSecurityNumber("222222222")).contains(mike));
        
        assertTrue("",r1.decendents(new SocialSecurityNumber("111111111")).contains(jeanne));
        assertTrue("",r1.decendents(new SocialSecurityNumber("111111111")).contains(mike));
        
        assertTrue("",r1.decendents(new SocialSecurityNumber("000000000")).contains(jeanne));
        assertTrue("",r1.decendents(new SocialSecurityNumber("000000000")).contains(mike));
        
        assertTrue("",r1.decendents(new SocialSecurityNumber("987654321")).contains(mike));
        
        assertTrue("",r1.decendents(new SocialSecurityNumber("147258369")).contains(mike));
        
        assertTrue("",r1.decendents(new SocialSecurityNumber("123456789")).isEmpty());
        
    }
    
    @Test
    public void testGet()
    {
        assertEquals("",mike,r1.get(new SocialSecurityNumber("123456789")));
        assertEquals("",bill,r1.get(new SocialSecurityNumber("987654321")));
        assertEquals("",mary,r1.get(new SocialSecurityNumber("000000000")));
        
    }
    
    @Test
    public void testOldestLiving()
    {

        assertEquals("",mary,r1.oldestLivingRelative(new SocialSecurityNumber("123456789")));
        assertEquals("",mary,r1.oldestLivingRelative(new SocialSecurityNumber("147258369")));
        assertEquals("",william,r1.oldestLivingRelative(new SocialSecurityNumber("987654321")));
        assertEquals("",mary,r1.oldestLivingRelative(new SocialSecurityNumber("000000000")));
        
    }
    
    @Test
    public void testYoungestDecendent()
    {
        assertEquals("",mike,r1.youngestDescendant(new SocialSecurityNumber("000000000")));
        assertEquals("",mike,r1.youngestDescendant(new SocialSecurityNumber("123456789")));
        
    }
    
    @Test
    public void testGetSize()
    {
        assertEquals("",7,r1.getSize());
    }
    
    @Test
    public void testProgenitor()
    {
        assertEquals("",mary,r1.progenitor(new SocialSecurityNumber("123456789")));
    }
    
    @Test
    public void testIsRelated()
    {
//        System.out.println(r1.areRelated(new SocialSecurityNumber("123456789"), new SocialSecurityNumber("000000000")));
        assertTrue("",r1.areRelated(new SocialSecurityNumber("123456789"), new SocialSecurityNumber("000000000")));
        
//        System.out.println(r1.areRelated(new SocialSecurityNumber("123456789"), new SocialSecurityNumber("555555555")));
        assertFalse("",r1.areRelated(new SocialSecurityNumber("123456789"), new SocialSecurityNumber("555555555")));
        
    }

}
