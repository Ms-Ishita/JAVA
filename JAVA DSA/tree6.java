import java.util.*;

public class tree6 {
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
    static class Info{
        Node curr;
        int x;

        Info(Node curr, int x){
            this.curr = curr;
            this.x = x;
        }
    }
    public static void topView(Node root){
        Queue<Info> q = new LinkedList<>();
        Map<Integer, Integer> map  = new HashMap<>();
        int min = 0;
        int max = 0;
        q.add(new Info(root, 0));
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if(!map.containsKey(curr.x)){
                map.put(curr.x, curr.curr.data);
            }
            if(curr.curr.left!=null){
                q.add(new Info(curr.curr.left, curr.x-1));
                min--;
            }

            if(curr.curr.right!=null){
                q.add(new Info(curr.curr.right, curr.x+1));
                max++;
            }
            


            
        }
        for(int i = min; i<max; i++){
            System.out.print(map.get(i)+" ");
        }
        //map.clear();
        
        


    }
    public static void bottomView(Node root){
        Queue<Info> q = new LinkedList<>();

        Map<Integer, Integer> h = new HashMap<>();
        int min = 0;
        int max = 0;
        q.add(new Info(root, 0));

        while(!q.isEmpty()){
            Info c = q.remove();
            h.put(c.x, c.curr.data);

             if(c.curr.left!=null){
                q.add(new Info(c.curr.left, c.x-1));
                min--;
            }

            if(c.curr.right!=null){
                q.add(new Info(c.curr.right, c.x+1));
                max++;
            }
            

        }
        for(int i = min; i<max; i++){
            System.out.print(h.get(i)+" ");
        }

    }



    public static void main(String[] args) {
        int[] arr = {1,2,4,7,-1,-1,-1,5,-1,-1,3,-1,6,-1,8,-1,-1};
        Node root = createTree(arr);
        topView(root);
        System.out.println();
        bottomView(root);

        


    }

}
