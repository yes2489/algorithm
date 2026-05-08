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
        
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dx = dots[i][0] - dots[j][0];
                int dy = dots[i][1] - dots[j][1];

                int dist = dx * dx + dy * dy;
                ans = Math.min(ans, dist);
            }
        }

        System.out.println(ans);
    }
}