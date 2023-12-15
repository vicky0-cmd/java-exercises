import java.util.*;

public class s13 {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "tac";
        if (s1.length() != s2.length()) {
            System.out.println("f");
            return;
        }
        char ch[]=s1.toCharArray();
        char ch2[] = s2.toCharArray();
        

        Arrays.sort(ch);
        Arrays.sort(ch2);
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ch2[i]) {
                System.out.println("f");
                return;
            }

        }
        
 System.out.println("t");

    }
}
