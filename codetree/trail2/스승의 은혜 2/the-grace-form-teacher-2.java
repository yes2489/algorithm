import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int max = 0;

        // i번째 학생 선물 반값
        for (int i = 0; i < n; i++) {
            int cost[] = new int[n];

            for (int j = 0; j < n; j++) {
                cost[j] = price[j];

                if (i == j)
                    cost[j] /= 2;
            }

            // 제일 싼 선물부터 골라야 많이 살 수 있음
            Arrays.sort(cost);

            int total = 0;
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (total + cost[j] <= b) {
                    total += cost[j];
                    cnt++;
                } else {
                    break;
                }
            }

            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
}