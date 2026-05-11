import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        int ans = 0;

        // i 번째 개발자 해고
        for (int i = 0; i < n; i++) {
            int[] time = new int[1001];


            // 해고되지 않은 개발자들의 근무 시간 표시
            for (int j = 0; j < n; j++) {
                if (j == i)
                    continue;
                // [A, B) 구간이므로 A 이상 B 미만 체크
                for (int k = start[j]; k < end[j]; k++) {
                    time[k] = 1;
                }
            }

            int runningTime = 0;

            for (int t = 0; t < 1000; t++) {
                if (time[t] == 1)
                    runningTime++;
            }

            ans = Math.max(ans, runningTime);
        }

        System.out.println(ans);
    }
}
