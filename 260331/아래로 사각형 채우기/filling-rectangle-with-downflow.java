import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[j][i] = num;
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