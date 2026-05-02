import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(true) {
            String str = sc.next();

            if (str.equals("END")) break;

            System.out.println(new StringBuilder(str).reverse());
        }
    }
}
