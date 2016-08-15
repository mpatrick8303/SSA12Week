package InheritanceExamples;

public class Rectangle implements Shape //saying that a rectangle is a shape(implementing shape)
{
    //rectangle is called the super class or parent class
    //can have its own methods getWidth and getHeight and then methods that have to be there from the implementation (draw and area)
    
    protected int height, width; //Protected is package private plus sub-classes
    
    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }
    
    public int getWidth()
    {
        return this.width;
    }
    
    public int getHeight()
    {
        return this.height;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public void setHeight(int height)
    {
        this.height = height;
    }

    @Override
    public void draw()//
    {
        // TODO Auto-generated method stub
        
    }

    @Override//over ride here means you hare implementing the classes that are needed for shape
    public float area()
    {
        
        return getWidth() * getHeight();
    }
    
    
    
}
