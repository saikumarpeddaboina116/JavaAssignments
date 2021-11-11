package Assignments.Assignment7.CyclesInterface;

import java.util.Scanner;

public class CycleFactories {
    public static void wheels(int wheels)
    {
        if(wheels == 1)
        {
            Unicycle uc=new Unicycle();
            uc.noofWheels();
        }

        if(wheels == 2)
        {
            BiCycle bc=new BiCycle();
            bc.noofWheels();
        }
        if(wheels == 3)
        {
            TriCycle tc=new TriCycle();
            tc.noofWheels();
        }
        if(wheels > 3)
        {
            System.out.println("Wrong Choice enter wheels less than 4");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number of wheels");
        Scanner scan = new Scanner(System.in);
        int choice =scan.nextInt();
        wheels(choice);

    }
}
