package tree;
public class tree8 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(){
            this.left = null;
            this.right= null;
        }
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
            
        }



    }
    public static Node root;
    public static int idx = -1;
    
    public static Node createTree(int[] arr){
        idx++;
        if(idx>=arr.length || arr[idx]==-1){
            return null;
        }
        Node nw = new Node(arr[idx]);
        nw.left = createTree(arr);
        nw.right = createTree(arr);
        return nw;
    }
    public static int count = 0;
    public static Node lca(Node root, int  p, int q){
        if(root == null)return root;
        if(root.data == p || root.data == q)return root;
        Node left = lca(root.left, p, q);
        Node right = lca(root.right, p, q);
        if(left == null)return right;
        if(right == null)return left;
        return root;
    }
    public static int lcaDistance(Node root, int n){
        if(root == null)return -1;
        if(root.data == n)return 0;
        int left = lcaDistance(root.left, n);
        int right = lcaDistance(root.right, n);
        if(left == -1 && right == -1)return -1;
        else if(left == -1) return right +1;
        else return left+1;
    }
    public static int minDis(Node root, int n1, int n2){
        Node lca = lca(root, n1, n2);
        int dist1 = lcaDistance(root, n1);
        int dist2 = lcaDistance(root, n2);
        return dist1+dist2;
    
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,-1,-1,-1,5,-1,-1,3,-1,6,-1,8,-1,-1};
        Node root = createTree(arr);
        System.out.println(minDis(root, 2, 8));
    }
}
