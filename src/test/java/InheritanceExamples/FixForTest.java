package InheritanceExamples;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class FixForTest
{
    Iterator<String> theIterator;

    @Before
    public void setupIterator()
    {
        this.theIterator = Arrays.asList("it's", "the", "end").iterator();
    }
    @Test
    public void test()
    {
        for(String s : new FixFor<>(theIterator))//send the iterator to ^ the FixFor constructor which is then set to decorated
        {
            System.err.println(s);
        }
    }

}
