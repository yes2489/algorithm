import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), q = sc.nextInt();
        int[] arr = new int[n+1];

        // n개 원소 입력
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        // q개 질의
        for (int i = 0; i < q; i++) {
            int queryId = sc.nextInt();
            // 1번, 2번
            if (queryId == 1 || queryId ==2) {
                int val = sc.nextInt();
                if (queryId == 1) {
                    System.out.println(arr[val]);
                } else {
                    int idx = 0;
                    for (int j = 0; j <= n; j++) {
                        if (val == arr[j]) {
                            idx = j;
                            break;
                        }
                    }
                    System.out.println(idx);
                }
            }
            // 3번
            else {
                int start = sc.nextInt();
                int end = sc.nextInt();
                for (int j = start; j <= end; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }

        }
    }
}