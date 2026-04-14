import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int white = 0;
        int black = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            // 오른쪽 - 현재 위치 타일 포함 x칸의 타일 검은색으로 전환
            if (d == 'R') {
                for (int j = 0; j < x; j++) {
                    black++;
                    if (white > 0) {
                        white--;
                    }
                }
            } else {
                for (int j = 0; j < x; j++) {
                    white++;
                    if (black > 0) {
                        black--;
                    }
                }
            }
        }

        System.out.println(white + " " + black);
    }
}