package MapsExample;

import java.util.HashMap;
import java.util.Map;

public class Helper<K, V>
{
    final Map<K,V> map = new HashMap<>();
    

    void add(K key, V value)
    {
        this.map.put(key, value);
    }
    
    public V getOrDefault(K key, V def)
    {
        V returnValue = null;
        
        if((returnValue = this.map.get(key)) != null)//assignment assigns the value to return value using () to show what your assigning
            return returnValue;
        

        return def;
        
    }
}
