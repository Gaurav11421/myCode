package Hashing;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Gaurav",19);
        map.put("Gautam",22);
        map.put("Saurabh",23);
        map.put("Abhay",26);
        map.put("Dhananjay",30);
        map.put("Sanjay",31);
        map.put("Pramod",33);
        map.put("Mithlesh",40);
        map.put("golu",19);
        System.out.println(map);
        System.out.println(map.containsKey("Gaurav"));
        System.out.println(map.containsValue(23));
        System.out.println(map.get("Gaurav"));
        System.out.println(map.get("Gautam"));
        System.out.println(map.remove("golu"));
        System.out.println(map);
        System.out.println(map.size());
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
            Set<String> keys = map.keySet();
          for(String key : keys) {
              System.out.println(map.get(key));
          }

        
        
        
    }
}
