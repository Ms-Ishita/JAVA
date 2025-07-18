package tree;
import java.util.*;

public class tree11 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(){
            this.left = null;
            this.right = null;

        }
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }
    public static int idx = -1;
    public static Node root ;
    public static Node create(int[] arr){
        idx++;
        if(arr[idx]==-1 || idx>=arr.length){
            return null;
        }
        Node nw = new Node(arr[idx]);
        nw.left = create(arr);
        nw.right = create(arr);
        return nw;
    }
    public static void preOrder(Node root){
        if(root ==  null){
            System.out.print(-1 + " ");
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void level(Node root){
        if(root == null)return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty()){
          Node curr = q.poll();
          if(curr == null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }
            else{
                q.offer(null);
            }
          }
          else{
            System.out.print(curr.data);
            if(q.peek()!=null)System.out.print(" ");
            if(curr.left!=null)q.offer(curr.left);
            if(curr.right!=null)q.offer(curr.right);
          }
        }
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,-1,-1,-1,5,-1,-1,3,-1,6,-1,8,-1,-1};
        Node root = create(arr);
        preOrder(root);
        System.out.println();
        level(root);
    }

}
