import java.util.Scanner;

public class Main {

    static int N;
    static int count = 0;

    public static void dfs(int len) {

        // 길이가 정확히 N이면 아름다운 수 완성
        if (len == N) {
            count++;
            return;
        }

        // 숫자 1 ~ 4 선택
        for (int i = 1; i <= 4; i++) {

            // 길이 초과하면 불가능
            if (len + i > N) {
                continue;
            }

            dfs(len + i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        dfs(0);

        System.out.println(count);
    }
}