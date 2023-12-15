public class s7 {
    public static void main(String[] args) {
        String s = "vikash";
        char ch[] = s.toCharArray();
        int l = 0;
        int h = ch.length - 1;
        
        // for (int i = ch.length-1; i >=0; i--) {
        //     System.out.print(ch[i]);
        // }

        
        while (l < h) {
           char temp = ch[l];
            ch[l] = ch[h];
            ch[h] =  temp;
            l++;
            h--;
        }
        String rev = new String(ch);
                System.out.print(rev);

        
             
        

    }
}
