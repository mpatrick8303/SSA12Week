package com.tiy.ssa.weektwo.assignmentsix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.DecimalFormat;
import java.util.Collection;
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
        users.add(new User("Dan", "Martin", 225));
        users.add(new User("Travis", "Adams", -21));

        users.add(new User("Les", "Emerson", 15));
        users.add(new User("Ryan", "Hiner", 10));
        users.add(new User("Hayden", "Lucke", 13));
        users.add(new User("Brett", "Garver", -9));

    }

    @Test
    public void testAge()
    {
        Collection<Name> names = children(users);

        assertEquals(4, names.size());
        assertFalse(names.contains(new Name("Michael", "Patrick")));
        assertFalse(names.contains(new Name("Andy", "Miller")));
        assertFalse(names.contains(new Name("Dan", "Martin")));
        assertTrue(names.contains(new Name("Les", "Emerson")));
        assertTrue(names.contains(new Name("Ryan", "Hiner")));
        assertTrue(names.contains(new Name("Hayden", "Lucke")));
        
        System.out.println(users.toString());

    }

    @Test
    public void testAvg()
    {
        assertEquals(74.75f, adultAverageAge(users), .05);
    }

    static Collection<Name> children(Collection<? extends User> users)
    {
        Collection<Name> names = new HashSet<>();

        for (User u : users)
        {
            int age;
            if (u.getAge() < 0)// assuming if they put in a negative number for age that they made a mistake        
                age = u.getAge() * (-1);
            else
                age = u.getAge();

            if (age < 16)
            {
                names.add(new Name(u.getFirstN(), u.getLastN()));
            }
        }

        return names;
    }

    static float adultAverageAge(Collection<? extends User> users)
    {
        int age;
        float avg;
        float sum = 0;
        int i = 0;

        for (User u : users)
        {
            if (u.getAge() < 0)
                age = u.getAge() * (-1);
            else
                age = u.getAge();

            if (age > 16)
            {
                sum += age;
                i++;
            }

        }
        avg = (sum / i);
        DecimalFormat df = new DecimalFormat("#.##");
        df.format(avg);     
        
        return avg;

    }

    @After
    public void clear()
    {
        this.users.clear();

    }

}
