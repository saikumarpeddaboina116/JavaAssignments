package Assignments.Assignment7.Cycles;

public class Cycle {
    Cycle()
    {
        System.out.println("Cycle ");
    }

    public static void main(String[] args) {
        Cycle[] cycleArr={new UniCycle(),new BiCycle(),new TriCycle()};//upcasting

     /*   for(Cycle iter:cycleArr)
        {
            System.out.println(iter.balance());
        }*/
        // Cycle does not have balance method so it gives error
        Cycle cycleObj=new UniCycle();
        UniCycle uniCycleObj=(UniCycle) cycleObj;
        uniCycleObj.balance();
        cycleObj=new BiCycle();
        BiCycle biCycleObj=(BiCycle) cycleObj;
        biCycleObj.balance();
        cycleObj=new TriCycle();
        TriCycle triCycleObj = (TriCycle) cycleObj;



    }
}
