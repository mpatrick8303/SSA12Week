package InheritanceExamples;

import java.util.Iterator;

public class FixFor<T> implements Iterator<T>, Iterable<T> // can implement multiple classes
{
    //your bringing in iterable so that you can make it possible to run the advanced for loop with an iterator using 
    
    //Iterator<String>iOverString
    //(String s : new FixFor(iOverString)
    
    final Iterator<T> decorated;

    public FixFor(Iterator<T> decorated)
    {
        this.decorated = decorated;//gets the elements from the iterator that are sent into the constructor
    }
    
    @Override
    public boolean hasNext()
    {
       return this.decorated.hasNext();//decorated is doing the work of the iterator(implementing iterable)
       //makes an iterator automatically iterable 
    }
    
    @Override
    public T next()
    {
        return this.decorated.next();
    }
    
    @Override
    public Iterator<T> iterator()
    {
        return this;//bc the adva
    }
    
    @Override
    public void remove()
    {
        this.decorated.remove();
    }
    
    
    
}
