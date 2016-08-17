package com.tiy.ssa.weekthree.assignmenteleven;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1FileVerifierCheck
{
    File file;
    final MessageDigest sha1;

    public SHA1FileVerifierCheck() throws IllegalArgumentException
    {
        try
        {
            this.sha1 = MessageDigest.getInstance("SHA-1");
        }
        catch (NoSuchAlgorithmException ex)
        {
            throw new IllegalArgumentException("SHA-1 is not a valid cypher");
        }
    }

}
