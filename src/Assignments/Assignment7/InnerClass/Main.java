package Assignments.Assignment7.InnerClass;

public class Main {
    public static void main(String[] args) {
        ClassOne obj=new ClassOne();
        ClassOne.InnerClassOne objI=obj.new InnerClassOne(100);
    ClassTwo objT=new ClassTwo();
    ClassTwo.ClassTwoInner objTI = objT.new ClassTwoInner();
   objTI.getNumber();

    }
}
