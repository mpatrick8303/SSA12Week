package InheritanceExamples;

public interface Goo
{
    default boolean isHappy()
    {
        return false;
    }
}
