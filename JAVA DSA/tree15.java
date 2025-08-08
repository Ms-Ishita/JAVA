import java.util.Stack;
public class tree15 {
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
    public static void reverse(Stack<Node> st){
        if(st.isEmpty()){
            return;
        }
        Node temp = st.pop();
        reverse(st);
        insertAtBottom(st, temp);

    }
    public static void insertAtBottom(Stack<Node> st, Node val){
        if(st.empty()){
            st.push(val);
            return;
        }
        Node temp=st.pop();
        insertAtBottom(st, val);
        st.push(temp);

    
    }
    public static Node comapare(Stack<Node> st1, Stack<Node> st2){
        
        Node temp = null;
        reverse(st1);
        reverse(st2);
        while(!st1.isEmpty()&& !st2.isEmpty()){
            if(st1.peek()==st2.peek()){
                temp = st1.pop();
                st2.pop();
            }else{
                break;
            }
        }
        return temp;
        
    }
        
        public static boolean checkpath(Stack<Node> st,Node root, int find){
        if(root == null)return false;
        st.push(root);
        if(root.data == find)return true;
        if(checkpath(st, root.left, find)||checkpath(st, root.right, find))return true;
        st.pop();
        return false;

        
    }
    public static void lca(Node root, int p, int q){
        Stack<Node> st1 = new Stack<>();
        checkpath(st1, root, p);
        Stack<Node> st2 = new Stack<>();
        checkpath(st2, root, q);
        Node lca = comapare(st1, st2);
        System.out.println(lca.data);
    }
  
    public static void main(String args[]) {
        int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1  };
       
        Node root = createTree(arr);
        lca(root, 4, 6);

    }
}
