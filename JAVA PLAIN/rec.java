public class rec {
    public static int minimum(int[] arr, int target){
        int count=0;
        if(target== 0){
            return 0;
        }
        if(target>0){
           return Integer.MAX_VALUE;
        }

        
        // if(target<0){
        //     return Integer.MAX_VALUE;
        // }
        // int min = Integer.MAX_VALUE;

        // for(int i = 0; i<arr.length;i++){
        //     int ans = minimum(arr, target-arr[i]);
        //     if(ans!=Integer.MAX_VALUE)
        //     min = min<ans+1?min:ans+1;
        
        // }

        return min;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2};
        System.out.println(minimum(arr, 5));
    }
}
