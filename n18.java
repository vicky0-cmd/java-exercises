import java.util.*;
public class n18 {


    public static int maxx(int n) {
        int d = 0;
                int max = Integer.MIN_VALUE;

        while (n != 0) {
                    d = n % 10;
         max = Math.max( max,d);
        n = n / 10;
        }
        return max;
    }
    public static void main(String[] args) {
        int n = 5554896;
        System.out.println(maxx(n));
     }

}
