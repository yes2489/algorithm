import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int total = 0;
        int[][] A = new int[n][2];
        int[][] B = new int[m][2];

        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt(); // v
            A[i][1] = sc.nextInt(); // t
            total += A[i][1];
        }


        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }

        int[] aPos = new int[total + 1];
        int[] bPos = new int[total + 1];

        int idx = 1;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            int v = A[i][0];
            int t = A[i][1];
            for (int j = 0; j < t; j++) {
                cur += v;
                aPos[idx++] = cur;
            }
        }

        idx = 1;
        cur = 0;
        for (int i = 0; i < m; i++) {
            int v = B[i][0];
            int t = B[i][1];
            for (int j = 0; j < t; j++) {
                cur += v;
                bPos[idx++] = cur;
            }
        }

        int ans = 0;
        int leader = 0; // 0 - 공동, 1 - a, 2 - b

        for (int i = 1; i <= total; i++) {
            int curLeader = 0;

            if (aPos[i] > bPos[i]) { // a가 선두
                curLeader = 1;
            } else if (aPos[i] < bPos[i]) { // b가 선두
                curLeader = 2;
            }

            if (curLeader == 0) // 공동 선두 -> 넘김
                continue;

            if (leader == 0) { // 이전까지 선두가 없었음
                leader = curLeader; // 처음 결정되었기 때문에 ans++ 안함
            } else if (leader != curLeader) { // 선두가 바뀜
                ans++;
                leader = curLeader;
            }
        }

        System.out.println(ans);
    }
}
