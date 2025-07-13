//import java.util.Stack;
public class stack1 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n = arr.length;
        int[] result = new int[n];
        for(int i = 0; i<n; i++){
            result[i] =-1; 
            for(int j = 1; j<n; j++){
                int index = (i+j)%n;
                if(arr[index]>arr[i]){
                    result[i]=arr[index];
                    break;
                }

            }
        }
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
    
    // public static void main(String[] args) {
    //     int [] arr = {10, 2, 3 ,11,8,5,9,3,5,2,11};
    //     Stack<Integer> st = new Stack<>();
    //     int[] arr1 = new int[arr.length];
    //     for(int i = arr.length-1; i>=0; i--){
    //         while(!st.isEmpty() && !(st.peek()> arr[i])){
    //             st.pop();
    //         }
    //         if(st.isEmpty()){
    //             arr1[i]=-1;
    //         }
    //         else{
    //             arr1[i]=st.peek();
    //         }
    //         st.push(arr[i]);
    //     } 
       
    //         for(int i = 0; i<=arr1.length-1; i++){
    //             System.out.print(arr1[i]+" ");
    //         }
    // }


}
