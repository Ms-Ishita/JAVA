import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] result = mergeSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {       
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}

/*public class sort {

    public static void DUplicates(int[]arr){ 
        int n = arr.length;
        Arrays.sort(arr);
        for(int i =0; i<n-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("Duplicates are: "+ arr[i]);
            }
        }



    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10};
        DUplicates(arr);
    }
}*/
   /*  public static void selectionSort(int[]array ){
       int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for(int j = i+1; j<n; j++ ){
                if(array[j]< array[min]){
                    min = j;

                }
                int temp = array[min];
                array[min]= array[i];
                array[i]= temp;
                

            }
            
            
        }

    }
    

    // static void bubbleSort(int[] arr, int n ){
    //     for(int i = 0; i<n-1; i++){
    //         for(int j = 0; j<n-i-1 ; j++ ){
    //             if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }
    // }
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        selectionSort(array);
        //bubbleSort(array, 5);
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}




// public class sort {
//     public class ArrayRotation {

//         public static void rotate(int[] arr, int k) {
//             int n = arr.length;
//             int[] rotated = new int[n];
    
//             for (int i = 0; i < n; i++) {
//                 rotated[(i + k) % n] = arr[i];
//             }
    
//             for (int i = 0; i < n; i++) {
//                 arr[i] = rotated[i];
//             }
//         }
    
//         public static void main(String[] args) {
//             int[] array = {1, 2, 3, 4, 5, 6, 7};
//             int k = 3; // Number of rotations
//             rotate(array, k);
    
//             for (int num : array) {
//                 System.out.print(num + " ");
//             }
//         }
//     }
    
    

*/

