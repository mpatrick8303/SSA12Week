package com.tiy.ssa.weekthree.assignmenteleven;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

public class FileVerifier
{
    public static void main(String[] arg) throws NoSuchAlgorithmException
    {
        String f = "";
        String algs = "";
        
        for(int i = 0; i<arg.length;i++)
        {
            if(arg[i].equals("-f"))
                f=arg[i+1].toLowerCase();
            if(arg[i].equals("-alg"))
                algs = arg[i+1].toLowerCase();
        }
        FileVerifier fv = new FileVerifier(f, algs);
        System.out.println(fv.hash());
        
        
    }
    
    
    String file;
    MessageDigest md;
    
    
    public FileVerifier(String file, String hex)
    {
        this.file = file;
        
        try 
        {
            md = MessageDigest.getInstance(hex);
        }

        catch (Exception e) 
        {
            throw new IllegalArgumentException(hex + "is not a valid argument");
        }
    }
  
    public String hash() 
    {
        String hex ="";
        byte[] bytes = new byte[1_024];
        
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file)))
        {
            int read;
            while ((read = inputStream.read(bytes)) > 0)
            {
                this.md.update(bytes, 0, read);
            }
            byte[] digest = this.md.digest();
            hex = toHex(digest);
            return hex;
            
        }
        catch(Exception ex)
        {
            
        }
        return "";
        
        
        
        
                 

    }
    
    public String toHex(byte[] digest)
    {

        
        StringBuilder sb = new StringBuilder(digest.length *2);
        
        Formatter formatter = new Formatter(sb);
        for(byte b : digest)
        {
            formatter.format("%02x", b);
        }
        return sb.toString();
        
        
    }
}
