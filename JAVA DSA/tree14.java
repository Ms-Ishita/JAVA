import java.util.ArrayList;
import java.util.*;

public class tree14 {
    static class Node{
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
        public static int idx = -1;

    public static Node creatTree(int[] arr) {
        idx++;
        if (idx >= arr.length || arr[idx] == -1) return null;
        Node nw = new Node(arr[idx]);
        nw.left = creatTree(arr);
        nw.right = creatTree(arr);
        return nw;
    }
    public static void kthLevelVal(Node root, int level, int k){
        if(root==null)return;
        if(level == k){
            System.out.print(root.data+" ");
            return ;
        }
        kthLevelVal(root.left, level+1, k);
        kthLevelVal(root.right, level+1, k);
       
    }
    public static void kthLevel(Node root, int k){
     kthLevelVal(root, 1, 2);
        

    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = creatTree(arr);
        kthLevel(root, 2);
    }
}
