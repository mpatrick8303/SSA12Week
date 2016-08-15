package MapsExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelperTest
{

    @Test
    public void get()
    {
        Helper<String, Integer> helper = new Helper<>();
        helper.add("apples", 5);
        assertEquals(5, helper.getOrDefault("apples", 0));

        
        
    }
    
    @Test
    public void getDefault()
    {
        Helper<String, Integer> helper = new Helper<>();
        helper.add("apples", 5);
        assertEquals(0, helper.getOrDefault("rock", 0));
    }

}
