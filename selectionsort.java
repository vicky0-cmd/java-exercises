import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minidx = 0;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            minidx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minidx]) {
                    minidx = j;
                }

            }
            if (arr[i+1] != arr[minidx]) {
                count++;
                   }          

            int temp = 0;
            temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
            

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
     
 }
System.out.println(count);
     }
}
