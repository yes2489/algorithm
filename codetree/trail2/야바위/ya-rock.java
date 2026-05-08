import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 1; i <= 3; i++) {
            int stone = i;
            int sum = 0;

            for (int j = 0; j < n; j ++) {
                if (stone == a[j])
                    stone = b[j];
                else if (stone == b[j])
                    stone = a[j];

                // 교환 후 c[j]를 열었을 때 조약돌이 있으면 점수
                if (stone == c[j])
                    sum++;
            }
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}