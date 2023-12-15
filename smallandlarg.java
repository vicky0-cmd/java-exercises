import java.util.*;
public class smallandlarg {
    public static void main(String[] args) {
        String s = "this is a test string";
        String words[] = s.split("\\s+");

        String sm = words[0];
        String ln = words[0];
        for(String word : words) {
            if (word.length() < sm.length()) {
                sm = word;
            }
            if (word.length() > ln.length()) {
                ln = word;
            }
        }
        System.out.println(sm);
        System.out.println(ln);
    }
}
//  Smallest and Largest Word in a String