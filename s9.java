public class s9 {
    public static void main(String[] args) {
        String s = "123xed";
        char ch[] = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                sum += Character.getNumericValue(ch[i]);
            }
        }
        System.out.println(sum);
    }
}









