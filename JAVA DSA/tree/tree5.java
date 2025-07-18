package tree;
import java.util.*;
public class tree5 {
    static class Node {
        int data;
        Node left;
        Node right;
    
        Node(){
            this.left= null;
            this.right = null; 
        }
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;

        }
    }
    public static Node root;
    public static int idx = -1;

    public static Node createTree(int[] arr){
        idx++;
        if( idx>=arr.length || arr[idx]==-1){
            return null;
        }
        Node nw = new Node(arr[idx]);
        nw.left = createTree(arr);
        nw.right = createTree(arr);
        return nw;
    }
    public static void preOrder(Node root){
        if(root == null){
            System.out.print(-1+" ");
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root == null){
            System.out.print(-1+" ");
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inOrder(Node root){
        if(root == null){
            System.out.print(-1+" ");
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curNode = q.remove();
            if(curNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curNode.data+" ");
                if(curNode.left!=null)q.add(curNode.left);
                if(curNode.right!=null)q.add(curNode.right);
            }

        }

    }
    public static int Height(Node root){
        if(root == null)return 0;
            
        
        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int Count(Node root){
        if(root == null){
            return 0;
        }
        int lh = Count(root.left);
        int rh = Count(root.right);
        return lh+rh+1;

    }
    public static int Sum(Node root){
        if(root == null){
            return 0;
        }
        return root.data+Sum(root.left)+Sum(root.right);
     
    }
    static class Info{
        int dia;
        int ht;
       
        Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }

    }
    public static Info Diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftSubtree = Diameter(root.left);
        Info rightSubInfo = Diameter(root.right);
        //int dia = leftSubtree.ht + rightSubInfo.ht + 1;
        int Height = Math.max(leftSubtree.ht, rightSubInfo.ht)+1; 
        int diam =  Math.max(leftSubtree.ht+rightSubInfo.ht+1,Math.max(leftSubtree.dia, rightSubInfo.dia));
        return new Info(diam, Height);

    } 
    static HashMap<Integer, Integer> map = new HashMap<>();
    public static void topView(Node root, int x){
        if(root == null){
           return; 
        }
        if(!map.containsKey(x)){
            map.put(x, root.data);
         }
        
        
        topView(root.left, x-1);
        topView(root.right, x+1);


    }
    // static HashMap<Integer, Integer> map = new HashMap<>();
    public static void bottomView(Node root, int x){
        if(root == null){
           return; 
        }
        map.put(x, root.data);
        bottomView(root.left, x-1);
        bottomView(root.right, x+1);


    }



    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,5,7,-1,-1,8,-1,-1,3,-1,6,-1,-1};
        Node root = createTree(arr);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        System.out.println(Height(root));
        System.out.println(Count(root));
        System.out.println(Sum(root));
        Info dia = Diameter(root);
        System.out.println(dia.dia+" "+ dia.ht);
        topView(root, 0);
        for(int keys : map.keySet()){
            System.out.print(map.get(keys)+" ");
        }
        map.clear();
        System.err.println();
        bottomView(root, 0);
        for(int keys : map.keySet()){
            System.out.print(map.get(keys)+" ");
        }
    
    }
}
