import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[10001];

        for (int i = 0; i < n; i++) {
            int idx = sc.nextInt();
            char input = sc.next().charAt(0);
            if (input == 'G')
                arr[idx] = 1;
            else
                arr[idx] = 2;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= 10000; i++) { // arr 위치 전부 돌기
            int sum = 0;
            for (int j = i; j <= i + k && j <= 10000; j++) {
                sum += arr[j];
            }

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}