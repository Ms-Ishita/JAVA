import java.util.Queue;
import java.util.LinkedList;
public class tree2 {
    static class Node{
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
    public static Node tree(int[]arr){
        idx++;
        if(idx>=arr.length||arr[idx]==-1){
            return null;
        }
        Node nw = new Node(arr[idx]);
        nw.left= tree(arr);
        nw.right= tree(arr);
        return nw;
    }
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();

            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }

        }


    }
    public static int count(Node root){
        if(root == null){
            return 0;
            
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount+rightCount+1;
    }
    // static int count = 0;
    // public static int sum(Node root){
        //     if(root == null){
            //         return 0;
            //     }
            //     count=count+root.data;
            //     sum(root.left);
            //     sum(root.right);
            //     return count;
            
            // }
            public static int add(Node root){
                if(root == null){
                    return 0;
                    
                }
                int Ls = add(root.left);
                int Rs=add(root.right);
                return Ls+Rs+root.data;
            }
    public static int Height(Node root){
        if(root== null){
                    return 0;
        }
        int Leftheight= Height(root.left);
        int rightheight = Height(root.right);
        return Math.max(Leftheight, rightheight)+1;

        }

    // public static int diameter(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int dia = Height(root.left)+ Height(root.right)+1;
    //     int left = diameter(root.left);
    //     int right = diameter(root.right);
    //     return Math.max(dia,Math.max(left,right));
    // }
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam =Height(root.left)+Height(root.right)+1;
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);
        return Math.max(leftHeight, rightHeight)+1;

    }


        

        

    
    public static void main(String[] args) {
        int[] arr= {1,2,3,-1,-1,4,-1,-1,4,-1,3,-1,4,-1,-1};
        Node root = tree(arr);
        System.out.println();
        levelOrder(root);
        System.out.println("HEIGHT OF LEVEL ORDER TREE:  "+Height(root));
        System.out.println("COUNT OF LEVEL ORDER TREE:  "+count(root));
        System.out.println("SUM OF NODES: "+add(root));
        System.out.println("DIAMETER OF THE TREE: "+diameter(root));
    }
    
}
