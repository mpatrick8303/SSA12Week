package com.tiy.ssa.weektwo.assignmentfive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Lists
{
   
    
    //return a new List<T> containing only elements that are both in #one and #other (i.e. are "equal") - but just make sure that the returned List<T> is a logical set
    public static <T> List<T> match(List<T> one, List<T> other)
    {
        List<T> matching = new ArrayList<>();
        Iterator<T> iterator = one.iterator();
        
        for(;iterator.hasNext();)
        {
            T next = iterator.next();
            if(other.contains(next) && (!matching.contains(next)))
            {
                matching.add(next);
            }
        }
        
        return matching;
    }
    
    //return a new List, ordered by the length of the input strings in descending order
    
    public static <T> List<T> matchHash(List<T> one, List<T> other)
    {
        Set<T> matching2 = new HashSet<>();
        Iterator<T> iterator = one.iterator();
        
       
        for(;iterator.hasNext();)
        {
            T next = iterator.next();
            if(other.contains(next))//don't need other statement bc sets will not add a duplicate element 
            {
                matching2.add(next);
            }
        }
        
        
        
        return new ArrayList<>(matching2);
    }
            
    public static List<String> descendingBySize(List<String> input)
    {

        
        
//        for(int i = 1; i < input.size()*(input.size()-1);i++)
//        {
//           if(input.get(i-1).length() < input.get(i).length())
//           {
//               String one = input.get(i-1);
//               String two = input.get(i);
//               input.add(i, one);
//               input.add(i-1, two);
//           }
//        }
//        
//        System.out.println(input.toString());
//        return input;
        
       
            List<String> sortedList = new ArrayList<>(input);
            sortedList.sort((s1, s2)-> -(s1.length()-s2.length()));
            //lambda (->) takes the inputs on the left side (s1,s2) 
            //and changed the sort function in the right side to make it sort by if s2 is less than s1
            return sortedList;

    }
}
