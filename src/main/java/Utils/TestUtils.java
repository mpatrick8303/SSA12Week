package Utils;

import java.util.Collection;
import static org.junit.Assert.*;

public class TestUtils
{
    private TestUtils()
    {
        
    }
    //the first <T> is like declaring the generic variable
    public static <T> void membership(Collection<? extends T> expected, Collection<? extends T> actual)
    {
        assertTrue("",expected.containsAll(actual));
        assertEquals("",expected.size(), actual.size());
        
       

    }
}
