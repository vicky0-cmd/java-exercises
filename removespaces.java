
import java.util.*;

public class removespaces {




    // static int remove(char[] a) {
    //     int cnt = 0;
    //     for (int i = 0; i < a.length; i++) {
             
    //         if (a[i] != ' ') {
    //             a[cnt] = a[i];
    //             cnt++;
    //         }
    //     }
    //     return cnt;
    // }
    // public static void main(String[] args) {
    //     String str="vikash kumar ";

    //     char[] a = str.toCharArray();
    //     int cnt = remove(a);

    //     System.out.println(String.valueOf(a).substring(0,cnt));



    public static void main(String[] args) {
        // String str = "vikash kumar ";
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (ch != ' ') {
        //         sb.append(ch);
        //     }
        // }
        // System.out.println(sb);




        // Remove characters from a string except alphabets
        String str = "vikash kumar12313 vika ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch<='z') {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    }

