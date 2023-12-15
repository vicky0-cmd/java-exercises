import java.util.*;
public class cap {
    public static void main(String[] args) {
        String s = "geeks for Geeks";
        char ch[] = s.toCharArray();
        String s2 = "";
        for (int i = 0; i < ch.length; i++) {
         String s = ch[i];
            s1 = s1.charAt(0).toUpperCase();
            s1 = s1.charAt(s1.length() - 1).toUpperCase();
            s2 = s2 + s1;
        }
        System.out.println(s2);
    }
}
