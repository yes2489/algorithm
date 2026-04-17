import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int offset = 100;
        // 파란색 1, 빨간색 2
        int[][] board = new int[201][201];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    if (i % 2 == 0) { // 빨간색
                        board[x + 100][y + 100] = 2;
                    } else {
                        board[x + 100][y + 100] = 1;
                    }
                }
            }
        }

        int ans = 0;
        for (int[] r : board) {
            for (int c : r) {
                if (c == 1) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}