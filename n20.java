public class n20 {
    static int fact(int n) {
        int sum = 1;
        for (int i = 1; i < n; i++) {
            sum += sum * i;
        }
        return sum;


           }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
         
       }
}
