import java.util.Scanner;

public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        System.out.println(convert(b));

    }
    static String convert(int b) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % b);
            n /= b;
        }

        return sb.reverse().toString();
    }
}