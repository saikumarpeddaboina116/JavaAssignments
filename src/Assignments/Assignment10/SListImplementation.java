package Assignments.Assignment10;

public class SListImplementation {
    public static void main(String[] args) {
        SList obj=new SList();
        SListIterator objSLI= obj.iterator();
        objSLI.add(new Node<String>("10",null));
        objSLI.add(new Node<String>("20",null));
        objSLI.display();
       objSLI.deleteFromEnd();

        objSLI.display();
        objSLI.add(new Node<String>("22",null));
        objSLI.display();
    }
}
