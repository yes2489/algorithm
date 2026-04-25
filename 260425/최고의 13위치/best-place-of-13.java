import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        // 1 * 3 크기의 격자 내 최대 동전 개수
        int maxCnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                maxCnt = Math.max(maxCnt, board[i][j + 2] + board[i][j + 1] + board[i][j]);
            }
        }

        System.out.println(maxCnt);
    }
}
