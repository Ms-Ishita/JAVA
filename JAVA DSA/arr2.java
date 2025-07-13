public class arr2 {

        public static int longestOnes(int[] nums, int k) {
            int left = 0;
            int zeroCount = 0;
            int maxLen = 0;
    
            for (int right = 0; right < nums.length; right++) {
                if (nums[right] == 0) {
                    zeroCount++;
                }
    
                // Jab zeroCount limit se zyada ho jaye
                while (zeroCount > k) {
                    if (nums[left] == 0) {
                        zeroCount--;
                    }
                    left++;
                }
    
                // Har step pe window ka size nikal ke max update karo
                maxLen = Math.max(maxLen, right - left + 1);
            }
    
            return maxLen;
        }
    
        
    
    
    public static void twoSum(int[] nums, int target){
        for(int i =0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    System.out.print("["+i+ ","+ j+ "]");
                    //System.out.print();
                    return;
                }
            }
        }
    }
    public static void threeSum(int[] nums){
        for(int i =0; i<nums.length; i++){
            for(int j = i+1 ; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    }

                }
            }
        }

    }
    public static void subArray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            int Sum = 0;
            for(int j = i; j<nums.length; j++){
                Sum+=nums[j];
                if(maxSum<Sum){
                    maxSum=Sum;
                    System.out.println(maxSum);

                }
                //System.out.println();
            }
        }
        System.out.println("final "+maxSum);
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1,0,1,1};
            int k = 2;
            System.out.println(longestOnes(nums, k));
    //     int[] nums = {-1,0,1,2,-1,-4};
        
    //     //int target = 9;
    //    // twoSum(nums, target);
    //     //subArray(nums);
    //     threeSum(nums);
    }
}
