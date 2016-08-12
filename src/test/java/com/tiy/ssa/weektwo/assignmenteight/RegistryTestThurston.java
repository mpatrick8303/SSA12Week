package com.tiy.ssa.weektwo.assignmenteight;


import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author thurston
 */
public class RegistryTestThurston 
{
    Registry registry = new Registry();

    @Before
    public void universe()
    {
        this.registry = new Registry();
        //unknown parents
        Person greatGrandfather = new Person(new Name("Klement", "McIllvaine"), new SocialSecurityNumber("012345678"));
        greatGrandfather.setBirth(LocalDate.of(1895, Month.JANUARY, 3));
        greatGrandfather.setDeath(LocalDate.of(1934, Month.JULY, 17));
        assertTrue("", this.registry.add(greatGrandfather));

        Person greatGrandmother = new Person(new Name("Mary", "McIllvaine"), new SocialSecurityNumber("012345679"));
        greatGrandmother.setBirth(LocalDate.of(1901, Month.APRIL, 15));
        greatGrandmother.setDeath(LocalDate.of(1934, Month.AUGUST, 29));
        assertTrue("", registry.add(greatGrandmother));

        //*******************************
        Person grandfather = new Person(new Name("Joseph", "Theissner"), new SocialSecurityNumber("112345671"));
        grandfather.setBirth(LocalDate.of(1915, Month.MARCH, 11));
        grandfather.setDeath(LocalDate.of(1948, Month.MAY, 1));
        //unknown parents
        assertTrue("", this.registry.add(grandfather));
        //marries ->
        Person grandma = new Person(new Name("Helena", "Theissner"), new SocialSecurityNumber("112345672"));
        grandma.setBirth(LocalDate.of(1924, Month.DECEMBER, 22));
        grandma.setDeath(LocalDate.of(2015, Month.MAY, 7));
        greatGrandfather.addChild(grandma);
        greatGrandmother.addChild(grandma);
        assertTrue("", this.registry.add(grandma));
        //has sister
        Person temp = new Person(new Name("Dorothea", "Theissner"), new SocialSecurityNumber("112345673"));
        temp.setBirth(LocalDate.of(1926, Month.MAY, 23));
        temp.setDeath(LocalDate.of(2008, Month.MARCH, 13));
        greatGrandfather.addChild(temp);
        greatGrandmother.addChild(temp);
        assertTrue("", this.registry.add(temp));
        //*************************************************************************
        // JT & HT's children:
        Person mother = new Person(new Name("Janet", "Theissner"), new SocialSecurityNumber("212345670"));
        mother.setBirth(LocalDate.of(1941, Month.MAY, 11));
        //still alive
        assertTrue("", this.registry.add(mother));

        Person aunt = new Person(new Name("Babs", "Theissner"), new SocialSecurityNumber("212345671"));
        aunt.setBirth(LocalDate.of(1944, Month.JANUARY, 31));
        aunt.setDeath(LocalDate.of(1995, Month.AUGUST, 29));
        grandfather.addChildren(Arrays.asList(mother, aunt));
        grandma.addChildren(Arrays.asList(mother, aunt));
        assertTrue("", this.registry.add(aunt));

        // marries roger torgo ()
        temp = new Person(new Name("Roger", "Torgo"), new SocialSecurityNumber("212345672"));
        temp.setBirth(LocalDate.of(1942, Month.FEBRUARY, 5));
        temp.setDeath(LocalDate.of(1980, Month.SEPTEMBER, 23));
        //unknown parents
        assertTrue("", this.registry.add(temp));

        //Babs and Roger's children: née 
        Person candy = new Person(new Name("Candy", "Verdun née Torgo"), new SocialSecurityNumber("312345670"));
        candy.setBirth(LocalDate.of(1976, Month.NOVEMBER, 4));
        //still alive
        assertTrue("", this.registry.add(candy));

        Person adam = new Person(new Name("Adam", "Torgo"), new SocialSecurityNumber("312345671"));
        adam.setBirth(LocalDate.of(1980, Month.DECEMBER, 14));
        assertTrue("", this.registry.add(adam));

        aunt.addChildren(Arrays.asList(candy, adam));
        temp.addChildren(Arrays.asList(candy, adam));

        assertEquals("", 10, this.registry.getSize());


        //Candy's children, just ignore her husband for now:
        Person child = new Person(new Name("Erin", "Verdun"), new SocialSecurityNumber("412345670"));
        child.setBirth(LocalDate.of(2000, Month.OCTOBER, 12));
        candy.addChild(child);
        assertTrue("", this.registry.add(child));

        child = new Person(new Name("Michael", "Verdun"), new SocialSecurityNumber("412345671"));
        child.setBirth(LocalDate.of(2002, Month.JUNE, 29));
        candy.addChild(child);
        assertTrue("", this.registry.add(child));

        //Adam's children (ignore wife for now
        child = new Person(new Name("Mya", "Torgo"), new SocialSecurityNumber("412345672"));
        child.setBirth(LocalDate.of(2016, Month.MAY, 12));
        adam.addChild(child);
        assertTrue("", this.registry.add(child));

        assertEquals("", 13, this.registry.getSize());


        //Other 'side'
        grandma = new Person(new Name("Eleanor", "Nagle"), new SocialSecurityNumber("112345674"));
        grandma.setBirth(LocalDate.of(1930, Month.AUGUST, 18));
        grandma.setDeath(LocalDate.of(1992, Month.NOVEMBER, 11));
        assertTrue("", this.registry.add(grandma));

        //one child
        Person father = new Person(new Name("Milton", "Nagle"), new SocialSecurityNumber("212345674"));
        father.setBirth(LocalDate.of(1941, Month.JULY, 5));
        grandma.addChild(father);
        assertTrue("", this.registry.add(father));

        //Pa & ma childlren
        Person steven = new Person(new Name("Steven", "Nagle"), new SocialSecurityNumber("412345673"));
        steven.setBirth(LocalDate.of(1964, Month.NOVEMBER, 4));
        assertTrue("", this.registry.add(steven));

        Person kevin = new Person(new Name("Kevin", "Nagle"), new SocialSecurityNumber("412345674"));
        kevin.setBirth(LocalDate.of(1968, Month.SEPTEMBER, 22));
        assertTrue("", this.registry.add(kevin));

        Person jim = new Person(new Name("James", "Nagle"), new SocialSecurityNumber("412345675"));
        jim.setBirth(LocalDate.of(1969, Month.SEPTEMBER, 29));
        assertTrue("", this.registry.add(jim));

        Person jennifer = new Person(new Name("Jennifer", "Blush née Nagle"), new SocialSecurityNumber("412345676"));
        jennifer.setBirth(LocalDate.of(1972, Month.JUNE, 12));
        assertTrue("", this.registry.add(jennifer));

        assertEquals("", 4, father.addChildren(Arrays.asList(steven, kevin, jim, jennifer)));
        assertEquals("", 4, mother.addChildren(Arrays.asList(steven, kevin, jim, jennifer)));

        //and now children's children, expediently we won't worry about spouses
        child = new Person(new Name("Hanley", "Blush"), new SocialSecurityNumber("512345670"));
        child.setBirth(LocalDate.of(1999, Month.MARCH, 20));
        assertTrue("", this.registry.add(child));
        assertTrue("", jennifer.addChild(child));

        child = new Person(new Name("Ildiko", "Nagle"), new SocialSecurityNumber("512345671"));
        child.setBirth(LocalDate.of(2015, Month.DECEMBER, 2));
        assertTrue("", this.registry.add(child));
        assertTrue("", jim.addChild(child));

        assertEquals("", 21, this.registry.getSize());

    }
    


