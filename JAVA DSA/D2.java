public class D2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing all elements row by row
        System.out.println("Accessing all elements row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Accessing all elements column by column
        System.out.println("Accessing all elements column by column:");
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// import java.util.Scanner;
// public class D2Array {
//     public static int binarySearch(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start <= end) {
//             int mid = start + (end - start) / 2;
            
//             if (arr[mid] < target) {
//                 start = mid + 1;
//             } else if (arr[mid] > target) {
//                 end = mid - 1;
//             } else {
//                // System.out.println(mid);
//                 return mid;
//             }
//         }
//        // System.out.println("Element not found");
//         return -1; 
//     }
    
//     public static int Find_Largest_Row_sum(int[][] arr, int n, int m, int target) {
//         for (int i = 0; i < n; i++) {
//             if (arr[i][0] <= target && arr[i][n - 1] >= target) {
//                 return binarySearch(arr[i], target);
//             }
//         }
//         return -1; 
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int rows = scanner.nextInt();
//         int cols = scanner.nextInt();
        
//         int[][] arr = new int[rows][cols];
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }
//         int target = scanner.nextInt();
        
//         int result = D2Array.Find_Largest_Row_sum(arr, arr.length, arr[0].length, target);
//         if (result != -1) {
//             System.out.println("Target " + target + " found at index: " + result);
//         } else {
//             System.out.println("Target " + target + " not found in the 2D array.");
//         }
        
//         scanner.close();
//     }
// }



//         // int max = Integer.MIN_VALUE;
//         // int[][] Array = new int [n][m];
//         // int k = 0;
//         // for(int i = 0; i<n; i++){
//         //     for(int j = 0; j<m; j++){
//         //         Array[i][j] = arr[k];
//         //         k++;
//         //     }
//         // }   
//         // for(int i = 0; i<n;i++){
//         //     int sum = 0;
//         //     for(int j = 0; j<m; j++){
//         //         sum+=Array[i][j];
//         //     }
//         //     if(sum>max){
//         //         max = sum;
//         //         k = i;
//         //     }
//         // }
//         // System.out.println(max+" "+k);  
    

