import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[102];

        for (int i = 0; i < n; i++) {
            int cnt = sc.nextInt();
            int idx = sc.nextInt();
            arr[idx] += cnt;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= 100; i++) {
            int sum = 0;

            for (int j = i - k; j <= i + k; j++) {
                if (0 <= j && j <= 100)
                    sum += arr[j];
            }

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}