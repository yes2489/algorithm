import java.util.Scanner;
import java.util.concurrent.ConcurrentNavigableMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(), C = sc.nextInt();
        char[][] board = new char[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }

        // 1. 현재 위치에 적혀있는 색과 점프 이후의 칸에 적혀있는 색이 달라야 함
        // 2. 점프 진행 시 적어도 한 칸 이상 오른쪽에 있는 위치이며 동시에 한 칸 이상 아래쪽에 있는 위치로 점프 가능
        // 3. 정확히 시작, 도착 지점을 제외하고 점프하며 도달한 위치가 2곳이어야 함
        int ans = 0;

        for (int r1 = 1; r1 < R - 1; r1++) {
            for (int c1 = 1; c1 < C - 1; c1++) {
                // 시작점과 색이 같으면 점프 불가
                if (board[0][0] == board[r1][c1])
                    continue;

                // 다음 점프는 반드시 오른쪽 + 아래쪽이어야 함
                for (int r2 = r1 + 1; r2 < R - 1; r2++) {
                    for (int c2 = c1 + 1; c2 < C - 1; c2++) {
                        // 색이 같으면 점프 불가
                        if (board[r1][c1] == board[r2][c2])
                            continue;

                        // 도착점과 색이 같으면 점프 불가
                        if (board[r2][c2] == board[R - 1][C - 1])
                            continue;

                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}