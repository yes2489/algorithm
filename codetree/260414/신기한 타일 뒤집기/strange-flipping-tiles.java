import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[200001];
        int idx = 100000;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            // 오른쪽 - 현재 위치 타일 포함 x칸의 타일 검은색으로 전환
            if (d == 'R') {
                for (int j = 0; j < x; j++) {
                    arr[idx + j] = 'B';
                }
                idx += x - 1;
            } else {
                for (int j = 0; j < x; j++) {
                    arr[idx - j] = 'W';
                }
                idx -= x - 1;
            }
        }

        int white = 0, black = 0;

        for (char c : arr) {
            if (c == 'W') {
                white++;
            } else if (c == 'B') {
                black++;
            }
        }

        System.out.println(white + " " + black);
    }
}