import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[2001][2001];
        int offset = 1000;

        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        // 첫 번째 정사각형
        for (int x = x1; x < x2; x++) {
            for (int y = y1; y < y2; y++) {
                board[x + offset][y + offset] = 1;
            }
        }

        int x3 = sc.nextInt(), y3 = sc.nextInt();
        int x4 = sc.nextInt(), y4 = sc.nextInt();

        // 두 번째 정사각형
        for (int x = x3; x < x4; x++) {
            for (int y = y3; y < y4; y++) {
                board[x + offset][y + offset] = 0;
            }
        }

        // 남아 있는 칸들의 최소/최대 좌표를 찾기
        int minX = 2001, minY = 2001;
        int maxX = -1, maxY = -1;

        for (int x = 0; x < 2001; x++) {
            for (int y = 0; y < 2001; y++) {
                if (board[x][y] == 1) {
                    // 남아 있는 칸들 중 가장 왼쪽 x 좌표
                    minX = Math.min(minX, x);
                    // 남아 있는 칸들 중 가장 아래 y 좌표
                    minY = Math.min(minY, y);
                    // 남아 있는 칸들 중 가장 오른쪽 x 좌표
                    maxX = Math.max(maxX, x);
                    // 남아 있는 칸들 중 가장 위 y 좌표
                    maxY = Math.max(maxY, y);
                }
            }
        }

        if (maxX == -1) {
            System.out.println(0);
        } else {
            // 외접 직사각형의 너비 = (maxX - minX + 1), 외접 직사각형의 높이 = (maxY - minY + 1)
            System.out.println((maxX - minX + 1) * (maxY - minY + 1));
        }
    }
}