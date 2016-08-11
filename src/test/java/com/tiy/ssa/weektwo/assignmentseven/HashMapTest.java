package com.tiy.ssa.weektwo.assignmentseven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Before;
import org.junit.Test;

import MapsExample.SocialSecurityNumber;

public class HashMapTest
{

    Map<SSN, User> map = new HashMap<>();
    
    
    @Before
    public void setup()
    {
        map.putIfAbsent(new SSN("123456789"), new User("Michael Patrick", 23));
        map.putIfAbsent(new SSN("987654321"), new User("Les Emerson", 24));
        map.putIfAbsent(new SSN("147258369"), new User("Ryan Hiner", 21));
        map.putIfAbsent(new SSN("369258147"), new User("Dan Miller", 26));
        
        
    }
    
    @Test
    public void testHashMap()
    {
        assertEquals("", "Michael Patrick", map.get(new SSN("123456789")).getName());
        assertEquals("", 23, map.get(new SSN("123456789")).getAge());
        
        assertEquals("", "Les Emerson", map.get(new SSN("987654321")).getName());
        assertEquals("", 24, map.get(new SSN("987654321")).getAge());
        
        assertEquals("", "Ryan Hiner", map.get(new SSN("147258369")).getName());
        assertEquals("", 21, map.get(new SSN("147258369")).getAge());
        
        assertEquals("", "Dan Miller", map.get(new SSN("369258147")).getName());
        assertEquals("", 26, map.get(new SSN("369258147")).getAge());
        
        map.remove(new SSN("369258147")); 
        assertFalse("", map.containsKey(new SSN("369258147")));
        
        map.replace(new SSN("147258369"), new User("Ryan Hiner", 21) , new User("Travis Adams", 35));
        assertEquals("", "Travis Adams", map.get(new SSN("147258369")).getName());
        assertEquals("", 35, map.get(new SSN("147258369")).getAge());
        
//        for(Entry entry : map.entrySet())
//        {
//            if(assertEquals("","987654321", map.entry.getKey()));
//        }
    }

}
