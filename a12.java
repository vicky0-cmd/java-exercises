import java.util.*;
public class a12 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 5, 5, 7, 8, 8, 9 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                System.out.println(arr[i]);
                hm.put(arr[i], 1);
            }
            
                 
            
        }
    }
}
// solve brutforce method