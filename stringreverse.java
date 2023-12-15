
import java.util.*;

public class stringreverse {
    public static void main(String[] args) {
        String str = "vikash12345viks";
        // char a[] = str.toCharArray();
        // int l = 0;
        // int h = a.length - 1;
        // int temp = 0;
         
            
        //     while (l < h) {
        //         temp = a[l];
        //         a[l] = a[h];
        //         a[h] = (char) temp;
        //         l++;
        //         h--;
        //     }
        
        //     System.out.println(a);
int sum=0;
        char a[] = str.toCharArray();
        for (int i = 0; i < a.length; i++) 
        {
            // char ch = a.charAt(i);

            if (a[i] >= '1' && a[i] <= '9') {
                sum += a[i];

            } else {
                continue;
            }
        }
    
             System.out.println(sum);
    }
}
