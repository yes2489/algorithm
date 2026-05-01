import java.util.Scanner;
public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] board = new int[n][n];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                board[i][j] = sc.nextInt();

        int ans = 0;
        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 <= n - 3; c1++) {
                int sum1 = board[r1][c1] + board[r1][c1 + 1] + board[r1][c1 + 2];

                for (int r2 = 0; r2 < n; r2++) {
                    for (int c2 = 0; c2 <= n - 3; c2++) {
                        if (r1 == r2 && c1 <= c2 + 2 && c2 <= c1 + 2)
                            continue;

                        int sum2 = board[r2][c2] + board[r2][c2 + 1] + board[r2][c2 + 2];

                        ans = Math.max(ans, sum1 + sum2);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}