package com.tiy.ssa.weekthree.assignmentnine;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author thurston
 * @param <K>
 * @param <V>
 */
public class DecoratorSSAMap<K, V> extends SSAMap<K, V>
{
    final Map<K, V> decorated = new HashMap<>();

    @Override
    public V get(Object key)
    {
        return this.decorated.get(key);
    }

    @Override
    public V put(K key, V value)
    {
        return this.decorated.put(key, value);
    }

    @Override
    public V remove(Object key)
    {
        return this.decorated.remove(key);
    }

    @Override
    public Set entrySet()
    {
        return this.decorated.entrySet();
    }

}
