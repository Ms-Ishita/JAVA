public class Binary_Search_Tree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static TreeNode root = null;
    public static TreeNode insert(TreeNode root, int data){
        if(root == null)return new TreeNode(data);
        if(data<root.val)root.left = insert(root.left, data);
        else root.right = insert(root.right, data);
        return root;
    }

    public static TreeNode createBST(int arr[]){
        for(int i =0; i<arr.length; i++){
            root = insert(root, arr[i]);
        }
        return root;
         
    }
    public static  void printTree(TreeNode root){
        if(root == null)return;
        printTree(root.left);
        System.out.print(root.val+" ");
        printTree(root.right);
    }

    public static void main(String[] args) {
        int arr[]= new int[]{5,1,3,4,2,7};
        createBST(arr);
        printTree(root);

    }

    
}
