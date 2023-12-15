
import java.util.*;

public class converta {
    public static void main(String[] args) {
        String s = "Vikash kumar Prasad";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32));
            }
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + 32));
            }

        }
         
         System.out.println(sb);
    }
}
