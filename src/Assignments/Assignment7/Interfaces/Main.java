package Assignments.Assignment7.Interfaces;

public class Main {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.methodOne(childObj);
        childObj.methodTwo(childObj);
        childObj.methodOne(childObj);
        childObj.methodThree(childObj);
        childObj.methodFour(childObj);
        childObj.iOneMethodOne();
        childObj.iOneMethodTwo();
        childObj.iTwoMethodOne();
        childObj.iTwoMethodTwo();
        childObj.iThreeMethodOne();
        childObj.iThreeMethodTwo();
        childObj.iFourMethodOne();
    }
}
