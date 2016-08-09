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

    public void setFirstN(String firstN)
    {
        this.firstN = firstN;
    }

    public String getLastN()
    {
        return lastN;
    }

    public void setLastN(String lastN)
    {
        this.lastN = lastN;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    
    public String getName()
    {
        
        return fullName;
    }
    
    
    
   
    
    
}
