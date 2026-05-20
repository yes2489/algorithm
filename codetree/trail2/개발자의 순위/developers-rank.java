import java.util.Scanner;

public class Main {
    static final int MAX_K = 10;
    static final int MAX_N = 20;

    static int k, n;
    static int[][] arr=  new int[MAX_K][MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        k = sc.nextInt();
        n = sc.nextInt();

        for (int i = 0; i < k; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        // 입력 끝

        int ans = 0;

        // 모든 쌍에 대해서 불변의 순위인 쌍 찾기
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                // a번 개발자가 b번 개발자보다 항상 높은 순위인지?

                if (a == b)
                    continue;

                // a 개발자가 b 개발자보다 항상 높은순위면 true;
                boolean correct = true;

                // k번의 모든 경기에 대해서 두 개발자의 위치를 찾고
                // 하나라도 a 개발자가 뒤에 있으면 false
                for (int x = 0; x < k; x++) {
                    int indexA = 0, indexB = 0;

                    for (int y = 0; y < n; y++) {
                        if (arr[x][y] == a)
                            indexA = y;
                        if (arr[x][y] == b)
                            indexB = y;
                    }

                    if (indexA > indexB)
                        correct = false;
                }

                if (correct)
                    ans++;
            }
        }
        System.out.println(ans);
    }
}
