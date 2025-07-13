import java.util.*;
public class stack {
    public static int[] nextgreater(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        for(int i = arr.length-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();                
            }           
            if(st.isEmpty()){
                result[i]=-1;
            }
            else{
                result[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return result;
    }
    public static void main(String args[]){
        int[] arr={1,2,2,3,4,5,6,7};
       int[] arr2=nextgreater(arr);
        for(int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
        
    }
}
