import java.util.Scanner;

public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();

        int ans = 0;

        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                for (int z = 1; z <=n; z++) {
                    boolean first = false, second = false;

                    if (getDiff(x, a) && getDiff(y, b) && getDiff(z, c))
                        first = true;

                    if (getDiff(x, a2) && getDiff(y, b2) && getDiff(z, c2))
                        second = true;

                    if (first || second)
                        ans++;
                }
            }
        }

        System.out.println(ans);
    }

    static boolean getDiff(int i, int target) {
        int diff = Math.abs(i - target);

        return Math.min(diff, n - diff) <= 2;
    }
}