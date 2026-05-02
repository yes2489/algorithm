import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 8 * 8 색종이
        int n = sc.nextInt();
        int[][] board = new int[201][201];
        int offset = 100;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int r = x; r < x + 8; r++) {
                for (int c = y; c < y + 8; c++) {
                    board[r + offset][c + offset] = 1;
                }
            }
        }

        int ans = 0;
        for(int[] r : board) {
            for (int c : r) {
                ans += c;
            }
        }

        System.out.println(ans);
    }
}