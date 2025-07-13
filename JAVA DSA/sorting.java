import java.util.ArrayList;

public class sorting {
 public static void merge(ArrayList<Integer>arr, int st, int mid, int end){
    ArrayList<Integer> resuList = new ArrayList<>();
    int i = st, j=mid+1;
    while(i<=mid && j<=end){
        if(arr.get(i)<arr.get(j)){
            resuList.add(arr.get(i++));
            
        }
        else{
            resuList.add(arr.get(j++));
            
        }
    }
    while(i<=mid){
        resuList.add(arr.get(i++));
        
    }
    while(j<=end){
        resuList.add(arr.get(j++));
       
    }

    for(int inx=0; inx<resuList.size();inx++){
       arr.set(st+inx, resuList.get(inx));


    }


}
 public static void mergeSort(ArrayList<Integer> arr, int st, int end){

    int mid = st+(end-st)/2;
    if(st<end){
        mergeSort(arr, st, mid);
        mergeSort(arr, mid+1,  end);
       merge(arr, st, mid, end);
    }

 }
    
 public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(5);
    arr.add(4);
    arr.add(3);
    arr.add(2);
    arr.add(1);

    System.out.println("Original List: " + arr);

    mergeSort(arr, 0,  arr.size()-1);

    System.out.println("Sorted List: " + arr);
}
}

