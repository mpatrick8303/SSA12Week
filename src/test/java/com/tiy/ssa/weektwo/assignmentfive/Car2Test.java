package com.tiy.ssa.weektwo.assignmentfive;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class Car2Test
{
    
    List<Car2> cars = new ArrayList<>();

    
    @Before
    public void setup() // will run this code before running through each test
    {
        this.cars.add(new Car2(Model.Sentra, 35000,Car2.Color.blue));
        this.cars.add(new Car2(Model.Accord, 30000, Car2.Color.blue));
        this.cars.add(new Car2(Model.Camre, 35000, Car2.Color.blue));
        this.cars.add(new Car2(Model.R8, 75000, Car2.Color.red));
        this.cars.add(new Car2(Model.Q60, 70000, Car2.Color.red));
        this.cars.add(new Car2(Model.ModelS, 80000, Car2.Color.red));
        
    }
    

    
    
    @Test
    public void filterExpensive()
    {
        List<Car2> expensiveCars = carOverPrice(70000);
        assertEquals("cars over 70000", 3, expensiveCars.size());
        
    }
    
    @Test
    public void filterCheaper()
    {
        
        List<Car2> cheaperCars = carUnderPrice(50000);
        assertEquals("cars cheaper than 50000", 3, cheaperCars.size());
    }
    
    @Test
    public void blueCars()
    {
        carExcludeColors(Car2.Color.blue);
        assertEquals("cars that are blue", 3, this.cars.size());
    }
    
    @Test
    public void notBlueCars()
    {
        carIncludeColors(Car2.Color.blue);
        assertEquals("cars that are blue", 3, this.cars.size());
    }
    
    
    
    @After
    public void clear() //runs this after each test
    {
        this.cars.clear();
    }
    
    List<Car2> carOverPrice(int priceCheck)
    {
        List<Car2> expensiveCars = new ArrayList<>();
        
        for(Car2 c : cars)
        {
            if(c.getCost() >= priceCheck)
            {
                expensiveCars.add(c);
            }   
        }
        return expensiveCars;      
        
    }
    
    
    List<Car2> carUnderPrice(int priceCheck)
    {
        List<Car2> cheaperCars = new ArrayList<>();
        
        for(Car2 c : cars)
        {
            if(!(c.getCost()>priceCheck))
            {
                cheaperCars.add(c);
            }
        }
        return cheaperCars;
    }
    
    List<Car2> carExcludeColors(Car2.Color color)
    {
        for(Iterator<Car2> iterator = this.cars.iterator(); iterator.hasNext();)
        {
            Car2 next = iterator.next();//makes a new object of Car2 and sets it to the next element the iterator looks at
            if(next.getColor().equals(color))//looks at color in the next element 
            {
               iterator.remove();//removed that element that it is currently looking at
            }
        }
        
      //that way ^ expanded
     //  Iterator<Car2> iterator = this.cars.iterator();//creating a iterator calling it iterator and setting it to this.cars.iterator
        //allows you to go through each element of the arrayList one at a time
        //for(iterator.hasNext())//saying that the for loop stops when it has nothing next
       
        return cars;      
        
    
        
    }
    
    
    List<Car2> carIncludeColors(Car2.Color color)
    {
        
        for(Iterator<Car2> iterator = this.cars.iterator(); iterator.hasNext();)
        {
            Car2 next = iterator.next();
            if(!(next.getColor().equals(color)))
            {
                iterator.remove();
            }
        }
        return cars;
    }
    
    

}
