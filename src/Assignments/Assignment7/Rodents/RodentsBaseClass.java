package Assignments.Assignment7.Rodents;

abstract public class RodentsBaseClass {
    RodentsBaseClass()
    {
        System.out.println("Rodent Class");
    }
    public void activities()
    {
        System.out.println(" Rodents are noctural");
    }
     abstract  void sound();

    public static void main(String[] args) {
        RodentsBaseClass[] rodentArr= {new Mouse(),new Gebril(),new Hamster()};
        for(RodentsBaseClass iter : rodentArr)
        {
            iter.activities();
            iter.sound();
        }

        }
    }


