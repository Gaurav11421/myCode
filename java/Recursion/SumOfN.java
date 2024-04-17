public class SumOfN {
    public static int sum(int N){
        if(N == 0){
            return 0;
        }
        return N+sum(N-1);
    }
    public static void main(String[] args) {
        int Sum = sum(100);
        System.out.println(Sum);
    }
}
