package InheritanceExamples;

public class Square extends Rectangle //this is an inheritance saying a square is a rectangle
{


//    public Square(int height, int width) this will work but other one is easier
//    {
//        super(height, width);
//        
//        if(super.height != super.width)
//        {
//            super.height = super.width;
//        }
//       
//    }
    
    public Square(int side)
    {
        super(side,side);//this is how you invoke a constructor from a super class. Have to invoke the super class constructor 
    }

    @Override
    public void draw()
    {
        // TODO Auto-generated method stub
        //this.getHeight()can grab the methods from rectangle
        super.draw();
    }

    @Override
    public float area()//Don't need these if you extend bc it has this from the ones already built in rectangle
    {
        return super.area();
    }

    @Override
    public void setWidth(int width)
    {
//       this.width = width;
//       this.height = width;
        
        super.setHeight(width);
        super.setWidth(width);
    }

    @Override
    public void setHeight(int height)
    {
//        this.height = height;
//        this.width = height;
        
        setWidth(height); //calls the method setHeight within the square class and no the rectangle
    }
    
    
    
    //if it's a class you use extends
    //square is called a sub-class or child
    //over riding when written here means you are not going to use the parent classes method
    
    //super. calls the same code from a method in the super/parent class
    
    //subclass A(square) is-a superclass B(rectangle)
    //expanding the API(saying that whatever the API is in rectangle is what is available in square)
    //can overwrite it just can't change API(such as switch a method from public to private
    
    
}
