import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // a의 속도와 시간 저장
        int[] vA = new int[n];
        int[] tA = new int[n];

        for (int i = 0; i < n; i++) {
            vA[i] = sc.nextInt();
            tA[i] = sc.nextInt();
        }

        // b의 속도와 시간 저장
        int[] vB = new int[m];
        int[] tB = new int[m];

        for (int i = 0; i < m; i++) {
            vB[i] = sc.nextInt();
            tB[i] = sc.nextInt();
        }

        int idxA = 0;
        int idxB = 0;

        // 현재 구간에서 남은 시간
        int remainA = tA[0];
        int remainB = tB[0];

        // 현재 위치
        int posA = 0;
        int posB = 0;

        // 이전 선두 상태
        // 0 - a, 1 - b, 2 - 공동
        int prev = 0;

        int ans = 0;

        while (idxA < n || idxB < m) {
            if (idxA < n) {
                posA += vA[idxA];
                remainA--;

                // 현재 구간 끝나면 다음 구간으로
                if (remainA == 0) {
                    idxA++;
                    if (idxA < n) {
                        remainA = tA[idxA];
                    }
                }
            }

            if (idxB < m) {
                posB += vB[idxB];
                remainB--;

                if (remainB == 0) {
                    idxB++;
                    if (idxB < m) {
                        remainB = tB[idxB];
                    }
                }
            }

            // 현재 선두
            int cur;
            if (posA > posB)
                cur = 0;
            else if (posA < posB)
                cur = 1;
            else
                cur = 2;

            // 이전과 다르면 카운트
            if (cur != prev) {
                ans++;
                prev = cur;
            }
        }
        System.out.println(ans);
    }
}