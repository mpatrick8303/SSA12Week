package com.tiy.ssa.weektwo.assignmentsix;

import java.util.Collection;
import java.util.HashSet;

public class User
{
    private String firstN, lastN, fullName;
    private int age;
    private String name;
    
    public User(String firstN, String lastN, int age)
    {
        this.firstN = firstN;
        this.lastN = lastN;
        this.fullName = firstN + lastN;
        this.age = age;
    }

    public String getFirstN()
    {
        return firstN;
    }

    public String getLastN()
    {
        return lastN;
    }

    public int getAge()
    {
        return age;
    }
    
    public String getName()
    {
        
        return fullName;
    }

    @Override
    public String toString()
    {
        return "[ User Name " + firstN + " " + lastN + ", age=" + age + "]";
    }

    
    
    
    
    
    
    
   
    
    
}
