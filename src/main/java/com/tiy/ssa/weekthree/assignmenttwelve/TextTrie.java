package com.tiy.ssa.weekthree.assignmenttwelve;

import java.util.ArrayList;
import java.util.List;

public abstract class TextTrie
{
    private TrieNode root;
    
    public TextTrie()
    {
        TrieNode root = new TrieNode();
    }
    
    
    /**
     *  adds a word to this tries "dictionary"
     */
     abstract void addWord(String word);

     abstract boolean contains(String word);

     abstract boolean remove(String word);

     abstract void clear();
     /**
     * @ return a 'logical' set of words in ascending lexical order
     */
     
     protected List getWords(String prefix)
     {
         TrieNode lastNode = root;
         for(int i = 0; i<prefix.length();i++)
         {
             lastNode = lastNode.getNode(prefix.charAt(i));
             
             if(lastNode == null)
                 return new ArrayList();
         }
         
         return lastNode.suggest()
         
     }


    List suggest()
    {
        // TODO Auto-generated method stub
        return null;
    }
}
