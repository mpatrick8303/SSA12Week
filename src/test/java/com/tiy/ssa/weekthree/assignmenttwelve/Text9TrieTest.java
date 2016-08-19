package com.tiy.ssa.weekthree.assignmenttwelve;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

public class Text9TrieTest
{

    Text9Trie  dictionary;
    
    @Before
    public void setup() throws Exception
    {
    dictionary = new Text9Trie();
    BufferedReader reader = null;//creating a buffered reader
    try {
        reader = Files.newBufferedReader(Paths.get("C:/Users/admin/resources/corncob_lowercase.txt"),Charset.defaultCharset());//reading the file given by the default char set
        String line;
        while (null != (line = reader.readLine())) //setting line = to the reader on the line that it is on then adding words by triming each one in the line
        { 
            this.dictionary.addWord(line.trim());
        }
    } catch (IOException iex) {
        System.err.println(iex);
    } finally {
        reader.close();
    }
    }
    
    @Test  
    public void testTTPrefix()
    {

        assertTrue(dictionary.getWord("app").contains("apple"));
        assertTrue(dictionary.getWord("app").contains("appetising"));
        assertTrue(dictionary.getWord("app").contains("appetite"));
        assertTrue(dictionary.getWord("app").contains("appetites"));
        assertTrue(dictionary.getWord("app").contains("applaud"));
        assertTrue(dictionary.getWord("app").contains("applauded"));
        assertTrue(dictionary.getWord("app").contains("applauding"));
        
        assertTrue(dictionary.getWord("appl").contains("apple"));
    }
    
    @Test
    public void clearTest()
    {
        dictionary.clear();
        assertFalse(dictionary.getWord("app").contains("apple"));
        
        
    }
    
    @Test
    public void addWordTest()
    {
        dictionary.clear();
        dictionary.addWord("apple");
        assertTrue(dictionary.getWord("app").contains("apple"));
    }
    
    @Test
    public void getPrefixesTest()
    {
        assertTrue("",dictionary.getPrefixes("277").contains("app"));
        assertTrue("",dictionary.getPrefixes("277").contains("apq"));
        assertTrue("",dictionary.getPrefixes("277").contains("asp"));
        assertTrue("",dictionary.getPrefixes("277").contains("bps"));
        assertTrue("",dictionary.getPrefixes("277").contains("cqr"));
        assertTrue("",dictionary.getPrefixes("277").contains("asq"));
        assertTrue("",dictionary.getPrefixes("277").contains("css"));
        assertTrue("",dictionary.getPrefixes("277").contains("arr"));
        
        assertFalse("",dictionary.getPrefixes("277").contains("lkp"));
        assertFalse("",dictionary.getPrefixes("277").contains("add"));
        assertFalse("",dictionary.getPrefixes("277").contains("red"));
        assertFalse("",dictionary.getPrefixes("277").contains("tgf"));
        
        
    }
    
    @Test
    public void suggestionsTest()
    {
        assertTrue("",dictionary.suggestions("277").contains("apple"));
        assertTrue("",dictionary.suggestions("277").contains("apparel"));
        assertTrue("",dictionary.suggestions("277").contains("apportioning"));
        assertTrue("",dictionary.suggestions("277").contains("arrow"));
        assertTrue("",dictionary.suggestions("277").contains("arrowhead"));
        assertTrue("",dictionary.suggestions("277").contains("assembly"));
        assertTrue("",dictionary.suggestions("277").contains("assumptions"));
        assertTrue("",dictionary.suggestions("277").contains("ass"));
        
        
        assertFalse("",dictionary.suggestions("277").contains("abduction"));
        assertFalse("",dictionary.suggestions("277").contains("people"));
        assertFalse("",dictionary.suggestions("277").contains("asshole"));
        assertFalse("",dictionary.suggestions("277").contains("lip"));
        
        
        
    }
}
    
