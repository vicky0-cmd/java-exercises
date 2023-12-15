
import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String s1 = "car";
        String s2 = "Racd";
        s1 = s1.toLowerCase();
        s2 = s2.toUpperCase();
        char a[] = s1.toCharArray();
        char b[] = s1.toCharArray();
        if (s1.length() != s2.length()) {
            System.out.println("not anagram");
        }
        else {
            Arrays.sort(a);
            Arrays.sort(b);
            
            boolean res = Arrays.equals(a, b);
            if (res) {
                System.out.println("s1 and s2 are anagram");
            }
            else {
                System.out.println("not anagram");
            }
        }

     

    }
}
