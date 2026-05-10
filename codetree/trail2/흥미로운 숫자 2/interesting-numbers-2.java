import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int cnt = 0;
        for (int i = x; i <= y; i++) {
            if (isInteresting(i))
                cnt++;
        }

        System.out.println(cnt);
    }

    static boolean isInteresting(int num) {
        int[] count = new int[10];
        char[] arr = String.valueOf(num).toCharArray();

        for (char c : arr) {
            count[c - '0']++;
        }

        int oneCount = 0; // 정확히 1번 등장한 숫자의 개수
        int other = 0; // 나머지 자리 수를 모두 차지한 숫자의 개수

        for (int i = 0; i < 10; i++) {
            if (count[i] == 1) {
                oneCount++;
            } else if (count[i] == arr.length - 1) {
                other++;
            }
        }

        return oneCount == 1 && other == 1;
    }
}