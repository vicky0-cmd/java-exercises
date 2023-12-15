import java.util.*;
public class a3 {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 7, 2, 4, 6, 6 };
        int max = arr[0];
        int smax = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr)
        // }
        // Arrays.sort(arr);
        // int smax = arr[1];
        // int l = arr[arr.length - 2];
        // System.out.print(l);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < max && arr[i] > smax)
                smax = arr[i];
        }
        System.out.println(smax);
         
    }
}
