package com.tiy.ssa.weektwo.assignmenteight;

public class Name
{
    final String firstN, lastN;
   
    
    public Name(String firstN, String lastN)
    {
        this.firstN = firstN;
        this.lastN= lastN;
        
    }

    public String getFirstN()
    {
        return firstN;
    }

    public String getLastN()
    {
        return lastN;
    }
    
  

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstN == null) ? 0 : firstN.hashCode());
        result = prime * result + ((lastN == null) ? 0 : lastN.hashCode());
        return result;
    }

    @Override//need this so you can check to see if 
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Name other = (Name) obj;
        if (firstN == null)
        {
            if (other.firstN != null)
                return false;
        }
        else if (!firstN.equals(other.firstN))
            return false;
        if (lastN == null)
        {
            if (other.lastN != null)
                return false;
        }
        else if (!lastN.equals(other.lastN))
            return false;
        return true;
    }
    
    
}
