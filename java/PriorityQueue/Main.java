import java.util.Comparator;
import java.util.PriorityQueue;
class Main{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int[] arr = {1,2,2,1,1,3,3,4,2,2,1,4,3,3};
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }
        
    }
}