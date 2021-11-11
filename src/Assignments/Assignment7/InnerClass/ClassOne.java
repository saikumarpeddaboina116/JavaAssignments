package Assignments.Assignment7.InnerClass;

public class ClassOne {
    static int var;
    class InnerClassOne
    {
        InnerClassOne(int arg)
        {
            System.out.println("Constructor of Inner Class of Class One");
            var=arg;
        }
    }
}
