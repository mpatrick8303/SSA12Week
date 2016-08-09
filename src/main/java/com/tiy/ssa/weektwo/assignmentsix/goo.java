package com.tiy.ssa.weektwo.assignmentsix;

public class goo
{
    final String name;
    
    public goo(String name)
    {
        this.name = name;
    }

    @Override
    public int hashCode()//if you comment this out it will also fail becuase if two thigns are equal there hashcode have to be equal
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        goo other = (goo) obj;
        if (name == null)
        {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        return true;
    }
    
    
}
