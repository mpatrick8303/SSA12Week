package com.tiy.ssa.weekthree.assignmentnine;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class SSAMapTest
{
    DecoratorSSAMap<Integer, String> map = new DecoratorSSAMap<>();
    DecoratorSSAMap<String, String> map2 = new DecoratorSSAMap<>();
    
    
    @Before
    public void setup()
    {
        map.put(1, "apples");
        map.put(2, "rodger");
        
        map2.put("one", "apples");
        map2.put("two", "rodger");
    }
    
   

    @Test
    public void clearTest()
    {

        map.clear();
        assertTrue(map.isEmpty());
        
        map2.clear();
        assertTrue(map.isEmpty());
    }
    
    @Test
    public void containsKeyTest()
    {

        assertTrue(map.containsKey(1));
        assertFalse(map.containsKey(5));
        
        assertTrue(map2.containsKey("one"));
        assertFalse(map2.containsKey("three"));
        
    }
    
    @Test
    public void containsValueTest()
    {        
        assertTrue(map.containsValue("apples"));
        assertFalse(map.containsValue("the"));
        
        assertTrue(map2.containsValue("apples"));
        assertFalse(map2.containsValue("king"));
    }
    
    @Test
    public void getOrDefaultTest()
    {
        assertEquals("apples",map.getOrDefault(1, "Not there"));
        assertEquals("Not there",map.getOrDefault(5, "Not there"));
        
        assertEquals("apples", map2.getOrDefault("one", "not there"));
        assertEquals("not there", map2.getOrDefault("three", "not there"));
        
    }
    
    @Test
    public void isEmptyTest()
    {
        map.remove(1);
        map.remove(2);
        
        assertTrue(map.isEmpty());
        
        map2.remove("one");
        map2.remove("two");
        
        assertTrue(map2.isEmpty());
    }
    
    @Test
    public void keySetTest()
    {
        assertTrue(map.keySet().contains(1));
        assertTrue(map.keySet().contains(2));
        assertFalse(map.keySet().contains(3));
        
        assertTrue(map2.keySet().contains("one"));
        assertTrue(map2.keySet().contains("two"));
        assertFalse(map2.keySet().contains("three"));
    }
    
    @Test
    public void putAllTest()
    {
        Map<Integer,String> all = new HashMap<>();
        all.put(3, "the");
        all.put(4, "of");
        all.put(5, "as");
        
        map.putAll(all);
        
        assertTrue(map.containsKey(3));
        assertTrue(map.containsKey(4));
        assertTrue(map.containsKey(5));
        assertFalse(map.containsKey(6));
        
        assertTrue(map.containsValue("the"));
        assertTrue(map.containsValue("of"));
        assertTrue(map.containsValue("as"));
        assertFalse(map.containsValue("pool"));
        
        Map<String,String> all2 = new HashMap<>();
        all2.put("three", "the");
        all2.put("four", "of");
        all2.put("five", "as");
        
        map2.putAll(all2);
        
        assertTrue(map2.containsKey("three"));
        assertTrue(map2.containsKey("four"));
        assertTrue(map2.containsKey("five"));
        assertFalse(map2.containsKey("six"));
        
        assertTrue(map2.containsValue("the"));
        assertTrue(map2.containsValue("of"));
        assertTrue(map2.containsValue("as"));
        assertFalse(map2.containsValue("pool"));
        
        
    }
    
    @Test
    public void replaceTest()
    {
        map.replace(1, "king");        
        assertEquals("king", map.get(1));
        assertEquals("rodger",map.replace(2, "lava"));
        
        map2.replace("one", "king");
        assertEquals("king", map2.get("one"));
        assertEquals("rodger",map2.replace("two", "lava"));
    }
    
    @Test
    public void sizeTest()
    {
        assertEquals(2,map.size());
        
        assertEquals(2,map2.size());
    }
    
    @Test public void valueTest()
    {
        assertTrue(map.values().contains("apples"));
        assertTrue(map.values().contains("rodger"));
        assertFalse(map.values().contains("king"));
        
        assertTrue(map2.values().contains("apples"));
        assertTrue(map2.values().contains("rodger"));
        assertFalse(map2.values().contains("king"));
    }

}
