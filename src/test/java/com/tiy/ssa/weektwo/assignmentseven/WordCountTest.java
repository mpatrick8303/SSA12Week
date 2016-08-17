package com.tiy.ssa.weektwo.assignmentseven;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class WordCountTest
{
    WordCount wordCount1;

//    static String SOURCE = "CONTENT CONTENT CONTENT CONTENT CONTENT CONTENT CONTENT OF OF OF OF WIKIPEDIA PARAGRAPHS PARAGRAPHS GO GO GO GO HERE HERE HERE OF";
    static String SOURCE = "A company is a military unit, typically consisting of 80–250 soldiers and usually commanded by a major or a captain. Most companies are formed of three to six platoons, although the exact number may vary by country, unit type, and structure. Several companies are grouped to form a battalion or regiment, the latter of which is sometimes formed by several battalions.Certain sub-units were raised as independent companies that reported to no higher unit headquarters.";
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
//        assertEquals("",5,wordCount.count("OF"));
//        assertEquals("",7,wordCount.count("CONTENT"));
//        assertEquals("",2,wordCount.count("PARAGRAPHS"));
//        assertEquals("",4,wordCount.count("GO"));
//        assertEquals("",3,wordCount.count("HERE"));
        
      assertEquals("",3,wordCount.count("unit"));
      assertEquals("",2,wordCount.count("formed"));
      assertEquals("",2,wordCount.count("several"));
      assertEquals("",1,wordCount.count("major"));
        
        
    }
    
    @Test
    public void testTop()
    {
//        assertEquals("",5,wordCount.top(5).size());
//        
//        assertEquals("","CONTENT",wordCount.top(5).get(0));
//        assertEquals("","OF",wordCount.top(5).get(1));
//        assertEquals("","GO",wordCount.top(5).get(2));
//        assertEquals("","HERE",wordCount.top(5).get(3));
//        assertEquals("","PARAGRAPHS",wordCount.top(5).get(4));
        
        assertEquals("",4,wordCount.top(4).size());
        
        assertTrue("",wordCount.top(6).contains("unit"));
        assertTrue("",wordCount.top(6).contains("a"));
        assertTrue("",wordCount.top(6).contains("of"));
        assertTrue("",wordCount.top(6).contains("by")); 
        assertTrue("",wordCount.top(6).contains("companies")); 
        
        
        
    }
    
    @Test
    public void testBottom()
    {
//        assertEquals("",5,wordCount.bottom(5).size());
//        
//        assertEquals("","WIKIPEDIA", wordCount.bottom(5).get(0) );
//        assertEquals("","PARAGRAPHS", wordCount.bottom(5).get(1) );
//        assertEquals("","HERE", wordCount.bottom(5).get(2) );
//        assertEquals("","GO", wordCount.bottom(5).get(3) );
//        assertEquals("","OF", wordCount.bottom(5).get(4) );
        
        assertEquals("",7,wordCount.bottom(7).size());
        assertTrue(wordCount.bottom(8).contains("commanded"));
        assertTrue(wordCount.bottom(8).contains("country"));
        assertTrue(wordCount.bottom(8).contains("vary"));
        assertTrue(wordCount.bottom(8).contains("sometimes"));
        assertTrue(wordCount.bottom(8).contains("type"));
        assertTrue(wordCount.bottom(8).contains("three"));

        
        
        
        
    }
    
    @Test
    public void testSource()
    {
        assertEquals("a company is a military unit typically consisting of 80 250 soldiers and usually commanded by a major or a captain most companies are formed of three to six platoons although the exact number may vary by country unit type and structure several companies are grouped to form a battalion or regiment the latter of which is sometimes formed by several battalions certain sub units were raised as independent companies that reported to no higher unit headquarters ",wordCount.source());
    }
    
    
    

    
    
}
