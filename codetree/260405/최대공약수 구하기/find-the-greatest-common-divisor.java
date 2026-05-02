import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int ans = gcd(n, m);

        System.out.print(ans);
    }

    static int gcd (int n, int m) {
        if (m ==0) {
            return n;
        }
        return gcd(m, n % m);
    }
}