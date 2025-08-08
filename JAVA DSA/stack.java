import java.util.*;
public class stack {
    // public static int[] nextgreater(int[] arr){
    //     Stack<Integer> st = new Stack<>();
    //     int[] result = new int[arr.length];
    //     for(int i = arr.length-1; i>=0; i--){
    //         while(!st.isEmpty() && st.peek()<=arr[i]){
    //             st.pop();                
    //         }           
    //         if(st.isEmpty()){
    //             result[i]=-1;
    //         }
    //         else{
    //             result[i]=st.peek();
    //         }
    //         st.push(arr[i]);
    //     }
    //     return result;
    // }
    // public static void main(String args[]){
    //     int[] arr={1,2,2,3,4,5,6,7};
    //    int[] arr2=nextgreater(arr);
    //     for(int i = 0; i<arr2.length; i++){
    //         System.out.print(arr2[i]+" ");
    //     }
        
    // }

    public static void insertAtBottom(Stack<Integer> st , int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int temp= st.pop();
        insertAtBottom(st, val);
        st.push(temp);


    }
    public static void  reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int temp = st.pop();
        reverse(st);
        insertAtBottom(st, temp);

    }
    public static void pushinStack(int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<arr.length; i++){
            st.push(arr[i]);
        }
        System.out.println(st);
        

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[]{1,2,3,4,5};
        pushinStack(arr);
        
    }
}
