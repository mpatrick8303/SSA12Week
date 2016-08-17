package com.tiy.ssa.weekthree.assignmenteleven;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1FileVerifier 
{
    String file;
    MessageDigest md;
    
    public SHA1FileVerifier(String file, String hex)
    {
        this.file = file;
    }
    
    @Override
    public String hash() 
    {
        byte[] bytes = new byte[1_024];
        
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file)))
        {
            int read;
            while ((read = inputStream.read(bytes)) > 0)
            {
                this.md.update(bytes, 0, read);
            }
            byte[] digest = this.md.digest();
            toHex(digest);
            return toHex(digest);
        }
        catch(Exception ex)
        {
            
        }
        return "";
                 

    }

   


//    
//    MessageDigest md = MessageDigest.getInstance("SHA");
//    
//    try
//    {
//        md.update(toChapter1);
//        MessageDigest tc1 = md.clone();
//        byte[] toChapter1Digest = tc1.digest();
//        md.update(toChapter2);
//        
//    }
//    catch(CloneNotSupportedException cnse)
//    {
//        throw new DigestException("couldn't make digest of partial content");
//    }

}
