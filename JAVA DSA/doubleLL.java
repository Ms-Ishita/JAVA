public class doubleLL {
    public static  class Node{
        int data;
        Node prev;
        Node next;


        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addFirst(int data){
        Node a = new Node(data);
        if(head== null){
           head=tail=a;
           return;

        }
        a.next= head;
        head.prev=a;
        head=a;
        head.prev=null;
        

        

    }
    public static void addlast(int data){
        Node b = new Node(data);
        Node temp = head;
        if(head == null){
            head=tail=b;
            return;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=b;
            b.prev=temp;
            b.next=null;
            

        }
    }
    public static void deleteFirst(){
        if(head==null){
            return;
        }
        head = head.next;
        head.prev = null;
        
    }
    public static void deletelast(){
        Node temp = head;
        if(head==null){
            return;
        }
        
        
        while(temp.next!=null){
            temp = temp.next;

        }
        temp.prev.next=null;

    }

    public static void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;

        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        // doubleLL d1= new doubleLL();
        // d1.addFirst(2);
        // d1.addFirst(1);
        // d1.addlast(4);
        // d1.deletelast();
        // d1.deleteFirst();
        // d1.print();
    }
}
