public class s2 {
    public static void main(String[] args) {
        String str = "Take u forward is Awesome";
        // char ch[]=str.toCharArray();
        str = str.toLowerCase();
        int v = 0;
        int con = 0;
        int sp = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;

            } else if (ch>='a' && ch<='z') {
                con++;
            } else if(ch==' ') {
                sp++;
            }
        }
        


        System.out.println(v);
        System.out.println(con);
        System.out.println(sp);
    }
}
