public class cycle {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }

    }
    public static Node head;
    public static Node tail;

    public static void detectloop(){
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow = head;
                if(fast==head){
                    Node prev=head;
                    while(prev.next!=fast){
                        prev=prev.next;
                    }
                    prev.next=null;
                    return;
                }
                Node prev = fast;
                
                while(slow!=fast){
                    prev = fast;
                    slow = slow.next;
                    fast = fast.next;
                }
                prev.next = null;
                return;

                
            }

        }
        
    }

    public static void Removeloop(int data){




    }
    public static void cycle(){


    }
    public static void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "=>");
            temp = temp.next;

        }
        System.out.print("null");
        
    
    }
    public static void main(String[] args) {
        cycle c1 = new cycle();
        
        c1.head = new Node(1);
        c1.head.next = new Node(2);
        c1.head.next.next = new Node(3);
        c1.head.next.next.next = head;
        c1.detectloop();
        c1.print();

   
}
}