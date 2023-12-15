public class s8 {
    public static void main(String[] args) {
        String s = "a+(b+c)+d+(e+s)";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '(' && ch != ')') {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
