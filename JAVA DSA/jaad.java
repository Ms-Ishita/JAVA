public class jaad {
    public static class Node{
        int data; 
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        public static Node head;
        public static Node tail;


    
    }
    // private int[] queue;
    // private int front;
    // private int rear;
    // private int size;

    // public  queue(int size){
    //     this.size = size;
    //     this.queue = new  int[size];
    //     this.front= -1;
    //     this.rear = -1;
    // }
    // public boolean isEmpty(){
    //     return front == -1 || front>rear;
    // }
    // public boolean isFull(){
    //     return rear == size-1;
    // }
    // public void insert(int val){
    //     if(isFull()){
    //         return;
    //     }
    //     if(front ==-1) front =0;
    //     rear++;
    //     queue[rear] =val;

    // }

    
    // public int remove() {
    //     if (isEmpty()) {
    //         return -1;
    //     }
    //     int removed = queue[front];
    //     if (rear == front) {
    //         front = rear = -1;
    //     } else {
    //         front++;
    //     }
    //     return removed;
    // }
    // public int peek(){
    //     if(isEmpty()){
    //         return -1;
    //     }
    //     return queue[front];
    // }
    // public void display(){
    //     if(isEmpty()){
    //         return ;
    //     }
    //     for(int i = front; i<= rear; i++){
    //         System.out.print(queue[i]+" ");

    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args) {
    //     queue q = new queue(5);
    //     q.insert(1);
    //     q.insert(2);
    //     q.insert(3);
    //     q.insert(4);
    //     q.insert(5);
    //     q.display();        // 1 2 3 4 5
    //     System.out.println(q.peek());
    //     System.out.println(q.remove()); // 1
    //     q.display();  
    //     System.out.println(q.peek());
        


    // }


}
