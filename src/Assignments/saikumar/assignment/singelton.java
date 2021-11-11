package Assignments.saikumar.assignment;

public class singelton {
   String stringVar;
    public static singelton setVariables(String stringVar)
    {
        //this.stringVar =stringVar;
        // ERROR : java: non-static variable this cannot be referenced from a static context
        /* As the static methods can access only static variables , data members can be accessed through objects or class reference
         Data members are instantiated after object creation whereas static methods are loaded during the loading of class.*/
        return new singelton();
    }
    public void printVariables()
    {
        System.out.println(stringVar);
    }
}
