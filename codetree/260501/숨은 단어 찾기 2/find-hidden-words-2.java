import java.util.Scanner;

public class Main {
    // 위, 오른쪽, 아래, 왼쪽, 오른쪽 아래, 오른쪽 위, 왼쪽 아래, 왼쪽 위
    static int[] dr = {-1, 0, 1, 0, 1, -1, 1, -1};
    static int[] dc = {0, 1, 0, -1, 1, 1, -1, -1};
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'L') {
                    for (int d = 0; d < 8; d++) {
                        int r = i + dr[d];
                        int c = j + dc[d];
                        if (inRange(r, c) && board[r][c] == 'E') {
                            r += dr[d];
                            c += dc[d];

                            if (inRange(r, c) && board[r][c] == 'E')
                                cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    static boolean inRange(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }
}