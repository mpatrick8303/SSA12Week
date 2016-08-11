package MapsExample;

import static org.junit.Assert.*;

import org.junit.Test;

import MapsExample.SocialSecurityNumber;

public class SocialSecurityNumberTest
{

    @Test
    public void last4()
    {
       assertEquals("", "1234", new SocialSecurityNumber("999991234").last4Digits());
       
    }

}
