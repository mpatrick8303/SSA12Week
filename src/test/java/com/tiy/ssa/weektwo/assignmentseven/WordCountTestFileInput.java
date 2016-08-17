package com.tiy.ssa.weektwo.assignmentseven;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;

public class WordCountTestFileInput
{
    WordCount counter = new WordCount();

    @Test
    public void justChecking() throws Exception
    {
        BufferedReader reader = null;
        try
        {
            reader = Files.newBufferedReader(Paths.get("C:/Users/admin/resources/the-complete-works.txt"), Charset.defaultCharset());//reading the file
            
            String line;
            int i = 0;
            while(null != (line = reader.readLine()) && i++ < 130_000)
            {
                
                String [] words = line.split("\\W+");//Splitting the words by spaces and then adding them to the map
                for(String word : words)
                {
                    if(!word.isEmpty())
                    {
                        this.counter.addWord(word);
                    }
                }
                                               
            }
            List<String> top = this.counter.top(20);
            System.err.println(top);
        }
        
        catch(IOException iex)
        {
            System.err.println(iex);
        }
        finally//will run no matter if there is an exception or not
        {
            if(null != reader)
                reader.close();
            
        }
        
        System.err.println(this.counter.bottom(25));
        assertTrue("", this.counter.count("juliet") > 10);
    }
    


}
