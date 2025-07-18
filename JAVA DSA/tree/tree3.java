package tree;
import java.util.*;

public class tree3 {
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
    }

    public static Node root;
    public static int idx = -1;

    public static Node CreateTree(int[] arr) {
        idx++;
        if (arr[idx] == -1) {
            return null;
        }
        Node nw = new Node(arr[idx]);
        nw.left = CreateTree(arr);
        nw.right = CreateTree(arr);
        return nw;
    }
   
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+" ");
                if (currNode.left != null)
                    q.add(currNode.left);
                if (currNode.right != null)
                    q.add(currNode.right);
            }
        }
    }
   // public static boolean

    // public static int Height(Node root) {
    //     if (root == null) {
    //         return 0;
    //     }
    //     int lh = Height(root.left);
    //     int rh = Height(root.right);
    //     return Math.max(lh, rh) + 1;

    // }

    // public static int Diameter(Node root) {
    //     if (root == null) {
    //         return 0;
    //     }
    //     int dia = Height(root.left) + Height(root.right) + 1;
    //     int leftHeight = Height(root.left);
    //     int rightHeight = Height(root.right);
    //     return Math.max(dia, Math.max(leftHeight, rightHeight)) + 1;

    // }

    // static class Info {
    //     int dia;
    //     int ht;

    //     Info(int dia, int ht) {
    //         this.dia = dia;
    //         this.ht = ht;
    //     }
    // }

    // public static Info diameter(Node root) {
    //     if(root == null){
    //         return new Info(0,0);
    //     }
    //     Info leftInfo = diameter(root.left);
    //     Info rightInfo = diameter(root.right);
    //     int Height = Math.max(leftInfo.ht, rightInfo.ht)+1;
        
    //     int dia = Math.max(leftInfo.ht+ rightInfo.ht+1,Math.max(leftInfo.dia, rightInfo.dia));
    //     return new Info(dia, Height);
    // }

    public static void main(String[] args) {
            //int[] arr = {1,2,3,-1,-1,4,-1,-1,4,-1,3,-1,-1};
            // Node root=CreateTree(arr);
            // Info dia=diameter(root);
            // levelOrder(root);
            // System.out.println(dia.dia+" "+dia.ht);
        }
}