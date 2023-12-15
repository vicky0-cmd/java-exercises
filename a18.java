import java.util.*;
public class a18 {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 8, 2, 1 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = arr.length;
        int temp = 1;
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = arr[i];
        }
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            if (hm.get(b[i]) == null)
                hm.put(b[i], temp);
            temp++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(hm.get(arr[i]));
        }
    }
}
