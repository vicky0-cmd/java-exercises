import java.util.*;
public class n6 {


      static boolean perf(int n){
        int sum=0;
        for (int i = 1; i < n - 1; i++) {
            if (n % i == 0) {
                sum += i;

            }

        }
        if(n==sum)
            return true;
        else {
            return false;   
            }
    }
    public static void main(String[] args) {
        boolean n = perf(8);
        if (n == true) {
            System.out.println("perfect");
        }
        else {
            System.out.println("false");
        }

    }
}
