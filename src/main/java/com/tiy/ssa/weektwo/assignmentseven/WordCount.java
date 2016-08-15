package com.tiy.ssa.weektwo.assignmentseven;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WordCount
{
    /**
     * 
     * @param word
     *            callers are responsible for ensuring <code>word</code> <br>
     *            is an actual word, parsing is done by the caller
     */
    private Map<String, Integer> map = new HashMap<>();
    private List<String> paragraph = new ArrayList<>();

    public void addWord(String word)
    {
        word = word.toLowerCase();

        
        if(!(map.containsKey(word)))
        {
            map.put(word, 1);
            paragraph.add(word);
        }
        
        else if(map.containsKey(word))
        {
            map.replace(word, map.get(word).intValue(), map.get(word).intValue()+1);
            paragraph.add(word);
        }
       

    }

    public int count(String word)
    {
        
       return map.get(word).intValue();

        
    }

    /**
     *
     * @param many
     * @return a logical set of words ordered in descending popularity
     *         order, so top <code>many</code> words
     */
    public List<String> top(int many)
    {
        
        List<String> sortedWordsTop = new ArrayList<>();

        map.entrySet().stream()//creates a steam which runs a set of elements (entry set) through a number of functions one element at a time
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))//sorts the list by the value and then reverses it
        .forEachOrdered(e -> sortedWordsTop.add(e.getKey()));//for each element that is orders it adds it to linkedlist
        
        List<String> sortedWordsSub = sortedWordsTop.subList(0, many);
        
        return sortedWordsSub;
        
//      //int compare(entry a, entry b)
//      {
//        b.getValue() - a.getValue(); both work
//      }
//        
//        
////        myMap.entrySet().stream() example of stream
////        .sorted(Map.Entry.comparingByValue()) Map.Entry.comparingByValue(Comparator.reverseOrder()). to reverse
////        .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
//        
////        .forEachOrdered(e -> sortedWordsTop.add(e.getKey()));
    }


    public List<String> bottom(int many)
      {
        List<String> sortedWordsBottom = new ArrayList<>();
   
        map.entrySet().stream()//creates a steam which runs a set of elements (entry set) through a number of functions one element at a time
        .sorted(Map.Entry.comparingByValue())//
        .forEachOrdered(e -> sortedWordsBottom.add(e.getKey()));
        
        List<String> sortedWordsSubB = sortedWordsBottom.subList(0, many);
        
        return sortedWordsSubB;
        
//        //int compare(entry a, entry b)
//          {
//            a.getValue().compareTo(b.getValue);
//            a.getValue() - b.getValue(); both work
//          }
        //list.sorted(a,b) -> a.getValue - b.getValue)) lamba is faster 
        //Ascending for a list
    }


    public String source()
    {
        String words = "";  
        
        for(int i = 0; i < paragraph.size();i++)
        {
            words += paragraph.get(i) + " ";
        }
        return words;
    }

  

    @Override
    public String toString()
    {
        String words = "";  
        
        for(int i = 0; i < paragraph.size();i++)
        {
            words += paragraph.get(i) + " ";
        }
        return words;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((map == null) ? 0 : map.hashCode());
        result = prime * result + ((paragraph == null) ? 0 : paragraph.hashCode());
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
        WordCount other = (WordCount) obj;
        if (map == null)
        {
            if (other.map != null)
                return false;
        }
        else if (!map.equals(other.map))
            return false;
        if (paragraph == null)
        {
            if (other.paragraph != null)
                return false;
        }
        else if (!paragraph.equals(other.paragraph))
            return false;
        return true;
    }

    
    
  
    
    
    
}
