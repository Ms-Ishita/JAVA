

public  class Binary_Search_Tree1 {
    public static  class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;

        }
    }
    public static Node root = null;
    public static Node insert(Node root, int data){
        if(root == null)return new Node(data);
        if(data>root.data){
            root.right = insert(root.right, data);
            
        }
        else{
            root.left = insert(root.left, data);
        }
        return root;


    }
    public static Node createBST(int[] arr ){

        for(int i =0; i<arr.length; i++){
            root=insert(root,arr[i]);
        }
        return root;


    } 
    public static void printBST(Node root){
        if(root == null)return ;
        printBST(root.left);
        System.out.print(root.data+" ");
        printBST(root.right);
    }
    public static Node SearchKey(Node root , Node key){
        if(root == null)return root;
        if(root==key)return root;
        if(key.data<root.data)return SearchKey(root.left, key);
        return SearchKey(root.right, key);
       
    }
    public static void main(String[] args) {
        int arr[]= new int[]{5,1,3,4,2,7};

        createBST(arr);
        printBST(root);
        System.out.println();
        System.out.println(SearchKey(root, root.left.right)!=null);

    }
}
