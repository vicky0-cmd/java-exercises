
import java.util.*;
public class removevowels {
    public static  void main(String[] args) {
        String str = "Apple is good for health";
        String res = "";
        String str1 = str.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            } else {
                res=res+ch;
            }
        }
        System.out.println(res);

    }
}
