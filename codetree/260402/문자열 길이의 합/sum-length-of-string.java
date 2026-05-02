import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int len = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            len += str.length();
            if (str.startsWith("a")) {
                cnt++;
            }
        }

        System.out.println(len + " " + cnt);
    }
}