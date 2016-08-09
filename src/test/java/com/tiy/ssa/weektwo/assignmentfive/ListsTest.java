package com.tiy.ssa.weektwo.assignmentfive;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListsTest
{
    List<String> names = new ArrayList<>();
    List<String> names2 = new ArrayList<>();
    
  
    List<String> namesD = new ArrayList<>();
    
    @Before
    public void setup()
    {
        this.names.add("Michaels");//see if it takes out duplicates
        this.names.add("Danials");
        this.names.add("Erics");
        this.names.add("Eli");
        this.names.add("Andy");
        this.names.add("Steve");
        this.names.add("Michaels");
        this.names.add("Danials");
        this.names.add("Erics");
        this.names.add("Eli");
        this.names.add("Andy");
        this.names.add("Steve");
        
        this.names2.add("Michaels");
        this.names2.add("Danials");
        this.names2.add("Erics");
        this.names2.add("Alex");
        this.names2.add("Stuart");
        this.names2.add("Ami");
        this.names2.add("Michaels");
        this.names2.add("Danials");
        this.names2.add("Erics");
        this.names2.add("Alex");
        this.names2.add("Stuart");
        this.names2.add("Ami");
        
 
        
        this.namesD.add("Michaels");
        this.namesD.add("Danials");
        this.namesD.add("Erics");
        this.namesD.add("Alex");
        this.namesD.add("Stuart");
        this.namesD.add("Ami");
    }
    
    
    @Test
    public void testMatch()
    {
        
        List<String> matching = Lists.match(names,names2);
//        matching.addAll(Lists.match(names, names2));
        assertEquals(3, matching.size());
        assertTrue(matching.contains("Michaels"));
        assertTrue(matching.contains("Danials"));
        assertTrue(matching.contains("Erics"));
        
    }
    
    @Test
    public void testMatchHash()
    {
        
        List<String> matching2 = Lists.matchHash(names,names2);
        assertEquals(3, matching2.size());
        assertTrue(matching2.contains("Michaels"));
        assertTrue(matching2.contains("Danials"));
        assertTrue(matching2.contains("Erics"));
        
    }
    



    @Test
    public void testDecend()
    {
        List<String> decending = Lists.descendingBySize(namesD);
        assertTrue("Michaels".equals(decending.get(0)));
        assertTrue("Danials".equals(decending.get(1)));
        assertTrue("Stuart".equals(decending.get(2)));
        assertTrue("Erics".equals(decending.get(3)));
        assertTrue("Alex".equals(decending.get(4)));
        assertTrue("Ami".equals(decending.get(5)));
        
    }
    
    @After
    public void clear()
    {
        this.names.clear();
        this.names2.clear();
    }

}
