import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] student = new int[n + 1];
        int ans = -1;

        for (int i = 0; i < m; i++) {
            int idx = sc.nextInt();
            student[idx]++;
            if (student[idx] == k) {
                ans = idx;
                break;
            }
        }

        System.out.println(ans);
    }
}
