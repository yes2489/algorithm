import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int lcm = getLCM(n, m);

        System.out.print(lcm);
    }

    static int getLCM (int n, int m) {
        return n * m / getGCD(n, m);
    }

    static int getGCD(int n, int m) {
        if (m == 0) return n;
        return getGCD(m, n%m);
    }
}