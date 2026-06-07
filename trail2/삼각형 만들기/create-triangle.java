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

        int maxA = 0; // maxArea

        // 기준 꼭짓점 (i)
        for (int i = 0; i < n; i++) {
            int cx = dots[i][0]; // centerX
            int cy = dots[i][1]; // centerY

            // x축이 같은 점 (j)
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                int vx = dots[j][0]; // verticalX
                int vy = dots[j][1]; // verticalY

                // y축이 같은 점 (k)
                for (int k = 0; k < n; k++) {
                    if (i == k || j == k) continue;

                    int hx = dots[k][0]; // horizontalX
                    int hy = dots[k][1]; // horizontalY

                    // 직각삼각형 성립 조건 확인 (수직점은 x가 같고, 수평점은 y가 같음)
                    if (cx == vx && cy == hy) {
                        int area = Math.abs(vy - cy) * Math.abs(hx - cx);
                        maxA = Math.max(maxA, area);
                    }
                }
            }
        }

        System.out.println(maxA);
    }
}
