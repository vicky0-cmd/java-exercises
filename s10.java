public class s10 {
    public static void main(String[] args) {
        String s = "VikasH KumaR";
        char ch[]=s.toCharArray();

        for (int i = 0; i < ch.length-1; i++) {
            int k = i;
            while (i < ch.length && ch[i] != ' ')
                i++;
            if (k > 0) {
                                ch[k] = (char) (ch[k] >= 'a' && ch[k] <= 'z' ? ((int) ch[k] - 32) : (int) ch[k]);

                }
                 ch[k - 1] = (char) (ch[k - 1] >= 'a' && ch[k - 1] <= 'z' ? ((int) ch[k - 1] - 32) : (int) ch[k - 1]);

            
         }
        String result = new String(ch);
        System.out.println(result);
    }

}
