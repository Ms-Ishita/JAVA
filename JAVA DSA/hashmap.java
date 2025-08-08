import java.util.*;

class hashmap {
   public static void main(String[] args) {
    TreeMap<Integer, String> map = new TreeMap<>();
    map.put(111, "Smith");
    map.put(142, "Ram");
    map.put(133, "Govinda");
    for(int key : map.keySet()){
        System.out.println(key+" "+map.get(key) );
    }
    
   }

}

