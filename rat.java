import java.util.*;

public class rat {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int i = 0;
      for ( i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      }
      int r = sc.nextInt();
      int unit = sc.nextInt();
    
      int food = r * unit;
      int sum = 0;
      for ( i = 0; i < n; i++) {
          sum += arr[i];
          if (sum >= food)
              break;
      }
      System.out.println(i+1);
  }    
}
