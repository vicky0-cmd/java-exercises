
import java.util.*;

public class a5 {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 5, 4, 6, 2,6, 6,6 };
         boolean visit[]=new boolean[arr.length];
         for (int i = 0; i < arr.length; i++) {
             if (visit[i] == true)
                 continue;
             int cnt = 1;
             for (int j = i + 1; j < arr.length - 1; j++) {
                 if (arr[i] == arr[j]) {
                     visit[j] = true;
                     cnt++;
                 }
             }
                      System.out.println(arr[i] + " " + cnt);

         }
         
    }
}
// do map approach