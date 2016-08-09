package com.tiy.ssa.weektwo.assignmentfive;

public class Car2
{
    private Model model;
    private int cost;
    private Color color;
     
     public Car2(Model model,int cost, Color color)
     {
         
         this.model = model;
         this.cost = cost;
         this.color = color;
     }
     
     public enum Color
     {
         blue,red,green,white,black
         
     }

   

    public Color getColor()
    {
        return this.color;
    }

    public Model getModel()
    {
        return model;
    }

    public void setModel(Model model)
    {
        this.model = model;
    }

    public int getCost()
    {
        return cost;
    }

    
    


}
