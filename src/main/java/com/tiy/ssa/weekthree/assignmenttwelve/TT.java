package com.tiy.ssa.weekthree.assignmenttwelve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TT
{
    private TTNode root; 
    
    public TT()
    {
        root = new TTNode();//setting root to a new instance of the object TTNode
    }
    
    public void addWord(String word)//adds a word to TT
    {
        root.addWord(word.toLowerCase());
    }
    
    public List<String> getWord(String prefix)
    {
        TTNode lastNode = root; //finds the node that represents the last letter of the prefix+
        
        
        for(int i = 0; i < prefix.length(); i++)
        {
            lastNode = lastNode.getNode(prefix.charAt(i));//loops through the prefix and gets the node that goes with each char in the prefix
            
            if(lastNode == null) //if no nodes match then it returns a empty list
                return new ArrayList<>();
        }
        
        return lastNode.getWord();//returns the words that come from the last node
    }
    
    public List<String> suggestions(String digits)
    {
        List<String> suggestions = new ArrayList<>();
        List<String> listOfPrefixes = new ArrayList<>();
        listOfPrefixes.addAll(getPrefixes(digits));
        
        for(int i = 0; i < listOfPrefixes.size();i++)
        {
            suggestions.addAll(getWord(getPrefixes(digits).get(i)));
        }
        
        return suggestions;
    }
    public List<String> getPrefixes(String digits)
    {
               
       List<String> listOfPrefix = new ArrayList<>();
       listOfPrefix.addAll(letterCombinations(digits));
       
       
       return listOfPrefix;
    }
   
   
     
   public List<String> letterCombinations(String digits) 
   {
       HashMap<Integer, String> map = new HashMap<Integer, String>();
       map.put(2, "abc");
       map.put(3, "def");
       map.put(4, "ghi");
       map.put(5, "jkl");
       map.put(6, "mno");
       map.put(7, "pqrs");
       map.put(8, "tuv");
       map.put(9, "wxyz");
    
       ArrayList<String> result = new ArrayList<String>();
    
       if(digits == null || digits.length() == 0)
           return result;
    
       ArrayList<Character> temp = new ArrayList<Character>();
       getPrefixString(digits, temp, result, map);
       
      
       return result;
   }
    
   public void getPrefixString(String digits, ArrayList<Character> temp, ArrayList<String> result,  HashMap<Integer, String> map)
   {
       if(digits.length() == 0)
       {
           char[] arr = new char[temp.size()];
           for(int i=0; i<temp.size(); i++)
           {
               arr[i] = temp.get(i);
           }
           result.add(String.valueOf(arr));
           return;
       }
    
       Integer curr = Integer.valueOf(digits.substring(0,1));
       String letters = map.get(curr);
       for(int i=0; i<letters.length(); i++){
           temp.add(letters.charAt(i));
           getPrefixString(digits.substring(1), temp, result, map);
           temp.remove(temp.size()-1);
       }
   }
    
    public void clear()
    {
        root = new TTNode();
        
    }
    
    public void contains(String word)
    {
        root.getWord().contains(word);
    }
    
    //have to add method that converts digit input into prefix
}
