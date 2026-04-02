import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        StringBuffer sb = new StringBuffer(str);
        int len = str.length();
        int n = sc.nextInt();

        String reverse = sb.reverse().toString();

        if (n > len) {
            System.out.print(reverse);
        } else {
            System.out.println(reverse.substring(0, n));
        }
    }
}