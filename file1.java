import java.util.*;
public class file1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();
    int n = sc.nextInt();
        int sum1=0;
        int sum2=0;
    for (int i = 1; i <= n; i++) {
        if (i % m == 0) {
            sum1 += i;
        }
        else {
            sum2+=i;
        }
        
    }
    int diff=Math.abs(sum2-sum1);
    System.out.println(diff);

}

}
