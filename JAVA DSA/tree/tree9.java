package tree;
import java.util.*;
public class tree9 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node() {
            this.left = null;
            this.right = null;
        }
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        Node(Node n1) {
            this.data = n1.data;
            this.left = null;
            this.right = null;
        }
    }
    static int idx = -1;
    public static Node createTree(int[] arr) {
        idx++;
        if (arr[idx] == -1 || idx >= arr.length) {
            return null;
        }
        Node nw = new Node(arr[idx]);
        nw.left = createTree(arr);
        nw.right = createTree(arr);
        return nw;
    }
        public static Node kthAcen(Node root,  int k){
            Stack<Node> st = new Stack<>();
            
            fillStack(st, root, root);
            
            while(!st.isEmpty() && st.peek().data!=k){
                st.pop();
            }
            return st.peek();
        }
        public static boolean fillStack(Stack<Node> st, Node root, Node find){
            if(root == null)return false;
            st.push(root);
            if(root == find)return true;
            if(fillStack(st, root.left, find) || fillStack(st, root.right, find))return true;
            st.pop();
            return false;  
        }
        public static Node lca2(Node root , int p , int q){
            if(root == null)return root;
            if(root.data == p || root.data == q)return root;
            Node left = lca2(root.left, p, q);
            Node right = lca2(root.right, p, q);

            if(left == null)return right;
            if(right == null)return left;
            return root;

        }
        public static int minDis(Node root, int n){
            if(root== null)return -1;
            if(root.data == n)return 0;

            int left = minDis(root.left, n);
            int right = minDis(root.right, n);
            if(left == -1 && right == -1)return -1;
            if(left == -1)return right+1;
            else{
                return left+1;
            }


        }
        public static int Dist(Node root, int n1, int n2){
            Node lc = lca2(root, n1, n2);
            int dist1 = minDis(root, n1);
            int dist2 = minDis(root, n2);
            return dist1+dist2;

        }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = createTree(arr);
        Node p = root.left.left; 
        Node q = root.left.right;
    }
}
