public class n19 {



    public static int fibo(int n) {
        int n1 = 0;
        int n2 = 1;
        if (n <= 1) {
            return n;
        }
        int fib = fibo(n - 1) + fibo(n - 2);
        return fib;
    }
    
    public static void main(String[] args) {
        int n = 10;
       System.out.println(fibo(n));
    }
}
