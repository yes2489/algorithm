import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 각 방에 들어가야하는 인원 수
        for (int i = 0; i  < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minCnt = Integer.MAX_VALUE;
        for (int start = 0; start < n; start++) {
            int total = 0;

            // start부터 시계 반대 방향으로 이동하면서 거리 계산
            for (int dist = 0; dist < n; dist++) {
                int room = (start + dist) % n;

                total += arr[room] * dist;
            }
            minCnt = Math.min(minCnt, total);
        }
        System.out.println(minCnt);
    }
}