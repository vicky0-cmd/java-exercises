import java.util.*;
public class pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for (int i = low; i <= high; i++) {
            int rev = 0;
            int temp = i;
            int r = 0;
         while(temp!=0)
         {
             r = temp % 10;
             rev = rev*10 + r;
             temp /= 10;
         }
         if(i==rev)
         System.out.println( i);   
        }
    }
}
