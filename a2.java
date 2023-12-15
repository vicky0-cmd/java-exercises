
import java.util.*;

public class a2 {
    public static void main(String[] args) {
        
        int arr[] = { 5, 8, 7, 6, 4 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
