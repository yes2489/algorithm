import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[101];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int input = sc.nextInt();
            b[input]++;
        }

        int ans = 0;

        for (int i = 0; i <= n - m; i++) {
            int[] arr = Arrays.copyOf(b, 101);
            boolean isSeq = true;

            for (int j = i; j < i + m; j++) {
                if (arr[a[j]] > 0) {
                    arr[a[j]]--;
                } else {
                    isSeq = false;
                    break;
                }
            }

            if (isSeq){
                ans++;
            }
        }

        System.out.println(ans);
    }
}