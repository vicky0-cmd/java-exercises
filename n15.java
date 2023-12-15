import java .util.*;    
public class n15 {


    public static int Rev(int n) {
        int d = 0;
         int rev = 0;
        while (n != 0) {
            d = n % 10;
            
            rev = rev * 10 + d;
            n = n / 10;
        }
       
        return rev;
    }
    public static void main(String[] args) {
        int n = 445;
         System.out.println(Rev(n));
    }
}
