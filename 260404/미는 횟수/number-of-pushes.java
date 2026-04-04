import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next(), b = sc.next();
        int len = a.length();
        int ans = -1;

        for (int i = 0; i < len; i++) {
            a = a.substring(len - 1) + a.substring(0, len - 1);
            if (a.equals(b)) {
                ans = i + 1;
                break;
            }
        }
        System.out.print(ans);
    }
}