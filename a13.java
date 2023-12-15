
import java.util.*;

public class a13 {
  public static void main(String[] args) {
      int arr[] = { 5, 2, 4, 7 };
      int n =   arr.length;
      for (int i = n-1; i >= 0; i--) {
          arr[i + 1] = arr[i];

      }
      arr[0] = 3;
       
      for (int i = 0; i <n; i++) {
              System.out.println(arr[i]);

      }
     }  
}
