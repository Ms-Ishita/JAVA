package tree;
import java.util.ArrayList;
// import java.util.List;


public class tree10 {
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
        return nw;}


    public static void preorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }
    public static Node compare(ArrayList<Node> l1, ArrayList<Node> l2){
        int i = 0; 
        while(i<l1.size() && i<l2.size() && l1.get(i) == l2.get(i)){
            i++; 
        }
        return (l1.get(i-1));
        

    }
    public static boolean fillList(ArrayList<Node> l1, Node root, Node find ){
        if(root == null)return false;
        l1.add(root);
        if(root == find)return true;

        if(fillList(l1, root.left, find)|| fillList(l1, root.right, find))return true;
        l1.remove(l1.size()-1);
        return false;
    }
    public static Node lca(Node root, Node  p, Node q){
        if(root == null)return root;
        if(root == p || root== q) return root;
        Node left = lca(root.left, p, q);
        Node right= lca(root.right, p, q);
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }

        return root;

        
    }
    public static void main(String args[]){
        int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = createTree(arr);
        Node p = root.left.left; 
        Node q = root.left.right;

        
    //    ArrayList<Node> path1 = new ArrayList<>();
    //    ArrayList<Node> path2 = new ArrayList<>();

    //    fillList(path1, root, p);
    //    fillList(path2, root, q);
    //    Node lca = compare(path1, path2);

    //    System.out.println(lca.data);
   Node lc = lca(root, p, q);
   System.out.println(lc.data);
     


        
    }
}