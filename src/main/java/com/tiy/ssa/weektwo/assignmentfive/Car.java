package com.tiy.ssa.weektwo.assignmentfive;

public class Car
{

    private String model;
    private String color;
    private int cost;
     
     public Car(String model, String color,int cost)
     {

         this.model = model;
         this.color = color;
         this.cost = cost;
     }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getCost()
    {
        return cost;
    }

    public void setCost(int cost)
    {
        this.cost = cost;
    }


     
}
