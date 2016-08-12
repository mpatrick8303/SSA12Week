package com.tiy.ssa.weektwo.assignmenteight;

import java.util.Comparator;

class AgeComparator implements Comparator<Person> 
{
    @Override
    public int compare(Person a, Person b) {
        return a.age() -  (b.age());
    }
}
