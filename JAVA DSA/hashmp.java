import java.util.Iterator;
import java.util.*;

public class hashmp {
    public static void main(String[] args) {
        int arr [] = {30,41,10,97,85,41,10,74};
        Set<Integer> s = new HashSet<>();
        for(int i =0; i<arr.length; i++){
            s.add(arr[i]);
            System.out.println(s);
            Iterator itr = s.iterator();
            while(itr.hasNext()){
                int a = (int)itr.next();
                if(a%2==0){
                    System.out.print(a+" ");
                }
            }
        }
    }
    
}
