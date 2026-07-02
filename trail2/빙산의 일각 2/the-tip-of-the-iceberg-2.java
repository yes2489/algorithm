import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 빙산
        int[] h = new int[n]; // 높이

        int maxSeaLevel = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            maxSeaLevel = Math.max(maxSeaLevel, h[i]);
        }

        // 해수면의 높이를 바꿔가며 빙산 덩어리의 최대 개수 계산
        int ans = 0;
        
        for (int i = 0; i < maxSeaLevel; i++) {
            int groupCount = 0;
            boolean inIceberg = false;
            
            for (int height : h) {
                // 현재 빙산이 해수면 위에 있는 경우
                if (height > i) {
                    // 새로운 빙산 덩어리 시작
                    if (!inIceberg) {
                        groupCount++;
                        inIceberg = true;
                    }
                }
                else {
                    // 해수면 아래면 덩어리 종료
                    inIceberg = false;
                }
            }
            ans = Math.max(ans, groupCount);
        }
        System.out.println(ans);
    }
}
