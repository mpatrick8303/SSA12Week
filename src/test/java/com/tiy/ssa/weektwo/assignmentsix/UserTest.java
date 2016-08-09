package com.tiy.ssa.weektwo.assignmentsix;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserTest
{

    Set<User> users = new HashSet<>();

    @Before
    public void settup()
    {
        users.add(new User("Michael", "Patrick", 23));
        users.add(new User("Andy", "Miller", 30));
        users.add(new User("Dan", "Martin", 26));
        users.add(new User("Les", "Emerson", 15));
        users.add(new User("Ryan", "Hiner", 10));
        users.add(new User("Hayden", "Lucke", 13));

    }

    @Test
    public void testAge()
    {
        Collection<Name> names = children(users);

        assertEquals(3, names.size());
        assertFalse(names.contains(new Name("Michael", "Patrick")));
        assertFalse(names.contains(new Name("Andy", "Miller")));
        assertFalse(names.contains(new Name("Dan", "Martin")));
        assertTrue(names.contains(new Name("Les", "Emerson")));
        assertTrue(names.contains(new Name("Ryan", "Hiner")));
        assertTrue(names.contains(new Name("Hayden", "Lucke")));

    }
    
    @Test
    public void testAvg()
    {
        assertEquals(26.33f, adultAverageAge(users), .01);
    }

    static Collection<Name> children(Collection<? extends User> users)
    {
        Collection<Name> names = new HashSet<>();

        for (User u : users)
        {
            if (u.getAge() < 16)
            {
                names.add(new Name(u.getFirstN(), u.getLastN()));
            }
        }

        return names;
    }

    static float adultAverageAge(Collection<? extends User> users)
    {

        float avg;
        float sum = 0;
        int i = 0;

        for (User u : users)
        {
            if (u.getAge() > 16)
            {
                sum += u.getAge();
                i++;
            }

        }
        avg = sum / i;

        return avg;

    }

    @After
    public void clear()
    {
        this.users.clear();

    }

}
