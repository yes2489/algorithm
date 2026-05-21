import java.util.Scanner;

public class Main {
    static int n;
    static int[] a;
    static int[] b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = new int[n];
        b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    // 제거할 선분 3개
                    if (possible(i,j,k))
                        ans++;
                }
            }
        }

        System.out.println(ans);
    }

    static boolean possible(int i, int j, int k) {
        for (int x = 0; x < n; x++) {
            if (x == i || x == j || x == k) {
                continue;
            }

            for (int y = x + 1; y < n; y++) {
                if (y == i || y == j || y == k) {
                    continue;
                }

                // x번 선분과 y번 선분이 겹치면 실패
                if (!(b[x] < a[y] || b[y] < a[x]))
                    return false;
            }
        }

        return true;
    }
}