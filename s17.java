public class s17 {
public static void main(String[] args) {
    String s = "baasdff";
    int fre[] = new int[26];
    String ans = "";
        for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (fre[ch - 'a'] == 0) {
            ans += ch;
            fre[ch - 'a'] = 1;
        }
    }
    System.out.println(ans);
}
}
