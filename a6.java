import java.util.*;
public class a6 {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 7, 6, 7, 9 };
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
    System.out.println(arr[i]);
}
for (int i = n - 1; i >= n / 2; i--) {
    System.out.println(arr[i]);
}

    }
}
