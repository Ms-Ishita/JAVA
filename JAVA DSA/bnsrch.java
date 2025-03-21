public class bnsrch {

    static void binarySearch(int arr[], int n, int target) {
        int start = 0;
        int end = n - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                System.out.println("Element found at index " + mid);
                return;
            }
        }
        
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int target = 10;
        
        binarySearch(arr, n, target);
    }
}
