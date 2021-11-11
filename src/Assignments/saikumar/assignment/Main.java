package Assignments.saikumar.assignment;

public class Main {
    public static void main(String[] args) {
        data dataobj = new data();
        dataobj.printVariables();
        dataobj.printLocalVariables();
        singelton singeltonObj=singelton.setVariables("Set String variable");
        singeltonObj.printVariables();
    }
}
