import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[201][201];
        int offset = 100;

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    if (board[x + offset][y + offset] == 0)
                        board[x + offset][y + offset]++;
                }
            }
        }
        // Please write your code here.
        int sum = 0;
        for (int[] r : board){
            for (int c : r) {
                sum += c;
            }
        }

        System.out.println(sum);
    }
}