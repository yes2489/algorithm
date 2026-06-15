import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;

        // 하나의 숫자 선택
        for (int i = 0; i < n; i++) {
            // 2배
            arr[i] *= 2;

            // 다른 하나 제거
            for (int j = 0; j < n; j++) {
                int diff = 0;

                // 제거되지 않고 남은 이전 원소의 인덱스
                int idx = -1;

                for (int k = 0; k < n; k++) {
                    if (k == j)
                        continue;

                    if (idx != -1) {
                        diff += Math.abs(arr[idx] - arr[k]);
                    }

                    idx = k;
                }
                ans = Math.min(ans, diff);
            }

            // 원상복구
            arr[i] /= 2;
        }
        System.out.println(ans);
    }
}