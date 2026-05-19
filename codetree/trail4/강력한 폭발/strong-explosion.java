import java.util.Scanner;

public class Main {
    static int n, bombCnt, ans;
    static int[] rows = new int[10];
    static int[] cols = new int[10];
    static int[] selected = new int[10];

    static int[][][] bomb = {
            {{0, 0}, {-1, 0}, {-2, 0}, {1, 0}, {2, 0}}, // 1번 폭탄
            {{0, 0}, {-1, 0}, {1, 0}, {0, -1}, {0, 1}}, // 2번 폭탄
            {{0, 0}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}} // 3번 폭탄
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // 폭탄이 놓인 위치 저장
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sc.nextInt() == 1) {
                    rows[bombCnt] = i;
                    cols[bombCnt] = j;
                    bombCnt++;
                }
            }
        }

        // 0번째 폭탄부터 선택 시작
        dfs(0);
        
        System.out.println(ans);
    }

    static void dfs(int cnt) {
        // 모든 폭탄 위치에서 폭탄 종류를 선택했다면
        if (cnt == bombCnt) {
            // 현재 조합의 초토화 칸 수 계산
            ans = Math.max(ans, count());
            return;
        }

        // 현재 폭탄 위치에 각각의 폭탄 놓아보기
        for (int type = 0; type < 3; type++) {
            // cnt번째 폭탄 위치에 type번 폭탄 선택
            selected[cnt] = type;
            
            // 다음 폭탄
            dfs(cnt + 1);
        }
    }

    static int count() {
        // 초토화 여부 저장
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < bombCnt; i++) {
            
            // 현재 폭탄 종류
            int type = selected[i];

            // 현재 폭탄이 영향을 주는 모든 방향 확인
            for (int[] d : bomb[type]) {
                int nr = rows[i] + d[0];
                int nc = cols[i] + d[1];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                    visited[nr][nc] = true;
                }
            }
        }

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]) cnt++;
            }
        }

        return cnt;
    }
}
