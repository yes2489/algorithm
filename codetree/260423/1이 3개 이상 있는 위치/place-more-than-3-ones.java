import java.util.Scanner;
public class Main {
    static int n;
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        int r = 0, c = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int  cnt = 0;
                for (int idx = 0; idx < 4; idx++) {
                    int nr = i + dr[idx];
                    int nc = j + dc[idx];
                    if (inRange(nr, nc) && arr[nr][nc] == 1){
                        cnt++;
                    }
                }
                if (cnt >= 3)
                    ans++;
            }
        }

        System.out.println(ans);
    }
    static boolean inRange(int r, int c) {
        return (0 <= r && r < n && 0 <= c && c < n);
    }
}