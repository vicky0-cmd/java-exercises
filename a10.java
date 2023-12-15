import java.util.*;
public class a10 {
public static void main(String[] args) {
    int arr[] = { 2, 5, 8, 4, 5, 9 ,4};
    int n = arr.length;
    Arrays.sort(arr);
    if (n % 2 == 0) {
        int ind1 = (n / 2) - 1;
        int ind2 = (n / 2);
        System.out.println((arr[ind1] + arr[ind2]) / 2);
    }
    else {
        System.out.println(arr[n/2]);
    }
}
}
