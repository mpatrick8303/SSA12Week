package com.tiy.ssa.weektwo.assignmenteight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Person
{
    final Name name;
    final SocialSecurityNumber ssn;
    Person parentI, parentII;
    LocalDate birth, death;
    final List<Person> children = new ArrayList<>();



    public Person(Name name, SocialSecurityNumber ssn)
    {
        this.name = name;
        this.ssn = ssn;
    }

    public Name getName()
    {
        return this.name;
    }

    public SocialSecurityNumber getSsn()
    {
        return this.ssn;
    }

    public Person getParentI()
    {
        return this.parentI;
    }

    public Person getParentII()
    {
        return this.parentII;
    }

    public LocalDate getBirth()
    {
        return this.birth;
    }

    public LocalDate getDeath()
    {
        return this.death;
    }

    public void setParentI(Person parentI)
    {
        this.parentI = parentI;
    }

    public void setParentII(Person parentII)
    {
        this.parentII = parentII;
    }

    public void setBirth(LocalDate birth)
    {
        this.birth = birth;
    }

    public void setDeath(LocalDate death)
    {
        this.death = death;
    }


    public boolean addChild(Person person)
    {
        if (this.children.contains(person))
            return false;
        if (person.parentI == null)
            person.parentI = this;
        else if (person.parentII == null)
            person.parentII = this;
        else if (! person.parentI.equals(this) && ! person.parentII.equals(this))
            return false; //
        this.children.add(person);
        return true;
    }

    public int addChildren(Collection<? extends Person> children)
    {
        int successes = 0;
        for (Person child : children)
        {
            if (addChild(child))
                successes++;
        }
        return successes;
    }

    public List<Person> getChildren()
    {
        return new ArrayList<>(this.children);
    }

    public int age()
    {
        LocalDate now = LocalDate.now();
        int diff = now.getYear() - this.birth.getYear();
        return now.getDayOfYear() >= this.birth.getDayOfYear() ? diff : --diff;
    }

    public boolean isAlive()
    {
        return null == this.death;
    }
    
    public boolean hasParents()
    {
        if(this.parentI == null && this.parentII == null)
        {
            return false;
        }
        return true;
    }
    


    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((birth == null) ? 0 : birth.hashCode());
        result = prime * result + ((death == null) ? 0 : death.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((parentI == null) ? 0 : parentI.hashCode());
        result = prime * result + ((parentII == null) ? 0 : parentII.hashCode());
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
        Person other = (Person) obj;
        if (birth == null)
        {
            if (other.birth != null)
                return false;
        }
        else if (!birth.equals(other.birth))
            return false;
        if (death == null)
        {
            if (other.death != null)
                return false;
        }
        else if (!death.equals(other.death))
            return false;
        if (name == null)
        {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (parentI == null)
        {
            if (other.parentI != null)
                return false;
        }
        else if (!parentI.equals(other.parentI))
            return false;
        if (parentII == null)
        {
            if (other.parentII != null)
                return false;
        }
        else if (!parentII.equals(other.parentII))
            return false;
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
        return String.format("%s (%s)", this.name, this.ssn);
    }

    public int compareTo(Person p2)
    {
        // TODO Auto-generated method stub
        return 0;
    }
}
