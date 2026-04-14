import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[2001][2001];
        int offset = 1000;

        for (int i = 1; i < 4; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    board[x + offset][y + offset] = i;
                }
            }
        }

        int sum = 0;
        for (int[] r : board) {
            for (int c : r) {
                if (c != 0 && c != 3) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}