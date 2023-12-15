import java.util.*;

public class a14 {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 4, 5, 2, 7, 6, 6, 6 };
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            if (entry.getValue() >= 2)
                a.add(entry.getKey());
        }
            System.out.println(a);


    }
}
 