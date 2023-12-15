 public class s1 {

    public static boolean palindrome(String s) {
        char ch[] = s.toCharArray();
        int l = 0;
        int h = ch.length - 1;
        while (l < h) {
            if (ch[l] != ch[h])
                return false;
            l++;
            h--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aba";
        boolean ans = palindrome(s);

        if (ans) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}