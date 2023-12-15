public class n14 {
    public static void main(String[] args) {
        int n = 1996;
        if (n % 4 == 0) {
            System.out.println("true");
        }
        else if (n % 400 == 0) {
            System.out.println("t");
        }
        else if (n % 100 == 0) {
            System.out.println("f");
        }
        else {
            System.out.println("f");
        }
    }
}
