package Assignments.saikumar.assignment;

public class data {
    int intVar;
    char charVar;
    public void printVariables()
    {
        //method to print unintiailzed data members
        System.out.println("Integer variable value : "+intVar);
        System.out.println(" Character variable value :" + charVar);
    }

    public void printLocalVariables()
    {
      int intVar;
        char charVar;
      /*  System.out.println("Local Integer variable value : "+intVar);
        System.out.println("Local Character variable value :" + charVar);
        */
        //Local variables are not defaultly intialized.
    }
}
