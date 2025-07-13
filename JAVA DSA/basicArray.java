public class basicArray {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;
        int temp = n;
        while(temp>0){
            temp/=10;
            count++;
        }
        int[] arr = new int[count];
        int i  = count-1;
        while(n>0){
            arr[i--]=n%10;
            n/=10;

        }
        for (int j : arr) {
            System.out.print(j+" ");
        }
        System.out.println("\n      "+count);

    }
    // public static void fun(int[] nums) {
    //     int sum = 0;
    //     int target = nums[0]; 
    //     int a = nums[1]; 
    //     int c = nums[3]; 
    //     int n = nums.length; 
    //     int dayCount = 0;

        
    //     for (int i = a; sum < target; i++) {
    //         sum += nums[i % n]; 
    //         dayCount++;

            
    //         if (sum >= target) {
    //             System.out.println("Target achieved on day: " + dayCount);
    //             return;
    //         }

            
    //         if (i % n == c % n) {
    //             break;
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     int[] arr = {12,1,5,3}; 
    //     fun(arr);
    // }
}
// 
    


