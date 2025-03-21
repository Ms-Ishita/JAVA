class SubstringCounter {
    public static void findSubstringsContainingABC(String str) {
        int n = str.length();
        int[] freq = {0, 0, 0}; // Frequency array to count 'a', 'b', 'c'
        int left = 0; // Left pointer

        for (int right = 0; right < n; right++) {
            // Increment the frequency for the current character
            char c = str.charAt(right);
            if (c == 'a') freq[0]++;
            else if (c == 'b') freq[1]++;
            else if (c == 'c') freq[2]++;

            // Shrink the window while it contains all three characters
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                // Print the substring
                System.out.println(str.substring(left, right + 1));

                // Decrement frequency of the leftmost character
                char leftChar = str.charAt(left);
                if (leftChar == 'a') freq[0]--;
                else if (leftChar == 'b') freq[1]--;
                else if (leftChar == 'c') freq[2]--;
                left++; // Shrink the window
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcabc";
        findSubstringsContainingABC(str);
    }
}



    // public static void Subsequence(String str, String output, int i ){
    //     if(i>=str.length()){
    //         System.out.println(output);
    //         return;
    //     }
    //     Subsequence(str, output, i+1);//exclude
    //     output= output + str.charAt(i);
    //     Subsequence(str, output, i+1);//include
    // }
    // public static void main(String[] args) {
    //     String str = "abc";
    //     String output = "";
    //     Subsequence(str, output, 0);
    // }



// public class Recu {
    
//         public static int FindTarget(int[] arr, int s, int e, int target) {
//             if(s>=e){
//                 return -1;
//             }

//             int mid = s + (e - s) / 2;
//             if(arr[mid]==target){
//                 return mid;
//             }
//             else if(arr[mid]<target){
//                 return FindTarget(arr, s, mid+1, target);
//             }
//             else{
//                 return FindTarget(arr, e,mid-1, target);
//         }
//     }
    
//         public static void main(String[] args) {
//             int[] arr = {1, 3, 5, 7, 9, 11};  
//             int target = 7;
    
//             System.out.println(FindTarget(arr, 0, arr.length, target));
//         }
//     }


        // if (n == 0) {
        //     return -1; // Return -1 to signify the target is not found
        // }
        // if (arr[0] == target) {
        //     return arr[0];
        // } else {
        //     return FindTarget(n - 1, target, java.util.Arrays.copyOfRange(arr, 1, arr.length));
        // }
    

  

    // public static int SumOfArray(int[] arr, int n ){
    //     if(n==0){
    //         return 0;
    //     }
    //     if(n==1){
    //         return arr[0];
    //     }
    //     int ans = SumOfArray(arr,n-1);
    //     return ans + arr[n-1];
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,4,5};    

    //     System.out.println(SumOfArray(arr,arr.length));
    // }

    // public static void sayDigits(int n, String[] arr) {
    //     if(n==0){
    //         return;
    //     }
    //     int digit = n%10;
    //     n=n/10;
    //     sayDigits(n,arr);
    //     System.out.print(arr[digit] + " ");
        

    // }
    // public static void main(String[] args) {
    //     int n = 567;
    //     String arr[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
    //     sayDigits(n,arr);
    // }
    // public static int fibonnacci(int n) {
    //     // Base case: return 'n' when n is 0 or 1
    //     if (n <= 1) {
    //         return n;
    //     }
    //     // Recursive case: sum of two preceding Fibonacci numbers
    //     return fibonnacci(n - 1) + fibonnacci(n - 2);
    // }

    // public static void main(String[] args) {
    //     int n = 8;

    //     System.out.println("Fibonacci sequence up to " + n + ":");
    //     for (int i = 0; i <=n; i++) {
    //         System.out.println("fib(" + i + ") = " + fibonnacci(i));
    //     }

    //     System.out.println("\nFibonacci number at position " + 8 + ": " + fibonnacci(8 ));
    // }



// public class Recu {

//     public static int fibonnacci(int n ){
//         if(n ==0 || n==1){
//             return 1;
//         }
//         int smallerPrblm1 = fibonnacci(n-1);
//         int smallerprblm2 = fibonnacci(n-2);
//         System.out.println(n + " -> " + smallerPrblm1 + smallerprblm2);
       
//         return smallerPrblm1 + smallerprblm2;
//     }    //     if(n==0){
//         //         return 0;
//         //     }
//         //     System.out.println(n);
//         //     return Reversecount(n-1);
//         // }
    
//         // public static int power(int n) {
//         //     if (n == 0) {
//         //         return 1; 
//         //     }
           
//         //     int smallerPrblm = power(n - 1);
//         //     int biggerPrblm = 2 * smallerPrblm;
//         //     System.out.println(n + " -> " + biggerPrblm);
//         //     return biggerPrblm;
//         // }
    
//     public static void main(String[] args) {
//         int n = 5;
//         //System.out.println(power(n));
//         //System.out.println(Reversecount(n));
//         System.out.println(fibonnacci(n));
//     }
// }

    // public static int maximumWithRecursion(int[] arr, int i) {
       
    //     if (i == arr.length - 1) {
    //         return arr[i];
    //     }
       
    //     int max = maximumWithRecursion(arr, i + 1);
    //     return Math.max(arr[i], max);
    // }

    // public static void main(String[] args) {
    //     int[] arr = {1, 5, 3, 9, 2};
    //     System.out.println("Maximum value is: " + maximumWithRecursion(arr, 0));
    // }

