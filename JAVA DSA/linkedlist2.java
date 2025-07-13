public class linkedlist2 {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addFirst(int data){
       Node a = new Node(data);
       if(head==null){
        head=tail=a;
        return;
       }
       a.next=head;
       head=a;
    }
    public static void addLast(int data){
        Node b = new Node(data);
        if(head==null){
            head=tail=b;
            return ;
        }
        tail.next=b;
        tail=b;
    }
    public static void addMiddle(int data, int ind){

        Node c = new Node(data);
        Node temp1=head;
        Node temp2= head;
        for(int i = 0; i<=ind; i++){
            if(i<=ind-1){
                temp1 = temp1.next;
            }
            temp2= temp2.next;
    
        }
        temp1.next=c;
        c.next=temp2;
    
    
    
    
    }
    public static void removeFirst(){
        if(head==null){
            return;
        }
       head= head.next;

    }
    public static void removeLast(){
        if(head==null){}
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
    //    linkedlist2 l1 = new linkedlist2();
    //    l1.addFirst(2);
    //    l1.addFirst(2);
    //    l1.addFirst(2);
    //    l1.addFirst(2);
    //    l1.addMiddle(4, 2);
    //    l1.addLast(3);
    //    l1.removeFirst();
    //    l1.print();
    }
}