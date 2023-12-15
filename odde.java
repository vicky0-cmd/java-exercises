
import java.util.*;
public class odde {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int  n = sc.nextInt();
        int arr[] = new int[n];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new  ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
            
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);

            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int evenn = even.get(even.size() - 2);
        int oddd = odd.get(odd.size() - 2);
        int sum = evenn + oddd;
        System.out.println("the sum is"+sum);

    }
}
