import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 개발자 N, 감염된 후 전염 가능한 악수 횟수 K, 처음 감염된 감염자 P, 총 악수 정보 T
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        int T = sc.nextInt();

        // 악수 정보 저장 배열
        int[] t = new int[T];
        int[] x = new int[T];
        int[] y = new int[T];

        for (int i = 0; i < T; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        // 시간순 정렬
        // t 기준으로 정렬
        for (int i = 0; i < T - 1; i++) {
            for (int j = i + 1; j < T; j++) {
                if (t[i] > t[j]) {
                    int tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;

                    tmp = x[i];
                    x[i] = x[j];
                    x[j] = tmp;

                    tmp = y[i];
                    y[i] = y[j];
                    y[j] = tmp;
                }
            }
        }

        // 감염 개발자 배열, 전염 가능 횟수 저장 배열
        boolean[] infected = new boolean[n + 1];
        int[] remain = new int[n + 1];

        infected[p] = true;
        remain[p] = k;

        // 악수 진행
        for (int i = 0; i < T; i++) {
            int a = x[i];
            int b = y[i];

            boolean isACanInfect = infected[a] && remain[a] > 0;
            boolean isBCanInfect = infected[b] && remain[b] > 0;

            boolean infectA = false;
            boolean infectB = false;

            // a가 전염시키는 경우
            if (isACanInfect && !infected[b]) {
                infectB = true;
            }

            // b가 전염시키는 경우
            if (isBCanInfect && !infected[a]) {
                infectA = true;
            }

            if (isACanInfect)
                remain[a]--;
            if (isBCanInfect)
                remain[b]--;

            if (infectA) {
                infected[a] = true;
                remain[a] = k;
            }
            if (infectB) {
                infected[b] = true;
                remain[b] = k;
            }
        }

        for (int i = 1; i <= n; i++) {
            if(infected[i])
                System.out.print(1);
            else
                System.out.print(0);
        }
    }
}