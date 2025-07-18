package tree;
public class tree4 {
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
    public static boolean isIdentical(Node root, Node Subroot){
        if(root == null && Subroot==null){
            return true;
        }
        if(root == null || Subroot == null){
            return false;
        }
        
        if( root.data != Subroot.data){
            return false;
        }
        if(!isIdentical(root.left, Subroot.left)){
            return false;
        }
        if(!isIdentical(root.right, Subroot.right)){
            return false;
        }
        return true;

    }
    public static boolean subTree(Node root, Node Subroot){
        if(Subroot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.data== Subroot.data){
            if(isIdentical(root, Subroot)){
                return true;
            }
           
        }
        return subTree(root.left, Subroot)|| subTree(root.right, Subroot);


    }
    public static void main(String[] args) {
        int[] arr={1,2,3,-1,-1,4,-1,-1,4,-1,3,-1,-1};
        Node root=createTree(arr);
        int[] arr2={2,3,-1,-1,4,-1,-1};
        Node Subroot=createTree(arr2);
        System.out.println(subTree(root, Subroot));
    }
}
