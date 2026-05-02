import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[][] board = new int[n][m];
        int num = 1;

        // 대각선 번호 i = r + c
        // 총 대각선 수 : n + m -1 개
        for (int i = 0; i < n + m - 1; i++) {
            // 현재 대각선에서 가능한 행 시작, 끝 값
            int startIdx = Math.max(0, i - (m - 1));
            int endIdx = Math.min(n-1, i);

            for (int r = startIdx; r <= endIdx; r++) {
                // 열은 r + c = i를 만족해야함
                int c = i - r;
                
                board[r][c] = num;
                num++;
            }
        }

        for (int[] rows : board) {
            for (int val : rows) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}