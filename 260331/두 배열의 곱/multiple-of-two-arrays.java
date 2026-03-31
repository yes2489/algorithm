import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[][] board1 = new int[3][3];
        int[][] board2 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board2[i][j] = sc.nextInt();
                System.out.print(board1[i][j] * board2[i][j] + " ");
            }
            System.out.println();
        }
    }
}