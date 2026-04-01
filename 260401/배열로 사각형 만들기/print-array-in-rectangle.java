public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int[][] board = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 0) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = board[i-1][j] + board[i][j-1];
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