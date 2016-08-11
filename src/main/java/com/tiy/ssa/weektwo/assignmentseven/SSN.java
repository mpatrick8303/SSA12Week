package com.tiy.ssa.weektwo.assignmentseven;

public class SSN
{
    private final String ssn;
    
    public SSN(String ssn)
    {
        this.ssn = ssn;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
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
        SSN other = (SSN) obj;
        if (ssn == null)
        {
            if (other.ssn != null)
                return false;
        }
        else if (!ssn.equals(other.ssn))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return ssn;
    }
    
    
}