    @Test
    public void ancestorstest()
    {

        
//        for (int i = 0; i < registry.ancestors(new SocialSecurityNumber("123456789")).size(); i++)
//        {
//            System.out.println(registry.ancestors(new SocialSecurityNumber("123456789")).get(i).getName().firstN);
//        }

        assertTrue("James Nagel",registry.ancestors(new SocialSecurityNumber("512345671")).contains(registry.get(new SocialSecurityNumber("412345675"))));
        assertTrue("milton nagle",registry.ancestors(new SocialSecurityNumber("512345671")).contains(registry.get(new SocialSecurityNumber("212345674"))));
        assertTrue("jannet theissner",registry.ancestors(new SocialSecurityNumber("512345671")).contains(registry.get(new SocialSecurityNumber("212345670"))));
        assertTrue("eleanor nagle",registry.ancestors(new SocialSecurityNumber("512345671")).contains(registry.get(new SocialSecurityNumber("112345674"))));
        assertTrue("helena theissner",registry.ancestors(new SocialSecurityNumber("512345671")).contains(registry.get(new SocialSecurityNumber("112345672"))));
        assertTrue("joseph theissner",registry.ancestors(new SocialSecurityNumber("512345671")).contains(registry.get(new SocialSecurityNumber("112345671"))));
        assertTrue("mary mcIllvaine",registry.ancestors(new SocialSecurityNumber("512345671")).contains(registry.get(new SocialSecurityNumber("012345679"))));
        assertTrue("klement mcillvaine",registry.ancestors(new SocialSecurityNumber("512345671")).contains(registry.get(new SocialSecurityNumber("012345678"))));
//        
//        assertTrue("",registry.ancestors(new SocialSecurityNumber("987654321")).contains(brenda));
//        assertTrue("",registry.ancestors(new SocialSecurityNumber("987654321")).contains(william));
//        
//        assertTrue("",registry.ancestors(new SocialSecurityNumber("147258369")).contains(mary));
//        assertTrue("",registry.ancestors(new SocialSecurityNumber("147258369")).contains(joe));
//        
//        assertTrue("",registry.ancestors(new SocialSecurityNumber("333333333")).isEmpty());
//        
    }
    
//    @Test
//    public void decendentstest()
//    {
//
////        System.out.println();
////        for (int i = 0; i < registry.decendents(new SocialSecurityNumber("333333333")).size(); i++)
////        {
////            System.out.println(registry.decendents(new SocialSecurityNumber("333333333")).get(i).getName().firstN);
////        }
//        
//        assertTrue("",registry.decendents(new SocialSecurityNumber("333333333")).contains(bill));
//        assertTrue("",registry.decendents(new SocialSecurityNumber("333333333")).contains(mike));
//        
//        assertTrue("",registry.decendents(new SocialSecurityNumber("222222222")).contains(bill));
//        assertTrue("",registry.decendents(new SocialSecurityNumber("222222222")).contains(mike));
//        
//        assertTrue("",registry.decendents(new SocialSecurityNumber("111111111")).contains(jeanne));
//        assertTrue("",registry.decendents(new SocialSecurityNumber("111111111")).contains(mike));
//        
//        assertTrue("",registry.decendents(new SocialSecurityNumber("000000000")).contains(jeanne));
//        assertTrue("",registry.decendents(new SocialSecurityNumber("000000000")).contains(mike));
//        
//        assertTrue("",registry.decendents(new SocialSecurityNumber("987654321")).contains(mike));
//        
//        assertTrue("",registry.decendents(new SocialSecurityNumber("147258369")).contains(mike));
//        
//        assertTrue("",registry.decendents(new SocialSecurityNumber("123456789")).isEmpty());
//        
//    }
//    
//    @Test
//    public void testGet()
//    {
//        assertEquals("",mike,registry.get(new SocialSecurityNumber("123456789")));
//        assertEquals("",bill,registry.get(new SocialSecurityNumber("987654321")));
//        assertEquals("",mary,registry.get(new SocialSecurityNumber("000000000")));
//        
//    }
//    
//    @Test
//    public void testOldestLiving()
//    {
//
//        assertEquals("",mary,registry.oldestLivingRelative(new SocialSecurityNumber("123456789")));
//        assertEquals("",mary,registry.oldestLivingRelative(new SocialSecurityNumber("147258369")));
//        assertEquals("",william,registry.oldestLivingRelative(new SocialSecurityNumber("987654321")));
//        assertEquals("",mary,registry.oldestLivingRelative(new SocialSecurityNumber("000000000")));
//        
//    }
//    
//    @Test
//    public void testYoungestDecendent()
//    {
//        assertEquals("",mike,registry.youngestDescendant(new SocialSecurityNumber("000000000")));
//        assertEquals("",mike,registry.youngestDescendant(new SocialSecurityNumber("123456789")));
//        
//    }
//    
//    @Test
//    public void testGetSize()
//    {
//        assertEquals("",7,registry.getSize());
//    }
//    
//    @Test
//    public void testProgenitor()
//    {
//        assertEquals("",mary,registry.progenitor(new SocialSecurityNumber("123456789")));
//    }
//    
//    @Test
//    public void testIsRelated()
//    {
////        System.out.println(registry.areRelated(new SocialSecurityNumber("123456789"), new SocialSecurityNumber("000000000")));
//        assertTrue("",registry.areRelated(new SocialSecurityNumber("123456789"), new SocialSecurityNumber("000000000")));
//        
////        System.out.println(registry.areRelated(new SocialSecurityNumber("123456789"), new SocialSecurityNumber("555555555")));
//        assertFalse("",registry.areRelated(new SocialSecurityNumber("123456789"), new SocialSecurityNumber("555555555")));
//        
//    }
}
