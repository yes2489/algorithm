import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];
        int num = 1;

        for (int i = n - 1; i >= 0; i--) {
            if ((n - i) % 2 != 0) {
                for (int j = n - 1; j >= 0; j--) {
                    board[j][i] = num;
                    num++;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    board[j][i] = num;
                    num++;
                }
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