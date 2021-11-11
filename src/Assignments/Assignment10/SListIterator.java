package Assignments.Assignment10;

class SListIterator<T> {
   static Node head=null,tail=null;

    public  void add(Node node)
    {
        if(head==null)
        {
            head=node;
            tail=node;
        }
        else
        {
            tail.link=node;
            tail=tail.link;
        }
    }
    public void deleteFromEnd()
    {
        if(head==null)
        {
            System.out.println("No nodes to delete , please insert");
        }
        else {
            Node temp;
            temp=head;
            while(temp.link!=tail)
            {
                temp=temp.link;
            }
            tail=temp;
            temp.link=null;
        }
    }
    public void deleteFromStart()
    {
        if(head==null)
        {
            System.out.println("No nodes to delete , please insert");
        }
        else if(head.link == null)
        {
            head=null;
        }
        else
        {
            head=head.link;
        }
    }
    public  void display()
    {
        if(head==null)
        {
            System.out.println("No nodes to display");

        }
        else {
            Node temp=head;

            while(temp!=null)
            {
                System.out.print(temp.data +" -> ");
                temp=temp.link;
            }
            System.out.print("null\n");
        }
    }

}
