import java.util.*;
 class SwapCount {

    private int[] array;
    private int swapCount;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        array = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
       sc.close();
    }
    public void printArray(){
     
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    

    }

    public void countSwap(){
        swapCount = 0;
        int n = array.length;
        for(int i = 0 ;i<n-1;i++ ){
            for(int j = 0; j<n-i-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]= temp;
                    swapCount++;
                }
            }
        }
        System.out.println();
        printArray();
        System.out.println(swapCount);
    }



    public static void main(String[] args) {
        SwapCount sc = new SwapCount();
        sc.input();
        sc.printArray();
        sc.countSwap();
    

    
}
}
