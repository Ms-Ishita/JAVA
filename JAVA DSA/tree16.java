public class tree16 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }
    
        
    }
    public static Node root;
    public static int idx =-1;
    public static Node createTree(int[] arr){
        idx++;
        if(idx>=arr.length || arr[idx]==-1)return null;
        Node nw = new Node(arr[idx]);
        nw.left = createTree(arr);
        nw.right =createTree(arr);
        return nw;

    }
    public static Node lca(Node root, int p, int q){
        if(root == null || root.data == p || root.data == q)return root;
        Node left = lca(root.left, p, q);
        Node right = lca(root.right, p, q);
        if(left== null)return right;
        if(right== null)return left;
        return  root;

    }
    public static int Distance(Node root, int n){
        if(root == null)return -1;
        if(root.data== n)return 0;
        int left = Distance(root.left, n);
        int  right = Distance(root.right, n);
        if(left ==-1 && right == -1)return -1;
        if(left == -1)return right+1;
        else return left +1;


    }
    public static int minDis(Node root, int p, int q){
        Node root1 =lca(root, p, q);
        int dist1  = Distance(root1, p);

        
        int dist2 = Distance(root1, q);
        return dist1+dist2;

    }


    
    public static void main(String args[]) {
        int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1  };
       
        Node root = createTree(arr);
        int p = 4;
        int q = 6;
        System.out.println(minDis(root, p, q));

    }
}
