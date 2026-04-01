import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = board[i-1][j-1] + board[i-1][j];
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}