import java.util.*;

public class s18 {
    public static void main(String[] args) {
        String s = "aabbddvcjk";
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     if (map.containsKey(ch)) {
        //         map.put(ch, map.get(ch) + 1);
        //     } else {
        //         map.put(ch, 1);
        //     }
        // }
        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() > 1) {
        //         System.out.print(entry.getKey()+" "+entry.getValue());
        //     }

        // }

        int fre[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            fre[ch - 'a']++;
        }
        for (int i = 0; i < fre.length; i++) {
            if (fre[i] > 1) {
                System.out.println((char)(i+'a')+" "+fre[i]);
            }
        }
    }
}
