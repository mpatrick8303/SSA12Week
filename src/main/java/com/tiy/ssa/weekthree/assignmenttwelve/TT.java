package com.tiy.ssa.weekthree.assignmenttwelve;

import java.util.ArrayList;
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
