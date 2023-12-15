
import java.util.*;public class a11 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 3 };
        // HashSet<Integer> h = new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        //     h.add(arr[i]);
        // }
        // System.out.println(h);




        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];

            }

        }
        int[] uniqueArr = Arrays.copyOf(arr, i + 1);

        System.out.println(Arrays.toString(uniqueArr));

    }
}
