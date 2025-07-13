public class tree {
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            
        }

    }
    public static Node head;
    public static Node last(int[] arr){
       return check(arr,0,arr.length);
        
    }
    public static Node check(int [] arr, int s , int e){
        if (s > e) {
            return null; 
        }
        int mid = s + (e - s) / 2;
        Node root = new Node(arr[mid]);
        root.left= check(arr,s,mid-1);
        root.right=check(arr,mid+1,e);
        return root;
    }
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,-1,4,-1,-1,4,-1,3,-1,-1};
        Node root = last(arr);
        inorder(root);

    }



    
}