public class n7 {



    static boolean fun(int n) {
        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
            
        }
    }
    public static void main(String[] args) {
        boolean n1 = fun(8);
        if (n1 == true) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
