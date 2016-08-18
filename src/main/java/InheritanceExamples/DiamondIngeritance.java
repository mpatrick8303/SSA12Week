package InheritanceExamples;

public class DiamondIngeritance implements Goo, Hoo
{
    
    @Override
    public boolean isHappy()
    {
        return Goo.super.isHappy(); // have to put goo.super to tell java which interface to pull forom
    }

}
