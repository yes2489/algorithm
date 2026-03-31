import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[][] board = new int[n][m];
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = num;
                num++;
                
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}