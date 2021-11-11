package Assignments.Assignment7.Interfaces;

public class Child extends Concrete implements InterfaceFour{
    @Override
    public void iOneMethodOne() {
        System.out.println("Interface One Method One");
    }
    @Override
    public void iOneMethodTwo() {
        System.out.println("Interface One Method Two");
    }
    @Override
    public void iTwoMethodOne() {
        System.out.println("Interface TwoMethod One");
    }
    @Override
    public void iTwoMethodTwo() {
        System.out.println("Interface Two Method Two");
    }
     @Override
    public void iThreeMethodOne() {
        System.out.println("Interface Three Method One");
    }
    @Override
    public void iThreeMethodTwo() {
        System.out.println("Interface Three Method One");
    }
    @Override
    public void iFourMethodOne() {
        System.out.println("Interface Four Method One");
    }
  public void methodOne(InterfaceOne ione)
  {
      System.out.println("Child class method one");
  }
    public void methodTwo(InterfaceTwo itwo)
    {
        System.out.println("Child class method two");
    }
    public void methodThree(InterfaceThree ione)
    {
        System.out.println("Child class method Three");
    }
    public void methodFour(InterfaceFour ione)
    {
        System.out.println("Child class method Four");
    }

}
