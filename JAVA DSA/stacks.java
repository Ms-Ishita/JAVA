public class stacks {
    // public static class Stack {
    //     private int[] arr;
    //     private int top;
    //     private int size;

    //     // Constructor
    //     public Stack(int size) {
    //         this.size = size;
    //         arr = new int[size];
    //         top = -1;
    //     }

    //     // Push operation
    //     public void push(int data) {
    //         if (isFull()) {
    //             System.out.println("Stack Overflow! Cannot push " + data);
    //             return;
    //         }
    //         top++;
    //         arr[top] = data;
    //     }

    //     // Pop operation
    //     public int pop() {
    //         if (isEmpty()) {
    //             System.out.println("Stack Underflow! Nothing to pop.");
    //             return -1;
    //         }
    //         return arr[top--];
    //     }

    //     // Peek operation
    //     public int peek() {
    //         if (isEmpty()) {
    //             System.out.println("Stack is empty! Nothing to peek.");
    //             return -1;
    //         }
    //         return arr[top];
    //     }

    //     // Check if stack is empty
    //     public boolean isEmpty() {
    //         return top == -1;
    //     }

    //     // Check if stack is full
    //     public boolean isFull() {
    //         return top == size - 1;
    //     }

    //     // Print stack elements
    //     public void printStack() {
    //         if (isEmpty()) {
    //             System.out.println("Stack is empty!");
    //             return;
    //         }
    //         System.out.print("Stack: ");
    //         for (int i = 0; i <= top; i++) {
    //             System.out.print(arr[i] + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // // Main method to test the stack
    // public static void main(String[] args) {
    //     Stack stack = new Stack(5);

    //     stack.push(10);
    //     stack.push(20);
    //     stack.push(30);

    //     stack.printStack(); // Output: Stack: 10 20 30

    //     System.out.println("Top element is: " + stack.peek()); // Output: 30

    //     System.out.println("Popped element: " + stack.pop()); // Output: 30

    //     stack.printStack(); // Output: Stack: 10 20
    // 

    public static class Node{
       int data;
       Node next;

       Node(int data){
        this.data= data;
        this.next = null;
       }
    }
    public static Node head;

    public static void push(int data){
        Node a = new Node(data);
        
        a.next = head;
        head = a;



    }
    public static int pop(){
        if(head==null){
            return -1;
        }
        int remove = head.data;
        head = head.next;
        return remove;
    }
    public static int peek(){
        return head.data;
    }
    public static boolean Empty(){
        return head == null;
    }
    public static void display(){
        if(head == null){
            return ;
        }
        Node top = head;
        while(top!= null){
            System.out.print(top.data+" ");
            top= top.next;
        }

    }
    // public static void main(String[] args) {
    //     stacks s = new stacks();
    //     s.push(1);
    //     s.push(3);
    //     s.push(4);
    //     s.push(5);
    //     s.display();
    //     System.out.println("this is the poped elemenet  "+s.pop());
    //     s.display();
    //     System.out.println(s.peek());
    //    // s.display();



    // }
}
