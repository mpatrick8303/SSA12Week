package MapsExample;

import static org.junit.Assert.assertEquals;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class MapTest
{

    @Test
    public void initial()
    {
        Map<SocialSecurityNumber, User> map = new HashMap<>();//creates a new hashmap using ssn as the key and user as the value
        User user = new User("Michael", "Patrick");//creating a new user giving in the first and last name
        
        map.put(new SocialSecurityNumber("999991234"), user);
        //associating that the this new ssn object is the key that is associated with the value of the user(name in this instance)
 
        assertEquals("", user, map.get(new SocialSecurityNumber("999991234")));//showing that you can get the user by using the value of the ssn
        
        User removed = map.remove(new SocialSecurityNumber("999991234"));//removes the value with that key from the map
        assertEquals("", user, removed);
        assertEquals("", map.get(new SocialSecurityNumber("999991234")));//checking to make sure you cannot get it anymore
        
//        map.replace(key, oldValue, newValue) replaces a value from a key with a new value
        
        for(Entry entry : map.entrySet())//gets all of the keys and values in the map
        {
            entry.getValue();//gets value
            entry.getKey();//gets key
        }
    }

}
