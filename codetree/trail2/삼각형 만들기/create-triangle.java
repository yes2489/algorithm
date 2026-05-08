import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dots = new int[n][2];

        for (int i = 0; i < n; i++) {
            dots[i][0] = sc.nextInt();
            dots[i][1] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            // i를 기준 꼭짓점으로 생각
            int x1 = dots[i][0];
            int y1 = dots[i][1];

            for (int j = 0; j < n; j++) {
                // 같은 점 사용 금지
                if (i == j)
                    continue;

                int x2 = dots[j][0];
                int y2 = dots[j][1];

                for (int k = 0; k <n; k++) {
                    // 같은 점 사용 금지
                    if (i == k || j == k)
                        continue;

                    int x3 = dots[k][0];
                    int y3 = dots[k][1];

                    // i를 기준으로 j는 x가 같아야하고 k는 y가 같아야 함
                    if (x1 == x2 && y1 == y3){
                        int area = Math.abs(y2 - y1) * Math.abs(x3 - x1);
                        ans = Math.max(ans, area);
                    }
                }
            }
        }

        System.out.println(ans);
    }
}