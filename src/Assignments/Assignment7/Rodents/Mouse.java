package Assignments.Assignment7.Rodents;

public class Mouse extends RodentsBaseClass {
    Mouse()
    {
        System.out.println("I am mouse");
    }

    @Override
    void sound() {
        System.out.println(" I squeak , hiss and chatter");
    }
}
