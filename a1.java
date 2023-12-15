
import java.util.*;

public class a1 {
    public static void main(String[] args) {
        int arr[] = { 5, 5, 7, 2, 9, 6 };
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("minimum element is"+ " "+min);
    }
}