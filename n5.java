import java.util.*;
public class n5 {


    static boolean arms(int n){
         
        int or = n;
        int count = 0;
        int temp = n;
        while (temp != 0) {
            count++;
            temp = temp / 10;

        }
        int sm = 0;
        while (n != 0) {
            int digit = n % 10;
            sm += Math.pow(digit, count);
            n /= 10;
        }
        return (sm == or);
    }
    public static void main(String[] args) {
        int n1 =  153;
        if (arms(n1)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        
    }
}
