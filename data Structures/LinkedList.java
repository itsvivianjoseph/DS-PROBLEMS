public class LinkedList {

    Node head;

    public class Node
    {
        int data;
        Node next;
         
        //CONSTRUCTOR OF NODE CLASS
        Node(int val)
        {
            data = val;
            next = null;
        }    
    }

    //CONSTRUCTOR OF THE LINKED LIST CLASS
    LinkedList()
    {
        head = null;
    }

    public void update(int val,int pos)
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("CREATE AN LIST FIRST!!");
        }
        Node temp = head;
        for(int i=0;i<pos;i++)
        {
            if(temp==null)
            {
                throw new IndexOutOfBoundsException("ENTER A VALID INDEX");
            }
            temp=temp.next;
        }
        temp.data = val;
    }

    public void insertAtBegining(int val)
    {
        Node newnode = new Node(val);
        //WHEN LIST IS EMPTY
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void insertAtEnd(int val)
    {
        Node newnode = new Node(val);
        if(head==null)
        {
            head = newnode;
        }
        Node temp = head;
        while(temp!=null)
        {
            temp = temp.next;
        }
        temp= newnode;
    }

    public void insertAtPosition(int pos,int val)
    {
        if(pos==0){
            insertAtBegining(val);
            return;
        }
        Node newnode = new Node(val);
        Node temp = head;
        for(int i=1;i<pos;i++)
        {
            temp = temp.next;
            if(temp==null)
            {
                throw new IndexOutOfBoundsException("INVALID POSITION");
            }
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void deleteAtPos(int pos)
    {
        if(head == null)
        {
            throw new IndexOutOfBoundsException("LIST IS EMPTY");
        }
        Node temp = head;
        Node prev = null;
        for(int i=1;i<pos;i++)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    public void deleteAtBegining()
    {
        head = head.next;
        return;
    }
    
    public void deleteAtEnd()
    {
        Node temp = head;
        Node prev = null;
        while(temp.next!=null)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    public void search(int target)
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("LIST IS EMPTY");
        }
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==target) 
            {
                System.out.println("\nELEMENT FOUND!!");
                return;
            }
            temp=temp.next;
        }
    }

    public void getIndex(int val)
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("LIST IS EMPTY");
        }
        Node temp = head;
        int count=0;
        while(temp!=null)
        {
            if(temp.data==val)
            {
                System.out.println(count+"th position in the list");
                return;
            }
            count++;
            temp=temp.next;
        }
        System.out.println("\n"+val+"is not present in the list");
    }

    public void display()
    {
        Node temp = head;
        System.out.print(temp.data);
        temp=temp.next;
        while(temp!=null)
        {
            System.out.print("-->"+temp.data);
            temp = temp.next;
        }
    }
    
    public void reverseList()
    {
        Node prev=null;
        Node current=head;
        Node nxt=head.next;
        while(current!=null)
        {
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        head = prev;
    }
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.insertAtBegining(100);       
        obj.insertAtBegining(200);
        obj.insertAtBegining(300);
        obj.insertAtBegining(400);
        obj.insertAtBegining(500);
        obj.reverseList();
        obj.display();
    }
}
