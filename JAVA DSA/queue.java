import java.util.*;
public class queue{
    public static void reverseKelementsQueue(Queue<Integer> q,int k){
        Stack<Integer> st = new Stack<>();  

        for(int i =0; i<k; i++){
            st.push(q.poll());

        }
        Queue<Integer> q1 = new LinkedList<>();
        while(!q.isEmpty()){
            q1.offer(q.poll());
            

        }
        while(!st.isEmpty()){
            q.offer(st.pop());
            
        }
        while(!q1.isEmpty()){
            q.offer(q1.poll());
        }
    } 
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        
        Queue<Integer> queue=new LinkedList<>();
        int n=obj.nextInt();
        int k =obj.nextInt();
        for(int i=0;i<n;i++){
            int x=obj.nextInt();
            queue.offer(x);
        }
        reverseKelementsQueue(queue,k);
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
    }
}