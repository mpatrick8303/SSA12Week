package com.tiy.ssa.weekthree.assignmentnine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class SSAMap<K, V> implements Map<K, V>
{
    @Override
    public abstract V get(Object key);
    
    @Override
    public abstract V put(K key, V value);
    
    @Override
    public abstract V remove(Object key);
    
    @Override
    public abstract Set<Entry<K, V>> entrySet();
    
    @Override 
    public void clear()
    {
//        for(Entry<K,V> e : entrySet())//loops through an entry set using the abstract method entryset()
//        {
//            remove(e.getKey());
//        }
        
        List<K> keys = new ArrayList<>();
        
        for(Entry<K,V> e : entrySet())//loops through an entry set using the abstract method entryset()
        {
            keys.add(e.getKey());
        }
        for(int i = 0; i<keys.size();i++)
        {
            remove(keys.get(i));
        }       
        
    }
    
    @Override
    public boolean containsKey(Object key)
    {
        return null != get(key);
    }
    
    @Override
    public boolean containsValue(Object value)
    {
        boolean cont = false;
        for(Entry<K,V> e : entrySet())
        {
            
            if(e.getValue() == value)
            {
                cont = true;
            }

        }
        return cont;
    }


    @Override
    public V getOrDefault(Object key, V defaultValue)
    {
        V v1;
        if((v1 = get(key)) != null)
        {
            return v1;
        }
        else
            return defaultValue;
    }

    @Override
    public boolean isEmpty()
    {
        return 0 == size();
    }

    @Override
    public Set<K> keySet()
    {
        Set<K> keySet = new HashSet<>();//using this makes it so your are just adding to this new set the keys from the map
        
        for(Entry<K,V> e : entrySet())
        {
            keySet.add(e.getKey());
        }
        return keySet;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m)
    {
        for(Entry<? extends K, ? extends V> e: m.entrySet())
        {
            put(e.getKey(), e.getValue());
        }
    }

    @Override
    public V replace(K key, V value)
    {
        V v1 = get(key);
        
        remove(key);
        put(key, value);
        
        return v1;
    }


    @Override
    public int size()
    {
        int size = 0;
        
        for(Entry<K,V> e : entrySet())
        {
            size++;
        }
        return size;
    }

    @Override
    public Collection<V> values()
    {
        List<V> collection = new ArrayList<>();
        
        for(Entry<K,V> e : entrySet())
        {
            collection.add(e.getValue());
        }
        return collection;
    }
    

 
}
