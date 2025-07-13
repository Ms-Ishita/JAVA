public class slidingWindow {
    public static void max_Avg_sub(int[]nums, int k){
       
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length-k; i++){
            int sum = 0;
            for(int j = i; j<i+k; j++){
                sum+=nums[j];
                max = Math.max(max,sum);

            }
        }
        System.out.println(max*1.0/k);

    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        max_Avg_sub(nums, k);

    }
    
}
