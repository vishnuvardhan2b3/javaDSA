public class LinkedListExample {
    Node head=null;
    public void print(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("NULL");
    }
    public Node addAtFront(Node head,int data){
            Node newNode=new Node(data);
            newNode.next=head;
            return newNode;
    }
    public Node addAtEnd(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    
        return head;
    }
    public Node removeAtFront(Node head){
        if(head==null){
            return null;
        }
        Node current=head;
        head=current.next;
        current=null;
        return head;
    }
    public Node removeAtEnd(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node current=head,prev=null;
        while(current.next!=null){
            prev=current;
            current=current.next;
        }
        prev.next=null;
        current=null;
        return head;

    }
    public static void main(String[] args) {
        LinkedListExample lle=new LinkedListExample();
        //lle.head=lle.addAtEnd(lle.head, 10);
        //lle.head=lle.addAtEnd(lle.head, 20);
        //lle.head=lle.addAtEnd(lle.head, 30);
        //lle.head=lle.addAtEnd(lle.head, 40);
        lle.print(lle.head);
        lle.head=lle.removeAtEnd(lle.head);
        lle.print(lle.head);
        
    }
}
