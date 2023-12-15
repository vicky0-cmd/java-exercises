public class s12 {
    public static void main(String[] args) {
        String s = "google";

        int fre[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            fre[ch - 'a']++;
        }
        for (int i = 0; i < fre.length; i++) {
            if (fre[i] ==1) {
                System.out.print((char)(i+'a'));
            }
        }
    }
}
