import java.util.*;

public class mul {


            

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();

         int sum = 0;

        for (int i = 1; i <= 10; i++) {
            int res = 1;
                        
             res = n * i;

            System.out.println(n + "*" + i + "=" + res);
            sum += res;
        }
       
        System.out.println(sum);
    }
}
