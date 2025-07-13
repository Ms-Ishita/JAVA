public class tree14 {
    public static boolean identical(Node root, Node subroot){
        if(root== null && subroot==null)return true;
        if(root==null || subroot==null)return false;
        if(root.data == subroot.data)return true;
        if(identical(root.left, subroot.left) && identical(root.right, subroot.right))return true;
        // return false;

    }
    public static boolean subtree(Node root,Node subroot){
        if(root==null)return false;
        if(subroot == null )return true;
        if(root.data==subroot.data){
            if(identical(root, subroot))return true;
        }
        return subtree(root.left, subroot)|| subtree(root.right, subroot);

    }

    

}
