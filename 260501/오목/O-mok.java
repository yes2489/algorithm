import java.util.Scanner;

public class Main {
    // 오른쪽, 아래, 오른쪽 아래, 오른쪽 위
    static int[] dr = {0, 1, 1, -1};
    static int[] dc = {1, 0, 1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int winner = 0;
        int row = 0;
        int col = 0;

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (arr[i][j] == 0)
                    continue;

                int color = arr[i][j];

                for (int d = 0; d < 4; d++) {
                    int pr = i - dr[d];
                    int pc = j - dc[d];

                    if (inRange(pr, pc) && arr[pr][pc] == color)
                        continue;

                    int cnt = 1;

                    int nr = i + dr[d];
                    int nc = j + dc[d];

                    while (inRange(nr, nc) && arr[nr][nc] == color) {
                        cnt++;
                        nr += dr[d];
                        nc += dc[d];
                    }

                    if (cnt == 5) {
                        winner = color;
                        row = i + dr[d] * 2;
                        col = j + dc[d] * 2;
                        System.out.println(winner);
                        System.out.println((row + 1) + " " + (col + 1));
                        return;
                    }
                }
            }
        }
        System.out.println(winner);
    }

    static boolean inRange(int r, int c) {
        return 0 <= r && r < 19 && 0 <= c && c < 19;
    }
}