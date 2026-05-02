import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt(); // x 좌표
            points[i][1] = sc.nextInt(); // y 좌표
        }

        // 모든 체크포인트를 순서대로 방문하는 거리
        int total = 0;
        for (int i = 0; i < n - 1; i++) {
            total += dist(points[i][0], points[i][1], points[i+1][0], points[i+1][1]);
        }

        int ans = Integer.MAX_VALUE;
        
        // 최소 거리 탐색
        for (int i = 1; i < n - 1; i++) {
            int removed = dist(points[i-1][0], points[i-1][1], points[i][0], points[i][1])
                    + dist(points[i][0], points[i][1], points[i+1][0], points[i+1][1]);

            int add = dist(points[i-1][0], points[i-1][1], points[i+1][0], points[i+1][1]);
            
            // 전체 거리에서 기존에 포함된 removed 제외, 새로 생긴 add 더해서 총 거리 계산
            int newDist = total - removed + add;

            ans = Math.min(ans, newDist);
        }

        System.out.println(ans);
    }

    static int dist(int ax, int ay, int bx, int by) {
        return Math.abs(ax - bx) + Math.abs(ay - by);
    }
}