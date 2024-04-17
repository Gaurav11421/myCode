import java.util.*;
//package Hashing;
public class Frequency {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {2,4,3,5,3,3,2,4,3,5,3,5,3,6,9,4};
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }
        // iteration 1
        Set<Integer> frequency = map.keySet();
        for(Integer val : frequency){ 
            System.out.println(val+"->"+ map.get(val));
        }
        // iteration 2
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+" ->"+ value );
        }
    }
}

