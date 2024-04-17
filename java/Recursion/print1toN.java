class print1toN{
    public static void print1ton(int N){
        if(N == 0){
            return;
        }
        print1ton(N-1);
        System.out.print(N+" ");
    }
    public static void printNto1(int N){
        if(N == 0){
            return;
        }
        System.out.print(N+" ");
        print1ton(N-1);
    }
    public static void main(String[] args) {
        print1ton(10);
        printNto1(10);
    }
}