import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        final int INT_MAX = Integer.MAX_VALUE;

        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = INT_MAX;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;

            if (num < min) {
                min = num;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                cnt++;
            }
        }

        System.out.printf("%d %d", min, cnt);
    }
}