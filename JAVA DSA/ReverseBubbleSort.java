public class ReverseBubbleSort {
    
    public static void bubbleSortReverse(String[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) < 0) {
                   
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] array = { "mango", "grapes","orange"};
        
        System.out.println("Original array:");
        printArray(array);
        
        bubbleSortReverse(array);
        
        System.out.println();
        printArray(array);
    }
}
