public class s21 {
   public static void main(String[] args) {
       String s = "google boy a";
        
       String words[] = s.split("\\s+");
       String largestt = "";
       for (int i = 0; i < words.length; i++) {
           String word = words[i];
           if (word.length() > largestt.length()) {
               largestt = word;
           }
       }
       System.out.println(largestt);
    } 
}
