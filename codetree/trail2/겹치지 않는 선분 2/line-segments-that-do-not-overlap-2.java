import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            boolean overlapped = false;

            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;

                // 두 선분의 시작점과 끝점의 좌우 순서가 반대라면 교차
                if ((x1[i] < x1[j] && x2[i] > x2[j]) ||
                        (x1[i] > x1[j] && x2[i] < x2[j])) {
                    overlapped = true;
                    break;
                }
            }

            if (!overlapped)
                ans++;
        }

        System.out.println(ans);
    }
}
