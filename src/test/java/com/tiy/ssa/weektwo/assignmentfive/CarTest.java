package com.tiy.ssa.weektwo.assignmentfive;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class CarTest
{
    
    List<Car> cars = new ArrayList<>();

    
    @Before
    public void setup() // will run this code before running through each test
    {
        this.cars.add(new Car("Nissan Sentra", "blue", 35000));
        this.cars.add(new Car("Honda Accord", "blue", 30000));
        this.cars.add(new Car("Toyota Camre", "blue", 35000));
        this.cars.add(new Car("Audi R8", "red", 75000));
        this.cars.add(new Car("Infinity Q60", "red", 70000));
        this.cars.add(new Car("Tesla Model S", "red", 80000));
        
    }
    

    
    
    @Test
    public void filterExpensive()
    {
        List<Car> expensiveCars = carOverPrice(70000);
        assertEquals("cars over 70000", 3, expensiveCars.size());
        
    }
    
    @Test
    public void filterCheaper()
    {
        
        List<Car> cheaperCars = carUnderPrice(50000);
        assertEquals("cars cheaper than 50000", 3, cheaperCars.size());
    }
    
    @Test
    public void blueCars()
    {
        carExcludeColors("blue");
        assertEquals("cars that are blue", 3, this.cars.size());
    }
    
    @Test
    public void notBlueCars()
    {
        carIncludeColors("blue");
        assertEquals("cars that are blue", 3, this.cars.size());
    }
    
    
    
    @After
    public void clear() //runs this after each test
    {
        this.cars.clear();
    }
    
    List<Car> carOverPrice(int priceCheck)
    {
        List<Car> expensiveCars = new ArrayList<>();
        
        for(Car c : cars)
        {
            if(c.getCost() >= priceCheck)
            {
                expensiveCars.add(c);
            }   
        }
        return expensiveCars;      
        
    }
    
    
    List<Car> carUnderPrice(int priceCheck)
    {
        List<Car> cheaperCars = new ArrayList<>();
        
        for(Car c : cars)
        {
            if(!(c.getCost()>priceCheck))
            {
                cheaperCars.add(c);
            }
        }
        return cheaperCars;
    }
    
    List<Car> carExcludeColors(String color)
    {
        for(Iterator<Car> iterator = this.cars.iterator(); iterator.hasNext();)
        {
            Car next = iterator.next();//makes a new object of car and sets it to the next element the iterator looks at
            if(next.getColor().equals(color))//looks at color in the next element 
            {
               iterator.remove();//removed that element that it is currently looking at
            }
        }
        
      //that way ^ expanded
     //  Iterator<Car> iterator = this.cars.iterator();//creating a iterator calling it iterator and setting it to this.cars.iterator
        //allows you to go through each element of the arrayList one at a time
        //for(iterator.hasNext())//saying that the for loop stops when it has nothing next
       
        return cars;      
        
    
        
    }
    
    
    List<Car> carIncludeColors(String color)
    {
        
        for(Iterator<Car> iterator = this.cars.iterator(); iterator.hasNext();)
        {
            Car next = iterator.next();
            if(!(next.getColor().equals(color)))
            {
                iterator.remove();
            }
        }
        return cars;
    }

}
