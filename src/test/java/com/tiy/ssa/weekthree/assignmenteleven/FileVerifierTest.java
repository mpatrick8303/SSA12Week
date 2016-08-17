package com.tiy.ssa.weekthree.assignmenteleven;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileVerifierTest
{
    String file = "C:/Users/admin/Downloads/eclipse-inst-win64.exe";

    @Test
    public void test()
    {
        FileVerifier fv = new FileVerifier("C:/Users/admin/Downloads/eclipse-inst-win64.exe" , "SHA-512");
        
          
        assertTrue(fv.hash().equals("21302bcf1d6d22ce3022af54f958649695afb84e38c8e640eafd7e64ba852ff3c13eae33db9e19affbc4e861341391143a40669da839c1bddcc8dea7240218e9"));
        
    }

}
