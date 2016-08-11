package com.tiy.ssa.weektwo.assignmentseven;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WordCountTest
{
    WordCount wordCount1;

    static String SOURCE = "CONTENT CONTENT CONTENT CONTENT CONTENT CONTENT CONTENT OF OF OF OF WIKIPEDIA PARAGRAPHS PARAGRAPHS GO GO GO GO HERE HERE HERE OF";
    WordCount wordCount = new WordCount();
    
    
    @Before
    public void parse()
    {
        String[] words = SOURCE.split("\\W+"); //should take care of punctuation and other special 
                                               //characters
        for (String word : words)
        {
            this.wordCount.addWord(word);
        }

    }
    
    @Test
    public void testCount()
    {
        assertEquals("",5,wordCount.count("OF"));
        assertEquals("",7,wordCount.count("CONTENT"));
        assertEquals("",2,wordCount.count("PARAGRAPHS"));
        assertEquals("",4,wordCount.count("GO"));
        assertEquals("",3,wordCount.count("HERE"));
        
        
    }
    
    @Test
    public void testTop()
    {
        assertEquals("",5,wordCount.top(5).size());
        
        assertEquals("","CONTENT",wordCount.top(5).get(0));
        assertEquals("","OF",wordCount.top(5).get(1));
        assertEquals("","GO",wordCount.top(5).get(2));
        assertEquals("","HERE",wordCount.top(5).get(3));
        assertEquals("","PARAGRAPHS",wordCount.top(5).get(4));
       
        
        
        
    }
    
    @Test
    public void testBottom()
    {
        assertEquals("",5,wordCount.bottom(5).size());
        
        assertEquals("","WIKIPEDIA", wordCount.bottom(5).get(0) );
        assertEquals("","PARAGRAPHS", wordCount.bottom(5).get(1) );
        assertEquals("","HERE", wordCount.bottom(5).get(2) );
        assertEquals("","GO", wordCount.bottom(5).get(3) );
        assertEquals("","OF", wordCount.bottom(5).get(4) );
        
        
        
        
    }
    
    
    

    
    
}
