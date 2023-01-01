
public class doublylinkedlist {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int val){
            data = val;
            next = null;
            prev = null;
        }
    }
    doublylinkedlist()
    {
        head = null;
        tail = null;
    }
    public void insertAtBegining(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            head.prev = newnode;
            newnode.next = head;
            head = newnode;
        }
    }
    public void insertAtPosition(int val,int pos){
        if(pos == 0){
            doublylinkedlist obj = new doublylinkedlist();
            obj.insertAtBegining(val);
            return;
        }
        Node temp = head;
        Node newnode = new Node(val);
        for(int i=0;i<pos;i++){
            temp= temp.next;
            if(temp==null)
            {
                throw new IndexOutOfBoundsException("INVALID POSITION");
            }
        }
        newnode.next = temp.next;
        temp.next.prev = newnode;
        temp.next= newnode;
        newnode.prev = temp;
    }
    public void display(){
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
    }
    public void displayrev()
    {
        Node temp = tail;
        while(temp != null)
        {
            System.out.print(temp.data+"-->");
            temp =temp.prev;
        }
    }
    public static void main(String[] args) 
    {
        //insert at beginning
        //insert at position
        //display the doubly linked list
        //display the reversed list
        doublylinkedlist obj = new doublylinkedlist();
        obj.insertAtBegining(10);
        obj.insertAtBegining(20);
        obj.insertAtBegining(30);
        obj.insertAtBegining(40);
        obj.insertAtBegining(50);
        obj.insertAtPosition(100, 3);
        obj.display();
        //obj.displayrev();
    }
}
