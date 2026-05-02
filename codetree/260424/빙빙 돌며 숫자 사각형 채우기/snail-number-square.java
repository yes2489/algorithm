import java.util.Scanner;
public class Main {
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        int[][] board = new int[n][m];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int idx = 0;
        int r = 0;
        int c = 0;

        for (int num = 1; num <= n*m; num++) {
            board[r][c] = num;

            int nr = r + dr[idx];
            int nc = c + dc[idx];

            if (!inRange(nr, nc) || board[nr][nc] != 0) {
                idx = (idx + 1) % 4;
            }

            r += dr[idx];
            c += dc[idx];
        }

        for (int[] rows : board) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static boolean inRange(int r, int c) {
        return (0 <= r && r < n && 0 <= c && c < m);
    }
}
