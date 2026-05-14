import java.util.Scanner;

public class Main {
    static int k, n;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        arr = new int[n];

        choose(0);
    }

    static void choose(int cnt) {
        // n개의 숫자를 전부 고른 경우
        if (cnt == n) {
            // 현재 만들어진 수열 출력
            for (int i : arr) {
                System.out.print(i + " ");
            }

            System.out.println();
            return;
        }

        // 현재 칸에 1 ~ k를 하나씩 넣어보기
        for (int i = 1; i <= k; i++) {
            arr[cnt] = i;

            choose(cnt + 1);
        }
    }
}
