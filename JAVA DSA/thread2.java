import java.util.*;
public class thread2 {
    // int counter = 0;

    // public void increment() {
    //     counter++;
    // }
    public static void frequenc(int[] nums){
    Map<Integer, Integer> map = new HashMap<>();
     for(int i =0; i<nums.length; i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i],1);
        }
        else{
            map.put(nums[i], map.get(nums[i])+1);
        }
    }

    for(int key: map.keySet()){
        System.out.println(key+"->"+map.get(key));
    }
}
    public static void main(String[] args) {
        int[] num = new int[]{1,2,2,3,1,1};
        frequenc(num);
        
        
    }

}
//This is not thread-safe because counter++ is not atomic (it involves read, increment, write).
//Two threads can interfere and cause wrong values.

// int counter = 0;

// public synchronized void increment() {
//     counter++;
// }

//Only one thread can access increment() at a time.
//So counter will always be accurate. ✅
