package com.tiy.ssa.weekthree.assignmenttwelve;

import java.util.ArrayList;
import java.util.List;

public class TTNode
{
    private TTNode parent;//holds the parent current node / parent
    private TTNode[] children;//holds the children of the current parents node
    private boolean anyChildren; // checks if any children exist
    private boolean lastChar; //the last char of a word
    private char character; //the char the node represents
    
    public TTNode()//construct the top level root node
    {
        children = new TTNode[26]; //creating a new children node for the root parent that hold 26 char (alpha)
        anyChildren = true; //saying this node does have children
        lastChar = false;//saying this is not the last char of the word
    }
    
    public TTNode(char character)//constructor for the child node
    {
        this();// calls the previous constructor 
        this.character = character; //sets the character that this child node represents
    }
    
    //adds a word to this node
    //is called recursively to add each child node for each successive
    //letter in the word
    
    //goes through the word and adds letter by letter each next one being the child of the the last one. Creating a giant tree for all of the words added
    public void addWord(String word)
    {
        anyChildren = false;
        int charPos = word.charAt(0) - 'a';//getting what position the child should be added by taking the current character and - it by the value of the character 'a'(96)
//        System.out.println(charPos);
        
        if(children[charPos] == null)//seeing if there are any children left of the word in that specific spot
        {
            children[charPos] = new TTNode(word.charAt(0));//adding the charector grabbed in the next if and adding it to the child node -- calls the second constructor to create a child
            children[charPos].parent = this;//setting the parent equal to this char now
        }
        
        if(word.length() > 1)//checking if there still more of the word left
        {
            children[charPos].addWord(word.substring(1));//grabbing the next letter in the word once the previous letter has been added ass a child and then set to the parent by calling the function again to add the letter to the child node
        }
        else
        {
            children[charPos].lastChar = true;//saying that its the end of the word
        }
        
        
    }
    
    //returns the child TrieNode representing the given char or null if it doesnt exist
    public TTNode getNode(char c)
    {
        return children[c - 'a']; //returning the node that goes with this char by taking the current char and - it by the value of the char 'a' giving something between 0-26
    }
    
    public List<String> getWord()
    {
        List<String> list = new ArrayList<>(); //creating new list to return
        
        if(lastChar) //checks to see if this node is the last char in a word 
        {
            list.add(toString());//if so it adds it to the list
        }
        
        if(!anyChildren)//checks to see if there are any children
        {
            for(int i = 0; i < children.length; i++)
            {
                if(children[i] != null)//loops through the children word and adds all the words that belong to it
                {
                    list.addAll(children[i].getWord());
                }
            }
        }
        return list;
    }
    
    //gets the the string that this node represents
    //goes up the line from this children node to its parents and next parents till its at the root
    public String toString()
    {
        if(parent == null)
        {
            return "";
        }
        else
        {
            return parent.toString() + new String(new char[] {character});
        }
        
    }
    
}
