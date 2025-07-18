//import java.util.Scanner;
public class Linklist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node head;
    private static Node tail;
    private static int size;

    // public Linklist() {
    //     this.head = null;
    //     this.tail = null;
    //     this.size = 0;
    // }

    // Add node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Add node in the middle at a specific index
    public void addMiddle(int data, int index) {
        if (index < 1 || index > size + 1) {
            System.out.println("\nInvalid position. It should be between 1 and " + (size + 1));
            return;
        }

        Node newNode = new Node(data);
        if (index == 1) {
            addFirst(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode; // Update tail if inserted at last position
        }
        size++;
    }

    // Add node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Print the list
    public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Remove the first node
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null; // If list is empty after removal, update tail
        }
        size--;
    }

    // Remove the last node
    public void removeLast() {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }
        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        tail = secondLast; // Update tail
        size--;
    }

    // size of the list
    public int getSize() {
        return size;
    }
    public static int findElement(int i, int key, Node temp){
        
        if(temp==null){
           return -1;
        }
        if(temp.data==key){
            
            return i;
            
        }
        else{
            return findElement(i+1, key, temp.next);
        }


        




    }
    public static void reverseLL(){
        Node prev = null;
        Node curr = head;
        Node nex = null;
        while(curr!=null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr=nex;

        }
        head = prev;
        
    


    }
    public static int palindrom(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Linklist l1 = new Linklist();

        l1.addLast(6);
        l1.addMiddle(4, 1);
        l1.addFirst(2);
       // l1.removeFirst();
       // l1.removeLast();

        l1.print(); // Expected output: "List is empty."

        l1.addFirst(10);
        l1.addLast(20);
        
        l1.addLast(30);
        l1.print(); // Expected output: "10 -> 20 -> 30 -> null"

        //System.out.println("Size of the list: " + l1.getSize()); // Output: 3

       // l1.removeLast();
        //l1.print(); // Expected output: "10 -> 20 -> null"

       // System.out.println("Size of the list: " + l1.getSize()); // Output: 2
        //System.out.println(l1.findElement(0, 20, head));
        //l1.reverseLL();
        l1.print();
    }
}


























/*class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        System.out.println(data + " inserted at the beginning.");
    }

    // Insert at the end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println(data + " inserted at the end.");
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class LinkedListt {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at beginning: ");
                    int val1 = sc.nextInt();
                    list.insertAtBeginning(val1);
                    break;

                case 2:
                    System.out.print("Enter value to insert at end: ");
                    int val2 = sc.nextInt();
                    list.insertAtEnd(val2);
                    break;

                case 3:
                    list.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                 default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}*/