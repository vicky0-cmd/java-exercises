public class s20 {
    public static void main(String[] args) {
        String s = "avbksjzs";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asci = (int) (ch);
            if (asci == 90) {
                sb.append((char) (65));
            } else if (asci == 122) {
                sb.append((char) (97));
            } else {
                if ((asci >= 65 || asci <= 90) || (asci >= 97 || asci <= 122)) {
                    sb.append((char) (asci + 1));
                }
            }
        }
        System.out.println(sb.toString());
    }
}
