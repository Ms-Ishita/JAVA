import java.util.Arrays;

public class arr {

    public static void countNumbers(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int prevNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == prevNum) {
                count++;
            } else {
                System.out.println(prevNum + ": " + count);
                prevNum = arr[i];
                count = 1;
            }
        }
        
        System.out.println(prevNum + ": " + count);
    }

    public static boolean countUnique(int[] arr) {
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4,  4, 4};
        countNumbers(array);
        
        // Example usage of countUnique method
        System.out.println("All elements are unique: " + countUnique(array));
    }
}
