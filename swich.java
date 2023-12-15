
import java.util.*;
public class swich {

    public static int switchh( int c,int a, int b ) {
        int res = 0;
        switch (c) {
            case 1: {
                res = a + b;
                break;
            }

            case 2: {
                res = a - b;
                break;
            }
            case 3:
                res = a * b;
                break;
            case 4:
                res = a / b;
                break;
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(switchh(c,a, b));
    }
}
