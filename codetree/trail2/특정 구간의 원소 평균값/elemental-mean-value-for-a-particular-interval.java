import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                int len = j - i + 1; // 현재 구간 [i ~ j]의 길이
                if (sum % len != 0) // 평균이 정수가 아니면 continue
                    continue;

                int avg = sum / len;

                for (int k = i; k <= j; k++) {
                    if (arr[k] == avg){
                        ans++;
                        break;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}