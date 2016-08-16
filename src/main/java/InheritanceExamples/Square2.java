package InheritanceExamples;

public class Square2 implements Shape 
{
    //int sides;    
    final Rectangle rectangle;

    public Square2(int side)
    {
       
        this.rectangle = new Rectangle(side,side); //makes a new instance of the rectangle class so you can use some of the methods in rectangle
    }

    @Override
    public void draw()
    {
        this.rectangle.draw();
        
    }

    @Override
    public float area()
    {
        return rectangle.area();
    }
    
    public void setSides(int side)
    {
        
        this.rectangle.setHeight(side);
        this.rectangle.setWidth(side);
    }
    
    public int getSides()
    {
        return rectangle.getHeight();
    }
    
    

}
