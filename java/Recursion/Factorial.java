public class Factorial {
    public static int fac(int N){
        if(N < 2){
            return 1;
        }
        return N*fac(N-1);
    }
    public static void main(String[] args) {
        int num = fac(5);
        System.out.println(num);
    }
}
